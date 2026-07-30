package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageAlarmManagerShadowNeoHero5011 extends AbstractSet {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Map PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageAlarmManagerShadowNeoHero5011(Map map, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((PolarVoyageObjectAnimatorLegendCosmos2129) this.PolarVoyageStrictModeLegendEpic1532).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 1:
                ((PolarVoyageObjectAnimatorLegendCosmos2129) this.PolarVoyageStrictModeLegendEpic1532).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((PolarVoyageObjectAnimatorLegendCosmos2129) this.PolarVoyageStrictModeLegendEpic1532).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Map map = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new PolarVoyageTypefaceNovaUltra9152((PolarVoyageContentObserverThunderOmega9101) map);
            default:
                return new PolarVoyageRemoteConfigUltraCyber6180((PolarVoyageObjectAnimatorLegendCosmos2129) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((PolarVoyageObjectAnimatorLegendCosmos2129) this.PolarVoyageStrictModeLegendEpic1532).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Map map = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((PolarVoyageContentObserverThunderOmega9101) map).PolarVoyageRotateAnimationCyberCelestialDelta4768;
            default:
                return ((PolarVoyageObjectAnimatorLegendCosmos2129) map).size();
        }
    }
}
