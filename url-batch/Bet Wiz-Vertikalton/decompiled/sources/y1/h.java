package y1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f4302a = new g();

    @Override // y1.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // y1.m
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : e1.d.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // y1.m
    public final boolean c() {
        boolean z2 = x1.e.d;
        return x1.e.d;
    }

    @Override // y1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        e1.d.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            x1.n nVar = x1.n.f4286a;
            parameters.setApplicationProtocols((String[]) I0.e.c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
