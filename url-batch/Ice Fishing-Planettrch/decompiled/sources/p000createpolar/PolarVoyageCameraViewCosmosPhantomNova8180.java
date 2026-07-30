package p000createpolar;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageCameraViewCosmosPhantomNova8180 {
    public final PolarVoyageDialogSpectraOlympianTurbo4558 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageKotlinBetaPulseBeta3653 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageCameraViewCosmosPhantomNova8180.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater PolarVoyageBarcodeScannerInfernoSolarSpark7767 = AtomicLongFieldUpdater.newUpdater(PolarVoyageCameraViewCosmosPhantomNova8180.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageBitmapVisionAuroraPixel4705 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageCameraViewCosmosPhantomNova8180.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater PolarVoyageDiffUtilTurboStrike5735 = AtomicLongFieldUpdater.newUpdater(PolarVoyageCameraViewCosmosPhantomNova8180.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater PolarVoyageTextInputEditTextNebulaHero6651 = AtomicIntegerFieldUpdater.newUpdater(PolarVoyageCameraViewCosmosPhantomNova8180.class, "_availablePermits$volatile");

    public PolarVoyageCameraViewCosmosPhantomNova8180(int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        if (i <= 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Semaphore should have at least 1 permit, but had ", i));
            throw null;
        }
        if (i < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("The number of acquired permits should be in 0..", i));
            throw null;
        }
        PolarVoyageRoomMegaStormVision7493 polarVoyageRoomMegaStormVision7493 = new PolarVoyageRoomMegaStormVision7493(0L, null, 2);
        this.head$volatile = polarVoyageRoomMegaStormVision7493;
        this.tail$volatile = polarVoyageRoomMegaStormVision7493;
        this._availablePermits$volatile = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageDialogSpectraOlympianTurbo4558(2, this);
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653() {
        int i;
        Object PolarVoyageDisplayMetricsVortexDragon9516;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = PolarVoyageTextInputEditTextNebulaHero6651;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.PolarVoyageZipVortexCelestial6185;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageKotlinBetaPulseBeta3653;
            PolarVoyageRoomMegaStormVision7493 polarVoyageRoomMegaStormVision7493 = (PolarVoyageRoomMegaStormVision7493) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = PolarVoyageBarcodeScannerInfernoSolarSpark7767.getAndIncrement(this);
            long j = andIncrement2 / PolarVoyageScrollViewVisionNovaX2515.PolarVoyageDiffUtilTurboStrike5735;
            PolarVoyageDragEventTurboStormNeo1989 polarVoyageDragEventTurboStormNeo1989 = PolarVoyageDragEventTurboStormNeo1989.PolarVoyageSnackbarGammaEclipse2140;
            while (true) {
                PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageRoomMegaStormVision7493, j, polarVoyageDragEventTurboStormNeo1989);
                if (PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageDisplayMetricsVortexDragon9516)) {
                    break;
                }
                PolarVoyageRunnableSparkRogue7241 PolarVoyageBarcodeScannerInfernoSolarSpark77672 = PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsVortexDragon9516);
                while (true) {
                    PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue7241 = (PolarVoyageRunnableSparkRogue7241) atomicReferenceFieldUpdater.get(this);
                    if (polarVoyageRunnableSparkRogue7241.PolarVoyageKotlinBetaPulseBeta3653 >= PolarVoyageBarcodeScannerInfernoSolarSpark77672.PolarVoyageKotlinBetaPulseBeta3653) {
                        break;
                    }
                    if (!PolarVoyageBarcodeScannerInfernoSolarSpark77672.PolarVoyageStrictModeLegendEpic1532()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, polarVoyageRunnableSparkRogue7241, PolarVoyageBarcodeScannerInfernoSolarSpark77672)) {
                        if (atomicReferenceFieldUpdater.get(this) != polarVoyageRunnableSparkRogue7241) {
                            if (PolarVoyageBarcodeScannerInfernoSolarSpark77672.PolarVoyageBitmapVisionAuroraPixel4705()) {
                                PolarVoyageBarcodeScannerInfernoSolarSpark77672.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                            }
                        }
                    }
                    if (polarVoyageRunnableSparkRogue7241.PolarVoyageBitmapVisionAuroraPixel4705()) {
                        polarVoyageRunnableSparkRogue7241.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                    }
                }
            }
            PolarVoyageRoomMegaStormVision7493 polarVoyageRoomMegaStormVision74932 = (PolarVoyageRoomMegaStormVision7493) PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsVortexDragon9516);
            AtomicReferenceArray atomicReferenceArray = polarVoyageRoomMegaStormVision74932.PolarVoyageBitmapVisionAuroraPixel4705;
            polarVoyageRoomMegaStormVision74932.PolarVoyageZipVortexCelestial6185();
            z = false;
            if (polarVoyageRoomMegaStormVision74932.PolarVoyageKotlinBetaPulseBeta3653 <= j) {
                int i3 = (int) (andIncrement2 % PolarVoyageScrollViewVisionNovaX2515.PolarVoyageDiffUtilTurboStrike5735);
                Object andSet = atomicReferenceArray.getAndSet(i3, PolarVoyageScrollViewVisionNovaX2515.PolarVoyageMotionLayoutTransitionHeroVision4068);
                if (andSet == null) {
                    int i4 = PolarVoyageScrollViewVisionNovaX2515.PolarVoyageZipVortexCelestial6185;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == PolarVoyageScrollViewVisionNovaX2515.PolarVoyageKotlinBetaPulseBeta3653) {
                            z = true;
                            break;
                        }
                    }
                    PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageScrollViewVisionNovaX2515.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno70912 = PolarVoyageScrollViewVisionNovaX2515.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, polarVoyageAssetManagerEclipseHyperInferno7091, polarVoyageAssetManagerEclipseHyperInferno70912)) {
                            if (atomicReferenceArray.get(i3) != polarVoyageAssetManagerEclipseHyperInferno7091) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != PolarVoyageScrollViewVisionNovaX2515.PolarVoyageBitmapVisionAuroraPixel4705) {
                    if (!(andSet instanceof PolarVoyageAdapterAuroraStrike4860)) {
                        PolarVoyageMeteringPointSolarMax4741.PolarVoyageBarcodeScannerInfernoSolarSpark7767(andSet, "unexpected: ");
                        return;
                    }
                    PolarVoyageAdapterAuroraStrike4860 polarVoyageAdapterAuroraStrike4860 = (PolarVoyageAdapterAuroraStrike4860) andSet;
                    PolarVoyageAssetManagerEclipseHyperInferno7091 PolarVoyageMotionLayoutForceEpicAurora7183 = polarVoyageAdapterAuroraStrike4860.PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185, this.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    if (PolarVoyageMotionLayoutForceEpicAurora7183 != null) {
                        polarVoyageAdapterAuroraStrike4860.PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageMotionLayoutForceEpicAurora7183);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }

    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageScaleAnimationCelestialAuroraNeo6553 polarVoyageScaleAnimationCelestialAuroraNeo6553) {
        Object PolarVoyageDisplayMetricsVortexDragon9516;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageBitmapVisionAuroraPixel4705;
        PolarVoyageRoomMegaStormVision7493 polarVoyageRoomMegaStormVision7493 = (PolarVoyageRoomMegaStormVision7493) atomicReferenceFieldUpdater.get(this);
        long andIncrement = PolarVoyageDiffUtilTurboStrike5735.getAndIncrement(this);
        PolarVoyageScaleDrawableSparkStrikeSpark8684 polarVoyageScaleDrawableSparkStrikeSpark8684 = PolarVoyageScaleDrawableSparkStrikeSpark8684.PolarVoyageSnackbarGammaEclipse2140;
        long j = andIncrement / PolarVoyageScrollViewVisionNovaX2515.PolarVoyageDiffUtilTurboStrike5735;
        loop0: while (true) {
            PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageRoomMegaStormVision7493, j, polarVoyageScaleDrawableSparkStrikeSpark8684);
            if (!PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageDisplayMetricsVortexDragon9516)) {
                PolarVoyageRunnableSparkRogue7241 PolarVoyageBarcodeScannerInfernoSolarSpark77672 = PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsVortexDragon9516);
                while (true) {
                    PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue7241 = (PolarVoyageRunnableSparkRogue7241) atomicReferenceFieldUpdater.get(this);
                    if (polarVoyageRunnableSparkRogue7241.PolarVoyageKotlinBetaPulseBeta3653 >= PolarVoyageBarcodeScannerInfernoSolarSpark77672.PolarVoyageKotlinBetaPulseBeta3653) {
                        break loop0;
                    }
                    if (!PolarVoyageBarcodeScannerInfernoSolarSpark77672.PolarVoyageStrictModeLegendEpic1532()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, polarVoyageRunnableSparkRogue7241, PolarVoyageBarcodeScannerInfernoSolarSpark77672)) {
                        if (atomicReferenceFieldUpdater.get(this) != polarVoyageRunnableSparkRogue7241) {
                            if (PolarVoyageBarcodeScannerInfernoSolarSpark77672.PolarVoyageBitmapVisionAuroraPixel4705()) {
                                PolarVoyageBarcodeScannerInfernoSolarSpark77672.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                            }
                        }
                    }
                    if (polarVoyageRunnableSparkRogue7241.PolarVoyageBitmapVisionAuroraPixel4705()) {
                        polarVoyageRunnableSparkRogue7241.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                    }
                }
            } else {
                break;
            }
        }
        PolarVoyageRoomMegaStormVision7493 polarVoyageRoomMegaStormVision74932 = (PolarVoyageRoomMegaStormVision7493) PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsVortexDragon9516);
        AtomicReferenceArray atomicReferenceArray = polarVoyageRoomMegaStormVision74932.PolarVoyageBitmapVisionAuroraPixel4705;
        int i = (int) (andIncrement % PolarVoyageScrollViewVisionNovaX2515.PolarVoyageDiffUtilTurboStrike5735);
        while (!atomicReferenceArray.compareAndSet(i, null, polarVoyageScaleAnimationCelestialAuroraNeo6553)) {
            if (atomicReferenceArray.get(i) != null) {
                PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageScrollViewVisionNovaX2515.PolarVoyageMotionLayoutTransitionHeroVision4068;
                PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno70912 = PolarVoyageScrollViewVisionNovaX2515.PolarVoyageKotlinBetaPulseBeta3653;
                while (!atomicReferenceArray.compareAndSet(i, polarVoyageAssetManagerEclipseHyperInferno7091, polarVoyageAssetManagerEclipseHyperInferno70912)) {
                    if (atomicReferenceArray.get(i) != polarVoyageAssetManagerEclipseHyperInferno7091) {
                        return false;
                    }
                }
                ((PolarVoyageAdapterAuroraStrike4860) polarVoyageScaleAnimationCelestialAuroraNeo6553).PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185, this.PolarVoyageMotionLayoutTransitionHeroVision4068);
                return true;
            }
        }
        polarVoyageScaleAnimationCelestialAuroraNeo6553.PolarVoyageZipVortexCelestial6185(polarVoyageRoomMegaStormVision74932, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        r5.PolarVoyageKotlinBetaPulseBeta3653(r3, r4.PolarVoyageMotionLayoutTransitionHeroVision4068);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PolarVoyageZipVortexCelestial6185(PolarVoyageMotionSceneHyperVisionVision6497 polarVoyageMotionSceneHyperVisionVision6497) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = PolarVoyageTextInputEditTextNebulaHero6651;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.PolarVoyageZipVortexCelestial6185;
        } while (andDecrement > i);
        PolarVoyageFilterGammaStrikeNova8373 polarVoyageFilterGammaStrikeNova8373 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
        if (andDecrement <= 0) {
            PolarVoyageDebugStrikeEclipseQuantum3290 PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageToolbarEclipseInfernoHero6368(PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageCanvasElitePhoenix4750(polarVoyageMotionSceneHyperVisionVision6497));
            try {
                if (!PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageToolbarEclipseInfernoHero6368)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                break;
                            }
                            if (PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageToolbarEclipseInfernoHero6368)) {
                                break;
                            }
                        }
                    }
                }
                Object PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageRemoteModelManagerOlympianCelestial9141();
                PolarVoyageDrawableCompatAuroraPulse6414 polarVoyageDrawableCompatAuroraPulse6414 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != polarVoyageDrawableCompatAuroraPulse6414) {
                    PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageFilterGammaStrikeNova8373;
                }
                if (PolarVoyageRemoteModelManagerOlympianCelestial9141 == polarVoyageDrawableCompatAuroraPulse6414) {
                    return PolarVoyageRemoteModelManagerOlympianCelestial9141;
                }
            } catch (Throwable th) {
                PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageLifecycleOlympianOmega3762();
                throw th;
            }
        }
        return polarVoyageFilterGammaStrikeNova8373;
    }
}
