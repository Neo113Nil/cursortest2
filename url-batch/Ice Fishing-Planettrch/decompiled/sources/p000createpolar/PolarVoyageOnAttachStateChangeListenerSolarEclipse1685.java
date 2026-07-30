package p000createpolar;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnAttachStateChangeListenerSolarEclipse1685 implements PolarVoyageFlowMaxTitanAlpha3096 {
    public final int PolarVoyageBottomSheetOmegaNeo1907;
    public final float PolarVoyageCameraPixelBlaze2629;
    public final int PolarVoyageDrawableDeltaHyperion5742;
    public final PolarVoyageTextRecognitionHeroOmega1312 PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageTextRecognitionHeroOmega1312();
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final boolean PolarVoyageStrictModeLegendEpic1532;
    public final String PolarVoyageViewRogueMaster4778;

    public PolarVoyageOnAttachStateChangeListenerSolarEclipse1685(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0;
            this.PolarVoyageBottomSheetOmegaNeo1907 = -1;
            this.PolarVoyageViewRogueMaster4778 = "sans-serif";
            this.PolarVoyageStrictModeLegendEpic1532 = false;
            this.PolarVoyageCameraPixelBlaze2629 = 0.85f;
            this.PolarVoyageDrawableDeltaHyperion5742 = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = bArr[24];
        this.PolarVoyageBottomSheetOmegaNeo1907 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.PolarVoyageViewRogueMaster4778 = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.PolarVoyageDrawableDeltaHyperion5742 = i;
        boolean z = (bArr[0] & 32) != 0;
        this.PolarVoyageStrictModeLegendEpic1532 = z;
        if (z) {
            this.PolarVoyageCameraPixelBlaze2629 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageDiffUtilTurboStrike5735(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.PolarVoyageCameraPixelBlaze2629 = 0.85f;
        }
    }

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    public static void PolarVoyageZipVortexCelestial6185(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000createpolar.PolarVoyageFlowMaxTitanAlpha3096
    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(byte[] bArr, int i, int i2, PolarVoyageProximitySensorNovaXStrikeSolar8705 polarVoyageProximitySensorNovaXStrikeSolar8705, PolarVoyageScaleAnimationVortexAurora2886 polarVoyageScaleAnimationVortexAurora2886) {
        String PolarVoyageAlertDialogCyberHeroQuantum3938;
        int i3;
        int i4;
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageAlarmManagerShadowHyperBeta8339(bArr, i + i2);
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 2);
        int PolarVoyageCardViewAlphaVortexCelestial9747 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747();
        if (PolarVoyageCardViewAlphaVortexCelestial9747 == 0) {
            PolarVoyageAlertDialogCyberHeroQuantum3938 = "";
        } else {
            int i8 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
            Charset PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149();
            int i9 = PolarVoyageCardViewAlphaVortexCelestial9747 - (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068 - i8);
            if (PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 == null) {
                PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = StandardCharsets.UTF_8;
            }
            PolarVoyageAlertDialogCyberHeroQuantum3938 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageAlertDialogCyberHeroQuantum3938(i9, PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149);
        }
        if (PolarVoyageAlertDialogCyberHeroQuantum3938.isEmpty()) {
            PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero1477 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
            polarVoyageScaleAnimationVortexAurora2886.accept(new PolarVoyageConstraintSetCloneOlympianMegaVision9846(-9223372036854775807L, -9223372036854775807L, PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(PolarVoyageAlertDialogCyberHeroQuantum3938);
        PolarVoyageMotionLayoutTransitionHeroVision4068(spannableStringBuilder, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, 0, 0, spannableStringBuilder.length(), 16711680);
        PolarVoyageZipVortexCelestial6185(spannableStringBuilder, this.PolarVoyageBottomSheetOmegaNeo1907, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.PolarVoyageViewRogueMaster4778;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.PolarVoyageCameraPixelBlaze2629;
        while (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 8) {
            int i10 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int PolarVoyageCameraPixelBlaze2629 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCameraPixelBlaze2629();
            int PolarVoyageCameraPixelBlaze26292 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCameraPixelBlaze2629();
            if (PolarVoyageCameraPixelBlaze26292 == 1937013100) {
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= i7 ? i5 : i6);
                int PolarVoyageCardViewAlphaVortexCelestial97472 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747();
                int i11 = i6;
                while (i11 < PolarVoyageCardViewAlphaVortexCelestial97472) {
                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 12 ? i5 : i6);
                    int PolarVoyageCardViewAlphaVortexCelestial97473 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747();
                    int PolarVoyageCardViewAlphaVortexCelestial97474 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747();
                    polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(i7);
                    int i12 = i11;
                    int PolarVoyagePackageManagerCelestialPhoenix8393 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                    polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(i5);
                    int PolarVoyageCameraPixelBlaze26293 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCameraPixelBlaze2629();
                    if (PolarVoyageCardViewAlphaVortexCelestial97474 > spannableStringBuilder.length()) {
                        StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("Truncating styl end (", PolarVoyageCardViewAlphaVortexCelestial97474, ") to cueText.length() (");
                        PolarVoyageContentProviderHyperSpark3838.append(spannableStringBuilder.length());
                        PolarVoyageContentProviderHyperSpark3838.append(").");
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("Tx3gParser", PolarVoyageContentProviderHyperSpark3838.toString());
                        PolarVoyageCardViewAlphaVortexCelestial97474 = spannableStringBuilder.length();
                    }
                    if (PolarVoyageCardViewAlphaVortexCelestial97473 >= PolarVoyageCardViewAlphaVortexCelestial97474) {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("Tx3gParser", "Ignoring styl with start (" + PolarVoyageCardViewAlphaVortexCelestial97473 + ") >= end (" + PolarVoyageCardViewAlphaVortexCelestial97474 + ").");
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = PolarVoyageCardViewAlphaVortexCelestial97474;
                        PolarVoyageMotionLayoutTransitionHeroVision4068(spannableStringBuilder, PolarVoyagePackageManagerCelestialPhoenix8393, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, PolarVoyageCardViewAlphaVortexCelestial97473, i13, 0);
                        PolarVoyageZipVortexCelestial6185(spannableStringBuilder, PolarVoyageCameraPixelBlaze26293, this.PolarVoyageBottomSheetOmegaNeo1907, PolarVoyageCardViewAlphaVortexCelestial97473, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (PolarVoyageCameraPixelBlaze26292 == 1952608120 && this.PolarVoyageStrictModeLegendEpic1532) {
                i3 = 2;
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 2);
                f = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageDiffUtilTurboStrike5735(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747() / this.PolarVoyageDrawableDeltaHyperion5742, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i10 + PolarVoyageCameraPixelBlaze2629);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        polarVoyageScaleAnimationVortexAurora2886.accept(new PolarVoyageConstraintSetCloneOlympianMegaVision9846(-9223372036854775807L, -9223372036854775807L, PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageSnackbarGammaEclipse2140(new PolarVoyageProcessCameraProviderHeroBetaSolar3759(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }
}
