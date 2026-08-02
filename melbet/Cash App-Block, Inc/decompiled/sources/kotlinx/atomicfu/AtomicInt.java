package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class AtomicInt {
    public static final AtomicIntegerFieldUpdater FU = AtomicIntegerFieldUpdater.newUpdater(AtomicInt.class, "value");
    public volatile int value;

    public final int decrementAndGet() {
        return FU.decrementAndGet(this);
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
