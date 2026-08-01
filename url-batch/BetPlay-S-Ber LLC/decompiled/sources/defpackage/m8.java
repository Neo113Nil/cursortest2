package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class m8 implements l30 {
    public static final l8 a = new l8();

    @Override // defpackage.l30
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.l30
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.l30
    public final boolean c() {
        boolean z = k8.d;
        return k8.d;
    }

    @Override // defpackage.l30
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            jx jxVar = jx.a;
            parameters.setApplicationProtocols((String[]) ix.e(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
