package c4;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i implements k {
    @Override // c4.k
    public final boolean a(SSLSocket sSLSocket) {
        return b4.h.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // c4.k
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}
