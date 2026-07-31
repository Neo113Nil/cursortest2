package P2;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final g f3935a = new g();

    @Override // P2.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // P2.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : f2.j.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // P2.n
    public final boolean c() {
        boolean z3 = O2.e.f3891d;
        return O2.e.f3891d;
    }

    @Override // P2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        f2.j.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            O2.n nVar = O2.n.f3910a;
            parameters.setApplicationProtocols((String[]) A1.i.e(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
