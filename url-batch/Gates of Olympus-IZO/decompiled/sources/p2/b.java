package p2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6768a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6769b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(s sVar) {
        this._prev$volatile = sVar;
    }

    public final void a() {
        f6769b.set(this, null);
    }

    public final b b() {
        Object obj = f6768a.get(this);
        if (obj == a.f6761a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean c();

    public final void d() {
        b b2;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6769b;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.c()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b b3 = b();
            Z1.i.c(b3);
            while (b3.c() && (b2 = b3.b()) != null) {
                b3 = b2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b3);
                b bVar2 = ((b) obj) == null ? null : bVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b3, obj, bVar2)) {
                    if (atomicReferenceFieldUpdater.get(b3) != obj) {
                        break;
                    }
                }
            }
            if (bVar != null) {
                f6768a.set(bVar, b3);
            }
            if (!b3.c() || b3.b() == null) {
                if (bVar == null || !bVar.c()) {
                    return;
                }
            }
        }
    }
}
