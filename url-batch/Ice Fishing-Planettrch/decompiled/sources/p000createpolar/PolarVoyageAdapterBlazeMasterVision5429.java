package p000createpolar;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageAdapterBlazeMasterVision5429 {
    public static final PolarVoyageRunnableSparkRogue7241 PolarVoyageBarcodeScannerInfernoSolarSpark7767(Object obj) {
        if (obj != PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return (PolarVoyageRunnableSparkRogue7241) obj;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Does not contain segment");
        return null;
    }

    public static final boolean PolarVoyageBitmapVisionAuroraPixel4705(Object obj) {
        return obj == PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public static PolarVoyageWorkManagerPhoenixGammaThunder6318 PolarVoyageDiffUtilTurboStrike5735(PolarVoyageViewModelScopeMasterEclipse1401 polarVoyageViewModelScopeMasterEclipse1401, int i, int i2, int i3, int i4, int i5, PolarVoyageInAppPurchaseHyperCelestialMaster2583 polarVoyageInAppPurchaseHyperCelestialMaster2583, List list, PolarVoyageRemoteConfigSparkPixelCelestial1653[] polarVoyageRemoteConfigSparkPixelCelestial1653Arr, int i6) {
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j = i5;
        int[] iArr = new int[i6];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        float f2 = 0.0f;
        while (true) {
            if (i12 >= i6) {
                break;
            }
            PolarVoyageActionBarInfernoPrime8377 polarVoyageActionBarInfernoPrime8377 = (PolarVoyageActionBarInfernoPrime8377) list2.get(i12);
            long j2 = j;
            Object PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageActionBarInfernoPrime8377.PolarVoyageTextInputEditTextNebulaHero6651();
            PolarVoyageZipCelestialForce7193 polarVoyageZipCelestialForce7193 = PolarVoyageTextInputEditTextNebulaHero6651 instanceof PolarVoyageZipCelestialForce7193 ? (PolarVoyageZipCelestialForce7193) PolarVoyageTextInputEditTextNebulaHero6651 : null;
            float f3 = polarVoyageZipCelestialForce7193 != null ? polarVoyageZipCelestialForce7193.PolarVoyageZipVortexCelestial6185 : 0.0f;
            if (f3 > 0.0f) {
                f2 += f3;
                i13++;
            } else {
                int i16 = i3 - i14;
                PolarVoyageRemoteConfigSparkPixelCelestial1653 polarVoyageRemoteConfigSparkPixelCelestial1653 = polarVoyageRemoteConfigSparkPixelCelestial1653Arr[i12];
                if (polarVoyageRemoteConfigSparkPixelCelestial1653 == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i9 = i16;
                        i10 = Integer.MAX_VALUE;
                    } else if (i16 < 0) {
                        i9 = i16;
                        i10 = 0;
                    } else {
                        i10 = i16;
                        i9 = i10;
                    }
                    polarVoyageRemoteConfigSparkPixelCelestial1653 = polarVoyageActionBarInfernoPrime8377.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageKotlinBetaPulseBeta3653(0, i10, i4, false));
                } else {
                    i9 = i16;
                }
                int PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageRemoteConfigSparkPixelCelestial1653);
                int PolarVoyageDiffUtilTurboStrike5735 = polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageDiffUtilTurboStrike5735(polarVoyageRemoteConfigSparkPixelCelestial1653);
                iArr[i12] = PolarVoyageBitmapVisionAuroraPixel4705;
                int i17 = i9 - PolarVoyageBitmapVisionAuroraPixel4705;
                if (i17 < 0) {
                    i17 = 0;
                }
                i15 = Math.min(i5, i17);
                i14 += PolarVoyageBitmapVisionAuroraPixel4705 + i15;
                i11 = Math.max(i11, PolarVoyageDiffUtilTurboStrike5735);
                polarVoyageRemoteConfigSparkPixelCelestial1653Arr[i12] = polarVoyageRemoteConfigSparkPixelCelestial1653;
            }
            i12++;
            j = j2;
        }
        long j3 = j;
        if (i13 == 0) {
            i14 -= i15;
            i7 = 0;
        } else {
            long j4 = (i13 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i14) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f4 = j5 / f2;
            for (int i18 = 0; i18 < i6; i18++) {
                Object PolarVoyageTextInputEditTextNebulaHero66512 = ((PolarVoyageActionBarInfernoPrime8377) list2.get(i18)).PolarVoyageTextInputEditTextNebulaHero6651();
                j5 -= Math.round(((PolarVoyageTextInputEditTextNebulaHero66512 instanceof PolarVoyageZipCelestialForce7193 ? (PolarVoyageZipCelestialForce7193) PolarVoyageTextInputEditTextNebulaHero66512 : null) != null ? r14.PolarVoyageZipVortexCelestial6185 : 0.0f) * f4);
            }
            int i19 = 0;
            int i20 = 0;
            while (i20 < i6) {
                if (polarVoyageRemoteConfigSparkPixelCelestial1653Arr[i20] == null) {
                    PolarVoyageActionBarInfernoPrime8377 polarVoyageActionBarInfernoPrime83772 = (PolarVoyageActionBarInfernoPrime8377) list2.get(i20);
                    Object PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageActionBarInfernoPrime83772.PolarVoyageTextInputEditTextNebulaHero6651();
                    f = f4;
                    PolarVoyageZipCelestialForce7193 polarVoyageZipCelestialForce71932 = PolarVoyageTextInputEditTextNebulaHero66513 instanceof PolarVoyageZipCelestialForce7193 ? (PolarVoyageZipCelestialForce7193) PolarVoyageTextInputEditTextNebulaHero66513 : null;
                    float f5 = polarVoyageZipCelestialForce71932 != null ? polarVoyageZipCelestialForce71932.PolarVoyageZipVortexCelestial6185 : 0.0f;
                    if (f5 <= 0.0f) {
                        PolarVoyageOnItemLongClickListenerPhantomInferno2993.PolarVoyageMotionLayoutTransitionHeroVision4068("All weights <= 0 should have placeables");
                    }
                    float f6 = f5;
                    int signum = Long.signum(j5);
                    j5 -= signum;
                    int max = Math.max(0, Math.round(f6 * f) + signum);
                    if ((polarVoyageZipCelestialForce71932 != null ? polarVoyageZipCelestialForce71932.PolarVoyageMotionLayoutTransitionHeroVision4068 : true) && max != Integer.MAX_VALUE) {
                        i8 = max;
                        PolarVoyageRemoteConfigSparkPixelCelestial1653 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageActionBarInfernoPrime83772.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageKotlinBetaPulseBeta3653(i8, max, i4, true));
                        int PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                        int PolarVoyageDiffUtilTurboStrike57352 = polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                        iArr[i20] = PolarVoyageBitmapVisionAuroraPixel47052;
                        i19 += PolarVoyageBitmapVisionAuroraPixel47052;
                        int max2 = Math.max(i11, PolarVoyageDiffUtilTurboStrike57352);
                        polarVoyageRemoteConfigSparkPixelCelestial1653Arr[i20] = PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        i11 = max2;
                    }
                    i8 = 0;
                    PolarVoyageRemoteConfigSparkPixelCelestial1653 PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageActionBarInfernoPrime83772.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageKotlinBetaPulseBeta3653(i8, max, i4, true));
                    int PolarVoyageBitmapVisionAuroraPixel470522 = polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageBarcodeScannerInfernoSolarSpark77672);
                    int PolarVoyageDiffUtilTurboStrike573522 = polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageBarcodeScannerInfernoSolarSpark77672);
                    iArr[i20] = PolarVoyageBitmapVisionAuroraPixel470522;
                    i19 += PolarVoyageBitmapVisionAuroraPixel470522;
                    int max22 = Math.max(i11, PolarVoyageDiffUtilTurboStrike573522);
                    polarVoyageRemoteConfigSparkPixelCelestial1653Arr[i20] = PolarVoyageBarcodeScannerInfernoSolarSpark77672;
                    i11 = max22;
                } else {
                    f = f4;
                }
                i20++;
                list2 = list;
                f4 = f;
            }
            i7 = (int) (i19 + j4);
            int i21 = i3 - i14;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i21) {
                i7 = i21;
            }
        }
        int i22 = i7 + i14;
        if (i22 < 0) {
            i22 = 0;
        }
        int max3 = Math.max(i22, i);
        int max4 = Math.max(i11, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageZipVortexCelestial6185(max3, polarVoyageInAppPurchaseHyperCelestialMaster2583, iArr, iArr2);
        return polarVoyageViewModelScopeMasterEclipse1401.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageRemoteConfigSparkPixelCelestial1653Arr, polarVoyageInAppPurchaseHyperCelestialMaster2583, iArr2, max3, max4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyagePermissionTurboFusionStrike9930 polarVoyagePermissionTurboFusionStrike9930, PolarVoyageMotionSceneHyperVisionVision6497 polarVoyageMotionSceneHyperVisionVision6497) {
        PolarVoyageViewModelTitanInfernoTitanium3073 polarVoyageViewModelTitanInfernoTitanium3073;
        int i;
        PolarVoyagePermissionTurboFusionStrike9930 polarVoyagePermissionTurboFusionStrike99302;
        Throwable th;
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120;
        if (polarVoyageMotionSceneHyperVisionVision6497 instanceof PolarVoyageViewModelTitanInfernoTitanium3073) {
            polarVoyageViewModelTitanInfernoTitanium3073 = (PolarVoyageViewModelTitanInfernoTitanium3073) polarVoyageMotionSceneHyperVisionVision6497;
            int i2 = polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageDrawableDeltaHyperion5742;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageDrawableDeltaHyperion5742 = i2 - Integer.MIN_VALUE;
                Object obj = polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageCameraPixelBlaze2629;
                i = polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageDrawableDeltaHyperion5742;
                if (i != 0) {
                    PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                    try {
                        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = new PolarVoyageSnackbarSpectraMasterMaster4120();
                        polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyagePermissionTurboFusionStrike9930;
                        polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageViewRogueMaster4778 = polarVoyageSnackbarSpectraMasterMaster41202;
                        polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageDrawableDeltaHyperion5742 = 1;
                        polarVoyagePermissionTurboFusionStrike9930.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageSnackbarSpectraMasterMaster41202);
                        PolarVoyageFilterGammaStrikeNova8373 polarVoyageFilterGammaStrikeNova8373 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                        PolarVoyageDrawableCompatAuroraPulse6414 polarVoyageDrawableCompatAuroraPulse6414 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        if (polarVoyageFilterGammaStrikeNova8373 == polarVoyageDrawableCompatAuroraPulse6414) {
                            return polarVoyageDrawableCompatAuroraPulse6414;
                        }
                        polarVoyagePermissionTurboFusionStrike99302 = polarVoyagePermissionTurboFusionStrike9930;
                        polarVoyageSnackbarSpectraMasterMaster4120 = polarVoyageSnackbarSpectraMasterMaster41202;
                    } catch (Throwable th2) {
                        polarVoyagePermissionTurboFusionStrike99302 = polarVoyagePermissionTurboFusionStrike9930;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    polarVoyageSnackbarSpectraMasterMaster4120 = polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageViewRogueMaster4778;
                    polarVoyagePermissionTurboFusionStrike99302 = polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageBottomSheetOmegaNeo1907;
                    try {
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageSnackbarGammaEclipse2140(polarVoyagePermissionTurboFusionStrike99302, th);
                            throw th4;
                        }
                    }
                }
                PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageSnackbarGammaEclipse2140(polarVoyagePermissionTurboFusionStrike99302, null);
                return polarVoyageSnackbarSpectraMasterMaster4120;
            }
        }
        polarVoyageViewModelTitanInfernoTitanium3073 = new PolarVoyageViewModelTitanInfernoTitanium3073(polarVoyageMotionSceneHyperVisionVision6497);
        Object obj2 = polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageCameraPixelBlaze2629;
        i = polarVoyageViewModelTitanInfernoTitanium3073.PolarVoyageDrawableDeltaHyperion5742;
        if (i != 0) {
        }
        PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageSnackbarGammaEclipse2140(polarVoyagePermissionTurboFusionStrike99302, null);
        return polarVoyageSnackbarSpectraMasterMaster4120;
    }

    public static final PolarVoyageAuthEpicRoguePhantom7282 PolarVoyageKotlinBetaPulseBeta3653(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            PolarVoyageAuthEpicRoguePhantom7282 polarVoyageAuthEpicRoguePhantom7282 = tag instanceof PolarVoyageAuthEpicRoguePhantom7282 ? (PolarVoyageAuthEpicRoguePhantom7282) tag : null;
            if (polarVoyageAuthEpicRoguePhantom7282 != null) {
                return polarVoyageAuthEpicRoguePhantom7282;
            }
            Object PolarVoyageStrictModeLegendEpic1532 = PolarVoyageLayoutOmegaVortex4134.PolarVoyageStrictModeLegendEpic1532(view);
            view = PolarVoyageStrictModeLegendEpic1532 instanceof View ? (View) PolarVoyageStrictModeLegendEpic1532 : null;
        }
        return null;
    }

    public static final int PolarVoyageMotionLayoutTransitionHeroVision4068(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static PolarVoyageGradlePluginHyperionPulseStrike7440 PolarVoyageStrictModeLegendEpic1532(PolarVoyageGradlePluginHyperionPulseStrike7440 polarVoyageGradlePluginHyperionPulseStrike7440, String[] strArr, Map map) {
        int i = 0;
        if (polarVoyageGradlePluginHyperionPulseStrike7440 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (PolarVoyageGradlePluginHyperionPulseStrike7440) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                PolarVoyageGradlePluginHyperionPulseStrike7440 polarVoyageGradlePluginHyperionPulseStrike74402 = new PolarVoyageGradlePluginHyperionPulseStrike7440();
                int length = strArr.length;
                while (i < length) {
                    polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageZipVortexCelestial6185((PolarVoyageGradlePluginHyperionPulseStrike7440) map.get(strArr[i]));
                    i++;
                }
                return polarVoyageGradlePluginHyperionPulseStrike74402;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                polarVoyageGradlePluginHyperionPulseStrike7440.PolarVoyageZipVortexCelestial6185((PolarVoyageGradlePluginHyperionPulseStrike7440) map.get(strArr[0]));
                return polarVoyageGradlePluginHyperionPulseStrike7440;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    polarVoyageGradlePluginHyperionPulseStrike7440.PolarVoyageZipVortexCelestial6185((PolarVoyageGradlePluginHyperionPulseStrike7440) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return polarVoyageGradlePluginHyperionPulseStrike7440;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageFCMVisionPrime8878 polarVoyageFCMVisionPrime8878, int i, PolarVoyageFCMVisionPrime8878 polarVoyageFCMVisionPrime88782, boolean z, boolean z2, boolean z3) {
        PolarVoyageWindowManagerSpeedUltra3573 polarVoyageWindowManagerSpeedUltra3573;
        boolean z4;
        int i2;
        int i3;
        int PolarVoyageBitmapMaxTitanTitan7960 = polarVoyageFCMVisionPrime8878.PolarVoyageBitmapMaxTitanTitan7960(i);
        int i4 = i + PolarVoyageBitmapMaxTitanTitan7960;
        int PolarVoyageDiffUtilTurboStrike5735 = polarVoyageFCMVisionPrime8878.PolarVoyageDiffUtilTurboStrike5735(i);
        int PolarVoyageDiffUtilTurboStrike57352 = polarVoyageFCMVisionPrime8878.PolarVoyageDiffUtilTurboStrike5735(i4);
        int i5 = PolarVoyageDiffUtilTurboStrike57352 - PolarVoyageDiffUtilTurboStrike5735;
        boolean z5 = i >= 0 && (polarVoyageFCMVisionPrime8878.PolarVoyageMotionLayoutTransitionHeroVision4068[(polarVoyageFCMVisionPrime8878.PolarVoyageNavigationViewHyperHyperHyperion1793(i) * 5) + 1] & 201326592) != 0;
        polarVoyageFCMVisionPrime88782.PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageBitmapMaxTitanTitan7960);
        polarVoyageFCMVisionPrime88782.PolarVoyageMotionLayoutForceEpicAurora7183(i5, polarVoyageFCMVisionPrime88782.PolarVoyageBitmapMaxTitanTitan7960);
        if (polarVoyageFCMVisionPrime8878.PolarVoyageTextInputEditTextNebulaHero6651 < i4) {
            polarVoyageFCMVisionPrime8878.PolarVoyageLooperThreadAlphaPrime1279(i4);
        }
        if (polarVoyageFCMVisionPrime8878.PolarVoyageBottomSheetOmegaNeo1907 < PolarVoyageDiffUtilTurboStrike57352) {
            polarVoyageFCMVisionPrime8878.PolarVoyageActivityInfoBetaQuantum8726(PolarVoyageDiffUtilTurboStrike57352, i4);
        }
        int[] iArr = polarVoyageFCMVisionPrime88782.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i6 = polarVoyageFCMVisionPrime88782.PolarVoyageBitmapMaxTitanTitan7960;
        int i7 = i6 * 5;
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(i7, i * 5, i4 * 5, polarVoyageFCMVisionPrime8878.PolarVoyageMotionLayoutTransitionHeroVision4068, iArr);
        Object[] objArr = polarVoyageFCMVisionPrime88782.PolarVoyageKotlinBetaPulseBeta3653;
        int i8 = polarVoyageFCMVisionPrime88782.PolarVoyageStrictModeLegendEpic1532;
        System.arraycopy(polarVoyageFCMVisionPrime8878.PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageDiffUtilTurboStrike5735, objArr, i8, i5);
        int i9 = polarVoyageFCMVisionPrime88782.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + PolarVoyageBitmapMaxTitanTitan7960;
        int PolarVoyageTextInputEditTextNebulaHero6651 = i8 - polarVoyageFCMVisionPrime88782.PolarVoyageTextInputEditTextNebulaHero6651(i6, iArr);
        int i12 = polarVoyageFCMVisionPrime88782.PolarVoyageCameraPixelBlaze2629;
        int i13 = polarVoyageFCMVisionPrime88782.PolarVoyageViewRogueMaster4778;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageFCMVisionPrime88782.PolarVoyageTextInputEditTextNebulaHero6651(i15, iArr) + PolarVoyageTextInputEditTextNebulaHero6651;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = polarVoyageFCMVisionPrime88782.PolarVoyageBottomSheetOmegaNeo1907;
            }
            iArr2[(i15 * 5) + 4] = PolarVoyageFCMVisionPrime8878.PolarVoyageStrictModeLegendEpic1532(PolarVoyageTextInputEditTextNebulaHero66512, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        polarVoyageFCMVisionPrime88782.PolarVoyageCameraPixelBlaze2629 = i14;
        int PolarVoyageZipVortexCelestial6185 = PolarVoyageProcessCameraProviderAuroraPrimePhantom9369.PolarVoyageZipVortexCelestial6185(polarVoyageFCMVisionPrime8878.PolarVoyageBarcodeScannerInfernoSolarSpark7767, i, polarVoyageFCMVisionPrime8878.PolarVoyageContentProviderHyperSpark3838());
        int PolarVoyageZipVortexCelestial61852 = PolarVoyageProcessCameraProviderAuroraPrimePhantom9369.PolarVoyageZipVortexCelestial6185(polarVoyageFCMVisionPrime8878.PolarVoyageBarcodeScannerInfernoSolarSpark7767, i4, polarVoyageFCMVisionPrime8878.PolarVoyageContentProviderHyperSpark3838());
        if (PolarVoyageZipVortexCelestial6185 < PolarVoyageZipVortexCelestial61852) {
            ArrayList arrayList = polarVoyageFCMVisionPrime8878.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            ArrayList arrayList2 = new ArrayList(PolarVoyageZipVortexCelestial61852 - PolarVoyageZipVortexCelestial6185);
            for (int i17 = PolarVoyageZipVortexCelestial6185; i17 < PolarVoyageZipVortexCelestial61852; i17++) {
                PolarVoyageServiceConnectionPhoenixSpectra4267 polarVoyageServiceConnectionPhoenixSpectra4267 = (PolarVoyageServiceConnectionPhoenixSpectra4267) arrayList.get(i17);
                polarVoyageServiceConnectionPhoenixSpectra4267.PolarVoyageZipVortexCelestial6185 += i10;
                arrayList2.add(polarVoyageServiceConnectionPhoenixSpectra4267);
            }
            polarVoyageFCMVisionPrime88782.PolarVoyageBarcodeScannerInfernoSolarSpark7767.addAll(PolarVoyageProcessCameraProviderAuroraPrimePhantom9369.PolarVoyageZipVortexCelestial6185(polarVoyageFCMVisionPrime88782.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageFCMVisionPrime88782.PolarVoyageBitmapMaxTitanTitan7960, polarVoyageFCMVisionPrime88782.PolarVoyageContentProviderHyperSpark3838()), arrayList2);
            arrayList.subList(PolarVoyageZipVortexCelestial6185, PolarVoyageZipVortexCelestial61852).clear();
            polarVoyageWindowManagerSpeedUltra3573 = arrayList2;
        } else {
            polarVoyageWindowManagerSpeedUltra3573 = PolarVoyageWindowManagerSpeedUltra3573.PolarVoyageItemDecorationUltraDeltaEpic7485;
        }
        if (!polarVoyageWindowManagerSpeedUltra3573.isEmpty()) {
            HashMap hashMap = polarVoyageFCMVisionPrime8878.PolarVoyageBitmapVisionAuroraPixel4705;
            HashMap hashMap2 = polarVoyageFCMVisionPrime88782.PolarVoyageBitmapVisionAuroraPixel4705;
            if (hashMap != null && hashMap2 != null) {
                int size = polarVoyageWindowManagerSpeedUltra3573.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = polarVoyageFCMVisionPrime88782.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        polarVoyageFCMVisionPrime88782.PolarVoyageCanvasElitePhoenix4750(i9);
        int PolarVoyageDiffUtilDragonSpeedEclipse6225 = polarVoyageFCMVisionPrime8878.PolarVoyageDiffUtilDragonSpeedEclipse6225(i, polarVoyageFCMVisionPrime8878.PolarVoyageMotionLayoutTransitionHeroVision4068);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = PolarVoyageDiffUtilDragonSpeedEclipse6225 >= 0;
            if (z7) {
                polarVoyageFCMVisionPrime8878.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803();
                polarVoyageFCMVisionPrime8878.PolarVoyageZipVortexCelestial6185(PolarVoyageDiffUtilDragonSpeedEclipse6225 - polarVoyageFCMVisionPrime8878.PolarVoyageBitmapMaxTitanTitan7960);
                polarVoyageFCMVisionPrime8878.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803();
            }
            polarVoyageFCMVisionPrime8878.PolarVoyageZipVortexCelestial6185(i - polarVoyageFCMVisionPrime8878.PolarVoyageBitmapMaxTitanTitan7960);
            boolean PolarVoyageCardViewAlphaVortexCelestial9747 = polarVoyageFCMVisionPrime8878.PolarVoyageCardViewAlphaVortexCelestial9747();
            if (z7) {
                polarVoyageFCMVisionPrime8878.PolarVoyageGuidelineStormSolar2850();
                polarVoyageFCMVisionPrime8878.PolarVoyageRotateAnimationCyberCelestialDelta4768();
                polarVoyageFCMVisionPrime8878.PolarVoyageGuidelineStormSolar2850();
                polarVoyageFCMVisionPrime8878.PolarVoyageRotateAnimationCyberCelestialDelta4768();
            }
            z4 = PolarVoyageCardViewAlphaVortexCelestial9747;
        } else {
            boolean PolarVoyageFlingGestureEclipsePrimeMax1376 = polarVoyageFCMVisionPrime8878.PolarVoyageFlingGestureEclipsePrimeMax1376(i, PolarVoyageBitmapMaxTitanTitan7960);
            polarVoyageFCMVisionPrime8878.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(PolarVoyageDiffUtilTurboStrike5735, i5, i - 1);
            z4 = PolarVoyageFlingGestureEclipsePrimeMax1376;
        }
        if (z4) {
            PolarVoyageOnItemLongClickListenerSpectraForce9061.PolarVoyageKotlinBetaPulseBeta3653("Unexpectedly removed anchors");
        }
        int i20 = polarVoyageFCMVisionPrime88782.PolarVoyageSnackbarGammaEclipse2140;
        int i21 = iArr3[i7 + 1];
        polarVoyageFCMVisionPrime88782.PolarVoyageSnackbarGammaEclipse2140 = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            polarVoyageFCMVisionPrime88782.PolarVoyageBitmapMaxTitanTitan7960 = i11;
            polarVoyageFCMVisionPrime88782.PolarVoyageStrictModeLegendEpic1532 = i8 + i5;
        }
        if (z6) {
            polarVoyageFCMVisionPrime88782.PolarVoyageAlertDialogNovaXCelestial4954(i9);
        }
        return polarVoyageWindowManagerSpeedUltra3573;
    }

    public static final void PolarVoyageZipVortexCelestial6185(PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718, int i) {
        Object obj;
        Object polarVoyageKeyframeNovaHero8920;
        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(182605726);
        int i2 = (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageResourcesCelestialInferno9280) ? 4 : 2) | i;
        int i3 = 0;
        if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCanvasElitePhoenix4750(i2 & 1, (i2 & 3) != 2)) {
            Object PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            Object obj2 = PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185;
            Object obj3 = PolarVoyageAlarmManagerShadowHyperBeta8339;
            if (PolarVoyageAlarmManagerShadowHyperBeta8339 == obj2) {
                Object PolarVoyageViewRogueMaster4778 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageViewRogueMaster4778(Boolean.FALSE);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageViewRogueMaster4778);
                obj3 = PolarVoyageViewRogueMaster4778;
            }
            PolarVoyageConstraintSetCloneTitanOmega1401 polarVoyageConstraintSetCloneTitanOmega1401 = (PolarVoyageConstraintSetCloneTitanOmega1401) obj3;
            PolarVoyageActivityInfoMaxUltraShadow5908 PolarVoyageZipVortexCelestial6185 = PolarVoyageAssetManagerSpeedOlympianOlympian3727.PolarVoyageZipVortexCelestial6185(((Boolean) polarVoyageConstraintSetCloneTitanOmega1401.getValue()).booleanValue() ? 1.0f : 0.5f, PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(2000, 2, PolarVoyageObjectDetectionCyberUltra2960.PolarVoyageZipVortexCelestial6185), polarVoyageFlowCollectorEliteStrike5718, 3072);
            Object polarVoyageResourceHyperOlympianOmega5605 = new PolarVoyageResourceHyperOlympianOmega5605(i3);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object PolarVoyageAlarmManagerShadowHyperBeta83392 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            Object obj4 = PolarVoyageAlarmManagerShadowHyperBeta83392;
            if (z || PolarVoyageAlarmManagerShadowHyperBeta83392 == obj2) {
                Object polarVoyageCanvasCyberNovaElite7830 = new PolarVoyageCanvasCyberNovaElite7830(22, polarVoyageResourcesCelestialInferno9280);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyageCanvasCyberNovaElite7830);
                obj4 = polarVoyageCanvasCyberNovaElite7830;
            }
            PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageDrawableDeltaHyperion5742(polarVoyageResourceHyperOlympianOmega5605, polarVoyageFlowCollectorEliteStrike5718);
            Object PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageDrawableDeltaHyperion5742((PolarVoyageStateFlowNebulaMax1492) obj4, polarVoyageFlowCollectorEliteStrike5718);
            Object[] objArr = new Object[0];
            Object PolarVoyageAlarmManagerShadowHyperBeta83393 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            Object obj5 = PolarVoyageAlarmManagerShadowHyperBeta83393;
            if (PolarVoyageAlarmManagerShadowHyperBeta83393 == obj2) {
                Object polarVoyageObserverInfernoCosmosPhoenix9860 = new PolarVoyageObserverInfernoCosmosPhoenix9860(r5);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyageObserverInfernoCosmosPhoenix9860);
                obj5 = polarVoyageObserverInfernoCosmosPhoenix9860;
            }
            String str = (String) PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageRotateAnimationCyberCelestialDelta4768(objArr, (PolarVoyageFragmentPulseEliteDragon8768) obj5, polarVoyageFlowCollectorEliteStrike5718, 48);
            PolarVoyageLayerHyperForce2893 polarVoyageLayerHyperForce2893 = (PolarVoyageLayerHyperForce2893) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageMotionLayoutTransitionOmegaLegend3143.PolarVoyageZipVortexCelestial6185);
            if (polarVoyageLayerHyperForce2893 == null) {
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(1213380307);
                Object obj6 = (Context) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFlowSparkNovaX7791.PolarVoyageMotionLayoutTransitionHeroVision4068);
                while (true) {
                    if (!(obj6 instanceof ContextWrapper)) {
                        obj6 = null;
                        break;
                    } else if (obj6 instanceof PolarVoyageLayerHyperForce2893) {
                        break;
                    } else {
                        obj6 = ((ContextWrapper) obj6).getBaseContext();
                    }
                }
                polarVoyageLayerHyperForce2893 = (PolarVoyageLayerHyperForce2893) obj6;
            } else {
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(1213379439);
            }
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
            if (polarVoyageLayerHyperForce2893 == null) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
                return;
            }
            Object obj7 = ((PolarVoyageBannerAdPhoenixForcePhoenix6096) polarVoyageLayerHyperForce2893).PolarVoyageContentProviderHyperSpark3838;
            Object PolarVoyageAlarmManagerShadowHyperBeta83394 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            Object obj8 = PolarVoyageAlarmManagerShadowHyperBeta83394;
            if (PolarVoyageAlarmManagerShadowHyperBeta83394 == obj2) {
                Object polarVoyageRemoteConfigQuantumShadowShadow8824 = new PolarVoyageRemoteConfigQuantumShadowShadow8824();
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyageRemoteConfigQuantumShadowShadow8824);
                obj8 = polarVoyageRemoteConfigQuantumShadowShadow8824;
            }
            PolarVoyageRemoteConfigQuantumShadowShadow8824 polarVoyageRemoteConfigQuantumShadowShadow88242 = (PolarVoyageRemoteConfigQuantumShadowShadow8824) obj8;
            Object PolarVoyageAlarmManagerShadowHyperBeta83395 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            Object obj9 = PolarVoyageAlarmManagerShadowHyperBeta83395;
            if (PolarVoyageAlarmManagerShadowHyperBeta83395 == obj2) {
                Object polarVoyageContentProviderMaxTitanFusion4608 = new PolarVoyageContentProviderMaxTitanFusion4608(polarVoyageRemoteConfigQuantumShadowShadow88242);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyageContentProviderMaxTitanFusion4608);
                obj9 = polarVoyageContentProviderMaxTitanFusion4608;
            }
            Object obj10 = (PolarVoyageContentProviderMaxTitanFusion4608) obj9;
            boolean PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageRemoteConfigQuantumShadowShadow88242) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(obj7) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(str) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageResourceHyperOlympianOmega5605) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageDrawableDeltaHyperion5742);
            Object PolarVoyageAlarmManagerShadowHyperBeta83396 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            if (PolarVoyageItemDecorationUltraDeltaEpic7485 || PolarVoyageAlarmManagerShadowHyperBeta83396 == obj2) {
                obj = obj10;
                polarVoyageKeyframeNovaHero8920 = new PolarVoyageKeyframeNovaHero8920(polarVoyageRemoteConfigQuantumShadowShadow88242, obj7, str, polarVoyageResourceHyperOlympianOmega5605, PolarVoyageDrawableDeltaHyperion5742, 0);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyageKeyframeNovaHero8920);
            } else {
                polarVoyageKeyframeNovaHero8920 = PolarVoyageAlarmManagerShadowHyperBeta83396;
                obj = obj10;
            }
            PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492 = (PolarVoyageStateFlowNebulaMax1492) polarVoyageKeyframeNovaHero8920;
            boolean PolarVoyageDiffUtilTurboStrike5735 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(obj7) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(str) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageResourceHyperOlympianOmega5605);
            Object PolarVoyageAlarmManagerShadowHyperBeta83397 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            Object obj11 = PolarVoyageAlarmManagerShadowHyperBeta83397;
            if (PolarVoyageDiffUtilTurboStrike5735 || PolarVoyageAlarmManagerShadowHyperBeta83397 == obj2) {
                Object polarVoyageObserverTurboSpeed4054 = new PolarVoyageObserverTurboSpeed4054(polarVoyageStateFlowNebulaMax1492);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyageObserverTurboSpeed4054);
                obj11 = polarVoyageObserverTurboSpeed4054;
            }
            int i5 = (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(obj) ? 1 : 0) | (i4 != 4 ? 0 : 1);
            Object PolarVoyageAlarmManagerShadowHyperBeta83398 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            if (i5 != 0 || PolarVoyageAlarmManagerShadowHyperBeta83398 == obj2) {
                Object polarVoyageOnItemLongClickListenerEpicMaxMax5274 = new PolarVoyageOnItemLongClickListenerEpicMaxMax5274(obj, polarVoyageResourcesCelestialInferno9280, polarVoyageConstraintSetCloneTitanOmega1401, null, 18);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyageOnItemLongClickListenerEpicMaxMax5274);
                PolarVoyageAlarmManagerShadowHyperBeta83398 = polarVoyageOnItemLongClickListenerEpicMaxMax5274;
            }
            PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFlowCollectorEliteStrike5718, (PolarVoyageObjectDetectionThunderHyperInferno3620) PolarVoyageAlarmManagerShadowHyperBeta83398, PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185);
            PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageKotlinBetaPulseBeta3653((PolarVoyageAuthHyperEpicAurora4873) polarVoyageResourcesCelestialInferno9280.PolarVoyageStrictModeLegendEpic1532, ((Number) PolarVoyageZipVortexCelestial6185.getValue()).floatValue(), polarVoyageFlowCollectorEliteStrike5718, 0);
        } else {
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDatabaseCosmosSpectraSolar3905();
        }
        PolarVoyageInputMethodManagerFusionForceElite3024 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageNavigationViewHyperHyperHyperion1793();
        if (PolarVoyageNavigationViewHyperHyperHyperion1793 != null) {
            PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageNavigationInfernoSolarVision9853(i, 8, polarVoyageResourcesCelestialInferno9280);
        }
    }
}
