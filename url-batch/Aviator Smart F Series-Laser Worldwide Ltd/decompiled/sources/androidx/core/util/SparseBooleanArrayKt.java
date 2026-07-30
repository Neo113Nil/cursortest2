package androidx.core.util;

import android.util.SparseBooleanArray;
import f6.p;
import kotlin.collections.f0;
import kotlin.collections.m;

/* loaded from: classes.dex */
public final class SparseBooleanArrayKt {
    public static final boolean contains(SparseBooleanArray sparseBooleanArray, int i8) {
        return sparseBooleanArray.indexOfKey(i8) >= 0;
    }

    public static final boolean containsKey(SparseBooleanArray sparseBooleanArray, int i8) {
        return sparseBooleanArray.indexOfKey(i8) >= 0;
    }

    public static final boolean containsValue(SparseBooleanArray sparseBooleanArray, boolean z7) {
        return sparseBooleanArray.indexOfValue(z7) >= 0;
    }

    public static final void forEach(SparseBooleanArray sparseBooleanArray, p pVar) {
        int size = sparseBooleanArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            pVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i8)), Boolean.valueOf(sparseBooleanArray.valueAt(i8)));
        }
    }

    public static final boolean getOrDefault(SparseBooleanArray sparseBooleanArray, int i8, boolean z7) {
        return sparseBooleanArray.get(i8, z7);
    }

    public static final boolean getOrElse(SparseBooleanArray sparseBooleanArray, int i8, f6.a aVar) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i8);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : ((Boolean) aVar.invoke()).booleanValue();
    }

    public static final int getSize(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    public static final f0 keyIterator(final SparseBooleanArray sparseBooleanArray) {
        return new f0() { // from class: androidx.core.util.SparseBooleanArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // kotlin.collections.f0
            public int nextInt() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseBooleanArray2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final SparseBooleanArray plus(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i8), sparseBooleanArray2.valueAt(i8));
        }
    }

    public static final boolean remove(SparseBooleanArray sparseBooleanArray, int i8, boolean z7) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i8);
        if (indexOfKey < 0 || z7 != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i8);
        return true;
    }

    public static final void set(SparseBooleanArray sparseBooleanArray, int i8, boolean z7) {
        sparseBooleanArray.put(i8, z7);
    }

    public static final m valueIterator(final SparseBooleanArray sparseBooleanArray) {
        return new m() { // from class: androidx.core.util.SparseBooleanArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // kotlin.collections.m
            public boolean nextBoolean() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseBooleanArray2.valueAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }
}
