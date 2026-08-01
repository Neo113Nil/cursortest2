package I1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final g f555a = new g();

    @Override // I1.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // I1.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : k1.e.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // I1.n
    public final boolean c() {
        boolean z2 = H1.e.d;
        return H1.e.d;
    }

    @Override // I1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        k1.e.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            H1.n nVar = H1.n.f525a;
            parameters.setApplicationProtocols((String[]) R0.e.d(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
