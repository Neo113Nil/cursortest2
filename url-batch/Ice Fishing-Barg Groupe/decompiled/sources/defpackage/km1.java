package defpackage;

import android.os.Build;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class km1 {
    public static final jm1 Companion = new jm1();
    public static volatile km1 PxuCJdSBwIXG;
    public static final Logger lS5Rgt96tfkO;

    static {
        try {
            for (Map.Entry entry : g4.lS5Rgt96tfkO.entrySet()) {
                g4.lS5Rgt96tfkO((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        j0.Companion.getClass();
        km1 j0Var = j0.e9gEMXR7LXtO ? new j0() : null;
        if (j0Var == null) {
            w4.Companion.getClass();
            j0Var = w4.e9gEMXR7LXtO ? new w4() : null;
        }
        if (j0Var == null) {
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        }
        PxuCJdSBwIXG = j0Var;
        lS5Rgt96tfkO = Logger.getLogger(if1.class.getName());
    }

    public abstract void OPXfSBeufaJ8(String str, int i, Throwable th);

    public Object RAsUl2FVSrh6() {
        if (lS5Rgt96tfkO.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract pi TSizfFm2Yiuu(X509TrustManager x509TrustManager);

    public abstract void Y1f8riQaR6yg(SSLSocket sSLSocket, String str, List list);

    public abstract String a92UlCVFR9N8(SSLSocket sSLSocket);

    public abstract SSLContext dgRBjINgWbAK();

    public void e9gEMXR7LXtO(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public abstract boolean rtx2ld2ELZv4(String str);

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void wdg6QnbFHrFF(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        OPXfSBeufaJ8(str, 5, (Throwable) obj);
    }
}
