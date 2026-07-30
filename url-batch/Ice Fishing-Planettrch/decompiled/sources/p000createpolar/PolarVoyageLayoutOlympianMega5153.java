package p000createpolar;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLayoutOlympianMega5153 implements Comparator {
    public final PolarVoyageFaceDetectionEliteBlazeInferno3165 PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageKeyframeThunderMegaVortex8492 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageKeyframeThunderMegaVortex8492 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageResourcesBetaPhoenix8681 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageLayoutOlympianMega5153(PolarVoyageBroadcastDragonShadowRogue6783 polarVoyageBroadcastDragonShadowRogue6783) {
        long[] jArr = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageKeyframeThunderMegaVortex8492();
        int i = PolarVoyageLifecycleOlympianTitaniumHyper9367.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageResourcesBetaPhoenix8681();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageKeyframeThunderMegaVortex8492();
        PolarVoyageFaceDetectionEliteBlazeInferno3165 polarVoyageFaceDetectionEliteBlazeInferno3165 = PolarVoyageBarcodeScannerFusionAurora5642.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageFaceDetectionEliteBlazeInferno3165();
    }

    public final void PolarVoyageZipVortexCelestial6185(ArrayList arrayList, ViewGroup viewGroup) {
        PolarVoyageFaceDetectionEliteBlazeInferno3165 polarVoyageFaceDetectionEliteBlazeInferno3165;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            polarVoyageFaceDetectionEliteBlazeInferno3165 = this.PolarVoyageBottomSheetOmegaNeo1907;
            if (i >= size) {
                break;
            }
            polarVoyageFaceDetectionEliteBlazeInferno3165.PolarVoyageItemDecorationUltraDeltaEpic7485(i, (View) arrayList.get(i));
            i++;
        }
        int size2 = arrayList.size() - 1;
        PolarVoyageResourcesBetaPhoenix8681 polarVoyageResourcesBetaPhoenix8681 = this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex8492 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View PolarVoyageKotlinBetaPulseBeta3653 = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageKotlinBetaPulseBeta3653(view, viewGroup, 2);
                if (PolarVoyageKotlinBetaPulseBeta3653 != null && polarVoyageFaceDetectionEliteBlazeInferno3165.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageKotlinBetaPulseBeta3653) >= 0) {
                    polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageCameraPixelBlaze2629(view, PolarVoyageKotlinBetaPulseBeta3653);
                    polarVoyageResourcesBetaPhoenix8681.PolarVoyageZipVortexCelestial6185(PolarVoyageKotlinBetaPulseBeta3653);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i3 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(view2)) != null && !polarVoyageResourcesBetaPhoenix8681.PolarVoyageKotlinBetaPulseBeta3653(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex84922 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    View view4 = (View) polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageTextInputEditTextNebulaHero6651(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageCameraPixelBlaze2629(view2, view3);
                    view2 = (View) polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(view2);
                }
            }
            if (i3 < 0) {
                return;
            } else {
                size3 = i3;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex8492 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        View view3 = (View) polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(view);
        View view4 = (View) polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        PolarVoyageFaceDetectionEliteBlazeInferno3165 polarVoyageFaceDetectionEliteBlazeInferno3165 = this.PolarVoyageBottomSheetOmegaNeo1907;
        return polarVoyageFaceDetectionEliteBlazeInferno3165.PolarVoyageBitmapVisionAuroraPixel4705(view) < polarVoyageFaceDetectionEliteBlazeInferno3165.PolarVoyageBitmapVisionAuroraPixel4705(view2) ? -1 : 1;
    }
}
