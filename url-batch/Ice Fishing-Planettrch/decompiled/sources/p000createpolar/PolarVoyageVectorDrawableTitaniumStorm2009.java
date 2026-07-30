package p000createpolar;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageVectorDrawableTitaniumStorm2009 implements PolarVoyageAdMobForceVortexBeta7549 {
    public Object PolarVoyageBottomSheetOmegaNeo1907;
    public final Object PolarVoyageCameraPixelBlaze2629;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public boolean PolarVoyageStrictModeLegendEpic1532;
    public Object PolarVoyageViewRogueMaster4778;

    public PolarVoyageVectorDrawableTitaniumStorm2009(MediaCodec mediaCodec, HandlerThread handlerThread, PolarVoyageContentObserverDragonTitaniumNebula2107 polarVoyageContentObserverDragonTitaniumNebula2107, PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = mediaCodec;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageImageAnalysisNovaUltra4777(handlerThread);
        this.PolarVoyageViewRogueMaster4778 = polarVoyageContentObserverDragonTitaniumNebula2107;
        this.PolarVoyageCameraPixelBlaze2629 = polarVoyageAlarmManagerAlphaInferno3493;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
    }

    public static String PolarVoyageCameraPixelBlaze2629(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r7 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageVectorDrawableTitaniumStorm2009 polarVoyageVectorDrawableTitaniumStorm2009, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493;
        boolean addMediaCodec;
        PolarVoyageImageAnalysisNovaUltra4777 polarVoyageImageAnalysisNovaUltra4777 = (PolarVoyageImageAnalysisNovaUltra4777) polarVoyageVectorDrawableTitaniumStorm2009.PolarVoyageBottomSheetOmegaNeo1907;
        MediaCodec mediaCodec = (MediaCodec) polarVoyageVectorDrawableTitaniumStorm2009.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        HandlerThread handlerThread = polarVoyageImageAnalysisNovaUltra4777.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageImageAnalysisNovaUltra4777.PolarVoyageKotlinBetaPulseBeta3653 == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(polarVoyageImageAnalysisNovaUltra4777, handler);
        polarVoyageImageAnalysisNovaUltra4777.PolarVoyageKotlinBetaPulseBeta3653 = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((PolarVoyageContentObserverDragonTitaniumNebula2107) polarVoyageVectorDrawableTitaniumStorm2009.PolarVoyageViewRogueMaster4778).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (polarVoyageAlarmManagerAlphaInferno3493 = (PolarVoyageAlarmManagerAlphaInferno3493) polarVoyageVectorDrawableTitaniumStorm2009.PolarVoyageCameraPixelBlaze2629) != null) {
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907;
            if (loudnessCodecController != null) {
                addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            }
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(((HashSet) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageRotateAnimationCyberCelestialDelta4768).add(mediaCodec));
        }
        polarVoyageVectorDrawableTitaniumStorm2009.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageAnimatorSetSparkUltraMax8233(int i, long j) {
        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).releaseOutputBuffer(i, j);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, PolarVoyageToastStormTitaniumUltra7487 polarVoyageToastStormTitaniumUltra7487, long j, int i2) {
        ((PolarVoyageContentObserverDragonTitaniumNebula2107) this.PolarVoyageViewRogueMaster4778).PolarVoyageBarcodeScannerInfernoSolarSpark7767(i, polarVoyageToastStormTitaniumUltra7487, j, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002a, B:20:0x0044, B:23:0x0038, B:24:0x0046, B:25:0x004b), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002a, B:20:0x0044, B:23:0x0038, B:24:0x0046, B:25:0x004b), top: B:3:0x000e }] */
    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int PolarVoyageBitmapMaxTitanTitan7960() {
        boolean z;
        ((PolarVoyageContentObserverDragonTitaniumNebula2107) this.PolarVoyageViewRogueMaster4778).PolarVoyageItemDecorationUltraDeltaEpic7485();
        PolarVoyageImageAnalysisNovaUltra4777 polarVoyageImageAnalysisNovaUltra4777 = (PolarVoyageImageAnalysisNovaUltra4777) this.PolarVoyageBottomSheetOmegaNeo1907;
        synchronized (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185) {
            try {
                polarVoyageImageAnalysisNovaUltra4777.PolarVoyageMotionLayoutTransitionHeroVision4068();
                if (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageViewRogueMaster4778 <= 0 && !polarVoyageImageAnalysisNovaUltra4777.PolarVoyageCameraPixelBlaze2629) {
                    z = false;
                    int i = -1;
                    if (!z) {
                        return -1;
                    }
                    PolarVoyageSnackbarNovaQuantum9191 polarVoyageSnackbarNovaQuantum9191 = polarVoyageImageAnalysisNovaUltra4777.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    int i2 = polarVoyageSnackbarNovaQuantum9191.PolarVoyageZipVortexCelestial6185;
                    int i3 = polarVoyageSnackbarNovaQuantum9191.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = ((int[]) polarVoyageSnackbarNovaQuantum9191.PolarVoyageBarcodeScannerInfernoSolarSpark7767)[i2];
                        polarVoyageSnackbarNovaQuantum9191.PolarVoyageZipVortexCelestial6185 = (i2 + 1) & polarVoyageSnackbarNovaQuantum9191.PolarVoyageKotlinBetaPulseBeta3653;
                    }
                    return i;
                }
                z = true;
                int i4 = -1;
                if (!z) {
                }
            } finally {
            }
        }
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2, long j, int i3) {
        ((PolarVoyageContentObserverDragonTitaniumNebula2107) this.PolarVoyageViewRogueMaster4778).PolarVoyageBitmapVisionAuroraPixel4705(i, i2, j, i3);
    }

    public boolean PolarVoyageBottomSheetOmegaNeo1907(int i, int i2) {
        PolarVoyageDigitalInkRecognitionBetaDelta4802 polarVoyageDigitalInkRecognitionBetaDelta4802 = (PolarVoyageDigitalInkRecognitionBetaDelta4802) this.PolarVoyageBottomSheetOmegaNeo1907;
        int i3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageNotificationManagerStormPrimeRogue1703 polarVoyageNotificationManagerStormPrimeRogue1703 = (PolarVoyageNotificationManagerStormPrimeRogue1703) polarVoyageDigitalInkRecognitionBetaDelta4802.PolarVoyageItemDecorationUltraDeltaEpic7485[i + i3];
        PolarVoyageNotificationManagerStormPrimeRogue1703 polarVoyageNotificationManagerStormPrimeRogue17032 = (PolarVoyageNotificationManagerStormPrimeRogue1703) ((PolarVoyageDigitalInkRecognitionBetaDelta4802) this.PolarVoyageViewRogueMaster4778).PolarVoyageItemDecorationUltraDeltaEpic7485[i3 + i2];
        return PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageNotificationManagerStormPrimeRogue1703, polarVoyageNotificationManagerStormPrimeRogue17032) || polarVoyageNotificationManagerStormPrimeRogue1703.getClass() == polarVoyageNotificationManagerStormPrimeRogue17032.getClass();
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageCameraViewSpectraMaxSpectra2824(ArrayList arrayList) {
        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).unsubscribeFromVendorParameters(arrayList);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageContentProviderHyperSpark3838(Surface surface) {
        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setOutputSurface(surface);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002b, B:19:0x0036, B:22:0x003a, B:24:0x0048, B:25:0x006f, B:29:0x0065, B:30:0x0071, B:31:0x0076), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002b, B:19:0x0036, B:22:0x003a, B:24:0x0048, B:25:0x006f, B:29:0x0065, B:30:0x0071, B:31:0x0076), top: B:3:0x000e }] */
    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int PolarVoyageDiffUtilTurboStrike5735(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        ((PolarVoyageContentObserverDragonTitaniumNebula2107) this.PolarVoyageViewRogueMaster4778).PolarVoyageItemDecorationUltraDeltaEpic7485();
        PolarVoyageImageAnalysisNovaUltra4777 polarVoyageImageAnalysisNovaUltra4777 = (PolarVoyageImageAnalysisNovaUltra4777) this.PolarVoyageBottomSheetOmegaNeo1907;
        synchronized (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185) {
            try {
                polarVoyageImageAnalysisNovaUltra4777.PolarVoyageMotionLayoutTransitionHeroVision4068();
                if (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageViewRogueMaster4778 <= 0 && !polarVoyageImageAnalysisNovaUltra4777.PolarVoyageCameraPixelBlaze2629) {
                    z = false;
                    if (!z) {
                        return -1;
                    }
                    PolarVoyageSnackbarNovaQuantum9191 polarVoyageSnackbarNovaQuantum9191 = polarVoyageImageAnalysisNovaUltra4777.PolarVoyageBitmapVisionAuroraPixel4705;
                    int i = polarVoyageSnackbarNovaQuantum9191.PolarVoyageZipVortexCelestial6185;
                    int i2 = polarVoyageSnackbarNovaQuantum9191.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (i == i2) {
                        return -1;
                    }
                    if (i == i2) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i3 = ((int[]) polarVoyageSnackbarNovaQuantum9191.PolarVoyageBarcodeScannerInfernoSolarSpark7767)[i];
                    polarVoyageSnackbarNovaQuantum9191.PolarVoyageZipVortexCelestial6185 = polarVoyageSnackbarNovaQuantum9191.PolarVoyageKotlinBetaPulseBeta3653 & (i + 1);
                    if (i3 >= 0) {
                        polarVoyageImageAnalysisNovaUltra4777.PolarVoyageItemDecorationUltraDeltaEpic7485.getClass();
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) polarVoyageImageAnalysisNovaUltra4777.PolarVoyageDiffUtilTurboStrike5735.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i3 == -2) {
                        polarVoyageImageAnalysisNovaUltra4777.PolarVoyageItemDecorationUltraDeltaEpic7485 = (MediaFormat) polarVoyageImageAnalysisNovaUltra4777.PolarVoyageTextInputEditTextNebulaHero6651.remove();
                    }
                    return i3;
                }
                z = true;
                if (!z) {
                }
            } finally {
            }
        }
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageDisplayMetricsVortexDragon9516(ArrayList arrayList) {
        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).subscribeToVendorParameters(arrayList);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageDrawableDeltaHyperion5742() {
        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).detachOutputSurface();
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageMediaPlayerNebulaTurboLegend3509 polarVoyageMediaPlayerNebulaTurboLegend3509) {
        PolarVoyageImageAnalysisNovaUltra4777 polarVoyageImageAnalysisNovaUltra4777 = (PolarVoyageImageAnalysisNovaUltra4777) this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageMediaPlayerNebulaTurboLegend3509 polarVoyageMediaPlayerNebulaTurboLegend35092 = new PolarVoyageMediaPlayerNebulaTurboLegend3509(3, this, polarVoyageMediaPlayerNebulaTurboLegend3509);
        synchronized (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185) {
            polarVoyageImageAnalysisNovaUltra4777.PolarVoyageMotionLayoutTransitionHeroVision4068();
            polarVoyageMediaPlayerNebulaTurboLegend35092.run();
        }
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageKotlinBetaPulseBeta3653(Bundle bundle) {
        ((PolarVoyageContentObserverDragonTitaniumNebula2107) this.PolarVoyageViewRogueMaster4778).PolarVoyageKotlinBetaPulseBeta3653(bundle);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public ByteBuffer PolarVoyageNavigationViewHyperHyperHyperion1793(int i) {
        return ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getOutputBuffer(i);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageRemoteModelManagerOlympianCelestial9141(PolarVoyagePreviewDragonShadowForce2497 polarVoyagePreviewDragonShadowForce2497, Handler handler) {
        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setOnFrameRenderedListener(new PolarVoyageLintPhoenixSolar8919(this, polarVoyagePreviewDragonShadowForce2497, 0), handler);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public boolean PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027) {
        PolarVoyageImageAnalysisNovaUltra4777 polarVoyageImageAnalysisNovaUltra4777 = (PolarVoyageImageAnalysisNovaUltra4777) this.PolarVoyageBottomSheetOmegaNeo1907;
        synchronized (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185) {
            polarVoyageImageAnalysisNovaUltra4777.PolarVoyageSnackbarGammaEclipse2140 = polarVoyageAdapterTitanSpark4027;
        }
        return true;
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public ByteBuffer PolarVoyageSnackbarGammaEclipse2140(int i) {
        return ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getInputBuffer(i);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageStrictModeLegendEpic1532(int i) {
        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setVideoScalingMode(i);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageTextInputEditTextNebulaHero6651(int i) {
        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).releaseOutputBuffer(i, false);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public MediaFormat PolarVoyageViewRogueMaster4778() {
        MediaFormat mediaFormat;
        PolarVoyageImageAnalysisNovaUltra4777 polarVoyageImageAnalysisNovaUltra4777 = (PolarVoyageImageAnalysisNovaUltra4777) this.PolarVoyageBottomSheetOmegaNeo1907;
        synchronized (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185) {
            try {
                mediaFormat = polarVoyageImageAnalysisNovaUltra4777.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageZipVortexCelestial6185() {
        PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493;
        PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno34932;
        try {
            if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 == 1) {
                ((PolarVoyageContentObserverDragonTitaniumNebula2107) this.PolarVoyageViewRogueMaster4778).shutdown();
                PolarVoyageImageAnalysisNovaUltra4777 polarVoyageImageAnalysisNovaUltra4777 = (PolarVoyageImageAnalysisNovaUltra4777) this.PolarVoyageBottomSheetOmegaNeo1907;
                synchronized (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185) {
                    polarVoyageImageAnalysisNovaUltra4777.PolarVoyageCameraPixelBlaze2629 = true;
                    polarVoyageImageAnalysisNovaUltra4777.PolarVoyageMotionLayoutTransitionHeroVision4068.quit();
                    polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185();
                }
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
            if (this.PolarVoyageStrictModeLegendEpic1532) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).stop();
                }
                if (i >= 35 && (polarVoyageAlarmManagerAlphaInferno34932 = (PolarVoyageAlarmManagerAlphaInferno3493) this.PolarVoyageCameraPixelBlaze2629) != null) {
                    polarVoyageAlarmManagerAlphaInferno34932.PolarVoyageLayerDrawableShadowTitaniumOmega1942((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                }
                ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).release();
                this.PolarVoyageStrictModeLegendEpic1532 = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.PolarVoyageStrictModeLegendEpic1532) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).stop();
                    }
                    if (i2 >= 35 && (polarVoyageAlarmManagerAlphaInferno3493 = (PolarVoyageAlarmManagerAlphaInferno3493) this.PolarVoyageCameraPixelBlaze2629) != null) {
                        polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageLayerDrawableShadowTitaniumOmega1942((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                    }
                    ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).release();
                    this.PolarVoyageStrictModeLegendEpic1532 = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void flush() {
        ((PolarVoyageContentObserverDragonTitaniumNebula2107) this.PolarVoyageViewRogueMaster4778).flush();
        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).flush();
        PolarVoyageImageAnalysisNovaUltra4777 polarVoyageImageAnalysisNovaUltra4777 = (PolarVoyageImageAnalysisNovaUltra4777) this.PolarVoyageBottomSheetOmegaNeo1907;
        synchronized (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185) {
            polarVoyageImageAnalysisNovaUltra4777.PolarVoyageViewRogueMaster4778++;
            Handler handler = polarVoyageImageAnalysisNovaUltra4777.PolarVoyageKotlinBetaPulseBeta3653;
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            handler.post(new PolarVoyageLightSensorSparkBlazeTitanium9192(4, polarVoyageImageAnalysisNovaUltra4777));
        }
        ((MediaCodec) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).start();
    }

    public PolarVoyageVectorDrawableTitaniumStorm2009(PolarVoyageDataBindingRogueOlympianPulse5004 polarVoyageDataBindingRogueOlympianPulse5004, PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora9729, int i, PolarVoyageDigitalInkRecognitionBetaDelta4802 polarVoyageDigitalInkRecognitionBetaDelta4802, PolarVoyageDigitalInkRecognitionBetaDelta4802 polarVoyageDigitalInkRecognitionBetaDelta48022, boolean z) {
        this.PolarVoyageCameraPixelBlaze2629 = polarVoyageDataBindingRogueOlympianPulse5004;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageGyroscopePulseAurora9729;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageDigitalInkRecognitionBetaDelta4802;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageDigitalInkRecognitionBetaDelta48022;
        this.PolarVoyageStrictModeLegendEpic1532 = z;
    }
}
