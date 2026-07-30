package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class te3 implements kr3, ev1, xu1, tu1 {
    public final /* synthetic */ int m;
    public final Executor n;
    public final p30 o;
    public final ys3 p;

    public /* synthetic */ te3(Executor executor, p30 p30Var, ys3 ys3Var, int i) {
        this.m = i;
        this.n = executor;
        this.o = p30Var;
        this.p = ys3Var;
    }

    @Override // defpackage.kr3
    public final void a(jt2 jt2Var) {
        int i = this.m;
        Executor executor = this.n;
        boolean z = false;
        switch (i) {
            case 0:
                executor.execute(new iu0(16, this, jt2Var, z));
                break;
            default:
                executor.execute(new iu0(17, this, jt2Var, z));
                break;
        }
    }

    @Override // defpackage.tu1
    public void b() {
        this.p.r();
    }

    @Override // defpackage.xu1
    public void c(Exception exc) {
        this.p.p(exc);
    }

    @Override // defpackage.ev1
    public void onSuccess(Object obj) {
        this.p.q(obj);
    }
}
