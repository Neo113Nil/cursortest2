package p000createpolar;

import android.os.Build;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageGeocoderGammaSolarMega6873 {
    public static final boolean PolarVoyageZipVortexCelestial6185;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                PolarVoyageZipVortexCelestial6185 = z;
            }
        }
        z = false;
        PolarVoyageZipVortexCelestial6185 = z;
    }
}
