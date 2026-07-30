package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1<V> implements Collection<V>, g6.b {
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Collection
    public boolean add(V v7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends V> elements) {
        s.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.this$0.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        s.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!mutableScatterMap.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.this$0._size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new MutableScatterMap$MutableMapWrapper$values$1$iterator$1(this.this$0);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (s.areEqual(mutableScatterMap.values[i11], obj)) {
                                mutableScatterMap.removeValueAt(i11);
                                return true;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    @Override // java.util.Collection
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
                            if (CollectionsKt___CollectionsKt.contains(elements, mutableScatterMap.values[i11])) {
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

    @Override // java.util.Collection
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
                            if (!CollectionsKt___CollectionsKt.contains(elements, mutableScatterMap.values[i11])) {
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

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return n.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        s.checkNotNullParameter(array, "array");
        return (T[]) n.toArray(this, array);
    }
}
