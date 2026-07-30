package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ps1 {
    public final eo1 a = new eo1(new cs1[16]);
    public final jn1 b = new jn1(10);

    public boolean a(mg1 mg1Var, t81 t81Var, t21 t21Var, boolean z) {
        eo1 eo1Var = this.a;
        Object[] objArr = eo1Var.m;
        int i = eo1Var.o;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((cs1) objArr[i2]).a(mg1Var, t81Var, t21Var, z) || z2;
        }
        return z2;
    }

    public void b(t21 t21Var) {
        eo1 eo1Var = this.a;
        int i = eo1Var.o;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((cs1) eo1Var.m[i]).d.a == 0) {
                eo1Var.l(i);
            }
        }
    }
}
