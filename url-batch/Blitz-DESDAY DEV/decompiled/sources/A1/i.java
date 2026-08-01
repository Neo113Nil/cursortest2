package A1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class i implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final h f77a = new h();

    @Override // A1.o
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // A1.o
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : g1.d.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // A1.o
    public final boolean c() {
        boolean z2 = z1.e.d;
        return z1.e.d;
    }

    @Override // A1.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        g1.d.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            z1.o oVar = z1.o.f4365a;
            parameters.setApplicationProtocols((String[]) z1.n.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
