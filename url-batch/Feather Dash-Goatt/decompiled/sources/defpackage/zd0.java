package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zd0 extends zl0 implements bv0 {
    public float s;
    public boolean t;

    @Override // defpackage.bv0
    public final Object e0(Object obj) {
        p41 p41Var = obj instanceof p41 ? (p41) obj : null;
        if (p41Var == null) {
            p41Var = new p41();
            p41Var.a = 0.0f;
            p41Var.b = true;
        }
        p41Var.a = this.s;
        p41Var.b = this.t;
        return p41Var;
    }
}
