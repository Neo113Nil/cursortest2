package T0;

import V0.f;
import android.content.Context;
import java.net.InetAddress;
import java.net.Socket;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* loaded from: classes.dex */
public class b extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    public static final X509HostnameVerifier f9295i = new BrowserCompatHostnameVerifier();

    /* renamed from: j, reason: collision with root package name */
    public static final X509HostnameVerifier f9296j = new StrictHostnameVerifier();

    /* renamed from: k, reason: collision with root package name */
    private static final String f9297k = b.class.getSimpleName();

    /* renamed from: l, reason: collision with root package name */
    private static volatile b f9298l = null;

    /* renamed from: a, reason: collision with root package name */
    private SSLContext f9299a = null;

    /* renamed from: b, reason: collision with root package name */
    private SSLSocket f9300b = null;

    /* renamed from: c, reason: collision with root package name */
    private Context f9301c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f9302d;

    /* renamed from: e, reason: collision with root package name */
    private X509TrustManager f9303e;

    /* renamed from: f, reason: collision with root package name */
    private String[] f9304f;

    /* renamed from: g, reason: collision with root package name */
    private String[] f9305g;

    /* renamed from: h, reason: collision with root package name */
    private String[] f9306h;

    private b(Context context, SecureRandom secureRandom) {
        c(context);
        d(a.f());
        e a4 = d.a(context);
        this.f9303e = a4;
        this.f9299a.init(null, new X509TrustManager[]{a4}, secureRandom);
    }

    private void a(Socket socket) {
        boolean z4;
        boolean z5 = false;
        if (V0.c.a(this.f9306h)) {
            z4 = false;
        } else {
            f.e(f9297k, "set protocols");
            a.e((SSLSocket) socket, this.f9306h);
            z4 = true;
        }
        if (!V0.c.a(this.f9305g) || !V0.c.a(this.f9304f)) {
            f.e(f9297k, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            a.d(sSLSocket);
            z5 = !V0.c.a(this.f9305g) ? a.h(sSLSocket, this.f9305g) : a.b(sSLSocket, this.f9304f);
        }
        if (!z4) {
            f.e(f9297k, "set default protocols");
            a.d((SSLSocket) socket);
        }
        if (z5) {
            return;
        }
        f.e(f9297k, "set default cipher suites");
        a.c((SSLSocket) socket);
    }

    public static b b(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        V0.b.b(context);
        if (f9298l == null) {
            synchronized (b.class) {
                try {
                    if (f9298l == null) {
                        f9298l = new b(context, null);
                    }
                } finally {
                }
            }
        }
        if (f9298l.f9301c == null && context != null) {
            f9298l.c(context);
        }
        f.b(f9297k, "getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return f9298l;
    }

    public void c(Context context) {
        this.f9301c = context.getApplicationContext();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4) {
        f.e(f9297k, "createSocket: host , port");
        Socket createSocket = this.f9299a.getSocketFactory().createSocket(str, i4);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f9300b = sSLSocket;
            this.f9302d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public void d(SSLContext sSLContext) {
        this.f9299a = sSLContext;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f9302d;
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
        f.e(f9297k, "createSocket s host port autoClose");
        Socket createSocket = this.f9299a.getSocketFactory().createSocket(socket, str, i4, z4);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f9300b = sSLSocket;
            this.f9302d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
