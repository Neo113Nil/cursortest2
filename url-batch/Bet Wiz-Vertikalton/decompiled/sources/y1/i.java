package y1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements k {
    @Override // y1.k
    public final boolean a(SSLSocket sSLSocket) {
        boolean z2 = x1.h.d;
        return x1.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // y1.k
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}
