package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class b0 {
    private volatile AtomicReferenceArray<Object> array;

    public b0(int i8) {
        this.array = new AtomicReferenceArray<>(i8);
    }

    public final int currentLength() {
        return this.array.length();
    }

    public final Object get(int i8) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i8 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i8);
        }
        return null;
    }

    public final void setSynchronized(int i8, Object obj) {
        int coerceAtLeast;
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i8 < length) {
            atomicReferenceArray.set(i8, obj);
            return;
        }
        coerceAtLeast = j6.v.coerceAtLeast(i8 + 1, length * 2);
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(coerceAtLeast);
        for (int i9 = 0; i9 < length; i9++) {
            atomicReferenceArray2.set(i9, atomicReferenceArray.get(i9));
        }
        atomicReferenceArray2.set(i8, obj);
        this.array = atomicReferenceArray2;
    }
}
