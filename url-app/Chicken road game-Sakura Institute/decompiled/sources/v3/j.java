package v3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f11005a = new i();

    @Override // v3.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // v3.m
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // v3.m
    public final boolean c() {
        boolean z4 = u3.h.f10948d;
        return u3.h.f10948d;
    }

    @Override // v3.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            u3.n nVar = u3.n.f10964a;
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) H1.f.i(protocols).toArray(new String[0]));
        }
    }
}
