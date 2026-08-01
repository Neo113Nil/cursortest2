package B1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final g f54a = new g();

    @Override // B1.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // B1.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : h1.d.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // B1.n
    public final boolean c() {
        boolean z2 = A1.e.d;
        return A1.e.d;
    }

    @Override // B1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h1.d.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            A1.o oVar = A1.o.f39a;
            parameters.setApplicationProtocols((String[]) K0.e.c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
