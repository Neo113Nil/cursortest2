package v1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements k {
    @Override // v1.k
    public final boolean a(SSLSocket sSLSocket) {
        boolean z2 = u1.h.d;
        return u1.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // v1.k
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}
