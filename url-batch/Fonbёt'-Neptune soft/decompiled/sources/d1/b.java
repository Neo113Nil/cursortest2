package d1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends r {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2068a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0184a.f2062a;

    @Override // d1.r
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2068a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        B.m mVar = AbstractC0184a.f2062a;
        if (obj2 == mVar) {
            B.m c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == mVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, mVar, c2)) {
                        obj2 = c2;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != mVar) {
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

    public abstract B.m c(Object obj);
}
