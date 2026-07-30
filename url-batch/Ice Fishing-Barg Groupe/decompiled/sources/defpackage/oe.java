package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class oe implements h82 {
    public static final ne Companion = new ne();
    public static final me PxuCJdSBwIXG = new me();
    public static final boolean lS5Rgt96tfkO;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, ne.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        lS5Rgt96tfkO = z;
    }

    @Override // defpackage.h82
    public final String PxuCJdSBwIXG(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.h82
    public final boolean TSizfFm2Yiuu() {
        return lS5Rgt96tfkO;
    }

    @Override // defpackage.h82
    public final void Y1f8riQaR6yg(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (lS5Rgt96tfkO(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            km1.Companion.getClass();
            parameters.setApplicationProtocols((String[]) jm1.PxuCJdSBwIXG(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // defpackage.h82
    public final boolean lS5Rgt96tfkO(SSLSocket sSLSocket) {
        return false;
    }
}
