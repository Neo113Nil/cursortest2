package androidx.core.util;

import android.util.SparseLongArray;
import f6.p;
import kotlin.collections.f0;
import kotlin.collections.g0;

/* loaded from: classes.dex */
public final class SparseLongArrayKt {
    public static final boolean contains(SparseLongArray sparseLongArray, int i8) {
        return sparseLongArray.indexOfKey(i8) >= 0;
    }

    public static final boolean containsKey(SparseLongArray sparseLongArray, int i8) {
        return sparseLongArray.indexOfKey(i8) >= 0;
    }

    public static final boolean containsValue(SparseLongArray sparseLongArray, long j8) {
        return sparseLongArray.indexOfValue(j8) >= 0;
    }

    public static final void forEach(SparseLongArray sparseLongArray, p pVar) {
        int size = sparseLongArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            pVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i8)), Long.valueOf(sparseLongArray.valueAt(i8)));
        }
    }

    public static final long getOrDefault(SparseLongArray sparseLongArray, int i8, long j8) {
        return sparseLongArray.get(i8, j8);
    }

    public static final long getOrElse(SparseLongArray sparseLongArray, int i8, f6.a aVar) {
        int indexOfKey = sparseLongArray.indexOfKey(i8);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : ((Number) aVar.invoke()).longValue();
    }

    public static final int getSize(SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    public static final f0 keyIterator(final SparseLongArray sparseLongArray) {
        return new f0() { // from class: androidx.core.util.SparseLongArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // kotlin.collections.f0
            public int nextInt() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseLongArray2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i8), sparseLongArray2.valueAt(i8));
        }
    }

    public static final boolean remove(SparseLongArray sparseLongArray, int i8, long j8) {
        int indexOfKey = sparseLongArray.indexOfKey(i8);
        if (indexOfKey < 0 || j8 != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    public static final void set(SparseLongArray sparseLongArray, int i8, long j8) {
        sparseLongArray.put(i8, j8);
    }

    public static final g0 valueIterator(final SparseLongArray sparseLongArray) {
        return new g0() { // from class: androidx.core.util.SparseLongArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // kotlin.collections.g0
            public long nextLong() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseLongArray2.valueAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }
}
