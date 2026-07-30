package O6;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements l {
    @Override // O6.l
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return k.f1944b && Conscrypt.isConscrypt(sslSocket);
    }

    @Override // O6.l
    public final n b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return new k();
    }
}
