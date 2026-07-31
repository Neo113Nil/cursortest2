package J2;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2627a = new g();

    @Override // J2.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // J2.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Z1.i.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // J2.n
    public final boolean c() {
        boolean z3 = I2.e.f2498d;
        return I2.e.f2498d;
    }

    @Override // J2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z1.i.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            I2.n nVar = I2.n.f2519a;
            parameters.setApplicationProtocols((String[]) F0.a.e(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
