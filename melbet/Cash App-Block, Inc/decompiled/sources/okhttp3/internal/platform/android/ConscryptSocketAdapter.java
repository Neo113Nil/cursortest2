package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import okio.internal.ResourceFileSystem;
import org.conscrypt.Conscrypt;

/* loaded from: classes3.dex */
public final class ConscryptSocketAdapter implements SocketAdapter {
    public static final ConscryptSocketAdapter$Companion$factory$1 factory = new ConscryptSocketAdapter$Companion$factory$1();
    public static final boolean isSupported;

    public abstract class Companion {
        public static boolean atLeastVersion() {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            if (version.major() != 2) {
                if (version.major() <= 2) {
                    return false;
                }
            } else if (version.minor() != 1) {
                if (version.minor() <= 1) {
                    return false;
                }
            } else if (version.patch() < 0) {
                return false;
            }
            return true;
        }
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, Companion.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (Companion.atLeastVersion()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        isSupported = z;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (matchesSocket(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Android10Platform android10Platform = Platform.platform;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ResourceFileSystem.Companion.alpnProtocolNames(list).toArray(new String[0]));
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        if (matchesSocket(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        return isSupported;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }
}
