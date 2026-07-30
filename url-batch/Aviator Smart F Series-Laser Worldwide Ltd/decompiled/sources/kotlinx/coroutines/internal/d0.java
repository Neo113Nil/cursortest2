package kotlinx.coroutines.internal;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.y1;

/* loaded from: classes5.dex */
public abstract class d0 extends f implements y1 {
    private static final AtomicIntegerFieldUpdater cleanedAndPointers$FU = AtomicIntegerFieldUpdater.newUpdater(d0.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;
    public final long id;

    public d0(long j8, d0 d0Var, int i8) {
        super(d0Var);
        this.id = j8;
        this.cleanedAndPointers = i8 << 16;
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
        return cleanedAndPointers$FU.addAndGet(this, SupportMenu.CATEGORY_MASK) == getNumberOfSlots() && !isTail();
    }

    public abstract int getNumberOfSlots();

    @Override // kotlinx.coroutines.internal.f
    public boolean isRemoved() {
        return cleanedAndPointers$FU.get(this) == getNumberOfSlots() && !isTail();
    }

    public abstract void onCancellation(int i8, Throwable th, CoroutineContext coroutineContext);

    public final void onSlotCleaned() {
        if (cleanedAndPointers$FU.incrementAndGet(this) == getNumberOfSlots()) {
            remove();
        }
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = cleanedAndPointers$FU;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 == getNumberOfSlots() && !isTail()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 65536 + i8));
        return true;
    }
}
