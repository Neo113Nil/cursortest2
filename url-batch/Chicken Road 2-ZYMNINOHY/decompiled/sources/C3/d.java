package C3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f287a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f288b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public d(t tVar) {
        this._prev$volatile = tVar;
    }

    public final void a() {
        f288b.set(this, null);
    }

    public final d b() {
        Object obj = f287a.get(this);
        if (obj == a.f280b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d b4;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f288b;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.c()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d b5 = b();
            kotlin.jvm.internal.i.b(b5);
            while (b5.c() && (b4 = b5.b()) != null) {
                b5 = b4;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b5);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b5, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(b5) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                f287a.set(dVar, b5);
            }
            if (!b5.c() || b5.b() == null) {
                if (dVar == null || !dVar.c()) {
                    return;
                }
            }
        }
    }
}
