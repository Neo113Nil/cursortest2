package androidx.collection;

import g6.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$keys$1<K> implements Set<K>, h {
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends K> elements) {
        s.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        s.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!mutableScatterMap.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.this$0._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<K> iterator() {
        return new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(this.this$0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        r12 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean remove(Object obj) {
        int i8;
        ScatterMap scatterMap = this.this$0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = scatterMap._capacity;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = scatterMap.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (i10 * ScatterMapKt.BitmaskLsb) ^ j8;
            long j10 = (~j9) & (j9 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (s.areEqual(scatterMap.keys[i8], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (i8 < 0) {
            return false;
        }
        this.this$0.removeValueAt(i8);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        s.checkNotNullParameter(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        boolean z7 = false;
        if (length >= 0) {
            int i8 = 0;
            boolean z8 = false;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (CollectionsKt___CollectionsKt.contains(elements, mutableScatterMap.keys[i11])) {
                                mutableScatterMap.removeValueAt(i11);
                                z8 = true;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        return z8;
                    }
                }
                if (i8 == length) {
                    z7 = z8;
                    break;
                }
                i8++;
            }
        }
        return z7;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        s.checkNotNullParameter(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        boolean z7 = false;
        if (length >= 0) {
            int i8 = 0;
            boolean z8 = false;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (!CollectionsKt___CollectionsKt.contains(elements, mutableScatterMap.keys[i11])) {
                                mutableScatterMap.removeValueAt(i11);
                                z8 = true;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        return z8;
                    }
                }
                if (i8 == length) {
                    z7 = z8;
                    break;
                }
                i8++;
            }
        }
        return z7;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return n.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        s.checkNotNullParameter(array, "array");
        return (T[]) n.toArray(this, array);
    }
}
