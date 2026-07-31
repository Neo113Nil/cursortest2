package P2;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // P2.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean z3 = O2.h.f3894d;
        return O2.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // P2.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
