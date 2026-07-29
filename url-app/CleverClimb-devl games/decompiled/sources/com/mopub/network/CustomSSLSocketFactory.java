package com.mopub.network;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Reflection;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public class CustomSSLSocketFactory extends SSLSocketFactory {
    private SSLSocketFactory mCertificateSocketFactory;

    private CustomSSLSocketFactory() {
    }

    public static CustomSSLSocketFactory getDefault(int i) {
        CustomSSLSocketFactory customSSLSocketFactory = new CustomSSLSocketFactory();
        customSSLSocketFactory.mCertificateSocketFactory = SSLCertificateSocketFactory.getDefault(i, null);
        return customSSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        if (this.mCertificateSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        Socket createSocket = this.mCertificateSocketFactory.createSocket();
        enableTlsIfAvailable(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        if (this.mCertificateSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        Socket createSocket = this.mCertificateSocketFactory.createSocket(str, i);
        enableTlsIfAvailable(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        if (this.mCertificateSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        Socket createSocket = this.mCertificateSocketFactory.createSocket(str, i, inetAddress, i2);
        enableTlsIfAvailable(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        if (this.mCertificateSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        Socket createSocket = this.mCertificateSocketFactory.createSocket(inetAddress, i);
        enableTlsIfAvailable(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        if (this.mCertificateSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        Socket createSocket = this.mCertificateSocketFactory.createSocket(inetAddress, i, inetAddress2, i2);
        enableTlsIfAvailable(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        if (this.mCertificateSocketFactory == null) {
            return new String[0];
        }
        return this.mCertificateSocketFactory.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        if (this.mCertificateSocketFactory == null) {
            return new String[0];
        }
        return this.mCertificateSocketFactory.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        if (this.mCertificateSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (z && socket != null) {
                socket.close();
            }
            Socket createSocket = this.mCertificateSocketFactory.createSocket(InetAddressUtils.getInetAddressByName(str), i);
            enableTlsIfAvailable(createSocket);
            doManualServerNameIdentification(createSocket, str);
            return createSocket;
        }
        Socket createSocket2 = this.mCertificateSocketFactory.createSocket(socket, str, i, z);
        enableTlsIfAvailable(createSocket2);
        return createSocket2;
    }

    private void doManualServerNameIdentification(Socket socket, String str) throws IOException {
        Preconditions.checkNotNull(socket);
        if (this.mCertificateSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            setHostnameOnSocket((SSLCertificateSocketFactory) this.mCertificateSocketFactory, sSLSocket, str);
            verifyServerName(sSLSocket, str);
        }
    }

    @VisibleForTesting
    static void setHostnameOnSocket(SSLCertificateSocketFactory sSLCertificateSocketFactory, SSLSocket sSLSocket, String str) {
        Preconditions.checkNotNull(sSLCertificateSocketFactory);
        Preconditions.checkNotNull(sSLSocket);
        if (Build.VERSION.SDK_INT >= 17) {
            sSLCertificateSocketFactory.setHostname(sSLSocket, str);
            return;
        }
        try {
            new Reflection.MethodBuilder(sSLSocket, "setHostname").addParam((Class<Class>) String.class, (Class) str).execute();
        } catch (Exception unused) {
            MoPubLog.d("Unable to call setHostname() on the socket");
        }
    }

    @VisibleForTesting
    static void verifyServerName(SSLSocket sSLSocket, String str) throws IOException {
        Preconditions.checkNotNull(sSLSocket);
        sSLSocket.startHandshake();
        if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSocket.getSession())) {
            throw new SSLHandshakeException("Server Name Identification failed.");
        }
    }

    private void enableTlsIfAvailable(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        }
    }

    @VisibleForTesting
    @Deprecated
    void setCertificateSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.mCertificateSocketFactory = sSLSocketFactory;
    }
}
