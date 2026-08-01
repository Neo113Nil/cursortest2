package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ue implements fe0 {
    public static final te a = new te();

    @Override // defpackage.fe0
    public final String a(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.fe0
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.fe0
    public final boolean c() {
        boolean z = se.d;
        return se.d;
    }

    @Override // defpackage.fe0
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            q50 q50Var = q50.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) xy.c(list).toArray(new String[0]));
        }
    }
}
