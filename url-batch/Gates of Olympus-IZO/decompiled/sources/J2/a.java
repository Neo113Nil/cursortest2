package J2;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class a implements n {
    @Override // J2.n
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // J2.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // J2.n
    public final boolean c() {
        I2.n nVar = I2.n.f2519a;
        return F0.a.o() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // J2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z1.i.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            I2.n nVar = I2.n.f2519a;
            sSLParameters.setApplicationProtocols((String[]) F0.a.e(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e3) {
            throw new IOException("Android internal error", e3);
        }
    }
}
