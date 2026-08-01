package w1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends n {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4492a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f4488a;

    @Override // w1.n
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4492a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        U.q qVar = a.f4488a;
        if (obj2 == qVar) {
            U.q c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == qVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, c2)) {
                        obj2 = c2;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != qVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract U.q c(Object obj);
}
