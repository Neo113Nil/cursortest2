package org.apache.a.c.d;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: SSLSocketFactory.java */
/* loaded from: classes2.dex */
public class d implements org.apache.a.c.c.b, org.apache.a.c.c.d {
    public static final String SSL = "SSL";
    public static final String SSLV2 = "SSLv2";
    public static final String TLS = "TLS";
    private volatile h hostnameVerifier;
    private final org.apache.a.c.c.a nameResolver;
    private final SSLSocketFactory socketfactory;
    public static final h ALLOW_ALL_HOSTNAME_VERIFIER = new b();
    public static final h BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new c();
    public static final h STRICT_HOSTNAME_VERIFIER = new e();

    public static d getSocketFactory() {
        return new d();
    }

    private static SSLContext createSSLContext(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, g gVar) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, KeyManagementException {
        if (str == null) {
            str = TLS;
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, str2 != null ? str2.toCharArray() : null);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore2);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers != null && gVar != null) {
            for (int i = 0; i < trustManagers.length; i++) {
                TrustManager trustManager = trustManagers[i];
                if (trustManager instanceof X509TrustManager) {
                    trustManagers[i] = new f((X509TrustManager) trustManager, gVar);
                }
            }
        }
        SSLContext sSLContext = SSLContext.getInstance(str);
        sSLContext.init(keyManagers, trustManagers, secureRandom);
        return sSLContext;
    }

    private static SSLContext createDefaultSSLContext() {
        try {
            return createSSLContext(TLS, null, null, null, null, null);
        } catch (Exception e) {
            throw new IllegalStateException("Failure initializing default SSL context", e);
        }
    }

    @Deprecated
    public d(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, org.apache.a.c.c.a aVar) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this(createSSLContext(str, keyStore, str2, keyStore2, secureRandom, null), aVar);
    }

    public d(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, h hVar) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this(createSSLContext(str, keyStore, str2, keyStore2, secureRandom, null), hVar);
    }

    public d(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, g gVar, h hVar) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this(createSSLContext(str, keyStore, str2, keyStore2, secureRandom, gVar), hVar);
    }

    public d(KeyStore keyStore, String str, KeyStore keyStore2) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this(TLS, keyStore, str, keyStore2, null, null, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public d(KeyStore keyStore, String str) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this(TLS, keyStore, str, null, null, null, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public d(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this(TLS, null, null, keyStore, null, null, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public d(g gVar, h hVar) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this(TLS, null, null, null, null, gVar, hVar);
    }

    public d(g gVar) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this(TLS, null, null, null, null, gVar, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public d(SSLContext sSLContext) {
        this(sSLContext, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    @Deprecated
    public d(SSLContext sSLContext, org.apache.a.c.c.a aVar) {
        this.socketfactory = sSLContext.getSocketFactory();
        this.hostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        this.nameResolver = aVar;
    }

    public d(SSLContext sSLContext, h hVar) {
        this.socketfactory = sSLContext.getSocketFactory();
        this.hostnameVerifier = hVar;
        this.nameResolver = null;
    }

    private d() {
        this(createDefaultSSLContext());
    }

    @Override // org.apache.a.c.c.h
    public Socket createSocket(org.apache.a.i.d dVar) throws IOException {
        return this.socketfactory.createSocket();
    }

    @Deprecated
    public Socket createSocket() throws IOException {
        return this.socketfactory.createSocket();
    }

    @Override // org.apache.a.c.c.h
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, org.apache.a.i.d dVar) throws IOException, UnknownHostException, org.apache.a.c.f {
        SSLSocket sSLSocket;
        if (inetSocketAddress == null) {
            throw new IllegalArgumentException("Remote address may not be null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        if (socket == null) {
            socket = new Socket();
        }
        if (inetSocketAddress2 != null) {
            socket.setReuseAddress(org.apache.a.i.c.b(dVar));
            socket.bind(inetSocketAddress2);
        }
        int f = org.apache.a.i.c.f(dVar);
        try {
            socket.setSoTimeout(org.apache.a.i.c.a(dVar));
            socket.connect(inetSocketAddress, f);
            String inetSocketAddress3 = inetSocketAddress.toString();
            int port = inetSocketAddress.getPort();
            String str = ":" + port;
            if (inetSocketAddress3.endsWith(str)) {
                inetSocketAddress3 = inetSocketAddress3.substring(0, inetSocketAddress3.length() - str.length());
            }
            if (socket instanceof SSLSocket) {
                sSLSocket = (SSLSocket) socket;
            } else {
                sSLSocket = (SSLSocket) this.socketfactory.createSocket(socket, inetSocketAddress3, port, true);
            }
            if (this.hostnameVerifier != null) {
                try {
                    this.hostnameVerifier.a(inetSocketAddress3, sSLSocket);
                } catch (IOException e) {
                    try {
                        sSLSocket.close();
                    } catch (Exception unused) {
                    }
                    throw e;
                }
            }
            return sSLSocket;
        } catch (SocketTimeoutException unused2) {
            throw new org.apache.a.c.f("Connect to " + inetSocketAddress + " timed out");
        }
    }

    @Override // org.apache.a.c.c.h, org.apache.a.c.c.j
    public boolean isSecure(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("Socket not created by this factory");
        }
        if (socket.isClosed()) {
            throw new IllegalArgumentException("Socket is closed");
        }
        return true;
    }

    @Override // org.apache.a.c.c.b
    public Socket createLayeredSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        SSLSocket sSLSocket = (SSLSocket) this.socketfactory.createSocket(socket, str, i, z);
        if (this.hostnameVerifier != null) {
            this.hostnameVerifier.a(str, sSLSocket);
        }
        return sSLSocket;
    }

    @Deprecated
    public void setHostnameVerifier(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("Hostname verifier may not be null");
        }
        this.hostnameVerifier = hVar;
    }

    public h getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Override // org.apache.a.c.c.j
    @Deprecated
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, org.apache.a.i.d dVar) throws IOException, UnknownHostException, org.apache.a.c.f {
        InetSocketAddress inetSocketAddress;
        InetAddress byName;
        if (inetAddress != null || i2 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        } else {
            inetSocketAddress = null;
        }
        if (this.nameResolver != null) {
            byName = this.nameResolver.a(str);
        } else {
            byName = InetAddress.getByName(str);
        }
        return connectSocket(socket, new InetSocketAddress(byName, i), inetSocketAddress, dVar);
    }

    @Deprecated
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        return createLayeredSocket(socket, str, i, z);
    }
}
