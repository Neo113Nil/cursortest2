package androidx.core.util;

import android.util.SparseArray;
import f6.p;
import java.util.Iterator;
import kotlin.collections.f0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(SparseArray<T> sparseArray, int i8) {
        return sparseArray.indexOfKey(i8) >= 0;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i8) {
        return sparseArray.indexOfKey(i8) >= 0;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t7) {
        return sparseArray.indexOfValue(t7) >= 0;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, p pVar) {
        int size = sparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            pVar.invoke(Integer.valueOf(sparseArray.keyAt(i8)), sparseArray.valueAt(i8));
        }
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i8, T t7) {
        T t8 = sparseArray.get(i8);
        return t8 == null ? t7 : t8;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i8, f6.a aVar) {
        T t7 = sparseArray.get(i8);
        return t7 == null ? (T) aVar.invoke() : t7;
    }

    public static final <T> int getSize(SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    public static final <T> f0 keyIterator(final SparseArray<T> sparseArray) {
        return new f0() { // from class: androidx.core.util.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // kotlin.collections.f0
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseArray2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseArray.put(sparseArray2.keyAt(i8), sparseArray2.valueAt(i8));
        }
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i8, T t7) {
        int indexOfKey = sparseArray.indexOfKey(i8);
        if (indexOfKey < 0 || !s.areEqual(t7, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i8, T t7) {
        sparseArray.put(i8, t7);
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        return new SparseArrayKt$valueIterator$1(sparseArray);
    }
}
