package p0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends r {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1132a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0090a.f1126a;

    @Override // p0.r
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1132a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        io.flutter.plugin.platform.c cVar = AbstractC0090a.f1126a;
        if (obj2 == cVar) {
            io.flutter.plugin.platform.c c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == cVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, cVar, c2)) {
                        obj2 = c2;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != cVar) {
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

    public abstract io.flutter.plugin.platform.c c(Object obj);
}
