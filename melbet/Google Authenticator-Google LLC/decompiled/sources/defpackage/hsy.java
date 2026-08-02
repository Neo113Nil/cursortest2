package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hsy extends hsx {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(htd.class, Thread.class, "thread");
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(htd.class, htd.class, "next");
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(hte.class, htd.class, "waitersField");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(hte.class, hst.class, "listenersField");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(hte.class, Object.class, "valueField");

    @Override // defpackage.hsx
    public final hst a(hte hteVar, hst hstVar) {
        return (hst) d.getAndSet(hteVar, hstVar);
    }

    @Override // defpackage.hsx
    public final htd b(hte hteVar, htd htdVar) {
        return (htd) c.getAndSet(hteVar, htdVar);
    }

    @Override // defpackage.hsx
    public final void c(htd htdVar, htd htdVar2) {
        b.lazySet(htdVar, htdVar2);
    }

    @Override // defpackage.hsx
    public final void d(htd htdVar, Thread thread) {
        a.lazySet(htdVar, thread);
    }

    @Override // defpackage.hsx
    public final boolean e(hte hteVar, hst hstVar, hst hstVar2) {
        return a.b(d, hteVar, hstVar, hstVar2);
    }

    @Override // defpackage.hsx
    public final boolean f(hte hteVar, Object obj, Object obj2) {
        return a.b(e, hteVar, obj, obj2);
    }

    @Override // defpackage.hsx
    public final boolean g(hte hteVar, htd htdVar, htd htdVar2) {
        return a.b(c, hteVar, htdVar, htdVar2);
    }
}
