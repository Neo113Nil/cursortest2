package p000createpolar;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageLocationManagerHeroQuantumHero9951 extends AbstractMap {
    public final /* synthetic */ PolarVoyageDispatchersMasterSparkHero8128 PolarVoyageBottomSheetOmegaNeo1907;
    public transient PolarVoyageMLKitBlazeUltra5193 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final transient Map PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public transient PolarVoyageMapOmegaCelestial7474 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageLocationManagerHeroQuantumHero9951(PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128, Map map) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageDispatchersMasterSparkHero8128;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = map;
    }

    public final PolarVoyageGradientDrawableAlphaShadow4753 PolarVoyageZipVortexCelestial6185(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128 = this.PolarVoyageBottomSheetOmegaNeo1907;
        return new PolarVoyageGradientDrawableAlphaShadow4753(key, z ? new PolarVoyageRoomDatabasePulsePhantom3488(polarVoyageDispatchersMasterSparkHero8128, key, list, null) : new PolarVoyageAuthStrikeEpicBeta2558(polarVoyageDispatchersMasterSparkHero8128, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == polarVoyageDispatchersMasterSparkHero8128.PolarVoyageBottomSheetOmegaNeo1907) {
            polarVoyageDispatchersMasterSparkHero8128.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            return;
        }
        PolarVoyageScaleAnimationPhoenixSpectra5238 polarVoyageScaleAnimationPhoenixSpectra5238 = new PolarVoyageScaleAnimationPhoenixSpectra5238(this);
        while (polarVoyageScaleAnimationPhoenixSpectra5238.hasNext()) {
            polarVoyageScaleAnimationPhoenixSpectra5238.next();
            polarVoyageScaleAnimationPhoenixSpectra5238.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        PolarVoyageMLKitBlazeUltra5193 polarVoyageMLKitBlazeUltra5193 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (polarVoyageMLKitBlazeUltra5193 != null) {
            return polarVoyageMLKitBlazeUltra5193;
        }
        PolarVoyageMLKitBlazeUltra5193 polarVoyageMLKitBlazeUltra51932 = new PolarVoyageMLKitBlazeUltra5193(this);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageMLKitBlazeUltra51932;
        return polarVoyageMLKitBlazeUltra51932;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.PolarVoyageRotateAnimationCyberCelestialDelta4768.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128 = this.PolarVoyageBottomSheetOmegaNeo1907;
        return z ? new PolarVoyageRoomDatabasePulsePhantom3488(polarVoyageDispatchersMasterSparkHero8128, obj, list, null) : new PolarVoyageAuthStrikeEpicBeta2558(polarVoyageDispatchersMasterSparkHero8128, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128 = this.PolarVoyageBottomSheetOmegaNeo1907;
        Set set = polarVoyageDispatchersMasterSparkHero8128.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (set != null) {
            return set;
        }
        Set PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageDispatchersMasterSparkHero8128.PolarVoyageKotlinBetaPulseBeta3653();
        polarVoyageDispatchersMasterSparkHero8128.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageKotlinBetaPulseBeta3653;
        return PolarVoyageKotlinBetaPulseBeta3653;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.PolarVoyageRotateAnimationCyberCelestialDelta4768.remove(obj);
        if (collection == null) {
            return null;
        }
        PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128 = this.PolarVoyageBottomSheetOmegaNeo1907;
        List list = (List) polarVoyageDispatchersMasterSparkHero8128.PolarVoyageCameraPixelBlaze2629.get();
        list.addAll(collection);
        polarVoyageDispatchersMasterSparkHero8128.PolarVoyageViewRogueMaster4778 -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        PolarVoyageMapOmegaCelestial7474 polarVoyageMapOmegaCelestial7474 = this.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageMapOmegaCelestial7474 != null) {
            return polarVoyageMapOmegaCelestial7474;
        }
        PolarVoyageMapOmegaCelestial7474 polarVoyageMapOmegaCelestial74742 = new PolarVoyageMapOmegaCelestial7474(this);
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageMapOmegaCelestial74742;
        return polarVoyageMapOmegaCelestial74742;
    }
}
