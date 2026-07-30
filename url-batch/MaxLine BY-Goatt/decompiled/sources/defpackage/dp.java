package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dp implements in2 {
    public static final cp a = new cp();

    @Override // defpackage.in2
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals(BuildConfig.FLAVOR)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.in2
    public final boolean b() {
        boolean z = bp.d;
        return bp.d;
    }

    @Override // defpackage.in2
    public final boolean c(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.in2
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (c(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            r12 r12Var = r12.a;
            parameters.setApplicationProtocols((String[]) nm1.k(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
