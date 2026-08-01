package x1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f4244a = new g();

    @Override // x1.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // x1.m
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : d1.d.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // x1.m
    public final boolean c() {
        boolean z2 = w1.e.d;
        return w1.e.d;
    }

    @Override // x1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        d1.d.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            w1.n nVar = w1.n.f4190a;
            parameters.setApplicationProtocols((String[]) J0.e.c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
