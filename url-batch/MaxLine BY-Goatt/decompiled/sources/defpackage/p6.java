package defpackage;

import android.net.ssl.SSLSockets;
import android.os.Build;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p6 implements in2 {
    @Override // defpackage.in2
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals(BuildConfig.FLAVOR)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.in2
    public final boolean b() {
        r12 r12Var = r12.a;
        return nm1.t() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // defpackage.in2
    public final boolean c(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // defpackage.in2
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            r12 r12Var = r12.a;
            sSLParameters.setApplicationProtocols((String[]) nm1.k(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
