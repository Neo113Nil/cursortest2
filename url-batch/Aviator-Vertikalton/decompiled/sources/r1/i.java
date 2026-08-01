package r1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements k {
    @Override // r1.k
    public final boolean a(SSLSocket sSLSocket) {
        boolean z2 = q1.h.f3941d;
        return q1.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // r1.k
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}
