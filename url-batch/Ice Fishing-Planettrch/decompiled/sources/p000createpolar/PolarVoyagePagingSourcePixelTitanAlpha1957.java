package p000createpolar;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePagingSourcePixelTitanAlpha1957 implements Executor, Closeable {
    public final String PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageShapeAppearanceEliteTurboMega9661 PolarVoyageCameraPixelBlaze2629;
    public final PolarVoyageDisplayMetricsSolarTitanium9667 PolarVoyageDrawableDeltaHyperion5742;
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final long PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;
    public final PolarVoyageShapeAppearanceEliteTurboMega9661 PolarVoyageViewRogueMaster4778;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater PolarVoyageSnackbarGammaEclipse2140 = AtomicLongFieldUpdater.newUpdater(PolarVoyagePagingSourcePixelTitanAlpha1957.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater PolarVoyageContentProviderHyperSpark3838 = AtomicLongFieldUpdater.newUpdater(PolarVoyagePagingSourcePixelTitanAlpha1957.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater PolarVoyageRemoteModelManagerOlympianCelestial9141 = AtomicIntegerFieldUpdater.newUpdater(PolarVoyagePagingSourcePixelTitanAlpha1957.class, "_isTerminated$volatile");
    public static final PolarVoyageAssetManagerEclipseHyperInferno7091 PolarVoyageNavigationViewHyperHyperHyperion1793 = new PolarVoyageAssetManagerEclipseHyperInferno7091("NOT_IN_STACK", 3);

    public PolarVoyagePagingSourcePixelTitanAlpha1957(int i, int i2, long j, String str) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = i2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = j;
        this.PolarVoyageBottomSheetOmegaNeo1907 = str;
        if (i < 1) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("Core pool size ", i, " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.PolarVoyageViewRogueMaster4778 = new PolarVoyageShapeAppearanceEliteTurboMega9661();
        this.PolarVoyageCameraPixelBlaze2629 = new PolarVoyageShapeAppearanceEliteTurboMega9661();
        this.PolarVoyageDrawableDeltaHyperion5742 = new PolarVoyageDisplayMetricsSolarTitanium9667((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    public static /* synthetic */ void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha1957, Runnable runnable, int i) {
        polarVoyagePagingSourcePixelTitanAlpha1957.PolarVoyageBarcodeScannerInfernoSolarSpark7767(runnable, false, (i & 4) == 0);
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(Runnable runnable, boolean z, boolean z2) {
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageMeteringPointFusionOmega2974;
        PolarVoyageDebugOmegaUltraStorm2738 polarVoyageDebugOmegaUltraStorm2738;
        PolarVoyageProGuardOlympianShadowPrime7120.PolarVoyageDiffUtilTurboStrike5735.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof PolarVoyageModelInputOutputNebulaRogueOlympian9897) {
            polarVoyageMeteringPointFusionOmega2974 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) runnable;
            polarVoyageMeteringPointFusionOmega2974.PolarVoyageItemDecorationUltraDeltaEpic7485 = nanoTime;
            polarVoyageMeteringPointFusionOmega2974.PolarVoyageStrictModeLegendEpic1532 = z;
        } else {
            polarVoyageMeteringPointFusionOmega2974 = new PolarVoyageMeteringPointFusionOmega2974(runnable, nanoTime, z);
        }
        boolean z3 = polarVoyageMeteringPointFusionOmega2974.PolarVoyageStrictModeLegendEpic1532;
        AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageContentProviderHyperSpark3838;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime9685 = currentThread instanceof PolarVoyageClipDrawableForceStormPrime9685 ? (PolarVoyageClipDrawableForceStormPrime9685) currentThread : null;
        if (polarVoyageClipDrawableForceStormPrime9685 == null || polarVoyageClipDrawableForceStormPrime9685.PolarVoyageSnackbarGammaEclipse2140 != this) {
            polarVoyageClipDrawableForceStormPrime9685 = null;
        }
        if (polarVoyageClipDrawableForceStormPrime9685 != null && (polarVoyageDebugOmegaUltraStorm2738 = polarVoyageClipDrawableForceStormPrime9685.PolarVoyageRotateAnimationCyberCelestialDelta4768) != PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageViewRogueMaster4778 && (polarVoyageMeteringPointFusionOmega2974.PolarVoyageStrictModeLegendEpic1532 || polarVoyageDebugOmegaUltraStorm2738 != PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageStrictModeLegendEpic1532)) {
            polarVoyageClipDrawableForceStormPrime9685.PolarVoyageDrawableDeltaHyperion5742 = true;
            PolarVoyageOnDeviceTranslatorPhoenixOlympian8362 polarVoyageOnDeviceTranslatorPhoenixOlympian8362 = polarVoyageClipDrawableForceStormPrime9685.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (z2) {
                polarVoyageMeteringPointFusionOmega2974 = polarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageZipVortexCelestial6185(polarVoyageMeteringPointFusionOmega2974);
            } else {
                polarVoyageOnDeviceTranslatorPhoenixOlympian8362.getClass();
                PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian9897 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageMotionLayoutTransitionHeroVision4068.getAndSet(polarVoyageOnDeviceTranslatorPhoenixOlympian8362, polarVoyageMeteringPointFusionOmega2974);
                polarVoyageMeteringPointFusionOmega2974 = polarVoyageModelInputOutputNebulaRogueOlympian9897 == null ? null : polarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageZipVortexCelestial6185(polarVoyageModelInputOutputNebulaRogueOlympian9897);
            }
        }
        if (polarVoyageMeteringPointFusionOmega2974 != null) {
            if (!(polarVoyageMeteringPointFusionOmega2974.PolarVoyageStrictModeLegendEpic1532 ? this.PolarVoyageCameraPixelBlaze2629.PolarVoyageZipVortexCelestial6185(polarVoyageMeteringPointFusionOmega2974) : this.PolarVoyageViewRogueMaster4778.PolarVoyageZipVortexCelestial6185(polarVoyageMeteringPointFusionOmega2974))) {
                throw new RejectedExecutionException(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(new StringBuilder(), this.PolarVoyageBottomSheetOmegaNeo1907, " was terminated"));
            }
        }
        if (z3) {
            if (PolarVoyageRotateAnimationCyberCelestialDelta4768() || PolarVoyageStrictModeLegendEpic1532(addAndGet)) {
                return;
            }
            PolarVoyageRotateAnimationCyberCelestialDelta4768();
            return;
        }
        if (PolarVoyageRotateAnimationCyberCelestialDelta4768() || PolarVoyageStrictModeLegendEpic1532(atomicLongFieldUpdater.get(this))) {
            return;
        }
        PolarVoyageRotateAnimationCyberCelestialDelta4768();
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime9685, int i, int i2) {
        while (true) {
            long j = PolarVoyageSnackbarGammaEclipse2140.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageClipDrawableForceStormPrime9685.PolarVoyageKotlinBetaPulseBeta3653();
                    while (true) {
                        if (PolarVoyageKotlinBetaPulseBeta3653 == PolarVoyageNavigationViewHyperHyperHyperion1793) {
                            i3 = -1;
                            break;
                        }
                        if (PolarVoyageKotlinBetaPulseBeta3653 == null) {
                            i3 = 0;
                            break;
                        }
                        PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime96852 = (PolarVoyageClipDrawableForceStormPrime9685) PolarVoyageKotlinBetaPulseBeta3653;
                        int PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageClipDrawableForceStormPrime96852.PolarVoyageMotionLayoutTransitionHeroVision4068();
                        if (PolarVoyageMotionLayoutTransitionHeroVision4068 != 0) {
                            i3 = PolarVoyageMotionLayoutTransitionHeroVision4068;
                            break;
                        }
                        PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageClipDrawableForceStormPrime96852.PolarVoyageKotlinBetaPulseBeta3653();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha1957 = this;
                if (PolarVoyageSnackbarGammaEclipse2140.compareAndSet(polarVoyagePagingSourcePixelTitanAlpha1957, j, i3 | j2)) {
                    return;
                } else {
                    this = polarVoyagePagingSourcePixelTitanAlpha1957;
                }
            }
        }
    }

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068() {
        synchronized (this.PolarVoyageDrawableDeltaHyperion5742) {
            try {
                if (PolarVoyageRemoteModelManagerOlympianCelestial9141.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageContentProviderHyperSpark3838;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    return 0;
                }
                if (i >= this.PolarVoyageStrictModeLegendEpic1532) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageMotionLayoutTransitionHeroVision4068(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime9685 = new PolarVoyageClipDrawableForceStormPrime9685(this, i3);
                this.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageKotlinBetaPulseBeta3653(i3, polarVoyageClipDrawableForceStormPrime9685);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                polarVoyageClipDrawableForceStormPrime9685.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha1957;
        PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091;
        int i;
        while (true) {
            long j = PolarVoyageSnackbarGammaEclipse2140.get(this);
            PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime9685 = (PolarVoyageClipDrawableForceStormPrime9685) this.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageMotionLayoutTransitionHeroVision4068((int) (2097151 & j));
            if (polarVoyageClipDrawableForceStormPrime9685 == null) {
                polarVoyageClipDrawableForceStormPrime9685 = null;
                polarVoyagePagingSourcePixelTitanAlpha1957 = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageClipDrawableForceStormPrime9685.PolarVoyageKotlinBetaPulseBeta3653();
                while (true) {
                    polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageNavigationViewHyperHyperHyperion1793;
                    if (PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageAssetManagerEclipseHyperInferno7091) {
                        i = -1;
                        break;
                    }
                    if (PolarVoyageKotlinBetaPulseBeta3653 == null) {
                        i = 0;
                        break;
                    }
                    PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime96852 = (PolarVoyageClipDrawableForceStormPrime9685) PolarVoyageKotlinBetaPulseBeta3653;
                    i = polarVoyageClipDrawableForceStormPrime96852.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    if (i != 0) {
                        break;
                    }
                    PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageClipDrawableForceStormPrime96852.PolarVoyageKotlinBetaPulseBeta3653();
                    j = j;
                }
                if (i >= 0) {
                    PolarVoyagePagingSourcePixelTitanAlpha1957 polarVoyagePagingSourcePixelTitanAlpha19572 = this;
                    boolean compareAndSet = PolarVoyageSnackbarGammaEclipse2140.compareAndSet(polarVoyagePagingSourcePixelTitanAlpha19572, j, i | j2);
                    polarVoyagePagingSourcePixelTitanAlpha1957 = polarVoyagePagingSourcePixelTitanAlpha19572;
                    if (compareAndSet) {
                        polarVoyageClipDrawableForceStormPrime9685.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageAssetManagerEclipseHyperInferno7091);
                    }
                    this = polarVoyagePagingSourcePixelTitanAlpha1957;
                } else {
                    continue;
                }
            }
            if (polarVoyageClipDrawableForceStormPrime9685 == null) {
                return false;
            }
            if (PolarVoyageClipDrawableForceStormPrime9685.PolarVoyageContentProviderHyperSpark3838.compareAndSet(polarVoyageClipDrawableForceStormPrime9685, -1, 0)) {
                LockSupport.unpark(polarVoyageClipDrawableForceStormPrime9685);
                return true;
            }
            this = polarVoyagePagingSourcePixelTitanAlpha1957;
        }
    }

    public final boolean PolarVoyageStrictModeLegendEpic1532(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i < i2) {
            int PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068();
            if (PolarVoyageMotionLayoutTransitionHeroVision4068 == 1 && i2 > 1) {
                PolarVoyageMotionLayoutTransitionHeroVision4068();
            }
            if (PolarVoyageMotionLayoutTransitionHeroVision4068 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian9897;
        if (PolarVoyageRemoteModelManagerOlympianCelestial9141.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime9685 = currentThread instanceof PolarVoyageClipDrawableForceStormPrime9685 ? (PolarVoyageClipDrawableForceStormPrime9685) currentThread : null;
            if (polarVoyageClipDrawableForceStormPrime9685 == null || polarVoyageClipDrawableForceStormPrime9685.PolarVoyageSnackbarGammaEclipse2140 != this) {
                polarVoyageClipDrawableForceStormPrime9685 = null;
            }
            synchronized (this.PolarVoyageDrawableDeltaHyperion5742) {
                i = (int) (PolarVoyageContentProviderHyperSpark3838.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object PolarVoyageMotionLayoutTransitionHeroVision4068 = this.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageMotionLayoutTransitionHeroVision4068(i2);
                    PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
                    PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime96852 = (PolarVoyageClipDrawableForceStormPrime9685) PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (polarVoyageClipDrawableForceStormPrime96852 != polarVoyageClipDrawableForceStormPrime9685) {
                        while (polarVoyageClipDrawableForceStormPrime96852.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(polarVoyageClipDrawableForceStormPrime96852);
                            polarVoyageClipDrawableForceStormPrime96852.join(10000L);
                        }
                        PolarVoyageOnDeviceTranslatorPhoenixOlympian8362 polarVoyageOnDeviceTranslatorPhoenixOlympian8362 = polarVoyageClipDrawableForceStormPrime96852.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        PolarVoyageShapeAppearanceEliteTurboMega9661 polarVoyageShapeAppearanceEliteTurboMega9661 = this.PolarVoyageCameraPixelBlaze2629;
                        polarVoyageOnDeviceTranslatorPhoenixOlympian8362.getClass();
                        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian98972 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageMotionLayoutTransitionHeroVision4068.getAndSet(polarVoyageOnDeviceTranslatorPhoenixOlympian8362, null);
                        if (polarVoyageModelInputOutputNebulaRogueOlympian98972 != null) {
                            polarVoyageShapeAppearanceEliteTurboMega9661.PolarVoyageZipVortexCelestial6185(polarVoyageModelInputOutputNebulaRogueOlympian98972);
                        }
                        while (true) {
                            PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageMotionLayoutTransitionHeroVision40682 = polarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageMotionLayoutTransitionHeroVision4068();
                            if (PolarVoyageMotionLayoutTransitionHeroVision40682 == null) {
                                break;
                            } else {
                                polarVoyageShapeAppearanceEliteTurboMega9661.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision40682);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.PolarVoyageCameraPixelBlaze2629.PolarVoyageMotionLayoutTransitionHeroVision4068();
            this.PolarVoyageViewRogueMaster4778.PolarVoyageMotionLayoutTransitionHeroVision4068();
            while (true) {
                if (polarVoyageClipDrawableForceStormPrime9685 != null) {
                    polarVoyageModelInputOutputNebulaRogueOlympian9897 = polarVoyageClipDrawableForceStormPrime9685.PolarVoyageZipVortexCelestial6185(true);
                }
                polarVoyageModelInputOutputNebulaRogueOlympian9897 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) this.PolarVoyageViewRogueMaster4778.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                if (polarVoyageModelInputOutputNebulaRogueOlympian9897 == null && (polarVoyageModelInputOutputNebulaRogueOlympian9897 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) this.PolarVoyageCameraPixelBlaze2629.PolarVoyageBarcodeScannerInfernoSolarSpark7767()) == null) {
                    break;
                }
                try {
                    polarVoyageModelInputOutputNebulaRogueOlympian9897.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (polarVoyageClipDrawableForceStormPrime9685 != null) {
                polarVoyageClipDrawableForceStormPrime9685.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageDebugOmegaUltraStorm2738.PolarVoyageViewRogueMaster4778);
            }
            PolarVoyageSnackbarGammaEclipse2140.set(this, 0L);
            PolarVoyageContentProviderHyperSpark3838.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        PolarVoyageBitmapVisionAuroraPixel4705(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PolarVoyageDisplayMetricsSolarTitanium9667 polarVoyageDisplayMetricsSolarTitanium9667 = this.PolarVoyageDrawableDeltaHyperion5742;
        int PolarVoyageZipVortexCelestial6185 = polarVoyageDisplayMetricsSolarTitanium9667.PolarVoyageZipVortexCelestial6185();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < PolarVoyageZipVortexCelestial6185; i6++) {
            PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime9685 = (PolarVoyageClipDrawableForceStormPrime9685) polarVoyageDisplayMetricsSolarTitanium9667.PolarVoyageMotionLayoutTransitionHeroVision4068(i6);
            if (polarVoyageClipDrawableForceStormPrime9685 != null) {
                PolarVoyageOnDeviceTranslatorPhoenixOlympian8362 polarVoyageOnDeviceTranslatorPhoenixOlympian8362 = polarVoyageClipDrawableForceStormPrime9685.PolarVoyageItemDecorationUltraDeltaEpic7485;
                polarVoyageOnDeviceTranslatorPhoenixOlympian8362.getClass();
                int i7 = PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageMotionLayoutTransitionHeroVision4068.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362) != null ? (PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageKotlinBetaPulseBeta3653.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362) - PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362)) + 1 : PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageKotlinBetaPulseBeta3653.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362) - PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(polarVoyageOnDeviceTranslatorPhoenixOlympian8362);
                int ordinal = polarVoyageClipDrawableForceStormPrime9685.PolarVoyageRotateAnimationCyberCelestialDelta4768.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = PolarVoyageContentProviderHyperSpark3838.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.PolarVoyageBottomSheetOmegaNeo1907);
        sb4.append('@');
        sb4.append(PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageSnackbarGammaEclipse2140(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.PolarVoyageStrictModeLegendEpic1532);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.PolarVoyageViewRogueMaster4778.PolarVoyageKotlinBetaPulseBeta3653());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.PolarVoyageCameraPixelBlaze2629.PolarVoyageKotlinBetaPulseBeta3653());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
