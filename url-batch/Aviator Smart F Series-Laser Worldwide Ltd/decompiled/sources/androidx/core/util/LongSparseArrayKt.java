package androidx.core.util;

import android.util.LongSparseArray;
import f6.p;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class LongSparseArrayKt {
    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j8) {
        return longSparseArray.indexOfKey(j8) >= 0;
    }

    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j8) {
        return longSparseArray.indexOfKey(j8) >= 0;
    }

    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t7) {
        return longSparseArray.indexOfValue(t7) >= 0;
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, p pVar) {
        int size = longSparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            pVar.invoke(Long.valueOf(longSparseArray.keyAt(i8)), longSparseArray.valueAt(i8));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j8, T t7) {
        T t8 = longSparseArray.get(j8);
        return t8 == null ? t7 : t8;
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j8, f6.a aVar) {
        T t7 = longSparseArray.get(j8);
        return t7 == null ? (T) aVar.invoke() : t7;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    public static final <T> g0 keyIterator(final LongSparseArray<T> longSparseArray) {
        return new g0() { // from class: androidx.core.util.LongSparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // kotlin.collections.g0
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return longSparseArray2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            longSparseArray.put(longSparseArray2.keyAt(i8), longSparseArray2.valueAt(i8));
        }
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j8, T t7) {
        int indexOfKey = longSparseArray.indexOfKey(j8);
        if (indexOfKey < 0 || !s.areEqual(t7, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j8, T t7) {
        longSparseArray.put(j8, t7);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }
}
