package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageApplicationInfoHyperionHyperion6216 extends PolarVoyageTextInputLayoutTurboCelestialTitanium1416 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageApplicationInfoHyperionHyperion6216(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }

    public PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        Matcher matcher = (Matcher) ((PolarVoyageAnimatorCelestialDeltaMaster5821) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageLinearLayoutHyperionSpectra2647 PolarVoyageThreadPhoenixVisionSolar1313 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageThreadPhoenixVisionSolar1313(matcher.start(i), matcher.end(i));
        if (PolarVoyageThreadPhoenixVisionSolar1313.PolarVoyageItemDecorationUltraDeltaEpic7485 < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new PolarVoyageCameraXCyberBlazeTitan4557(group, PolarVoyageThreadPhoenixVisionSolar1313);
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416
    public final int PolarVoyageZipVortexCelestial6185() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Matcher) ((PolarVoyageAnimatorCelestialDeltaMaster5821) obj).PolarVoyageStrictModeLegendEpic1532).groupCount() + 1;
            default:
                PolarVoyagePagingDataAlphaUltra1037 polarVoyagePagingDataAlphaUltra1037 = (PolarVoyagePagingDataAlphaUltra1037) obj;
                polarVoyagePagingDataAlphaUltra1037.getClass();
                return polarVoyagePagingDataAlphaUltra1037.PolarVoyageStrictModeLegendEpic1532;
        }
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj == null ? true : obj instanceof PolarVoyageCameraXCyberBlazeTitan4557) {
                    return super.contains((PolarVoyageCameraXCyberBlazeTitan4557) obj);
                }
                return false;
            default:
                return ((PolarVoyagePagingDataAlphaUltra1037) this.PolarVoyageStrictModeLegendEpic1532).containsValue(obj);
        }
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416, java.util.Collection
    public boolean isEmpty() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new PolarVoyageThreadForceDeltaGamma1578(new PolarVoyageKeyEventPhoenixMega6318(new PolarVoyageScaleDrawableTitaniumHero8054(1, new PolarVoyageLinearLayoutHyperionSpectra2647(0, size() - 1, 1)), new PolarVoyageCanvasCyberNovaElite7830(6, this), 1));
            default:
                PolarVoyageTextRecognitionMasterPrime1651 polarVoyageTextRecognitionMasterPrime1651 = ((PolarVoyagePagingDataAlphaUltra1037) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageBindingAdapterUltraFusionGamma8949[] polarVoyageBindingAdapterUltraFusionGamma8949Arr = new PolarVoyageBindingAdapterUltraFusionGamma8949[8];
                for (int i = 0; i < 8; i++) {
                    polarVoyageBindingAdapterUltraFusionGamma8949Arr[i] = new PolarVoyageGyroscopeStormHyperion7699(2);
                }
                return new PolarVoyageGradleVortexBeta5214(polarVoyageTextRecognitionMasterPrime1651, polarVoyageBindingAdapterUltraFusionGamma8949Arr);
        }
    }
}
