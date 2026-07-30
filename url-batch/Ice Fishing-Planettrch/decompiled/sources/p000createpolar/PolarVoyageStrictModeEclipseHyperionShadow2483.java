package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageStrictModeEclipseHyperionShadow2483 implements Iterator {
    public final /* synthetic */ PolarVoyageFaceDetectionTitanEclipse4301 PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ PolarVoyageFaceDetectionTitanEclipse4301 PolarVoyageCameraPixelBlaze2629;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public final /* synthetic */ int PolarVoyageViewRogueMaster4778;

    public PolarVoyageStrictModeEclipseHyperionShadow2483(PolarVoyageFaceDetectionTitanEclipse4301 polarVoyageFaceDetectionTitanEclipse4301, int i) {
        this.PolarVoyageViewRogueMaster4778 = i;
        this.PolarVoyageCameraPixelBlaze2629 = polarVoyageFaceDetectionTitanEclipse4301;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageFaceDetectionTitanEclipse4301;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageFaceDetectionTitanEclipse4301.PolarVoyageViewRogueMaster4778;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageFaceDetectionTitanEclipse4301.isEmpty() ? -1 : 0;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.PolarVoyageStrictModeLegendEpic1532 >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        PolarVoyageFaceDetectionTitanEclipse4301 polarVoyageFaceDetectionTitanEclipse4301 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageFaceDetectionTitanEclipse4301.PolarVoyageViewRogueMaster4778 != this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
            return null;
        }
        if (!hasNext()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
        int i2 = this.PolarVoyageViewRogueMaster4778;
        PolarVoyageFaceDetectionTitanEclipse4301 polarVoyageFaceDetectionTitanEclipse43012 = this.PolarVoyageCameraPixelBlaze2629;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                obj = polarVoyageFaceDetectionTitanEclipse43012.PolarVoyageStrictModeLegendEpic1532()[i];
                break;
            case 1:
                obj = new PolarVoyageBitmapTitanTurbo3491(polarVoyageFaceDetectionTitanEclipse43012, i);
                break;
            default:
                obj = polarVoyageFaceDetectionTitanEclipse43012.PolarVoyageRotateAnimationCyberCelestialDelta4768()[i];
                break;
        }
        int i3 = this.PolarVoyageStrictModeLegendEpic1532 + 1;
        if (i3 >= polarVoyageFaceDetectionTitanEclipse4301.PolarVoyageCameraPixelBlaze2629) {
            i3 = -1;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = i3;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        PolarVoyageFaceDetectionTitanEclipse4301 polarVoyageFaceDetectionTitanEclipse4301 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageFaceDetectionTitanEclipse4301.PolarVoyageViewRogueMaster4778 != this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
            return;
        }
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDiffUtilDragonSpeedEclipse6225("no calls to next() since the last call to remove()", this.PolarVoyageRotateAnimationCyberCelestialDelta4768 >= 0);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 += 32;
        polarVoyageFaceDetectionTitanEclipse4301.remove(polarVoyageFaceDetectionTitanEclipse4301.PolarVoyageStrictModeLegendEpic1532()[this.PolarVoyageRotateAnimationCyberCelestialDelta4768]);
        this.PolarVoyageStrictModeLegendEpic1532--;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = -1;
    }
}
