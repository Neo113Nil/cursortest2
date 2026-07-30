package p000createpolar;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyagePagingDataTurboElite5231 extends AbstractCollection implements Set {
    public final Set PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageTypefaceNebulaAurora4762 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyagePagingDataTurboElite5231(Set set, PolarVoyageTypefaceNebulaAurora4762 polarVoyageTypefaceNebulaAurora4762) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = set;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageTypefaceNebulaAurora4762;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(this.PolarVoyageStrictModeLegendEpic1532.apply(obj));
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(this.PolarVoyageStrictModeLegendEpic1532.apply(it.next()));
        }
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        boolean z = set instanceof RandomAccess;
        PolarVoyageTypefaceNebulaAurora4762 polarVoyageTypefaceNebulaAurora4762 = this.PolarVoyageStrictModeLegendEpic1532;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            polarVoyageTypefaceNebulaAurora4762.getClass();
            while (it.hasNext()) {
                if (polarVoyageTypefaceNebulaAurora4762.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        polarVoyageTypefaceNebulaAurora4762.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!polarVoyageTypefaceNebulaAurora4762.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageToolbarEclipseInfernoHero6368(list, polarVoyageTypefaceNebulaAurora4762, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageToolbarEclipseInfernoHero6368(list, polarVoyageTypefaceNebulaAurora4762, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        Set set = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        set.getClass();
        try {
            z = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.PolarVoyageStrictModeLegendEpic1532.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageTextInputEditTextNebulaHero6651(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageStrictModeLegendEpic1532(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.PolarVoyageItemDecorationUltraDeltaEpic7485.iterator();
        PolarVoyageTypefaceNebulaAurora4762 polarVoyageTypefaceNebulaAurora4762 = this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAlertDialogCyberHeroQuantum3938(polarVoyageTypefaceNebulaAurora4762, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (polarVoyageTypefaceNebulaAurora4762.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.PolarVoyageItemDecorationUltraDeltaEpic7485.iterator();
        it.getClass();
        PolarVoyageTypefaceNebulaAurora4762 polarVoyageTypefaceNebulaAurora4762 = this.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageTypefaceNebulaAurora4762.getClass();
        return new PolarVoyageBindingAdapterAlphaMax4806(it, polarVoyageTypefaceNebulaAurora4762);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.PolarVoyageItemDecorationUltraDeltaEpic7485.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.PolarVoyageItemDecorationUltraDeltaEpic7485.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.PolarVoyageStrictModeLegendEpic1532.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.PolarVoyageItemDecorationUltraDeltaEpic7485.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.PolarVoyageStrictModeLegendEpic1532.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.PolarVoyageItemDecorationUltraDeltaEpic7485.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.PolarVoyageStrictModeLegendEpic1532.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(iterator()).toArray(objArr);
    }
}
