package l3;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i implements k {
    @Override // l3.k
    public final boolean a(SSLSocket sSLSocket) {
        return k3.h.f2831d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // l3.k
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}
