package I1;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class a implements n {
    @Override // I1.n
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // I1.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // I1.n
    public final boolean c() {
        H1.n nVar = H1.n.f525a;
        return R0.e.n() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // I1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        k1.e.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            H1.n nVar = H1.n.f525a;
            sSLParameters.setApplicationProtocols((String[]) R0.e.d(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }
}
