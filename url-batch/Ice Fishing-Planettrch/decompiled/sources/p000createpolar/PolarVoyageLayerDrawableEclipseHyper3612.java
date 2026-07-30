package p000createpolar;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLayerDrawableEclipseHyper3612 {
    public boolean PolarVoyageBitmapVisionAuroraPixel4705;
    public boolean PolarVoyageDiffUtilTurboStrike5735;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageGuidelineUltraElitePixel3662 PolarVoyageStrictModeLegendEpic1532;
    public PolarVoyagePoseDetectionPrimeNebula3086 PolarVoyageTextInputEditTextNebulaHero6651;
    public final String PolarVoyageZipVortexCelestial6185;
    public final long[] PolarVoyageMotionLayoutTransitionHeroVision4068 = new long[2];
    public final ArrayList PolarVoyageKotlinBetaPulseBeta3653 = new ArrayList(2);
    public final ArrayList PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new ArrayList(2);

    public PolarVoyageLayerDrawableEclipseHyper3612(PolarVoyageGuidelineUltraElitePixel3662 polarVoyageGuidelineUltraElitePixel3662, String str) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageGuidelineUltraElitePixel3662;
        this.PolarVoyageZipVortexCelestial6185 = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.PolarVoyageKotlinBetaPulseBeta3653.add(this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705(sb.toString()));
            sb.append(".tmp");
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.add(this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705(sb.toString()));
            sb.setLength(length);
        }
    }

    public final PolarVoyageGradientDrawableMegaNovaShadow3603 PolarVoyageZipVortexCelestial6185() {
        if (!this.PolarVoyageBitmapVisionAuroraPixel4705 || this.PolarVoyageTextInputEditTextNebulaHero6651 != null || this.PolarVoyageDiffUtilTurboStrike5735) {
            return null;
        }
        ArrayList arrayList = this.PolarVoyageKotlinBetaPulseBeta3653;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            PolarVoyageGuidelineUltraElitePixel3662 polarVoyageGuidelineUltraElitePixel3662 = this.PolarVoyageStrictModeLegendEpic1532;
            if (i >= size) {
                this.PolarVoyageItemDecorationUltraDeltaEpic7485++;
                return new PolarVoyageGradientDrawableMegaNovaShadow3603(polarVoyageGuidelineUltraElitePixel3662, this);
            }
            if (!polarVoyageGuidelineUltraElitePixel3662.PolarVoyageAlertDialogCyberHeroQuantum3938.PolarVoyageRotateAnimationCyberCelestialDelta4768((PolarVoyageCameraPhantomNova9854) arrayList.get(i))) {
                try {
                    polarVoyageGuidelineUltraElitePixel3662.PolarVoyageContentProviderHyperSpark3838(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
