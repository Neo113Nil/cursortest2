package s1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends n {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3643a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f3639a;

    @Override // s1.n
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3643a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        T.r rVar = a.f3639a;
        if (obj2 == rVar) {
            T.r c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == rVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, c2)) {
                        obj2 = c2;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
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

    public abstract T.r c(Object obj);
}
