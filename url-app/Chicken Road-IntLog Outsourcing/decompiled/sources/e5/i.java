package e5;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements l {
    @Override // e5.l
    public final boolean b(SSLSocket sSLSocket) {
        i iVar = k.f5540a;
        return j.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // e5.l
    public final n d(SSLSocket sSLSocket) {
        return new k();
    }
}
