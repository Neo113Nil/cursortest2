package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public abstract class b extends z {
    private static final AtomicReferenceFieldUpdater _consensus$FU = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.NO_DECISION;

    private final Object decide(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _consensus$FU;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.NO_DECISION;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public abstract void complete(Object obj, Object obj2);

    @Override // kotlinx.coroutines.internal.z
    public b getAtomicOp() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.z
    public final Object perform(Object obj) {
        Object obj2 = _consensus$FU.get(this);
        if (obj2 == a.NO_DECISION) {
            obj2 = decide(prepare(obj));
        }
        complete(obj, obj2);
        return obj2;
    }

    public abstract Object prepare(Object obj);
}
