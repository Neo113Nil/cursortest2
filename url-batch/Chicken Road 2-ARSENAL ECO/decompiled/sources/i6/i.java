package i6;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements l {
    @Override // i6.l
    public final boolean a(SSLSocket sSLSocket) {
        return k.f4445b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // i6.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
