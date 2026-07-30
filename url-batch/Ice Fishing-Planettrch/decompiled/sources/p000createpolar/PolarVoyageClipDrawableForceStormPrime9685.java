package p000createpolar;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageClipDrawableForceStormPrime9685 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater PolarVoyageContentProviderHyperSpark3838 = AtomicIntegerFieldUpdater.newUpdater(PolarVoyageClipDrawableForceStormPrime9685.class, "workerCtl$volatile");
    public long PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageCameraPixelBlaze2629;
    public boolean PolarVoyageDrawableDeltaHyperion5742;
    public final PolarVoyageOnDeviceTranslatorPhoenixOlympian8362 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public PolarVoyageDebugOmegaUltraStorm2738 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ PolarVoyagePagingSourcePixelTitanAlpha1957 PolarVoyageSnackbarGammaEclipse2140;
    public final PolarVoyageFragmentTransactionMaxMaxMega5005 PolarVoyageStrictModeLegendEpic1532;
    public long PolarVoyageViewRogueMaster4778;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public PolarVoyageClipDrawableForceStormPrime9685(PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha1957, int i) {
        this.PolarVoyageSnackbarGammaEclipse2140 = polarVoyagePagingSourcePixelTitanAlpha1957;
        setDaemon(true);
        setContextClassLoader(PolarVoyagePagingSourcePixelTitanAlpha1957.class.getClassLoader());
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageOnDeviceTranslatorPhoenixOlympian8362();
        this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageFragmentTransactionMaxMaxMega5005();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageBottomSheetOmegaNeo1907;
        this.nextParkedWorker = PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageNavigationViewHyperHyperHyperion1793;
        int nanoTime = (int) System.nanoTime();
        this.PolarVoyageCameraPixelBlaze2629 = nanoTime == 0 ? 42 : nanoTime;
        PolarVoyageDiffUtilTurboStrike5735(i);
    }

    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        int i2 = this.PolarVoyageCameraPixelBlaze2629;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.PolarVoyageCameraPixelBlaze2629 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageBitmapVisionAuroraPixel4705() {
        int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(2);
        PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha1957 = this.PolarVoyageSnackbarGammaEclipse2140;
        PolarVoyageShapeAppearanceEliteTurboMega9661 polarVoyageShapeAppearanceEliteTurboMega9661 = polarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageCameraPixelBlaze2629;
        PolarVoyageShapeAppearanceEliteTurboMega9661 polarVoyageShapeAppearanceEliteTurboMega96612 = polarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageViewRogueMaster4778;
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 0) {
            PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian9897 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) polarVoyageShapeAppearanceEliteTurboMega96612.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            return polarVoyageModelInputOutputNebulaRogueOlympian9897 != null ? polarVoyageModelInputOutputNebulaRogueOlympian9897 : (PolarVoyageModelInputOutputNebulaRogueOlympian9897) polarVoyageShapeAppearanceEliteTurboMega9661.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian98972 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) polarVoyageShapeAppearanceEliteTurboMega9661.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        return polarVoyageModelInputOutputNebulaRogueOlympian98972 != null ? polarVoyageModelInputOutputNebulaRogueOlympian98972 : (PolarVoyageModelInputOutputNebulaRogueOlympian9897) polarVoyageShapeAppearanceEliteTurboMega96612.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageBottomSheetOmegaNeo1907);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageDebugOmegaUltraStorm2738 polarVoyageDebugOmegaUltraStorm2738) {
        PolarVoyageDebugOmegaUltraStorm2738 polarVoyageDebugOmegaUltraStorm27382 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        boolean z = polarVoyageDebugOmegaUltraStorm27382 == PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (z) {
            PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageContentProviderHyperSpark3838.addAndGet(this.PolarVoyageSnackbarGammaEclipse2140, 4398046511104L);
        }
        if (polarVoyageDebugOmegaUltraStorm27382 != polarVoyageDebugOmegaUltraStorm2738) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageDebugOmegaUltraStorm2738;
        }
        return z;
    }

    public final Object PolarVoyageKotlinBetaPulseBeta3653() {
        return this.nextParkedWorker;
    }

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return this.indexInArray;
    }

    public final PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageStrictModeLegendEpic1532(int i) {
        long j;
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian9897;
        long j2;
        long j3;
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian98972;
        AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageContentProviderHyperSpark3838;
        PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha1957 = this.PolarVoyageSnackbarGammaEclipse2140;
        int i2 = (int) (atomicLongFieldUpdater.get(polarVoyagePagingSourcePixelTitanAlpha1957) & 2097151);
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian98973 = null;
        if (i2 < 2) {
            return null;
        }
        int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
        int i3 = 0;
        long j4 = Long.MAX_VALUE;
        while (i3 < i2) {
            PolarVoyageBarcodeScannerInfernoSolarSpark7767++;
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 > i2) {
                PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 1;
            }
            PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime9685 = (PolarVoyageClipDrawableForceStormPrime9685) polarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            if (polarVoyageClipDrawableForceStormPrime9685 != null && polarVoyageClipDrawableForceStormPrime9685 != this) {
                PolarVoyageOnDeviceTranslatorPhoenixOlympian8362 polarVoyageOnDeviceTranslatorPhoenixOlympian8362 = polarVoyageClipDrawableForceStormPrime9685.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (i == 3) {
                    polarVoyageModelInputOutputNebulaRogueOlympian9897 = polarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    j = 0;
                } else {
                    polarVoyageOnDeviceTranslatorPhoenixOlympian8362.getClass();
                    int i4 = PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362);
                    int i5 = PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageKotlinBetaPulseBeta3653.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageBitmapVisionAuroraPixel4705.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362) != 0) {
                            int i6 = i4 + 1;
                            polarVoyageModelInputOutputNebulaRogueOlympian9897 = polarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageKotlinBetaPulseBeta3653(i4, z);
                            if (polarVoyageModelInputOutputNebulaRogueOlympian9897 != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                    polarVoyageModelInputOutputNebulaRogueOlympian9897 = polarVoyageModelInputOutputNebulaRogueOlympian98973;
                }
                PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega5005 = this.PolarVoyageStrictModeLegendEpic1532;
                if (polarVoyageModelInputOutputNebulaRogueOlympian9897 != null) {
                    polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageModelInputOutputNebulaRogueOlympian9897;
                    polarVoyageModelInputOutputNebulaRogueOlympian98972 = polarVoyageModelInputOutputNebulaRogueOlympian98973;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian98974 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) atomicReferenceFieldUpdater.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362);
                        if (polarVoyageModelInputOutputNebulaRogueOlympian98974 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((polarVoyageModelInputOutputNebulaRogueOlympian98974.PolarVoyageStrictModeLegendEpic1532 ? 1 : 2) & i) == 0) {
                            break;
                        }
                        PolarVoyageProGuardOlympianShadowPrime7120.PolarVoyageDiffUtilTurboStrike5735.getClass();
                        PolarVoyageOnDeviceTranslatorPhoenixOlympian8362 polarVoyageOnDeviceTranslatorPhoenixOlympian83622 = polarVoyageOnDeviceTranslatorPhoenixOlympian8362;
                        long nanoTime = System.nanoTime() - polarVoyageModelInputOutputNebulaRogueOlympian98974.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        long j5 = PolarVoyageProGuardOlympianShadowPrime7120.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            polarVoyageModelInputOutputNebulaRogueOlympian98972 = null;
                            break;
                        }
                        do {
                            polarVoyageModelInputOutputNebulaRogueOlympian98972 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(polarVoyageOnDeviceTranslatorPhoenixOlympian83622, polarVoyageModelInputOutputNebulaRogueOlympian98974, null)) {
                                polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageModelInputOutputNebulaRogueOlympian98974;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(polarVoyageOnDeviceTranslatorPhoenixOlympian83622) == polarVoyageModelInputOutputNebulaRogueOlympian98974);
                        polarVoyageOnDeviceTranslatorPhoenixOlympian8362 = polarVoyageOnDeviceTranslatorPhoenixOlympian83622;
                        polarVoyageModelInputOutputNebulaRogueOlympian98973 = null;
                    }
                    j3 = -2;
                    polarVoyageModelInputOutputNebulaRogueOlympian98972 = polarVoyageModelInputOutputNebulaRogueOlympian98973;
                }
                if (j3 == j2) {
                    PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian98975 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageModelInputOutputNebulaRogueOlympian98972;
                    return polarVoyageModelInputOutputNebulaRogueOlympian98975;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i3++;
            polarVoyageModelInputOutputNebulaRogueOlympian98973 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.PolarVoyageViewRogueMaster4778 = j4;
        return null;
    }

    public final void PolarVoyageTextInputEditTextNebulaHero6651(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageZipVortexCelestial6185(boolean z) {
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageBitmapVisionAuroraPixel4705;
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageBitmapVisionAuroraPixel47052;
        long j;
        PolarVoyageDebugOmegaUltraStorm2738 polarVoyageDebugOmegaUltraStorm2738 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha1957 = this.PolarVoyageSnackbarGammaEclipse2140;
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian9897 = null;
        PolarVoyageOnDeviceTranslatorPhoenixOlympian8362 polarVoyageOnDeviceTranslatorPhoenixOlympian8362 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageDebugOmegaUltraStorm2738 polarVoyageDebugOmegaUltraStorm27382 = PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (polarVoyageDebugOmegaUltraStorm2738 != polarVoyageDebugOmegaUltraStorm27382) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageContentProviderHyperSpark3838;
            do {
                j = atomicLongFieldUpdater.get(polarVoyagePagingSourcePixelTitanAlpha1957);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    polarVoyageOnDeviceTranslatorPhoenixOlympian8362.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian98972 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) atomicReferenceFieldUpdater.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362);
                        if (polarVoyageModelInputOutputNebulaRogueOlympian98972 != null && polarVoyageModelInputOutputNebulaRogueOlympian98972.PolarVoyageStrictModeLegendEpic1532) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(polarVoyageOnDeviceTranslatorPhoenixOlympian8362, polarVoyageModelInputOutputNebulaRogueOlympian98972, null)) {
                                if (atomicReferenceFieldUpdater.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362) != polarVoyageModelInputOutputNebulaRogueOlympian98972) {
                                    break;
                                }
                            }
                            polarVoyageModelInputOutputNebulaRogueOlympian9897 = polarVoyageModelInputOutputNebulaRogueOlympian98972;
                            break loop1;
                        }
                    }
                    int i = PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362);
                    int i2 = PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageKotlinBetaPulseBeta3653.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362);
                    while (true) {
                        if (i == i2 || PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageBitmapVisionAuroraPixel4705.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362) == 0) {
                            break;
                        }
                        i2--;
                        PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageKotlinBetaPulseBeta3653(i2, true);
                        if (PolarVoyageKotlinBetaPulseBeta3653 != null) {
                            polarVoyageModelInputOutputNebulaRogueOlympian9897 = PolarVoyageKotlinBetaPulseBeta3653;
                            break;
                        }
                    }
                    if (polarVoyageModelInputOutputNebulaRogueOlympian9897 != null) {
                        return polarVoyageModelInputOutputNebulaRogueOlympian9897;
                    }
                    PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian98973 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) polarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageCameraPixelBlaze2629.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                    return polarVoyageModelInputOutputNebulaRogueOlympian98973 == null ? PolarVoyageStrictModeLegendEpic1532(1) : polarVoyageModelInputOutputNebulaRogueOlympian98973;
                }
            } while (!PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageContentProviderHyperSpark3838.compareAndSet(polarVoyagePagingSourcePixelTitanAlpha1957, j, j - 4398046511104L));
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageDebugOmegaUltraStorm27382;
        }
        if (z) {
            boolean z2 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageItemDecorationUltraDeltaEpic7485 * 2) == 0;
            if (z2 && (PolarVoyageBitmapVisionAuroraPixel47052 = PolarVoyageBitmapVisionAuroraPixel4705()) != null) {
                return PolarVoyageBitmapVisionAuroraPixel47052;
            }
            polarVoyageOnDeviceTranslatorPhoenixOlympian8362.getClass();
            PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian98974 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageMotionLayoutTransitionHeroVision4068.getAndSet(polarVoyageOnDeviceTranslatorPhoenixOlympian8362, null);
            if (polarVoyageModelInputOutputNebulaRogueOlympian98974 == null) {
                polarVoyageModelInputOutputNebulaRogueOlympian98974 = polarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageMotionLayoutTransitionHeroVision4068();
            }
            if (polarVoyageModelInputOutputNebulaRogueOlympian98974 != null) {
                return polarVoyageModelInputOutputNebulaRogueOlympian98974;
            }
            if (!z2 && (PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705()) != null) {
                return PolarVoyageBitmapVisionAuroraPixel4705;
            }
        } else {
            PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageBitmapVisionAuroraPixel47053 = PolarVoyageBitmapVisionAuroraPixel4705();
            if (PolarVoyageBitmapVisionAuroraPixel47053 != null) {
                return PolarVoyageBitmapVisionAuroraPixel47053;
            }
        }
        return PolarVoyageStrictModeLegendEpic1532(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageRemoteModelManagerOlympianCelestial9141.get(this.PolarVoyageSnackbarGammaEclipse2140) != 1) {
                PolarVoyageDebugOmegaUltraStorm2738 polarVoyageDebugOmegaUltraStorm2738 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageDebugOmegaUltraStorm2738 polarVoyageDebugOmegaUltraStorm27382 = PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageViewRogueMaster4778;
                if (polarVoyageDebugOmegaUltraStorm2738 == polarVoyageDebugOmegaUltraStorm27382) {
                    break loop0;
                }
                PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(this.PolarVoyageDrawableDeltaHyperion5742);
                if (PolarVoyageZipVortexCelestial6185 != null) {
                    this.PolarVoyageViewRogueMaster4778 = 0L;
                    PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha1957 = this.PolarVoyageSnackbarGammaEclipse2140;
                    this.PolarVoyageBottomSheetOmegaNeo1907 = 0L;
                    if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageStrictModeLegendEpic1532;
                    }
                    if (PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532) {
                        if (PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageStrictModeLegendEpic1532) && !polarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageRotateAnimationCyberCelestialDelta4768() && !polarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageStrictModeLegendEpic1532(PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageContentProviderHyperSpark3838.get(polarVoyagePagingSourcePixelTitanAlpha1957))) {
                            polarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageRotateAnimationCyberCelestialDelta4768();
                        }
                        try {
                            PolarVoyageZipVortexCelestial6185.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageContentProviderHyperSpark3838.addAndGet(polarVoyagePagingSourcePixelTitanAlpha1957, -2097152L);
                        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 != polarVoyageDebugOmegaUltraStorm27382) {
                            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageBottomSheetOmegaNeo1907;
                        }
                    } else {
                        try {
                            PolarVoyageZipVortexCelestial6185.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.PolarVoyageDrawableDeltaHyperion5742 = false;
                    if (this.PolarVoyageViewRogueMaster4778 == 0) {
                        Object obj = this.nextParkedWorker;
                        PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageNavigationViewHyperHyperHyperion1793;
                        if (obj != polarVoyageAssetManagerEclipseHyperInferno7091) {
                            PolarVoyageContentProviderHyperSpark3838.set(this, -1);
                            while (this.nextParkedWorker != PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageNavigationViewHyperHyperHyperion1793) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = PolarVoyageContentProviderHyperSpark3838;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha19572 = this.PolarVoyageSnackbarGammaEclipse2140;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageRemoteModelManagerOlympianCelestial9141;
                                    if (atomicIntegerFieldUpdater2.get(polarVoyagePagingSourcePixelTitanAlpha19572) == 1) {
                                        break;
                                    }
                                    PolarVoyageDebugOmegaUltraStorm2738 polarVoyageDebugOmegaUltraStorm27383 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                    PolarVoyageDebugOmegaUltraStorm2738 polarVoyageDebugOmegaUltraStorm27384 = PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageViewRogueMaster4778;
                                    if (polarVoyageDebugOmegaUltraStorm27383 == polarVoyageDebugOmegaUltraStorm27384) {
                                        break;
                                    }
                                    PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                                    Thread.interrupted();
                                    if (this.PolarVoyageBottomSheetOmegaNeo1907 == 0) {
                                        j = 2097151;
                                        this.PolarVoyageBottomSheetOmegaNeo1907 = System.nanoTime() + this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                                    if (System.nanoTime() - this.PolarVoyageBottomSheetOmegaNeo1907 >= 0) {
                                        this.PolarVoyageBottomSheetOmegaNeo1907 = 0L;
                                        PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha19573 = this.PolarVoyageSnackbarGammaEclipse2140;
                                        synchronized (polarVoyagePagingSourcePixelTitanAlpha19573.PolarVoyageDrawableDeltaHyperion5742) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(polarVoyagePagingSourcePixelTitanAlpha19573) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageContentProviderHyperSpark3838;
                                                    if (((int) (atomicLongFieldUpdater.get(polarVoyagePagingSourcePixelTitanAlpha19573) & j)) > polarVoyagePagingSourcePixelTitanAlpha19573.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            PolarVoyageDiffUtilTurboStrike5735(0);
                                                            polarVoyagePagingSourcePixelTitanAlpha19573.PolarVoyageDiffUtilTurboStrike5735(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(polarVoyagePagingSourcePixelTitanAlpha19573) & j);
                                                            if (andDecrement != i) {
                                                                Object PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyagePagingSourcePixelTitanAlpha19573.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageMotionLayoutTransitionHeroVision4068(andDecrement);
                                                                PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
                                                                PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime9685 = (PolarVoyageClipDrawableForceStormPrime9685) PolarVoyageMotionLayoutTransitionHeroVision4068;
                                                                polarVoyagePagingSourcePixelTitanAlpha19573.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageKotlinBetaPulseBeta3653(i, polarVoyageClipDrawableForceStormPrime9685);
                                                                polarVoyageClipDrawableForceStormPrime9685.PolarVoyageDiffUtilTurboStrike5735(i);
                                                                polarVoyagePagingSourcePixelTitanAlpha19573.PolarVoyageDiffUtilTurboStrike5735(polarVoyageClipDrawableForceStormPrime9685, andDecrement, i);
                                                            }
                                                            polarVoyagePagingSourcePixelTitanAlpha19573.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageKotlinBetaPulseBeta3653(andDecrement, null);
                                                            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageDebugOmegaUltraStorm27384;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha19574 = this.PolarVoyageSnackbarGammaEclipse2140;
                            if (this.nextParkedWorker == polarVoyageAssetManagerEclipseHyperInferno7091) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageSnackbarGammaEclipse2140;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(polarVoyagePagingSourcePixelTitanAlpha19574);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = polarVoyagePagingSourcePixelTitanAlpha19574.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageMotionLayoutTransitionHeroVision4068((int) (j2 & 2097151));
                                    PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha19575 = polarVoyagePagingSourcePixelTitanAlpha19574;
                                    if (PolarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageSnackbarGammaEclipse2140.compareAndSet(polarVoyagePagingSourcePixelTitanAlpha19575, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        polarVoyagePagingSourcePixelTitanAlpha19574 = polarVoyagePagingSourcePixelTitanAlpha19575;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.PolarVoyageViewRogueMaster4778);
                        this.PolarVoyageViewRogueMaster4778 = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageViewRogueMaster4778);
    }
}
