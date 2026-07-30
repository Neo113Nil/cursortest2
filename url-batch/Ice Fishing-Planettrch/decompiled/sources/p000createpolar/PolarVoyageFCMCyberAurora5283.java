package p000createpolar;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFCMCyberAurora5283 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageFCMCyberAurora5283(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX3322 = (PolarVoyageTransitionManagerHeroNovaX3322) obj;
                AccessibilityManager accessibilityManager = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageTextInputEditTextNebulaHero6651;
                polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageBottomSheetOmegaNeo1907 = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageStrictModeLegendEpic1532);
                accessibilityManager.addTouchExplorationStateChangeListener(polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                break;
            case 1:
                PolarVoyageTextViewTitaniumHyperion2777 polarVoyageTextViewTitaniumHyperion2777 = (PolarVoyageTextViewTitaniumHyperion2777) obj;
                Context context = view.getContext();
                if (!polarVoyageTextViewTitaniumHyperion2777.PolarVoyageZipVortexCelestial6185) {
                    context.getApplicationContext().registerComponentCallbacks((PolarVoyageSQLiteHeroSpeedAurora3684) polarVoyageTextViewTitaniumHyperion2777.PolarVoyageBitmapVisionAuroraPixel4705);
                    polarVoyageTextViewTitaniumHyperion2777.PolarVoyageZipVortexCelestial6185 = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        boolean z = false;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX3322 = (PolarVoyageTransitionManagerHeroNovaX3322) obj;
                polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageViewRogueMaster4778.removeCallbacks(polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageCanvasElitePhoenix4750);
                AccessibilityManager accessibilityManager = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageTextInputEditTextNebulaHero6651;
                accessibilityManager.removeAccessibilityStateChangeListener(polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageStrictModeLegendEpic1532);
                accessibilityManager.removeTouchExplorationStateChangeListener(polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                break;
            case 1:
                PolarVoyageTextViewTitaniumHyperion2777 polarVoyageTextViewTitaniumHyperion2777 = (PolarVoyageTextViewTitaniumHyperion2777) obj;
                Context context = view.getContext();
                if (polarVoyageTextViewTitaniumHyperion2777.PolarVoyageZipVortexCelestial6185) {
                    context.getApplicationContext().unregisterComponentCallbacks((PolarVoyageSQLiteHeroSpeedAurora3684) polarVoyageTextViewTitaniumHyperion2777.PolarVoyageBitmapVisionAuroraPixel4705);
                    polarVoyageTextViewTitaniumHyperion2777.PolarVoyageZipVortexCelestial6185 = false;
                    break;
                }
                break;
            case 2:
                PolarVoyageAnimationSetBetaGamma1090 polarVoyageAnimationSetBetaGamma1090 = (PolarVoyageAnimationSetBetaGamma1090) obj;
                Iterator it = PolarVoyageViewModelScopeRogueFusion1953.PolarVoyageContentProviderHyperSpark3838(polarVoyageAnimationSetBetaGamma1090.getParent(), PolarVoyageRecyclerViewStrikePulseCelestial1673.PolarVoyageSnackbarGammaEclipse2140).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    PolarVoyageConstraintSetOmegaStormMaster2126 polarVoyageConstraintSetOmegaStormMaster2126 = polarVoyageAnimationSetBetaGamma1090.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    if (polarVoyageConstraintSetOmegaStormMaster2126 != null) {
                        polarVoyageConstraintSetOmegaStormMaster2126.PolarVoyageZipVortexCelestial6185();
                    }
                    polarVoyageAnimationSetBetaGamma1090.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
                    polarVoyageAnimationSetBetaGamma1090.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((PolarVoyageContentProviderOlympianThunderMaster3423) obj).PolarVoyageBarcodeScannerInfernoSolarSpark7767(null);
                break;
        }
    }

    private final void PolarVoyageMotionLayoutTransitionHeroVision4068(View view) {
    }

    private final void PolarVoyageZipVortexCelestial6185(View view) {
    }
}
