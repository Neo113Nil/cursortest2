package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class id2 implements r82 {
    public ce2 m;
    public ld2 n;
    public String o;
    public Object p;
    public Object[] q;
    public mh r;
    public final dj s = new dj(8, this);

    public id2(ce2 ce2Var, ld2 ld2Var, String str, Object obj, Object[] objArr) {
        this.m = ce2Var;
        this.n = ld2Var;
        this.o = str;
        this.p = obj;
        this.q = objArr;
    }

    @Override // defpackage.r82
    public final void a() {
        b();
    }

    public final void b() {
        String D;
        ld2 ld2Var = this.n;
        if (this.r != null) {
            b71.p(this.r, ") is not null", "entry(");
            return;
        }
        if (ld2Var != null) {
            dj djVar = this.s;
            Object invoke = djVar.invoke();
            if (invoke == null || ld2Var.a(invoke)) {
                this.r = ld2Var.d(this.o, djVar);
                return;
            }
            if (invoke instanceof xm2) {
                xm2 xm2Var = (xm2) invoke;
                if (xm2Var.e() == qb2.Z || xm2Var.e() == by1.B || xm2Var.e() == by1.q) {
                    D = "MutableState containing " + xm2Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    D = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                D = ll3.D(invoke);
            }
            throw new IllegalArgumentException(D);
        }
    }

    @Override // defpackage.r82
    public final void c() {
        mh mhVar = this.r;
        if (mhVar != null) {
            mhVar.K();
        }
    }

    @Override // defpackage.r82
    public final void d() {
        mh mhVar = this.r;
        if (mhVar != null) {
            mhVar.K();
        }
    }
}
