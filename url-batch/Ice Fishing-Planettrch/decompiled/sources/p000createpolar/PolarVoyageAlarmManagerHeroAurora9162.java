package p000createpolar;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageAlarmManagerHeroAurora9162 {
    public static final AtomicInteger PolarVoyageZipVortexCelestial6185 = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean PolarVoyageZipVortexCelestial6185(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!PolarVoyageCameraOmegaHyperion2330.PolarVoyagePackageManagerCelestialPhoenix8393(resources.getDrawable(i, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
