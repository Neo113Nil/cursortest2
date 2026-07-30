package p000createpolar;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAsyncTaskPrimeForceThunder9800 implements Closeable {
    public final URL PolarVoyageItemDecorationUltraDeltaEpic7485;
    public PolarVoyageDialogFragmentTitanCelestial7995 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public volatile Future PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageAsyncTaskPrimeForceThunder9800(URL url) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = url;
    }

    public final Bitmap PolarVoyageMotionLayoutTransitionHeroVision4068() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] PolarVoyageKotlinHeroHyper4083 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageKotlinHeroHyper4083(new PolarVoyageGradlePluginGammaHero9871(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + PolarVoyageKotlinHeroHyper4083.length + " bytes from " + url);
            }
            if (PolarVoyageKotlinHeroHyper4083.length > 1048576) {
                PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("Image exceeds max size of 1048576");
                return null;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(PolarVoyageKotlinHeroHyper4083, 0, PolarVoyageKotlinHeroHyper4083.length);
            if (decodeByteArray == null) {
                PolarVoyageBindingAdapterGammaOlympianCelestial7569.PolarVoyageZipVortexCelestial6185(url, "Failed to decode image: ");
                return null;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return decodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.PolarVoyageStrictModeLegendEpic1532.cancel(true);
    }
}
