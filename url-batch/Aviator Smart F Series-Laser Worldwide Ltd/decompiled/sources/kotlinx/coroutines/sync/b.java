package kotlinx.coroutines.sync;

import com.google.common.util.concurrent.s;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.g0;

/* loaded from: classes5.dex */
final class b extends d0 {
    private final AtomicReferenceArray acquirers;

    public b(long j8, b bVar, int i8) {
        super(j8, bVar, i8);
        int i9;
        i9 = SemaphoreKt.SEGMENT_SIZE;
        this.acquirers = new AtomicReferenceArray(i9);
    }

    public final boolean cas(int i8, Object obj, Object obj2) {
        return s.a(getAcquirers(), i8, obj, obj2);
    }

    public final Object get(int i8) {
        return getAcquirers().get(i8);
    }

    public final AtomicReferenceArray getAcquirers() {
        return this.acquirers;
    }

    public final Object getAndSet(int i8, Object obj) {
        return getAcquirers().getAndSet(i8, obj);
    }

    @Override // kotlinx.coroutines.internal.d0
    public int getNumberOfSlots() {
        int i8;
        i8 = SemaphoreKt.SEGMENT_SIZE;
        return i8;
    }

    @Override // kotlinx.coroutines.internal.d0
    public void onCancellation(int i8, Throwable th, CoroutineContext coroutineContext) {
        g0 g0Var;
        g0Var = SemaphoreKt.CANCELLED;
        getAcquirers().set(i8, g0Var);
        onSlotCleaned();
    }

    public final void set(int i8, Object obj) {
        getAcquirers().set(i8, obj);
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }
}
