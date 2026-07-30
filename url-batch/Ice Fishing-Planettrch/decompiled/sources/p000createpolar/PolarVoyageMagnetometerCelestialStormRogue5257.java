package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageMagnetometerCelestialStormRogue5257 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageBannerAdPhoenixForcePhoenix6096 PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageMagnetometerCelestialStormRogue5257(PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageBannerAdPhoenixForcePhoenix6096;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageBannerAdPhoenixForcePhoenix6096.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageBannerAdPhoenixForcePhoenix6096);
                break;
            default:
                polarVoyageBannerAdPhoenixForcePhoenix6096.invalidateOptionsMenu();
                break;
        }
    }
}
