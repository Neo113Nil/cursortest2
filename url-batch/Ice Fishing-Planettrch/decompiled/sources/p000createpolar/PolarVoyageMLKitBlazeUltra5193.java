package p000createpolar;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMLKitBlazeUltra5193 extends PolarVoyageKeyEventPhantomDragonVortex9872 {
    public final /* synthetic */ PolarVoyageLocationManagerHeroQuantumHero9951 PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageMLKitBlazeUltra5193(PolarVoyageLocationManagerHeroQuantumHero9951 polarVoyageLocationManagerHeroQuantumHero9951) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageLocationManagerHeroQuantumHero9951;
    }

    public final Map PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        PolarVoyageZipVortexCelestial6185().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageRotateAnimationCyberCelestialDelta4768.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return PolarVoyageZipVortexCelestial6185().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PolarVoyageScaleAnimationPhoenixSpectra5238(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBottomSheetOmegaNeo1907;
        Object key = entry.getKey();
        Map map = polarVoyageDispatchersMasterSparkHero8128.PolarVoyageBottomSheetOmegaNeo1907;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        polarVoyageDispatchersMasterSparkHero8128.PolarVoyageViewRogueMaster4778 -= size;
        return true;
    }

    @Override // p000createpolar.PolarVoyageKeyEventPhantomDragonVortex9872, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= this.remove(it.next());
            }
            return z;
        }
    }

    @Override // p000createpolar.PolarVoyageKeyEventPhantomDragonVortex9872, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageRemoteModelManagerOlympianCelestial9141("expectedSize", size);
                ceil = size + 1;
            } else {
                ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(ceil);
            for (Object obj : collection) {
                if (this.contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.PolarVoyageZipVortexCelestial6185().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return PolarVoyageZipVortexCelestial6185().size();
    }
}
