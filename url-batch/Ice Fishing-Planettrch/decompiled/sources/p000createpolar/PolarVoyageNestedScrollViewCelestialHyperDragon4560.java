package p000createpolar;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageNestedScrollViewCelestialHyperDragon4560 {
    public static final PolarVoyagePaintLegendNebulaLegend3234 PolarVoyageDiffUtilTurboStrike5735 = new PolarVoyagePaintLegendNebulaLegend3234(3);
    public final Rect PolarVoyageZipVortexCelestial6185 = new Rect();
    public final Rect PolarVoyageMotionLayoutTransitionHeroVision4068 = new Rect();
    public final Rect PolarVoyageKotlinBetaPulseBeta3653 = new Rect();
    public final PolarVoyageLayoutOlympianMega5153 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageLayoutOlympianMega5153(new PolarVoyageBroadcastDragonShadowRogue6783(15, this));
    public final ArrayList PolarVoyageBitmapVisionAuroraPixel4705 = new ArrayList();

    public static void PolarVoyageBarcodeScannerInfernoSolarSpark7767(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View PolarVoyageKotlinBetaPulseBeta3653(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        rect2.set(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = (View) arrayList.get(i2);
            if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(view3, view) && !PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(view3, viewGroup)) {
                Rect rect3 = this.PolarVoyageKotlinBetaPulseBeta3653;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                PolarVoyageCardViewPulseSpark7250 PolarVoyageAnimatorSetSparkUltraMax8233 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageAnimatorSetSparkUltraMax8233(rect3);
                PolarVoyageCardViewPulseSpark7250 PolarVoyageAnimatorSetSparkUltraMax82332 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageAnimatorSetSparkUltraMax8233(rect2);
                PolarVoyageCardViewPulseSpark7250 PolarVoyageAnimatorSetSparkUltraMax82333 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageAnimatorSetSparkUltraMax8233(rect);
                PolarVoyageSensorManagerEliteInfernoStrike7658 PolarVoyageAlertDialogNovaXCelestial4954 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageAlertDialogNovaXCelestial4954(i);
                if (PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageViewRogueMaster4778(PolarVoyageAnimatorSetSparkUltraMax8233, PolarVoyageAnimatorSetSparkUltraMax82332, PolarVoyageAnimatorSetSparkUltraMax82333, PolarVoyageAlertDialogNovaXCelestial4954 != null ? PolarVoyageAlertDialogNovaXCelestial4954.PolarVoyageZipVortexCelestial6185 : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    public final View PolarVoyageMotionLayoutTransitionHeroVision4068(ViewGroup viewGroup, View view, int i) {
        ViewGroup viewGroup2;
        View view2 = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else if (viewGroup3 != null) {
                    viewGroup2 = viewGroup3;
                }
            }
        }
        viewGroup2 = viewGroup;
        View PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageKotlinBetaPulseBeta3653(view, viewGroup2, i);
        boolean z = true;
        View view3 = PolarVoyageKotlinBetaPulseBeta3653;
        while (PolarVoyageKotlinBetaPulseBeta3653 != null) {
            if (PolarVoyageKotlinBetaPulseBeta3653.isFocusable() && PolarVoyageKotlinBetaPulseBeta3653.getVisibility() == 0 && (!PolarVoyageKotlinBetaPulseBeta3653.isInTouchMode() || PolarVoyageKotlinBetaPulseBeta3653.isFocusableInTouchMode())) {
                view2 = PolarVoyageKotlinBetaPulseBeta3653;
                break;
            }
            PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageKotlinBetaPulseBeta3653, viewGroup2, i);
            boolean z2 = !z;
            if (!z) {
                view3 = view3 != null ? PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageKotlinBetaPulseBeta3653(view3, viewGroup2, i) : null;
                if (view3 == PolarVoyageKotlinBetaPulseBeta3653) {
                    break;
                }
            }
            z = z2;
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> arrayList = this.PolarVoyageBitmapVisionAuroraPixel4705;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageDiffUtilTurboStrike5735(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                view2 = PolarVoyageZipVortexCelestial6185(i, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final View PolarVoyageZipVortexCelestial6185(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        ArrayList arrayList2;
        int indexOf;
        int lastIndexOf;
        int i2;
        Rect rect2 = this.PolarVoyageZipVortexCelestial6185;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 17 || i == 33) {
                    PolarVoyageBarcodeScannerInfernoSolarSpark7767(viewGroup, rect2);
                } else if (i == 66 || i == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                PolarVoyageBarcodeScannerInfernoSolarSpark7767(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            PolarVoyageBarcodeScannerInfernoSolarSpark7767(viewGroup, rect2);
        }
        View view2 = null;
        if (i != 1 && i != 2) {
            if (i == 17 || i == 33 || i == 66 || i == 130) {
                return PolarVoyageKotlinBetaPulseBeta3653(i, rect2, view, viewGroup, arrayList);
            }
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Unknown direction: ", i));
            return null;
        }
        PolarVoyageLayoutOlympianMega5153 polarVoyageLayoutOlympianMega5153 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        try {
            polarVoyageLayoutOlympianMega5153.PolarVoyageZipVortexCelestial6185(arrayList, viewGroup);
            Collections.sort(arrayList, polarVoyageLayoutOlympianMega5153);
            polarVoyageLayoutOlympianMega5153.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageZipVortexCelestial6185();
            polarVoyageLayoutOlympianMega5153.PolarVoyageStrictModeLegendEpic1532.PolarVoyageMotionLayoutTransitionHeroVision4068();
            polarVoyageLayoutOlympianMega5153.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageZipVortexCelestial6185();
            polarVoyageLayoutOlympianMega5153.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185();
            int size = arrayList.size();
            if (size < 2) {
                return null;
            }
            if (i == 1) {
                arrayList2 = arrayList;
                if (size >= 2) {
                    view2 = (view == null || (indexOf = arrayList2.indexOf(view)) <= 0) ? (View) arrayList2.get(size - 1) : (View) arrayList2.get(indexOf - 1);
                }
            } else if (i == 2) {
                arrayList2 = arrayList;
                if (size >= 2) {
                    view2 = (view == null || (lastIndexOf = arrayList2.lastIndexOf(view)) < 0 || (i2 = lastIndexOf + 1) >= size) ? (View) arrayList2.get(0) : (View) arrayList2.get(i2);
                }
            } else if (i == 17 || i == 33 || i == 66 || i == 130) {
                arrayList2 = arrayList;
                view2 = PolarVoyageKotlinBetaPulseBeta3653(i, this.PolarVoyageZipVortexCelestial6185, view, viewGroup, arrayList2);
            } else {
                arrayList2 = arrayList;
            }
            return view2 == null ? (View) arrayList2.get(size - 1) : view2;
        } catch (Throwable th) {
            polarVoyageLayoutOlympianMega5153.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageZipVortexCelestial6185();
            polarVoyageLayoutOlympianMega5153.PolarVoyageStrictModeLegendEpic1532.PolarVoyageMotionLayoutTransitionHeroVision4068();
            polarVoyageLayoutOlympianMega5153.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageZipVortexCelestial6185();
            polarVoyageLayoutOlympianMega5153.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185();
            throw th;
        }
    }
}
