package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdn implements bmn {
    public bbh c;
    public boolean d;
    public bdv e;
    public boolean f;
    bdr g;
    public boolean h;
    bdp i;
    public volatile boolean j;
    int k;
    public final bdj l;
    public final bdj m;
    private final wq n;
    private final bfc o;
    private final bfc p;
    private final bfc q;
    private boolean s;
    private bcz t;
    final bdm a = new bdm(new ArrayList(2));
    public final bmq b = new bmq();
    private final AtomicInteger r = new AtomicInteger();

    public bdn(bfc bfcVar, bfc bfcVar2, bfc bfcVar3, bdj bdjVar, bdj bdjVar2, wq wqVar) {
        this.o = bfcVar;
        this.p = bfcVar2;
        this.q = bfcVar3;
        this.m = bdjVar;
        this.l = bdjVar2;
        this.n = wqVar;
    }

    private final boolean j() {
        return this.h || this.f || this.j;
    }

    public final bfc b() {
        return this.s ? this.q : this.p;
    }

    @Override // defpackage.bmn
    public final bmq bp() {
        return this.b;
    }

    final void c() {
        bdp bdpVar;
        synchronized (this) {
            this.b.a();
            a.T(j(), "Not yet complete!");
            int decrementAndGet = this.r.decrementAndGet();
            a.T(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                bdpVar = this.i;
                e();
            } else {
                bdpVar = null;
            }
        }
        if (bdpVar != null) {
            bdpVar.f();
        }
    }

    final synchronized void d(int i) {
        bdp bdpVar;
        a.T(j(), "Not yet complete!");
        if (this.r.getAndAdd(i) != 0 || (bdpVar = this.i) == null) {
            return;
        }
        bdpVar.d();
    }

    public final synchronized void e() {
        if (this.c == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.c = null;
        this.i = null;
        this.e = null;
        this.h = false;
        this.j = false;
        this.f = false;
        bcz bczVar = this.t;
        if (bczVar.c.d()) {
            bczVar.c();
        }
        this.t = null;
        this.g = null;
        this.k = 0;
        this.n.b(this);
    }

    public final synchronized void f(bcz bczVar) {
        bfc bfcVar;
        this.t = bczVar;
        int e = bczVar.e(1);
        if (e != 2 && e != 3) {
            bfcVar = b();
            bfcVar.execute(bczVar);
        }
        bfcVar = this.o;
        bfcVar.execute(bczVar);
    }

    public final synchronized void g(blg blgVar, Executor executor) {
        this.b.a();
        this.a.a.add(new bdl(blgVar, executor));
        if (this.f) {
            d(1);
            bmi.g(new bdk(this, blgVar, 0));
        } else if (!this.h) {
            a.T(!this.j, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            d(1);
            bmi.g(new bdk(this, blgVar, 1));
        }
    }

    public final synchronized void h(blg blgVar) {
        this.b.a();
        bdl bdlVar = new bdl(blgVar, bma.b);
        bdm bdmVar = this.a;
        bdmVar.a.remove(bdlVar);
        if (bdmVar.c()) {
            if (!j()) {
                this.j = true;
                bcz bczVar = this.t;
                bczVar.o = true;
                bcw bcwVar = bczVar.n;
                if (bcwVar != null) {
                    bcwVar.a();
                }
                this.m.a(this, this.c);
            }
            if ((this.f || this.h) && this.r.get() == 0) {
                e();
            }
        }
    }

    public final synchronized void i(bbh bbhVar, boolean z, boolean z2) {
        this.c = bbhVar;
        this.d = z;
        this.s = z2;
    }
}
