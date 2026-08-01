package t1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f3883a = new g();

    @Override // t1.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // t1.m
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Z0.d.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // t1.m
    public final boolean c() {
        boolean z2 = s1.e.d;
        return s1.e.d;
    }

    @Override // t1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z0.d.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            s1.n nVar = s1.n.f3825a;
            parameters.setApplicationProtocols((String[]) I0.e.c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
