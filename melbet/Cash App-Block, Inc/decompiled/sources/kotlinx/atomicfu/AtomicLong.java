package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes4.dex */
public final class AtomicLong {
    public static final AtomicLongFieldUpdater FU = AtomicLongFieldUpdater.newUpdater(AtomicLong.class, "value");
    public volatile long value;

    public final String toString() {
        return String.valueOf(this.value);
    }
}
