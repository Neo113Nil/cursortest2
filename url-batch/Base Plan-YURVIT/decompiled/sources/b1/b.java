package b1;

import B0.E;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends r {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1741a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0115a.f1735a;

    @Override // b1.r
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1741a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        E e2 = AbstractC0115a.f1735a;
        if (obj2 == e2) {
            E c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == e2) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, e2, c2)) {
                        obj2 = c2;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != e2) {
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

    public abstract E c(Object obj);
}
