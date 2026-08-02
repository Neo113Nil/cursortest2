package okhttp3.internal.platform.android;

import androidx.room.TransactorKt;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import okio.internal.ResourceFileSystem;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes3.dex */
public final class BouncyCastleSocketAdapter implements SocketAdapter {
    public static final BouncyCastleSocketAdapter$Companion$factory$1 factory = new BouncyCastleSocketAdapter$Companion$factory$1();
    public static final boolean isSupported;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, TransactorKt.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        isSupported = z;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (matchesSocket(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Android10Platform android10Platform = Platform.platform;
            parameters.setApplicationProtocols((String[]) ResourceFileSystem.Companion.alpnProtocolNames(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        return isSupported;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return false;
    }
}
