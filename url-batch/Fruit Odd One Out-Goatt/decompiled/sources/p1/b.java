package p1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1039a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f1033a;

    public abstract void a(Object obj, Object obj2);

    public final Object b(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1039a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        o0.a aVar = a.f1033a;
        if (obj2 == aVar) {
            o0.a c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == aVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, c2)) {
                        obj2 = c2;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        a(obj, obj2);
        return obj2;
    }

    public abstract o0.a c(Object obj);

    public final String toString() {
        return getClass().getSimpleName() + '@' + k1.t.a(this);
    }
}
