package t2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3431b extends z {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46223a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3431b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = AbstractC3430a.f46222a;

    private final Object c(Object obj) {
        Object obj2 = f46223a.get(this);
        Object obj3 = AbstractC3430a.f46222a;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.b.a(f46223a, this, obj3, obj) ? obj : f46223a.get(this);
    }

    @Override // t2.z
    public final Object a(Object obj) {
        Object obj2 = f46223a.get(this);
        if (obj2 == AbstractC3430a.f46222a) {
            obj2 = c(e(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract Object e(Object obj);
}
