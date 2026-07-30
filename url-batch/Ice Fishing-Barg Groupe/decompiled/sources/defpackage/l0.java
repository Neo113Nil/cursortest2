package defpackage;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l0 implements h82 {
    public static final k0 Companion = new k0();

    @Override // defpackage.h82
    public final String PxuCJdSBwIXG(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // defpackage.h82
    public final boolean TSizfFm2Yiuu() {
        Companion.getClass();
        km1.Companion.getClass();
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // defpackage.h82
    public final void Y1f8riQaR6yg(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            km1.Companion.getClass();
            sSLParameters.setApplicationProtocols((String[]) jm1.PxuCJdSBwIXG(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // defpackage.h82
    public final boolean lS5Rgt96tfkO(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }
}
