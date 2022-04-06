package br.com.restapi;

public class Greeting {

	//Inicializaçõa das variáveis
	private final long id;
	private final String contente;

	//Construtor
	public Greeting(long id, String contente) {
		this.id = id;
		this.contente = contente;
	}

	//Getters
	public long getId() {
		return id;
	}

	public String getContente() {
		return contente;
	}

}
