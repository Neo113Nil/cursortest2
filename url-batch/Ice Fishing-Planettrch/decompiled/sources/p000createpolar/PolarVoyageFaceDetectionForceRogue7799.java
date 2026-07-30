package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFaceDetectionForceRogue7799 extends PolarVoyageDigitalInkRecognitionHyperionTurbo6015 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyagePagingDataAlphaUltra1037 PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageFaceDetectionForceRogue7799(PolarVoyagePagingDataAlphaUltra1037 polarVoyagePagingDataAlphaUltra1037, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyagePagingDataAlphaUltra1037;
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416
    public final int PolarVoyageZipVortexCelestial6185() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyagePagingDataAlphaUltra1037 polarVoyagePagingDataAlphaUltra1037 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                polarVoyagePagingDataAlphaUltra1037.getClass();
                break;
            default:
                polarVoyagePagingDataAlphaUltra1037.getClass();
                break;
        }
        return polarVoyagePagingDataAlphaUltra1037.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyagePagingDataAlphaUltra1037 polarVoyagePagingDataAlphaUltra1037 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = polarVoyagePagingDataAlphaUltra1037.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && polarVoyagePagingDataAlphaUltra1037.containsKey(entry.getKey());
            default:
                return polarVoyagePagingDataAlphaUltra1037.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageTextRecognitionMasterPrime1651 polarVoyageTextRecognitionMasterPrime1651 = this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageBindingAdapterUltraFusionGamma8949[] polarVoyageBindingAdapterUltraFusionGamma8949Arr = new PolarVoyageBindingAdapterUltraFusionGamma8949[8];
                for (int i = 0; i < 8; i++) {
                    polarVoyageBindingAdapterUltraFusionGamma8949Arr[i] = new PolarVoyageGyroscopeStormHyperion7699(0);
                }
                return new PolarVoyageGradleVortexBeta5214(polarVoyageTextRecognitionMasterPrime1651, polarVoyageBindingAdapterUltraFusionGamma8949Arr);
            default:
                PolarVoyageTextRecognitionMasterPrime1651 polarVoyageTextRecognitionMasterPrime16512 = this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageBindingAdapterUltraFusionGamma8949[] polarVoyageBindingAdapterUltraFusionGamma8949Arr2 = new PolarVoyageBindingAdapterUltraFusionGamma8949[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    polarVoyageBindingAdapterUltraFusionGamma8949Arr2[i2] = new PolarVoyageGyroscopeStormHyperion7699(1);
                }
                return new PolarVoyageGradleVortexBeta5214(polarVoyageTextRecognitionMasterPrime16512, polarVoyageBindingAdapterUltraFusionGamma8949Arr2);
        }
    }
}
