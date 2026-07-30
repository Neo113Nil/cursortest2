package com.yanzhenjie.kalle.ssl;

import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes4.dex */
public class b extends SSLSocketFactory {
    private static final X509TrustManager DEFAULT_TRUST_MANAGERS;
    private static final String[] PROTOCOL_ARRAY;
    private SSLSocketFactory delegate;

    static class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            PROTOCOL_ARRAY = new String[]{"TLSv1", "TLSv1.1", "TLSv1.2"};
        } else {
            PROTOCOL_ARRAY = new String[]{"SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2"};
        }
        DEFAULT_TRUST_MANAGERS = new a();
    }

    public b() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{DEFAULT_TRUST_MANAGERS}, new SecureRandom());
            this.delegate = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private static void setSupportProtocolAndCipherSuites(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(PROTOCOL_ARRAY);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i8, boolean z7) {
        Socket createSocket = this.delegate.createSocket(socket, str, i8, z7);
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i8) {
        Socket createSocket = this.delegate.createSocket(str, i8);
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i8, InetAddress inetAddress, int i9) {
        Socket createSocket = this.delegate.createSocket(str, i8, inetAddress, i9);
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }

    public b(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i8) {
        Socket createSocket = this.delegate.createSocket(inetAddress, i8);
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i8, InetAddress inetAddress2, int i9) {
        Socket createSocket = this.delegate.createSocket(inetAddress, i8, inetAddress2, i9);
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        Socket createSocket = this.delegate.createSocket();
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }
}
