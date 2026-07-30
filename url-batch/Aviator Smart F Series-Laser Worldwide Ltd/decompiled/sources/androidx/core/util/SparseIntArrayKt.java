package androidx.core.util;

import android.util.SparseIntArray;
import f6.p;
import kotlin.collections.f0;

/* loaded from: classes.dex */
public final class SparseIntArrayKt {
    public static final boolean contains(SparseIntArray sparseIntArray, int i8) {
        return sparseIntArray.indexOfKey(i8) >= 0;
    }

    public static final boolean containsKey(SparseIntArray sparseIntArray, int i8) {
        return sparseIntArray.indexOfKey(i8) >= 0;
    }

    public static final boolean containsValue(SparseIntArray sparseIntArray, int i8) {
        return sparseIntArray.indexOfValue(i8) >= 0;
    }

    public static final void forEach(SparseIntArray sparseIntArray, p pVar) {
        int size = sparseIntArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            pVar.invoke(Integer.valueOf(sparseIntArray.keyAt(i8)), Integer.valueOf(sparseIntArray.valueAt(i8)));
        }
    }

    public static final int getOrDefault(SparseIntArray sparseIntArray, int i8, int i9) {
        return sparseIntArray.get(i8, i9);
    }

    public static final int getOrElse(SparseIntArray sparseIntArray, int i8, f6.a aVar) {
        int indexOfKey = sparseIntArray.indexOfKey(i8);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : ((Number) aVar.invoke()).intValue();
    }

    public static final int getSize(SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(SparseIntArray sparseIntArray) {
        return sparseIntArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseIntArray sparseIntArray) {
        return sparseIntArray.size() != 0;
    }

    public static final f0 keyIterator(final SparseIntArray sparseIntArray) {
        return new f0() { // from class: androidx.core.util.SparseIntArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // kotlin.collections.f0
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseIntArray2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final SparseIntArray plus(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void putAll(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i8), sparseIntArray2.valueAt(i8));
        }
    }

    public static final boolean remove(SparseIntArray sparseIntArray, int i8, int i9) {
        int indexOfKey = sparseIntArray.indexOfKey(i8);
        if (indexOfKey < 0 || i9 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void set(SparseIntArray sparseIntArray, int i8, int i9) {
        sparseIntArray.put(i8, i9);
    }

    public static final f0 valueIterator(final SparseIntArray sparseIntArray) {
        return new f0() { // from class: androidx.core.util.SparseIntArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // kotlin.collections.f0
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseIntArray2.valueAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }
}
