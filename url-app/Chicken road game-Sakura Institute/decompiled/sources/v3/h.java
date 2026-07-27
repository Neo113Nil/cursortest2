package v3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f11004a = new g();

    @Override // v3.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // v3.m
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // v3.m
    public final boolean c() {
        boolean z4 = u3.e.f10945d;
        return u3.e.f10945d;
    }

    @Override // v3.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            u3.n nVar = u3.n.f10964a;
            parameters.setApplicationProtocols((String[]) H1.f.i(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
