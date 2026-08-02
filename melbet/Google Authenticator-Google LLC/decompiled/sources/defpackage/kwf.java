package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kwf extends kvj {
    private long a;
    public kpi d;
    private boolean e;

    private static final long bW(boolean z) {
        return z ? 4294967296L : 1L;
    }

    protected abstract Thread e();

    protected void j(long j, kwi kwiVar) {
        kvq.a.u(j, kwiVar);
    }

    public void k() {
        throw null;
    }

    public long l() {
        throw null;
    }

    public final void m(boolean z) {
        long bW = this.a - bW(z);
        this.a = bW;
        if (bW > 0) {
            return;
        }
        boolean z2 = kvo.a;
        if (this.e) {
            k();
        }
    }

    public final void n(kvy kvyVar) {
        kpi kpiVar = this.d;
        if (kpiVar == null) {
            kpiVar = new kpi();
            this.d = kpiVar;
        }
        kpiVar.addLast(kvyVar);
    }

    public final void o(boolean z) {
        this.a += bW(z);
        if (z) {
            return;
        }
        this.e = true;
    }

    public final boolean p() {
        return this.a >= bW(true);
    }

    public final boolean q() {
        kpi kpiVar = this.d;
        if (kpiVar != null) {
            return kpiVar.isEmpty();
        }
        return true;
    }

    public final boolean r() {
        kpi kpiVar = this.d;
        if (kpiVar == null) {
            return false;
        }
        kvy kvyVar = (kvy) (kpiVar.isEmpty() ? null : kpiVar.removeFirst());
        if (kvyVar == null) {
            return false;
        }
        kvyVar.run();
        return true;
    }

    protected final void s() {
        Thread e = e();
        if (Thread.currentThread() != e) {
            LockSupport.unpark(e);
        }
    }
}
