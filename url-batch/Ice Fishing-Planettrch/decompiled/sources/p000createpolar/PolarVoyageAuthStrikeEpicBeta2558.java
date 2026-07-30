package p000createpolar;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageAuthStrikeEpicBeta2558 extends AbstractCollection implements List {
    public final Collection PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ PolarVoyageDispatchersMasterSparkHero8128 PolarVoyageCameraPixelBlaze2629;
    public final Object PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageAuthStrikeEpicBeta2558 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Collection PolarVoyageStrictModeLegendEpic1532;
    public final /* synthetic */ PolarVoyageDispatchersMasterSparkHero8128 PolarVoyageViewRogueMaster4778;

    public PolarVoyageAuthStrikeEpicBeta2558(PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128, Object obj, List list, PolarVoyageAuthStrikeEpicBeta2558 polarVoyageAuthStrikeEpicBeta2558) {
        this.PolarVoyageCameraPixelBlaze2629 = polarVoyageDispatchersMasterSparkHero8128;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageDispatchersMasterSparkHero8128;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = obj;
        this.PolarVoyageStrictModeLegendEpic1532 = list;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAuthStrikeEpicBeta2558;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageAuthStrikeEpicBeta2558 == null ? null : polarVoyageAuthStrikeEpicBeta2558.PolarVoyageStrictModeLegendEpic1532;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        PolarVoyageAuthStrikeEpicBeta2558 polarVoyageAuthStrikeEpicBeta2558 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (polarVoyageAuthStrikeEpicBeta2558 != null) {
            polarVoyageAuthStrikeEpicBeta2558.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        } else if (this.PolarVoyageStrictModeLegendEpic1532.isEmpty()) {
            this.PolarVoyageViewRogueMaster4778.PolarVoyageBottomSheetOmegaNeo1907.remove(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        Collection collection;
        PolarVoyageAuthStrikeEpicBeta2558 polarVoyageAuthStrikeEpicBeta2558 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (polarVoyageAuthStrikeEpicBeta2558 != null) {
            polarVoyageAuthStrikeEpicBeta2558.PolarVoyageMotionLayoutTransitionHeroVision4068();
            if (polarVoyageAuthStrikeEpicBeta2558.PolarVoyageStrictModeLegendEpic1532 == this.PolarVoyageBottomSheetOmegaNeo1907) {
                return;
            }
            PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
            return;
        }
        if (!this.PolarVoyageStrictModeLegendEpic1532.isEmpty() || (collection = (Collection) this.PolarVoyageViewRogueMaster4778.PolarVoyageBottomSheetOmegaNeo1907.get(this.PolarVoyageItemDecorationUltraDeltaEpic7485)) == null) {
            return;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = collection;
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        PolarVoyageAuthStrikeEpicBeta2558 polarVoyageAuthStrikeEpicBeta2558 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (polarVoyageAuthStrikeEpicBeta2558 != null) {
            polarVoyageAuthStrikeEpicBeta2558.PolarVoyageZipVortexCelestial6185();
        } else {
            this.PolarVoyageViewRogueMaster4778.PolarVoyageBottomSheetOmegaNeo1907.put(this.PolarVoyageItemDecorationUltraDeltaEpic7485, this.PolarVoyageStrictModeLegendEpic1532);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        boolean isEmpty = this.PolarVoyageStrictModeLegendEpic1532.isEmpty();
        boolean add = this.PolarVoyageStrictModeLegendEpic1532.add(obj);
        if (add) {
            this.PolarVoyageViewRogueMaster4778.PolarVoyageViewRogueMaster4778++;
            if (isEmpty) {
                PolarVoyageZipVortexCelestial6185();
            }
        }
        return add;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.PolarVoyageStrictModeLegendEpic1532).addAll(i, collection);
        if (addAll) {
            this.PolarVoyageCameraPixelBlaze2629.PolarVoyageViewRogueMaster4778 += this.PolarVoyageStrictModeLegendEpic1532.size() - size;
            if (size == 0) {
                PolarVoyageZipVortexCelestial6185();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.PolarVoyageStrictModeLegendEpic1532.clear();
        this.PolarVoyageViewRogueMaster4778.PolarVoyageViewRogueMaster4778 -= size;
        PolarVoyageBarcodeScannerInfernoSolarSpark7767();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return this.PolarVoyageStrictModeLegendEpic1532.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return this.PolarVoyageStrictModeLegendEpic1532.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return this.PolarVoyageStrictModeLegendEpic1532.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return ((List) this.PolarVoyageStrictModeLegendEpic1532).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return this.PolarVoyageStrictModeLegendEpic1532.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return ((List) this.PolarVoyageStrictModeLegendEpic1532).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return new PolarVoyageScaleAnimationPhoenixSpectra5238(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return ((List) this.PolarVoyageStrictModeLegendEpic1532).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return new PolarVoyageNavigationQuantumCosmos4914(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        boolean remove = this.PolarVoyageStrictModeLegendEpic1532.remove(obj);
        if (remove) {
            PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128 = this.PolarVoyageViewRogueMaster4778;
            polarVoyageDispatchersMasterSparkHero8128.PolarVoyageViewRogueMaster4778--;
            PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.PolarVoyageStrictModeLegendEpic1532.removeAll(collection);
        if (removeAll) {
            this.PolarVoyageViewRogueMaster4778.PolarVoyageViewRogueMaster4778 += this.PolarVoyageStrictModeLegendEpic1532.size() - size;
            PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.PolarVoyageStrictModeLegendEpic1532.retainAll(collection);
        if (retainAll) {
            this.PolarVoyageViewRogueMaster4778.PolarVoyageViewRogueMaster4778 += this.PolarVoyageStrictModeLegendEpic1532.size() - size;
            PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return ((List) this.PolarVoyageStrictModeLegendEpic1532).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return this.PolarVoyageStrictModeLegendEpic1532.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        List subList = ((List) this.PolarVoyageStrictModeLegendEpic1532).subList(i, i2);
        PolarVoyageAuthStrikeEpicBeta2558 polarVoyageAuthStrikeEpicBeta2558 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (polarVoyageAuthStrikeEpicBeta2558 == null) {
            polarVoyageAuthStrikeEpicBeta2558 = this;
        }
        boolean z = subList instanceof RandomAccess;
        PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128 = this.PolarVoyageCameraPixelBlaze2629;
        Object obj = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return z ? new PolarVoyageRoomDatabasePulsePhantom3488(polarVoyageDispatchersMasterSparkHero8128, obj, subList, polarVoyageAuthStrikeEpicBeta2558) : new PolarVoyageAuthStrikeEpicBeta2558(polarVoyageDispatchersMasterSparkHero8128, obj, subList, polarVoyageAuthStrikeEpicBeta2558);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return this.PolarVoyageStrictModeLegendEpic1532.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return new PolarVoyageNavigationQuantumCosmos4914(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        Object remove = ((List) this.PolarVoyageStrictModeLegendEpic1532).remove(i);
        PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128 = this.PolarVoyageCameraPixelBlaze2629;
        polarVoyageDispatchersMasterSparkHero8128.PolarVoyageViewRogueMaster4778--;
        PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        boolean isEmpty = this.PolarVoyageStrictModeLegendEpic1532.isEmpty();
        ((List) this.PolarVoyageStrictModeLegendEpic1532).add(i, obj);
        this.PolarVoyageCameraPixelBlaze2629.PolarVoyageViewRogueMaster4778++;
        if (isEmpty) {
            PolarVoyageZipVortexCelestial6185();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.PolarVoyageStrictModeLegendEpic1532.addAll(collection);
        if (addAll) {
            this.PolarVoyageViewRogueMaster4778.PolarVoyageViewRogueMaster4778 += this.PolarVoyageStrictModeLegendEpic1532.size() - size;
            if (size == 0) {
                PolarVoyageZipVortexCelestial6185();
            }
        }
        return addAll;
    }
}
