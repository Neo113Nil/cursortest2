package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* loaded from: classes3.dex */
public final class ResizableAtomicArray {

    /* renamed from: array, reason: collision with root package name */
    private volatile AtomicReferenceArray<Object> f1543array;

    public ResizableAtomicArray(int i) {
        this.f1543array = new AtomicReferenceArray<>(i);
    }

    public final int currentLength() {
        return this.f1543array.length();
    }

    public final Object get(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f1543array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void setSynchronized(int i, CoroutineScheduler.Worker worker) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f1543array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, worker);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, worker);
        this.f1543array = atomicReferenceArray2;
    }
}
