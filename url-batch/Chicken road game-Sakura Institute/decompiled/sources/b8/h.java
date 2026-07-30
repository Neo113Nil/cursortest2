package b8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1412a = new g();

    @Override // b8.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // b8.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // b8.n
    public final boolean c() {
        boolean z8 = a8.e.f548d;
        return a8.e.f548d;
    }

    @Override // b8.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        r6.k.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            a8.o oVar = a8.o.f570a;
            parameters.setApplicationProtocols((String[]) j4.i.h(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
