package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageZoomStateCyberVortexEpic8930 implements PolarVoyageDrawableCompatCyberShadowEpic1766 {
    public final /* synthetic */ long PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ TimeUnit PolarVoyageCameraPixelBlaze2629;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Runnable PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ PolarVoyageScaleGestureDetectorHyperFusion3036 PolarVoyageStrictModeLegendEpic1532;
    public final /* synthetic */ long PolarVoyageViewRogueMaster4778;

    public /* synthetic */ PolarVoyageZoomStateCyberVortexEpic8930(PolarVoyageScaleGestureDetectorHyperFusion3036 polarVoyageScaleGestureDetectorHyperFusion3036, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageScaleGestureDetectorHyperFusion3036;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = runnable;
        this.PolarVoyageBottomSheetOmegaNeo1907 = j;
        this.PolarVoyageViewRogueMaster4778 = j2;
        this.PolarVoyageCameraPixelBlaze2629 = timeUnit;
    }

    @Override // p000createpolar.PolarVoyageDrawableCompatCyberShadowEpic1766
    public final ScheduledFuture PolarVoyageZipVortexCelestial6185(PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Runnable runnable = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageScaleGestureDetectorHyperFusion3036 polarVoyageScaleGestureDetectorHyperFusion3036 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return polarVoyageScaleGestureDetectorHyperFusion3036.PolarVoyageStrictModeLegendEpic1532.scheduleAtFixedRate(new PolarVoyageCountDownTimerVortexMega3934(polarVoyageScaleGestureDetectorHyperFusion3036, runnable, polarVoyageAdapterTitanSpark4027, 0), this.PolarVoyageBottomSheetOmegaNeo1907, this.PolarVoyageViewRogueMaster4778, this.PolarVoyageCameraPixelBlaze2629);
            default:
                return polarVoyageScaleGestureDetectorHyperFusion3036.PolarVoyageStrictModeLegendEpic1532.scheduleWithFixedDelay(new PolarVoyageCountDownTimerVortexMega3934(polarVoyageScaleGestureDetectorHyperFusion3036, runnable, polarVoyageAdapterTitanSpark4027, 2), this.PolarVoyageBottomSheetOmegaNeo1907, this.PolarVoyageViewRogueMaster4778, this.PolarVoyageCameraPixelBlaze2629);
        }
    }
}
