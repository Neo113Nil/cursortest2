package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class zi3 implements Callable {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ Object n;

    public /* synthetic */ zi3(dj3 dj3Var) {
        this.n = dj3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                return new ol3(((dj3) obj).w);
            default:
                mk3 mk3Var = (mk3) obj;
                mk3Var.g.B();
                bi3 bi3Var = mk3Var.g.t;
                oq3.U(bi3Var);
                bi3Var.v();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public zi3(mk3 mk3Var, kd3 kd3Var, String str) {
        this.n = mk3Var;
    }
}
