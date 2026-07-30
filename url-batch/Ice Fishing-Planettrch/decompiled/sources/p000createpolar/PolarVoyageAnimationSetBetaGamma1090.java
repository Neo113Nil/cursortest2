package p000createpolar;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageAnimationSetBetaGamma1090 extends ViewGroup {
    public PolarVoyageGradleQuantumForce9782 PolarVoyageBottomSheetOmegaNeo1907;
    public boolean PolarVoyageCameraPixelBlaze2629;
    public boolean PolarVoyageDrawableDeltaHyperion5742;
    public WeakReference PolarVoyageItemDecorationUltraDeltaEpic7485;
    public PolarVoyageConstraintSetOmegaStormMaster2126 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public boolean PolarVoyageSnackbarGammaEclipse2140;
    public IBinder PolarVoyageStrictModeLegendEpic1532;
    public PolarVoyageBitmapMegaEpicSolar7353 PolarVoyageViewRogueMaster4778;

    public PolarVoyageAnimationSetBetaGamma1090(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        PolarVoyageFCMCyberAurora5283 polarVoyageFCMCyberAurora5283 = new PolarVoyageFCMCyberAurora5283(2, this);
        addOnAttachStateChangeListener(polarVoyageFCMCyberAurora5283);
        PolarVoyageBindingAdapterGammaOlympianCelestial7569 polarVoyageBindingAdapterGammaOlympianCelestial7569 = new PolarVoyageBindingAdapterGammaOlympianCelestial7569(5);
        PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageAnimatorSetSparkUltraMax8233(this).PolarVoyageZipVortexCelestial6185.add(polarVoyageBindingAdapterGammaOlympianCelestial7569);
        this.PolarVoyageViewRogueMaster4778 = new PolarVoyageBitmapMegaEpicSolar7353(this, polarVoyageFCMCyberAurora5283, polarVoyageBindingAdapterGammaOlympianCelestial7569);
    }

    private final void setParentContext(PolarVoyageGradleQuantumForce9782 polarVoyageGradleQuantumForce9782) {
        if (this.PolarVoyageBottomSheetOmegaNeo1907 != polarVoyageGradleQuantumForce9782) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageGradleQuantumForce9782;
            if (polarVoyageGradleQuantumForce9782 != null) {
                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
            }
            PolarVoyageConstraintSetOmegaStormMaster2126 polarVoyageConstraintSetOmegaStormMaster2126 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (polarVoyageConstraintSetOmegaStormMaster2126 != null) {
                polarVoyageConstraintSetOmegaStormMaster2126.PolarVoyageZipVortexCelestial6185();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
                if (isAttachedToWindow()) {
                    PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.PolarVoyageStrictModeLegendEpic1532 != iBinder) {
            this.PolarVoyageStrictModeLegendEpic1532 = iBinder;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.PolarVoyageDrawableDeltaHyperion5742 = true;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageInterstitialAdLegendStrike9732.PolarVoyageZipVortexCelestial6185(this, PolarVoyageTextInputEditTextNebulaHero6651(), new PolarVoyageProximitySensorStrikeEclipse8832(-656146368, new PolarVoyageRemoteModelManagerVisionNebula5966(objArr == true ? 1 : 0, this), true));
            } finally {
                this.PolarVoyageDrawableDeltaHyperion5742 = false;
            }
        }
    }

    public void PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void PolarVoyageDiffUtilTurboStrike5735(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653() {
        if (this.PolarVoyageDrawableDeltaHyperion5742) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public abstract void PolarVoyageMotionLayoutTransitionHeroVision4068(int i, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718);

    /* JADX WARN: Multi-variable type inference failed */
    public final PolarVoyageGradleQuantumForce9782 PolarVoyageTextInputEditTextNebulaHero6651() {
        PolarVoyageSQLiteAuroraSolarSpark5167 polarVoyageSQLiteAuroraSolarSpark5167;
        PolarVoyageEventNebulaCelestialOlympian6822 polarVoyageEventNebulaCelestialOlympian6822;
        PolarVoyageProximitySensorCosmosVisionSpectra3312 polarVoyageProximitySensorCosmosVisionSpectra3312;
        PolarVoyageGradleQuantumForce9782 polarVoyageGradleQuantumForce9782 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageGradleQuantumForce9782 == null) {
            polarVoyageGradleQuantumForce9782 = PolarVoyageOnClickListenerGammaDeltaNeo4849.PolarVoyageMotionLayoutTransitionHeroVision4068(this);
            if (polarVoyageGradleQuantumForce9782 == null) {
                Object parent = getParent();
                while (polarVoyageGradleQuantumForce9782 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    polarVoyageGradleQuantumForce9782 = PolarVoyageOnClickListenerGammaDeltaNeo4849.PolarVoyageMotionLayoutTransitionHeroVision4068(view);
                    parent = view.getParent();
                }
            }
            if (polarVoyageGradleQuantumForce9782 != null) {
                PolarVoyageGradleQuantumForce9782 polarVoyageGradleQuantumForce97822 = (!(polarVoyageGradleQuantumForce9782 instanceof PolarVoyageSQLiteAuroraSolarSpark5167) || ((PolarVoyageNavigationCosmosMasterGamma2168) ((PolarVoyageSQLiteAuroraSolarSpark5167) polarVoyageGradleQuantumForce9782).PolarVoyageBitmapMaxTitanTitan7960.getValue()).compareTo(PolarVoyageNavigationCosmosMasterGamma2168.PolarVoyageStrictModeLegendEpic1532) > 0) ? polarVoyageGradleQuantumForce9782 : null;
                if (polarVoyageGradleQuantumForce97822 != null) {
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new WeakReference(polarVoyageGradleQuantumForce97822);
                }
            } else {
                polarVoyageGradleQuantumForce9782 = null;
            }
            if (polarVoyageGradleQuantumForce9782 == null) {
                WeakReference weakReference = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (weakReference == null || (polarVoyageGradleQuantumForce9782 = (PolarVoyageGradleQuantumForce9782) weakReference.get()) == null || ((polarVoyageGradleQuantumForce9782 instanceof PolarVoyageSQLiteAuroraSolarSpark5167) && ((PolarVoyageNavigationCosmosMasterGamma2168) ((PolarVoyageSQLiteAuroraSolarSpark5167) polarVoyageGradleQuantumForce9782).PolarVoyageBitmapMaxTitanTitan7960.getValue()).compareTo(PolarVoyageNavigationCosmosMasterGamma2168.PolarVoyageStrictModeLegendEpic1532) <= 0)) {
                    polarVoyageGradleQuantumForce9782 = null;
                }
                if (polarVoyageGradleQuantumForce9782 == null) {
                    if (!isAttachedToWindow()) {
                        PolarVoyagePackageManagerUltraQuantumInferno5642.PolarVoyageMotionLayoutTransitionHeroVision4068("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    PolarVoyageGradleQuantumForce9782 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageOnClickListenerGammaDeltaNeo4849.PolarVoyageMotionLayoutTransitionHeroVision4068(view2);
                    if (PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
                        ((PolarVoyageActionBarEclipseStorm5969) PolarVoyageFirebaseModelDownloadConditionsTitanPixel2833.PolarVoyageZipVortexCelestial6185.get()).getClass();
                        PolarVoyageDialogFragmentLegendEpic2069 polarVoyageDialogFragmentLegendEpic2069 = PolarVoyageDialogFragmentLegendEpic2069.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        PolarVoyageInterpolatorCelestialFusion9132 polarVoyageInterpolatorCelestialFusion9132 = PolarVoyageJobSchedulerStormSolar7380.PolarVoyageBitmapMaxTitanTitan7960;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            polarVoyageEventNebulaCelestialOlympian6822 = (PolarVoyageEventNebulaCelestialOlympian6822) PolarVoyageJobSchedulerStormSolar7380.PolarVoyageBitmapMaxTitanTitan7960.getValue();
                        } else {
                            polarVoyageEventNebulaCelestialOlympian6822 = (PolarVoyageEventNebulaCelestialOlympian6822) PolarVoyageJobSchedulerStormSolar7380.PolarVoyageDisplayMetricsVortexDragon9516.get();
                            if (polarVoyageEventNebulaCelestialOlympian6822 == null) {
                                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        PolarVoyageEventNebulaCelestialOlympian6822 PolarVoyageDiffUtilTurboStrike5735 = polarVoyageEventNebulaCelestialOlympian6822.PolarVoyageDiffUtilTurboStrike5735(polarVoyageDialogFragmentLegendEpic2069);
                        PolarVoyageVibratorForceOlympian3454 polarVoyageVibratorForceOlympian3454 = (PolarVoyageVibratorForceOlympian3454) PolarVoyageDiffUtilTurboStrike5735.PolarVoyageDrawableDeltaHyperion5742(PolarVoyagePagingSourceEpicSolarStorm3628.PolarVoyageDisplayMetricsVortexDragon9516);
                        if (polarVoyageVibratorForceOlympian3454 != null) {
                            PolarVoyageProximitySensorCosmosVisionSpectra3312 polarVoyageProximitySensorCosmosVisionSpectra33122 = new PolarVoyageProximitySensorCosmosVisionSpectra3312(polarVoyageVibratorForceOlympian3454);
                            PolarVoyagePoseDetectionPrimeNebula3086 polarVoyagePoseDetectionPrimeNebula3086 = (PolarVoyagePoseDetectionPrimeNebula3086) polarVoyageProximitySensorCosmosVisionSpectra33122.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                            synchronized (polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageStrictModeLegendEpic1532) {
                                polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageItemDecorationUltraDeltaEpic7485 = false;
                                polarVoyageProximitySensorCosmosVisionSpectra3312 = polarVoyageProximitySensorCosmosVisionSpectra33122;
                            }
                        } else {
                            polarVoyageProximitySensorCosmosVisionSpectra3312 = 0;
                        }
                        PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega5005 = new PolarVoyageFragmentTransactionMaxMaxMega5005();
                        PolarVoyageEventNebulaCelestialOlympian6822 polarVoyageEventNebulaCelestialOlympian68222 = (PolarVoyageTextInputEditTextSpeedUltraDragon5222) PolarVoyageDiffUtilTurboStrike5735.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageDelayNovaRogueBeta9839.PolarVoyageViewBindingPulseHeroSpeed5705);
                        if (polarVoyageEventNebulaCelestialOlympian68222 == null) {
                            polarVoyageEventNebulaCelestialOlympian68222 = new PolarVoyageButtonSparkBeta4846();
                            polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageEventNebulaCelestialOlympian68222;
                        }
                        if (polarVoyageProximitySensorCosmosVisionSpectra3312 != 0) {
                            polarVoyageDialogFragmentLegendEpic2069 = polarVoyageProximitySensorCosmosVisionSpectra3312;
                        }
                        PolarVoyageEventNebulaCelestialOlympian6822 PolarVoyageDiffUtilTurboStrike57352 = PolarVoyageDiffUtilTurboStrike5735.PolarVoyageDiffUtilTurboStrike5735(polarVoyageDialogFragmentLegendEpic2069).PolarVoyageDiffUtilTurboStrike5735(polarVoyageEventNebulaCelestialOlympian68222);
                        PolarVoyageSQLiteAuroraSolarSpark5167 polarVoyageSQLiteAuroraSolarSpark51672 = new PolarVoyageSQLiteAuroraSolarSpark5167(PolarVoyageDiffUtilTurboStrike57352);
                        synchronized (polarVoyageSQLiteAuroraSolarSpark51672.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                            polarVoyageSQLiteAuroraSolarSpark51672.PolarVoyageAnimatorSetSparkUltraMax8233 = true;
                        }
                        PolarVoyageIntentMaxSparkShadow7006 PolarVoyageZipVortexCelestial6185 = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageZipVortexCelestial6185(PolarVoyageDiffUtilTurboStrike57352);
                        PolarVoyageTranslateAnimationMegaCyber7300 PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageRotateAnimationCyberCelestialDelta4768(view2);
                        PolarVoyageGradientDrawableNeoVisionSpeed1253 PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageRotateAnimationCyberCelestialDelta4768 != null ? PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageTextInputEditTextNebulaHero6651() : null;
                        if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                            PolarVoyagePackageManagerUltraQuantumInferno5642.PolarVoyageKotlinBetaPulseBeta3653("ViewTreeLifecycleOwner not found from " + view2);
                            throw new PolarVoyageToolbarNovaTitanSpeed3010();
                        }
                        view2.addOnAttachStateChangeListener(new PolarVoyageLooperBlazePulse5139(view2, polarVoyageSQLiteAuroraSolarSpark51672));
                        PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185(new PolarVoyageFlowStormAlphaOlympian9762(PolarVoyageZipVortexCelestial6185, polarVoyageProximitySensorCosmosVisionSpectra3312, polarVoyageSQLiteAuroraSolarSpark51672, polarVoyageFragmentTransactionMaxMaxMega5005, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, polarVoyageSQLiteAuroraSolarSpark51672);
                        PolarVoyageVelocityTrackerMegaSpectraPrime1955 polarVoyageVelocityTrackerMegaSpectraPrime1955 = PolarVoyageVelocityTrackerMegaSpectraPrime1955.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        Handler handler = view2.getHandler();
                        int i = PolarVoyageFirebaseDeltaSpark1229.PolarVoyageZipVortexCelestial6185;
                        view2.addOnAttachStateChangeListener(new PolarVoyageFCMCyberAurora5283(3, PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDatabaseCosmosSpectraSolar3905(polarVoyageVelocityTrackerMegaSpectraPrime1955, new PolarVoyageButtonBetaFusion6638(handler, "windowRecomposer cleanup", false).PolarVoyageCameraPixelBlaze2629, new PolarVoyageConstraintSetCloneSparkSparkOlympian9041(polarVoyageSQLiteAuroraSolarSpark51672, view2, r1, 28), 2)));
                        polarVoyageSQLiteAuroraSolarSpark5167 = polarVoyageSQLiteAuroraSolarSpark51672;
                    } else {
                        if (!(PolarVoyageMotionLayoutTransitionHeroVision4068 instanceof PolarVoyageSQLiteAuroraSolarSpark5167)) {
                            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        polarVoyageSQLiteAuroraSolarSpark5167 = (PolarVoyageSQLiteAuroraSolarSpark5167) PolarVoyageMotionLayoutTransitionHeroVision4068;
                    }
                    r1 = ((PolarVoyageNavigationCosmosMasterGamma2168) polarVoyageSQLiteAuroraSolarSpark5167.PolarVoyageBitmapMaxTitanTitan7960.getValue()).compareTo(PolarVoyageNavigationCosmosMasterGamma2168.PolarVoyageStrictModeLegendEpic1532) > 0 ? polarVoyageSQLiteAuroraSolarSpark5167 : null;
                    if (r1 != null) {
                        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new WeakReference(r1);
                    }
                    return polarVoyageSQLiteAuroraSolarSpark5167;
                }
            }
        }
        return polarVoyageGradleQuantumForce9782;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        PolarVoyageKotlinBetaPulseBeta3653();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        PolarVoyageKotlinBetaPulseBeta3653();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final boolean getHasComposition() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768 != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.PolarVoyageCameraPixelBlaze2629;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.PolarVoyageSnackbarGammaEclipse2140 || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        PolarVoyageBitmapVisionAuroraPixel4705(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        PolarVoyageDiffUtilTurboStrike5735(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(PolarVoyageGradleQuantumForce9782 polarVoyageGradleQuantumForce9782) {
        setParentContext(polarVoyageGradleQuantumForce9782);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.PolarVoyageCameraPixelBlaze2629 = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((PolarVoyageRewardedAdUltraTitanium4787) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.PolarVoyageSnackbarGammaEclipse2140 = true;
    }

    public final void setViewCompositionStrategy(PolarVoyageActivityInfoPrimeShadow7130 polarVoyageActivityInfoPrimeShadow7130) {
        PolarVoyageBitmapMegaEpicSolar7353 polarVoyageBitmapMegaEpicSolar7353 = this.PolarVoyageViewRogueMaster4778;
        if (polarVoyageBitmapMegaEpicSolar7353 != null) {
            polarVoyageBitmapMegaEpicSolar7353.PolarVoyageMotionLayoutTransitionHeroVision4068();
        }
        ((PolarVoyageVideoCaptureNeoNovaX8992) polarVoyageActivityInfoPrimeShadow7130).getClass();
        PolarVoyageFCMCyberAurora5283 polarVoyageFCMCyberAurora5283 = new PolarVoyageFCMCyberAurora5283(2, this);
        addOnAttachStateChangeListener(polarVoyageFCMCyberAurora5283);
        PolarVoyageBindingAdapterGammaOlympianCelestial7569 polarVoyageBindingAdapterGammaOlympianCelestial7569 = new PolarVoyageBindingAdapterGammaOlympianCelestial7569(5);
        PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageAnimatorSetSparkUltraMax8233(this).PolarVoyageZipVortexCelestial6185.add(polarVoyageBindingAdapterGammaOlympianCelestial7569);
        this.PolarVoyageViewRogueMaster4778 = new PolarVoyageBitmapMegaEpicSolar7353(this, polarVoyageFCMCyberAurora5283, polarVoyageBindingAdapterGammaOlympianCelestial7569);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        PolarVoyageKotlinBetaPulseBeta3653();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        PolarVoyageKotlinBetaPulseBeta3653();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        PolarVoyageKotlinBetaPulseBeta3653();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        PolarVoyageKotlinBetaPulseBeta3653();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        PolarVoyageKotlinBetaPulseBeta3653();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
