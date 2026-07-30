package p000createpolar;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBarrierGammaVisionQuantum9712 extends PolarVoyageScaleAnimationThunderPhoenixBeta6315 implements NavigableSet {
    public final /* synthetic */ PolarVoyageDispatchersMasterSparkHero8128 PolarVoyageBottomSheetOmegaNeo1907;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolarVoyageBarrierGammaVisionQuantum9712(PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128, NavigableMap navigableMap) {
        super(polarVoyageDispatchersMasterSparkHero8128, navigableMap);
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageDispatchersMasterSparkHero8128;
    }

    @Override // p000createpolar.PolarVoyageScaleAnimationThunderPhoenixBeta6315
    /* renamed from: PolarVoyageMotionLayoutTransitionHeroVision4068, reason: merged with bridge method [inline-methods] */
    public final NavigableMap PolarVoyageZipVortexCelestial6185() {
        return (NavigableMap) ((SortedMap) this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return PolarVoyageZipVortexCelestial6185().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((PolarVoyageBroadcastInfernoCelestial5352) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new PolarVoyageBarrierGammaVisionQuantum9712(this.PolarVoyageBottomSheetOmegaNeo1907, PolarVoyageZipVortexCelestial6185().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return PolarVoyageZipVortexCelestial6185().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new PolarVoyageBarrierGammaVisionQuantum9712(this.PolarVoyageBottomSheetOmegaNeo1907, PolarVoyageZipVortexCelestial6185().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return PolarVoyageZipVortexCelestial6185().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return PolarVoyageZipVortexCelestial6185().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        PolarVoyageScaleAnimationPhoenixSpectra5238 polarVoyageScaleAnimationPhoenixSpectra5238 = (PolarVoyageScaleAnimationPhoenixSpectra5238) iterator();
        if (!polarVoyageScaleAnimationPhoenixSpectra5238.hasNext()) {
            return null;
        }
        Object next = polarVoyageScaleAnimationPhoenixSpectra5238.next();
        polarVoyageScaleAnimationPhoenixSpectra5238.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new PolarVoyageBarrierGammaVisionQuantum9712(this.PolarVoyageBottomSheetOmegaNeo1907, PolarVoyageZipVortexCelestial6185().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new PolarVoyageBarrierGammaVisionQuantum9712(this.PolarVoyageBottomSheetOmegaNeo1907, PolarVoyageZipVortexCelestial6185().tailMap(obj, z));
    }

    @Override // p000createpolar.PolarVoyageScaleAnimationThunderPhoenixBeta6315, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // p000createpolar.PolarVoyageScaleAnimationThunderPhoenixBeta6315, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // p000createpolar.PolarVoyageScaleAnimationThunderPhoenixBeta6315, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
