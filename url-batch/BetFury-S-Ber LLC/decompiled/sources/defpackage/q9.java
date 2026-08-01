package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class q9 implements fe0 {
    public static final p9 a = new p9();

    @Override // defpackage.fe0
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.fe0
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.fe0
    public final boolean c() {
        boolean z = o9.d;
        return o9.d;
    }

    @Override // defpackage.fe0
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            q50 q50Var = q50.a;
            parameters.setApplicationProtocols((String[]) xy.c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
