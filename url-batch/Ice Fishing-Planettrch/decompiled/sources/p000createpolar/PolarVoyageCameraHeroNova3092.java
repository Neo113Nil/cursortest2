package p000createpolar;

import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCameraHeroNova3092 implements PolarVoyageRotateAnimationOmegaPrimeVortex9371 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final byte[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageCameraHeroNova3092(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(z);
                break;
            case "auxiliary.tracks.map":
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(i2 == 0);
                break;
        }
        this.PolarVoyageZipVortexCelestial6185 = str;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = bArr;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2;
    }

    public final ArrayList PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDiffUtilDragonSpeedEclipse6225("Metadata is not an auxiliary tracks map", this.PolarVoyageZipVortexCelestial6185.equals("auxiliary.tracks.map"));
        byte[] bArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PolarVoyageCameraHeroNova3092.class == obj.getClass()) {
            PolarVoyageCameraHeroNova3092 polarVoyageCameraHeroNova3092 = (PolarVoyageCameraHeroNova3092) obj;
            if (this.PolarVoyageZipVortexCelestial6185.equals(polarVoyageCameraHeroNova3092.PolarVoyageZipVortexCelestial6185) && Arrays.equals(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageCameraHeroNova3092.PolarVoyageMotionLayoutTransitionHeroVision4068) && this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageCameraHeroNova3092.PolarVoyageKotlinBetaPulseBeta3653 && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == polarVoyageCameraHeroNova3092.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.PolarVoyageMotionLayoutTransitionHeroVision4068) + PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageBarcodeScannerInfernoSolarSpark7767(this.PolarVoyageZipVortexCelestial6185, 527, 31)) * 31) + this.PolarVoyageKotlinBetaPulseBeta3653) * 31) + this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb;
        PolarVoyageZoomStateStrikeMasterThunder9962 polarVoyageZoomStateStrikeMasterThunder9962;
        boolean z;
        int i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (i == 0) {
            if (this.PolarVoyageZipVortexCelestial6185.equals("auxiliary.tracks.map")) {
                ArrayList PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("track types = ");
                new PolarVoyageAssetManagerEclipseHyperInferno7091(String.valueOf(',')).PolarVoyageZipVortexCelestial6185(sb2, PolarVoyageBarcodeScannerInfernoSolarSpark7767.iterator());
                sb = sb2.toString();
            }
            byte[] bArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            PolarVoyageAnimationOlympianNovaXPixel6926 polarVoyageAnimationOlympianNovaXPixel6926 = PolarVoyageZoomStateStrikeMasterThunder9962.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            polarVoyageZoomStateStrikeMasterThunder9962 = polarVoyageAnimationOlympianNovaXPixel6926.PolarVoyageKotlinBetaPulseBeta3653;
            if (polarVoyageZoomStateStrikeMasterThunder9962 == null) {
            }
            int length = bArr.length;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLooperThreadAlphaPrime1279(0, length, bArr.length);
            PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon8312 = polarVoyageZoomStateStrikeMasterThunder9962.PolarVoyageZipVortexCelestial6185;
            int i2 = polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageBitmapVisionAuroraPixel4705;
            int i3 = polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageDiffUtilTurboStrike5735;
            RoundingMode roundingMode = RoundingMode.CEILING;
            StringBuilder sb3 = new StringBuilder(PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageContentProviderHyperSpark3838(length, i3) * i2);
            polarVoyageZoomStateStrikeMasterThunder9962.PolarVoyageMotionLayoutTransitionHeroVision4068(sb3, bArr, length);
            sb = sb3.toString();
        } else if (i == 1) {
            byte[] bArr2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            sb = new String(bArr2, StandardCharsets.UTF_8);
        } else if (i == 23) {
            byte[] bArr3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDrawableDeltaHyperion5742(bArr3.length, 4, "array too small: %s < %s", bArr3.length >= 4);
            sb = String.valueOf(Float.intBitsToFloat(PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageLooperThreadAlphaPrime1279(bArr3[0], bArr3[1], bArr3[2], bArr3[3])));
        } else if (i == 67) {
            byte[] bArr4 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDrawableDeltaHyperion5742(bArr4.length, 4, "array too small: %s < %s", bArr4.length >= 4);
            sb = String.valueOf(PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageLooperThreadAlphaPrime1279(bArr4[0], bArr4[1], bArr4[2], bArr4[3]));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new PolarVoyageTextRecognitionHeroOmega1312(this.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageViewBindingPulseHeroSpeed5705());
            }
            byte[] bArr5 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            String str3 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            PolarVoyageAnimationOlympianNovaXPixel6926 polarVoyageAnimationOlympianNovaXPixel69262 = PolarVoyageZoomStateStrikeMasterThunder9962.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            polarVoyageZoomStateStrikeMasterThunder9962 = polarVoyageAnimationOlympianNovaXPixel69262.PolarVoyageKotlinBetaPulseBeta3653;
            if (polarVoyageZoomStateStrikeMasterThunder9962 == null) {
                PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon83122 = polarVoyageAnimationOlympianNovaXPixel69262.PolarVoyageZipVortexCelestial6185;
                char[] cArr = polarVoyageLightSensorNovaThunderDragon83122.PolarVoyageMotionLayoutTransitionHeroVision4068;
                int length2 = cArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    if (PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageMotionLayoutForceEpicAurora7183(cArr[i4])) {
                        int length3 = cArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length3) {
                                z = false;
                                break;
                            }
                            char c = cArr[i5];
                            if (c >= 'a' && c <= 'z') {
                                z = true;
                                break;
                            }
                            i5++;
                        }
                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDiffUtilDragonSpeedEclipse6225("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        char[] cArr2 = new char[cArr.length];
                        for (int i6 = 0; i6 < cArr.length; i6++) {
                            char c2 = cArr[i6];
                            if (PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageMotionLayoutForceEpicAurora7183(c2)) {
                                c2 = (char) (c2 ^ ' ');
                            }
                            cArr2[i6] = c2;
                        }
                        PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon83123 = new PolarVoyageLightSensorNovaThunderDragon8312(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(new StringBuilder(), polarVoyageLightSensorNovaThunderDragon83122.PolarVoyageZipVortexCelestial6185, ".lowerCase()"), cArr2);
                        if (polarVoyageLightSensorNovaThunderDragon83122.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                            byte[] bArr6 = polarVoyageLightSensorNovaThunderDragon83123.PolarVoyageTextInputEditTextNebulaHero6651;
                            if (!polarVoyageLightSensorNovaThunderDragon83123.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                                byte[] copyOf = Arrays.copyOf(bArr6, bArr6.length);
                                for (int i7 = 65; i7 <= 90; i7++) {
                                    int i8 = i7 | 32;
                                    byte b = bArr6[i7];
                                    byte b2 = bArr6[i8];
                                    if (b == -1) {
                                        copyOf[i7] = b2;
                                    } else {
                                        char c3 = (char) i7;
                                        char c4 = (char) i8;
                                        if (!(b2 == -1)) {
                                            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629(PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageRotateAnimationCyberCelestialDelta4768("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                                            return null;
                                        }
                                        copyOf[i8] = b;
                                    }
                                }
                                polarVoyageLightSensorNovaThunderDragon83122 = new PolarVoyageLightSensorNovaThunderDragon8312(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(new StringBuilder(), polarVoyageLightSensorNovaThunderDragon83123.PolarVoyageZipVortexCelestial6185, ".ignoreCase()"), polarVoyageLightSensorNovaThunderDragon83123.PolarVoyageMotionLayoutTransitionHeroVision4068, copyOf, true);
                            }
                        }
                        polarVoyageLightSensorNovaThunderDragon83122 = polarVoyageLightSensorNovaThunderDragon83123;
                    } else {
                        i4++;
                    }
                }
                polarVoyageZoomStateStrikeMasterThunder9962 = polarVoyageLightSensorNovaThunderDragon83122 == polarVoyageAnimationOlympianNovaXPixel69262.PolarVoyageZipVortexCelestial6185 ? polarVoyageAnimationOlympianNovaXPixel69262 : new PolarVoyageAnimationOlympianNovaXPixel6926(polarVoyageLightSensorNovaThunderDragon83122);
                polarVoyageAnimationOlympianNovaXPixel69262.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageZoomStateStrikeMasterThunder9962;
            }
            int length4 = bArr5.length;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLooperThreadAlphaPrime1279(0, length4, bArr5.length);
            PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon83124 = polarVoyageZoomStateStrikeMasterThunder9962.PolarVoyageZipVortexCelestial6185;
            int i22 = polarVoyageLightSensorNovaThunderDragon83124.PolarVoyageBitmapVisionAuroraPixel4705;
            int i32 = polarVoyageLightSensorNovaThunderDragon83124.PolarVoyageDiffUtilTurboStrike5735;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            StringBuilder sb32 = new StringBuilder(PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageContentProviderHyperSpark3838(length4, i32) * i22);
            try {
                polarVoyageZoomStateStrikeMasterThunder9962.PolarVoyageMotionLayoutTransitionHeroVision4068(sb32, bArr5, length4);
                sb = sb32.toString();
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        } else {
            sb = String.valueOf(this.PolarVoyageMotionLayoutTransitionHeroVision4068[0] & 255);
        }
        return "mdta: key=" + this.PolarVoyageZipVortexCelestial6185 + ", value=" + sb;
    }
}
