package f7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2767a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2768b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void a() {
        f2768b.set(this, null);
    }

    public final b b() {
        Object obj = f2767a.get(this);
        if (obj == a.f2760a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean c();

    public final void d() {
        b b8;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2768b;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.c()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b b9 = b();
            q6.i.b(b9);
            while (b9.c() && (b8 = b9.b()) != null) {
                b9 = b8;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b9);
                b bVar2 = ((b) obj) == null ? null : bVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b9, obj, bVar2)) {
                    if (atomicReferenceFieldUpdater.get(b9) != obj) {
                        break;
                    }
                }
            }
            if (bVar != null) {
                f2767a.set(bVar, b9);
            }
            if (!b9.c() || b9.b() == null) {
                if (bVar == null || !bVar.c()) {
                    return;
                }
            }
        }
    }
}
