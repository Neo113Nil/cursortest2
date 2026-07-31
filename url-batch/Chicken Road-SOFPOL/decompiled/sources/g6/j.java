package g6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements c, i6.d {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3047e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* renamed from: d, reason: collision with root package name */
    public final c f3048d;
    private volatile Object result;

    public j(c cVar) {
        h6.a aVar = h6.a.f3204d;
        this.f3048d = cVar;
        this.result = aVar;
    }

    @Override // i6.d
    public final i6.d e() {
        c cVar = this.f3048d;
        if (cVar instanceof i6.d) {
            return (i6.d) cVar;
        }
        return null;
    }

    @Override // g6.c
    public final h f() {
        return this.f3048d.f();
    }

    @Override // g6.c
    public final void k(Object obj) {
        while (true) {
            Object obj2 = this.result;
            h6.a aVar = h6.a.f3205e;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3047e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            h6.a aVar2 = h6.a.f3204d;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3047e;
            h6.a aVar3 = h6.a.f3206f;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f3048d.k(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f3048d;
    }
}
