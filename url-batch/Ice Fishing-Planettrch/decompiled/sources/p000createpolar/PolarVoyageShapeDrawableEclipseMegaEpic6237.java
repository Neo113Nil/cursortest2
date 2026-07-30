package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageShapeDrawableEclipseMegaEpic6237 extends PolarVoyageLicensingSolarCosmos6186 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageAnimatorSetHyperSolar2355 PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageShapeDrawableEclipseMegaEpic6237(int i, PolarVoyageAnimatorSetHyperSolar2355 polarVoyageAnimatorSetHyperSolar2355) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageAnimatorSetHyperSolar2355;
    }

    @Override // p000createpolar.PolarVoyageLicensingSolarCosmos6186
    public final int PolarVoyageZipVortexCelestial6185() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
        }
        return this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageViewRogueMaster4778;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.PolarVoyageStrictModeLegendEpic1532.clear();
                break;
            default:
                this.PolarVoyageStrictModeLegendEpic1532.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                PolarVoyageAnimatorSetHyperSolar2355 polarVoyageAnimatorSetHyperSolar2355 = this.PolarVoyageStrictModeLegendEpic1532;
                Object obj2 = polarVoyageAnimatorSetHyperSolar2355.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && polarVoyageAnimatorSetHyperSolar2355.containsKey(entry.getKey());
            default:
                return this.PolarVoyageStrictModeLegendEpic1532.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new PolarVoyageMotionLayoutPulseFusionForce8596(this.PolarVoyageStrictModeLegendEpic1532);
            default:
                PolarVoyageBindingAdapterUltraFusionGamma8949[] polarVoyageBindingAdapterUltraFusionGamma8949Arr = new PolarVoyageBindingAdapterUltraFusionGamma8949[8];
                for (int i = 0; i < 8; i++) {
                    polarVoyageBindingAdapterUltraFusionGamma8949Arr[i] = new PolarVoyageGyroscopeStormHyperion7699(1);
                }
                return new PolarVoyageWithContextCelestialOlympianRogue7434(this.PolarVoyageStrictModeLegendEpic1532, polarVoyageBindingAdapterUltraFusionGamma8949Arr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.PolarVoyageStrictModeLegendEpic1532.remove(entry.getKey(), entry.getValue());
            default:
                PolarVoyageAnimatorSetHyperSolar2355 polarVoyageAnimatorSetHyperSolar2355 = this.PolarVoyageStrictModeLegendEpic1532;
                if (!polarVoyageAnimatorSetHyperSolar2355.containsKey(obj)) {
                    return false;
                }
                polarVoyageAnimatorSetHyperSolar2355.remove(obj);
                return true;
        }
    }
}
