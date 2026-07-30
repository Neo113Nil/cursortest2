package b8;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements l {
    @Override // b8.l
    public final boolean a(SSLSocket sSLSocket) {
        return a8.h.f551d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // b8.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
