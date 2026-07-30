package p000createpolar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageSupervisorJobVortexDelta5512 implements PolarVoyageFirebaseHeroVision8149 {
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater PolarVoyageStrictModeLegendEpic1532 = AtomicLongFieldUpdater.newUpdater(PolarVoyageSupervisorJobVortexDelta5512.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater PolarVoyageRotateAnimationCyberCelestialDelta4768 = AtomicLongFieldUpdater.newUpdater(PolarVoyageSupervisorJobVortexDelta5512.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater PolarVoyageBottomSheetOmegaNeo1907 = AtomicLongFieldUpdater.newUpdater(PolarVoyageSupervisorJobVortexDelta5512.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater PolarVoyageViewRogueMaster4778 = AtomicLongFieldUpdater.newUpdater(PolarVoyageSupervisorJobVortexDelta5512.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageCameraPixelBlaze2629 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageSupervisorJobVortexDelta5512.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageDrawableDeltaHyperion5742 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageSupervisorJobVortexDelta5512.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageSnackbarGammaEclipse2140 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageSupervisorJobVortexDelta5512.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageContentProviderHyperSpark3838 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageSupervisorJobVortexDelta5512.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageRemoteModelManagerOlympianCelestial9141 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageSupervisorJobVortexDelta5512.class, Object.class, "closeHandler$volatile");

    public PolarVoyageSupervisorJobVortexDelta5512(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        if (i < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("Invalid channel capacity: ", i, ", should be >=0"));
            throw null;
        }
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageZipVortexCelestial6185;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = PolarVoyageBottomSheetOmegaNeo1907.get(this);
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752 = new PolarVoyageServiceInfoRogueTitanium9075(0L, null, this, 3);
        this.sendSegment$volatile = polarVoyageServiceInfoRogueTitanium90752;
        this.receiveSegment$volatile = polarVoyageServiceInfoRogueTitanium90752;
        if (PolarVoyageMotionLayoutForceEpicAurora7183()) {
            polarVoyageServiceInfoRogueTitanium90752 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageZipVortexCelestial6185;
            polarVoyageServiceInfoRogueTitanium90752.getClass();
        }
        this.bufferEndSegment$volatile = polarVoyageServiceInfoRogueTitanium90752;
        this._closeCause$volatile = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageAnimatorSetSparkUltraMax8233;
    }

    public static boolean PolarVoyageActivityInfoBetaQuantum8726(Object obj) {
        if (!(obj instanceof PolarVoyageAdapterAuroraStrike4860)) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj, "Unexpected waiter: ");
            return false;
        }
        PolarVoyageAdapterAuroraStrike4860 polarVoyageAdapterAuroraStrike4860 = (PolarVoyageAdapterAuroraStrike4860) obj;
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageZipVortexCelestial6185;
        PolarVoyageAssetManagerEclipseHyperInferno7091 PolarVoyageMotionLayoutForceEpicAurora7183 = polarVoyageAdapterAuroraStrike4860.PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185, null);
        if (PolarVoyageMotionLayoutForceEpicAurora7183 == null) {
            return false;
        }
        polarVoyageAdapterAuroraStrike4860.PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageMotionLayoutForceEpicAurora7183);
        return true;
    }

    public static void PolarVoyageBitmapMaxTitanTitan7960(PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta5512) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageViewRogueMaster4778;
        if ((atomicLongFieldUpdater.addAndGet(polarVoyageSupervisorJobVortexDelta5512, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static final int PolarVoyageDiffUtilTurboStrike5735(PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta5512, PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075, int i, Object obj, long j, Object obj2, boolean z) {
        polarVoyageServiceInfoRogueTitanium9075.PolarVoyageCameraPixelBlaze2629(i, obj);
        if (z) {
            return polarVoyageSupervisorJobVortexDelta5512.PolarVoyageDiffUtilDragonSpeedEclipse6225(polarVoyageServiceInfoRogueTitanium9075, i, obj, j, obj2, z);
        }
        Object PolarVoyageBottomSheetOmegaNeo19072 = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageBottomSheetOmegaNeo1907(i);
        if (PolarVoyageBottomSheetOmegaNeo19072 == null) {
            if (polarVoyageSupervisorJobVortexDelta5512.PolarVoyageTextInputEditTextNebulaHero6651(j)) {
                if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, null, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (PolarVoyageBottomSheetOmegaNeo19072 instanceof PolarVoyageScaleAnimationCelestialAuroraNeo6553) {
            polarVoyageServiceInfoRogueTitanium9075.PolarVoyageCameraPixelBlaze2629(i, null);
            if (polarVoyageSupervisorJobVortexDelta5512.PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageBottomSheetOmegaNeo19072, obj)) {
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDrawableDeltaHyperion5742(i, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageStrictModeLegendEpic1532);
                return 0;
            }
            PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBottomSheetOmegaNeo1907;
            if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDiffUtilTurboStrike5735.getAndSet((i * 2) + 1, polarVoyageAssetManagerEclipseHyperInferno7091) == polarVoyageAssetManagerEclipseHyperInferno7091) {
                return 5;
            }
            polarVoyageServiceInfoRogueTitanium9075.PolarVoyageViewRogueMaster4778(i, true);
            return 5;
        }
        return polarVoyageSupervisorJobVortexDelta5512.PolarVoyageDiffUtilDragonSpeedEclipse6225(polarVoyageServiceInfoRogueTitanium9075, i, obj, j, obj2, z);
    }

    public static final void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta5512, Object obj, PolarVoyageDebugStrikeEclipseQuantum3290 polarVoyageDebugStrikeEclipseQuantum3290) {
        polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageViewRogueMaster4778(new PolarVoyageTraceThunderMaster6506(polarVoyageSupervisorJobVortexDelta5512.PolarVoyageNavigationViewHyperHyperHyperion1793()));
    }

    public static final PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta5512, long j, PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075) {
        Object PolarVoyageDisplayMetricsVortexDragon9516;
        PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta55122;
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageZipVortexCelestial6185;
        PolarVoyageGradientDrawableVisionTitanium7091 polarVoyageGradientDrawableVisionTitanium7091 = PolarVoyageGradientDrawableVisionTitanium7091.PolarVoyageSnackbarGammaEclipse2140;
        loop0: while (true) {
            PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageServiceInfoRogueTitanium9075, j, polarVoyageGradientDrawableVisionTitanium7091);
            if (!PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageDisplayMetricsVortexDragon9516)) {
                PolarVoyageRunnableSparkRogue7241 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsVortexDragon9516);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageCameraPixelBlaze2629;
                    PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue7241 = (PolarVoyageRunnableSparkRogue7241) atomicReferenceFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512);
                    if (polarVoyageRunnableSparkRogue7241.PolarVoyageKotlinBetaPulseBeta3653 >= PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageKotlinBetaPulseBeta3653) {
                        break loop0;
                    }
                    if (!PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageStrictModeLegendEpic1532()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, polarVoyageRunnableSparkRogue7241, PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                        if (atomicReferenceFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512) != polarVoyageRunnableSparkRogue7241) {
                            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBitmapVisionAuroraPixel4705()) {
                                PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
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
        boolean PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageDisplayMetricsVortexDragon9516);
        AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (PolarVoyageBitmapVisionAuroraPixel4705) {
            polarVoyageSupervisorJobVortexDelta5512.PolarVoyageRotateAnimationCyberCelestialDelta4768();
            if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 * PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068 < atomicLongFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512)) {
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                return null;
            }
        } else {
            PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90753 = (PolarVoyageServiceInfoRogueTitanium9075) PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsVortexDragon9516);
            long j2 = polarVoyageServiceInfoRogueTitanium90753.PolarVoyageKotlinBetaPulseBeta3653;
            if (j2 <= j) {
                return polarVoyageServiceInfoRogueTitanium90753;
            }
            long j3 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068 * j2;
            while (true) {
                long j4 = PolarVoyageStrictModeLegendEpic1532.get(polarVoyageSupervisorJobVortexDelta5512);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    polarVoyageSupervisorJobVortexDelta55122 = polarVoyageSupervisorJobVortexDelta5512;
                    break;
                }
                polarVoyageSupervisorJobVortexDelta55122 = polarVoyageSupervisorJobVortexDelta5512;
                if (PolarVoyageStrictModeLegendEpic1532.compareAndSet(polarVoyageSupervisorJobVortexDelta55122, j4, (((int) (j4 >> 60)) << 60) + j5)) {
                    break;
                }
                polarVoyageSupervisorJobVortexDelta5512 = polarVoyageSupervisorJobVortexDelta55122;
            }
            if (j2 * PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068 < atomicLongFieldUpdater.get(polarVoyageSupervisorJobVortexDelta55122)) {
                polarVoyageServiceInfoRogueTitanium90753.PolarVoyageZipVortexCelestial6185();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageAlertDialogCyberHeroQuantum3938(long j, PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075) {
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752;
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90753;
        while (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 < j && (polarVoyageServiceInfoRogueTitanium90753 = (PolarVoyageServiceInfoRogueTitanium9075) polarVoyageServiceInfoRogueTitanium9075.PolarVoyageMotionLayoutTransitionHeroVision4068()) != null) {
            polarVoyageServiceInfoRogueTitanium9075 = polarVoyageServiceInfoRogueTitanium90753;
        }
        while (true) {
            if (!polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653() || (polarVoyageServiceInfoRogueTitanium90752 = (PolarVoyageServiceInfoRogueTitanium9075) polarVoyageServiceInfoRogueTitanium9075.PolarVoyageMotionLayoutTransitionHeroVision4068()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageSnackbarGammaEclipse2140;
                    PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue7241 = (PolarVoyageRunnableSparkRogue7241) atomicReferenceFieldUpdater.get(this);
                    if (polarVoyageRunnableSparkRogue7241.PolarVoyageKotlinBetaPulseBeta3653 >= polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653) {
                        return;
                    }
                    if (!polarVoyageServiceInfoRogueTitanium9075.PolarVoyageStrictModeLegendEpic1532()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, polarVoyageRunnableSparkRogue7241, polarVoyageServiceInfoRogueTitanium9075)) {
                        if (atomicReferenceFieldUpdater.get(this) != polarVoyageRunnableSparkRogue7241) {
                            if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageBitmapVisionAuroraPixel4705()) {
                                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                            }
                        }
                    }
                    if (polarVoyageRunnableSparkRogue7241.PolarVoyageBitmapVisionAuroraPixel4705()) {
                        polarVoyageRunnableSparkRogue7241.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                        return;
                    }
                    return;
                }
            }
            polarVoyageServiceInfoRogueTitanium9075 = polarVoyageServiceInfoRogueTitanium90752;
        }
    }

    public final long PolarVoyageAnimatorSetSparkUltraMax8233() {
        return PolarVoyageStrictModeLegendEpic1532.get(this) & 1152921504606846975L;
    }

    @Override // p000createpolar.PolarVoyageFirebaseHeroVision8149
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        PolarVoyageItemDecorationUltraDeltaEpic7485(cancellationException, true);
    }

    @Override // p000createpolar.PolarVoyageFirebaseHeroVision8149
    public final Object PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageFirebaseModelInterpreterNovaPhantomGamma2331 polarVoyageFirebaseModelInterpreterNovaPhantomGamma2331) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageDrawableDeltaHyperion5742;
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = (PolarVoyageServiceInfoRogueTitanium9075) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageStrictModeLegendEpic1532;
            boolean z = true;
            if (PolarVoyageDisplayMetricsVortexDragon9516(atomicLongFieldUpdater.get(this), true)) {
                Throwable PolarVoyageContentProviderHyperSpark38382 = PolarVoyageContentProviderHyperSpark3838();
                int i = PolarVoyageToastHyperNebula5733.PolarVoyageZipVortexCelestial6185;
                throw PolarVoyageContentProviderHyperSpark38382;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = PolarVoyageRotateAnimationCyberCelestialDelta4768;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 != j2) {
                PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageDrawableDeltaHyperion57422 = PolarVoyageDrawableDeltaHyperion5742(j2, polarVoyageServiceInfoRogueTitanium9075);
                if (PolarVoyageDrawableDeltaHyperion57422 == null) {
                    continue;
                } else {
                    polarVoyageServiceInfoRogueTitanium9075 = PolarVoyageDrawableDeltaHyperion57422;
                }
            }
            Object PolarVoyageLifecycleOlympianOmega3762 = PolarVoyageLifecycleOlympianOmega3762(polarVoyageServiceInfoRogueTitanium9075, i2, andIncrement, null);
            Object obj = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageCameraPixelBlaze2629;
            if (PolarVoyageLifecycleOlympianOmega3762 == obj) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("unexpected");
                return null;
            }
            Object obj2 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageSnackbarGammaEclipse2140;
            if (PolarVoyageLifecycleOlympianOmega3762 != obj2) {
                if (PolarVoyageLifecycleOlympianOmega3762 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageDrawableDeltaHyperion5742) {
                    polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                    return PolarVoyageLifecycleOlympianOmega3762;
                }
                PolarVoyageDebugStrikeEclipseQuantum3290 PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageToolbarEclipseInfernoHero6368(PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageCanvasElitePhoenix4750(polarVoyageFirebaseModelInterpreterNovaPhantomGamma2331));
                try {
                    Object PolarVoyageLifecycleOlympianOmega37622 = PolarVoyageLifecycleOlympianOmega3762(polarVoyageServiceInfoRogueTitanium9075, i2, andIncrement, PolarVoyageToolbarEclipseInfernoHero6368);
                    if (PolarVoyageLifecycleOlympianOmega37622 == obj) {
                        PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageZipVortexCelestial6185(polarVoyageServiceInfoRogueTitanium9075, i2);
                    } else if (PolarVoyageLifecycleOlympianOmega37622 == obj2) {
                        if (andIncrement < PolarVoyageAnimatorSetSparkUltraMax8233()) {
                            polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                        }
                        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752 = (PolarVoyageServiceInfoRogueTitanium9075) atomicReferenceFieldUpdater.get(this);
                        while (true) {
                            if (PolarVoyageDisplayMetricsVortexDragon9516(atomicLongFieldUpdater.get(this), z)) {
                                PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageViewRogueMaster4778(new PolarVoyageTraceThunderMaster6506(PolarVoyageContentProviderHyperSpark3838()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                            long j3 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j4 = andIncrement2 / j3;
                            int i3 = (int) (andIncrement2 % j3);
                            if (polarVoyageServiceInfoRogueTitanium90752.PolarVoyageKotlinBetaPulseBeta3653 != j4) {
                                PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageDrawableDeltaHyperion57423 = PolarVoyageDrawableDeltaHyperion5742(j4, polarVoyageServiceInfoRogueTitanium90752);
                                if (PolarVoyageDrawableDeltaHyperion57423 == null) {
                                    continue;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z = true;
                                } else {
                                    polarVoyageServiceInfoRogueTitanium90752 = PolarVoyageDrawableDeltaHyperion57423;
                                }
                            }
                            Object PolarVoyageLifecycleOlympianOmega37623 = PolarVoyageLifecycleOlympianOmega3762(polarVoyageServiceInfoRogueTitanium90752, i3, andIncrement2, PolarVoyageToolbarEclipseInfernoHero6368);
                            if (PolarVoyageLifecycleOlympianOmega37623 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageCameraPixelBlaze2629) {
                                PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageZipVortexCelestial6185(polarVoyageServiceInfoRogueTitanium90752, i3);
                                break;
                            }
                            if (PolarVoyageLifecycleOlympianOmega37623 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageSnackbarGammaEclipse2140) {
                                if (andIncrement2 < PolarVoyageAnimatorSetSparkUltraMax8233()) {
                                    polarVoyageServiceInfoRogueTitanium90752.PolarVoyageZipVortexCelestial6185();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                z = true;
                            } else {
                                if (PolarVoyageLifecycleOlympianOmega37623 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageDrawableDeltaHyperion5742) {
                                    throw new IllegalStateException("unexpected");
                                }
                                polarVoyageServiceInfoRogueTitanium90752.PolarVoyageZipVortexCelestial6185();
                                PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageLifecycleOlympianOmega37623, null);
                            }
                        }
                    } else {
                        polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                        PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageLifecycleOlympianOmega37622, null);
                    }
                    return PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageRemoteModelManagerOlympianCelestial9141();
                } catch (Throwable th) {
                    PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageLifecycleOlympianOmega3762();
                    throw th;
                }
            }
            if (andIncrement < PolarVoyageAnimatorSetSparkUltraMax8233()) {
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
            }
        }
    }

    @Override // p000createpolar.PolarVoyageFirebaseHeroVision8149
    public final Object PolarVoyageBottomSheetOmegaNeo1907() {
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075;
        PolarVoyageScrollViewNovaMega6604 polarVoyageScrollViewNovaMega6604 = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageKotlinBetaPulseBeta3653;
        AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageRotateAnimationCyberCelestialDelta4768;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = PolarVoyageStrictModeLegendEpic1532;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (PolarVoyageDisplayMetricsVortexDragon9516(j2, true)) {
            return new PolarVoyageMapFusionNeoLegend4756(PolarVoyageSnackbarGammaEclipse2140());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return polarVoyageScrollViewNovaMega6604;
        }
        Object obj = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752 = (PolarVoyageServiceInfoRogueTitanium9075) PolarVoyageDrawableDeltaHyperion5742.get(this);
        while (!this.PolarVoyageDisplayMetricsVortexDragon9516(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (polarVoyageServiceInfoRogueTitanium90752.PolarVoyageKotlinBetaPulseBeta3653 != j4) {
                PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageDrawableDeltaHyperion57422 = this.PolarVoyageDrawableDeltaHyperion5742(j4, polarVoyageServiceInfoRogueTitanium90752);
                if (PolarVoyageDrawableDeltaHyperion57422 == null) {
                    continue;
                } else {
                    polarVoyageServiceInfoRogueTitanium9075 = PolarVoyageDrawableDeltaHyperion57422;
                }
            } else {
                polarVoyageServiceInfoRogueTitanium9075 = polarVoyageServiceInfoRogueTitanium90752;
            }
            PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta5512 = this;
            Object PolarVoyageLifecycleOlympianOmega3762 = polarVoyageSupervisorJobVortexDelta5512.PolarVoyageLifecycleOlympianOmega3762(polarVoyageServiceInfoRogueTitanium9075, i, andIncrement, obj);
            polarVoyageServiceInfoRogueTitanium90752 = polarVoyageServiceInfoRogueTitanium9075;
            if (PolarVoyageLifecycleOlympianOmega3762 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageCameraPixelBlaze2629) {
                PolarVoyageScaleAnimationCelestialAuroraNeo6553 polarVoyageScaleAnimationCelestialAuroraNeo6553 = obj instanceof PolarVoyageScaleAnimationCelestialAuroraNeo6553 ? (PolarVoyageScaleAnimationCelestialAuroraNeo6553) obj : null;
                if (polarVoyageScaleAnimationCelestialAuroraNeo6553 != null) {
                    polarVoyageScaleAnimationCelestialAuroraNeo6553.PolarVoyageZipVortexCelestial6185(polarVoyageServiceInfoRogueTitanium90752, i);
                }
                polarVoyageSupervisorJobVortexDelta5512.PolarVoyageFCMCelestialCosmosPixel3711(andIncrement);
                polarVoyageServiceInfoRogueTitanium90752.PolarVoyageItemDecorationUltraDeltaEpic7485();
                return polarVoyageScrollViewNovaMega6604;
            }
            if (PolarVoyageLifecycleOlympianOmega3762 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageSnackbarGammaEclipse2140) {
                if (PolarVoyageLifecycleOlympianOmega3762 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageDrawableDeltaHyperion5742) {
                    polarVoyageServiceInfoRogueTitanium90752.PolarVoyageZipVortexCelestial6185();
                    return PolarVoyageLifecycleOlympianOmega3762;
                }
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("unexpected");
                return null;
            }
            if (andIncrement < polarVoyageSupervisorJobVortexDelta5512.PolarVoyageAnimatorSetSparkUltraMax8233()) {
                polarVoyageServiceInfoRogueTitanium90752.PolarVoyageZipVortexCelestial6185();
            }
            this = polarVoyageSupervisorJobVortexDelta5512;
        }
        return new PolarVoyageMapFusionNeoLegend4756(this.PolarVoyageSnackbarGammaEclipse2140());
    }

    public final void PolarVoyageCameraPixelBlaze2629() {
        Object PolarVoyageDisplayMetricsVortexDragon9516;
        if (PolarVoyageMotionLayoutForceEpicAurora7183()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageSnackbarGammaEclipse2140;
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = (PolarVoyageServiceInfoRogueTitanium9075) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = PolarVoyageBottomSheetOmegaNeo1907.getAndIncrement(this);
            long j = andIncrement / PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (PolarVoyageAnimatorSetSparkUltraMax8233() <= andIncrement) {
                if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 < j && polarVoyageServiceInfoRogueTitanium9075.PolarVoyageMotionLayoutTransitionHeroVision4068() != null) {
                    PolarVoyageAlertDialogCyberHeroQuantum3938(j, polarVoyageServiceInfoRogueTitanium9075);
                }
                PolarVoyageBitmapMaxTitanTitan7960(this);
                return;
            }
            if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 != j) {
                PolarVoyageGradientDrawableVisionTitanium7091 polarVoyageGradientDrawableVisionTitanium7091 = PolarVoyageGradientDrawableVisionTitanium7091.PolarVoyageSnackbarGammaEclipse2140;
                while (true) {
                    PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageServiceInfoRogueTitanium9075, j, polarVoyageGradientDrawableVisionTitanium7091);
                    if (!PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageDisplayMetricsVortexDragon9516)) {
                        PolarVoyageRunnableSparkRogue7241 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsVortexDragon9516);
                        while (true) {
                            PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue7241 = (PolarVoyageRunnableSparkRogue7241) atomicReferenceFieldUpdater.get(this);
                            if (polarVoyageRunnableSparkRogue7241.PolarVoyageKotlinBetaPulseBeta3653 >= PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageKotlinBetaPulseBeta3653) {
                                break;
                            }
                            if (!PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageStrictModeLegendEpic1532()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, polarVoyageRunnableSparkRogue7241, PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                                if (atomicReferenceFieldUpdater.get(this) != polarVoyageRunnableSparkRogue7241) {
                                    if (PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBitmapVisionAuroraPixel4705()) {
                                        PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
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
                PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752 = null;
                if (PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageDisplayMetricsVortexDragon9516)) {
                    PolarVoyageRotateAnimationCyberCelestialDelta4768();
                    PolarVoyageAlertDialogCyberHeroQuantum3938(j, polarVoyageServiceInfoRogueTitanium9075);
                    PolarVoyageBitmapMaxTitanTitan7960(this);
                } else {
                    PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90753 = (PolarVoyageServiceInfoRogueTitanium9075) PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsVortexDragon9516);
                    long j2 = polarVoyageServiceInfoRogueTitanium90753.PolarVoyageKotlinBetaPulseBeta3653;
                    if (j2 > j) {
                        long j3 = j2 * PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        if (PolarVoyageBottomSheetOmegaNeo1907.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageViewRogueMaster4778;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            PolarVoyageBitmapMaxTitanTitan7960(this);
                        }
                    } else {
                        polarVoyageServiceInfoRogueTitanium90752 = polarVoyageServiceInfoRogueTitanium90753;
                    }
                }
                if (polarVoyageServiceInfoRogueTitanium90752 == null) {
                    continue;
                } else {
                    polarVoyageServiceInfoRogueTitanium9075 = polarVoyageServiceInfoRogueTitanium90752;
                }
            }
            int i = (int) (andIncrement % PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068);
            Object PolarVoyageBottomSheetOmegaNeo19072 = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageBottomSheetOmegaNeo1907(i);
            boolean z = PolarVoyageBottomSheetOmegaNeo19072 instanceof PolarVoyageScaleAnimationCelestialAuroraNeo6553;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19072, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageTextInputEditTextNebulaHero6651)) {
                while (true) {
                    Object PolarVoyageBottomSheetOmegaNeo19073 = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageBottomSheetOmegaNeo1907(i);
                    if (!(PolarVoyageBottomSheetOmegaNeo19073 instanceof PolarVoyageScaleAnimationCelestialAuroraNeo6553)) {
                        if (PolarVoyageBottomSheetOmegaNeo19073 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                            if (PolarVoyageBottomSheetOmegaNeo19073 != null) {
                                if (PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767 || PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageItemDecorationUltraDeltaEpic7485 || PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageStrictModeLegendEpic1532 || PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBottomSheetOmegaNeo1907 || PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778) {
                                    break loop0;
                                } else if (PolarVoyageBottomSheetOmegaNeo19073 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageDiffUtilTurboStrike5735) {
                                    PolarVoyageMeteringPointSolarMax4741.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageBottomSheetOmegaNeo19073, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBitmapVisionAuroraPixel4705)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19073, new PolarVoyageBillingClientTitaniumHyper4571((PolarVoyageScaleAnimationCelestialAuroraNeo6553) PolarVoyageBottomSheetOmegaNeo19073))) {
                            break loop0;
                        }
                    } else if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageTextInputEditTextNebulaHero6651)) {
                        if (PolarVoyageActivityInfoBetaQuantum8726(PolarVoyageBottomSheetOmegaNeo19073)) {
                            polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDrawableDeltaHyperion5742(i, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                            break;
                        } else {
                            polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDrawableDeltaHyperion5742(i, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                            polarVoyageServiceInfoRogueTitanium9075.PolarVoyageItemDecorationUltraDeltaEpic7485();
                        }
                    }
                }
            } else if (PolarVoyageActivityInfoBetaQuantum8726(PolarVoyageBottomSheetOmegaNeo19072)) {
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDrawableDeltaHyperion5742(i, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                break;
            } else {
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDrawableDeltaHyperion5742(i, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageItemDecorationUltraDeltaEpic7485();
                PolarVoyageBitmapMaxTitanTitan7960(this);
            }
        }
        PolarVoyageBitmapMaxTitanTitan7960(this);
    }

    public final Object PolarVoyageCameraViewSpectraMaxSpectra2824(PolarVoyageTextInputLayoutTitaniumGamma2126 polarVoyageTextInputLayoutTitaniumGamma2126, Object obj) {
        PolarVoyageDebugStrikeEclipseQuantum3290 polarVoyageDebugStrikeEclipseQuantum3290 = new PolarVoyageDebugStrikeEclipseQuantum3290(1, PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageCanvasElitePhoenix4750(polarVoyageTextInputLayoutTitaniumGamma2126));
        polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageNavigationViewHyperHyperHyperion1793();
        polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageViewRogueMaster4778(new PolarVoyageTraceThunderMaster6506(PolarVoyageNavigationViewHyperHyperHyperion1793()));
        Object PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageRemoteModelManagerOlympianCelestial9141();
        return PolarVoyageRemoteModelManagerOlympianCelestial91412 == PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485 ? PolarVoyageRemoteModelManagerOlympianCelestial91412 : PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
    }

    public final Throwable PolarVoyageContentProviderHyperSpark3838() {
        Throwable PolarVoyageSnackbarGammaEclipse21402 = PolarVoyageSnackbarGammaEclipse2140();
        return PolarVoyageSnackbarGammaEclipse21402 == null ? new PolarVoyageCameraViewThunderVortexCelestial7913("Channel was closed") : PolarVoyageSnackbarGammaEclipse21402;
    }

    public final int PolarVoyageDiffUtilDragonSpeedEclipse6225(PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object PolarVoyageBottomSheetOmegaNeo19072 = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageBottomSheetOmegaNeo1907(i);
            if (PolarVoyageBottomSheetOmegaNeo19072 == null) {
                if (!PolarVoyageTextInputEditTextNebulaHero6651(j) || z) {
                    if (z) {
                        if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, null, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageRotateAnimationCyberCelestialDelta4768)) {
                            polarVoyageServiceInfoRogueTitanium9075.PolarVoyageItemDecorationUltraDeltaEpic7485();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, null, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                    break;
                }
            } else {
                if (PolarVoyageBottomSheetOmegaNeo19072 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBitmapVisionAuroraPixel4705) {
                    PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBottomSheetOmegaNeo1907;
                    if (PolarVoyageBottomSheetOmegaNeo19072 == polarVoyageAssetManagerEclipseHyperInferno7091) {
                        polarVoyageServiceInfoRogueTitanium9075.PolarVoyageCameraPixelBlaze2629(i, null);
                        return 5;
                    }
                    if (PolarVoyageBottomSheetOmegaNeo19072 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                        polarVoyageServiceInfoRogueTitanium9075.PolarVoyageCameraPixelBlaze2629(i, null);
                        return 5;
                    }
                    if (PolarVoyageBottomSheetOmegaNeo19072 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778) {
                        polarVoyageServiceInfoRogueTitanium9075.PolarVoyageCameraPixelBlaze2629(i, null);
                        PolarVoyageRotateAnimationCyberCelestialDelta4768();
                        return 4;
                    }
                    polarVoyageServiceInfoRogueTitanium9075.PolarVoyageCameraPixelBlaze2629(i, null);
                    if (PolarVoyageBottomSheetOmegaNeo19072 instanceof PolarVoyageBillingClientTitaniumHyper4571) {
                        PolarVoyageBottomSheetOmegaNeo19072 = ((PolarVoyageBillingClientTitaniumHyper4571) PolarVoyageBottomSheetOmegaNeo19072).PolarVoyageZipVortexCelestial6185;
                    }
                    if (PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageBottomSheetOmegaNeo19072, obj)) {
                        polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDrawableDeltaHyperion5742(i, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageStrictModeLegendEpic1532);
                        return 0;
                    }
                    if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDiffUtilTurboStrike5735.getAndSet((i * 2) + 1, polarVoyageAssetManagerEclipseHyperInferno7091) != polarVoyageAssetManagerEclipseHyperInferno7091) {
                        polarVoyageServiceInfoRogueTitanium9075.PolarVoyageViewRogueMaster4778(i, true);
                    }
                    return 5;
                }
                if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19072, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (p000createpolar.PolarVoyageServiceInfoRogueTitanium9075) ((p000createpolar.PolarVoyageGestureDetectorStrikeHyperion4153) p000createpolar.PolarVoyageGestureDetectorStrikeHyperion4153.PolarVoyageMotionLayoutTransitionHeroVision4068.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageDisplayMetricsVortexDragon9516(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (i == 2) {
                PolarVoyageStrictModeLegendEpic1532(1152921504606846975L & j);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageDrawableDeltaHyperion5742;
                        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = (PolarVoyageServiceInfoRogueTitanium9075) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (PolarVoyageAnimatorSetSparkUltraMax8233() <= j2) {
                            break;
                        }
                        long j3 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        long j4 = j2 / j3;
                        if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 != j4 && (polarVoyageServiceInfoRogueTitanium9075 = PolarVoyageDrawableDeltaHyperion5742(j4, polarVoyageServiceInfoRogueTitanium9075)) == null) {
                            if (((PolarVoyageServiceInfoRogueTitanium9075) atomicReferenceFieldUpdater.get(this)).PolarVoyageKotlinBetaPulseBeta3653 < j4) {
                                break;
                            }
                        } else {
                            polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                            int i2 = (int) (j2 % j3);
                            while (true) {
                                Object PolarVoyageBottomSheetOmegaNeo19072 = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageBottomSheetOmegaNeo1907(i2);
                                if (PolarVoyageBottomSheetOmegaNeo19072 == null || PolarVoyageBottomSheetOmegaNeo19072 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBitmapVisionAuroraPixel4705) {
                                    if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i2, PolarVoyageBottomSheetOmegaNeo19072, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageItemDecorationUltraDeltaEpic7485)) {
                                        PolarVoyageCameraPixelBlaze2629();
                                        break;
                                    }
                                } else {
                                    if (PolarVoyageBottomSheetOmegaNeo19072 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                                        break;
                                    }
                                    if (PolarVoyageBottomSheetOmegaNeo19072 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                                        if (PolarVoyageBottomSheetOmegaNeo19072 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778) {
                                            if (PolarVoyageBottomSheetOmegaNeo19072 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageStrictModeLegendEpic1532) {
                                                if (PolarVoyageBottomSheetOmegaNeo19072 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                                                    if (PolarVoyageBottomSheetOmegaNeo19072 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageTextInputEditTextNebulaHero6651) {
                                                        break;
                                                    }
                                                    if (PolarVoyageBottomSheetOmegaNeo19072 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageDiffUtilTurboStrike5735 && j2 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            PolarVoyageRotateAnimationCyberCelestialDelta4768.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("unexpected close status: ", i));
                    return false;
                }
                PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageStrictModeLegendEpic15322 = PolarVoyageStrictModeLegendEpic1532(1152921504606846975L & j);
                Object obj = null;
                loop0: do {
                    int i3 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068 - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (PolarVoyageStrictModeLegendEpic15322.PolarVoyageKotlinBetaPulseBeta3653 * PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068) + i3;
                        while (true) {
                            Object PolarVoyageBottomSheetOmegaNeo19073 = PolarVoyageStrictModeLegendEpic15322.PolarVoyageBottomSheetOmegaNeo1907(i3);
                            if (PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageStrictModeLegendEpic1532) {
                                break loop0;
                            }
                            if (PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                                if (j5 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (PolarVoyageStrictModeLegendEpic15322.PolarVoyageRotateAnimationCyberCelestialDelta4768(i3, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778)) {
                                    PolarVoyageStrictModeLegendEpic15322.PolarVoyageCameraPixelBlaze2629(i3, null);
                                    PolarVoyageStrictModeLegendEpic15322.PolarVoyageItemDecorationUltraDeltaEpic7485();
                                    break;
                                }
                            } else if (PolarVoyageBottomSheetOmegaNeo19073 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBitmapVisionAuroraPixel4705 && PolarVoyageBottomSheetOmegaNeo19073 != null) {
                                if (!(PolarVoyageBottomSheetOmegaNeo19073 instanceof PolarVoyageScaleAnimationCelestialAuroraNeo6553) && !(PolarVoyageBottomSheetOmegaNeo19073 instanceof PolarVoyageBillingClientTitaniumHyper4571)) {
                                    PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageTextInputEditTextNebulaHero6651;
                                    if (PolarVoyageBottomSheetOmegaNeo19073 == polarVoyageAssetManagerEclipseHyperInferno7091 || PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageDiffUtilTurboStrike5735) {
                                        break loop0;
                                    }
                                    if (PolarVoyageBottomSheetOmegaNeo19073 != polarVoyageAssetManagerEclipseHyperInferno7091) {
                                        break;
                                    }
                                } else {
                                    if (j5 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    PolarVoyageScaleAnimationCelestialAuroraNeo6553 polarVoyageScaleAnimationCelestialAuroraNeo6553 = PolarVoyageBottomSheetOmegaNeo19073 instanceof PolarVoyageBillingClientTitaniumHyper4571 ? ((PolarVoyageBillingClientTitaniumHyper4571) PolarVoyageBottomSheetOmegaNeo19073).PolarVoyageZipVortexCelestial6185 : (PolarVoyageScaleAnimationCelestialAuroraNeo6553) PolarVoyageBottomSheetOmegaNeo19073;
                                    if (PolarVoyageStrictModeLegendEpic15322.PolarVoyageRotateAnimationCyberCelestialDelta4768(i3, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778)) {
                                        obj = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageMotionLayoutForceEpicAurora7183(obj, polarVoyageScaleAnimationCelestialAuroraNeo6553);
                                        PolarVoyageStrictModeLegendEpic15322.PolarVoyageCameraPixelBlaze2629(i3, null);
                                        PolarVoyageStrictModeLegendEpic15322.PolarVoyageItemDecorationUltraDeltaEpic7485();
                                        break;
                                    }
                                }
                            } else if (PolarVoyageStrictModeLegendEpic15322.PolarVoyageRotateAnimationCyberCelestialDelta4768(i3, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778)) {
                                PolarVoyageStrictModeLegendEpic15322.PolarVoyageItemDecorationUltraDeltaEpic7485();
                                break;
                            }
                        }
                        i3--;
                    }
                } while (PolarVoyageStrictModeLegendEpic15322 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            PolarVoyagePackageManagerCelestialPhoenix8393((PolarVoyageScaleAnimationCelestialAuroraNeo6553) arrayList.get(size), false);
                        }
                    } else {
                        PolarVoyagePackageManagerCelestialPhoenix8393((PolarVoyageScaleAnimationCelestialAuroraNeo6553) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageDrawableDeltaHyperion5742(long j, PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075) {
        Object PolarVoyageDisplayMetricsVortexDragon9516;
        PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta5512;
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageZipVortexCelestial6185;
        PolarVoyageGradientDrawableVisionTitanium7091 polarVoyageGradientDrawableVisionTitanium7091 = PolarVoyageGradientDrawableVisionTitanium7091.PolarVoyageSnackbarGammaEclipse2140;
        loop0: while (true) {
            PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageServiceInfoRogueTitanium9075, j, polarVoyageGradientDrawableVisionTitanium7091);
            if (!PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageDisplayMetricsVortexDragon9516)) {
                PolarVoyageRunnableSparkRogue7241 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsVortexDragon9516);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageDrawableDeltaHyperion5742;
                    PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue7241 = (PolarVoyageRunnableSparkRogue7241) atomicReferenceFieldUpdater.get(this);
                    if (polarVoyageRunnableSparkRogue7241.PolarVoyageKotlinBetaPulseBeta3653 >= PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageKotlinBetaPulseBeta3653) {
                        break loop0;
                    }
                    if (!PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageStrictModeLegendEpic1532()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, polarVoyageRunnableSparkRogue7241, PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                        if (atomicReferenceFieldUpdater.get(this) != polarVoyageRunnableSparkRogue7241) {
                            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBitmapVisionAuroraPixel4705()) {
                                PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
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
        if (PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageDisplayMetricsVortexDragon9516)) {
            PolarVoyageRotateAnimationCyberCelestialDelta4768();
            if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 * PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068 < PolarVoyageAnimatorSetSparkUltraMax8233()) {
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                return null;
            }
        } else {
            PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90753 = (PolarVoyageServiceInfoRogueTitanium9075) PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsVortexDragon9516);
            long j2 = polarVoyageServiceInfoRogueTitanium90753.PolarVoyageKotlinBetaPulseBeta3653;
            if (!PolarVoyageMotionLayoutForceEpicAurora7183() && j <= PolarVoyageBottomSheetOmegaNeo1907.get(this) / PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = PolarVoyageSnackbarGammaEclipse2140;
                    PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue72412 = (PolarVoyageRunnableSparkRogue7241) atomicReferenceFieldUpdater2.get(this);
                    if (polarVoyageRunnableSparkRogue72412.PolarVoyageKotlinBetaPulseBeta3653 >= j2 || !polarVoyageServiceInfoRogueTitanium90753.PolarVoyageStrictModeLegendEpic1532()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, polarVoyageRunnableSparkRogue72412, polarVoyageServiceInfoRogueTitanium90753)) {
                        if (atomicReferenceFieldUpdater2.get(this) != polarVoyageRunnableSparkRogue72412) {
                            if (polarVoyageServiceInfoRogueTitanium90753.PolarVoyageBitmapVisionAuroraPixel4705()) {
                                polarVoyageServiceInfoRogueTitanium90753.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                            }
                        }
                    }
                    if (polarVoyageRunnableSparkRogue72412.PolarVoyageBitmapVisionAuroraPixel4705()) {
                        polarVoyageRunnableSparkRogue72412.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                    }
                }
            }
            if (j2 <= j) {
                return polarVoyageServiceInfoRogueTitanium90753;
            }
            long j3 = j2 * PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
            while (true) {
                long j4 = PolarVoyageRotateAnimationCyberCelestialDelta4768.get(this);
                if (j4 >= j3) {
                    polarVoyageSupervisorJobVortexDelta5512 = this;
                    break;
                }
                polarVoyageSupervisorJobVortexDelta5512 = this;
                if (PolarVoyageRotateAnimationCyberCelestialDelta4768.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, j4, j3)) {
                    break;
                }
                this = polarVoyageSupervisorJobVortexDelta5512;
            }
            if (j2 * PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068 < polarVoyageSupervisorJobVortexDelta5512.PolarVoyageAnimatorSetSparkUltraMax8233()) {
                polarVoyageServiceInfoRogueTitanium90753.PolarVoyageZipVortexCelestial6185();
            }
        }
        return null;
    }

    public final void PolarVoyageFCMCelestialCosmosPixel3711(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta5512 = this;
        if (polarVoyageSupervisorJobVortexDelta5512.PolarVoyageMotionLayoutForceEpicAurora7183()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = PolarVoyageBottomSheetOmegaNeo1907;
            if (atomicLongFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512) > j) {
                break;
            } else {
                polarVoyageSupervisorJobVortexDelta5512 = this;
            }
        }
        int i = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageKotlinBetaPulseBeta3653;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = PolarVoyageViewRogueMaster4778;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(polarVoyageSupervisorJobVortexDelta5512)) && j2 == atomicLongFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(polarVoyageSupervisorJobVortexDelta5512);
                    if (atomicLongFieldUpdater2.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        polarVoyageSupervisorJobVortexDelta5512 = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512);
                    long j5 = atomicLongFieldUpdater2.get(polarVoyageSupervisorJobVortexDelta5512);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512)) {
                        break;
                    }
                    if (z) {
                        polarVoyageSupervisorJobVortexDelta5512 = this;
                    } else {
                        polarVoyageSupervisorJobVortexDelta5512 = this;
                        atomicLongFieldUpdater2.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(polarVoyageSupervisorJobVortexDelta5512);
                    if (atomicLongFieldUpdater2.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        polarVoyageSupervisorJobVortexDelta5512 = this;
                    }
                }
            }
        }
    }

    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485(Throwable th, boolean z) {
        PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta5512;
        boolean z2;
        long j;
        long j2;
        Object obj;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageStrictModeLegendEpic1532;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageZipVortexCelestial6185;
                polarVoyageSupervisorJobVortexDelta5512 = this;
                if (atomicLongFieldUpdater.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = polarVoyageSupervisorJobVortexDelta5512;
            }
        }
        polarVoyageSupervisorJobVortexDelta5512 = this;
        PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageAnimatorSetSparkUltraMax8233;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageContentProviderHyperSpark3838;
            if (atomicReferenceFieldUpdater.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, polarVoyageAssetManagerEclipseHyperInferno7091, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512) != polarVoyageAssetManagerEclipseHyperInferno7091) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512);
            } while (!atomicLongFieldUpdater.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(polarVoyageSupervisorJobVortexDelta5512);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, j, j2));
        }
        polarVoyageSupervisorJobVortexDelta5512.PolarVoyageRotateAnimationCyberCelestialDelta4768();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = PolarVoyageRemoteModelManagerOlympianCelestial9141;
                obj = atomicReferenceFieldUpdater2.get(polarVoyageSupervisorJobVortexDelta5512);
                PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno70912 = obj == null ? PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageRemoteModelManagerOlympianCelestial9141 : PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageNavigationViewHyperHyperHyperion1793;
                while (!atomicReferenceFieldUpdater2.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, obj, polarVoyageAssetManagerEclipseHyperInferno70912)) {
                    if (atomicReferenceFieldUpdater2.get(polarVoyageSupervisorJobVortexDelta5512) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageRotateAnimationCyberCelestialDelta4768(1, obj);
                ((PolarVoyageStateFlowNebulaMax1492) obj).PolarVoyageZipVortexCelestial6185(polarVoyageSupervisorJobVortexDelta5512.PolarVoyageSnackbarGammaEclipse2140());
                return z2;
            }
        }
        return z2;
    }

    public boolean PolarVoyageLayerDrawableShadowTitaniumOmega1942() {
        return false;
    }

    public final Object PolarVoyageLifecycleOlympianOmega3762(PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDiffUtilTurboStrike5735;
        Object PolarVoyageBottomSheetOmegaNeo19072 = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageBottomSheetOmegaNeo1907(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageStrictModeLegendEpic1532;
        if (PolarVoyageBottomSheetOmegaNeo19072 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageDrawableDeltaHyperion5742;
                }
                if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19072, obj)) {
                    PolarVoyageCameraPixelBlaze2629();
                    return PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageCameraPixelBlaze2629;
                }
            }
        } else if (PolarVoyageBottomSheetOmegaNeo19072 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767 && polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19072, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageStrictModeLegendEpic1532)) {
            PolarVoyageCameraPixelBlaze2629();
            Object obj2 = atomicReferenceArray.get(i * 2);
            polarVoyageServiceInfoRogueTitanium9075.PolarVoyageCameraPixelBlaze2629(i, null);
            return obj2;
        }
        while (true) {
            Object PolarVoyageBottomSheetOmegaNeo19073 = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageBottomSheetOmegaNeo1907(i);
            if (PolarVoyageBottomSheetOmegaNeo19073 == null || PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBitmapVisionAuroraPixel4705) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageItemDecorationUltraDeltaEpic7485)) {
                        PolarVoyageCameraPixelBlaze2629();
                        return PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageSnackbarGammaEclipse2140;
                    }
                } else {
                    if (obj == null) {
                        return PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageDrawableDeltaHyperion5742;
                    }
                    if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19073, obj)) {
                        PolarVoyageCameraPixelBlaze2629();
                        return PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageCameraPixelBlaze2629;
                    }
                }
            } else if (PolarVoyageBottomSheetOmegaNeo19073 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (PolarVoyageBottomSheetOmegaNeo19073 == polarVoyageAssetManagerEclipseHyperInferno7091) {
                    return PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageSnackbarGammaEclipse2140;
                }
                if (PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    return PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageSnackbarGammaEclipse2140;
                }
                if (PolarVoyageBottomSheetOmegaNeo19073 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778) {
                    PolarVoyageCameraPixelBlaze2629();
                    return PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageSnackbarGammaEclipse2140;
                }
                if (PolarVoyageBottomSheetOmegaNeo19073 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageTextInputEditTextNebulaHero6651 && polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageDiffUtilTurboStrike5735)) {
                    boolean z = PolarVoyageBottomSheetOmegaNeo19073 instanceof PolarVoyageBillingClientTitaniumHyper4571;
                    if (z) {
                        PolarVoyageBottomSheetOmegaNeo19073 = ((PolarVoyageBillingClientTitaniumHyper4571) PolarVoyageBottomSheetOmegaNeo19073).PolarVoyageZipVortexCelestial6185;
                    }
                    if (PolarVoyageActivityInfoBetaQuantum8726(PolarVoyageBottomSheetOmegaNeo19073)) {
                        polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDrawableDeltaHyperion5742(i, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageStrictModeLegendEpic1532);
                        PolarVoyageCameraPixelBlaze2629();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        polarVoyageServiceInfoRogueTitanium9075.PolarVoyageCameraPixelBlaze2629(i, null);
                        return obj3;
                    }
                    polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDrawableDeltaHyperion5742(i, polarVoyageAssetManagerEclipseHyperInferno7091);
                    polarVoyageServiceInfoRogueTitanium9075.PolarVoyageItemDecorationUltraDeltaEpic7485();
                    if (z) {
                        PolarVoyageCameraPixelBlaze2629();
                    }
                    return PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageSnackbarGammaEclipse2140;
                }
            } else if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageStrictModeLegendEpic1532)) {
                PolarVoyageCameraPixelBlaze2629();
                Object obj4 = atomicReferenceArray.get(i * 2);
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageCameraPixelBlaze2629(i, null);
                return obj4;
            }
        }
    }

    public final boolean PolarVoyageLooperThreadAlphaPrime1279(Object obj, Object obj2) {
        if (!(obj instanceof PolarVoyageStorageCyberSparkSpeed8597)) {
            if (!(obj instanceof PolarVoyageAdapterAuroraStrike4860)) {
                PolarVoyageMeteringPointSolarMax4741.PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj, "Unexpected receiver type: ");
                return false;
            }
            PolarVoyageAdapterAuroraStrike4860 polarVoyageAdapterAuroraStrike4860 = (PolarVoyageAdapterAuroraStrike4860) obj;
            PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageZipVortexCelestial6185;
            PolarVoyageAssetManagerEclipseHyperInferno7091 PolarVoyageMotionLayoutForceEpicAurora7183 = polarVoyageAdapterAuroraStrike4860.PolarVoyageMotionLayoutForceEpicAurora7183(obj2, null);
            if (PolarVoyageMotionLayoutForceEpicAurora7183 == null) {
                return false;
            }
            polarVoyageAdapterAuroraStrike4860.PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageMotionLayoutForceEpicAurora7183);
            return true;
        }
        PolarVoyageStorageCyberSparkSpeed8597 polarVoyageStorageCyberSparkSpeed8597 = (PolarVoyageStorageCyberSparkSpeed8597) obj;
        PolarVoyageDebugStrikeEclipseQuantum3290 polarVoyageDebugStrikeEclipseQuantum3290 = polarVoyageStorageCyberSparkSpeed8597.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageDebugStrikeEclipseQuantum3290.getClass();
        polarVoyageStorageCyberSparkSpeed8597.PolarVoyageStrictModeLegendEpic1532 = null;
        polarVoyageStorageCyberSparkSpeed8597.PolarVoyageItemDecorationUltraDeltaEpic7485 = obj2;
        Boolean bool = Boolean.TRUE;
        polarVoyageStorageCyberSparkSpeed8597.PolarVoyageRotateAnimationCyberCelestialDelta4768.getClass();
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageZipVortexCelestial6185;
        PolarVoyageAssetManagerEclipseHyperInferno7091 PolarVoyageMotionLayoutForceEpicAurora71832 = polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageMotionLayoutForceEpicAurora7183(bool, null);
        if (PolarVoyageMotionLayoutForceEpicAurora71832 == null) {
            return false;
        }
        polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageMotionLayoutForceEpicAurora71832);
        return true;
    }

    public final boolean PolarVoyageMotionLayoutForceEpicAurora7183() {
        long j = PolarVoyageBottomSheetOmegaNeo1907.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final Throwable PolarVoyageNavigationViewHyperHyperHyperion1793() {
        Throwable PolarVoyageSnackbarGammaEclipse21402 = PolarVoyageSnackbarGammaEclipse2140();
        return PolarVoyageSnackbarGammaEclipse21402 == null ? new PolarVoyageRoomEntityInfernoSparkAlpha5361("Channel was closed") : PolarVoyageSnackbarGammaEclipse21402;
    }

    public final void PolarVoyagePackageManagerCelestialPhoenix8393(PolarVoyageScaleAnimationCelestialAuroraNeo6553 polarVoyageScaleAnimationCelestialAuroraNeo6553, boolean z) {
        if (polarVoyageScaleAnimationCelestialAuroraNeo6553 instanceof PolarVoyageAdapterAuroraStrike4860) {
            ((PolarVoyageTextInputLayoutTitaniumGamma2126) polarVoyageScaleAnimationCelestialAuroraNeo6553).PolarVoyageViewRogueMaster4778(new PolarVoyageTraceThunderMaster6506(z ? PolarVoyageContentProviderHyperSpark3838() : PolarVoyageNavigationViewHyperHyperHyperion1793()));
            return;
        }
        if (!(polarVoyageScaleAnimationCelestialAuroraNeo6553 instanceof PolarVoyageStorageCyberSparkSpeed8597)) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageScaleAnimationCelestialAuroraNeo6553, "Unexpected waiter: ");
            return;
        }
        PolarVoyageStorageCyberSparkSpeed8597 polarVoyageStorageCyberSparkSpeed8597 = (PolarVoyageStorageCyberSparkSpeed8597) polarVoyageScaleAnimationCelestialAuroraNeo6553;
        PolarVoyageDebugStrikeEclipseQuantum3290 polarVoyageDebugStrikeEclipseQuantum3290 = polarVoyageStorageCyberSparkSpeed8597.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageDebugStrikeEclipseQuantum3290.getClass();
        polarVoyageStorageCyberSparkSpeed8597.PolarVoyageStrictModeLegendEpic1532 = null;
        polarVoyageStorageCyberSparkSpeed8597.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778;
        Throwable PolarVoyageSnackbarGammaEclipse21402 = polarVoyageStorageCyberSparkSpeed8597.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageSnackbarGammaEclipse2140();
        if (PolarVoyageSnackbarGammaEclipse21402 == null) {
            polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageViewRogueMaster4778(Boolean.FALSE);
        } else {
            polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageViewRogueMaster4778(new PolarVoyageTraceThunderMaster6506(PolarVoyageSnackbarGammaEclipse21402));
        }
    }

    @Override // p000createpolar.PolarVoyageBarrierNovaSpeedMax9545
    public Object PolarVoyageRemoteModelManagerOlympianCelestial9141(Object obj) {
        PolarVoyageScrollViewNovaMega6604 polarVoyageScrollViewNovaMega6604 = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageKotlinBetaPulseBeta3653;
        AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageStrictModeLegendEpic1532;
        boolean z = false;
        long j = 1152921504606846975L;
        if (PolarVoyageDisplayMetricsVortexDragon9516(atomicLongFieldUpdater.get(this), false) ? false : !PolarVoyageTextInputEditTextNebulaHero6651(r1 & 1152921504606846975L)) {
            return polarVoyageScrollViewNovaMega6604;
        }
        PolarVoyageColorDrawableVisionPhantomCyber4545 polarVoyageColorDrawableVisionPhantomCyber4545 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = (PolarVoyageServiceInfoRogueTitanium9075) PolarVoyageCameraPixelBlaze2629.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageDisplayMetricsVortexDragon9516(andIncrement, z);
            int i = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 != j4) {
                PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(this, j4, polarVoyageServiceInfoRogueTitanium9075);
                if (PolarVoyageMotionLayoutTransitionHeroVision4068 != null) {
                    polarVoyageServiceInfoRogueTitanium9075 = PolarVoyageMotionLayoutTransitionHeroVision4068;
                } else {
                    if (PolarVoyageDisplayMetricsVortexDragon9516) {
                        return new PolarVoyageMapFusionNeoLegend4756(PolarVoyageNavigationViewHyperHyperHyperion1793());
                    }
                    z = false;
                    j = 1152921504606846975L;
                }
            }
            int PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735(this, polarVoyageServiceInfoRogueTitanium9075, i2, obj, j2, polarVoyageColorDrawableVisionPhantomCyber4545, PolarVoyageDisplayMetricsVortexDragon9516);
            PolarVoyageFilterGammaStrikeNova8373 polarVoyageFilterGammaStrikeNova8373 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            if (PolarVoyageDiffUtilTurboStrike5735 == 0) {
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                return polarVoyageFilterGammaStrikeNova8373;
            }
            if (PolarVoyageDiffUtilTurboStrike5735 == 1) {
                return polarVoyageFilterGammaStrikeNova8373;
            }
            if (PolarVoyageDiffUtilTurboStrike5735 == 2) {
                if (PolarVoyageDisplayMetricsVortexDragon9516) {
                    polarVoyageServiceInfoRogueTitanium9075.PolarVoyageItemDecorationUltraDeltaEpic7485();
                    return new PolarVoyageMapFusionNeoLegend4756(PolarVoyageNavigationViewHyperHyperHyperion1793());
                }
                PolarVoyageScaleAnimationCelestialAuroraNeo6553 polarVoyageScaleAnimationCelestialAuroraNeo6553 = polarVoyageColorDrawableVisionPhantomCyber4545 instanceof PolarVoyageScaleAnimationCelestialAuroraNeo6553 ? (PolarVoyageScaleAnimationCelestialAuroraNeo6553) polarVoyageColorDrawableVisionPhantomCyber4545 : null;
                if (polarVoyageScaleAnimationCelestialAuroraNeo6553 != null) {
                    polarVoyageScaleAnimationCelestialAuroraNeo6553.PolarVoyageZipVortexCelestial6185(polarVoyageServiceInfoRogueTitanium9075, i2 + i);
                }
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageItemDecorationUltraDeltaEpic7485();
                return polarVoyageScrollViewNovaMega6604;
            }
            if (PolarVoyageDiffUtilTurboStrike5735 == 3) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("unexpected");
                return null;
            }
            if (PolarVoyageDiffUtilTurboStrike5735 == 4) {
                if (j2 < PolarVoyageRotateAnimationCyberCelestialDelta4768.get(this)) {
                    polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                }
                return new PolarVoyageMapFusionNeoLegend4756(PolarVoyageNavigationViewHyperHyperHyperion1793());
            }
            if (PolarVoyageDiffUtilTurboStrike5735 == 5) {
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
            }
            z = false;
            j = 1152921504606846975L;
        }
    }

    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageStrictModeLegendEpic1532.get(this), false);
    }

    public final Throwable PolarVoyageSnackbarGammaEclipse2140() {
        return (Throwable) PolarVoyageContentProviderHyperSpark3838.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (p000createpolar.PolarVoyageServiceInfoRogueTitanium9075) ((p000createpolar.PolarVoyageGestureDetectorStrikeHyperion4153) p000createpolar.PolarVoyageGestureDetectorStrikeHyperion4153.PolarVoyageMotionLayoutTransitionHeroVision4068.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageStrictModeLegendEpic1532(long j) {
        Object obj;
        long j2;
        Object obj2 = PolarVoyageSnackbarGammaEclipse2140.get(this);
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = (PolarVoyageServiceInfoRogueTitanium9075) PolarVoyageCameraPixelBlaze2629.get(this);
        if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 > ((PolarVoyageServiceInfoRogueTitanium9075) obj2).PolarVoyageKotlinBetaPulseBeta3653) {
            obj2 = polarVoyageServiceInfoRogueTitanium9075;
        }
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752 = (PolarVoyageServiceInfoRogueTitanium9075) PolarVoyageDrawableDeltaHyperion5742.get(this);
        if (polarVoyageServiceInfoRogueTitanium90752.PolarVoyageKotlinBetaPulseBeta3653 > ((PolarVoyageServiceInfoRogueTitanium9075) obj2).PolarVoyageKotlinBetaPulseBeta3653) {
            obj2 = polarVoyageServiceInfoRogueTitanium90752;
        }
        PolarVoyageGestureDetectorStrikeHyperion4153 polarVoyageGestureDetectorStrikeHyperion4153 = (PolarVoyageGestureDetectorStrikeHyperion4153) obj2;
        loop0: while (true) {
            polarVoyageGestureDetectorStrikeHyperion4153.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageGestureDetectorStrikeHyperion4153.PolarVoyageZipVortexCelestial6185;
            Object obj3 = atomicReferenceFieldUpdater.get(polarVoyageGestureDetectorStrikeHyperion4153);
            PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageMotionLayoutTransitionHeroVision4068;
            obj = null;
            if (obj3 == polarVoyageAssetManagerEclipseHyperInferno7091) {
                break;
            }
            PolarVoyageGestureDetectorStrikeHyperion4153 polarVoyageGestureDetectorStrikeHyperion41532 = (PolarVoyageGestureDetectorStrikeHyperion4153) obj3;
            if (polarVoyageGestureDetectorStrikeHyperion41532 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(polarVoyageGestureDetectorStrikeHyperion4153, null, polarVoyageAssetManagerEclipseHyperInferno7091)) {
                    if (atomicReferenceFieldUpdater.get(polarVoyageGestureDetectorStrikeHyperion4153) != null) {
                        break;
                    }
                }
                break loop0;
            }
            polarVoyageGestureDetectorStrikeHyperion4153 = polarVoyageGestureDetectorStrikeHyperion41532;
        }
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90753 = (PolarVoyageServiceInfoRogueTitanium9075) polarVoyageGestureDetectorStrikeHyperion4153;
        if (PolarVoyageLayerDrawableShadowTitaniumOmega1942()) {
            PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90754 = polarVoyageServiceInfoRogueTitanium90753;
            loop2: do {
                int i = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068 - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (polarVoyageServiceInfoRogueTitanium90754.PolarVoyageKotlinBetaPulseBeta3653 * PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068) + i;
                    if (j2 < PolarVoyageRotateAnimationCyberCelestialDelta4768.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object PolarVoyageBottomSheetOmegaNeo19072 = polarVoyageServiceInfoRogueTitanium90754.PolarVoyageBottomSheetOmegaNeo1907(i);
                        if (PolarVoyageBottomSheetOmegaNeo19072 != null && PolarVoyageBottomSheetOmegaNeo19072 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBitmapVisionAuroraPixel4705) {
                            if (PolarVoyageBottomSheetOmegaNeo19072 == PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                                break loop2;
                            }
                        } else {
                            if (polarVoyageServiceInfoRogueTitanium90754.PolarVoyageRotateAnimationCyberCelestialDelta4768(i, PolarVoyageBottomSheetOmegaNeo19072, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778)) {
                                polarVoyageServiceInfoRogueTitanium90754.PolarVoyageItemDecorationUltraDeltaEpic7485();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (polarVoyageServiceInfoRogueTitanium90754 != null);
            j2 = -1;
            if (j2 != -1) {
                PolarVoyageViewRogueMaster4778(j2);
            }
        }
        loop5: for (PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90755 = polarVoyageServiceInfoRogueTitanium90753; polarVoyageServiceInfoRogueTitanium90755 != null; polarVoyageServiceInfoRogueTitanium90755 = (PolarVoyageServiceInfoRogueTitanium9075) ((PolarVoyageGestureDetectorStrikeHyperion4153) PolarVoyageGestureDetectorStrikeHyperion4153.PolarVoyageMotionLayoutTransitionHeroVision4068.get(polarVoyageServiceInfoRogueTitanium90755))) {
            for (int i2 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068 - 1; -1 < i2; i2--) {
                if ((polarVoyageServiceInfoRogueTitanium90755.PolarVoyageKotlinBetaPulseBeta3653 * PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068) + i2 < j) {
                    break loop5;
                }
                while (true) {
                    Object PolarVoyageBottomSheetOmegaNeo19073 = polarVoyageServiceInfoRogueTitanium90755.PolarVoyageBottomSheetOmegaNeo1907(i2);
                    if (PolarVoyageBottomSheetOmegaNeo19073 != null && PolarVoyageBottomSheetOmegaNeo19073 != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBitmapVisionAuroraPixel4705) {
                        if (!(PolarVoyageBottomSheetOmegaNeo19073 instanceof PolarVoyageBillingClientTitaniumHyper4571)) {
                            if (!(PolarVoyageBottomSheetOmegaNeo19073 instanceof PolarVoyageScaleAnimationCelestialAuroraNeo6553)) {
                                break;
                            }
                            if (polarVoyageServiceInfoRogueTitanium90755.PolarVoyageRotateAnimationCyberCelestialDelta4768(i2, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778)) {
                                obj = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageMotionLayoutForceEpicAurora7183(obj, PolarVoyageBottomSheetOmegaNeo19073);
                                polarVoyageServiceInfoRogueTitanium90755.PolarVoyageViewRogueMaster4778(i2, true);
                                break;
                            }
                        } else {
                            if (polarVoyageServiceInfoRogueTitanium90755.PolarVoyageRotateAnimationCyberCelestialDelta4768(i2, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778)) {
                                obj = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageMotionLayoutForceEpicAurora7183(obj, ((PolarVoyageBillingClientTitaniumHyper4571) PolarVoyageBottomSheetOmegaNeo19073).PolarVoyageZipVortexCelestial6185);
                                polarVoyageServiceInfoRogueTitanium90755.PolarVoyageViewRogueMaster4778(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (polarVoyageServiceInfoRogueTitanium90755.PolarVoyageRotateAnimationCyberCelestialDelta4768(i2, PolarVoyageBottomSheetOmegaNeo19073, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778)) {
                            polarVoyageServiceInfoRogueTitanium90755.PolarVoyageItemDecorationUltraDeltaEpic7485();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                PolarVoyagePackageManagerCelestialPhoenix8393((PolarVoyageScaleAnimationCelestialAuroraNeo6553) obj, true);
                return polarVoyageServiceInfoRogueTitanium90753;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                PolarVoyagePackageManagerCelestialPhoenix8393((PolarVoyageScaleAnimationCelestialAuroraNeo6553) arrayList.get(size), true);
            }
        }
        return polarVoyageServiceInfoRogueTitanium90753;
    }

    public final boolean PolarVoyageTextInputEditTextNebulaHero6651(long j) {
        return j < PolarVoyageBottomSheetOmegaNeo1907.get(this) || j < PolarVoyageRotateAnimationCyberCelestialDelta4768.get(this) + ((long) this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public final void PolarVoyageViewRogueMaster4778(long j) {
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = (PolarVoyageServiceInfoRogueTitanium9075) PolarVoyageDrawableDeltaHyperion5742.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageRotateAnimationCyberCelestialDelta4768;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.PolarVoyageItemDecorationUltraDeltaEpic7485 + j2, PolarVoyageBottomSheetOmegaNeo1907.get(this))) {
                return;
            }
            PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta5512 = this;
            if (atomicLongFieldUpdater.compareAndSet(polarVoyageSupervisorJobVortexDelta5512, j2, 1 + j2)) {
                long j3 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 != j4) {
                    PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageDrawableDeltaHyperion57422 = polarVoyageSupervisorJobVortexDelta5512.PolarVoyageDrawableDeltaHyperion5742(j4, polarVoyageServiceInfoRogueTitanium9075);
                    if (PolarVoyageDrawableDeltaHyperion57422 != null) {
                        polarVoyageServiceInfoRogueTitanium9075 = PolarVoyageDrawableDeltaHyperion57422;
                    }
                }
                PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752 = polarVoyageServiceInfoRogueTitanium9075;
                if (polarVoyageSupervisorJobVortexDelta5512.PolarVoyageLifecycleOlympianOmega3762(polarVoyageServiceInfoRogueTitanium90752, i, j2, null) != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageSnackbarGammaEclipse2140) {
                    polarVoyageServiceInfoRogueTitanium90752.PolarVoyageZipVortexCelestial6185();
                } else if (j2 < polarVoyageSupervisorJobVortexDelta5512.PolarVoyageAnimatorSetSparkUltraMax8233()) {
                    polarVoyageServiceInfoRogueTitanium90752.PolarVoyageZipVortexCelestial6185();
                }
                this = polarVoyageSupervisorJobVortexDelta5512;
                polarVoyageServiceInfoRogueTitanium9075 = polarVoyageServiceInfoRogueTitanium90752;
            }
            this = polarVoyageSupervisorJobVortexDelta5512;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144 A[RETURN] */
    @Override // p000createpolar.PolarVoyageBarrierNovaSpeedMax9545
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PolarVoyageZipVortexCelestial6185(PolarVoyageTextInputLayoutTitaniumGamma2126 polarVoyageTextInputLayoutTitaniumGamma2126, Object obj) {
        PolarVoyageFilterGammaStrikeNova8373 polarVoyageFilterGammaStrikeNova8373;
        Object PolarVoyageRemoteModelManagerOlympianCelestial91412;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageCameraPixelBlaze2629;
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = (PolarVoyageServiceInfoRogueTitanium9075) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageStrictModeLegendEpic1532;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageDisplayMetricsVortexDragon9516(andIncrement, false);
            int i = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653;
            PolarVoyageDrawableCompatAuroraPulse6414 polarVoyageDrawableCompatAuroraPulse6414 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageFilterGammaStrikeNova8373 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            if (j4 != j3) {
                PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(this, j3, polarVoyageServiceInfoRogueTitanium9075);
                if (PolarVoyageMotionLayoutTransitionHeroVision4068 != null) {
                    polarVoyageServiceInfoRogueTitanium9075 = PolarVoyageMotionLayoutTransitionHeroVision4068;
                } else if (PolarVoyageDisplayMetricsVortexDragon9516) {
                    Object PolarVoyageCameraViewSpectraMaxSpectra2824 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageTextInputLayoutTitaniumGamma2126, obj);
                    if (PolarVoyageCameraViewSpectraMaxSpectra2824 == polarVoyageDrawableCompatAuroraPulse6414) {
                        return PolarVoyageCameraViewSpectraMaxSpectra2824;
                    }
                }
            }
            int PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735(this, polarVoyageServiceInfoRogueTitanium9075, i2, obj, j, null, PolarVoyageDisplayMetricsVortexDragon9516);
            if (PolarVoyageDiffUtilTurboStrike5735 == 0) {
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                return polarVoyageFilterGammaStrikeNova8373;
            }
            if (PolarVoyageDiffUtilTurboStrike5735 == 1) {
                break;
            }
            if (PolarVoyageDiffUtilTurboStrike5735 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (PolarVoyageDiffUtilTurboStrike5735 == 3) {
                    PolarVoyageDebugStrikeEclipseQuantum3290 PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageToolbarEclipseInfernoHero6368(PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageCanvasElitePhoenix4750(polarVoyageTextInputLayoutTitaniumGamma2126));
                    try {
                        int PolarVoyageDiffUtilTurboStrike57352 = PolarVoyageDiffUtilTurboStrike5735(this, polarVoyageServiceInfoRogueTitanium9075, i2, obj, j, PolarVoyageToolbarEclipseInfernoHero6368, false);
                        if (PolarVoyageDiffUtilTurboStrike57352 == 0) {
                            polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                        } else if (PolarVoyageDiffUtilTurboStrike57352 != 1) {
                            if (PolarVoyageDiffUtilTurboStrike57352 != 2) {
                                if (PolarVoyageDiffUtilTurboStrike57352 != 4) {
                                    String str = "unexpected";
                                    if (PolarVoyageDiffUtilTurboStrike57352 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                                    PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium90752 = (PolarVoyageServiceInfoRogueTitanium9075) atomicReferenceFieldUpdater.get(this);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean PolarVoyageDisplayMetricsVortexDragon95162 = PolarVoyageDisplayMetricsVortexDragon9516(andIncrement2, false);
                                        int i3 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                        long j6 = i3;
                                        String str2 = str;
                                        long j7 = j5 / j6;
                                        int i4 = (int) (j5 % j6);
                                        if (polarVoyageServiceInfoRogueTitanium90752.PolarVoyageKotlinBetaPulseBeta3653 != j7) {
                                            PolarVoyageServiceInfoRogueTitanium9075 PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageMotionLayoutTransitionHeroVision4068(this, j7, polarVoyageServiceInfoRogueTitanium90752);
                                            if (PolarVoyageMotionLayoutTransitionHeroVision40682 != null) {
                                                polarVoyageServiceInfoRogueTitanium90752 = PolarVoyageMotionLayoutTransitionHeroVision40682;
                                            } else {
                                                if (PolarVoyageDisplayMetricsVortexDragon95162) {
                                                    break;
                                                }
                                                str = str2;
                                            }
                                        }
                                        int PolarVoyageDiffUtilTurboStrike57353 = PolarVoyageDiffUtilTurboStrike5735(this, polarVoyageServiceInfoRogueTitanium90752, i4, obj, j5, PolarVoyageToolbarEclipseInfernoHero6368, PolarVoyageDisplayMetricsVortexDragon95162);
                                        if (PolarVoyageDiffUtilTurboStrike57353 == 0) {
                                            polarVoyageServiceInfoRogueTitanium90752.PolarVoyageZipVortexCelestial6185();
                                            break;
                                        }
                                        if (PolarVoyageDiffUtilTurboStrike57353 == 1) {
                                            break;
                                        }
                                        if (PolarVoyageDiffUtilTurboStrike57353 != 2) {
                                            if (PolarVoyageDiffUtilTurboStrike57353 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (PolarVoyageDiffUtilTurboStrike57353 != 4) {
                                                if (PolarVoyageDiffUtilTurboStrike57353 == 5) {
                                                    polarVoyageServiceInfoRogueTitanium90752.PolarVoyageZipVortexCelestial6185();
                                                }
                                                str = str2;
                                            } else if (j5 < atomicLongFieldUpdater2.get(this)) {
                                                polarVoyageServiceInfoRogueTitanium90752.PolarVoyageZipVortexCelestial6185();
                                            }
                                        } else if (PolarVoyageDisplayMetricsVortexDragon95162) {
                                            polarVoyageServiceInfoRogueTitanium90752.PolarVoyageItemDecorationUltraDeltaEpic7485();
                                        } else {
                                            PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageZipVortexCelestial6185(polarVoyageServiceInfoRogueTitanium90752, i4 + i3);
                                        }
                                    }
                                } else if (j < atomicLongFieldUpdater2.get(this)) {
                                    polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                                }
                                PolarVoyageKotlinBetaPulseBeta3653(this, obj, PolarVoyageToolbarEclipseInfernoHero6368);
                            } else {
                                PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageZipVortexCelestial6185(polarVoyageServiceInfoRogueTitanium9075, i2 + i);
                            }
                            PolarVoyageRemoteModelManagerOlympianCelestial91412 = PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageRemoteModelManagerOlympianCelestial9141();
                            if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != polarVoyageDrawableCompatAuroraPulse6414) {
                                PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageFilterGammaStrikeNova8373;
                            }
                            if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != polarVoyageDrawableCompatAuroraPulse6414) {
                                return PolarVoyageRemoteModelManagerOlympianCelestial91412;
                            }
                        }
                        PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageViewRogueMaster4778(polarVoyageFilterGammaStrikeNova8373);
                        PolarVoyageRemoteModelManagerOlympianCelestial91412 = PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageRemoteModelManagerOlympianCelestial9141();
                        if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != polarVoyageDrawableCompatAuroraPulse6414) {
                        }
                        if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != polarVoyageDrawableCompatAuroraPulse6414) {
                            break;
                        }
                    } catch (Throwable th) {
                        PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageLifecycleOlympianOmega3762();
                        throw th;
                    }
                } else if (PolarVoyageDiffUtilTurboStrike5735 == 4) {
                    if (j < atomicLongFieldUpdater2.get(this)) {
                        polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                    }
                    Object PolarVoyageCameraViewSpectraMaxSpectra28242 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageTextInputLayoutTitaniumGamma2126, obj);
                    if (PolarVoyageCameraViewSpectraMaxSpectra28242 == polarVoyageDrawableCompatAuroraPulse6414) {
                        return PolarVoyageCameraViewSpectraMaxSpectra28242;
                    }
                } else if (PolarVoyageDiffUtilTurboStrike5735 == 5) {
                    polarVoyageServiceInfoRogueTitanium9075.PolarVoyageZipVortexCelestial6185();
                }
            } else if (PolarVoyageDisplayMetricsVortexDragon9516) {
                polarVoyageServiceInfoRogueTitanium9075.PolarVoyageItemDecorationUltraDeltaEpic7485();
                Object PolarVoyageCameraViewSpectraMaxSpectra28243 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageTextInputLayoutTitaniumGamma2126, obj);
                if (PolarVoyageCameraViewSpectraMaxSpectra28243 == polarVoyageDrawableCompatAuroraPulse6414) {
                    return PolarVoyageCameraViewSpectraMaxSpectra28243;
                }
            }
        }
        return polarVoyageFilterGammaStrikeNova8373;
    }

    @Override // p000createpolar.PolarVoyageFirebaseHeroVision8149
    public final PolarVoyageStorageCyberSparkSpeed8597 iterator() {
        return new PolarVoyageStorageCyberSparkSpeed8597(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0192, code lost:
    
        r16 = null;
        r3 = (p000createpolar.PolarVoyageServiceInfoRogueTitanium9075) r3.PolarVoyageMotionLayoutTransitionHeroVision4068();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019b, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        int i = (int) (PolarVoyageStrictModeLegendEpic1532.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.PolarVoyageItemDecorationUltraDeltaEpic7485 + ',');
        sb.append("data=[");
        int i2 = 0;
        List PolarVoyageConfigurationMaxSpectraForce5418 = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageConfigurationMaxSpectraForce5418(PolarVoyageDrawableDeltaHyperion5742.get(this), PolarVoyageCameraPixelBlaze2629.get(this), PolarVoyageSnackbarGammaEclipse2140.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : PolarVoyageConfigurationMaxSpectraForce5418) {
            if (((PolarVoyageServiceInfoRogueTitanium9075) obj) != PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageZipVortexCelestial6185) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((PolarVoyageServiceInfoRogueTitanium9075) next).PolarVoyageKotlinBetaPulseBeta3653;
            do {
                Object next2 = it.next();
                long j2 = ((PolarVoyageServiceInfoRogueTitanium9075) next2).PolarVoyageKotlinBetaPulseBeta3653;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        PolarVoyageServiceInfoRogueTitanium9075 polarVoyageServiceInfoRogueTitanium9075 = (PolarVoyageServiceInfoRogueTitanium9075) next;
        long j3 = PolarVoyageRotateAnimationCyberCelestialDelta4768.get(this);
        long PolarVoyageAnimatorSetSparkUltraMax8233 = PolarVoyageAnimatorSetSparkUltraMax8233();
        loop2: while (true) {
            int i3 = PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j4 = (polarVoyageServiceInfoRogueTitanium9075.PolarVoyageKotlinBetaPulseBeta3653 * PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageMotionLayoutTransitionHeroVision4068) + i4;
                if (j4 >= PolarVoyageAnimatorSetSparkUltraMax8233 && j4 >= j3) {
                    str = null;
                    break loop2;
                }
                Object PolarVoyageBottomSheetOmegaNeo19072 = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageBottomSheetOmegaNeo1907(i4);
                Object obj2 = polarVoyageServiceInfoRogueTitanium9075.PolarVoyageDiffUtilTurboStrike5735.get(i4 * 2);
                if (PolarVoyageBottomSheetOmegaNeo19072 instanceof PolarVoyageAdapterAuroraStrike4860) {
                    str2 = (j4 >= j3 || j4 < PolarVoyageAnimatorSetSparkUltraMax8233) ? (j4 >= PolarVoyageAnimatorSetSparkUltraMax8233 || j4 < j3) ? "cont" : "send" : "receive";
                } else if (PolarVoyageBottomSheetOmegaNeo19072 instanceof PolarVoyageBillingClientTitaniumHyper4571) {
                    str2 = "EB(" + PolarVoyageBottomSheetOmegaNeo19072 + ')';
                } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBottomSheetOmegaNeo19072, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageDiffUtilTurboStrike5735) || PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBottomSheetOmegaNeo19072, PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageTextInputEditTextNebulaHero6651)) {
                    str2 = "resuming_sender";
                } else {
                    if (PolarVoyageBottomSheetOmegaNeo19072 != null && !PolarVoyageBottomSheetOmegaNeo19072.equals(PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBitmapVisionAuroraPixel4705) && !PolarVoyageBottomSheetOmegaNeo19072.equals(PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageStrictModeLegendEpic1532) && !PolarVoyageBottomSheetOmegaNeo19072.equals(PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageItemDecorationUltraDeltaEpic7485) && !PolarVoyageBottomSheetOmegaNeo19072.equals(PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageBottomSheetOmegaNeo1907) && !PolarVoyageBottomSheetOmegaNeo19072.equals(PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageRotateAnimationCyberCelestialDelta4768) && !PolarVoyageBottomSheetOmegaNeo19072.equals(PolarVoyageOnGlobalLayoutListenerTitanNebulaRogue4451.PolarVoyageViewRogueMaster4778)) {
                        str2 = PolarVoyageBottomSheetOmegaNeo19072.toString();
                    }
                    i4++;
                }
                if (obj2 != null) {
                    sb.append("(" + str2 + ',' + obj2 + "),");
                } else {
                    sb.append(str2 + ',');
                }
                i4++;
            }
            i2 = 0;
        }
        if (sb.length() == 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }
}
