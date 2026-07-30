package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class o51 implements j21 {
    public h61 d;
    public t51 e;
    public String g;
    public Object h;
    public Object[] i;
    public s51 j;
    public final i6 k = new i6(6, this);

    public o51(h61 h61Var, t51 t51Var, String str, Object obj, Object[] objArr) {
        this.d = h61Var;
        this.e = t51Var;
        this.g = str;
        this.h = obj;
        this.i = objArr;
    }

    public final void a() {
        String q;
        t51 t51Var = this.e;
        if (this.j != null) {
            dd0.k("entry(", this.j, ") is not null");
            return;
        }
        if (t51Var != null) {
            i6 i6Var = this.k;
            Object invoke = i6Var.invoke();
            if (invoke == null || t51Var.b(invoke)) {
                this.j = t51Var.e(this.g, i6Var);
                return;
            }
            if (invoke instanceof tb1) {
                tb1 tb1Var = (tb1) invoke;
                if (tb1Var.e() == j50.A || tb1Var.e() == j41.o || tb1Var.e() == j50.B) {
                    q = "MutableState containing " + tb1Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    q = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                q = y90.q(invoke);
            }
            throw new IllegalArgumentException(q);
        }
    }

    @Override // defpackage.j21
    public final void c() {
        a();
    }

    @Override // defpackage.j21
    public final void e() {
        s51 s51Var = this.j;
        if (s51Var != null) {
            ((i8) s51Var).w();
        }
    }

    @Override // defpackage.j21
    public final void g() {
        s51 s51Var = this.j;
        if (s51Var != null) {
            ((i8) s51Var).w();
        }
    }
}
