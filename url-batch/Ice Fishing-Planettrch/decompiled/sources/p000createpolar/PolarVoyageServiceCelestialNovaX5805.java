package p000createpolar;

import android.os.Bundle;
import android.text.Spanned;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageServiceCelestialNovaX5805 {
    public static final String PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public static final String PolarVoyageBitmapVisionAuroraPixel4705;
    public static final String PolarVoyageKotlinBetaPulseBeta3653;
    public static final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final String PolarVoyageZipVortexCelestial6185;

    static {
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        PolarVoyageZipVortexCelestial6185 = Integer.toString(0, 36);
        PolarVoyageMotionLayoutTransitionHeroVision4068 = Integer.toString(1, 36);
        PolarVoyageKotlinBetaPulseBeta3653 = Integer.toString(2, 36);
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Integer.toString(3, 36);
        PolarVoyageBitmapVisionAuroraPixel4705 = Integer.toString(4, 36);
    }

    public static Bundle PolarVoyageZipVortexCelestial6185(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(PolarVoyageZipVortexCelestial6185, spanned.getSpanStart(obj));
        bundle2.putInt(PolarVoyageMotionLayoutTransitionHeroVision4068, spanned.getSpanEnd(obj));
        bundle2.putInt(PolarVoyageKotlinBetaPulseBeta3653, spanned.getSpanFlags(obj));
        bundle2.putInt(PolarVoyageBarcodeScannerInfernoSolarSpark7767, i);
        if (bundle != null) {
            bundle2.putBundle(PolarVoyageBitmapVisionAuroraPixel4705, bundle);
        }
        return bundle2;
    }
}
