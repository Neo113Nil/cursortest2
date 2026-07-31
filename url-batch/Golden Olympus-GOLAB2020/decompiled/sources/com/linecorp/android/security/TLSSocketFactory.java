package com.linecorp.android.security;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public class TLSSocketFactory extends SSLSocketFactory {
    private static final String TAG = "TLSSocketFactory";
    private static final int TLS12_ENABLED_API_LEVEL = 16;
    private static final String[] UNSAFE_CIPHERS = {"RC4", "DES", "PSK", "_DHE_"};

    @NonNull
    private Class<?> openSslSocketClass;
    private boolean removeUnsafeCiphers;
    private Method setHostnameMethod;

    @NonNull
    private final SSLSocketFactory sslSocketFactory;

    private static class DelegateSSLSocket extends SSLSocket implements AutoCloseable {
        protected final SSLSocket delegate;

        DelegateSSLSocket(SSLSocket sSLSocket) {
            this.delegate = sSLSocket;
        }

        @Override // javax.net.ssl.SSLSocket
        public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.delegate.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void bind(SocketAddress socketAddress) {
            this.delegate.bind(socketAddress);
        }

        @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.delegate.close();
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress) {
            this.delegate.connect(socketAddress);
        }

        public boolean equals(Object obj) {
            return this.delegate.equals(obj);
        }

        @Override // java.net.Socket
        public SocketChannel getChannel() {
            return this.delegate.getChannel();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getEnableSessionCreation() {
            return this.delegate.getEnableSessionCreation();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledCipherSuites() {
            return this.delegate.getEnabledCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledProtocols() {
            return this.delegate.getEnabledProtocols();
        }

        @Override // java.net.Socket
        public InetAddress getInetAddress() {
            return this.delegate.getInetAddress();
        }

        @Override // java.net.Socket
        public InputStream getInputStream() {
            return this.delegate.getInputStream();
        }

        @Override // java.net.Socket
        public boolean getKeepAlive() {
            return this.delegate.getKeepAlive();
        }

        @Override // java.net.Socket
        public InetAddress getLocalAddress() {
            return this.delegate.getLocalAddress();
        }

        @Override // java.net.Socket
        public int getLocalPort() {
            return this.delegate.getLocalPort();
        }

        @Override // java.net.Socket
        public SocketAddress getLocalSocketAddress() {
            return this.delegate.getLocalSocketAddress();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getNeedClientAuth() {
            return this.delegate.getNeedClientAuth();
        }

        @Override // java.net.Socket
        public boolean getOOBInline() {
            return this.delegate.getOOBInline();
        }

        @Override // java.net.Socket
        public OutputStream getOutputStream() {
            return this.delegate.getOutputStream();
        }

        @Override // java.net.Socket
        public int getPort() {
            return this.delegate.getPort();
        }

        @Override // java.net.Socket
        public synchronized int getReceiveBufferSize() {
            return this.delegate.getReceiveBufferSize();
        }

        @Override // java.net.Socket
        public SocketAddress getRemoteSocketAddress() {
            return this.delegate.getRemoteSocketAddress();
        }

        @Override // java.net.Socket
        public boolean getReuseAddress() {
            return this.delegate.getReuseAddress();
        }

        @Override // java.net.Socket
        public synchronized int getSendBufferSize() {
            return this.delegate.getSendBufferSize();
        }

        @Override // javax.net.ssl.SSLSocket
        public SSLSession getSession() {
            return this.delegate.getSession();
        }

        @Override // java.net.Socket
        public int getSoLinger() {
            return this.delegate.getSoLinger();
        }

        @Override // java.net.Socket
        public synchronized int getSoTimeout() {
            return this.delegate.getSoTimeout();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedCipherSuites() {
            return this.delegate.getSupportedCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedProtocols() {
            return this.delegate.getSupportedProtocols();
        }

        @Override // java.net.Socket
        public boolean getTcpNoDelay() {
            return this.delegate.getTcpNoDelay();
        }

        @Override // java.net.Socket
        public int getTrafficClass() {
            return this.delegate.getTrafficClass();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getUseClientMode() {
            return this.delegate.getUseClientMode();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getWantClientAuth() {
            return this.delegate.getWantClientAuth();
        }

        @Override // java.net.Socket
        public boolean isBound() {
            return this.delegate.isBound();
        }

        @Override // java.net.Socket
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // java.net.Socket
        public boolean isConnected() {
            return this.delegate.isConnected();
        }

        @Override // java.net.Socket
        public boolean isInputShutdown() {
            return this.delegate.isInputShutdown();
        }

        @Override // java.net.Socket
        public boolean isOutputShutdown() {
            return this.delegate.isOutputShutdown();
        }

        @Override // javax.net.ssl.SSLSocket
        public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.delegate.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void sendUrgentData(int i4) {
            this.delegate.sendUrgentData(i4);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnableSessionCreation(boolean z4) {
            this.delegate.setEnableSessionCreation(z4);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnabledCipherSuites(String[] strArr) {
            this.delegate.setEnabledCipherSuites(strArr);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnabledProtocols(String[] strArr) {
            this.delegate.setEnabledProtocols(strArr);
        }

        @Override // java.net.Socket
        public void setKeepAlive(boolean z4) {
            this.delegate.setKeepAlive(z4);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setNeedClientAuth(boolean z4) {
            this.delegate.setNeedClientAuth(z4);
        }

        @Override // java.net.Socket
        public void setOOBInline(boolean z4) {
            this.delegate.setOOBInline(z4);
        }

        @Override // java.net.Socket
        public void setPerformancePreferences(int i4, int i5, int i6) {
            this.delegate.setPerformancePreferences(i4, i5, i6);
        }

        @Override // java.net.Socket
        public synchronized void setReceiveBufferSize(int i4) {
            this.delegate.setReceiveBufferSize(i4);
        }

        @Override // java.net.Socket
        public void setReuseAddress(boolean z4) {
            this.delegate.setReuseAddress(z4);
        }

        @Override // java.net.Socket
        public synchronized void setSendBufferSize(int i4) {
            this.delegate.setSendBufferSize(i4);
        }

        @Override // java.net.Socket
        public void setSoLinger(boolean z4, int i4) {
            this.delegate.setSoLinger(z4, i4);
        }

        @Override // java.net.Socket
        public synchronized void setSoTimeout(int i4) {
            this.delegate.setSoTimeout(i4);
        }

        @Override // java.net.Socket
        public void setTcpNoDelay(boolean z4) {
            this.delegate.setTcpNoDelay(z4);
        }

        @Override // java.net.Socket
        public void setTrafficClass(int i4) {
            this.delegate.setTrafficClass(i4);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setUseClientMode(boolean z4) {
            this.delegate.setUseClientMode(z4);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setWantClientAuth(boolean z4) {
            this.delegate.setWantClientAuth(z4);
        }

        @Override // java.net.Socket
        public void shutdownInput() {
            this.delegate.shutdownInput();
        }

        @Override // java.net.Socket
        public void shutdownOutput() {
            this.delegate.shutdownOutput();
        }

        @Override // javax.net.ssl.SSLSocket
        public void startHandshake() {
            this.delegate.startHandshake();
        }

        @Override // javax.net.ssl.SSLSocket, java.net.Socket
        public String toString() {
            return this.delegate.toString();
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress, int i4) {
            this.delegate.connect(socketAddress, i4);
        }
    }

    private static class LoggingHandshakeCompletedListener implements HandshakeCompletedListener {
        private LoggingHandshakeCompletedListener() {
        }

        @Override // javax.net.ssl.HandshakeCompletedListener
        public void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
            String str;
            SSLSession session = handshakeCompletedEvent.getSession();
            String protocol = session.getProtocol();
            String cipherSuite = session.getCipherSuite();
            Log.d(TLSSocketFactory.TAG, "Handshake completed", new Throwable("This is not Error."));
            Log.d(TLSSocketFactory.TAG, String.format("Connected with: %s/%s", protocol, cipherSuite));
            try {
                str = session.getPeerPrincipal().getName();
            } catch (SSLPeerUnverifiedException e4) {
                e4.printStackTrace();
                str = null;
            }
            Log.d(TLSSocketFactory.TAG, String.format("Peer name: %s\n", str));
        }
    }

    private static class NoSSLv3SSLSocket extends DelegateSSLSocket {
        @Override // com.linecorp.android.security.TLSSocketFactory.DelegateSSLSocket, javax.net.ssl.SSLSocket
        public void setEnabledProtocols(String[] strArr) {
            if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.delegate.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove("SSLv3");
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            super.setEnabledProtocols(strArr);
        }

        private NoSSLv3SSLSocket(SSLSocket sSLSocket) {
            super(sSLSocket);
        }
    }

    public TLSSocketFactory(@NonNull SSLSocketFactory sSLSocketFactory) {
        this(sSLSocketFactory, true);
    }

    private static String[] getProtocols() {
        return new String[]{"TLSv1.2"};
    }

    private void initSNI() {
        try {
            try {
                this.openSslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                this.openSslSocketClass = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            this.setHostnameMethod = this.openSslSocketClass.getMethod("setHostname", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
    }

    private static String[] removeUnsafeCiphers(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        for (String str : strArr) {
            for (String str2 : UNSAFE_CIPHERS) {
                if (str.contains(str2)) {
                    arrayList.remove(str);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private void setHostname(Socket socket, String str) {
        Method method;
        if (!this.openSslSocketClass.isInstance(socket) || (method = this.setHostnameMethod) == null) {
            return;
        }
        try {
            method.invoke(socket, str);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i4, boolean z4) {
        Socket createSocket = this.sslSocketFactory.createSocket(socket, str, i4, z4);
        setHostname(createSocket, str);
        return wrapSocket(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.removeUnsafeCiphers ? removeUnsafeCiphers(this.sslSocketFactory.getDefaultCipherSuites()) : this.sslSocketFactory.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.removeUnsafeCiphers ? removeUnsafeCiphers(this.sslSocketFactory.getSupportedCipherSuites()) : this.sslSocketFactory.getSupportedCipherSuites();
    }

    public Socket wrapSocket(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        sSLSocket.setEnabledProtocols(getProtocols());
        if (this.removeUnsafeCiphers) {
            sSLSocket.setEnabledCipherSuites(removeUnsafeCiphers(sSLSocket.getEnabledCipherSuites()));
        }
        return new NoSSLv3SSLSocket(sSLSocket);
    }

    public TLSSocketFactory(@NonNull SSLSocketFactory sSLSocketFactory, boolean z4) {
        this.sslSocketFactory = sSLSocketFactory;
        this.removeUnsafeCiphers = z4;
        initSNI();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4) {
        Socket createSocket = this.sslSocketFactory.createSocket(str, i4);
        setHostname(createSocket, str);
        return wrapSocket(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i4) {
        return wrapSocket(this.sslSocketFactory.createSocket(inetAddress, i4));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i4, InetAddress inetAddress2, int i5) {
        return wrapSocket(this.sslSocketFactory.createSocket(inetAddress, i4, inetAddress2, i5));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4, InetAddress inetAddress, int i5) {
        Socket createSocket = this.sslSocketFactory.createSocket(str, i4, inetAddress, i5);
        setHostname(createSocket, str);
        return wrapSocket(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return wrapSocket(this.sslSocketFactory.createSocket());
    }
}
