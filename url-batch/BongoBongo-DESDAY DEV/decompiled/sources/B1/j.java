package B1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // B1.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean z2 = A1.h.d;
        return A1.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // B1.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
