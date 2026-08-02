package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rh extends rc {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public rh(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.rc
    public final void a(rk rkVar, rk rkVar2) {
        this.b.lazySet(rkVar, rkVar2);
    }

    @Override // defpackage.rc
    public final void b(rk rkVar, Thread thread) {
        this.a.lazySet(rkVar, thread);
    }

    @Override // defpackage.rc
    public final boolean c(rl rlVar, rg rgVar, rg rgVar2) {
        return a.b(this.d, rlVar, rgVar, rgVar2);
    }

    @Override // defpackage.rc
    public final boolean d(rl rlVar, Object obj, Object obj2) {
        return a.b(this.e, rlVar, obj, obj2);
    }

    @Override // defpackage.rc
    public final boolean e(rl rlVar, rk rkVar, rk rkVar2) {
        return a.b(this.c, rlVar, rkVar, rkVar2);
    }
}
