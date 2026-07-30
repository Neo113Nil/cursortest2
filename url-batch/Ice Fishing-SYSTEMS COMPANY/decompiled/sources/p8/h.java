package p8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes2.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final f f39845a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f39846b;

    static {
        boolean z8 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z8 = true;
        } catch (ClassNotFoundException unused) {
        }
        f39846b = z8;
    }

    @Override // p8.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p8.n
    public final boolean b() {
        return f39846b;
    }

    @Override // p8.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p8.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            o8.f fVar = o8.f.f39739a;
            parameters.setApplicationProtocols((String[]) C3.e.j(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
