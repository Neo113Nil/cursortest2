package x1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements k {
    @Override // x1.k
    public final boolean a(SSLSocket sSLSocket) {
        boolean z2 = w1.h.d;
        return w1.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // x1.k
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}
