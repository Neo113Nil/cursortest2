package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kdv extends ixf {
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.ixf
    public final void a() {
        this.b.offer(new kds(3));
        l();
    }

    @Override // defpackage.ixf
    public final void b() {
        this.b.offer(new kds(0));
        l();
    }

    @Override // defpackage.ixf
    public final void c() {
        this.b.offer(new kds(1));
        l();
    }

    @Override // defpackage.ixf
    public final void d(final Object obj) {
        this.b.offer(new kdu() { // from class: kdt
            @Override // defpackage.kdu
            public final void a(ixf ixfVar) {
                ixfVar.d(obj);
            }
        });
        l();
    }

    @Override // defpackage.ixf
    public final void e() {
        this.b.offer(new kds(2));
        l();
    }

    public final void l() {
        ixf ixfVar = (ixf) this.a.get();
        if (ixfVar == null) {
            return;
        }
        synchronized (this) {
            while (true) {
                kdu kduVar = (kdu) this.b.poll();
                if (kduVar != null) {
                    kduVar.a(ixfVar);
                }
            }
        }
    }
}
