package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class S extends AbstractC3213c implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f41058b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41059c;

    /* renamed from: d, reason: collision with root package name */
    private int f41060d;

    /* renamed from: e, reason: collision with root package name */
    private int f41061e;

    public static final class a extends AbstractC3212b {

        /* renamed from: b, reason: collision with root package name */
        private int f41062b;

        /* renamed from: c, reason: collision with root package name */
        private int f41063c;

        a() {
            this.f41062b = S.this.size();
            this.f41063c = S.this.f41060d;
        }

        @Override // kotlin.collections.AbstractC3212b
        protected void computeNext() {
            if (this.f41062b == 0) {
                done();
                return;
            }
            setNext(S.this.f41058b[this.f41063c]);
            this.f41063c = (this.f41063c + 1) % S.this.f41059c;
            this.f41062b--;
        }
    }

    public S(Object[] buffer, int i4) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f41058b = buffer;
        if (i4 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i4).toString());
        }
        if (i4 <= buffer.length) {
            this.f41059c = buffer.length;
            this.f41061e = i4;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i4 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    public final void f(Object obj) {
        if (h()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f41058b[(this.f41060d + size()) % this.f41059c] = obj;
        this.f41061e = size() + 1;
    }

    public final S g(int i4) {
        Object[] array;
        int i5 = this.f41059c;
        int g4 = kotlin.ranges.g.g(i5 + (i5 >> 1) + 1, i4);
        if (this.f41060d == 0) {
            array = Arrays.copyOf(this.f41058b, g4);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[g4]);
        }
        return new S(array, size());
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    public Object get(int i4) {
        AbstractC3213c.Companion.b(i4, size());
        return this.f41058b[(this.f41060d + i4) % this.f41059c];
    }

    @Override // kotlin.collections.AbstractC3211a
    public int getSize() {
        return this.f41061e;
    }

    public final boolean h() {
        return size() == this.f41059c;
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    public final void k(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i4).toString());
        }
        if (i4 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i4 + ", size = " + size()).toString());
        }
        if (i4 > 0) {
            int i5 = this.f41060d;
            int i6 = (i5 + i4) % this.f41059c;
            if (i5 > i6) {
                C3222l.n(this.f41058b, null, i5, this.f41059c);
                C3222l.n(this.f41058b, null, 0, i6);
            } else {
                C3222l.n(this.f41058b, null, i5, i6);
            }
            this.f41060d = i6;
            this.f41061e = size() - i4;
        }
    }

    @Override // kotlin.collections.AbstractC3211a, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        }
        int size = size();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = this.f41060d; i5 < size && i6 < this.f41059c; i6++) {
            array[i5] = this.f41058b[i6];
            i5++;
        }
        while (i5 < size) {
            array[i5] = this.f41058b[i4];
            i5++;
            i4++;
        }
        return C3226p.terminateCollectionToArray(size, array);
    }

    public S(int i4) {
        this(new Object[i4], 0);
    }

    @Override // kotlin.collections.AbstractC3211a, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
