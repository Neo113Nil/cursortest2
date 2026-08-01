package v1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f4121a = new g();

    @Override // v1.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // v1.m
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : b1.d.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // v1.m
    public final boolean c() {
        boolean z2 = u1.e.d;
        return u1.e.d;
    }

    @Override // v1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        b1.d.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            u1.n nVar = u1.n.f3904a;
            parameters.setApplicationProtocols((String[]) I0.e.c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
