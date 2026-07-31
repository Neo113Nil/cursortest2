package T0;

import V0.f;
import java.net.InetAddress;
import java.net.Socket;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class c extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    protected SSLContext f9307a;

    /* renamed from: b, reason: collision with root package name */
    protected SSLSocket f9308b = null;

    /* renamed from: c, reason: collision with root package name */
    protected String[] f9309c;

    /* renamed from: d, reason: collision with root package name */
    protected X509TrustManager f9310d;

    /* renamed from: e, reason: collision with root package name */
    protected String[] f9311e;

    /* renamed from: f, reason: collision with root package name */
    protected String[] f9312f;

    /* renamed from: g, reason: collision with root package name */
    protected String[] f9313g;

    public c(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        this.f9307a = null;
        this.f9307a = a.f();
        b(x509TrustManager);
        this.f9307a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }

    private void a(Socket socket) {
        boolean z4;
        boolean z5 = false;
        if (V0.c.a(this.f9313g)) {
            z4 = false;
        } else {
            f.e("SSLFNew", "set protocols");
            z4 = a.e((SSLSocket) socket, this.f9313g);
        }
        if (!V0.c.a(this.f9312f) || !V0.c.a(this.f9311e)) {
            f.e("SSLFNew", "set cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            a.d(sSLSocket);
            z5 = !V0.c.a(this.f9312f) ? a.h(sSLSocket, this.f9312f) : a.b(sSLSocket, this.f9311e);
        }
        if (!z4) {
            f.e("SSLFNew", "set default protocols");
            a.d((SSLSocket) socket);
        }
        if (z5) {
            return;
        }
        f.e("SSLFNew", "set default cipher");
        a.c((SSLSocket) socket);
    }

    public void b(X509TrustManager x509TrustManager) {
        this.f9310d = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4) {
        f.e("SSLFNew", "createSocket: host , port");
        Socket createSocket = this.f9307a.getSocketFactory().createSocket(str, i4);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f9308b = sSLSocket;
            this.f9309c = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f9309c;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i4) {
        return createSocket(inetAddress.getHostAddress(), i4);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4, InetAddress inetAddress, int i5) {
        return createSocket(str, i4);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i4, InetAddress inetAddress2, int i5) {
        return createSocket(inetAddress.getHostAddress(), i4);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i4, boolean z4) {
        f.e("SSLFNew", "createSocket");
        Socket createSocket = this.f9307a.getSocketFactory().createSocket(socket, str, i4, z4);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f9308b = sSLSocket;
            this.f9309c = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
