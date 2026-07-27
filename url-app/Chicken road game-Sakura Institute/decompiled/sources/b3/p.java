package b3;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class p {
    private volatile AtomicReferenceArray<Object> array;

    public p(int i2) {
        this.array = new AtomicReferenceArray<>(i2);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i2 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i2);
        }
        return null;
    }

    public final void c(int i2, d3.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i2 < length) {
            atomicReferenceArray.set(i2, aVar);
            return;
        }
        int i4 = i2 + 1;
        int i5 = length * 2;
        if (i4 < i5) {
            i4 = i5;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i4);
        for (int i6 = 0; i6 < length; i6++) {
            atomicReferenceArray2.set(i6, atomicReferenceArray.get(i6));
        }
        atomicReferenceArray2.set(i2, aVar);
        this.array = atomicReferenceArray2;
    }
}
