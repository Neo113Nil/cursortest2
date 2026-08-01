package le;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5967a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5968b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(s sVar) {
        this._prev$volatile = sVar;
    }

    public final void a() {
        f5968b.set(this, null);
    }

    public final c b() {
        Object obj = f5967a.get(this);
        if (obj == b.f5964a) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean c();

    public final void d() {
        c b10;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5968b;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.c()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c b11 = b();
            b11.getClass();
            while (b11.c() && (b10 = b11.b()) != null) {
                b11 = b10;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b11);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b11, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(b11) != obj) {
                        break;
                    }
                }
            }
            if (cVar != null) {
                f5967a.set(cVar, b11);
            }
            if (!b11.c() || b11.b() == null) {
                if (cVar == null || !cVar.c()) {
                    return;
                }
            }
        }
    }
}
