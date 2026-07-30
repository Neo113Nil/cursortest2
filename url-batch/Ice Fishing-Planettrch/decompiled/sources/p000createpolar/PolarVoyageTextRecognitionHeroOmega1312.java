package p000createpolar;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextRecognitionHeroOmega1312 {
    public static final char[] PolarVoyageBarcodeScannerInfernoSolarSpark7767 = {'\r', '\n'};
    public static final char[] PolarVoyageBitmapVisionAuroraPixel4705 = {'\n'};
    public static final PolarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799 PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799.PolarVoyageRotateAnimationCyberCelestialDelta4768(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean PolarVoyageTextInputEditTextNebulaHero6651 = new AtomicBoolean();
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public byte[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageTextRecognitionHeroOmega1312(int i) {
        this.PolarVoyageZipVortexCelestial6185 = new byte[i];
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
    }

    public static int PolarVoyageBarcodeScannerInfernoSolarSpark7767(Charset charset) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageDiffUtilTurboStrike5735.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean PolarVoyageBitmapVisionAuroraPixel4705(byte b) {
        return (b & 192) == 128;
    }

    public static int PolarVoyageMotionLayoutTransitionHeroVision4068(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageLooperThreadAlphaPrime1279((byte) 0, PolarVoyageDebugStrikeHyper9028.PolarVoyageKotlinBetaPulseBeta3653(((i & 7) << 2) | ((i2 & 48) >> 4)), PolarVoyageDebugStrikeHyper9028.PolarVoyageKotlinBetaPulseBeta3653(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), PolarVoyageDebugStrikeHyper9028.PolarVoyageKotlinBetaPulseBeta3653(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    public final long PolarVoyageActivityInfoBetaQuantum8726() {
        PolarVoyageDiffUtilTurboStrike5735(4);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 2;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r3] & 255) << 16) | ((bArr[r8] & 255) << 8);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 4;
        return (bArr[r5] & 255) | j;
    }

    public final void PolarVoyageAlarmManagerShadowHyperBeta8339(byte[] bArr, int i) {
        this.PolarVoyageZipVortexCelestial6185 = bArr;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0;
    }

    public final String PolarVoyageAlertDialogCyberHeroQuantum3938(int i, Charset charset) {
        PolarVoyageDiffUtilTurboStrike5735(i);
        String str = new String(this.PolarVoyageZipVortexCelestial6185, this.PolarVoyageMotionLayoutTransitionHeroVision4068, i, charset);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 += i;
        return str;
    }

    public final int PolarVoyageAnimatorSetSparkUltraMax8233() {
        PolarVoyageDiffUtilTurboStrike5735(2);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        int i3 = bArr[i] & 255;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long PolarVoyageBitmapMaxTitanTitan7960() {
        PolarVoyageDiffUtilTurboStrike5735(8);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 2;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r3] & 255) << 48) | ((bArr[r8] & 255) << 40);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 4;
        long j2 = j | ((bArr[r5] & 255) << 32);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 5;
        long j3 = j2 | ((bArr[r8] & 255) << 24);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 6;
        long j4 = j3 | ((bArr[r5] & 255) << 16);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 7;
        long j5 = j4 | ((bArr[r8] & 255) << 8);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 8;
        return (bArr[r5] & 255) | j5;
    }

    public final void PolarVoyageBottomSheetOmegaNeo1907(byte[] bArr, int i, int i2) {
        PolarVoyageDiffUtilTurboStrike5735(i2);
        System.arraycopy(this.PolarVoyageZipVortexCelestial6185, this.PolarVoyageMotionLayoutTransitionHeroVision4068, bArr, i, i2);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 += i2;
    }

    public final int PolarVoyageCameraPixelBlaze2629() {
        PolarVoyageDiffUtilTurboStrike5735(4);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public final int PolarVoyageCameraViewSpectraMaxSpectra2824() {
        return PolarVoyagePackageManagerCelestialPhoenix8393() | (PolarVoyagePackageManagerCelestialPhoenix8393() << 21) | (PolarVoyagePackageManagerCelestialPhoenix8393() << 14) | (PolarVoyagePackageManagerCelestialPhoenix8393() << 7);
    }

    public final void PolarVoyageCanvasElitePhoenix4750(int i) {
        PolarVoyageConfigurationMaxSpectraForce5418(this.PolarVoyageMotionLayoutTransitionHeroVision4068 + i);
    }

    public final int PolarVoyageCardViewAlphaVortexCelestial9747() {
        PolarVoyageDiffUtilTurboStrike5735(2);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final void PolarVoyageConfigurationMaxSpectraForce5418(int i) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(i >= 0 && i <= this.PolarVoyageKotlinBetaPulseBeta3653);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
    }

    public final long PolarVoyageContentProviderHyperSpark3838() {
        PolarVoyageDiffUtilTurboStrike5735(8);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 2;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 4;
        long j2 = j | ((bArr[r5] & 255) << 24);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 5;
        long j3 = j2 | ((bArr[r8] & 255) << 32);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 6;
        long j4 = j3 | ((bArr[r5] & 255) << 40);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 7;
        long j5 = j4 | ((bArr[r8] & 255) << 48);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 8;
        return ((bArr[r5] & 255) << 56) | j5;
    }

    public final int PolarVoyageDiffUtilDragonSpeedEclipse6225() {
        int PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629();
        if (PolarVoyageCameraPixelBlaze2629 >= 0) {
            return PolarVoyageCameraPixelBlaze2629;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Top bit not zero: ", PolarVoyageCameraPixelBlaze2629));
        return 0;
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(int i) {
        if (!PolarVoyageTextInputEditTextNebulaHero6651.get() || PolarVoyageZipVortexCelestial6185() >= i) {
            return;
        }
        StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("bytesNeeded= ", i, ", bytesLeft=");
        PolarVoyageContentProviderHyperSpark3838.append(PolarVoyageZipVortexCelestial6185());
        throw new IndexOutOfBoundsException(PolarVoyageContentProviderHyperSpark3838.toString());
    }

    public final String PolarVoyageDisplayMetricsVortexDragon9516() {
        if (PolarVoyageZipVortexCelestial6185() == 0) {
            return null;
        }
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        while (i < this.PolarVoyageKotlinBetaPulseBeta3653 && this.PolarVoyageZipVortexCelestial6185[i] != 0) {
            i++;
        }
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        if (i < this.PolarVoyageKotlinBetaPulseBeta3653) {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 1;
        }
        return str2;
    }

    public final String PolarVoyageDrawableDeltaHyperion5742(Charset charset) {
        int i;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageDiffUtilTurboStrike5735.contains(charset), "Unsupported charset: %s", charset);
        if (PolarVoyageZipVortexCelestial6185() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageItemDecorationUltraDeltaEpic7485(charset, "Unsupported charset: ");
                return null;
            }
            i = 2;
        }
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        while (true) {
            int i3 = this.PolarVoyageKotlinBetaPulseBeta3653;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b = this.PolarVoyageZipVortexCelestial6185[i2];
                String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                if (b != 10) {
                    if (b == 13) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
                if (bArr[i2] == 0) {
                    byte b2 = bArr[i2 + 1];
                    String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                    if (b2 != 10) {
                        if (b2 == 13) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.PolarVoyageZipVortexCelestial6185;
                if (bArr2[i2 + 1] == 0) {
                    byte b3 = bArr2[i2];
                    String str3 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                    if (b3 == 10 || b3 == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i2 += i;
        }
        String PolarVoyageAlertDialogCyberHeroQuantum3938 = PolarVoyageAlertDialogCyberHeroQuantum3938(i2 - this.PolarVoyageMotionLayoutTransitionHeroVision4068, charset);
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 != this.PolarVoyageKotlinBetaPulseBeta3653 && PolarVoyageViewRogueMaster4778(charset, PolarVoyageBarcodeScannerInfernoSolarSpark7767) == '\r') {
            PolarVoyageViewRogueMaster4778(charset, PolarVoyageBitmapVisionAuroraPixel4705);
        }
        return PolarVoyageAlertDialogCyberHeroQuantum3938;
    }

    public final int PolarVoyageFCMCelestialCosmosPixel3711() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 == this.PolarVoyageKotlinBetaPulseBeta3653) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Attempting to read a byte over the limit.");
                return 0;
            }
            long PolarVoyagePackageManagerCelestialPhoenix8393 = PolarVoyagePackageManagerCelestialPhoenix8393();
            j |= (127 & PolarVoyagePackageManagerCelestialPhoenix8393) << (i * 7);
            if ((PolarVoyagePackageManagerCelestialPhoenix8393 & 128) == 0) {
                break;
            }
        }
        return PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageNavigationViewHyperHyperHyperion1793(j);
    }

    public final Charset PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149() {
        if (PolarVoyageZipVortexCelestial6185() >= 3) {
            byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
            int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (PolarVoyageZipVortexCelestial6185() < 2) {
            return null;
        }
        byte[] bArr2 = this.PolarVoyageZipVortexCelestial6185;
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final long PolarVoyageFlingGestureEclipsePrimeMax1376() {
        int i;
        PolarVoyageDiffUtilTurboStrike5735(1);
        long j = this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r6 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new NumberFormatException(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("Invalid UTF-8 sequence first byte: ", j));
        }
        PolarVoyageDiffUtilTurboStrike5735(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068 + i3] & 192) != 128) {
                throw new NumberFormatException(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | (r4 & 63);
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 += i;
        return j;
    }

    public final void PolarVoyageGuidelineStormSolar2850(int i) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(i >= 0 && i <= this.PolarVoyageZipVortexCelestial6185.length);
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
    }

    public final int PolarVoyageItemDecorationUltraDeltaEpic7485(Charset charset) {
        int i;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageDiffUtilTurboStrike5735.contains(charset), "Unsupported charset: %s", charset);
        if (PolarVoyageZipVortexCelestial6185() < PolarVoyageBarcodeScannerInfernoSolarSpark7767(charset)) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageKotlinBetaPulseBeta3653);
            return 0;
        }
        int i2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068];
            if ((b & 128) == 0) {
                i = b & 255;
                return (i << 8) | i2;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068];
            int i3 = (b2 & 128) == 0 ? 1 : ((b2 & 224) == 192 && PolarVoyageZipVortexCelestial6185() >= 2 && PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068 + 1])) ? 2 : ((this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068] & 240) == 224 && PolarVoyageZipVortexCelestial6185() >= 3 && PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068 + 1]) && PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068 + 2])) ? 3 : ((this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068] & 248) == 240 && PolarVoyageZipVortexCelestial6185() >= 4 && PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068 + 1]) && PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068 + 2]) && PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068 + 3])) ? 4 : 0;
            if (i3 == 1) {
                i = this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068] & 255;
            } else if (i3 == 2) {
                byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
                int i4 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                i = PolarVoyageMotionLayoutTransitionHeroVision4068(0, 0, bArr[i4], bArr[i4 + 1]);
            } else {
                if (i3 != 3) {
                    if (i3 == 4) {
                        byte[] bArr2 = this.PolarVoyageZipVortexCelestial6185;
                        int i5 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        i = PolarVoyageMotionLayoutTransitionHeroVision4068(bArr2[i5], bArr2[i5 + 1], bArr2[i5 + 2], bArr2[i5 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.PolarVoyageZipVortexCelestial6185;
                int i6 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                i = PolarVoyageMotionLayoutTransitionHeroVision4068(0, bArr3[i6] & 15, bArr3[i6 + 1], bArr3[i6 + 2]);
            }
            i2 = i3;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char PolarVoyageTextInputEditTextNebulaHero66512 = PolarVoyageTextInputEditTextNebulaHero6651(0, byteOrder);
            if (!Character.isHighSurrogate(PolarVoyageTextInputEditTextNebulaHero66512) || PolarVoyageZipVortexCelestial6185() < 4) {
                i = PolarVoyageTextInputEditTextNebulaHero66512;
                i2 = 2;
            } else {
                i = Character.toCodePoint(PolarVoyageTextInputEditTextNebulaHero66512, PolarVoyageTextInputEditTextNebulaHero6651(2, byteOrder));
                i2 = 4;
            }
        }
        return (i << 8) | i2;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(int i) {
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        if (i > bArr.length) {
            this.PolarVoyageZipVortexCelestial6185 = Arrays.copyOf(bArr, i);
        }
    }

    public final String PolarVoyageLayerDrawableShadowTitaniumOmega1942(int i) {
        PolarVoyageDiffUtilTurboStrike5735(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.PolarVoyageKotlinBetaPulseBeta3653 || this.PolarVoyageZipVortexCelestial6185[i3] != 0) ? i : i - 1;
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 += i;
        return str2;
    }

    public final int PolarVoyageLifecycleOlympianOmega3762() {
        PolarVoyageDiffUtilTurboStrike5735(3);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public final int PolarVoyageLooperThreadAlphaPrime1279() {
        PolarVoyageDiffUtilTurboStrike5735(4);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 4;
        return i4;
    }

    public final short PolarVoyageMotionLayoutForceEpicAurora7183() {
        PolarVoyageDiffUtilTurboStrike5735(2);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final int PolarVoyageNavigationViewHyperHyperHyperion1793() {
        int PolarVoyageSnackbarGammaEclipse2140 = PolarVoyageSnackbarGammaEclipse2140();
        if (PolarVoyageSnackbarGammaEclipse2140 >= 0) {
            return PolarVoyageSnackbarGammaEclipse2140;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Top bit not zero: ", PolarVoyageSnackbarGammaEclipse2140));
        return 0;
    }

    public final int PolarVoyagePackageManagerCelestialPhoenix8393() {
        PolarVoyageDiffUtilTurboStrike5735(1);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 1;
        return bArr[i] & 255;
    }

    public final long PolarVoyageRemoteModelManagerOlympianCelestial9141() {
        PolarVoyageDiffUtilTurboStrike5735(4);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 2;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 4;
        return ((bArr[r5] & 255) << 24) | j;
    }

    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        PolarVoyageDiffUtilTurboStrike5735(1);
        return this.PolarVoyageZipVortexCelestial6185[this.PolarVoyageMotionLayoutTransitionHeroVision4068] & 255;
    }

    public final int PolarVoyageSnackbarGammaEclipse2140() {
        PolarVoyageDiffUtilTurboStrike5735(4);
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final int PolarVoyageStrictModeLegendEpic1532() {
        if (PolarVoyageZipVortexCelestial6185() < 4) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageKotlinBetaPulseBeta3653);
            return 0;
        }
        int PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629();
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 -= 4;
        return PolarVoyageCameraPixelBlaze2629;
    }

    public final char PolarVoyageTextInputEditTextNebulaHero6651(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        PolarVoyageDiffUtilTurboStrike5735(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            b = bArr[i3];
            b2 = bArr[i3 + 1];
        } else {
            int i4 = i2 + i;
            b = bArr[i4 + 1];
            b2 = bArr[i4];
        }
        return (char) ((b2 & 255) | (b << 8));
    }

    public final void PolarVoyageToolbarEclipseInfernoHero6368(int i) {
        byte[] bArr = this.PolarVoyageZipVortexCelestial6185;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        PolarVoyageAlarmManagerShadowHyperBeta8339(bArr, i);
    }

    public final long PolarVoyageViewBindingPulseHeroSpeed5705() {
        long PolarVoyageBitmapMaxTitanTitan7960 = PolarVoyageBitmapMaxTitanTitan7960();
        if (PolarVoyageBitmapMaxTitanTitan7960 >= 0) {
            return PolarVoyageBitmapMaxTitanTitan7960;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("Top bit not zero: ", PolarVoyageBitmapMaxTitanTitan7960));
        return 0L;
    }

    public final char PolarVoyageViewRogueMaster4778(Charset charset, char[] cArr) {
        int PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (PolarVoyageZipVortexCelestial6185() >= PolarVoyageBarcodeScannerInfernoSolarSpark7767(charset) && (PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(charset)) != 0) {
            long j = PolarVoyageItemDecorationUltraDeltaEpic7485 >>> 8;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageNavigationViewHyperHyperHyperion1793((j >> 32) == 0, "out of range: %s", j);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageNavigationViewHyperHyperHyperion1793(((long) c) == j2, "Out of range: %s", j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageNavigationViewHyperHyperHyperion1793(PolarVoyageItemDecorationUltraDeltaEpic7485 & 255) + this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int PolarVoyageZipVortexCelestial6185() {
        return Math.max(this.PolarVoyageKotlinBetaPulseBeta3653 - this.PolarVoyageMotionLayoutTransitionHeroVision4068, 0);
    }

    public PolarVoyageTextRecognitionHeroOmega1312() {
        this.PolarVoyageZipVortexCelestial6185 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public PolarVoyageTextRecognitionHeroOmega1312(byte[] bArr) {
        this.PolarVoyageZipVortexCelestial6185 = bArr;
        this.PolarVoyageKotlinBetaPulseBeta3653 = bArr.length;
    }

    public PolarVoyageTextRecognitionHeroOmega1312(byte[] bArr, int i) {
        this.PolarVoyageZipVortexCelestial6185 = bArr;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
    }
}
