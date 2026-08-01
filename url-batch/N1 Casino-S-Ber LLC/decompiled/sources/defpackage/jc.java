package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class jc implements a30 {
    public static final ic a = new ic();

    @Override // defpackage.a30
    public final String a(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.a30
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.a30
    public final boolean c() {
        boolean z = hc.d;
        return hc.d;
    }

    @Override // defpackage.a30
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ww wwVar = ww.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) vw.d(list).toArray(new String[0]));
        }
    }
}
