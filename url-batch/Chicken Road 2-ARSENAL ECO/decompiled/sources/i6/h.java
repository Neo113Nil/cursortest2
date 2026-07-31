package i6;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final f f4442a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f4443b;

    static {
        boolean z5 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z5 = true;
        } catch (ClassNotFoundException unused) {
        }
        f4443b = z5;
    }

    @Override // i6.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // i6.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // i6.n
    public final boolean c() {
        return f4443b;
    }

    @Override // i6.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            h6.e eVar = h6.e.f4355a;
            parameters.setApplicationProtocols((String[]) R0.g.d(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
