package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z00 {
    public final e10 a;
    public final d4 b;
    public final wn0 c;
    public final wn0 d;
    public boolean e;

    public z00(e10 e10Var, d4 d4Var) {
        this.a = e10Var;
        this.b = d4Var;
        wn0 wn0Var = r61.a;
        this.c = new wn0();
        this.d = new wn0();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        v3 v3Var = new v3(0, this, z00.class, "invalidateNodes", "invalidateNodes()V", 0, 1);
        mn0 mn0Var = this.b.z0;
        if (mn0Var.g(v3Var) < 0) {
            mn0Var.a(v3Var);
        }
        this.e = true;
    }
}
