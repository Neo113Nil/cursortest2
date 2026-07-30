package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageDebugStrikeEclipseQuantum3290 extends PolarVoyageRoomDaoEclipseFusion1874 implements PolarVoyageAdapterAuroraStrike4860, PolarVoyageColorStateListInflaterTitanNova8547, PolarVoyageScaleAnimationCelestialAuroraNeo6553 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater PolarVoyageCameraPixelBlaze2629 = AtomicIntegerFieldUpdater.newUpdater(PolarVoyageDebugStrikeEclipseQuantum3290.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageDrawableDeltaHyperion5742 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageDebugStrikeEclipseQuantum3290.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageSnackbarGammaEclipse2140 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageDebugStrikeEclipseQuantum3290.class, Object.class, "_parentHandle$volatile");
    public final PolarVoyageTextInputLayoutTitaniumGamma2126 PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageEventNebulaCelestialOlympian6822 PolarVoyageViewRogueMaster4778;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public PolarVoyageDebugStrikeEclipseQuantum3290(int i, PolarVoyageTextInputLayoutTitaniumGamma2126 polarVoyageTextInputLayoutTitaniumGamma2126) {
        super(i);
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageTextInputLayoutTitaniumGamma2126;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageTextInputLayoutTitaniumGamma2126.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = PolarVoyageColorStateListInflaterSolarCosmos7375.PolarVoyageZipVortexCelestial6185;
    }

    public static void PolarVoyagePackageManagerCelestialPhoenix8393(PolarVoyageScrollViewSpectraEpic8109 polarVoyageScrollViewSpectraEpic8109, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + polarVoyageScrollViewSpectraEpic8109 + ", already has " + obj).toString());
    }

    public static Object PolarVoyageViewBindingPulseHeroSpeed5705(PolarVoyageScrollViewSpectraEpic8109 polarVoyageScrollViewSpectraEpic8109, Object obj, int i, PolarVoyageViewPagerNovaShadow8337 polarVoyageViewPagerNovaShadow8337) {
        if (obj instanceof PolarVoyageAlarmManagerPulsePrimeUltra2847) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (polarVoyageViewPagerNovaShadow8337 != null || (polarVoyageScrollViewSpectraEpic8109 instanceof PolarVoyageFaceDetectionAuroraGammaSpeed5797)) {
            return new PolarVoyagePoseDetectionRogueTitanium2405(obj, polarVoyageScrollViewSpectraEpic8109 instanceof PolarVoyageFaceDetectionAuroraGammaSpeed5797 ? (PolarVoyageFaceDetectionAuroraGammaSpeed5797) polarVoyageScrollViewSpectraEpic8109 : null, polarVoyageViewPagerNovaShadow8337, (Throwable) null, 16);
        }
        return obj;
    }

    public String PolarVoyageActivityInfoBetaQuantum8726() {
        return "CancellableContinuation";
    }

    public final boolean PolarVoyageAlertDialogCyberHeroQuantum3938() {
        return PolarVoyageDrawableDeltaHyperion5742.get(this) instanceof PolarVoyageScrollViewSpectraEpic8109;
    }

    @Override // p000createpolar.PolarVoyageAdapterAuroraStrike4860
    public final boolean PolarVoyageAnimatorSetSparkUltraMax8233(Throwable th) {
        Throwable th2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageDrawableDeltaHyperion5742;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof PolarVoyageScrollViewSpectraEpic8109)) {
                return false;
            }
            boolean z = (obj instanceof PolarVoyageFaceDetectionAuroraGammaSpeed5797) || (obj instanceof PolarVoyageRunnableSparkRogue7241);
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            PolarVoyageClipDrawableSolarUltraNebula3030 polarVoyageClipDrawableSolarUltraNebula3030 = new PolarVoyageClipDrawableSolarUltraNebula3030(th2, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, polarVoyageClipDrawableSolarUltraNebula3030)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            PolarVoyageScrollViewSpectraEpic8109 polarVoyageScrollViewSpectraEpic8109 = (PolarVoyageScrollViewSpectraEpic8109) obj;
            if (polarVoyageScrollViewSpectraEpic8109 instanceof PolarVoyageFaceDetectionAuroraGammaSpeed5797) {
                PolarVoyageRotateAnimationCyberCelestialDelta4768((PolarVoyageFaceDetectionAuroraGammaSpeed5797) obj, th);
            } else if (polarVoyageScrollViewSpectraEpic8109 instanceof PolarVoyageRunnableSparkRogue7241) {
                PolarVoyageCameraPixelBlaze2629((PolarVoyageRunnableSparkRogue7241) obj, th);
            }
            if (!PolarVoyageCameraViewSpectraMaxSpectra2824()) {
                PolarVoyageDrawableDeltaHyperion5742();
            }
            PolarVoyageSnackbarGammaEclipse2140(this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
            return true;
        }
    }

    @Override // p000createpolar.PolarVoyageRoomDaoEclipseFusion1874
    public final PolarVoyageTextInputLayoutTitaniumGamma2126 PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        return this.PolarVoyageBottomSheetOmegaNeo1907;
    }

    public final PolarVoyagePagingDataStormPhantomEclipse5825 PolarVoyageBitmapMaxTitanTitan7960() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        PolarVoyageSoundPoolNebulaThunderVortex8476 polarVoyageSoundPoolNebulaThunderVortex8476 = (PolarVoyageSoundPoolNebulaThunderVortex8476) this.PolarVoyageViewRogueMaster4778.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageDelayNovaRogueBeta9839.PolarVoyageFCMCelestialCosmosPixel3711);
        if (polarVoyageSoundPoolNebulaThunderVortex8476 == null) {
            return null;
        }
        PolarVoyagePagingDataStormPhantomEclipse5825 PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageToolbarEclipseInfernoHero6368(polarVoyageSoundPoolNebulaThunderVortex8476, true, new PolarVoyageViewPagerUltraElite7733(this, 0));
        do {
            atomicReferenceFieldUpdater = PolarVoyageSnackbarGammaEclipse2140;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, PolarVoyageToolbarEclipseInfernoHero6368)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return PolarVoyageToolbarEclipseInfernoHero6368;
    }

    @Override // p000createpolar.PolarVoyageRoomDaoEclipseFusion1874
    public final Throwable PolarVoyageBitmapVisionAuroraPixel4705(Object obj) {
        Throwable PolarVoyageBitmapVisionAuroraPixel4705 = super.PolarVoyageBitmapVisionAuroraPixel4705(obj);
        if (PolarVoyageBitmapVisionAuroraPixel4705 != null) {
            return PolarVoyageBitmapVisionAuroraPixel4705;
        }
        return null;
    }

    public final void PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageViewPagerNovaShadow8337 polarVoyageViewPagerNovaShadow8337, Throwable th, Object obj) {
        PolarVoyageEventNebulaCelestialOlympian6822 polarVoyageEventNebulaCelestialOlympian6822 = this.PolarVoyageViewRogueMaster4778;
        try {
            polarVoyageViewPagerNovaShadow8337.PolarVoyageBitmapVisionAuroraPixel4705(th, obj, polarVoyageEventNebulaCelestialOlympian6822);
        } catch (Throwable th2) {
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageGuidelineStormSolar2850(polarVoyageEventNebulaCelestialOlympian6822, new PolarVoyageToolbarNovaTitanSpeed3010("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void PolarVoyageCameraPixelBlaze2629(PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue7241, Throwable th) {
        PolarVoyageEventNebulaCelestialOlympian6822 polarVoyageEventNebulaCelestialOlympian6822 = this.PolarVoyageViewRogueMaster4778;
        int i = PolarVoyageCameraPixelBlaze2629.get(this) & 536870911;
        if (i == 536870911) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            polarVoyageRunnableSparkRogue7241.PolarVoyageTextInputEditTextNebulaHero6651(i, polarVoyageEventNebulaCelestialOlympian6822);
        } catch (Throwable th2) {
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageGuidelineStormSolar2850(polarVoyageEventNebulaCelestialOlympian6822, new PolarVoyageToolbarNovaTitanSpeed3010("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean PolarVoyageCameraViewSpectraMaxSpectra2824() {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == 2) {
            return PolarVoyageContentProviderEclipseSolarVortex9392.PolarVoyageSnackbarGammaEclipse2140.get((PolarVoyageContentProviderEclipseSolarVortex9392) this.PolarVoyageBottomSheetOmegaNeo1907) != null;
        }
        return false;
    }

    public Throwable PolarVoyageContentProviderHyperSpark3838(PolarVoyageInputFilterFusionMax7714 polarVoyageInputFilterFusionMax7714) {
        return polarVoyageInputFilterFusionMax7714.PolarVoyageBitmapMaxTitanTitan7960();
    }

    public final void PolarVoyageDiffUtilDragonSpeedEclipse6225(Object obj, int i, PolarVoyageViewPagerNovaShadow8337 polarVoyageViewPagerNovaShadow8337) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageDrawableDeltaHyperion5742;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof PolarVoyageScrollViewSpectraEpic8109) {
                Object PolarVoyageViewBindingPulseHeroSpeed5705 = PolarVoyageViewBindingPulseHeroSpeed5705((PolarVoyageScrollViewSpectraEpic8109) obj2, obj, i, polarVoyageViewPagerNovaShadow8337);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, PolarVoyageViewBindingPulseHeroSpeed5705)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!PolarVoyageCameraViewSpectraMaxSpectra2824()) {
                    PolarVoyageDrawableDeltaHyperion5742();
                }
                PolarVoyageSnackbarGammaEclipse2140(i);
                return;
            }
            if (obj2 instanceof PolarVoyageClipDrawableSolarUltraNebula3030) {
                PolarVoyageClipDrawableSolarUltraNebula3030 polarVoyageClipDrawableSolarUltraNebula3030 = (PolarVoyageClipDrawableSolarUltraNebula3030) obj2;
                if (PolarVoyageClipDrawableSolarUltraNebula3030.PolarVoyageKotlinBetaPulseBeta3653.compareAndSet(polarVoyageClipDrawableSolarUltraNebula3030, 0, 1)) {
                    if (polarVoyageViewPagerNovaShadow8337 != null) {
                        PolarVoyageBottomSheetOmegaNeo1907(polarVoyageViewPagerNovaShadow8337, polarVoyageClipDrawableSolarUltraNebula3030.PolarVoyageZipVortexCelestial6185, obj);
                        return;
                    }
                    return;
                }
            }
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    @Override // p000createpolar.PolarVoyageRoomDaoEclipseFusion1874
    public final Object PolarVoyageDiffUtilTurboStrike5735(Object obj) {
        return obj instanceof PolarVoyagePoseDetectionRogueTitanium2405 ? ((PolarVoyagePoseDetectionRogueTitanium2405) obj).PolarVoyageZipVortexCelestial6185 : obj;
    }

    public final void PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492) {
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(new PolarVoyageFaceDetectionAuroraGammaSpeed5797(1, polarVoyageStateFlowNebulaMax1492));
    }

    public final void PolarVoyageDrawableDeltaHyperion5742() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageSnackbarGammaEclipse2140;
        PolarVoyagePagingDataStormPhantomEclipse5825 polarVoyagePagingDataStormPhantomEclipse5825 = (PolarVoyagePagingDataStormPhantomEclipse5825) atomicReferenceFieldUpdater.get(this);
        if (polarVoyagePagingDataStormPhantomEclipse5825 == null) {
            return;
        }
        polarVoyagePagingDataStormPhantomEclipse5825.PolarVoyageZipVortexCelestial6185();
        atomicReferenceFieldUpdater.set(this, PolarVoyageTraceCelestialForce1015.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public final void PolarVoyageFCMCelestialCosmosPixel3711(PolarVoyageAccelerometerAuroraTitanSpeed7821 polarVoyageAccelerometerAuroraTitanSpeed7821) {
        PolarVoyageTextInputLayoutTitaniumGamma2126 polarVoyageTextInputLayoutTitaniumGamma2126 = this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageContentProviderEclipseSolarVortex9392 polarVoyageContentProviderEclipseSolarVortex9392 = polarVoyageTextInputLayoutTitaniumGamma2126 instanceof PolarVoyageContentProviderEclipseSolarVortex9392 ? (PolarVoyageContentProviderEclipseSolarVortex9392) polarVoyageTextInputLayoutTitaniumGamma2126 : null;
        PolarVoyageDiffUtilDragonSpeedEclipse6225(PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185, (polarVoyageContentProviderEclipseSolarVortex9392 != null ? polarVoyageContentProviderEclipseSolarVortex9392.PolarVoyageBottomSheetOmegaNeo1907 : null) == polarVoyageAccelerometerAuroraTitanSpeed7821 ? 4 : this.PolarVoyageRotateAnimationCyberCelestialDelta4768, null);
    }

    @Override // p000createpolar.PolarVoyageAdapterAuroraStrike4860
    public final void PolarVoyageKotlinBetaPulseBeta3653(Object obj, PolarVoyageViewPagerNovaShadow8337 polarVoyageViewPagerNovaShadow8337) {
        PolarVoyageDiffUtilDragonSpeedEclipse6225(obj, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageViewPagerNovaShadow8337);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        PolarVoyagePackageManagerCelestialPhoenix8393(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageScrollViewSpectraEpic8109 polarVoyageScrollViewSpectraEpic8109) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageDrawableDeltaHyperion5742;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof PolarVoyageColorStateListInflaterSolarCosmos7375) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, polarVoyageScrollViewSpectraEpic8109)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof PolarVoyageFaceDetectionAuroraGammaSpeed5797) || (obj instanceof PolarVoyageRunnableSparkRogue7241)) {
                break;
            }
            if (obj instanceof PolarVoyageAlarmManagerPulsePrimeUltra2847) {
                PolarVoyageAlarmManagerPulsePrimeUltra2847 polarVoyageAlarmManagerPulsePrimeUltra2847 = (PolarVoyageAlarmManagerPulsePrimeUltra2847) obj;
                if (!PolarVoyageAlarmManagerPulsePrimeUltra2847.PolarVoyageMotionLayoutTransitionHeroVision4068.compareAndSet(polarVoyageAlarmManagerPulsePrimeUltra2847, 0, 1)) {
                    PolarVoyagePackageManagerCelestialPhoenix8393(polarVoyageScrollViewSpectraEpic8109, obj);
                    throw null;
                }
                if (obj instanceof PolarVoyageClipDrawableSolarUltraNebula3030) {
                    Throwable th = polarVoyageAlarmManagerPulsePrimeUltra2847.PolarVoyageZipVortexCelestial6185;
                    if (polarVoyageScrollViewSpectraEpic8109 instanceof PolarVoyageFaceDetectionAuroraGammaSpeed5797) {
                        PolarVoyageRotateAnimationCyberCelestialDelta4768((PolarVoyageFaceDetectionAuroraGammaSpeed5797) polarVoyageScrollViewSpectraEpic8109, th);
                        return;
                    } else {
                        PolarVoyageCameraPixelBlaze2629((PolarVoyageRunnableSparkRogue7241) polarVoyageScrollViewSpectraEpic8109, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof PolarVoyagePoseDetectionRogueTitanium2405)) {
                if (polarVoyageScrollViewSpectraEpic8109 instanceof PolarVoyageRunnableSparkRogue7241) {
                    return;
                }
                PolarVoyagePoseDetectionRogueTitanium2405 polarVoyagePoseDetectionRogueTitanium2405 = new PolarVoyagePoseDetectionRogueTitanium2405(obj, (PolarVoyageFaceDetectionAuroraGammaSpeed5797) polarVoyageScrollViewSpectraEpic8109, (PolarVoyageViewPagerNovaShadow8337) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, polarVoyagePoseDetectionRogueTitanium2405)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            PolarVoyagePoseDetectionRogueTitanium2405 polarVoyagePoseDetectionRogueTitanium24052 = (PolarVoyagePoseDetectionRogueTitanium2405) obj;
            if (polarVoyagePoseDetectionRogueTitanium24052.PolarVoyageMotionLayoutTransitionHeroVision4068 != null) {
                PolarVoyagePackageManagerCelestialPhoenix8393(polarVoyageScrollViewSpectraEpic8109, obj);
                throw null;
            }
            if (polarVoyageScrollViewSpectraEpic8109 instanceof PolarVoyageRunnableSparkRogue7241) {
                return;
            }
            PolarVoyageFaceDetectionAuroraGammaSpeed5797 polarVoyageFaceDetectionAuroraGammaSpeed5797 = (PolarVoyageFaceDetectionAuroraGammaSpeed5797) polarVoyageScrollViewSpectraEpic8109;
            Throwable th2 = polarVoyagePoseDetectionRogueTitanium24052.PolarVoyageBitmapVisionAuroraPixel4705;
            if (th2 != null) {
                PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageFaceDetectionAuroraGammaSpeed5797, th2);
                return;
            }
            PolarVoyagePoseDetectionRogueTitanium2405 PolarVoyageZipVortexCelestial6185 = PolarVoyagePoseDetectionRogueTitanium2405.PolarVoyageZipVortexCelestial6185(polarVoyagePoseDetectionRogueTitanium24052, polarVoyageFaceDetectionAuroraGammaSpeed5797, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, PolarVoyageZipVortexCelestial6185)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final void PolarVoyageLifecycleOlympianOmega3762() {
        PolarVoyageTextInputLayoutTitaniumGamma2126 polarVoyageTextInputLayoutTitaniumGamma2126 = this.PolarVoyageBottomSheetOmegaNeo1907;
        Throwable th = null;
        PolarVoyageContentProviderEclipseSolarVortex9392 polarVoyageContentProviderEclipseSolarVortex9392 = polarVoyageTextInputLayoutTitaniumGamma2126 instanceof PolarVoyageContentProviderEclipseSolarVortex9392 ? (PolarVoyageContentProviderEclipseSolarVortex9392) polarVoyageTextInputLayoutTitaniumGamma2126 : null;
        if (polarVoyageContentProviderEclipseSolarVortex9392 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageContentProviderEclipseSolarVortex9392.PolarVoyageSnackbarGammaEclipse2140;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(polarVoyageContentProviderEclipseSolarVortex9392);
                PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageKotlinBetaPulseBeta3653;
                if (obj == polarVoyageAssetManagerEclipseHyperInferno7091) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(polarVoyageContentProviderEclipseSolarVortex9392, polarVoyageAssetManagerEclipseHyperInferno7091, this)) {
                        if (atomicReferenceFieldUpdater.get(polarVoyageContentProviderEclipseSolarVortex9392) != polarVoyageAssetManagerEclipseHyperInferno7091) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        PolarVoyageMeteringPointSolarMax4741.PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(polarVoyageContentProviderEclipseSolarVortex9392, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(polarVoyageContentProviderEclipseSolarVortex9392) != obj) {
                            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            PolarVoyageDrawableDeltaHyperion5742();
            PolarVoyageAnimatorSetSparkUltraMax8233(th);
        }
    }

    @Override // p000createpolar.PolarVoyageAdapterAuroraStrike4860
    public final void PolarVoyageLooperThreadAlphaPrime1279(Object obj) {
        PolarVoyageSnackbarGammaEclipse2140(this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
    }

    @Override // p000createpolar.PolarVoyageAdapterAuroraStrike4860
    public final PolarVoyageAssetManagerEclipseHyperInferno7091 PolarVoyageMotionLayoutForceEpicAurora7183(Object obj, PolarVoyageViewPagerNovaShadow8337 polarVoyageViewPagerNovaShadow8337) {
        PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageMotionLayoutTransitionHeroVision4068;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageDrawableDeltaHyperion5742;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof PolarVoyageScrollViewSpectraEpic8109)) {
                return null;
            }
            Object PolarVoyageViewBindingPulseHeroSpeed5705 = PolarVoyageViewBindingPulseHeroSpeed5705((PolarVoyageScrollViewSpectraEpic8109) obj2, obj, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageViewPagerNovaShadow8337);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, PolarVoyageViewBindingPulseHeroSpeed5705)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!PolarVoyageCameraViewSpectraMaxSpectra2824()) {
                PolarVoyageDrawableDeltaHyperion5742();
            }
            return polarVoyageAssetManagerEclipseHyperInferno7091;
        }
    }

    @Override // p000createpolar.PolarVoyageRoomDaoEclipseFusion1874
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageDrawableDeltaHyperion5742;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof PolarVoyageScrollViewSpectraEpic8109) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Not completed");
                return;
            }
            if (obj instanceof PolarVoyageAlarmManagerPulsePrimeUltra2847) {
                return;
            }
            if (!(obj instanceof PolarVoyagePoseDetectionRogueTitanium2405)) {
                cancellationException2 = cancellationException;
                PolarVoyagePoseDetectionRogueTitanium2405 polarVoyagePoseDetectionRogueTitanium2405 = new PolarVoyagePoseDetectionRogueTitanium2405(obj, (PolarVoyageFaceDetectionAuroraGammaSpeed5797) null, (PolarVoyageViewPagerNovaShadow8337) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, polarVoyagePoseDetectionRogueTitanium2405)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            PolarVoyagePoseDetectionRogueTitanium2405 polarVoyagePoseDetectionRogueTitanium24052 = (PolarVoyagePoseDetectionRogueTitanium2405) obj;
            if (polarVoyagePoseDetectionRogueTitanium24052.PolarVoyageBitmapVisionAuroraPixel4705 != null) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Must be called at most once");
                return;
            }
            PolarVoyagePoseDetectionRogueTitanium2405 PolarVoyageZipVortexCelestial6185 = PolarVoyagePoseDetectionRogueTitanium2405.PolarVoyageZipVortexCelestial6185(polarVoyagePoseDetectionRogueTitanium24052, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, PolarVoyageZipVortexCelestial6185)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            PolarVoyageFaceDetectionAuroraGammaSpeed5797 polarVoyageFaceDetectionAuroraGammaSpeed5797 = polarVoyagePoseDetectionRogueTitanium24052.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (polarVoyageFaceDetectionAuroraGammaSpeed5797 != null) {
                PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageFaceDetectionAuroraGammaSpeed5797, cancellationException);
            }
            PolarVoyageViewPagerNovaShadow8337 polarVoyageViewPagerNovaShadow8337 = polarVoyagePoseDetectionRogueTitanium24052.PolarVoyageKotlinBetaPulseBeta3653;
            if (polarVoyageViewPagerNovaShadow8337 != null) {
                PolarVoyageBottomSheetOmegaNeo1907(polarVoyageViewPagerNovaShadow8337, cancellationException, polarVoyagePoseDetectionRogueTitanium24052.PolarVoyageZipVortexCelestial6185);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    public final void PolarVoyageNavigationViewHyperHyperHyperion1793() {
        PolarVoyagePagingDataStormPhantomEclipse5825 PolarVoyageBitmapMaxTitanTitan7960 = PolarVoyageBitmapMaxTitanTitan7960();
        if (PolarVoyageBitmapMaxTitanTitan7960 == null || (PolarVoyageDrawableDeltaHyperion5742.get(this) instanceof PolarVoyageScrollViewSpectraEpic8109)) {
            return;
        }
        PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageZipVortexCelestial6185();
        PolarVoyageSnackbarGammaEclipse2140.set(this, PolarVoyageTraceCelestialForce1015.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public final Object PolarVoyageRemoteModelManagerOlympianCelestial9141() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        PolarVoyageSoundPoolNebulaThunderVortex8476 polarVoyageSoundPoolNebulaThunderVortex8476;
        boolean PolarVoyageCameraViewSpectraMaxSpectra2824 = PolarVoyageCameraViewSpectraMaxSpectra2824();
        do {
            atomicIntegerFieldUpdater = PolarVoyageCameraPixelBlaze2629;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Already suspended");
                    return null;
                }
                if (PolarVoyageCameraViewSpectraMaxSpectra2824) {
                    PolarVoyageLifecycleOlympianOmega3762();
                }
                Object obj = PolarVoyageDrawableDeltaHyperion5742.get(this);
                if (obj instanceof PolarVoyageAlarmManagerPulsePrimeUltra2847) {
                    throw ((PolarVoyageAlarmManagerPulsePrimeUltra2847) obj).PolarVoyageZipVortexCelestial6185;
                }
                int i3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if ((i3 != 1 && i3 != 2) || (polarVoyageSoundPoolNebulaThunderVortex8476 = (PolarVoyageSoundPoolNebulaThunderVortex8476) this.PolarVoyageViewRogueMaster4778.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageDelayNovaRogueBeta9839.PolarVoyageFCMCelestialCosmosPixel3711)) == null || polarVoyageSoundPoolNebulaThunderVortex8476.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                    return PolarVoyageDiffUtilTurboStrike5735(obj);
                }
                CancellationException PolarVoyageBitmapMaxTitanTitan7960 = polarVoyageSoundPoolNebulaThunderVortex8476.PolarVoyageBitmapMaxTitanTitan7960();
                PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageBitmapMaxTitanTitan7960);
                throw PolarVoyageBitmapMaxTitanTitan7960;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((PolarVoyagePagingDataStormPhantomEclipse5825) PolarVoyageSnackbarGammaEclipse2140.get(this)) == null) {
            PolarVoyageBitmapMaxTitanTitan7960();
        }
        if (PolarVoyageCameraViewSpectraMaxSpectra2824) {
            PolarVoyageLifecycleOlympianOmega3762();
        }
        return PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFaceDetectionAuroraGammaSpeed5797 polarVoyageFaceDetectionAuroraGammaSpeed5797, Throwable th) {
        try {
            switch (polarVoyageFaceDetectionAuroraGammaSpeed5797.PolarVoyageZipVortexCelestial6185) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    ((ScheduledFuture) polarVoyageFaceDetectionAuroraGammaSpeed5797.PolarVoyageMotionLayoutTransitionHeroVision4068).cancel(false);
                    break;
                case 1:
                    ((PolarVoyageStateFlowNebulaMax1492) polarVoyageFaceDetectionAuroraGammaSpeed5797.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageZipVortexCelestial6185(th);
                    break;
                default:
                    ((PolarVoyagePagingDataStormPhantomEclipse5825) polarVoyageFaceDetectionAuroraGammaSpeed5797.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageZipVortexCelestial6185();
                    break;
            }
        } catch (Throwable th2) {
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageGuidelineStormSolar2850(this.PolarVoyageViewRogueMaster4778, new PolarVoyageToolbarNovaTitanSpeed3010("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void PolarVoyageSnackbarGammaEclipse2140(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = PolarVoyageCameraPixelBlaze2629;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Already resumed");
                    return;
                }
                boolean z = i == 4;
                PolarVoyageTextInputLayoutTitaniumGamma2126 polarVoyageTextInputLayoutTitaniumGamma2126 = this.PolarVoyageBottomSheetOmegaNeo1907;
                if (!z && (polarVoyageTextInputLayoutTitaniumGamma2126 instanceof PolarVoyageContentProviderEclipseSolarVortex9392)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        PolarVoyageContentProviderEclipseSolarVortex9392 polarVoyageContentProviderEclipseSolarVortex9392 = (PolarVoyageContentProviderEclipseSolarVortex9392) polarVoyageTextInputLayoutTitaniumGamma2126;
                        PolarVoyageAccelerometerAuroraTitanSpeed7821 polarVoyageAccelerometerAuroraTitanSpeed7821 = polarVoyageContentProviderEclipseSolarVortex9392.PolarVoyageBottomSheetOmegaNeo1907;
                        PolarVoyageEventNebulaCelestialOlympian6822 context = polarVoyageContentProviderEclipseSolarVortex9392.PolarVoyageViewRogueMaster4778.getContext();
                        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageClipboardManagerAuroraPixel8666(polarVoyageAccelerometerAuroraTitanSpeed7821, context)) {
                            PolarVoyageR8VisionOmegaNebula9943.PolarVoyageDisplayMetricsForceEclipseVision4728(polarVoyageAccelerometerAuroraTitanSpeed7821, context, this);
                            return;
                        }
                        PolarVoyageProGuardVisionRogue4249 PolarVoyageZipVortexCelestial6185 = PolarVoyageTextWatcherNebulaVortex1931.PolarVoyageZipVortexCelestial6185();
                        if (PolarVoyageZipVortexCelestial6185.PolarVoyageRotateAnimationCyberCelestialDelta4768 >= 4294967296L) {
                            PolarVoyageZipVortexCelestial6185.PolarVoyageAlarmManagerShadowHyperBeta8339(this);
                            return;
                        }
                        PolarVoyageZipVortexCelestial6185.PolarVoyageGuidelineStormSolar2850(true);
                        try {
                            PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(this, polarVoyageTextInputLayoutTitaniumGamma2126, true);
                            do {
                            } while (PolarVoyageZipVortexCelestial6185.PolarVoyageCanvasElitePhoenix4750());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(this, polarVoyageTextInputLayoutTitaniumGamma2126, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override // p000createpolar.PolarVoyageRoomDaoEclipseFusion1874
    public final Object PolarVoyageStrictModeLegendEpic1532() {
        return PolarVoyageDrawableDeltaHyperion5742.get(this);
    }

    @Override // p000createpolar.PolarVoyageColorStateListInflaterTitanNova8547
    public final PolarVoyageColorStateListInflaterTitanNova8547 PolarVoyageTextInputEditTextNebulaHero6651() {
        PolarVoyageTextInputLayoutTitaniumGamma2126 polarVoyageTextInputLayoutTitaniumGamma2126 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageTextInputLayoutTitaniumGamma2126 instanceof PolarVoyageColorStateListInflaterTitanNova8547) {
            return (PolarVoyageColorStateListInflaterTitanNova8547) polarVoyageTextInputLayoutTitaniumGamma2126;
        }
        return null;
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTitaniumGamma2126
    public final void PolarVoyageViewRogueMaster4778(Object obj) {
        Throwable PolarVoyageZipVortexCelestial6185 = PolarVoyageAnimatorSetTitanMegaNeo5701.PolarVoyageZipVortexCelestial6185(obj);
        if (PolarVoyageZipVortexCelestial6185 != null) {
            obj = new PolarVoyageAlarmManagerPulsePrimeUltra2847(PolarVoyageZipVortexCelestial6185, false);
        }
        PolarVoyageDiffUtilDragonSpeedEclipse6225(obj, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, null);
    }

    @Override // p000createpolar.PolarVoyageScaleAnimationCelestialAuroraNeo6553
    public final void PolarVoyageZipVortexCelestial6185(PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue7241, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = PolarVoyageCameraPixelBlaze2629;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageRunnableSparkRogue7241);
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTitaniumGamma2126
    public final PolarVoyageEventNebulaCelestialOlympian6822 getContext() {
        return this.PolarVoyageViewRogueMaster4778;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PolarVoyageActivityInfoBetaQuantum8726());
        sb.append('(');
        sb.append(PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageAlarmManagerShadowHyperBeta8339(this.PolarVoyageBottomSheetOmegaNeo1907));
        sb.append("){");
        Object obj = PolarVoyageDrawableDeltaHyperion5742.get(this);
        sb.append(obj instanceof PolarVoyageScrollViewSpectraEpic8109 ? "Active" : obj instanceof PolarVoyageClipDrawableSolarUltraNebula3030 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageSnackbarGammaEclipse2140(this));
        return sb.toString();
    }
}
