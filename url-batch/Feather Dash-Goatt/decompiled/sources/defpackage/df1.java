package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class df1 {
    public final yw a;
    public xd0 b;
    public final cf1 c = new cf1(this, 2);
    public final cf1 d = new cf1(this, 0);
    public final cf1 e = new cf1(this, 1);

    public df1(yw ywVar) {
        this.a = ywVar;
    }

    public final xd0 a() {
        xd0 xd0Var = this.b;
        if (xd0Var != null) {
            return xd0Var;
        }
        dd0.e("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
