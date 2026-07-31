package M5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1590f = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1591g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public d(t tVar) {
        this._prev = tVar;
    }

    public final void a() {
        f1591g.lazySet(this, null);
    }

    public final d b() {
        Object obj = f1590f.get(this);
        if (obj == a.f1583b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d b7;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1591g;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.c()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d b8 = b();
            kotlin.jvm.internal.i.b(b8);
            while (b8.c() && (b7 = b8.b()) != null) {
                b8 = b7;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b8);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b8, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(b8) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                f1590f.set(dVar, b8);
            }
            if (!b8.c() || b8.b() == null) {
                if (dVar == null || !dVar.c()) {
                    return;
                }
            }
        }
    }
}
