package com.squareup.common.truststore;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class SquareSSLSocketFactory extends SSLSocketFactory {
    public final SSLSocketFactory wrapped;

    public SquareSSLSocketFactory(TrustManager[] trustManagerArr) {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerArr, null);
        this.wrapped = sSLContext.getSocketFactory();
    }

    public static SSLSocket enableTLS(Socket socket) {
        SSLSocket sSLSocket = (SSLSocket) socket;
        String[] strArr = {"TLSv1.1", "TLSv1.2"};
        String[] supportedProtocols = sSLSocket.getSupportedProtocols();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            int length = supportedProtocols.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (str.equals(supportedProtocols[i2])) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        if (strArr2.length != 0) {
            sSLSocket.setEnabledProtocols(strArr2);
            return sSLSocket;
        }
        a$$ExternalSyntheticBUOutline0.m$1("This device doesn't offer the protocols we require.");
        return null;
    }

    public static TrustManager[] readTruststore(Context context) {
        KeyStore keyStore = KeyStore.getInstance("BKS");
        InputStream inputStream = null;
        try {
            InputStream openRawResource = context.getResources().openRawResource(R.raw.truststore);
            try {
                keyStore.load(openRawResource, new char[]{'e', 'z', '2', '4', 'g', 'e', 't'});
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                    return trustManagers;
                }
                a$$ExternalSyntheticBUOutline0.m$1((Object) "Malformed truststore.");
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = openRawResource;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return enableTLS(this.wrapped.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.wrapped.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.wrapped.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return enableTLS(this.wrapped.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return enableTLS(this.wrapped.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return enableTLS(this.wrapped.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return enableTLS(this.wrapped.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return enableTLS(this.wrapped.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
