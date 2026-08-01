package defpackage;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class o2 implements c60 {
    @Override // defpackage.c60
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.c60
    public final boolean b(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // defpackage.c60
    public final boolean c() {
        zz zzVar = zz.a;
        return ky.g() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // defpackage.c60
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            zz zzVar = zz.a;
            sSLParameters.setApplicationProtocols((String[]) ky.d(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
