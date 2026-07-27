package e5;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final f f5538a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f5539b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f5539b = z;
    }

    @Override // e5.n
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || kotlin.jvm.internal.i.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // e5.n
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // e5.n
    public final boolean c() {
        return f5539b;
    }

    @Override // e5.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            d5.e eVar = d5.e.f5492a;
            parameters.setApplicationProtocols((String[]) W1.e.k(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
