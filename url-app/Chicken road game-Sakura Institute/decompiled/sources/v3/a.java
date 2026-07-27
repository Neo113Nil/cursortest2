package v3;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements m {
    @Override // v3.m
    public final boolean a(SSLSocket sslSocket) {
        boolean isSupportedSocket;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // v3.m
    public final String b(SSLSocket sslSocket) {
        String applicationProtocol;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // v3.m
    public final boolean c() {
        u3.n nVar = u3.n.f10964a;
        return H1.f.o() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // v3.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            u3.n nVar = u3.n.f10964a;
            sSLParameters.setApplicationProtocols((String[]) H1.f.i(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }
}
