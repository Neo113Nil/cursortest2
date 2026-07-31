package J2;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // J2.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean z3 = I2.h.f2501d;
        return I2.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // J2.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
