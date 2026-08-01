package t1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements k {
    @Override // t1.k
    public final boolean a(SSLSocket sSLSocket) {
        boolean z2 = s1.h.d;
        return s1.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // t1.k
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}
