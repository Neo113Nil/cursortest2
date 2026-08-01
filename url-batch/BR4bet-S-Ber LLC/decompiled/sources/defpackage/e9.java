package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class e9 implements c60 {
    public static final d9 a = new d9();

    @Override // defpackage.c60
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.c60
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.c60
    public final boolean c() {
        boolean z = c9.d;
        return c9.d;
    }

    @Override // defpackage.c60
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            zz zzVar = zz.a;
            parameters.setApplicationProtocols((String[]) ky.d(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
