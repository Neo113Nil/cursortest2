package r1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f3563a = new g();

    @Override // r1.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // r1.m
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : X0.e.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // r1.m
    public final boolean c() {
        boolean z2 = q1.e.d;
        return q1.e.d;
    }

    @Override // r1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X0.e.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            q1.n nVar = q1.n.f3549a;
            parameters.setApplicationProtocols((String[]) H0.e.d(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
