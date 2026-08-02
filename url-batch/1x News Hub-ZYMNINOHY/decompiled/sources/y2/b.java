package y2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;

/* loaded from: classes.dex */
public abstract class b extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10836a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.f10831a;

    @Override // y2.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10836a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        C1148j c1148j = a.f10831a;
        if (obj2 == c1148j) {
            C1148j c3 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == c1148j) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c1148j, c3)) {
                        obj2 = c3;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != c1148j) {
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

    public abstract C1148j c(Object obj);
}
