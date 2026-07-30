package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ei3 implements kr3, ev1, xu1, tu1 {
    public final /* synthetic */ int m;
    public final Executor n;
    public final Object o;
    public final Object p;

    public ei3(Executor executor, tu1 tu1Var) {
        this.m = 0;
        this.o = new Object();
        this.n = executor;
        this.p = tu1Var;
    }

    @Override // defpackage.kr3
    public final void a(jt2 jt2Var) {
        boolean z = false;
        switch (this.m) {
            case 0:
                if (jt2Var.k()) {
                    synchronized (this.o) {
                    }
                    this.n.execute(new r7(17, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.o) {
                }
                this.n.execute(new iu0(19, this, jt2Var, z));
                return;
            case 2:
                if (jt2Var.m() || jt2Var.k()) {
                    return;
                }
                synchronized (this.o) {
                }
                this.n.execute(new iu0(23, this, jt2Var, z));
                return;
            case 3:
                if (jt2Var.m()) {
                    synchronized (this.o) {
                    }
                    this.n.execute(new iu0(29, this, jt2Var, z));
                    return;
                }
                return;
            default:
                this.n.execute(new pn3(6, this, jt2Var));
                return;
        }
    }

    @Override // defpackage.tu1
    public void b() {
        ((ys3) this.p).r();
    }

    @Override // defpackage.xu1
    public void c(Exception exc) {
        ((ys3) this.p).p(exc);
    }

    @Override // defpackage.ev1
    public void onSuccess(Object obj) {
        ((ys3) this.p).q(obj);
    }

    public ei3(Executor executor, uu1 uu1Var) {
        this.m = 1;
        this.o = new Object();
        this.n = executor;
        this.p = uu1Var;
    }

    public ei3(Executor executor, xu1 xu1Var) {
        this.m = 2;
        this.o = new Object();
        this.n = executor;
        this.p = xu1Var;
    }

    public ei3(Executor executor, ev1 ev1Var) {
        this.m = 3;
        this.o = new Object();
        this.n = executor;
        this.p = ev1Var;
    }

    public ei3(Executor executor, lq2 lq2Var, ys3 ys3Var) {
        this.m = 4;
        this.n = executor;
        this.o = lq2Var;
        this.p = ys3Var;
    }
}
