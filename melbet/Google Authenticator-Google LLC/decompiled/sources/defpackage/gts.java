package defpackage;

import java.lang.ref.Reference;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gts implements guq {
    public final gwl a;
    public final guq b;
    public Thread c;
    public hrz d;
    private final gwk e;

    private gts(gwk gwkVar, gts gtsVar, gun gunVar) {
        this.e = gwkVar;
        this.a = gtsVar.a;
        this.b = gtsVar;
        hrz hrzVar = gunVar.f;
        if (hrzVar == null) {
            this.d = null;
            this.c = Thread.currentThread();
        } else {
            this.d = hrzVar;
            this.c = null;
        }
    }

    @Override // defpackage.guq
    public final guq a() {
        return this.b;
    }

    public final int b() {
        return this.e.h;
    }

    @Override // defpackage.guq
    public final String c() {
        return this.e.c;
    }

    @Override // defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gta.n(this);
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.guq
    public final String d() {
        return this.a.c;
    }

    @Override // defpackage.guq
    public final Thread e() {
        return this.c;
    }

    @Override // defpackage.guq
    public final UUID f() {
        return this.a.b;
    }

    @Override // defpackage.guq
    public final hrz g() {
        return this.d;
    }

    @Override // defpackage.guq
    public final guc j() {
        gwk gwkVar = this.e;
        return guc.e(gwkVar.g, gwkVar.c());
    }

    @Override // defpackage.guq
    public final gtz k(hoq hoqVar) {
        return guc.j(hoqVar, j());
    }

    @Override // defpackage.guq
    public final long l() {
        return this.a.a() / 1000000;
    }

    @Override // defpackage.guq
    public final guc n() {
        throw null;
    }

    @Override // defpackage.guq
    public final void o(int i) {
        gwk gwkVar = this.e;
        if (gwkVar.f()) {
            gwkVar = gwkVar.b;
        }
        gwkVar.addAndGet(i);
        Reference.reachabilityFence(this);
    }

    @Override // defpackage.guq
    public final void p(boolean z) {
        long a = this.a.a();
        gwk gwkVar = this.e;
        long j = a - gwkVar.f;
        hoq.H(!gwkVar.e());
        gwkVar.k = (j & 4611686018427387903L) | (true != z ? 0L : 4611686018427387904L) | Long.MIN_VALUE;
        Reference.reachabilityFence(this);
    }

    @Override // defpackage.guq
    public final boolean q() {
        return this.a.d;
    }

    @Override // defpackage.guq
    public final guq r(String str, int i, guc gucVar, gun gunVar) {
        boolean z;
        gwl gwlVar = this.a;
        gwk gwkVar = new gwk(this.e, str, i, gwlVar.a(), gucVar);
        while (true) {
            AtomicReference atomicReference = gwlVar.f;
            gwk gwkVar2 = (gwk) atomicReference.get();
            z = true;
            int i2 = gwkVar2.h + 1;
            if (i2 >= gwlVar.a.f) {
                gwkVar.d(Integer.MIN_VALUE, null);
                synchronized (gwlVar) {
                    gwlVar.h++;
                }
                break;
            }
            gwkVar.d(i2, gwkVar2);
            if (a.a(atomicReference, gwkVar2, gwkVar)) {
                break;
            }
        }
        gts gtsVar = new gts(gwkVar, this, gunVar);
        guq guqVar = gtsVar.b;
        boolean z2 = gta.a;
        guqVar.getClass();
        hoq.I((gtsVar.c == null && gtsVar.d == null) ? false : true, "isSynchronousChild should not be called if the trace has been closed on its creation thread.");
        hrz hrzVar = gtsVar.d;
        gts gtsVar2 = (gts) guqVar;
        if (hrzVar == null ? gtsVar2.c != gtsVar.c : hrzVar != gtsVar2.d) {
            z = false;
        }
        gwkVar.j = z;
        return gtsVar;
    }

    @Override // defpackage.guq
    public final void t() {
        this.e.l = 3;
    }

    public final String toString() {
        return gta.m(this);
    }

    @Override // defpackage.guq
    public final void u(hoq hoqVar, Object obj) {
        gwk gwkVar;
        gwg gwgVar;
        gwh a;
        gwh gwhVar = new gwh(hoqVar, obj);
        do {
            gwkVar = this.e;
            gwgVar = gwk.a;
            a = gwgVar.a(gwkVar);
            if (a != null) {
                gwhVar.c = a;
            }
        } while (!gwgVar.b(gwkVar, a, gwhVar));
        Reference.reachabilityFence(this);
    }

    public gts(gwk gwkVar, gwl gwlVar, gun gunVar) {
        this.e = gwkVar;
        this.a = gwlVar;
        Thread thread = null;
        this.b = null;
        hrz hrzVar = gunVar.f;
        if (hrzVar == null) {
            this.d = null;
            thread = Thread.currentThread();
        } else {
            this.d = hrzVar;
        }
        this.c = thread;
    }
}
