package p000createpolar;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyagePlaceholderCyberStrikeThunder6660 extends AbstractCollection implements Serializable {
    public static final Object[] PolarVoyageItemDecorationUltraDeltaEpic7485 = new Object[0];

    public Object[] PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        return null;
    }

    public int PolarVoyageBitmapVisionAuroraPixel4705() {
        throw new UnsupportedOperationException();
    }

    public int PolarVoyageDiffUtilTurboStrike5735() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: PolarVoyageItemDecorationUltraDeltaEpic7485, reason: merged with bridge method [inline-methods] */
    public abstract PolarVoyageCoroutineAuroraSolar8718 iterator();

    public abstract int PolarVoyageMotionLayoutTransitionHeroVision4068(int i, Object[] objArr);

    public abstract boolean PolarVoyageTextInputEditTextNebulaHero6651();

    public abstract PolarVoyageDialogPhantomEliteAurora3058 PolarVoyageZipVortexCelestial6185();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null) {
                return Arrays.copyOfRange(PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageDiffUtilTurboStrike5735(), PolarVoyageBitmapVisionAuroraPixel4705(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068(0, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(PolarVoyageItemDecorationUltraDeltaEpic7485);
    }
}
