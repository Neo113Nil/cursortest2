package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class te implements dj {
    @Override // defpackage.dj
    public final boolean b(SSLSocket sSLSocket) {
        return se.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.dj
    public final fe0 c(SSLSocket sSLSocket) {
        return new ue();
    }
}
