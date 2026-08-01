package c4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f893a = new g();

    @Override // c4.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // c4.m
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // c4.m
    public final boolean c() {
        boolean z4 = b4.e.d;
        return b4.e.d;
    }

    @Override // c4.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i3.d.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            b4.n nVar = b4.n.f853a;
            parameters.setApplicationProtocols((String[]) o2.f.d(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
