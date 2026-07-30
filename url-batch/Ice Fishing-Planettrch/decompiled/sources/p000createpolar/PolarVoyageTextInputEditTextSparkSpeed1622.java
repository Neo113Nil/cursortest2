package p000createpolar;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextInputEditTextSparkSpeed1622 {
    public final Bitmap PolarVoyageZipVortexCelestial6185;

    public PolarVoyageTextInputEditTextSparkSpeed1622(Bitmap bitmap) {
        this.PolarVoyageZipVortexCelestial6185 = bitmap;
    }

    public final int PolarVoyageZipVortexCelestial6185() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.PolarVoyageZipVortexCelestial6185.getConfig();
        config3.getClass();
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config3 == config2) {
                return 3;
            }
        }
        if (i < 26) {
            return 0;
        }
        config = Bitmap.Config.HARDWARE;
        return config3 == config ? 4 : 0;
    }
}
