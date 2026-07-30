package p000createpolar;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMediaPlayerDeltaQuantumHyper7669 {
    public static final AtomicInteger PolarVoyageKotlinHeroHyper4083 = new AtomicInteger();
    public long PolarVoyageActivityInfoBetaQuantum8726;
    public ByteBuffer PolarVoyageAlarmManagerShadowHyperBeta8339;
    public PolarVoyageTransitionBlazePixel9380 PolarVoyageAlertDialogCyberHeroQuantum3938;
    public PolarVoyageExoPlayerCelestialForceSpectra7724 PolarVoyageAlertDialogNovaXCelestial4954;
    public PolarVoyageBarrierFusionMax3569 PolarVoyageAnimatorSetSparkUltraMax8233;
    public final PolarVoyageAssetManagerAlphaPhoenix8887 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public PolarVoyageViewAuroraQuantum6418 PolarVoyageBitmapMaxTitanTitan7960;
    public final PolarVoyagePaintFlagsDrawFilterLegendUltraAlpha5061 PolarVoyageBitmapVisionAuroraPixel4705;
    public final PolarVoyageFaceDetectionVisionForceTurbo5989 PolarVoyageBottomSheetOmegaNeo1907;
    public PolarVoyageClipboardManagerUltraRogue9881 PolarVoyageCameraPixelBlaze2629;
    public boolean PolarVoyageCameraViewSpectraMaxSpectra2824;
    public boolean PolarVoyageCanvasElitePhoenix4750;
    public long PolarVoyageCardViewAlphaVortexCelestial9747;
    public long PolarVoyageClipboardManagerAuroraPixel8666;
    public AudioDeviceInfo PolarVoyageColorStateListEliteStrikeOlympian8131;
    public boolean PolarVoyageConfigurationMaxSpectraForce5418;
    public PolarVoyageFontFamilyAuroraGammaRogue1296 PolarVoyageContentProviderHyperSpark3838;
    public int PolarVoyageDatabaseCosmosSpectraSolar3905;
    public int PolarVoyageDiffUtilDragonSpeedEclipse6225;
    public final PolarVoyageBroadcastReceiverStrikeCyberShadow5969 PolarVoyageDiffUtilTurboStrike5735;
    public long PolarVoyageDisplayMetricsForceEclipseVision4728;
    public PolarVoyageOnTouchListenerInfernoShadow9357 PolarVoyageDisplayMetricsVortexDragon9516;
    public PolarVoyageAdapterTitanSpark4027 PolarVoyageDrawableDeltaHyperion5742;
    public boolean PolarVoyageFCMCelestialCosmosPixel3711;
    public ByteBuffer PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
    public float PolarVoyageFlingGestureEclipsePrimeMax1376;
    public boolean PolarVoyageGuidelineStormSolar2850;
    public boolean PolarVoyageHandlerThreadMaxAurora5064;
    public final ArrayDeque PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageKeyframeEpicNovaXCyber9821;
    public final PolarVoyageColorDrawableSolarAlphaPixel2505 PolarVoyageKotlinBetaPulseBeta3653;
    public PolarVoyageBarcodeScannerDragonCelestialPhoenix1879 PolarVoyageLayerDrawableShadowTitaniumOmega1942;
    public boolean PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
    public long PolarVoyageLifecycleOlympianOmega3762;
    public long PolarVoyageLooperThreadAlphaPrime1279;
    public Handler PolarVoyageMapTurboRogueTitan9291;
    public PolarVoyageBarcodeScannerDragonCelestialPhoenix1879 PolarVoyageMotionLayoutForceEpicAurora7183;
    public final PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public boolean PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587;
    public boolean PolarVoyageMotionSceneStormSolarBeta2208;
    public PolarVoyageAnnotationProcessorPixelRogueSpectra9718 PolarVoyageNavigationViewHyperHyperHyperion1793;
    public boolean PolarVoyageOnPreDrawListenerNovaCelestialDragon7415;
    public long PolarVoyagePackageManagerCelestialPhoenix8393;
    public boolean PolarVoyagePoseDetectionCosmosVision6217;
    public long PolarVoyageProcessCameraProviderQuantumCosmosPulse5576;
    public PolarVoyagePreviewUltraBeta9531 PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public PolarVoyageContentProviderVisionMasterTitan6027 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public PolarVoyageFontFamilyAuroraGammaRogue1296 PolarVoyageSnackbarGammaEclipse2140;
    public int PolarVoyageStrictModeLegendEpic1532;
    public final PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 PolarVoyageTextInputEditTextNebulaHero6651;
    public int PolarVoyageToolbarEclipseInfernoHero6368;
    public boolean PolarVoyageViewBindingPulseHeroSpeed5705;
    public final PolarVoyageFaceDetectionVisionForceTurbo5989 PolarVoyageViewRogueMaster4778;
    public final Context PolarVoyageZipVortexCelestial6185;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0080, code lost:
    
        r9 = r0.getDeviceId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageMediaPlayerDeltaQuantumHyper7669(PolarVoyageOnItemClickListenerMasterDragonMax6359 polarVoyageOnItemClickListenerMasterDragonMax6359) {
        int deviceId;
        Context context = (Context) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageZipVortexCelestial6185 = context.getApplicationContext();
        this.PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageOnTouchListenerInfernoShadow9357.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = (PolarVoyageAlarmManagerAlphaInferno3493) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        this.PolarVoyageStrictModeLegendEpic1532 = 0;
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = (PolarVoyageAnnotationProcessorPixelRogueSpectra9718) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageViewRogueMaster4778;
        PolarVoyageColorDrawableSolarAlphaPixel2505 polarVoyageColorDrawableSolarAlphaPixel2505 = new PolarVoyageColorDrawableSolarAlphaPixel2505();
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageColorDrawableSolarAlphaPixel2505;
        PolarVoyageAssetManagerAlphaPhoenix8887 polarVoyageAssetManagerAlphaPhoenix8887 = new PolarVoyageAssetManagerAlphaPhoenix8887();
        polarVoyageAssetManagerAlphaPhoenix8887.PolarVoyageCameraPixelBlaze2629 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageAssetManagerAlphaPhoenix8887;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = new PolarVoyagePaintFlagsDrawFilterLegendUltraAlpha5061();
        this.PolarVoyageDiffUtilTurboStrike5735 = new PolarVoyageBroadcastReceiverStrikeCyberShadow5969();
        this.PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageContentProviderHyperSpark3838(polarVoyageAssetManagerAlphaPhoenix8887, polarVoyageColorDrawableSolarAlphaPixel2505);
        this.PolarVoyageFlingGestureEclipsePrimeMax1376 = 1.0f;
        this.PolarVoyageDatabaseCosmosSpectraSolar3905 = 0;
        this.PolarVoyageAlertDialogNovaXCelestial4954 = new PolarVoyageExoPlayerCelestialForceSpectra7724();
        PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel9380 = PolarVoyageTransitionBlazePixel9380.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        this.PolarVoyageMotionLayoutForceEpicAurora7183 = new PolarVoyageBarcodeScannerDragonCelestialPhoenix1879(polarVoyageTransitionBlazePixel9380, 0L, 0L);
        this.PolarVoyageAlertDialogCyberHeroQuantum3938 = polarVoyageTransitionBlazePixel9380;
        this.PolarVoyageCameraViewSpectraMaxSpectra2824 = false;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new ArrayDeque();
        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageFaceDetectionVisionForceTurbo5989();
        this.PolarVoyageViewRogueMaster4778 = new PolarVoyageFaceDetectionVisionForceTurbo5989();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && deviceId != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.PolarVoyageKeyframeEpicNovaXCyber9821 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int PolarVoyageStrictModeLegendEpic1532(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageFCMCelestialCosmosPixel3711(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                    int i14 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i14 = Integer.reverseBytes(i14);
                    }
                    if ((i14 & (-2097152)) == -2097152 && (i6 = (i14 >>> 19) & 3) != 1 && (i7 = (i14 >>> 17) & 3) != 0) {
                        int i15 = (i14 >>> 12) & 15;
                        int i16 = (i14 >>> 10) & 3;
                        if (i15 != 0 && i15 != 15 && i16 != 3) {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                            if (i5 == -1) {
                                return i5;
                            }
                            PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
                            return 0;
                        }
                    }
                    i5 = -1;
                    if (i5 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i17 = position2;
                            while (true) {
                                if (i17 <= limit) {
                                    String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                                    int i18 = byteBuffer.getInt(i17 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i18 = Integer.reverseBytes(i18);
                                    }
                                    if ((i18 & (-2)) == -126718022) {
                                        i8 = i17 - position2;
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageCanvasElitePhoenix4750(new PolarVoyageAuthVortexNebulaNeo9087(bArr, 16)).PolarVoyageKotlinBetaPulseBeta3653;
                        case 18:
                            break;
                        default:
                            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Unexpected audio encoding: ", i));
                            return 0;
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return PolarVoyageTransformNeoTitanium1654.PolarVoyageZipVortexCelestial6185[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position4 = byteBuffer.position();
        byte b5 = byteBuffer.get(position4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b2 = byteBuffer.get(position4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(position4 + 4) & 1) << 6;
                b = byteBuffer.get(position4 + 5);
            } else {
                i3 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b2 = byteBuffer.get(position4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(position4 + 5) & 1) << 6;
        b = byteBuffer.get(position4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    public final void PolarVoyageAnimatorSetSparkUltraMax8233() {
        PolarVoyageDiffUtilTurboStrike5735();
        PolarVoyageTextRecognitionPrimeVortexHero1477 listIterator = this.PolarVoyageTextInputEditTextNebulaHero6651.listIterator(0);
        while (listIterator.hasNext()) {
            ((PolarVoyageLiveDataQuantumSpeedNovaX2823) listIterator.next()).reset();
        }
        this.PolarVoyageBitmapVisionAuroraPixel4705.reset();
        this.PolarVoyageDiffUtilTurboStrike5735.reset();
        PolarVoyagePreviewUltraBeta9531 polarVoyagePreviewUltraBeta9531 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (polarVoyagePreviewUltraBeta9531 != null) {
            PolarVoyageDialogPhantomEliteAurora3058 polarVoyageDialogPhantomEliteAurora3058 = polarVoyagePreviewUltraBeta9531.PolarVoyageZipVortexCelestial6185;
            for (int i = 0; i < polarVoyageDialogPhantomEliteAurora3058.size(); i++) {
                PolarVoyageLiveDataQuantumSpeedNovaX2823 polarVoyageLiveDataQuantumSpeedNovaX2823 = (PolarVoyageLiveDataQuantumSpeedNovaX2823) polarVoyageDialogPhantomEliteAurora3058.get(i);
                polarVoyageLiveDataQuantumSpeedNovaX2823.PolarVoyageStrictModeLegendEpic1532(PolarVoyageFlipAnimationTurboTurboOlympian7782.PolarVoyageMotionLayoutTransitionHeroVision4068);
                polarVoyageLiveDataQuantumSpeedNovaX2823.reset();
            }
            polarVoyagePreviewUltraBeta9531.PolarVoyageMotionLayoutTransitionHeroVision4068.clear();
            polarVoyagePreviewUltraBeta9531.PolarVoyageKotlinBetaPulseBeta3653 = new ByteBuffer[0];
            PolarVoyageFocusMeteringActionCelestialStrikeMax1103 polarVoyageFocusMeteringActionCelestialStrikeMax1103 = PolarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageBitmapVisionAuroraPixel4705;
            polarVoyagePreviewUltraBeta9531.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = false;
        }
        this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = false;
        this.PolarVoyageHandlerThreadMaxAurora5064 = false;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j) {
        PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027;
        PolarVoyageConstraintLayoutSpectraElite2658 polarVoyageConstraintLayoutSpectraElite2658;
        if (this.PolarVoyageAlarmManagerShadowHyperBeta8339 == null) {
            return;
        }
        PolarVoyageFaceDetectionVisionForceTurbo5989 polarVoyageFaceDetectionVisionForceTurbo5989 = this.PolarVoyageViewRogueMaster4778;
        if (polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageZipVortexCelestial6185 != null && (PolarVoyageKotlinHeroHyper4083.get() > 0 || SystemClock.elapsedRealtime() < polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageKotlinBetaPulseBeta3653)) {
            return;
        }
        int remaining = this.PolarVoyageAlarmManagerShadowHyperBeta8339.remaining();
        try {
            boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767 = this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageBarcodeScannerInfernoSolarSpark7767(this.PolarVoyageToolbarEclipseInfernoHero6368, j, this.PolarVoyageAlarmManagerShadowHyperBeta8339);
            this.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576 = SystemClock.elapsedRealtime();
            polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageZipVortexCelestial6185 = null;
            polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageMotionLayoutTransitionHeroVision4068 = -9223372036854775807L;
            polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageKotlinBetaPulseBeta3653 = -9223372036854775807L;
            if (this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageKotlinBetaPulseBeta3653()) {
                if (this.PolarVoyageLifecycleOlympianOmega3762 > 0) {
                    this.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415 = false;
                }
                if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 && (polarVoyageAdapterTitanSpark4027 = this.PolarVoyageDrawableDeltaHyperion5742) != null && !PolarVoyageBarcodeScannerInfernoSolarSpark7767 && !this.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415 && (polarVoyageConstraintLayoutSpectraElite2658 = ((PolarVoyageLifecycleTitaniumHyper4694) polarVoyageAdapterTitanSpark4027.PolarVoyageStrictModeLegendEpic1532).PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587) != null) {
                    polarVoyageConstraintLayoutSpectraElite2658.PolarVoyageZipVortexCelestial6185.PolarVoyageDisplayMetricsForceEclipseVision4728 = true;
                }
            }
            if (PolarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageZipVortexCelestial6185(this.PolarVoyageContentProviderHyperSpark3838)) {
                this.PolarVoyageActivityInfoBetaQuantum8726 += remaining - this.PolarVoyageAlarmManagerShadowHyperBeta8339.remaining();
            }
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                if (!PolarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageZipVortexCelestial6185(this.PolarVoyageContentProviderHyperSpark3838)) {
                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(this.PolarVoyageAlarmManagerShadowHyperBeta8339 == this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149);
                    this.PolarVoyageLifecycleOlympianOmega3762 = (this.PolarVoyageDiffUtilDragonSpeedEclipse6225 * this.PolarVoyageToolbarEclipseInfernoHero6368) + this.PolarVoyageLifecycleOlympianOmega3762;
                }
                this.PolarVoyageAlarmManagerShadowHyperBeta8339 = null;
            }
        } catch (PolarVoyageViewBindingGammaMega5197 e) {
            boolean z = e.PolarVoyageStrictModeLegendEpic1532;
            if (z) {
                if (PolarVoyageRotateAnimationCyberCelestialDelta4768() <= 0) {
                    if (this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageKotlinBetaPulseBeta3653()) {
                        if (this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageBitmapVisionAuroraPixel4705) {
                            this.PolarVoyageHandlerThreadMaxAurora5064 = true;
                        }
                    }
                }
                r4 = true;
            }
            PolarVoyageLocationListenerNebulaEclipseDelta5052 polarVoyageLocationListenerNebulaEclipseDelta5052 = new PolarVoyageLocationListenerNebulaEclipseDelta5052(e.PolarVoyageItemDecorationUltraDeltaEpic7485, this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185, r4);
            PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark40272 = this.PolarVoyageDrawableDeltaHyperion5742;
            if (polarVoyageAdapterTitanSpark40272 != null) {
                polarVoyageAdapterTitanSpark40272.PolarVoyageActivityInfoBetaQuantum8726(polarVoyageLocationListenerNebulaEclipseDelta5052);
            }
            if (z) {
                throw polarVoyageLocationListenerNebulaEclipseDelta5052;
            }
            polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageZipVortexCelestial6185(polarVoyageLocationListenerNebulaEclipseDelta5052);
        }
    }

    public final void PolarVoyageBitmapMaxTitanTitan7960() {
        if (PolarVoyageDrawableDeltaHyperion5742()) {
            PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum6418 = this.PolarVoyageBitmapMaxTitanTitan7960;
            PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel9380 = this.PolarVoyageAlertDialogCyberHeroQuantum3938;
            AudioTrack audioTrack = polarVoyageViewAuroraQuantum6418.PolarVoyageZipVortexCelestial6185;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageDiffUtilTurboStrike5735(polarVoyageTransitionBlazePixel9380.PolarVoyageZipVortexCelestial6185, 0.1f, polarVoyageViewAuroraQuantum6418.PolarVoyageKotlinBetaPulseBeta3653)).setPitch(PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageDiffUtilTurboStrike5735(polarVoyageTransitionBlazePixel9380.PolarVoyageMotionLayoutTransitionHeroVision4068, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDelayCyberQuantumEclipse8687("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            PolarVoyageEventBlazeDelta6688 polarVoyageEventBlazeDelta6688 = polarVoyageViewAuroraQuantum6418.PolarVoyageDiffUtilTurboStrike5735;
            polarVoyageEventBlazeDelta6688.PolarVoyageStrictModeLegendEpic1532 = audioTrack.getPlaybackParams().getSpeed();
            polarVoyageEventBlazeDelta6688.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185(0);
            polarVoyageEventBlazeDelta6688.PolarVoyageBottomSheetOmegaNeo1907 = 0L;
            polarVoyageEventBlazeDelta6688.PolarVoyageBitmapMaxTitanTitan7960 = 0;
            polarVoyageEventBlazeDelta6688.PolarVoyageAnimatorSetSparkUltraMax8233 = 0;
            polarVoyageEventBlazeDelta6688.PolarVoyageViewRogueMaster4778 = 0L;
            polarVoyageEventBlazeDelta6688.PolarVoyageCameraViewSpectraMaxSpectra2824 = -9223372036854775807L;
            polarVoyageEventBlazeDelta6688.PolarVoyagePackageManagerCelestialPhoenix8393 = -9223372036854775807L;
            PlaybackParams playbackParams = this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageZipVortexCelestial6185.getPlaybackParams();
            this.PolarVoyageAlertDialogCyberHeroQuantum3938 = new PolarVoyageTransitionBlazePixel9380(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageBitmapVisionAuroraPixel4705() {
        ByteBuffer byteBuffer;
        if (!this.PolarVoyageRemoteModelManagerOlympianCelestial9141.PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
            PolarVoyageBarcodeScannerInfernoSolarSpark7767(Long.MIN_VALUE);
            return this.PolarVoyageAlarmManagerShadowHyperBeta8339 == null;
        }
        PolarVoyagePreviewUltraBeta9531 polarVoyagePreviewUltraBeta9531 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (polarVoyagePreviewUltraBeta9531.PolarVoyageBarcodeScannerInfernoSolarSpark7767() && !polarVoyagePreviewUltraBeta9531.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            polarVoyagePreviewUltraBeta9531.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = true;
            ((PolarVoyageLiveDataQuantumSpeedNovaX2823) polarVoyagePreviewUltraBeta9531.PolarVoyageMotionLayoutTransitionHeroVision4068.get(0)).PolarVoyageDiffUtilTurboStrike5735();
        }
        PolarVoyageRemoteModelManagerOlympianCelestial9141(Long.MIN_VALUE);
        if (!this.PolarVoyageRemoteModelManagerOlympianCelestial9141.PolarVoyageKotlinBetaPulseBeta3653() || ((byteBuffer = this.PolarVoyageAlarmManagerShadowHyperBeta8339) != null && byteBuffer.hasRemaining())) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00aa, code lost:
    
        if (PolarVoyageCameraPixelBlaze2629() == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0117, code lost:
    
        if (r5 == 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageBottomSheetOmegaNeo1907(int i, long j, ByteBuffer byteBuffer) {
        long j2;
        long j3;
        long j4;
        ByteBuffer byteBuffer2 = this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.PolarVoyageSnackbarGammaEclipse2140 != null) {
            if (PolarVoyageBitmapVisionAuroraPixel4705()) {
                if (this.PolarVoyageBitmapMaxTitanTitan7960 != null) {
                    PolarVoyageAlarmManagerDeltaEliteOlympian3995 polarVoyageAlarmManagerDeltaEliteOlympian3995 = this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705;
                    PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    if (!this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageBitmapVisionAuroraPixel4705.equals(polarVoyageAlarmManagerDeltaEliteOlympian3995)) {
                        PolarVoyageContentProviderHyperSpark3838();
                        if (!PolarVoyageViewRogueMaster4778()) {
                            PolarVoyageDiffUtilTurboStrike5735();
                            PolarVoyageZipVortexCelestial6185(j);
                        }
                    }
                }
                this.PolarVoyageContentProviderHyperSpark3838 = this.PolarVoyageSnackbarGammaEclipse2140;
                this.PolarVoyageSnackbarGammaEclipse2140 = null;
                PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum6418 = this.PolarVoyageBitmapMaxTitanTitan7960;
                if (polarVoyageViewAuroraQuantum6418 != null && polarVoyageViewAuroraQuantum6418.PolarVoyageKotlinBetaPulseBeta3653() && this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageBottomSheetOmegaNeo1907) {
                    PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum64182 = this.PolarVoyageBitmapMaxTitanTitan7960;
                    AudioTrack audioTrack = polarVoyageViewAuroraQuantum64182.PolarVoyageZipVortexCelestial6185;
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 29 && audioTrack.getPlayState() == 3) {
                        audioTrack.setOffloadEndOfStream();
                        PolarVoyageEventBlazeDelta6688 polarVoyageEventBlazeDelta6688 = polarVoyageViewAuroraQuantum64182.PolarVoyageDiffUtilTurboStrike5735;
                        polarVoyageEventBlazeDelta6688.PolarVoyageLooperThreadAlphaPrime1279 = true;
                        polarVoyageEventBlazeDelta6688.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185.PolarVoyageDiffUtilTurboStrike5735 = true;
                    }
                    PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum64183 = this.PolarVoyageBitmapMaxTitanTitan7960;
                    PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356 = this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185;
                    int i3 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageToolbarEclipseInfernoHero6368;
                    int i4 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageAlarmManagerShadowHyperBeta8339;
                    if (i2 < 29) {
                        polarVoyageViewAuroraQuantum64183.getClass();
                    } else {
                        polarVoyageViewAuroraQuantum64183.PolarVoyageZipVortexCelestial6185.setOffloadDelayPadding(i3, i4);
                    }
                    this.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415 = true;
                }
                PolarVoyageZipVortexCelestial6185(j);
            }
            return false;
        }
        boolean PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion5742();
        PolarVoyageFaceDetectionVisionForceTurbo5989 polarVoyageFaceDetectionVisionForceTurbo5989 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (!PolarVoyageDrawableDeltaHyperion5742) {
            try {
            } catch (PolarVoyageProfilerDragonGammaPhantom1524 e) {
                if (e.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    throw e;
                }
                polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageZipVortexCelestial6185(e);
                return false;
            }
        }
        polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageZipVortexCelestial6185 = null;
        polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageMotionLayoutTransitionHeroVision4068 = -9223372036854775807L;
        polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageKotlinBetaPulseBeta3653 = -9223372036854775807L;
        if (this.PolarVoyageViewBindingPulseHeroSpeed5705) {
            this.PolarVoyageCardViewAlphaVortexCelestial9747 = Math.max(0L, j);
            this.PolarVoyageFCMCelestialCosmosPixel3711 = false;
            this.PolarVoyageViewBindingPulseHeroSpeed5705 = false;
            if (PolarVoyageLayerDrawableShadowTitaniumOmega1942()) {
                PolarVoyageBitmapMaxTitanTitan7960();
            }
            PolarVoyageZipVortexCelestial6185(j);
            if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803) {
                PolarVoyageSnackbarGammaEclipse2140();
            }
        }
        if (this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 == null) {
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!PolarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageZipVortexCelestial6185(this.PolarVoyageContentProviderHyperSpark3838) && this.PolarVoyageDiffUtilDragonSpeedEclipse6225 == 0) {
                    int PolarVoyageStrictModeLegendEpic1532 = PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185, byteBuffer);
                    this.PolarVoyageDiffUtilDragonSpeedEclipse6225 = PolarVoyageStrictModeLegendEpic1532;
                }
                if (this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 != null) {
                    if (PolarVoyageBitmapVisionAuroraPixel4705()) {
                        PolarVoyageZipVortexCelestial6185(j);
                        this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = null;
                    }
                    return false;
                }
                long j5 = this.PolarVoyageCardViewAlphaVortexCelestial9747;
                PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue1296 = this.PolarVoyageContentProviderHyperSpark3838;
                if (PolarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageZipVortexCelestial6185(polarVoyageFontFamilyAuroraGammaRogue1296)) {
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    j4 = this.PolarVoyagePackageManagerCelestialPhoenix8393 / this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653;
                } else {
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    j4 = this.PolarVoyageLooperThreadAlphaPrime1279;
                }
                long PolarVoyageCardViewAlphaVortexCelestial9747 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCardViewAlphaVortexCelestial9747(polarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageZipVortexCelestial6185.PolarVoyageFlingGestureEclipsePrimeMax1376, j4 - this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageSnackbarGammaEclipse2140) + j5;
                if (!this.PolarVoyageFCMCelestialCosmosPixel3711 && Math.abs(PolarVoyageCardViewAlphaVortexCelestial9747 - j) > 200000) {
                    PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = this.PolarVoyageDrawableDeltaHyperion5742;
                    if (polarVoyageAdapterTitanSpark4027 != null) {
                        polarVoyageAdapterTitanSpark4027.PolarVoyageActivityInfoBetaQuantum8726(new PolarVoyageBarcodeScannerOlympianNeoShadow6002("Unexpected audio track timestamp discontinuity: expected " + PolarVoyageCardViewAlphaVortexCelestial9747 + ", got " + j));
                    }
                    this.PolarVoyageFCMCelestialCosmosPixel3711 = true;
                }
                if (this.PolarVoyageFCMCelestialCosmosPixel3711) {
                    if (PolarVoyageBitmapVisionAuroraPixel4705()) {
                        long j6 = j - PolarVoyageCardViewAlphaVortexCelestial9747;
                        this.PolarVoyageCardViewAlphaVortexCelestial9747 += j6;
                        this.PolarVoyageFCMCelestialCosmosPixel3711 = false;
                        PolarVoyageZipVortexCelestial6185(j);
                        PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark40272 = this.PolarVoyageDrawableDeltaHyperion5742;
                        if (polarVoyageAdapterTitanSpark40272 != null && j6 != j3) {
                            ((PolarVoyageLifecycleTitaniumHyper4694) polarVoyageAdapterTitanSpark40272.PolarVoyageStrictModeLegendEpic1532).PolarVoyageAnnotationProcessorFusionDragonThunder7344 = true;
                        }
                    }
                    return false;
                }
                if (PolarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageZipVortexCelestial6185(this.PolarVoyageContentProviderHyperSpark3838)) {
                    this.PolarVoyagePackageManagerCelestialPhoenix8393 += byteBuffer.remaining();
                } else {
                    this.PolarVoyageLooperThreadAlphaPrime1279 = (this.PolarVoyageDiffUtilDragonSpeedEclipse6225 * i) + this.PolarVoyageLooperThreadAlphaPrime1279;
                }
                this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = byteBuffer;
                this.PolarVoyageToolbarEclipseInfernoHero6368 = i;
            }
            return true;
        }
        j2 = -9223372036854775807L;
        j3 = 0;
        PolarVoyageRemoteModelManagerOlympianCelestial9141(j);
        if (!this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149.hasRemaining()) {
            this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = null;
            this.PolarVoyageToolbarEclipseInfernoHero6368 = 0;
            return true;
        }
        PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum64184 = this.PolarVoyageBitmapMaxTitanTitan7960;
        PolarVoyageEventBlazeDelta6688 polarVoyageEventBlazeDelta66882 = polarVoyageViewAuroraQuantum64184.PolarVoyageDiffUtilTurboStrike5735;
        long PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageViewAuroraQuantum64184.PolarVoyageMotionLayoutTransitionHeroVision4068();
        if (polarVoyageEventBlazeDelta66882.PolarVoyageLayerDrawableShadowTitaniumOmega1942 != j2 && PolarVoyageMotionLayoutTransitionHeroVision4068 > j3) {
            polarVoyageEventBlazeDelta66882.PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
            if (SystemClock.elapsedRealtime() - polarVoyageEventBlazeDelta66882.PolarVoyageLayerDrawableShadowTitaniumOmega1942 >= 200) {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("DefaultAudioSink", "Resetting stalled audio output");
                PolarVoyageDiffUtilTurboStrike5735();
                return true;
            }
        }
        return false;
    }

    public final boolean PolarVoyageCameraPixelBlaze2629() {
        PolarVoyageViewAuroraQuantum6418 PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493;
        boolean equals;
        LogSessionId unused;
        PolarVoyageFaceDetectionVisionForceTurbo5989 polarVoyageFaceDetectionVisionForceTurbo5989 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageZipVortexCelestial6185 != null && (PolarVoyageKotlinHeroHyper4083.get() > 0 || SystemClock.elapsedRealtime() < polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageKotlinBetaPulseBeta3653)) {
            return false;
        }
        int i = 1;
        try {
            PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705);
        } catch (PolarVoyageProfilerDragonGammaPhantom1524 e) {
            int i2 = this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageDiffUtilTurboStrike5735;
            while (true) {
                PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue1296 = this.PolarVoyageContentProviderHyperSpark3838;
                if (i2 <= 1000000) {
                    if (!polarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageBitmapVisionAuroraPixel4705) {
                        throw e;
                    }
                    this.PolarVoyageHandlerThreadMaxAurora5064 = true;
                    throw e;
                }
                int i3 = i2 / 2;
                int i4 = polarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (i4 == -1) {
                    i4 = 1;
                }
                int i5 = i3 % i4;
                int i6 = i5 != 0 ? (i4 - i5) + i3 : i3;
                PolarVoyageTextWatcherHyperNeo1408 PolarVoyageZipVortexCelestial6185 = polarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185();
                PolarVoyageZipVortexCelestial6185.PolarVoyageDiffUtilTurboStrike5735 = i6;
                PolarVoyageAlarmManagerDeltaEliteOlympian3995 polarVoyageAlarmManagerDeltaEliteOlympian3995 = new PolarVoyageAlarmManagerDeltaEliteOlympian3995(PolarVoyageZipVortexCelestial6185);
                try {
                    PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAlarmManagerDeltaEliteOlympian3995);
                    PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue12962 = this.PolarVoyageContentProviderHyperSpark3838;
                    this.PolarVoyageContentProviderHyperSpark3838 = new PolarVoyageFontFamilyAuroraGammaRogue1296(polarVoyageFontFamilyAuroraGammaRogue12962.PolarVoyageZipVortexCelestial6185, polarVoyageFontFamilyAuroraGammaRogue12962.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageFontFamilyAuroraGammaRogue12962.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageFontFamilyAuroraGammaRogue12962.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageAlarmManagerDeltaEliteOlympian3995, polarVoyageFontFamilyAuroraGammaRogue12962.PolarVoyageDiffUtilTurboStrike5735);
                    break;
                } catch (PolarVoyageProfilerDragonGammaPhantom1524 e2) {
                    e.addSuppressed(e2);
                    i2 = i6;
                }
            }
        }
        this.PolarVoyageBitmapMaxTitanTitan7960 = PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageContentProviderVisionMasterTitan6027 polarVoyageContentProviderVisionMasterTitan6027 = new PolarVoyageContentProviderVisionMasterTitan6027(this, this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageContentProviderVisionMasterTitan6027;
        PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageZipVortexCelestial6185(polarVoyageContentProviderVisionMasterTitan6027);
        if (this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageKotlinBetaPulseBeta3653()) {
            PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue12963 = this.PolarVoyageContentProviderHyperSpark3838;
            if (polarVoyageFontFamilyAuroraGammaRogue12963.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageBottomSheetOmegaNeo1907) {
                PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum6418 = this.PolarVoyageBitmapMaxTitanTitan7960;
                PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356 = polarVoyageFontFamilyAuroraGammaRogue12963.PolarVoyageZipVortexCelestial6185;
                int i7 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageToolbarEclipseInfernoHero6368;
                int i8 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageAlarmManagerShadowHyperBeta8339;
                if (Build.VERSION.SDK_INT < 29) {
                    polarVoyageViewAuroraQuantum6418.getClass();
                } else {
                    polarVoyageViewAuroraQuantum6418.PolarVoyageZipVortexCelestial6185.setOffloadDelayPadding(i7, i8);
                }
            }
        }
        PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881 = this.PolarVoyageCameraPixelBlaze2629;
        if (polarVoyageClipboardManagerUltraRogue9881 != null) {
            PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum64182 = this.PolarVoyageBitmapMaxTitanTitan7960;
            polarVoyageViewAuroraQuantum64182.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                LogSessionId PolarVoyageZipVortexCelestial61852 = polarVoyageClipboardManagerUltraRogue9881.PolarVoyageZipVortexCelestial6185();
                unused = LogSessionId.LOG_SESSION_ID_NONE;
                equals = PolarVoyageZipVortexCelestial61852.equals(LogSessionId.LOG_SESSION_ID_NONE);
                if (!equals) {
                    polarVoyageViewAuroraQuantum64182.PolarVoyageZipVortexCelestial6185.setLogSessionId(PolarVoyageZipVortexCelestial61852);
                }
            }
        }
        if (PolarVoyageDrawableDeltaHyperion5742()) {
            this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageZipVortexCelestial6185.setVolume(this.PolarVoyageFlingGestureEclipsePrimeMax1376);
        }
        this.PolarVoyageAlertDialogNovaXCelestial4954.getClass();
        AudioDeviceInfo audioDeviceInfo = this.PolarVoyageColorStateListEliteStrikeOlympian8131;
        if (audioDeviceInfo != null) {
            this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageZipVortexCelestial6185.setPreferredDevice(audioDeviceInfo);
        }
        this.PolarVoyageViewBindingPulseHeroSpeed5705 = true;
        int audioSessionId = this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageZipVortexCelestial6185.getAudioSessionId();
        boolean z = audioSessionId != this.PolarVoyageDatabaseCosmosSpectraSolar3905;
        this.PolarVoyageDatabaseCosmosSpectraSolar3905 = audioSessionId;
        PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = this.PolarVoyageDrawableDeltaHyperion5742;
        if (polarVoyageAdapterTitanSpark4027 != null) {
            int i9 = this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185;
            PolarVoyageOnLongClickListenerOlympianPhantomAlpha1069 polarVoyageOnLongClickListenerOlympianPhantomAlpha1069 = new PolarVoyageOnLongClickListenerOlympianPhantomAlpha1069(23);
            PolarVoyageJobSchedulerVisionFusion2049 polarVoyageJobSchedulerVisionFusion2049 = ((PolarVoyageLifecycleTitaniumHyper4694) polarVoyageAdapterTitanSpark4027.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBarcodeScannerLegendHeroForce2726;
            Handler handler = polarVoyageJobSchedulerVisionFusion2049.PolarVoyageZipVortexCelestial6185;
            if (handler != null) {
                handler.post(new PolarVoyageInterstitialAdThunderTitaniumBlaze8815(polarVoyageJobSchedulerVisionFusion2049, polarVoyageOnLongClickListenerOlympianPhantomAlpha1069, 7));
            }
            if (z) {
                this.PolarVoyagePoseDetectionCosmosVision6217 = true;
                PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue12964 = this.PolarVoyageContentProviderHyperSpark3838;
                PolarVoyageTextWatcherHyperNeo1408 PolarVoyageZipVortexCelestial61853 = polarVoyageFontFamilyAuroraGammaRogue12964.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185();
                PolarVoyageZipVortexCelestial61853.PolarVoyageItemDecorationUltraDeltaEpic7485 = this.PolarVoyageDatabaseCosmosSpectraSolar3905;
                this.PolarVoyageContentProviderHyperSpark3838 = new PolarVoyageFontFamilyAuroraGammaRogue1296(polarVoyageFontFamilyAuroraGammaRogue12964.PolarVoyageZipVortexCelestial6185, polarVoyageFontFamilyAuroraGammaRogue12964.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageFontFamilyAuroraGammaRogue12964.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageFontFamilyAuroraGammaRogue12964.PolarVoyageBarcodeScannerInfernoSolarSpark7767, new PolarVoyageAlarmManagerDeltaEliteOlympian3995(PolarVoyageZipVortexCelestial61853), polarVoyageFontFamilyAuroraGammaRogue12964.PolarVoyageDiffUtilTurboStrike5735);
                PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue12965 = this.PolarVoyageSnackbarGammaEclipse2140;
                if (polarVoyageFontFamilyAuroraGammaRogue12965 != null) {
                    PolarVoyageTextWatcherHyperNeo1408 PolarVoyageZipVortexCelestial61854 = polarVoyageFontFamilyAuroraGammaRogue12965.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185();
                    PolarVoyageZipVortexCelestial61854.PolarVoyageItemDecorationUltraDeltaEpic7485 = this.PolarVoyageDatabaseCosmosSpectraSolar3905;
                    this.PolarVoyageSnackbarGammaEclipse2140 = new PolarVoyageFontFamilyAuroraGammaRogue1296(polarVoyageFontFamilyAuroraGammaRogue12965.PolarVoyageZipVortexCelestial6185, polarVoyageFontFamilyAuroraGammaRogue12965.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageFontFamilyAuroraGammaRogue12965.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageFontFamilyAuroraGammaRogue12965.PolarVoyageBarcodeScannerInfernoSolarSpark7767, new PolarVoyageAlarmManagerDeltaEliteOlympian3995(PolarVoyageZipVortexCelestial61854), polarVoyageFontFamilyAuroraGammaRogue12965.PolarVoyageDiffUtilTurboStrike5735);
                }
                PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark40272 = this.PolarVoyageDrawableDeltaHyperion5742;
                int i10 = this.PolarVoyageDatabaseCosmosSpectraSolar3905;
                PolarVoyageLifecycleTitaniumHyper4694 polarVoyageLifecycleTitaniumHyper4694 = (PolarVoyageLifecycleTitaniumHyper4694) polarVoyageAdapterTitanSpark40272.PolarVoyageStrictModeLegendEpic1532;
                if (Build.VERSION.SDK_INT >= 35 && (polarVoyageAlarmManagerAlphaInferno3493 = polarVoyageLifecycleTitaniumHyper4694.PolarVoyageCombineTurboNebula2240) != null) {
                    polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageAlertDialogCyberHeroQuantum3938(i10);
                }
                PolarVoyageJobSchedulerVisionFusion2049 polarVoyageJobSchedulerVisionFusion20492 = polarVoyageLifecycleTitaniumHyper4694.PolarVoyageBarcodeScannerLegendHeroForce2726;
                Handler handler2 = polarVoyageJobSchedulerVisionFusion20492.PolarVoyageZipVortexCelestial6185;
                if (handler2 != null) {
                    handler2.post(new PolarVoyageInAppPurchaseAuroraHyperPhantom8141(i10, i, polarVoyageJobSchedulerVisionFusion20492));
                }
            }
        }
        return true;
    }

    public final void PolarVoyageContentProviderHyperSpark3838() {
        if (this.PolarVoyageConfigurationMaxSpectraForce5418) {
            return;
        }
        this.PolarVoyageConfigurationMaxSpectraForce5418 = true;
        if (this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageKotlinBetaPulseBeta3653()) {
            this.PolarVoyageCanvasElitePhoenix4750 = false;
        }
        PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum6418 = this.PolarVoyageBitmapMaxTitanTitan7960;
        if (polarVoyageViewAuroraQuantum6418.PolarVoyageBottomSheetOmegaNeo1907) {
            return;
        }
        polarVoyageViewAuroraQuantum6418.PolarVoyageBottomSheetOmegaNeo1907 = true;
        PolarVoyageEventBlazeDelta6688 polarVoyageEventBlazeDelta6688 = polarVoyageViewAuroraQuantum6418.PolarVoyageDiffUtilTurboStrike5735;
        long PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageViewAuroraQuantum6418.PolarVoyageMotionLayoutTransitionHeroVision4068();
        polarVoyageEventBlazeDelta6688.PolarVoyageMotionLayoutForceEpicAurora7183 = polarVoyageEventBlazeDelta6688.PolarVoyageZipVortexCelestial6185();
        polarVoyageEventBlazeDelta6688.PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
        polarVoyageEventBlazeDelta6688.PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762(SystemClock.elapsedRealtime());
        polarVoyageEventBlazeDelta6688.PolarVoyageAlertDialogCyberHeroQuantum3938 = PolarVoyageMotionLayoutTransitionHeroVision4068;
        polarVoyageViewAuroraQuantum6418.PolarVoyageZipVortexCelestial6185.stop();
        polarVoyageViewAuroraQuantum6418.PolarVoyageContentProviderHyperSpark3838 = 0;
    }

    public final void PolarVoyageDiffUtilTurboStrike5735() {
        if (PolarVoyageDrawableDeltaHyperion5742()) {
            this.PolarVoyagePackageManagerCelestialPhoenix8393 = 0L;
            this.PolarVoyageLooperThreadAlphaPrime1279 = 0L;
            this.PolarVoyageActivityInfoBetaQuantum8726 = 0L;
            this.PolarVoyageLifecycleOlympianOmega3762 = 0L;
            int i = 0;
            this.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415 = false;
            this.PolarVoyageDiffUtilDragonSpeedEclipse6225 = 0;
            this.PolarVoyageMotionLayoutForceEpicAurora7183 = new PolarVoyageBarcodeScannerDragonCelestialPhoenix1879(this.PolarVoyageAlertDialogCyberHeroQuantum3938, 0L, 0L);
            this.PolarVoyageCardViewAlphaVortexCelestial9747 = 0L;
            this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = null;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.clear();
            this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = null;
            this.PolarVoyageToolbarEclipseInfernoHero6368 = 0;
            this.PolarVoyageAlarmManagerShadowHyperBeta8339 = null;
            this.PolarVoyageConfigurationMaxSpectraForce5418 = false;
            this.PolarVoyageGuidelineStormSolar2850 = false;
            this.PolarVoyageCanvasElitePhoenix4750 = false;
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageSnackbarGammaEclipse2140 = 0L;
            PolarVoyagePreviewUltraBeta9531 polarVoyagePreviewUltraBeta9531 = this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageDiffUtilTurboStrike5735;
            this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyagePreviewUltraBeta9531;
            polarVoyagePreviewUltraBeta9531.PolarVoyageZipVortexCelestial6185();
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
            PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue1296 = this.PolarVoyageSnackbarGammaEclipse2140;
            if (polarVoyageFontFamilyAuroraGammaRogue1296 != null) {
                this.PolarVoyageContentProviderHyperSpark3838 = polarVoyageFontFamilyAuroraGammaRogue1296;
                this.PolarVoyageSnackbarGammaEclipse2140 = null;
            }
            PolarVoyageKotlinHeroHyper4083.incrementAndGet();
            PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum6418 = this.PolarVoyageBitmapMaxTitanTitan7960;
            if (polarVoyageViewAuroraQuantum6418.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getPlayState() == 3) {
                polarVoyageViewAuroraQuantum6418.PolarVoyageZipVortexCelestial6185.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && polarVoyageViewAuroraQuantum6418.PolarVoyageKotlinBetaPulseBeta3653()) {
                PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493 = polarVoyageViewAuroraQuantum6418.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageAlarmManagerAlphaInferno3493.getClass();
                ((PolarVoyageViewAuroraQuantum6418) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageZipVortexCelestial6185.unregisterStreamEventCallback((PolarVoyageSensorManagerMaxNeoStrike5246) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                ((Handler) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532).removeCallbacksAndMessages(null);
            }
            PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = polarVoyageViewAuroraQuantum6418.PolarVoyageBitmapVisionAuroraPixel4705;
            if (polarVoyageAnimatorCelestialDeltaMaster5821 != null) {
                AudioTrack audioTrack = (AudioTrack) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyagePreviewPixelEpic6778 polarVoyagePreviewPixelEpic6778 = (PolarVoyagePreviewPixelEpic6778) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778;
                polarVoyagePreviewPixelEpic6778.getClass();
                audioTrack.removeOnRoutingChangedListener(polarVoyagePreviewPixelEpic6778);
                polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778 = null;
                polarVoyageViewAuroraQuantum6418.PolarVoyageBitmapVisionAuroraPixel4705 = null;
            }
            AudioTrack audioTrack2 = polarVoyageViewAuroraQuantum6418.PolarVoyageZipVortexCelestial6185;
            PolarVoyageInterpolatorTitaniumOlympian2745 polarVoyageInterpolatorTitaniumOlympian2745 = polarVoyageViewAuroraQuantum6418.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            Handler PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBottomSheetOmegaNeo1907(null);
            synchronized (PolarVoyageViewAuroraQuantum6418.PolarVoyageAnimatorSetSparkUltraMax8233) {
                try {
                    if (PolarVoyageViewAuroraQuantum6418.PolarVoyageBitmapMaxTitanTitan7960 == null) {
                        PolarVoyageViewAuroraQuantum6418.PolarVoyageBitmapMaxTitanTitan7960 = Executors.newSingleThreadScheduledExecutor(new PolarVoyageLightSensorRogueDelta9552());
                    }
                    PolarVoyageViewAuroraQuantum6418.PolarVoyageDisplayMetricsVortexDragon9516++;
                    PolarVoyageViewAuroraQuantum6418.PolarVoyageBitmapMaxTitanTitan7960.schedule(new PolarVoyageBarrierHeroSparkInferno3191(audioTrack2, PolarVoyageBottomSheetOmegaNeo1907, polarVoyageInterpolatorTitaniumOlympian2745, i), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.PolarVoyageBitmapMaxTitanTitan7960 = null;
        }
        PolarVoyageFaceDetectionVisionForceTurbo5989 polarVoyageFaceDetectionVisionForceTurbo5989 = this.PolarVoyageViewRogueMaster4778;
        polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageZipVortexCelestial6185 = null;
        polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageMotionLayoutTransitionHeroVision4068 = -9223372036854775807L;
        polarVoyageFaceDetectionVisionForceTurbo5989.PolarVoyageKotlinBetaPulseBeta3653 = -9223372036854775807L;
        PolarVoyageFaceDetectionVisionForceTurbo5989 polarVoyageFaceDetectionVisionForceTurbo59892 = this.PolarVoyageBottomSheetOmegaNeo1907;
        polarVoyageFaceDetectionVisionForceTurbo59892.PolarVoyageZipVortexCelestial6185 = null;
        polarVoyageFaceDetectionVisionForceTurbo59892.PolarVoyageMotionLayoutTransitionHeroVision4068 = -9223372036854775807L;
        polarVoyageFaceDetectionVisionForceTurbo59892.PolarVoyageKotlinBetaPulseBeta3653 = -9223372036854775807L;
        this.PolarVoyageDisplayMetricsForceEclipseVision4728 = 0L;
        this.PolarVoyageClipboardManagerAuroraPixel8666 = 0L;
        Handler handler = this.PolarVoyageMapTurboRogueTitan9291;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageDisplayMetricsVortexDragon9516(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        byte b;
        int i2;
        int i3;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(this.PolarVoyageAlarmManagerShadowHyperBeta8339 == null);
        if (byteBuffer.hasRemaining()) {
            if (PolarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageZipVortexCelestial6185(this.PolarVoyageContentProviderHyperSpark3838)) {
                int PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = (int) PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762(20L), this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageMotionLayoutTransitionHeroVision4068, 1000000L, RoundingMode.UP);
                long PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768();
                long j = PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
                if (PolarVoyageRotateAnimationCyberCelestialDelta4768 < j) {
                    PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue1296 = this.PolarVoyageContentProviderHyperSpark3838;
                    int i4 = polarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185;
                    int i5 = polarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    int i6 = (int) PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i6 < PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i4 == 4) {
                                float PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageDiffUtilTurboStrike5735(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (PolarVoyageDiffUtilTurboStrike5735 < 0.0f ? (-PolarVoyageDiffUtilTurboStrike5735) * (-2.1474836E9f) : PolarVoyageDiffUtilTurboStrike5735 * 2.1474836E9f);
                            } else if (i4 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i4 != 22) {
                                if (i4 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i4 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i4 == 1610612736) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                } else if (i4 != 1879048192) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                                    return;
                                } else {
                                    double max = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                    i3 = (int) (max < 0.0d ? (-max) * (-2.147483648E9d) : max * 2.147483647E9d);
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            int i7 = (int) ((i3 * i6) / j);
                            if (i4 != 2) {
                                byteBuffer2.put((byte) (i7 >> 16));
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 == 3) {
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 != 4) {
                                if (i4 == 21) {
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 22) {
                                    byteBuffer2.put((byte) i7);
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 268435456) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                } else if (i4 == 1342177280) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                } else if (i4 == 1610612736) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) i7);
                                } else if (i4 != 1879048192) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                                    return;
                                } else if (i7 < 0) {
                                    byteBuffer2.putDouble((-i7) / (-2.147483648E9d));
                                } else {
                                    byteBuffer2.putDouble(i7 / 2.147483647E9d);
                                }
                            } else if (i7 < 0) {
                                byteBuffer2.putFloat((-i7) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i7 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i5) {
                                i6++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        int i72 = (int) ((i3 * i6) / j);
                        if (i4 != 2) {
                        }
                        if (byteBuffer.position() != position + i5) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.PolarVoyageAlarmManagerShadowHyperBeta8339 = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.PolarVoyageAlarmManagerShadowHyperBeta8339 = byteBuffer2;
        }
    }

    public final boolean PolarVoyageDrawableDeltaHyperion5742() {
        return this.PolarVoyageBitmapMaxTitanTitan7960 != null;
    }

    public final int PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356) {
        boolean z;
        if (!PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149) || polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 == 2) {
            z = false;
        } else {
            PolarVoyageServiceConnectionCelestialSpectraPulse4742 PolarVoyageZipVortexCelestial6185 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageZipVortexCelestial6185();
            PolarVoyageZipVortexCelestial6185.PolarVoyageFlingGestureEclipsePrimeMax1376 = 2;
            polarVoyageDisplayMetricsSpectraNeoHero6356 = new PolarVoyageDisplayMetricsSpectraNeoHero6356(PolarVoyageZipVortexCelestial6185);
            z = true;
        }
        int i = this.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageDisplayMetricsSpectraNeoHero6356)).PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356, int[] iArr) {
        PolarVoyagePreviewUltraBeta9531 polarVoyagePreviewUltraBeta9531;
        PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero63562;
        int i;
        int i2;
        if (this.PolarVoyageAnimatorSetSparkUltraMax8233 == null && this.PolarVoyageZipVortexCelestial6185 != null) {
            PolarVoyageBarrierFusionMax3569 polarVoyageBarrierFusionMax3569 = new PolarVoyageBarrierFusionMax3569(this);
            this.PolarVoyageAnimatorSetSparkUltraMax8233 = polarVoyageBarrierFusionMax3569;
            PolarVoyageAnnotationProcessorPixelRogueSpectra9718 polarVoyageAnnotationProcessorPixelRogueSpectra9718 = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
            polarVoyageAnnotationProcessorPixelRogueSpectra9718.PolarVoyageDiffUtilTurboStrike5735();
            if (polarVoyageAnnotationProcessorPixelRogueSpectra9718.PolarVoyageDiffUtilTurboStrike5735 == null) {
                polarVoyageAnnotationProcessorPixelRogueSpectra9718.PolarVoyageDiffUtilTurboStrike5735 = new PolarVoyageInterpolatorTitaniumOlympian2745(Thread.currentThread());
            }
            polarVoyageAnnotationProcessorPixelRogueSpectra9718.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageZipVortexCelestial6185(polarVoyageBarrierFusionMax3569);
        }
        String str = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageSnackbarGammaEclipse2140;
        int i3 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageCardViewAlphaVortexCelestial9747;
        int i4 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
        if ("audio/raw".equals(str)) {
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCameraViewSpectraMaxSpectra2824(i4));
            int PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageDrawableDeltaHyperion5742(i4) * i3;
            PolarVoyageDatabasePhantomBeta6832 polarVoyageDatabasePhantomBeta6832 = new PolarVoyageDatabasePhantomBeta6832(4);
            polarVoyageDatabasePhantomBeta6832.PolarVoyageKotlinBetaPulseBeta3653(this.PolarVoyageTextInputEditTextNebulaHero6651);
            polarVoyageDatabasePhantomBeta6832.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageBitmapVisionAuroraPixel4705);
            PolarVoyageLiveDataQuantumSpeedNovaX2823[] polarVoyageLiveDataQuantumSpeedNovaX2823Arr = (PolarVoyageLiveDataQuantumSpeedNovaX2823[]) this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageStrictModeLegendEpic1532;
            int length = polarVoyageLiveDataQuantumSpeedNovaX2823Arr.length;
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDiffUtilTurboStrike5735(length, polarVoyageLiveDataQuantumSpeedNovaX2823Arr);
            polarVoyageDatabasePhantomBeta6832.PolarVoyageBarcodeScannerInfernoSolarSpark7767(length);
            System.arraycopy(polarVoyageLiveDataQuantumSpeedNovaX2823Arr, 0, polarVoyageDatabasePhantomBeta6832.PolarVoyageZipVortexCelestial6185, polarVoyageDatabasePhantomBeta6832.PolarVoyageMotionLayoutTransitionHeroVision4068, length);
            polarVoyageDatabasePhantomBeta6832.PolarVoyageMotionLayoutTransitionHeroVision4068 += length;
            polarVoyagePreviewUltraBeta9531 = new PolarVoyagePreviewUltraBeta9531(polarVoyageDatabasePhantomBeta6832.PolarVoyageDiffUtilTurboStrike5735());
            if (polarVoyagePreviewUltraBeta9531.equals(this.PolarVoyageRemoteModelManagerOlympianCelestial9141)) {
                polarVoyagePreviewUltraBeta9531 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
            }
            int i5 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageToolbarEclipseInfernoHero6368;
            int i6 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageAlarmManagerShadowHyperBeta8339;
            PolarVoyageAssetManagerAlphaPhoenix8887 polarVoyageAssetManagerAlphaPhoenix8887 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            polarVoyageAssetManagerAlphaPhoenix8887.PolarVoyageStrictModeLegendEpic1532 = i5;
            polarVoyageAssetManagerAlphaPhoenix8887.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i6;
            this.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageStrictModeLegendEpic1532 = iArr;
            PolarVoyageFocusMeteringActionCelestialStrikeMax1103 polarVoyageFocusMeteringActionCelestialStrikeMax1103 = new PolarVoyageFocusMeteringActionCelestialStrikeMax1103(polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageFlingGestureEclipsePrimeMax1376, i3, i4);
            try {
                PolarVoyageDialogPhantomEliteAurora3058 polarVoyageDialogPhantomEliteAurora3058 = polarVoyagePreviewUltraBeta9531.PolarVoyageZipVortexCelestial6185;
                if (polarVoyageFocusMeteringActionCelestialStrikeMax1103.equals(PolarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageBitmapVisionAuroraPixel4705)) {
                    throw new PolarVoyageOnAttachStateChangeListenerRoguePulse3137(polarVoyageFocusMeteringActionCelestialStrikeMax1103);
                }
                for (int i7 = 0; i7 < polarVoyageDialogPhantomEliteAurora3058.size(); i7++) {
                    PolarVoyageLiveDataQuantumSpeedNovaX2823 polarVoyageLiveDataQuantumSpeedNovaX2823 = (PolarVoyageLiveDataQuantumSpeedNovaX2823) polarVoyageDialogPhantomEliteAurora3058.get(i7);
                    PolarVoyageFocusMeteringActionCelestialStrikeMax1103 PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageLiveDataQuantumSpeedNovaX2823.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageFocusMeteringActionCelestialStrikeMax1103);
                    if (polarVoyageLiveDataQuantumSpeedNovaX2823.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(!PolarVoyageBitmapVisionAuroraPixel4705.equals(PolarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageBitmapVisionAuroraPixel4705));
                        polarVoyageFocusMeteringActionCelestialStrikeMax1103 = PolarVoyageBitmapVisionAuroraPixel4705;
                    }
                }
                int i8 = polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageMotionLayoutTransitionHeroVision4068;
                int i9 = polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageKotlinBetaPulseBeta3653;
                PolarVoyageServiceConnectionCelestialSpectraPulse4742 PolarVoyageZipVortexCelestial6185 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageZipVortexCelestial6185();
                PolarVoyageZipVortexCelestial6185.PolarVoyageFlingGestureEclipsePrimeMax1376 = i9;
                PolarVoyageZipVortexCelestial6185.PolarVoyageCardViewAlphaVortexCelestial9747 = polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageZipVortexCelestial6185;
                PolarVoyageZipVortexCelestial6185.PolarVoyageViewBindingPulseHeroSpeed5705 = i8;
                polarVoyageDisplayMetricsSpectraNeoHero63562 = new PolarVoyageDisplayMetricsSpectraNeoHero6356(PolarVoyageZipVortexCelestial6185);
                i = PolarVoyageDrawableDeltaHyperion5742;
                i2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageDrawableDeltaHyperion5742(i9) * i8;
            } catch (PolarVoyageOnAttachStateChangeListenerRoguePulse3137 e) {
                throw new PolarVoyageCamera2CosmosStorm7941(e, polarVoyageDisplayMetricsSpectraNeoHero6356);
            }
        } else {
            polarVoyagePreviewUltraBeta9531 = new PolarVoyagePreviewUltraBeta9531(PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778);
            polarVoyageDisplayMetricsSpectraNeoHero63562 = polarVoyageDisplayMetricsSpectraNeoHero6356;
            i = -1;
            i2 = -1;
        }
        PolarVoyagePreviewUltraBeta9531 polarVoyagePreviewUltraBeta95312 = polarVoyagePreviewUltraBeta9531;
        PolarVoyageCameraSelectorMegaGammaCyber1676 PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageDisplayMetricsSpectraNeoHero63562);
        PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero63563 = PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185;
        try {
            PolarVoyageAlarmManagerDeltaEliteOlympian3995 PolarVoyageKotlinBetaPulseBeta3653 = this.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageTextInputEditTextNebulaHero6651);
            boolean z = PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageBitmapVisionAuroraPixel4705;
            if (PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185 == 0) {
                throw new PolarVoyageCamera2CosmosStorm7941("Invalid output encoding (isOffload=" + z + ")", polarVoyageDisplayMetricsSpectraNeoHero63563);
            }
            if (PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageKotlinBetaPulseBeta3653 == 0) {
                throw new PolarVoyageCamera2CosmosStorm7941("Invalid output channel config (isOffload=" + z + ")", polarVoyageDisplayMetricsSpectraNeoHero63563);
            }
            this.PolarVoyageHandlerThreadMaxAurora5064 = false;
            PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue1296 = new PolarVoyageFontFamilyAuroraGammaRogue1296(polarVoyageDisplayMetricsSpectraNeoHero6356, polarVoyageDisplayMetricsSpectraNeoHero63562, i, i2, PolarVoyageKotlinBetaPulseBeta3653, polarVoyagePreviewUltraBeta95312);
            if (PolarVoyageDrawableDeltaHyperion5742()) {
                this.PolarVoyageSnackbarGammaEclipse2140 = polarVoyageFontFamilyAuroraGammaRogue1296;
            } else {
                this.PolarVoyageContentProviderHyperSpark3838 = polarVoyageFontFamilyAuroraGammaRogue1296;
            }
        } catch (PolarVoyageCamera2EpicFusion4389 e2) {
            throw new PolarVoyageCamera2CosmosStorm7941(e2, polarVoyageDisplayMetricsSpectraNeoHero6356);
        }
    }

    public final boolean PolarVoyageLayerDrawableShadowTitaniumOmega1942() {
        PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue1296 = this.PolarVoyageContentProviderHyperSpark3838;
        return polarVoyageFontFamilyAuroraGammaRogue1296 != null && polarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public final PolarVoyageViewAuroraQuantum6418 PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageAlarmManagerDeltaEliteOlympian3995 polarVoyageAlarmManagerDeltaEliteOlympian3995) {
        try {
            return this.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageZipVortexCelestial6185(polarVoyageAlarmManagerDeltaEliteOlympian3995);
        } catch (PolarVoyageOnTouchListenerSpeedEclipseMaster2911 e) {
            PolarVoyageProfilerDragonGammaPhantom1524 polarVoyageProfilerDragonGammaPhantom1524 = new PolarVoyageProfilerDragonGammaPhantom1524(polarVoyageAlarmManagerDeltaEliteOlympian3995.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageAlarmManagerDeltaEliteOlympian3995.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageAlarmManagerDeltaEliteOlympian3995.PolarVoyageZipVortexCelestial6185, polarVoyageAlarmManagerDeltaEliteOlympian3995.PolarVoyageDiffUtilTurboStrike5735, this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185, polarVoyageAlarmManagerDeltaEliteOlympian3995.PolarVoyageBitmapVisionAuroraPixel4705, e);
            PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = this.PolarVoyageDrawableDeltaHyperion5742;
            if (polarVoyageAdapterTitanSpark4027 == null) {
                throw polarVoyageProfilerDragonGammaPhantom1524;
            }
            polarVoyageAdapterTitanSpark4027.PolarVoyageActivityInfoBetaQuantum8726(polarVoyageProfilerDragonGammaPhantom1524);
            throw polarVoyageProfilerDragonGammaPhantom1524;
        }
    }

    public final void PolarVoyageNavigationViewHyperHyperHyperion1793() {
        if (this.PolarVoyageContentProviderHyperSpark3838 != null) {
            PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue1296 = this.PolarVoyageSnackbarGammaEclipse2140;
            if (polarVoyageFontFamilyAuroraGammaRogue1296 != null) {
                this.PolarVoyageContentProviderHyperSpark3838 = polarVoyageFontFamilyAuroraGammaRogue1296;
                this.PolarVoyageSnackbarGammaEclipse2140 = null;
            }
            try {
                PolarVoyageAlarmManagerDeltaEliteOlympian3995 PolarVoyageKotlinBetaPulseBeta3653 = this.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068));
                PolarVoyageFontFamilyAuroraGammaRogue1296 polarVoyageFontFamilyAuroraGammaRogue12962 = this.PolarVoyageContentProviderHyperSpark3838;
                this.PolarVoyageContentProviderHyperSpark3838 = new PolarVoyageFontFamilyAuroraGammaRogue1296(polarVoyageFontFamilyAuroraGammaRogue12962.PolarVoyageZipVortexCelestial6185, polarVoyageFontFamilyAuroraGammaRogue12962.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageFontFamilyAuroraGammaRogue12962.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageFontFamilyAuroraGammaRogue12962.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageKotlinBetaPulseBeta3653, polarVoyageFontFamilyAuroraGammaRogue12962.PolarVoyageDiffUtilTurboStrike5735);
            } catch (PolarVoyageCamera2EpicFusion4389 e) {
                throw new IllegalStateException(new PolarVoyageCamera2CosmosStorm7941(e, this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185));
            }
        }
        PolarVoyageDiffUtilTurboStrike5735();
    }

    public final void PolarVoyageRemoteModelManagerOlympianCelestial9141(long j) {
        ByteBuffer byteBuffer;
        PolarVoyageBarcodeScannerInfernoSolarSpark7767(j);
        if (this.PolarVoyageAlarmManagerShadowHyperBeta8339 != null) {
            return;
        }
        if (!this.PolarVoyageRemoteModelManagerOlympianCelestial9141.PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
            ByteBuffer byteBuffer2 = this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
            if (byteBuffer2 != null) {
                PolarVoyageDisplayMetricsVortexDragon9516(byteBuffer2);
                PolarVoyageBarcodeScannerInfernoSolarSpark7767(j);
                return;
            }
            return;
        }
        while (!this.PolarVoyageRemoteModelManagerOlympianCelestial9141.PolarVoyageKotlinBetaPulseBeta3653()) {
            do {
                PolarVoyagePreviewUltraBeta9531 polarVoyagePreviewUltraBeta9531 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
                if (polarVoyagePreviewUltraBeta9531.PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
                    ByteBuffer byteBuffer3 = polarVoyagePreviewUltraBeta9531.PolarVoyageKotlinBetaPulseBeta3653[polarVoyagePreviewUltraBeta9531.PolarVoyageMotionLayoutTransitionHeroVision4068()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        polarVoyagePreviewUltraBeta9531.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageLiveDataQuantumSpeedNovaX2823.PolarVoyageZipVortexCelestial6185);
                        byteBuffer = polarVoyagePreviewUltraBeta9531.PolarVoyageKotlinBetaPulseBeta3653[polarVoyagePreviewUltraBeta9531.PolarVoyageMotionLayoutTransitionHeroVision4068()];
                    }
                } else {
                    byteBuffer = PolarVoyageLiveDataQuantumSpeedNovaX2823.PolarVoyageZipVortexCelestial6185;
                }
                if (byteBuffer.hasRemaining()) {
                    PolarVoyageDisplayMetricsVortexDragon9516(byteBuffer);
                    PolarVoyageBarcodeScannerInfernoSolarSpark7767(j);
                } else {
                    ByteBuffer byteBuffer4 = this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    PolarVoyagePreviewUltraBeta9531 polarVoyagePreviewUltraBeta95312 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
                    ByteBuffer byteBuffer5 = this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
                    if (polarVoyagePreviewUltraBeta95312.PolarVoyageBarcodeScannerInfernoSolarSpark7767() && !polarVoyagePreviewUltraBeta95312.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                        polarVoyagePreviewUltraBeta95312.PolarVoyageBitmapVisionAuroraPixel4705(byteBuffer5);
                    }
                }
            } while (this.PolarVoyageAlarmManagerShadowHyperBeta8339 == null);
            return;
        }
    }

    public final long PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        if (!PolarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageZipVortexCelestial6185(this.PolarVoyageContentProviderHyperSpark3838)) {
            return this.PolarVoyageLifecycleOlympianOmega3762;
        }
        long j = this.PolarVoyageActivityInfoBetaQuantum8726;
        long j2 = this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        return ((j + j2) - 1) / j2;
    }

    public final void PolarVoyageSnackbarGammaEclipse2140() {
        this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = true;
        if (PolarVoyageDrawableDeltaHyperion5742()) {
            PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum6418 = this.PolarVoyageBitmapMaxTitanTitan7960;
            PolarVoyageEventBlazeDelta6688 polarVoyageEventBlazeDelta6688 = polarVoyageViewAuroraQuantum6418.PolarVoyageDiffUtilTurboStrike5735;
            if (polarVoyageEventBlazeDelta6688.PolarVoyageDisplayMetricsVortexDragon9516 != -9223372036854775807L) {
                polarVoyageEventBlazeDelta6688.PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
                polarVoyageEventBlazeDelta6688.PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762(SystemClock.elapsedRealtime());
            }
            polarVoyageEventBlazeDelta6688.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCardViewAlphaVortexCelestial9747(polarVoyageEventBlazeDelta6688.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageEventBlazeDelta6688.PolarVoyageZipVortexCelestial6185());
            polarVoyageEventBlazeDelta6688.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185(0);
            if (!polarVoyageViewAuroraQuantum6418.PolarVoyageBottomSheetOmegaNeo1907 || polarVoyageViewAuroraQuantum6418.PolarVoyageKotlinBetaPulseBeta3653()) {
                polarVoyageViewAuroraQuantum6418.PolarVoyageZipVortexCelestial6185.play();
            }
        }
    }

    public final PolarVoyageCameraSelectorMegaGammaCyber1676 PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356) {
        PolarVoyageCameraSelectorMegaGammaCyber1676 polarVoyageCameraSelectorMegaGammaCyber1676 = new PolarVoyageCameraSelectorMegaGammaCyber1676(polarVoyageDisplayMetricsSpectraNeoHero6356);
        polarVoyageCameraSelectorMegaGammaCyber1676.PolarVoyageMotionLayoutTransitionHeroVision4068 = this.PolarVoyageDisplayMetricsVortexDragon9516;
        polarVoyageCameraSelectorMegaGammaCyber1676.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = this.PolarVoyageStrictModeLegendEpic1532 != 0;
        polarVoyageCameraSelectorMegaGammaCyber1676.PolarVoyageKotlinBetaPulseBeta3653 = this.PolarVoyageColorStateListEliteStrikeOlympian8131;
        polarVoyageCameraSelectorMegaGammaCyber1676.PolarVoyageBitmapVisionAuroraPixel4705 = this.PolarVoyageDatabaseCosmosSpectraSolar3905;
        polarVoyageCameraSelectorMegaGammaCyber1676.PolarVoyageTextInputEditTextNebulaHero6651 = this.PolarVoyageMotionSceneStormSolarBeta2208;
        polarVoyageCameraSelectorMegaGammaCyber1676.PolarVoyageItemDecorationUltraDeltaEpic7485 = -1;
        polarVoyageCameraSelectorMegaGammaCyber1676.PolarVoyageDiffUtilTurboStrike5735 = this.PolarVoyageKeyframeEpicNovaXCyber9821;
        return new PolarVoyageCameraSelectorMegaGammaCyber1676(polarVoyageCameraSelectorMegaGammaCyber1676);
    }

    public final boolean PolarVoyageViewRogueMaster4778() {
        if (!PolarVoyageDrawableDeltaHyperion5742()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageKotlinBetaPulseBeta3653() && this.PolarVoyageCanvasElitePhoenix4750) {
            return false;
        }
        long PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768();
        long PolarVoyageZipVortexCelestial6185 = this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageZipVortexCelestial6185();
        PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum6418 = this.PolarVoyageBitmapMaxTitanTitan7960;
        polarVoyageViewAuroraQuantum6418.getClass();
        return PolarVoyageRotateAnimationCyberCelestialDelta4768 > PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(PolarVoyageZipVortexCelestial6185, (long) polarVoyageViewAuroraQuantum6418.PolarVoyageZipVortexCelestial6185.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final void PolarVoyageZipVortexCelestial6185(long j) {
        PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel9380;
        boolean PolarVoyageLayerDrawableShadowTitaniumOmega1942 = PolarVoyageLayerDrawableShadowTitaniumOmega1942();
        boolean z = false;
        PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (PolarVoyageLayerDrawableShadowTitaniumOmega1942) {
            polarVoyageTransitionBlazePixel9380 = PolarVoyageTransitionBlazePixel9380.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        } else {
            if (this.PolarVoyageMotionSceneStormSolarBeta2208 || !PolarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageZipVortexCelestial6185(this.PolarVoyageContentProviderHyperSpark3838)) {
                polarVoyageTransitionBlazePixel9380 = PolarVoyageTransitionBlazePixel9380.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            } else {
                int i = this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
                polarVoyageTransitionBlazePixel9380 = this.PolarVoyageAlertDialogCyberHeroQuantum3938;
                PolarVoyageTextViewEpicFusionTurbo3381 polarVoyageTextViewEpicFusionTurbo3381 = (PolarVoyageTextViewEpicFusionTurbo3381) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907;
                float f = polarVoyageTransitionBlazePixel9380.PolarVoyageZipVortexCelestial6185;
                polarVoyageTextViewEpicFusionTurbo3381.getClass();
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(f > 0.0f);
                if (polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageKotlinBetaPulseBeta3653 != f) {
                    polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageKotlinBetaPulseBeta3653 = f;
                    polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageStrictModeLegendEpic1532 = true;
                }
                float f2 = polarVoyageTransitionBlazePixel9380.PolarVoyageMotionLayoutTransitionHeroVision4068;
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(f2 > 0.0f);
                if (polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != f2) {
                    polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = f2;
                    polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageStrictModeLegendEpic1532 = true;
                }
            }
            this.PolarVoyageAlertDialogCyberHeroQuantum3938 = polarVoyageTransitionBlazePixel9380;
        }
        PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel93802 = polarVoyageTransitionBlazePixel9380;
        if (!this.PolarVoyageMotionSceneStormSolarBeta2208 && PolarVoyageFontFamilyAuroraGammaRogue1296.PolarVoyageZipVortexCelestial6185(this.PolarVoyageContentProviderHyperSpark3838)) {
            int i2 = this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
            z = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
            ((PolarVoyageCameraViewDragonThunderMega6612) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageSnackbarGammaEclipse2140 = z;
        }
        this.PolarVoyageCameraViewSpectraMaxSpectra2824 = z;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.add(new PolarVoyageBarcodeScannerDragonCelestialPhoenix1879(polarVoyageTransitionBlazePixel93802, Math.max(0L, j), PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCardViewAlphaVortexCelestial9747(this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageMotionLayoutTransitionHeroVision4068, PolarVoyageRotateAnimationCyberCelestialDelta4768())));
        PolarVoyagePreviewUltraBeta9531 polarVoyagePreviewUltraBeta9531 = this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageDiffUtilTurboStrike5735;
        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyagePreviewUltraBeta9531;
        polarVoyagePreviewUltraBeta9531.PolarVoyageZipVortexCelestial6185();
        PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = this.PolarVoyageDrawableDeltaHyperion5742;
        if (polarVoyageAdapterTitanSpark4027 != null) {
            boolean z2 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
            PolarVoyageJobSchedulerVisionFusion2049 polarVoyageJobSchedulerVisionFusion2049 = ((PolarVoyageLifecycleTitaniumHyper4694) polarVoyageAdapterTitanSpark4027.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBarcodeScannerLegendHeroForce2726;
            Handler handler = polarVoyageJobSchedulerVisionFusion2049.PolarVoyageZipVortexCelestial6185;
            if (handler != null) {
                handler.post(new PolarVoyageWindowManagerStormDragon8769(9, polarVoyageJobSchedulerVisionFusion2049, z2));
            }
        }
    }
}
