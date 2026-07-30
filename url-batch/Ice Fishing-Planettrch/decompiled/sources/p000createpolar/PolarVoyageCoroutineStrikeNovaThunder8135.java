package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCoroutineStrikeNovaThunder8135 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageCoroutineStrikeNovaThunder8135(List list, int i, Throwable th) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
        PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageBottomSheetOmegaNeo1907(list, "initCallbacks cannot be null");
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new ArrayList(list);
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        Object obj = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        PolarVoyageProcessCameraProviderBlazeQuantum2989 polarVoyageProcessCameraProviderBlazeQuantum2989 = (PolarVoyageProcessCameraProviderBlazeQuantum2989) arrayList.get(i3);
                        polarVoyageProcessCameraProviderBlazeQuantum2989.PolarVoyageZipVortexCelestial6185.setValue(Boolean.TRUE);
                        polarVoyageProcessCameraProviderBlazeQuantum2989.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageColorDrawableCyberBetaStrike2398(true);
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((PolarVoyageProcessCameraProviderBlazeQuantum2989) arrayList.get(i3)).PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBitmapVisionAuroraPixel4705;
                        i3++;
                    }
                    break;
                }
            default:
                ((PolarVoyageCameraViewVortexRogueNeo4402) obj).PolarVoyageStrictModeLegendEpic1532(i2);
                break;
        }
    }

    public /* synthetic */ PolarVoyageCoroutineStrikeNovaThunder8135(int i, int i2, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }
}
