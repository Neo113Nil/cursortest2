package p000createpolar;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageActivityDeltaDeltaSpark9746 implements PolarVoyageFlowMaxTitanAlpha3096 {
    public static final PolarVoyageConstraintSetCloneOlympianMegaVision9846 PolarVoyageViewRogueMaster4778;
    public Inflater PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageProGuardVortexAlphaQuantum1483 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageTextRecognitionHeroOmega1312 PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageTextRecognitionHeroOmega1312();
    public final PolarVoyageTextRecognitionHeroOmega1312 PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageTextRecognitionHeroOmega1312();

    static {
        PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero1477 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageViewRogueMaster4778 = new PolarVoyageConstraintSetCloneOlympianMegaVision9846(-9223372036854775807L, -9223372036854775807L, PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778);
    }

    public PolarVoyageActivityDeltaDeltaSpark9746(List list) {
        int i;
        PolarVoyageProGuardVortexAlphaQuantum1483 polarVoyageProGuardVortexAlphaQuantum1483 = new PolarVoyageProGuardVortexAlphaQuantum1483();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageProGuardVortexAlphaQuantum1483;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageDiffUtilTurboStrike5735 = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageDiffUtilTurboStrike5735;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDelayCyberQuantumEclipse8687("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageTextInputEditTextNebulaHero6651 = Integer.parseInt(split2[0]);
                        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageItemDecorationUltraDeltaEpic7485 = Integer.parseInt(split2[1]);
                        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = true;
                    } catch (RuntimeException e2) {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDelayCyberQuantumEclipse8687("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x00bb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027e  */
    @Override // p000createpolar.PolarVoyageFlowMaxTitanAlpha3096
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(byte[] bArr, int i, int i2, PolarVoyageProximitySensorNovaXStrikeSolar8705 polarVoyageProximitySensorNovaXStrikeSolar8705, PolarVoyageScaleAnimationVortexAurora2886 polarVoyageScaleAnimationVortexAurora2886) {
        PolarVoyageConstraintSetCloneOlympianMegaVision9846 polarVoyageConstraintSetCloneOlympianMegaVision9846;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        PolarVoyageProcessCameraProviderHeroBetaSolar3759 polarVoyageProcessCameraProviderHeroBetaSolar3759;
        long j2;
        long j3;
        Rect rect;
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageAlarmManagerShadowHyperBeta8339(bArr, i + i2);
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i);
        if (this.PolarVoyageBottomSheetOmegaNeo1907 == null) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = new Inflater();
        }
        Inflater inflater = this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega13122 = this.PolarVoyageStrictModeLegendEpic1532;
        if (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageActivityInfoBetaQuantum8726(polarVoyageTextRecognitionHeroOmega1312, polarVoyageTextRecognitionHeroOmega13122, inflater)) {
            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageAlarmManagerShadowHyperBeta8339(polarVoyageTextRecognitionHeroOmega13122.PolarVoyageZipVortexCelestial6185, polarVoyageTextRecognitionHeroOmega13122.PolarVoyageKotlinBetaPulseBeta3653);
        }
        PolarVoyageProGuardVortexAlphaQuantum1483 polarVoyageProGuardVortexAlphaQuantum1483 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        long j4 = -9223372036854775807L;
        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageMotionLayoutTransitionHeroVision4068 = -9223372036854775807L;
        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageKotlinBetaPulseBeta3653 = -9223372036854775807L;
        boolean z4 = false;
        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBitmapVisionAuroraPixel4705 = false;
        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageStrictModeLegendEpic1532 = null;
        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageRotateAnimationCyberCelestialDelta4768 = -1;
        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBottomSheetOmegaNeo1907 = -1;
        int PolarVoyageZipVortexCelestial6185 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185();
        if (PolarVoyageZipVortexCelestial6185 < 2 || polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747() != PolarVoyageZipVortexCelestial6185) {
            polarVoyageConstraintSetCloneOlympianMegaVision9846 = PolarVoyageViewRogueMaster4778;
        } else {
            if (polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageDiffUtilTurboStrike5735 == null) {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("VobsubParser", "Skipping SPU (no palette)");
            } else if (polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                int i3 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068 - 2;
                polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747() + i3);
                while (true) {
                    if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() < 4) {
                        j = j4;
                        z2 = z4;
                        z = z2;
                    } else {
                        int i4 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        int PolarVoyageCardViewAlphaVortexCelestial9747 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747() * 10000;
                        int PolarVoyageCardViewAlphaVortexCelestial97472 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747() + i3;
                        z = (PolarVoyageCardViewAlphaVortexCelestial97472 == i4 || PolarVoyageCardViewAlphaVortexCelestial97472 >= polarVoyageTextRecognitionHeroOmega1312.PolarVoyageKotlinBetaPulseBeta3653) ? z4 : true;
                        int i5 = z ? PolarVoyageCardViewAlphaVortexCelestial97472 : polarVoyageTextRecognitionHeroOmega1312.PolarVoyageKotlinBetaPulseBeta3653;
                        j = j4;
                        boolean z5 = true;
                        while (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068 < i5 && z5) {
                            long j5 = PolarVoyageCardViewAlphaVortexCelestial9747;
                            int[] iArr = polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageZipVortexCelestial6185;
                            boolean z6 = z4;
                            int PolarVoyagePackageManagerCelestialPhoenix8393 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                            if (PolarVoyagePackageManagerCelestialPhoenix8393 != 255) {
                                switch (PolarVoyagePackageManagerCelestialPhoenix8393) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        z3 = true;
                                        break;
                                    case 1:
                                        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageMotionLayoutTransitionHeroVision4068 = j5;
                                        z3 = true;
                                        break;
                                    case 2:
                                        polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageKotlinBetaPulseBeta3653 = j5;
                                        z3 = true;
                                        break;
                                    case 3:
                                        if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 2) {
                                            int PolarVoyagePackageManagerCelestialPhoenix83932 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                                            int PolarVoyagePackageManagerCelestialPhoenix83933 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                                            iArr[3] = PolarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageZipVortexCelestial6185(PolarVoyagePackageManagerCelestialPhoenix83932 >> 4, polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageDiffUtilTurboStrike5735);
                                            iArr[2] = PolarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageZipVortexCelestial6185(PolarVoyagePackageManagerCelestialPhoenix83932 & 15, polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageDiffUtilTurboStrike5735);
                                            iArr[1] = PolarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageZipVortexCelestial6185(PolarVoyagePackageManagerCelestialPhoenix83933 >> 4, polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageDiffUtilTurboStrike5735);
                                            iArr[z6 ? 1 : 0] = PolarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageZipVortexCelestial6185(PolarVoyagePackageManagerCelestialPhoenix83933 & 15, polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageDiffUtilTurboStrike5735);
                                            polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBitmapVisionAuroraPixel4705 = true;
                                            z3 = true;
                                            break;
                                        } else {
                                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("VobsubParser", "Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 2) {
                                            if (!polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBitmapVisionAuroraPixel4705) {
                                                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("VobsubParser", "Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int PolarVoyagePackageManagerCelestialPhoenix83934 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                                                int PolarVoyagePackageManagerCelestialPhoenix83935 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                                                iArr[3] = PolarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageKotlinBetaPulseBeta3653(iArr[3], PolarVoyagePackageManagerCelestialPhoenix83934 >> 4);
                                                iArr[2] = PolarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageKotlinBetaPulseBeta3653(iArr[2], PolarVoyagePackageManagerCelestialPhoenix83934 & 15);
                                                iArr[1] = PolarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageKotlinBetaPulseBeta3653(iArr[1], PolarVoyagePackageManagerCelestialPhoenix83935 >> 4);
                                                iArr[z6 ? 1 : 0] = PolarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageKotlinBetaPulseBeta3653(iArr[z6 ? 1 : 0], PolarVoyagePackageManagerCelestialPhoenix83935 & 15);
                                                z3 = true;
                                                break;
                                            }
                                        } else {
                                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("VobsubParser", "Incomplete alpha command");
                                            break;
                                        }
                                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                                        if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 6) {
                                            int PolarVoyagePackageManagerCelestialPhoenix83936 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                                            int PolarVoyagePackageManagerCelestialPhoenix83937 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                                            int i6 = (PolarVoyagePackageManagerCelestialPhoenix83936 << 4) | (PolarVoyagePackageManagerCelestialPhoenix83937 >> 4);
                                            int PolarVoyagePackageManagerCelestialPhoenix83938 = ((PolarVoyagePackageManagerCelestialPhoenix83937 & 15) << 8) | polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                                            int PolarVoyagePackageManagerCelestialPhoenix83939 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                                            int PolarVoyagePackageManagerCelestialPhoenix839310 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
                                            polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageStrictModeLegendEpic1532 = new Rect(i6, (PolarVoyagePackageManagerCelestialPhoenix83939 << 4) | (PolarVoyagePackageManagerCelestialPhoenix839310 >> 4), PolarVoyagePackageManagerCelestialPhoenix83938 + 1, (((PolarVoyagePackageManagerCelestialPhoenix839310 & 15) << 8) | polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393()) + 1);
                                            z3 = true;
                                            break;
                                        } else {
                                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                                        if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 4) {
                                            polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747();
                                            polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747();
                                            z3 = true;
                                            break;
                                        } else {
                                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageAlertDialogCyberHeroQuantum3938("Unrecognized command: ", PolarVoyagePackageManagerCelestialPhoenix8393, "VobsubParser");
                                        break;
                                }
                                z4 = z6 ? 1 : 0;
                                z5 = z3;
                            }
                            z3 = z6 ? 1 : 0;
                            z4 = z6 ? 1 : 0;
                            z5 = z3;
                        }
                        z2 = z4;
                        if (z) {
                            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(PolarVoyageCardViewAlphaVortexCelestial97472);
                        }
                    }
                    if (z) {
                        j4 = j;
                        z4 = z2;
                    } else {
                        if (polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageDiffUtilTurboStrike5735 != null || !polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBarcodeScannerInfernoSolarSpark7767 || !polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBitmapVisionAuroraPixel4705 || (rect = polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageStrictModeLegendEpic1532) == null || polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageRotateAnimationCyberCelestialDelta4768 == -1 || polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBottomSheetOmegaNeo1907 == -1 || rect.width() < 2 || polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageStrictModeLegendEpic1532.height() < 2) {
                            polarVoyageProcessCameraProviderHeroBetaSolar3759 = null;
                        } else {
                            Rect rect2 = polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageStrictModeLegendEpic1532;
                            int[] iArr2 = new int[rect2.height() * rect2.width()];
                            PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087 = new PolarVoyageAuthVortexNebulaNeo9087();
                            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageTextRecognitionHeroOmega1312);
                            polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAuthVortexNebulaNeo9087, true, rect2, iArr2);
                            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageBottomSheetOmegaNeo1907);
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageTextRecognitionHeroOmega1312);
                            polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAuthVortexNebulaNeo9087, z2, rect2, iArr2);
                            polarVoyageProcessCameraProviderHeroBetaSolar3759 = new PolarVoyageProcessCameraProviderHeroBetaSolar3759(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageItemDecorationUltraDeltaEpic7485, 0, 0, rect2.left / polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageTextInputEditTextNebulaHero6651, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageTextInputEditTextNebulaHero6651, rect2.height() / polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageItemDecorationUltraDeltaEpic7485, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                        }
                        j2 = polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageKotlinBetaPulseBeta3653;
                        if (j2 == j) {
                            long j6 = polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            if (j6 != j && j2 > j6) {
                                j2 -= j6;
                            }
                            j3 = j2;
                        } else {
                            j3 = j;
                        }
                        polarVoyageConstraintSetCloneOlympianMegaVision9846 = new PolarVoyageConstraintSetCloneOlympianMegaVision9846(polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageMotionLayoutTransitionHeroVision4068, j3, polarVoyageProcessCameraProviderHeroBetaSolar3759 == null ? PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageSnackbarGammaEclipse2140(polarVoyageProcessCameraProviderHeroBetaSolar3759) : PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778);
                    }
                }
            } else {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("VobsubParser", "Skipping SPU (no plane)");
            }
            j = -9223372036854775807L;
            z2 = false;
            if (polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageDiffUtilTurboStrike5735 != null) {
            }
            polarVoyageProcessCameraProviderHeroBetaSolar3759 = null;
            j2 = polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageKotlinBetaPulseBeta3653;
            if (j2 == j) {
            }
            polarVoyageConstraintSetCloneOlympianMegaVision9846 = new PolarVoyageConstraintSetCloneOlympianMegaVision9846(polarVoyageProGuardVortexAlphaQuantum1483.PolarVoyageMotionLayoutTransitionHeroVision4068, j3, polarVoyageProcessCameraProviderHeroBetaSolar3759 == null ? PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageSnackbarGammaEclipse2140(polarVoyageProcessCameraProviderHeroBetaSolar3759) : PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778);
        }
        polarVoyageScaleAnimationVortexAurora2886.accept(polarVoyageConstraintSetCloneOlympianMegaVision9846);
    }
}
