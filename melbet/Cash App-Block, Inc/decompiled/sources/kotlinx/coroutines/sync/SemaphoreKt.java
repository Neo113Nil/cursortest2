package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes3.dex */
public abstract class SemaphoreKt {
    public static final int MAX_SPIN_CYCLES = InlineList.systemProp$default(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final Symbol PERMIT = new Symbol("PERMIT", 0);
    public static final Symbol TAKEN = new Symbol("TAKEN", 0);
    public static final Symbol BROKEN = new Symbol("BROKEN", 0);
    public static final Symbol CANCELLED = new Symbol("CANCELLED", 0);
    public static final int SEGMENT_SIZE = InlineList.systemProp$default(16, 12, "kotlinx.coroutines.semaphore.segmentSize");
}
