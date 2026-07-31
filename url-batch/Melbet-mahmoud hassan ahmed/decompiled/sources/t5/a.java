package t5;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class a extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f22323a;

    public a() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.f22323a = sSLContext.getSocketFactory();
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return a(this.f22323a.createSocket());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i7) {
        return a(this.f22323a.createSocket(str, i7));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i7, InetAddress inetAddress, int i8) {
        return a(this.f22323a.createSocket(str, i7, inetAddress, i8));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i7) {
        return a(this.f22323a.createSocket(inetAddress, i7));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i8) {
        return a(this.f22323a.createSocket(inetAddress, i7, inetAddress2, i8));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i7, boolean z6) {
        return a(this.f22323a.createSocket(socket, str, i7, z6));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f22323a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f22323a.getSupportedCipherSuites();
    }
}
