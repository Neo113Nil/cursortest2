package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class AtomicBoolean {
    public static final AtomicIntegerFieldUpdater FU = AtomicIntegerFieldUpdater.newUpdater(AtomicBoolean.class, "_value");
    public volatile int _value;

    public final boolean compareAndSet() {
        return FU.compareAndSet(this, 0, 1);
    }

    public final boolean getValue() {
        return this._value != 0;
    }

    public final String toString() {
        return String.valueOf(getValue());
    }
}
