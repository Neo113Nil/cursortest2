package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public final class AtomicRef {
    public static final AtomicReferenceFieldUpdater FU = AtomicReferenceFieldUpdater.newUpdater(AtomicRef.class, Object.class, "value");
    public volatile Object value;

    public final boolean compareAndSet(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = FU;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == obj);
        return false;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
