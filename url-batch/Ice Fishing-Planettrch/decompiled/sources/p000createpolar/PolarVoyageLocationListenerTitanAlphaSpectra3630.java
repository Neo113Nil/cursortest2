package p000createpolar;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLocationListenerTitanAlphaSpectra3630 {
    public static PolarVoyageLocationListenerTitanAlphaSpectra3630 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public static final ReentrantLock PolarVoyageKotlinBetaPulseBeta3653 = new ReentrantLock();
    public final SharedPreferences PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final ReentrantLock PolarVoyageZipVortexCelestial6185 = new ReentrantLock();

    public PolarVoyageLocationListenerTitanAlphaSpectra3630(Context context) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String PolarVoyageZipVortexCelestial6185(String str) {
        ReentrantLock reentrantLock = this.PolarVoyageZipVortexCelestial6185;
        reentrantLock.lock();
        try {
            return this.PolarVoyageMotionLayoutTransitionHeroVision4068.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
