package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class r8 implements a30 {
    public static final q8 a = new q8();

    @Override // defpackage.a30
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.a30
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.a30
    public final boolean c() {
        boolean z = p8.d;
        return p8.d;
    }

    @Override // defpackage.a30
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            ww wwVar = ww.a;
            parameters.setApplicationProtocols((String[]) vw.d(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
