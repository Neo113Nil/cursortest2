package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class su implements fk2 {
    public final /* synthetic */ int a;

    public /* synthetic */ su(int i) {
        this.a = i;
    }

    @Override // defpackage.fk2
    public final bx1 a(long j, u81 u81Var, ca0 ca0Var) {
        switch (this.a) {
            case 0:
                vl1 vl1Var = tu.a;
                float R = ca0Var.R(30.0f);
                return new zw1(new w72(0.0f, -R, ql2.d(j), ql2.b(j) + R));
            case 1:
                vl1 vl1Var2 = tu.a;
                float R2 = ca0Var.R(30.0f);
                return new zw1(new w72(-R2, 0.0f, ql2.d(j) + R2, ql2.b(j)));
            default:
                return new zw1(tk3.p(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
