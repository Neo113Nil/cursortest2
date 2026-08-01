package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class mc implements af {
    @Override // defpackage.af
    public final boolean b(SSLSocket sSLSocket) {
        return lc.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.af
    public final l30 d(SSLSocket sSLSocket) {
        return new nc();
    }
}
