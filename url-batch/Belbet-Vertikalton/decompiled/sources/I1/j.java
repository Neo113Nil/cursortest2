package I1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // I1.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean z2 = H1.h.f554d;
        return H1.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // I1.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
