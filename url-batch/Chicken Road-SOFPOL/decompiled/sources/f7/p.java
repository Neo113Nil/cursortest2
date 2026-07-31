package f7;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p {
    private volatile AtomicReferenceArray<Object> array;

    public p(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void c(int i, h7.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, aVar);
            return;
        }
        int i8 = i + 1;
        int i9 = length * 2;
        if (i8 < i9) {
            i8 = i9;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i8);
        for (int i10 = 0; i10 < length; i10++) {
            atomicReferenceArray2.set(i10, atomicReferenceArray.get(i10));
        }
        atomicReferenceArray2.set(i, aVar);
        this.array = atomicReferenceArray2;
    }
}
