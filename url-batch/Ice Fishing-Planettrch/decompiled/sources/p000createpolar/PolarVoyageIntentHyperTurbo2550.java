package p000createpolar;

import android.util.Base64;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageIntentHyperTurbo2550 implements PolarVoyageKaptTitanBlaze4844 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;

    public /* synthetic */ PolarVoyageIntentHyperTurbo2550(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
    }

    @Override // p000createpolar.PolarVoyageKaptTitanBlaze4844
    public final Object get() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                byte[] bArr = new byte[12];
                PolarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageStrictModeLegendEpic1532.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 1:
                return new PolarVoyageRemoteModelManagerPulseMaxNovaX6329();
            case 2:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            default:
                throw new IllegalStateException();
        }
    }
}
