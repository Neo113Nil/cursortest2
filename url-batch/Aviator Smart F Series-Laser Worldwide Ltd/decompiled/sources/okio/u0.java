package okio;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class u0 {
    private static final int HASH_BUCKET_COUNT;
    private static final AtomicReference<t0>[] hashBuckets;
    public static final u0 INSTANCE = new u0();
    private static final int MAX_SIZE = 65536;
    private static final t0 LOCK = new t0(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = highestOneBit;
        AtomicReference<t0>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i8 = 0; i8 < highestOneBit; i8++) {
            atomicReferenceArr[i8] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    private u0() {
    }

    private final AtomicReference<t0> firstRef() {
        return hashBuckets[(int) (Thread.currentThread().getId() & (HASH_BUCKET_COUNT - 1))];
    }

    public static final void recycle(t0 segment) {
        AtomicReference<t0> firstRef;
        t0 t0Var;
        kotlin.jvm.internal.s.checkNotNullParameter(segment, "segment");
        if (!(segment.next == null && segment.prev == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.shared || (t0Var = (firstRef = INSTANCE.firstRef()).get()) == LOCK) {
            return;
        }
        int i8 = t0Var == null ? 0 : t0Var.limit;
        if (i8 >= MAX_SIZE) {
            return;
        }
        segment.next = t0Var;
        segment.pos = 0;
        segment.limit = i8 + 8192;
        if (androidx.lifecycle.g.a(firstRef, t0Var, segment)) {
            return;
        }
        segment.next = null;
    }

    public static final t0 take() {
        AtomicReference<t0> firstRef = INSTANCE.firstRef();
        t0 t0Var = LOCK;
        t0 andSet = firstRef.getAndSet(t0Var);
        if (andSet == t0Var) {
            return new t0();
        }
        if (andSet == null) {
            firstRef.set(null);
            return new t0();
        }
        firstRef.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    public final int getByteCount() {
        t0 t0Var = firstRef().get();
        if (t0Var == null) {
            return 0;
        }
        return t0Var.limit;
    }

    public final int getMAX_SIZE() {
        return MAX_SIZE;
    }
}
