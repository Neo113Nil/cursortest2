package b3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5649a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5650b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void a() {
        f5650b.set(this, null);
    }

    public final b b() {
        Object obj = f5649a.get(this);
        if (obj == a.f5646a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean c();

    public final void d() {
        b b4;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5650b;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.c()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b b5 = b();
            Intrinsics.c(b5);
            while (b5.c() && (b4 = b5.b()) != null) {
                b5 = b4;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b5);
                b bVar2 = ((b) obj) == null ? null : bVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b5, obj, bVar2)) {
                    if (atomicReferenceFieldUpdater.get(b5) != obj) {
                        break;
                    }
                }
            }
            if (bVar != null) {
                f5649a.set(bVar, b5);
            }
            if (!b5.c() || b5.b() == null) {
                if (bVar == null || !bVar.c()) {
                    return;
                }
            }
        }
    }
}
