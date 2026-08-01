package l3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import k3.o;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2893a = new g();

    @Override // l3.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // l3.m
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // l3.m
    public final boolean c() {
        boolean z3 = k3.e.f2829d;
        return k3.e.f2829d;
    }

    @Override // l3.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        u2.c.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            o oVar = o.f2841a;
            parameters.setApplicationProtocols((String[]) g2.f.g(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
