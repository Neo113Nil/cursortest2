package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageTextRecognitionBetaStrike2727 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ PolarVoyageVideoCaptureSolarDragonGamma9082 PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageTextRecognitionBetaStrike2727(PolarVoyageVideoCaptureSolarDragonGamma9082 polarVoyageVideoCaptureSolarDragonGamma9082, Object obj, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageVideoCaptureSolarDragonGamma9082;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageVideoCaptureSolarDragonGamma9082 polarVoyageVideoCaptureSolarDragonGamma9082 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageZipVortexCelestial6185 == 0) {
                    polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageDiffUtilTurboStrike5735(obj);
                    break;
                }
                break;
            default:
                int i2 = polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageZipVortexCelestial6185 - 1;
                polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageZipVortexCelestial6185 = i2;
                if (i2 == 0) {
                    polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageDiffUtilTurboStrike5735(obj);
                    break;
                }
                break;
        }
    }
}
