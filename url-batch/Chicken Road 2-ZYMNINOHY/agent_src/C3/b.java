package C3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f285a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.f279a;

    @Override // C3.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f285a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        v vVar = a.f279a;
        if (obj2 == vVar) {
            v c4 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == vVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, c4)) {
                        obj2 = c4;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != vVar) {
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

    public abstract v c(Object obj);
}
