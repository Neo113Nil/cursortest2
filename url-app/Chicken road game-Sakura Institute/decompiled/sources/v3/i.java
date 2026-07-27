package v3;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements k {
    @Override // v3.k
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        boolean z4 = u3.h.f10948d;
        return u3.f.b() && Conscrypt.isConscrypt(sslSocket);
    }

    @Override // v3.k
    public final m b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return new j();
    }
}
