package P3;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // P3.l
    public final boolean a(SSLSocket sSLSocket) {
        return O3.h.f2066d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // P3.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
