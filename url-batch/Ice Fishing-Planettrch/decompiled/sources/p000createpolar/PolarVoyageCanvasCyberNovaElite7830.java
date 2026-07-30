package p000createpolar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.polarvoyage.glacialoceans.icepathfinder.quest.PolarContentScreen;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageCanvasCyberNovaElite7830 implements PolarVoyageStateFlowNebulaMax1492 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageCanvasCyberNovaElite7830(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x0697, code lost:
    
        if (r16 != false) goto L282;
     */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06c3  */
    @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PolarVoyageZipVortexCelestial6185(Object obj) {
        int i;
        final PolarVoyageContentResolverMasterEclipseElite2308 polarVoyageContentResolverMasterEclipseElite2308;
        int i2;
        boolean z;
        PolarVoyagePaintStormGammaSpectra4467 polarVoyagePaintStormGammaSpectra4467;
        PolarVoyageInputMethodManagerBetaShadowHyper4520 polarVoyageInputMethodManagerBetaShadowHyper4520;
        long j;
        PolarVoyageLocationManagerMasterMegaStrike4978 polarVoyageLocationManagerMasterMegaStrike4978;
        PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493;
        float f;
        float f2;
        long PolarVoyageDrawableDeltaHyperion5742;
        Bundle bundle;
        PolarVoyageCardViewPulseSpark7250 PolarVoyageRoomStormMaster7636;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return obj == ((PolarVoyageTextInputLayoutTurboCelestialTitanium1416) this.PolarVoyageStrictModeLegendEpic1532) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                PolarVoyagePagingDataAlphaUltra1037 polarVoyagePagingDataAlphaUltra1037 = (PolarVoyagePagingDataAlphaUltra1037) this.PolarVoyageStrictModeLegendEpic1532;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == polarVoyagePagingDataAlphaUltra1037 ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != polarVoyagePagingDataAlphaUltra1037 ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                PolarVoyageLifecycleStrikeVortexSpeed8239 polarVoyageLifecycleStrikeVortexSpeed8239 = (PolarVoyageLifecycleStrikeVortexSpeed8239) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageSnackbarTitaniumSpectraPhoenix2541 polarVoyageSnackbarTitaniumSpectraPhoenix2541 = (PolarVoyageSnackbarTitaniumSpectraPhoenix2541) obj;
                if (polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageMotionLayoutTransitionHeroVision4068() * polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageCameraViewSpectraMaxSpectra2824 < 0.0f || PolarVoyageFlowCollectorQuantumPhantom5972.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705()) <= 0.0f) {
                    return polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageZipVortexCelestial6185(new PolarVoyageMergePhoenixGamma5628(2));
                }
                final float min = Math.min(PolarVoyageFirestoreBetaQuantum3615.PolarVoyageZipVortexCelestial6185(polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageCameraViewSpectraMaxSpectra2824, 0.0f) ? 1.0f : (float) Math.ceil(polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageMotionLayoutTransitionHeroVision4068() * polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageCameraViewSpectraMaxSpectra2824), (float) Math.ceil(PolarVoyageFlowCollectorQuantumPhantom5972.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705()) / 2.0f));
                final float f3 = min / 2.0f;
                final long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705() & 4294967295L)) - min) & 4294967295L);
                float f4 = min * 2.0f;
                final boolean z2 = f4 > PolarVoyageFlowCollectorQuantumPhantom5972.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705());
                PolarVoyageNestedScrollViewBlazeMaxMax1969 PolarVoyageZipVortexCelestial6185 = polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageLooperThreadAlphaPrime1279.PolarVoyageZipVortexCelestial6185(polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705(), polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.getLayoutDirection(), polarVoyageSnackbarTitaniumSpectraPhoenix2541);
                if (!(PolarVoyageZipVortexCelestial6185 instanceof PolarVoyageVelocityTrackerNovaXBetaFusion3202)) {
                    if (!(PolarVoyageZipVortexCelestial6185 instanceof PolarVoyageThreadRogueMegaAurora9435)) {
                        if (!(PolarVoyageZipVortexCelestial6185 instanceof PolarVoyageColorStateListSpectraSpectraEpic3899)) {
                            PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                            return null;
                        }
                        final PolarVoyageInputMethodManagerBetaShadowHyper4520 polarVoyageInputMethodManagerBetaShadowHyper45202 = polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyagePackageManagerCelestialPhoenix8393;
                        if (z2) {
                            floatToRawIntBits = 0;
                        }
                        if (z2) {
                            floatToRawIntBits2 = polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705();
                        }
                        final long j2 = floatToRawIntBits2;
                        final PolarVoyageObjectAnimatorSparkPhantomStrike9583 polarVoyageMagnetometerOlympianMasterSpark9001 = z2 ? PolarVoyageCrashlyticsSpectraPixel4938.PolarVoyageDisplayMetricsVortexDragon9516 : new PolarVoyageMagnetometerOlympianMasterSpark9001(min, 0.0f, 0, 0, 30);
                        final long j3 = floatToRawIntBits;
                        return polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageZipVortexCelestial6185(new PolarVoyageStateFlowNebulaMax1492() { // from class: create-polar.PolarVoyageMediaPlayerCelestialNovaXBeta5946
                            @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
                            public final Object PolarVoyageZipVortexCelestial6185(Object obj2) {
                                PolarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774 polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774 = (PolarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774) obj2;
                                polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774.PolarVoyageZipVortexCelestial6185();
                                PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageAlertDialogCyberHeroQuantum3938(polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774, PolarVoyageInputMethodManagerBetaShadowHyper4520.this, j3, j2, 0.0f, polarVoyageMagnetometerOlympianMasterSpark9001, 104);
                                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                            }
                        });
                    }
                    final PolarVoyageInputMethodManagerBetaShadowHyper4520 polarVoyageInputMethodManagerBetaShadowHyper45203 = polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyagePackageManagerCelestialPhoenix8393;
                    PolarVoyageProcessCameraProviderSolarEpic3119 polarVoyageProcessCameraProviderSolarEpic3119 = ((PolarVoyageThreadRogueMegaAurora9435) PolarVoyageZipVortexCelestial6185).PolarVoyageStrictModeLegendEpic1532;
                    if (PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageViewRogueMaster4778(polarVoyageProcessCameraProviderSolarEpic3119)) {
                        final long j4 = polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageBitmapVisionAuroraPixel4705;
                        final PolarVoyageMagnetometerOlympianMasterSpark9001 polarVoyageMagnetometerOlympianMasterSpark90012 = new PolarVoyageMagnetometerOlympianMasterSpark9001(min, 0.0f, 0, 0, 30);
                        return polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageZipVortexCelestial6185(new PolarVoyageStateFlowNebulaMax1492() { // from class: create-polar.PolarVoyageFlowNovaSpeed6645
                            @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
                            public final Object PolarVoyageZipVortexCelestial6185(Object obj2) {
                                long j5;
                                PolarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774 polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774 = (PolarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774) obj2;
                                polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774.PolarVoyageZipVortexCelestial6185();
                                PolarVoyageLocationManagerMasterMegaStrike4978 polarVoyageLocationManagerMasterMegaStrike49782 = polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                boolean z3 = z2;
                                PolarVoyageInputMethodManagerBetaShadowHyper4520 polarVoyageInputMethodManagerBetaShadowHyper45204 = polarVoyageInputMethodManagerBetaShadowHyper45203;
                                long j6 = j4;
                                if (z3) {
                                    PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774, polarVoyageInputMethodManagerBetaShadowHyper45204, 0L, 0L, j6, null, 246);
                                } else {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                                    float f5 = f3;
                                    if (intBitsToFloat < f5) {
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike49782.PolarVoyageBitmapVisionAuroraPixel4705() >> 32));
                                        float f6 = min;
                                        float f7 = intBitsToFloat2 - f6;
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike49782.PolarVoyageBitmapVisionAuroraPixel4705() & 4294967295L)) - f6;
                                        PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno34932 = polarVoyageLocationManagerMasterMegaStrike49782.PolarVoyageStrictModeLegendEpic1532;
                                        long PolarVoyageDrawableDeltaHyperion57422 = polarVoyageAlarmManagerAlphaInferno34932.PolarVoyageDrawableDeltaHyperion5742();
                                        polarVoyageAlarmManagerAlphaInferno34932.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageRotateAnimationCyberCelestialDelta4768();
                                        try {
                                            ((PolarVoyageAlarmManagerAlphaInferno3493) ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno34932.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532).PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageBitmapVisionAuroraPixel4705(f6, f6, f7, intBitsToFloat3, 0);
                                            j5 = PolarVoyageDrawableDeltaHyperion57422;
                                            try {
                                                PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774, polarVoyageInputMethodManagerBetaShadowHyper45204, 0L, 0L, j6, null, 246);
                                                polarVoyageAlarmManagerAlphaInferno34932.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageStrictModeLegendEpic1532();
                                                polarVoyageAlarmManagerAlphaInferno34932.PolarVoyageLifecycleOlympianOmega3762(j5);
                                            } catch (Throwable th) {
                                                th = th;
                                                polarVoyageAlarmManagerAlphaInferno34932.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageStrictModeLegendEpic1532();
                                                polarVoyageAlarmManagerAlphaInferno34932.PolarVoyageLifecycleOlympianOmega3762(j5);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j5 = PolarVoyageDrawableDeltaHyperion57422;
                                        }
                                    } else {
                                        PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774, polarVoyageInputMethodManagerBetaShadowHyper45204, floatToRawIntBits, floatToRawIntBits2, PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(j6, f5), polarVoyageMagnetometerOlympianMasterSpark90012, 208);
                                    }
                                }
                                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                            }
                        });
                    }
                    if (polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageAlertDialogCyberHeroQuantum3938 == null) {
                        polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageAlertDialogCyberHeroQuantum3938 = new PolarVoyageClipDrawableMegaMax2555();
                    }
                    PolarVoyageClipDrawableMegaMax2555 polarVoyageClipDrawableMegaMax2555 = polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageAlertDialogCyberHeroQuantum3938;
                    polarVoyageClipDrawableMegaMax2555.getClass();
                    PolarVoyagePaintStormGammaSpectra4467 polarVoyagePaintStormGammaSpectra44672 = polarVoyageClipDrawableMegaMax2555.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    if (polarVoyagePaintStormGammaSpectra44672 == null) {
                        polarVoyagePaintStormGammaSpectra44672 = PolarVoyageEditTextHeroLegendDragon3544.PolarVoyageZipVortexCelestial6185();
                        polarVoyageClipDrawableMegaMax2555.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyagePaintStormGammaSpectra44672;
                    }
                    polarVoyagePaintStormGammaSpectra44672.PolarVoyageZipVortexCelestial6185.reset();
                    PolarVoyagePaintStormGammaSpectra4467.PolarVoyageZipVortexCelestial6185(polarVoyagePaintStormGammaSpectra44672, polarVoyageProcessCameraProviderSolarEpic3119);
                    if (z2) {
                        i = 0;
                    } else {
                        PolarVoyagePaintStormGammaSpectra4467 PolarVoyageZipVortexCelestial61852 = PolarVoyageEditTextHeroLegendDragon3544.PolarVoyageZipVortexCelestial6185();
                        PolarVoyagePaintStormGammaSpectra4467.PolarVoyageZipVortexCelestial6185(PolarVoyageZipVortexCelestial61852, new PolarVoyageProcessCameraProviderSolarEpic3119(min, min, (polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageKotlinBetaPulseBeta3653 - polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageZipVortexCelestial6185) - min, (polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageBarcodeScannerInfernoSolarSpark7767 - polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageMotionLayoutTransitionHeroVision4068) - min, PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageBitmapVisionAuroraPixel4705, min), PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageDiffUtilTurboStrike5735, min), PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageTextInputEditTextNebulaHero6651, min), PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageItemDecorationUltraDeltaEpic7485, min)));
                        i = 0;
                        polarVoyagePaintStormGammaSpectra44672.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyagePaintStormGammaSpectra44672, PolarVoyageZipVortexCelestial61852, 0);
                    }
                    return polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageZipVortexCelestial6185(new PolarVoyageVibratorMasterAlphaNova2131(i, polarVoyagePaintStormGammaSpectra44672, polarVoyageInputMethodManagerBetaShadowHyper45203));
                }
                PolarVoyageInputMethodManagerBetaShadowHyper4520 polarVoyageInputMethodManagerBetaShadowHyper45204 = polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyagePackageManagerCelestialPhoenix8393;
                PolarVoyageVelocityTrackerNovaXBetaFusion3202 polarVoyageVelocityTrackerNovaXBetaFusion3202 = (PolarVoyageVelocityTrackerNovaXBetaFusion3202) PolarVoyageZipVortexCelestial6185;
                PolarVoyagePaintStormGammaSpectra4467 polarVoyagePaintStormGammaSpectra44673 = polarVoyageVelocityTrackerNovaXBetaFusion3202.PolarVoyageStrictModeLegendEpic1532;
                if (z2) {
                    return polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageZipVortexCelestial6185(new PolarVoyageVibratorMasterAlphaNova2131(1, polarVoyageVelocityTrackerNovaXBetaFusion3202, polarVoyageInputMethodManagerBetaShadowHyper45204));
                }
                if (polarVoyageInputMethodManagerBetaShadowHyper45204 instanceof PolarVoyageNotificationManagerShadowBlazeMax7736) {
                    i2 = 1;
                    polarVoyageContentResolverMasterEclipseElite2308 = new PolarVoyageContentResolverMasterEclipseElite2308(5, PolarVoyageContentResolverRogueSpeed9469.PolarVoyageMotionLayoutTransitionHeroVision4068(((PolarVoyageNotificationManagerShadowBlazeMax7736) polarVoyageInputMethodManagerBetaShadowHyper45204).PolarVoyageRotateAnimationCyberCelestialDelta4768, 1.0f));
                } else {
                    polarVoyageContentResolverMasterEclipseElite2308 = null;
                    i2 = 0;
                }
                final PolarVoyageCardViewPulseSpark7250 PolarVoyageKotlinBetaPulseBeta3653 = polarVoyagePaintStormGammaSpectra44673.PolarVoyageKotlinBetaPulseBeta3653();
                float f5 = PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutTransitionHeroVision4068;
                float f6 = PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185;
                if (polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageAlertDialogCyberHeroQuantum3938 == null) {
                    polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageAlertDialogCyberHeroQuantum3938 = new PolarVoyageClipDrawableMegaMax2555();
                }
                PolarVoyageClipDrawableMegaMax2555 polarVoyageClipDrawableMegaMax25552 = polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageAlertDialogCyberHeroQuantum3938;
                polarVoyageClipDrawableMegaMax25552.getClass();
                PolarVoyagePaintStormGammaSpectra4467 polarVoyagePaintStormGammaSpectra44674 = polarVoyageClipDrawableMegaMax25552.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (polarVoyagePaintStormGammaSpectra44674 == null) {
                    polarVoyagePaintStormGammaSpectra44674 = PolarVoyageEditTextHeroLegendDragon3544.PolarVoyageZipVortexCelestial6185();
                    polarVoyageClipDrawableMegaMax25552.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyagePaintStormGammaSpectra44674;
                }
                polarVoyagePaintStormGammaSpectra44674.PolarVoyageZipVortexCelestial6185.reset();
                float f7 = PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185;
                float f8 = PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                float f9 = PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageKotlinBetaPulseBeta3653;
                float f10 = PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutTransitionHeroVision4068;
                if (Float.isNaN(f7) || Float.isNaN(f10) || Float.isNaN(f9) || Float.isNaN(f8)) {
                    PolarVoyageEditTextHeroLegendDragon3544.PolarVoyageMotionLayoutTransitionHeroVision4068("Invalid rectangle, make sure no value is NaN");
                }
                if (polarVoyagePaintStormGammaSpectra44674.PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
                    polarVoyagePaintStormGammaSpectra44674.PolarVoyageMotionLayoutTransitionHeroVision4068 = new RectF();
                }
                RectF rectF = polarVoyagePaintStormGammaSpectra44674.PolarVoyageMotionLayoutTransitionHeroVision4068;
                rectF.getClass();
                rectF.set(f7, f10, f9, f8);
                Path path = polarVoyagePaintStormGammaSpectra44674.PolarVoyageZipVortexCelestial6185;
                RectF rectF2 = polarVoyagePaintStormGammaSpectra44674.PolarVoyageMotionLayoutTransitionHeroVision4068;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                polarVoyagePaintStormGammaSpectra44674.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyagePaintStormGammaSpectra44674, polarVoyagePaintStormGammaSpectra44673, 0);
                final PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega5005 = new PolarVoyageFragmentTransactionMaxMaxMega5005();
                long ceil = (((int) Math.ceil(PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageBarcodeScannerInfernoSolarSpark7767 - f5)) & 4294967295L) | (((int) Math.ceil(PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageKotlinBetaPulseBeta3653 - f6)) << 32);
                PolarVoyageClipDrawableMegaMax2555 polarVoyageClipDrawableMegaMax25553 = polarVoyageLifecycleStrikeVortexSpeed8239.PolarVoyageAlertDialogCyberHeroQuantum3938;
                polarVoyageClipDrawableMegaMax25553.getClass();
                PolarVoyageTextInputEditTextSparkSpeed1622 polarVoyageTextInputEditTextSparkSpeed1622 = polarVoyageClipDrawableMegaMax25553.PolarVoyageZipVortexCelestial6185;
                PolarVoyageOnClickListenerRogueNovaXBeta4070 polarVoyageOnClickListenerRogueNovaXBeta4070 = polarVoyageClipDrawableMegaMax25553.PolarVoyageMotionLayoutTransitionHeroVision4068;
                PolarVoyageOnClickListenerBlazeInfernoFusion6523 polarVoyageOnClickListenerBlazeInfernoFusion6523 = polarVoyageTextInputEditTextSparkSpeed1622 != null ? new PolarVoyageOnClickListenerBlazeInfernoFusion6523(polarVoyageTextInputEditTextSparkSpeed1622.PolarVoyageZipVortexCelestial6185()) : null;
                try {
                    try {
                        if (polarVoyageOnClickListenerBlazeInfernoFusion6523 == null || polarVoyageOnClickListenerBlazeInfernoFusion6523.PolarVoyageZipVortexCelestial6185 != 0) {
                            PolarVoyageOnClickListenerBlazeInfernoFusion6523 polarVoyageOnClickListenerBlazeInfernoFusion65232 = polarVoyageTextInputEditTextSparkSpeed1622 != null ? new PolarVoyageOnClickListenerBlazeInfernoFusion6523(polarVoyageTextInputEditTextSparkSpeed1622.PolarVoyageZipVortexCelestial6185()) : null;
                            if (polarVoyageOnClickListenerBlazeInfernoFusion65232 == null || i2 != polarVoyageOnClickListenerBlazeInfernoFusion65232.PolarVoyageZipVortexCelestial6185) {
                                z = false;
                                if (polarVoyageTextInputEditTextSparkSpeed1622 != null || polarVoyageOnClickListenerRogueNovaXBeta4070 == null) {
                                    polarVoyagePaintStormGammaSpectra4467 = polarVoyagePaintStormGammaSpectra44674;
                                } else {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705() >> 32));
                                    Bitmap bitmap = polarVoyageTextInputEditTextSparkSpeed1622.PolarVoyageZipVortexCelestial6185;
                                    polarVoyagePaintStormGammaSpectra4467 = polarVoyagePaintStormGammaSpectra44674;
                                    if (intBitsToFloat <= bitmap.getWidth()) {
                                        polarVoyageInputMethodManagerBetaShadowHyper4520 = polarVoyageInputMethodManagerBetaShadowHyper45204;
                                        j = ceil;
                                        if (Float.intBitsToFloat((int) (polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705() & 4294967295L)) <= bitmap.getHeight()) {
                                        }
                                        polarVoyageTextInputEditTextSparkSpeed1622 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageKotlinBetaPulseBeta3653((int) (j >> 32), (int) (j & 4294967295L), i2);
                                        polarVoyageClipDrawableMegaMax25553.PolarVoyageZipVortexCelestial6185 = polarVoyageTextInputEditTextSparkSpeed1622;
                                        Canvas canvas = PolarVoyageModelInputOutputQuantumSpectra2339.PolarVoyageZipVortexCelestial6185;
                                        polarVoyageOnClickListenerRogueNovaXBeta4070 = new PolarVoyageOnClickListenerRogueNovaXBeta4070();
                                        polarVoyageOnClickListenerRogueNovaXBeta4070.PolarVoyageZipVortexCelestial6185 = new Canvas(polarVoyageTextInputEditTextSparkSpeed1622.PolarVoyageZipVortexCelestial6185);
                                        polarVoyageClipDrawableMegaMax25553.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageOnClickListenerRogueNovaXBeta4070;
                                        polarVoyageLocationManagerMasterMegaStrike4978 = polarVoyageClipDrawableMegaMax25553.PolarVoyageKotlinBetaPulseBeta3653;
                                        if (polarVoyageLocationManagerMasterMegaStrike4978 == null) {
                                            polarVoyageLocationManagerMasterMegaStrike4978 = new PolarVoyageLocationManagerMasterMegaStrike4978();
                                            polarVoyageClipDrawableMegaMax25553.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageLocationManagerMasterMegaStrike4978;
                                        }
                                        polarVoyageAlarmManagerAlphaInferno3493 = polarVoyageLocationManagerMasterMegaStrike4978.PolarVoyageStrictModeLegendEpic1532;
                                        PolarVoyageAdapterNeoRogue5622 polarVoyageAdapterNeoRogue5622 = polarVoyageLocationManagerMasterMegaStrike4978.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                        long PolarVoyageClipboardManagerAuroraPixel8666 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageClipboardManagerAuroraPixel8666(j);
                                        PolarVoyageOnLongClickListenerRogueDeltaNova6437 layoutDirection = polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.getLayoutDirection();
                                        PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse9577 = polarVoyageAdapterNeoRogue5622.PolarVoyageZipVortexCelestial6185;
                                        PolarVoyageInputMethodManagerBetaShadowHyper4520 polarVoyageInputMethodManagerBetaShadowHyper45205 = polarVoyageInputMethodManagerBetaShadowHyper4520;
                                        PolarVoyageOnLongClickListenerRogueDeltaNova6437 polarVoyageOnLongClickListenerRogueDeltaNova6437 = polarVoyageAdapterNeoRogue5622.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                        PolarVoyageLocationManagerMasterMegaStrike4978 polarVoyageLocationManagerMasterMegaStrike49782 = polarVoyageLocationManagerMasterMegaStrike4978;
                                        PolarVoyageCamera2DragonTitan3416 polarVoyageCamera2DragonTitan3416 = polarVoyageAdapterNeoRogue5622.PolarVoyageKotlinBetaPulseBeta3653;
                                        long j5 = polarVoyageAdapterNeoRogue5622.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                        polarVoyageAdapterNeoRogue5622.PolarVoyageZipVortexCelestial6185 = polarVoyageSnackbarTitaniumSpectraPhoenix2541;
                                        polarVoyageAdapterNeoRogue5622.PolarVoyageMotionLayoutTransitionHeroVision4068 = layoutDirection;
                                        polarVoyageAdapterNeoRogue5622.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageOnClickListenerRogueNovaXBeta4070;
                                        polarVoyageAdapterNeoRogue5622.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageClipboardManagerAuroraPixel8666;
                                        polarVoyageOnClickListenerRogueNovaXBeta4070.PolarVoyageRotateAnimationCyberCelestialDelta4768();
                                        PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageLocationManagerMasterMegaStrike49782, PolarVoyageContentResolverRogueSpeed9469.PolarVoyageMotionLayoutTransitionHeroVision4068, 0L, PolarVoyageClipboardManagerAuroraPixel8666, 58);
                                        f = -f6;
                                        f2 = -f5;
                                        ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(f, f2);
                                        PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageFlowOnBetaCyber2473(polarVoyageLocationManagerMasterMegaStrike49782, polarVoyageVelocityTrackerNovaXBetaFusion3202.PolarVoyageStrictModeLegendEpic1532, polarVoyageInputMethodManagerBetaShadowHyper45205, 0.0f, new PolarVoyageMagnetometerOlympianMasterSpark9001(f4, 0.0f, 0, 0, 30), 52);
                                        float intBitsToFloat2 = (Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike49782.PolarVoyageBitmapVisionAuroraPixel4705() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike49782.PolarVoyageBitmapVisionAuroraPixel4705() >> 32));
                                        float intBitsToFloat3 = (Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike49782.PolarVoyageBitmapVisionAuroraPixel4705() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike49782.PolarVoyageBitmapVisionAuroraPixel4705() & 4294967295L));
                                        long PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587 = polarVoyageLocationManagerMasterMegaStrike49782.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
                                        PolarVoyageDrawableDeltaHyperion5742 = polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageDrawableDeltaHyperion5742();
                                        polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageRotateAnimationCyberCelestialDelta4768();
                                        ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRemoteModelManagerOlympianCelestial9141(intBitsToFloat2, intBitsToFloat3, PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587);
                                        PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageFlowOnBetaCyber2473(polarVoyageLocationManagerMasterMegaStrike49782, polarVoyagePaintStormGammaSpectra4467, polarVoyageInputMethodManagerBetaShadowHyper45205, 0.0f, null, 28);
                                        ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(-f, -f2);
                                        polarVoyageOnClickListenerRogueNovaXBeta4070.PolarVoyageStrictModeLegendEpic1532();
                                        polarVoyageAdapterNeoRogue5622.PolarVoyageZipVortexCelestial6185 = polarVoyageEditTextAuroraHeroPulse9577;
                                        polarVoyageAdapterNeoRogue5622.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageOnLongClickListenerRogueDeltaNova6437;
                                        polarVoyageAdapterNeoRogue5622.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageCamera2DragonTitan3416;
                                        polarVoyageAdapterNeoRogue5622.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j5;
                                        polarVoyageTextInputEditTextSparkSpeed1622.PolarVoyageZipVortexCelestial6185.prepareToDraw();
                                        polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageTextInputEditTextSparkSpeed1622;
                                        final long j6 = j;
                                        return polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageZipVortexCelestial6185(new PolarVoyageStateFlowNebulaMax1492() { // from class: create-polar.PolarVoyageMapInfernoBeta7413
                                            @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
                                            public final Object PolarVoyageZipVortexCelestial6185(Object obj2) {
                                                PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega50052 = polarVoyageFragmentTransactionMaxMaxMega5005;
                                                long j7 = j6;
                                                PolarVoyageContentResolverMasterEclipseElite2308 polarVoyageContentResolverMasterEclipseElite23082 = polarVoyageContentResolverMasterEclipseElite2308;
                                                PolarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774 polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774 = (PolarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774) obj2;
                                                polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774.PolarVoyageZipVortexCelestial6185();
                                                PolarVoyageCardViewPulseSpark7250 polarVoyageCardViewPulseSpark7250 = PolarVoyageCardViewPulseSpark7250.this;
                                                float f11 = polarVoyageCardViewPulseSpark7250.PolarVoyageZipVortexCelestial6185;
                                                float f12 = polarVoyageCardViewPulseSpark7250.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                                PolarVoyageLocationManagerMasterMegaStrike4978 polarVoyageLocationManagerMasterMegaStrike49783 = polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                                ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageLocationManagerMasterMegaStrike49783.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(f11, f12);
                                                try {
                                                    PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774, (PolarVoyageTextInputEditTextSparkSpeed1622) polarVoyageFragmentTransactionMaxMaxMega50052.PolarVoyageItemDecorationUltraDeltaEpic7485, j7, 0L, 0.0f, polarVoyageContentResolverMasterEclipseElite23082, 0, 890);
                                                    ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageLocationManagerMasterMegaStrike49783.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(-f11, -f12);
                                                    return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                                                } catch (Throwable th) {
                                                    ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageLocationManagerMasterMegaStrike49783.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(-f11, -f12);
                                                    throw th;
                                                }
                                            }
                                        });
                                    }
                                }
                                polarVoyageInputMethodManagerBetaShadowHyper4520 = polarVoyageInputMethodManagerBetaShadowHyper45204;
                                j = ceil;
                                polarVoyageTextInputEditTextSparkSpeed1622 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageKotlinBetaPulseBeta3653((int) (j >> 32), (int) (j & 4294967295L), i2);
                                polarVoyageClipDrawableMegaMax25553.PolarVoyageZipVortexCelestial6185 = polarVoyageTextInputEditTextSparkSpeed1622;
                                Canvas canvas2 = PolarVoyageModelInputOutputQuantumSpectra2339.PolarVoyageZipVortexCelestial6185;
                                polarVoyageOnClickListenerRogueNovaXBeta4070 = new PolarVoyageOnClickListenerRogueNovaXBeta4070();
                                polarVoyageOnClickListenerRogueNovaXBeta4070.PolarVoyageZipVortexCelestial6185 = new Canvas(polarVoyageTextInputEditTextSparkSpeed1622.PolarVoyageZipVortexCelestial6185);
                                polarVoyageClipDrawableMegaMax25553.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageOnClickListenerRogueNovaXBeta4070;
                                polarVoyageLocationManagerMasterMegaStrike4978 = polarVoyageClipDrawableMegaMax25553.PolarVoyageKotlinBetaPulseBeta3653;
                                if (polarVoyageLocationManagerMasterMegaStrike4978 == null) {
                                }
                                polarVoyageAlarmManagerAlphaInferno3493 = polarVoyageLocationManagerMasterMegaStrike4978.PolarVoyageStrictModeLegendEpic1532;
                                PolarVoyageAdapterNeoRogue5622 polarVoyageAdapterNeoRogue56222 = polarVoyageLocationManagerMasterMegaStrike4978.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                long PolarVoyageClipboardManagerAuroraPixel86662 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageClipboardManagerAuroraPixel8666(j);
                                PolarVoyageOnLongClickListenerRogueDeltaNova6437 layoutDirection2 = polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.getLayoutDirection();
                                PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse95772 = polarVoyageAdapterNeoRogue56222.PolarVoyageZipVortexCelestial6185;
                                PolarVoyageInputMethodManagerBetaShadowHyper4520 polarVoyageInputMethodManagerBetaShadowHyper452052 = polarVoyageInputMethodManagerBetaShadowHyper4520;
                                PolarVoyageOnLongClickListenerRogueDeltaNova6437 polarVoyageOnLongClickListenerRogueDeltaNova64372 = polarVoyageAdapterNeoRogue56222.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                PolarVoyageLocationManagerMasterMegaStrike4978 polarVoyageLocationManagerMasterMegaStrike497822 = polarVoyageLocationManagerMasterMegaStrike4978;
                                PolarVoyageCamera2DragonTitan3416 polarVoyageCamera2DragonTitan34162 = polarVoyageAdapterNeoRogue56222.PolarVoyageKotlinBetaPulseBeta3653;
                                long j52 = polarVoyageAdapterNeoRogue56222.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                polarVoyageAdapterNeoRogue56222.PolarVoyageZipVortexCelestial6185 = polarVoyageSnackbarTitaniumSpectraPhoenix2541;
                                polarVoyageAdapterNeoRogue56222.PolarVoyageMotionLayoutTransitionHeroVision4068 = layoutDirection2;
                                polarVoyageAdapterNeoRogue56222.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageOnClickListenerRogueNovaXBeta4070;
                                polarVoyageAdapterNeoRogue56222.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageClipboardManagerAuroraPixel86662;
                                polarVoyageOnClickListenerRogueNovaXBeta4070.PolarVoyageRotateAnimationCyberCelestialDelta4768();
                                PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageLocationManagerMasterMegaStrike497822, PolarVoyageContentResolverRogueSpeed9469.PolarVoyageMotionLayoutTransitionHeroVision4068, 0L, PolarVoyageClipboardManagerAuroraPixel86662, 58);
                                f = -f6;
                                f2 = -f5;
                                ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(f, f2);
                                PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageFlowOnBetaCyber2473(polarVoyageLocationManagerMasterMegaStrike497822, polarVoyageVelocityTrackerNovaXBetaFusion3202.PolarVoyageStrictModeLegendEpic1532, polarVoyageInputMethodManagerBetaShadowHyper452052, 0.0f, new PolarVoyageMagnetometerOlympianMasterSpark9001(f4, 0.0f, 0, 0, 30), 52);
                                float intBitsToFloat22 = (Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike497822.PolarVoyageBitmapVisionAuroraPixel4705() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike497822.PolarVoyageBitmapVisionAuroraPixel4705() >> 32));
                                float intBitsToFloat32 = (Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike497822.PolarVoyageBitmapVisionAuroraPixel4705() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike497822.PolarVoyageBitmapVisionAuroraPixel4705() & 4294967295L));
                                long PolarVoyageMotionLayoutTransitionUltraAlphaCyber55872 = polarVoyageLocationManagerMasterMegaStrike497822.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
                                PolarVoyageDrawableDeltaHyperion5742 = polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageDrawableDeltaHyperion5742();
                                polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageRotateAnimationCyberCelestialDelta4768();
                                ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRemoteModelManagerOlympianCelestial9141(intBitsToFloat22, intBitsToFloat32, PolarVoyageMotionLayoutTransitionUltraAlphaCyber55872);
                                PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageFlowOnBetaCyber2473(polarVoyageLocationManagerMasterMegaStrike497822, polarVoyagePaintStormGammaSpectra4467, polarVoyageInputMethodManagerBetaShadowHyper452052, 0.0f, null, 28);
                                ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(-f, -f2);
                                polarVoyageOnClickListenerRogueNovaXBeta4070.PolarVoyageStrictModeLegendEpic1532();
                                polarVoyageAdapterNeoRogue56222.PolarVoyageZipVortexCelestial6185 = polarVoyageEditTextAuroraHeroPulse95772;
                                polarVoyageAdapterNeoRogue56222.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageOnLongClickListenerRogueDeltaNova64372;
                                polarVoyageAdapterNeoRogue56222.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageCamera2DragonTitan34162;
                                polarVoyageAdapterNeoRogue56222.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j52;
                                polarVoyageTextInputEditTextSparkSpeed1622.PolarVoyageZipVortexCelestial6185.prepareToDraw();
                                polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageTextInputEditTextSparkSpeed1622;
                                final long j62 = j;
                                return polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageZipVortexCelestial6185(new PolarVoyageStateFlowNebulaMax1492() { // from class: create-polar.PolarVoyageMapInfernoBeta7413
                                    @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
                                    public final Object PolarVoyageZipVortexCelestial6185(Object obj2) {
                                        PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega50052 = polarVoyageFragmentTransactionMaxMaxMega5005;
                                        long j7 = j62;
                                        PolarVoyageContentResolverMasterEclipseElite2308 polarVoyageContentResolverMasterEclipseElite23082 = polarVoyageContentResolverMasterEclipseElite2308;
                                        PolarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774 polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774 = (PolarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774) obj2;
                                        polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774.PolarVoyageZipVortexCelestial6185();
                                        PolarVoyageCardViewPulseSpark7250 polarVoyageCardViewPulseSpark7250 = PolarVoyageCardViewPulseSpark7250.this;
                                        float f11 = polarVoyageCardViewPulseSpark7250.PolarVoyageZipVortexCelestial6185;
                                        float f12 = polarVoyageCardViewPulseSpark7250.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                        PolarVoyageLocationManagerMasterMegaStrike4978 polarVoyageLocationManagerMasterMegaStrike49783 = polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                        ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageLocationManagerMasterMegaStrike49783.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(f11, f12);
                                        try {
                                            PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774, (PolarVoyageTextInputEditTextSparkSpeed1622) polarVoyageFragmentTransactionMaxMaxMega50052.PolarVoyageItemDecorationUltraDeltaEpic7485, j7, 0L, 0.0f, polarVoyageContentResolverMasterEclipseElite23082, 0, 890);
                                            ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageLocationManagerMasterMegaStrike49783.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(-f11, -f12);
                                            return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                                        } catch (Throwable th) {
                                            ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageLocationManagerMasterMegaStrike49783.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(-f11, -f12);
                                            throw th;
                                        }
                                    }
                                });
                            }
                        }
                        ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRemoteModelManagerOlympianCelestial9141(intBitsToFloat22, intBitsToFloat32, PolarVoyageMotionLayoutTransitionUltraAlphaCyber55872);
                        PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageFlowOnBetaCyber2473(polarVoyageLocationManagerMasterMegaStrike497822, polarVoyagePaintStormGammaSpectra4467, polarVoyageInputMethodManagerBetaShadowHyper452052, 0.0f, null, 28);
                        ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(-f, -f2);
                        polarVoyageOnClickListenerRogueNovaXBeta4070.PolarVoyageStrictModeLegendEpic1532();
                        polarVoyageAdapterNeoRogue56222.PolarVoyageZipVortexCelestial6185 = polarVoyageEditTextAuroraHeroPulse95772;
                        polarVoyageAdapterNeoRogue56222.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageOnLongClickListenerRogueDeltaNova64372;
                        polarVoyageAdapterNeoRogue56222.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageCamera2DragonTitan34162;
                        polarVoyageAdapterNeoRogue56222.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j52;
                        polarVoyageTextInputEditTextSparkSpeed1622.PolarVoyageZipVortexCelestial6185.prepareToDraw();
                        polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageTextInputEditTextSparkSpeed1622;
                        final long j622 = j;
                        return polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageZipVortexCelestial6185(new PolarVoyageStateFlowNebulaMax1492() { // from class: create-polar.PolarVoyageMapInfernoBeta7413
                            @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
                            public final Object PolarVoyageZipVortexCelestial6185(Object obj2) {
                                PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega50052 = polarVoyageFragmentTransactionMaxMaxMega5005;
                                long j7 = j622;
                                PolarVoyageContentResolverMasterEclipseElite2308 polarVoyageContentResolverMasterEclipseElite23082 = polarVoyageContentResolverMasterEclipseElite2308;
                                PolarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774 polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774 = (PolarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774) obj2;
                                polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774.PolarVoyageZipVortexCelestial6185();
                                PolarVoyageCardViewPulseSpark7250 polarVoyageCardViewPulseSpark7250 = PolarVoyageCardViewPulseSpark7250.this;
                                float f11 = polarVoyageCardViewPulseSpark7250.PolarVoyageZipVortexCelestial6185;
                                float f12 = polarVoyageCardViewPulseSpark7250.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                PolarVoyageLocationManagerMasterMegaStrike4978 polarVoyageLocationManagerMasterMegaStrike49783 = polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageLocationManagerMasterMegaStrike49783.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(f11, f12);
                                try {
                                    PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyagePaintFlagsDrawFilterNebulaEliteSpark5774, (PolarVoyageTextInputEditTextSparkSpeed1622) polarVoyageFragmentTransactionMaxMaxMega50052.PolarVoyageItemDecorationUltraDeltaEpic7485, j7, 0L, 0.0f, polarVoyageContentResolverMasterEclipseElite23082, 0, 890);
                                    ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageLocationManagerMasterMegaStrike49783.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(-f11, -f12);
                                    return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                                } catch (Throwable th) {
                                    ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageLocationManagerMasterMegaStrike49783.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(-f11, -f12);
                                    throw th;
                                }
                            }
                        });
                    } finally {
                        polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageStrictModeLegendEpic1532();
                        polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageLifecycleOlympianOmega3762(PolarVoyageDrawableDeltaHyperion5742);
                    }
                    PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageFlowOnBetaCyber2473(polarVoyageLocationManagerMasterMegaStrike497822, polarVoyageVelocityTrackerNovaXBetaFusion3202.PolarVoyageStrictModeLegendEpic1532, polarVoyageInputMethodManagerBetaShadowHyper452052, 0.0f, new PolarVoyageMagnetometerOlympianMasterSpark9001(f4, 0.0f, 0, 0, 30), 52);
                    float intBitsToFloat222 = (Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike497822.PolarVoyageBitmapVisionAuroraPixel4705() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike497822.PolarVoyageBitmapVisionAuroraPixel4705() >> 32));
                    float intBitsToFloat322 = (Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike497822.PolarVoyageBitmapVisionAuroraPixel4705() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (polarVoyageLocationManagerMasterMegaStrike497822.PolarVoyageBitmapVisionAuroraPixel4705() & 4294967295L));
                    long PolarVoyageMotionLayoutTransitionUltraAlphaCyber558722 = polarVoyageLocationManagerMasterMegaStrike497822.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
                    PolarVoyageDrawableDeltaHyperion5742 = polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageDrawableDeltaHyperion5742();
                    polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageRotateAnimationCyberCelestialDelta4768();
                } catch (Throwable th) {
                    ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(-f, -f2);
                    throw th;
                }
                z = true;
                if (polarVoyageTextInputEditTextSparkSpeed1622 != null) {
                }
                polarVoyagePaintStormGammaSpectra4467 = polarVoyagePaintStormGammaSpectra44674;
                polarVoyageInputMethodManagerBetaShadowHyper4520 = polarVoyageInputMethodManagerBetaShadowHyper45204;
                j = ceil;
                polarVoyageTextInputEditTextSparkSpeed1622 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageKotlinBetaPulseBeta3653((int) (j >> 32), (int) (j & 4294967295L), i2);
                polarVoyageClipDrawableMegaMax25553.PolarVoyageZipVortexCelestial6185 = polarVoyageTextInputEditTextSparkSpeed1622;
                Canvas canvas22 = PolarVoyageModelInputOutputQuantumSpectra2339.PolarVoyageZipVortexCelestial6185;
                polarVoyageOnClickListenerRogueNovaXBeta4070 = new PolarVoyageOnClickListenerRogueNovaXBeta4070();
                polarVoyageOnClickListenerRogueNovaXBeta4070.PolarVoyageZipVortexCelestial6185 = new Canvas(polarVoyageTextInputEditTextSparkSpeed1622.PolarVoyageZipVortexCelestial6185);
                polarVoyageClipDrawableMegaMax25553.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageOnClickListenerRogueNovaXBeta4070;
                polarVoyageLocationManagerMasterMegaStrike4978 = polarVoyageClipDrawableMegaMax25553.PolarVoyageKotlinBetaPulseBeta3653;
                if (polarVoyageLocationManagerMasterMegaStrike4978 == null) {
                }
                polarVoyageAlarmManagerAlphaInferno3493 = polarVoyageLocationManagerMasterMegaStrike4978.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageAdapterNeoRogue5622 polarVoyageAdapterNeoRogue562222 = polarVoyageLocationManagerMasterMegaStrike4978.PolarVoyageItemDecorationUltraDeltaEpic7485;
                long PolarVoyageClipboardManagerAuroraPixel866622 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageClipboardManagerAuroraPixel8666(j);
                PolarVoyageOnLongClickListenerRogueDeltaNova6437 layoutDirection22 = polarVoyageSnackbarTitaniumSpectraPhoenix2541.PolarVoyageItemDecorationUltraDeltaEpic7485.getLayoutDirection();
                PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse957722 = polarVoyageAdapterNeoRogue562222.PolarVoyageZipVortexCelestial6185;
                PolarVoyageInputMethodManagerBetaShadowHyper4520 polarVoyageInputMethodManagerBetaShadowHyper4520522 = polarVoyageInputMethodManagerBetaShadowHyper4520;
                PolarVoyageOnLongClickListenerRogueDeltaNova6437 polarVoyageOnLongClickListenerRogueDeltaNova643722 = polarVoyageAdapterNeoRogue562222.PolarVoyageMotionLayoutTransitionHeroVision4068;
                PolarVoyageLocationManagerMasterMegaStrike4978 polarVoyageLocationManagerMasterMegaStrike4978222 = polarVoyageLocationManagerMasterMegaStrike4978;
                PolarVoyageCamera2DragonTitan3416 polarVoyageCamera2DragonTitan341622 = polarVoyageAdapterNeoRogue562222.PolarVoyageKotlinBetaPulseBeta3653;
                long j522 = polarVoyageAdapterNeoRogue562222.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                polarVoyageAdapterNeoRogue562222.PolarVoyageZipVortexCelestial6185 = polarVoyageSnackbarTitaniumSpectraPhoenix2541;
                polarVoyageAdapterNeoRogue562222.PolarVoyageMotionLayoutTransitionHeroVision4068 = layoutDirection22;
                polarVoyageAdapterNeoRogue562222.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageOnClickListenerRogueNovaXBeta4070;
                polarVoyageAdapterNeoRogue562222.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageClipboardManagerAuroraPixel866622;
                polarVoyageOnClickListenerRogueNovaXBeta4070.PolarVoyageRotateAnimationCyberCelestialDelta4768();
                PolarVoyageConstraintLayoutEliteLegendPulse7223.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageLocationManagerMasterMegaStrike4978222, PolarVoyageContentResolverRogueSpeed9469.PolarVoyageMotionLayoutTransitionHeroVision4068, 0L, PolarVoyageClipboardManagerAuroraPixel866622, 58);
                f = -f6;
                f2 = -f5;
                ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).PolarVoyageNavigationViewHyperHyperHyperion1793(f, f2);
                break;
            case 3:
                PolarVoyageContentResolverNovaPhantom9706 polarVoyageContentResolverNovaPhantom9706 = (PolarVoyageContentResolverNovaPhantom9706) this.PolarVoyageStrictModeLegendEpic1532;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    polarVoyageContentResolverNovaPhantom9706.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageAnimatorSetSparkUltraMax8233(new PolarVoyageInputFilterInfernoDragonNeo8310(th2));
                }
                if (polarVoyageContentResolverNovaPhantom9706.PolarVoyageContentProviderHyperSpark3838.PolarVoyageStrictModeLegendEpic1532 != PolarVoyageDelayNovaRogueBeta9839.PolarVoyageToolbarEclipseInfernoHero6368) {
                    ((PolarVoyageVectorDrawableSpectraCyber1757) polarVoyageContentResolverNovaPhantom9706.PolarVoyageContentProviderHyperSpark3838.getValue()).close();
                }
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            case 4:
                ((PolarVoyageGuidelineUltraElitePixel3662) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageAnimatorSetSparkUltraMax8233 = true;
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                PolarVoyageCoroutineBlazeVortex4945 polarVoyageCoroutineBlazeVortex4945 = (PolarVoyageCoroutineBlazeVortex4945) obj;
                return ((PolarVoyageSoundPoolNebulaSpark7637) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185(new PolarVoyageCoroutineBlazeVortex4945(null, polarVoyageCoroutineBlazeVortex4945.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageCoroutineBlazeVortex4945.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageCoroutineBlazeVortex4945.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageCoroutineBlazeVortex4945.PolarVoyageBitmapVisionAuroraPixel4705)).getValue();
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((PolarVoyageApplicationInfoHyperionHyperion6216) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageMotionLayoutTransitionHeroVision4068(((Integer) obj).intValue());
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                PolarVoyageActivityInfoMaxUltraShadow5908 polarVoyageActivityInfoMaxUltraShadow5908 = (PolarVoyageActivityInfoMaxUltraShadow5908) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageOnDeviceTranslatorCelestialInfernoStrike8023 polarVoyageOnDeviceTranslatorCelestialInfernoStrike8023 = (PolarVoyageOnDeviceTranslatorCelestialInfernoStrike8023) obj;
                polarVoyageOnDeviceTranslatorCelestialInfernoStrike8023.getClass();
                polarVoyageOnDeviceTranslatorCelestialInfernoStrike8023.PolarVoyageMotionLayoutForceEpicAurora7183(((Number) polarVoyageActivityInfoMaxUltraShadow5908.getValue()).floatValue());
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                ((PolarVoyageGyroscopeSolarThunderSpectra7559) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageTextInputEditTextNebulaHero6651(null);
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            case 9:
                PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega50052 = (PolarVoyageFragmentTransactionMaxMaxMega5005) this.PolarVoyageStrictModeLegendEpic1532;
                String str = (String) obj;
                str.getClass();
                Object obj2 = polarVoyageFragmentTransactionMaxMaxMega50052.PolarVoyageItemDecorationUltraDeltaEpic7485;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(str));
            case 10:
                Bundle bundle2 = (Bundle) obj;
                PolarVoyageMotionLayoutTransitionInfernoHyperion5474 PolarVoyageSnackbarGammaEclipse2140 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageSnackbarGammaEclipse2140((Context) this.PolarVoyageStrictModeLegendEpic1532);
                if (bundle2 != null) {
                    bundle2.setClassLoader(PolarVoyageSnackbarGammaEclipse2140.PolarVoyageZipVortexCelestial6185.getClassLoader());
                }
                PolarVoyageAnimatedVectorDrawableStrikeSpectra8987 polarVoyageAnimatedVectorDrawableStrikeSpectra8987 = PolarVoyageSnackbarGammaEclipse2140.PolarVoyageMotionLayoutTransitionHeroVision4068;
                LinkedHashMap linkedHashMap = polarVoyageAnimatedVectorDrawableStrikeSpectra8987.PolarVoyageCameraPixelBlaze2629;
                if (bundle2 != null) {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    polarVoyageAnimatedVectorDrawableStrikeSpectra8987.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = bundle;
                    polarVoyageAnimatedVectorDrawableStrikeSpectra8987.PolarVoyageBitmapVisionAuroraPixel4705 = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageBitmapVisionAuroraPixel4705(bundle2, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            polarVoyageAnimatedVectorDrawableStrikeSpectra8987.PolarVoyageViewRogueMaster4778.put(Integer.valueOf(intArray[i3]), !PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(stringArrayList.get(i4), "") ? stringArrayList.get(i4) : null);
                            i3++;
                            i4 = i5;
                        }
                    }
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                        int size = stringArrayList2.size();
                        int i6 = 0;
                        while (i6 < size) {
                            String str2 = stringArrayList2.get(i6);
                            i6++;
                            String str3 = str2;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str3)) {
                                ArrayList PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageBitmapVisionAuroraPixel4705(bundle2, "android-support-nav:controller:backStackStates:" + str3);
                                PolarVoyageMLKitNovaXNovaSpectra9261 polarVoyageMLKitNovaXNovaSpectra9261 = new PolarVoyageMLKitNovaXNovaSpectra9261(PolarVoyageBitmapVisionAuroraPixel4705.size());
                                int size2 = PolarVoyageBitmapVisionAuroraPixel4705.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    Object obj3 = PolarVoyageBitmapVisionAuroraPixel4705.get(i7);
                                    i7++;
                                    polarVoyageMLKitNovaXNovaSpectra9261.addLast(new PolarVoyageLintLegendShadow4212((Bundle) obj3));
                                }
                                linkedHashMap.put(str3, polarVoyageMLKitNovaXNovaSpectra9261);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z3 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean valueOf = (z3 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z3) : null;
                    PolarVoyageSnackbarGammaEclipse2140.PolarVoyageBitmapVisionAuroraPixel4705 = valueOf != null ? valueOf.booleanValue() : false;
                }
                return PolarVoyageSnackbarGammaEclipse2140;
            case 11:
                PolarVoyageWindowManagerSpectraSpark4068 polarVoyageWindowManagerSpectraSpark4068 = (PolarVoyageWindowManagerSpectraSpark4068) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyagePoseDetectionCelestialPhoenix4774 polarVoyagePoseDetectionCelestialPhoenix4774 = (PolarVoyagePoseDetectionCelestialPhoenix4774) obj;
                polarVoyagePoseDetectionCelestialPhoenix4774.getClass();
                PolarVoyageR8ShadowLegendSpectra1821 polarVoyageR8ShadowLegendSpectra1821 = polarVoyagePoseDetectionCelestialPhoenix4774.PolarVoyageSnackbarGammaEclipse2140;
                PolarVoyageCameraXCelestialNeoSolar7858 polarVoyageCameraXCelestialNeoSolar7858 = polarVoyagePoseDetectionCelestialPhoenix4774.PolarVoyageStrictModeLegendEpic1532;
                if (polarVoyageCameraXCelestialNeoSolar7858 == null) {
                    polarVoyageCameraXCelestialNeoSolar7858 = null;
                }
                if (polarVoyageCameraXCelestialNeoSolar7858 != null) {
                    polarVoyageR8ShadowLegendSpectra1821.PolarVoyageZipVortexCelestial6185();
                    PolarVoyageCameraXCelestialNeoSolar7858 PolarVoyageKotlinBetaPulseBeta36532 = polarVoyageWindowManagerSpectraSpark4068.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageCameraXCelestialNeoSolar7858);
                    if (PolarVoyageKotlinBetaPulseBeta36532 != null) {
                        return PolarVoyageKotlinBetaPulseBeta36532.equals(polarVoyageCameraXCelestialNeoSolar7858) ? polarVoyagePoseDetectionCelestialPhoenix4774 : polarVoyageWindowManagerSpectraSpark4068.PolarVoyageMotionLayoutTransitionHeroVision4068().PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageKotlinBetaPulseBeta36532, PolarVoyageKotlinBetaPulseBeta36532.PolarVoyageZipVortexCelestial6185(polarVoyageR8ShadowLegendSpectra1821.PolarVoyageZipVortexCelestial6185()));
                    }
                }
                return null;
            case 12:
                PolarContentScreen polarContentScreen = (PolarContentScreen) this.PolarVoyageStrictModeLegendEpic1532;
                int i8 = PolarContentScreen.PolarVoyageViewBindingPulseHeroSpeed5705;
                ((PolarVoyageRotateDrawableDragonMax8653) obj).getClass();
                PolarVoyageSharedFlowCosmosBeta6800 polarVoyageSharedFlowCosmosBeta6800 = polarContentScreen.PolarVoyageLifecycleOlympianOmega3762;
                if (polarVoyageSharedFlowCosmosBeta6800 == null) {
                    PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("g");
                    throw null;
                }
                ((PolarVoyageRewardedAdFusionAuroraLegend2061) polarVoyageSharedFlowCosmosBeta6800.PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532(100);
                PolarVoyageSharedFlowCosmosBeta6800 polarVoyageSharedFlowCosmosBeta68002 = polarContentScreen.PolarVoyageLifecycleOlympianOmega3762;
                if (polarVoyageSharedFlowCosmosBeta68002 == null) {
                    PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("g");
                    throw null;
                }
                PolarVoyageZoomStateAlphaVision6590 polarVoyageZoomStateAlphaVision6590 = polarVoyageSharedFlowCosmosBeta68002.PolarVoyageBottomSheetOmegaNeo1907;
                polarVoyageZoomStateAlphaVision6590.getClass();
                PolarVoyageFilterGammaStrikeNova8373 polarVoyageFilterGammaStrikeNova8373 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                FrameLayout frameLayout = (FrameLayout) ((PolarVoyageAdapterTitanSpark4027) ((PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273) polarVoyageZoomStateAlphaVision6590.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532;
                if (frameLayout == null) {
                    polarContentScreen.finish();
                } else {
                    WebView PolarVoyageZipVortexCelestial61853 = ((PolarVoyageVibratorForceHyperionPulse5900) polarVoyageZoomStateAlphaVision6590.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185();
                    if (PolarVoyageZipVortexCelestial61853 == null) {
                        polarContentScreen.finish();
                    } else if (PolarVoyageZipVortexCelestial61853.canGoBack()) {
                        PolarVoyageZipVortexCelestial61853.goBack();
                    } else if (frameLayout.getChildCount() <= 1) {
                        polarContentScreen.finish();
                    } else {
                        frameLayout.removeView(PolarVoyageZipVortexCelestial61853);
                        PolarVoyageZipVortexCelestial61853.destroy();
                    }
                }
                return polarVoyageFilterGammaStrikeNova8373;
            case 13:
                ((PolarVoyageTransitionSparkNova7579) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageCameraViewSpectraMaxSpectra2824(obj);
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            case 14:
                PolarVoyageSQLiteAuroraSolarSpark5167 polarVoyageSQLiteAuroraSolarSpark5167 = (PolarVoyageSQLiteAuroraSolarSpark5167) this.PolarVoyageStrictModeLegendEpic1532;
                Throwable th3 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th3);
                synchronized (polarVoyageSQLiteAuroraSolarSpark5167.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                    try {
                        PolarVoyageSoundPoolNebulaThunderVortex8476 polarVoyageSoundPoolNebulaThunderVortex8476 = polarVoyageSQLiteAuroraSolarSpark5167.PolarVoyageKotlinBetaPulseBeta3653;
                        if (polarVoyageSoundPoolNebulaThunderVortex8476 != null) {
                            PolarVoyagePlaceholderVortexBetaPulse5592 polarVoyagePlaceholderVortexBetaPulse5592 = polarVoyageSQLiteAuroraSolarSpark5167.PolarVoyageBitmapMaxTitanTitan7960;
                            PolarVoyageNavigationCosmosMasterGamma2168 polarVoyageNavigationCosmosMasterGamma2168 = PolarVoyageNavigationCosmosMasterGamma2168.PolarVoyageStrictModeLegendEpic1532;
                            polarVoyagePlaceholderVortexBetaPulse5592.getClass();
                            polarVoyagePlaceholderVortexBetaPulse5592.PolarVoyageStrictModeLegendEpic1532(null, polarVoyageNavigationCosmosMasterGamma2168);
                            polarVoyageSoundPoolNebulaThunderVortex8476.PolarVoyageBarcodeScannerInfernoSolarSpark7767(cancellationException);
                            polarVoyageSQLiteAuroraSolarSpark5167.PolarVoyageRemoteModelManagerOlympianCelestial9141 = null;
                            polarVoyageSoundPoolNebulaThunderVortex8476.PolarVoyageCameraPixelBlaze2629(new PolarVoyageVibratorMasterAlphaNova2131(18, polarVoyageSQLiteAuroraSolarSpark5167, th3));
                        } else {
                            polarVoyageSQLiteAuroraSolarSpark5167.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = cancellationException;
                            PolarVoyagePlaceholderVortexBetaPulse5592 polarVoyagePlaceholderVortexBetaPulse55922 = polarVoyageSQLiteAuroraSolarSpark5167.PolarVoyageBitmapMaxTitanTitan7960;
                            PolarVoyageNavigationCosmosMasterGamma2168 polarVoyageNavigationCosmosMasterGamma21682 = PolarVoyageNavigationCosmosMasterGamma2168.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            polarVoyagePlaceholderVortexBetaPulse55922.getClass();
                            polarVoyagePlaceholderVortexBetaPulse55922.PolarVoyageStrictModeLegendEpic1532(null, polarVoyageNavigationCosmosMasterGamma21682);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            case 15:
                PolarVoyageButtonStrikeDragon8051 polarVoyageButtonStrikeDragon8051 = ((PolarVoyageWithContextSparkOmega1976) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageKotlinBetaPulseBeta3653;
                return Boolean.valueOf(polarVoyageButtonStrikeDragon8051 != null ? polarVoyageButtonStrikeDragon8051.PolarVoyageKotlinBetaPulseBeta3653(obj) : true);
            case 16:
                PolarVoyageServiceNovaRogueFusion2269 polarVoyageServiceNovaRogueFusion2269 = (PolarVoyageServiceNovaRogueFusion2269) this.PolarVoyageStrictModeLegendEpic1532;
                float floatValue = ((Float) obj).floatValue();
                PolarVoyageRewardedAdFusionAuroraLegend2061 polarVoyageRewardedAdFusionAuroraLegend2061 = polarVoyageServiceNovaRogueFusion2269.PolarVoyageZipVortexCelestial6185;
                float PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageRewardedAdFusionAuroraLegend2061.PolarVoyageItemDecorationUltraDeltaEpic7485() + floatValue + polarVoyageServiceNovaRogueFusion2269.PolarVoyageBitmapVisionAuroraPixel4705;
                float PolarVoyageAlertDialogCyberHeroQuantum3938 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageAlertDialogCyberHeroQuantum3938(PolarVoyageItemDecorationUltraDeltaEpic7485, 0.0f, polarVoyageServiceNovaRogueFusion2269.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485());
                boolean z4 = PolarVoyageItemDecorationUltraDeltaEpic7485 == PolarVoyageAlertDialogCyberHeroQuantum3938;
                float PolarVoyageItemDecorationUltraDeltaEpic74852 = PolarVoyageAlertDialogCyberHeroQuantum3938 - polarVoyageRewardedAdFusionAuroraLegend2061.PolarVoyageItemDecorationUltraDeltaEpic7485();
                int round = Math.round(PolarVoyageItemDecorationUltraDeltaEpic74852);
                polarVoyageRewardedAdFusionAuroraLegend2061.PolarVoyageStrictModeLegendEpic1532(polarVoyageRewardedAdFusionAuroraLegend2061.PolarVoyageItemDecorationUltraDeltaEpic7485() + round);
                polarVoyageServiceNovaRogueFusion2269.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageItemDecorationUltraDeltaEpic74852 - round;
                if (!z4) {
                    floatValue = PolarVoyageItemDecorationUltraDeltaEpic74852;
                }
                return Float.valueOf(floatValue);
            case 17:
                PolarVoyageGestureDetectorDragonThunderNova3105 polarVoyageGestureDetectorDragonThunderNova3105 = ((PolarVoyageChipGroupQuantumHyperMega7595) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageConfigurationMaxSpectraForce5418;
                polarVoyageGestureDetectorDragonThunderNova3105.PolarVoyagePackageManagerCelestialPhoenix8393 = (PolarVoyageBitmapGammaRogue1691) obj;
                if (polarVoyageGestureDetectorDragonThunderNova3105.PolarVoyageActivityInfoBetaQuantum8726 && (PolarVoyageRoomStormMaster7636 = polarVoyageGestureDetectorDragonThunderNova3105.PolarVoyageRoomStormMaster7636()) != null && !polarVoyageGestureDetectorDragonThunderNova3105.PolarVoyageIntentNovaTitanium7230(PolarVoyageRoomStormMaster7636, polarVoyageGestureDetectorDragonThunderNova3105.PolarVoyageLifecycleOlympianOmega3762)) {
                    polarVoyageGestureDetectorDragonThunderNova3105.PolarVoyageLooperThreadAlphaPrime1279 = true;
                    polarVoyageGestureDetectorDragonThunderNova3105.PolarVoyageSharedFlowRogueDeltaForce1577();
                }
                polarVoyageGestureDetectorDragonThunderNova3105.PolarVoyageActivityInfoBetaQuantum8726 = false;
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            case 18:
                PolarVoyageBarrierMasterSpectraSolar1040 polarVoyageBarrierMasterSpectraSolar1040 = (PolarVoyageBarrierMasterSpectraSolar1040) this.PolarVoyageStrictModeLegendEpic1532;
                return new PolarVoyageJobSchedulerGammaMaster7383(polarVoyageBarrierMasterSpectraSolar1040.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageBarrierMasterSpectraSolar1040.PolarVoyageBottomSheetOmegaNeo1907, ((PolarVoyageJobSchedulerGammaMaster7383) obj).PolarVoyageZipVortexCelestial6185, polarVoyageBarrierMasterSpectraSolar1040.PolarVoyageRotateAnimationCyberCelestialDelta4768));
            case 19:
                PolarVoyageObserverInfernoCosmosPhoenix9860 polarVoyageObserverInfernoCosmosPhoenix9860 = (PolarVoyageObserverInfernoCosmosPhoenix9860) this.PolarVoyageStrictModeLegendEpic1532;
                obj.getClass();
                return polarVoyageObserverInfernoCosmosPhoenix9860.PolarVoyageMotionLayoutTransitionHeroVision4068();
            case 20:
                PolarVoyageResourcesBetaPhoenix8681 polarVoyageResourcesBetaPhoenix8681 = (PolarVoyageResourcesBetaPhoenix8681) this.PolarVoyageStrictModeLegendEpic1532;
                if (obj instanceof PolarVoyageShapeDrawableHeroLegend4540) {
                    ((PolarVoyageShapeDrawableHeroLegend4540) obj).PolarVoyageTextInputEditTextNebulaHero6651(4);
                }
                polarVoyageResourcesBetaPhoenix8681.PolarVoyageZipVortexCelestial6185(obj);
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            case 21:
                PolarVoyageFirebaseModelDownloadConditionsStormPhantomPhoenix3546 polarVoyageFirebaseModelDownloadConditionsStormPhantomPhoenix3546 = (PolarVoyageFirebaseModelDownloadConditionsStormPhantomPhoenix3546) this.PolarVoyageStrictModeLegendEpic1532;
                synchronized (polarVoyageFirebaseModelDownloadConditionsStormPhantomPhoenix3546.PolarVoyageTextInputEditTextNebulaHero6651) {
                    PolarVoyageFlowUltraSpeed9924 polarVoyageFlowUltraSpeed9924 = polarVoyageFirebaseModelDownloadConditionsStormPhantomPhoenix3546.PolarVoyageStrictModeLegendEpic1532;
                    polarVoyageFlowUltraSpeed9924.getClass();
                    Object obj4 = polarVoyageFlowUltraSpeed9924.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    obj4.getClass();
                    int i9 = polarVoyageFlowUltraSpeed9924.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    PolarVoyageFaceDetectionEliteBlazeInferno3165 polarVoyageFaceDetectionEliteBlazeInferno3165 = polarVoyageFlowUltraSpeed9924.PolarVoyageKotlinBetaPulseBeta3653;
                    if (polarVoyageFaceDetectionEliteBlazeInferno3165 == null) {
                        polarVoyageFaceDetectionEliteBlazeInferno3165 = new PolarVoyageFaceDetectionEliteBlazeInferno3165();
                        polarVoyageFlowUltraSpeed9924.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageFaceDetectionEliteBlazeInferno3165;
                        polarVoyageFlowUltraSpeed9924.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageCameraPixelBlaze2629(obj4, polarVoyageFaceDetectionEliteBlazeInferno3165);
                    }
                    polarVoyageFlowUltraSpeed9924.PolarVoyageKotlinBetaPulseBeta3653(obj, i9, obj4, polarVoyageFaceDetectionEliteBlazeInferno3165);
                }
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            case 22:
                PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = (PolarVoyageResourcesCelestialInferno9280) this.PolarVoyageStrictModeLegendEpic1532;
                ((Boolean) obj).getClass();
                ((PolarVoyageFragmentPulseEliteDragon8768) polarVoyageResourcesCelestialInferno9280.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageMotionLayoutTransitionHeroVision4068();
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            case 23:
                PolarVoyageWindowManagerEclipseDragon5224 polarVoyageWindowManagerEclipseDragon5224 = (PolarVoyageWindowManagerEclipseDragon5224) this.PolarVoyageStrictModeLegendEpic1532;
                Context context = (Context) obj;
                context.getClass();
                FrameLayout frameLayout2 = new FrameLayout(context);
                WebView webView = new WebView(context);
                frameLayout2.addView(webView, new FrameLayout.LayoutParams(-1, -1));
                PolarContentScreen polarContentScreen2 = polarVoyageWindowManagerEclipseDragon5224.PolarVoyageZipVortexCelestial6185;
                int i10 = PolarContentScreen.PolarVoyageViewBindingPulseHeroSpeed5705;
                PolarVoyageSharedFlowCosmosBeta6800 polarVoyageSharedFlowCosmosBeta68003 = polarContentScreen2.PolarVoyageLifecycleOlympianOmega3762;
                if (polarVoyageSharedFlowCosmosBeta68003 == null) {
                    PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("g");
                    throw null;
                }
                PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = polarVoyageSharedFlowCosmosBeta68003.PolarVoyageDiffUtilTurboStrike5735;
                polarVoyageAdapterTitanSpark4027.getClass();
                polarVoyageAdapterTitanSpark4027.PolarVoyageStrictModeLegendEpic1532 = frameLayout2;
                PolarVoyageSharedFlowCosmosBeta6800 polarVoyageSharedFlowCosmosBeta68004 = polarContentScreen2.PolarVoyageLifecycleOlympianOmega3762;
                if (polarVoyageSharedFlowCosmosBeta68004 == null) {
                    PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("g");
                    throw null;
                }
                PolarVoyageLicensingBetaTitaniumMaster3752 polarVoyageLicensingBetaTitaniumMaster3752 = polarVoyageSharedFlowCosmosBeta68004.PolarVoyageContentProviderHyperSpark3838;
                PolarVoyageLicensingBetaTitaniumMaster3752 polarVoyageLicensingBetaTitaniumMaster37522 = polarVoyageSharedFlowCosmosBeta68004.PolarVoyageTextInputEditTextNebulaHero6651;
                PolarVoyageVibratorForceHyperionPulse5900 polarVoyageVibratorForceHyperionPulse5900 = polarVoyageSharedFlowCosmosBeta68004.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageVibratorForceHyperionPulse5900 polarVoyageVibratorForceHyperionPulse59002 = polarVoyageSharedFlowCosmosBeta68004.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageZoomStateAlphaVision6590 polarVoyageZoomStateAlphaVision65902 = polarVoyageSharedFlowCosmosBeta68004.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageDelayNovaRogueBeta9839 polarVoyageDelayNovaRogueBeta9839 = polarVoyageSharedFlowCosmosBeta68004.PolarVoyageViewRogueMaster4778;
                PolarVoyageWithContextGammaMaster7108 polarVoyageWithContextGammaMaster7108 = polarVoyageSharedFlowCosmosBeta68004.PolarVoyageCameraPixelBlaze2629;
                PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark40272 = polarVoyageSharedFlowCosmosBeta68004.PolarVoyageZipVortexCelestial6185;
                PolarVoyageMagnetometerMasterTurbo6314 polarVoyageMagnetometerMasterTurbo6314 = polarContentScreen2.PolarVoyageDiffUtilDragonSpeedEclipse6225;
                PolarVoyageMagnetometerMasterTurbo6314 polarVoyageMagnetometerMasterTurbo63142 = polarContentScreen2.PolarVoyageFCMCelestialCosmosPixel3711;
                PolarVoyageContextVisionMega3784 polarVoyageContextVisionMega3784 = polarVoyageSharedFlowCosmosBeta68004.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                PolarVoyageContextVisionMega3784 polarVoyageContextVisionMega37842 = polarVoyageSharedFlowCosmosBeta68004.PolarVoyageBitmapVisionAuroraPixel4705;
                polarVoyageLicensingBetaTitaniumMaster3752.getClass();
                polarVoyageLicensingBetaTitaniumMaster37522.getClass();
                polarVoyageVibratorForceHyperionPulse5900.getClass();
                polarVoyageVibratorForceHyperionPulse59002.getClass();
                polarVoyageZoomStateAlphaVision65902.getClass();
                polarVoyageDelayNovaRogueBeta9839.getClass();
                polarVoyageWithContextGammaMaster7108.getClass();
                polarVoyageAdapterTitanSpark40272.getClass();
                polarVoyageMagnetometerMasterTurbo6314.getClass();
                polarVoyageMagnetometerMasterTurbo63142.getClass();
                polarVoyageContextVisionMega3784.getClass();
                polarVoyageContextVisionMega37842.getClass();
                polarVoyageLicensingBetaTitaniumMaster3752.PolarVoyageZipVortexCelestial6185.PolarVoyageItemDecorationUltraDeltaEpic7485(webView);
                webView.setVisibility(4);
                webView.setWebViewClient(new PolarVoyageBitmapSparkEclipse8909(polarVoyageZoomStateAlphaVision65902));
                webView.setWebChromeClient(new PolarVoyageGestureDetectorTurboHeroRogue2241(polarContentScreen2, polarVoyageAdapterTitanSpark40272, polarVoyageLicensingBetaTitaniumMaster37522, polarVoyageVibratorForceHyperionPulse5900, polarVoyageZoomStateAlphaVision65902, polarVoyageDelayNovaRogueBeta9839, polarVoyageWithContextGammaMaster7108, polarVoyageVibratorForceHyperionPulse59002, polarVoyageMagnetometerMasterTurbo6314, polarVoyageMagnetometerMasterTurbo63142, polarVoyageContextVisionMega3784, polarVoyageContextVisionMega37842));
                PolarVoyageSharedFlowCosmosBeta6800 polarVoyageSharedFlowCosmosBeta68005 = polarContentScreen2.PolarVoyageLifecycleOlympianOmega3762;
                if (polarVoyageSharedFlowCosmosBeta68005 == null) {
                    PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("g");
                    throw null;
                }
                if (!polarVoyageSharedFlowCosmosBeta68005.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageAlertDialogNovaXCelestial4954()) {
                    PolarVoyageSharedFlowCosmosBeta6800 polarVoyageSharedFlowCosmosBeta68006 = polarContentScreen2.PolarVoyageLifecycleOlympianOmega3762;
                    if (polarVoyageSharedFlowCosmosBeta68006 == null) {
                        PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("g");
                        throw null;
                    }
                    polarVoyageSharedFlowCosmosBeta68006.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageKeyframeEpicNovaXCyber9821(webView);
                }
                return frameLayout2;
            default:
                PolarVoyageFragmentFusionOlympian8203 polarVoyageFragmentFusionOlympian8203 = (PolarVoyageFragmentFusionOlympian8203) obj;
                ((PolarVoyageObjectDetectionThunderHyperInferno3620) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageDiffUtilTurboStrike5735(polarVoyageFragmentFusionOlympian8203.PolarVoyageBitmapVisionAuroraPixel4705.getValue(), ((PolarVoyageStateFlowNebulaMax1492) PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageCameraPixelBlaze2629.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185(polarVoyageFragmentFusionOlympian8203.PolarVoyageDiffUtilTurboStrike5735));
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
        }
    }

    public /* synthetic */ PolarVoyageCanvasCyberNovaElite7830(int i, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }
}
