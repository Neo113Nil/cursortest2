package androidx.collection;

import f6.p;
import java.util.Iterator;
import kotlin.collections.f0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i8) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i8);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, p action) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        s.checkNotNullParameter(action, "action");
        int size = sparseArrayCompat.size();
        for (int i8 = 0; i8 < size; i8++) {
            action.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i8)), sparseArrayCompat.valueAt(i8));
        }
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i8, T t7) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i8, t7);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i8, f6.a defaultValue) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        s.checkNotNullParameter(defaultValue, "defaultValue");
        T t7 = sparseArrayCompat.get(i8);
        return t7 == null ? (T) defaultValue.invoke() : t7;
    }

    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> f0 keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        return new f0() { // from class: androidx.collection.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArrayCompat.size();
            }

            @Override // kotlin.collections.f0
            public int nextInt() {
                SparseArrayCompat<T> sparseArrayCompat2 = sparseArrayCompat;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseArrayCompat2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> other) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        s.checkNotNullParameter(other, "other");
        SparseArrayCompat<T> sparseArrayCompat2 = new SparseArrayCompat<>(sparseArrayCompat.size() + other.size());
        sparseArrayCompat2.putAll(sparseArrayCompat);
        sparseArrayCompat2.putAll(other);
        return sparseArrayCompat2;
    }

    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i8, Object obj) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i8, obj);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i8, T t7) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i8, t7);
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        s.checkNotNullParameter(sparseArrayCompat, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArrayCompat);
    }
}
