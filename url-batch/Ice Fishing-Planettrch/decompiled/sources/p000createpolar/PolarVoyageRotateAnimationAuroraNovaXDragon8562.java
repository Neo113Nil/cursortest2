package p000createpolar;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRotateAnimationAuroraNovaXDragon8562 {
    public float PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Float.NaN;
    public float PolarVoyageBitmapVisionAuroraPixel4705 = Float.NaN;
    public BoringLayout.Metrics PolarVoyageDiffUtilTurboStrike5735;
    public CharSequence PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final TextPaint PolarVoyageMotionLayoutTransitionHeroVision4068;
    public boolean PolarVoyageTextInputEditTextNebulaHero6651;
    public final CharSequence PolarVoyageZipVortexCelestial6185;

    public PolarVoyageRotateAnimationAuroraNovaXDragon8562(CharSequence charSequence, TextPaint textPaint, int i) {
        this.PolarVoyageZipVortexCelestial6185 = charSequence;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = textPaint;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (p000createpolar.PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageBottomSheetOmegaNeo1907(r2, p000createpolar.PolarVoyageTextRecognitionHyperionSparkNebula1517.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float PolarVoyageKotlinBetaPulseBeta3653() {
        if (!Float.isNaN(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
            return this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
        BoringLayout.Metrics PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185();
        float f = PolarVoyageZipVortexCelestial6185 != null ? PolarVoyageZipVortexCelestial6185.width : -1;
        TextPaint textPaint = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (f < 0.0f) {
            f = (float) Math.ceil(Layout.getDesiredWidth(PolarVoyageMotionLayoutTransitionHeroVision4068(), 0, PolarVoyageMotionLayoutTransitionHeroVision4068().length(), textPaint));
        }
        if (f != 0.0f) {
            CharSequence charSequence = this.PolarVoyageZipVortexCelestial6185;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageBottomSheetOmegaNeo1907(spanned, PolarVoyageAnimationSetCyberSpeedBlaze6144.class)) {
                }
                f += 0.5f;
            }
        }
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = f;
        return f;
    }

    public final CharSequence PolarVoyageMotionLayoutTransitionHeroVision4068() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (charSequence == null) {
            charSequence = this.PolarVoyageZipVortexCelestial6185;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageBottomSheetOmegaNeo1907(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    int i = 0;
                    while (true) {
                        if (!(i < characterStyleArr.length)) {
                            break;
                        }
                        int i2 = i + 1;
                        try {
                            CharacterStyle characterStyle = characterStyleArr[i];
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532(e.getMessage());
                            return null;
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = charSequence;
        }
        return charSequence;
    }

    public final BoringLayout.Metrics PolarVoyageZipVortexCelestial6185() {
        if (!this.PolarVoyageTextInputEditTextNebulaHero6651) {
            TextDirectionHeuristic PolarVoyageZipVortexCelestial6185 = PolarVoyageThemeOverlayCelestialOmegaSpark3810.PolarVoyageZipVortexCelestial6185(this.PolarVoyageKotlinBetaPulseBeta3653);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.PolarVoyageZipVortexCelestial6185;
            TextPaint textPaint = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            this.PolarVoyageDiffUtilTurboStrike5735 = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, PolarVoyageZipVortexCelestial6185, true, null) : !PolarVoyageZipVortexCelestial6185.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.PolarVoyageTextInputEditTextNebulaHero6651 = true;
        }
        return this.PolarVoyageDiffUtilTurboStrike5735;
    }
}
