package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMapOmegaCelestial7474 extends AbstractCollection {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageMapOmegaCelestial7474(AbstractMap abstractMap) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
        this.PolarVoyageStrictModeLegendEpic1532 = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((PolarVoyageDispatchersMasterSparkHero8128) obj).PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                break;
            case 1:
                ((PolarVoyageFaceDetectionTitanEclipse4301) obj).clear();
                break;
            default:
                ((AbstractMap) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj2 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Iterator it = ((PolarVoyageDispatchersMasterSparkHero8128) obj2).PolarVoyageZipVortexCelestial6185().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((AbstractMap) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 2:
                return ((AbstractMap) this.PolarVoyageStrictModeLegendEpic1532).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new PolarVoyageCamera2NovaNeoEclipse1478((PolarVoyageDispatchersMasterSparkHero8128) obj);
            case 1:
                PolarVoyageFaceDetectionTitanEclipse4301 polarVoyageFaceDetectionTitanEclipse4301 = (PolarVoyageFaceDetectionTitanEclipse4301) obj;
                Map PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageFaceDetectionTitanEclipse4301.PolarVoyageMotionLayoutTransitionHeroVision4068();
                return PolarVoyageMotionLayoutTransitionHeroVision4068 != null ? PolarVoyageMotionLayoutTransitionHeroVision4068.values().iterator() : new PolarVoyageStrictModeEclipseHyperionShadow2483(polarVoyageFaceDetectionTitanEclipse4301, 2);
            default:
                return new PolarVoyageBroadcastReceiverUltraCyber8439(((AbstractMap) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.PolarVoyageStrictModeLegendEpic1532;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageMotionLayoutForceEpicAurora7183(obj, entry.getValue())) {
                            abstractMap.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.PolarVoyageStrictModeLegendEpic1532;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.PolarVoyageStrictModeLegendEpic1532;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((PolarVoyageDispatchersMasterSparkHero8128) obj).PolarVoyageViewRogueMaster4778;
            case 1:
                return ((PolarVoyageFaceDetectionTitanEclipse4301) obj).size();
            default:
                return ((AbstractMap) obj).size();
        }
    }

    public /* synthetic */ PolarVoyageMapOmegaCelestial7474(int i, Serializable serializable) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = serializable;
    }
}
