package A1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements m {
    @Override // A1.m
    public final boolean a(SSLSocket sSLSocket) {
        boolean z2 = z1.h.d;
        return z1.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // A1.m
    public final o b(SSLSocket sSLSocket) {
        return new l();
    }
}
