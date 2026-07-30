package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageRippleDrawableMasterCelestialRogue9242 implements PolarVoyageStateFlowNebulaMax1492 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Collection PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageRippleDrawableMasterCelestialRogue9242(int i, Collection collection) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = collection;
    }

    @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
    public final Object PolarVoyageZipVortexCelestial6185(Object obj) {
        boolean contains;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Collection<?> collection = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
