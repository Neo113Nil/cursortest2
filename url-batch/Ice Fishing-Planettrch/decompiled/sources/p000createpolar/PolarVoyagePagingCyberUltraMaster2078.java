package p000createpolar;

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

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyagePagingCyberUltraMaster2078 {
    public static final Logger PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static volatile PolarVoyagePagingCyberUltraMaster2078 PolarVoyageZipVortexCelestial6185;

    static {
        try {
            for (Map.Entry entry : PolarVoyageResourcesTitanAuroraPixel4448.PolarVoyageMotionLayoutTransitionHeroVision4068.entrySet()) {
                PolarVoyageResourcesTitanAuroraPixel4448.PolarVoyageMotionLayoutTransitionHeroVision4068((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        PolarVoyagePagingCyberUltraMaster2078 polarVoyageNotificationNebulaNova7957 = PolarVoyageNotificationNebulaNova7957.PolarVoyageBitmapVisionAuroraPixel4705 ? new PolarVoyageNotificationNebulaNova7957() : null;
        if (polarVoyageNotificationNebulaNova7957 == null) {
            polarVoyageNotificationNebulaNova7957 = PolarVoyageStorageShadowEpicGamma8718.PolarVoyageBitmapVisionAuroraPixel4705 ? new PolarVoyageStorageShadowEpicGamma8718() : null;
        }
        if (polarVoyageNotificationNebulaNova7957 == null) {
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        }
        PolarVoyageZipVortexCelestial6185 = polarVoyageNotificationNebulaNova7957;
        PolarVoyageMotionLayoutTransitionHeroVision4068 = Logger.getLogger(PolarVoyageGyroscopeForceSpectra2266.class.getName());
    }

    public abstract void PolarVoyageBarcodeScannerInfernoSolarSpark7767(SSLSocket sSLSocket, String str, List list);

    public void PolarVoyageBitmapVisionAuroraPixel4705(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public abstract SSLContext PolarVoyageBottomSheetOmegaNeo1907();

    public abstract String PolarVoyageDiffUtilTurboStrike5735(SSLSocket sSLSocket);

    public abstract boolean PolarVoyageItemDecorationUltraDeltaEpic7485(String str);

    public abstract PolarVoyageNavigationViewNebulaNovaXPhoenix7849 PolarVoyageKotlinBetaPulseBeta3653(X509TrustManager x509TrustManager);

    public void PolarVoyageRotateAnimationCyberCelestialDelta4768(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        PolarVoyageStrictModeLegendEpic1532(str, 5, (Throwable) obj);
    }

    public abstract void PolarVoyageStrictModeLegendEpic1532(String str, int i, Throwable th);

    public Object PolarVoyageTextInputEditTextNebulaHero6651() {
        if (PolarVoyageMotionLayoutTransitionHeroVision4068.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
