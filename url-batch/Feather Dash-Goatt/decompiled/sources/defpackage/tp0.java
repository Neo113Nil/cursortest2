package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class tp0 {
    public final eo0 a = new eo0(new jp0[16]);
    public final mn0 b = new mn0(10);

    public boolean a(aj0 aj0Var, uc0 uc0Var, e30 e30Var, boolean z) {
        eo0 eo0Var = this.a;
        Object[] objArr = eo0Var.d;
        int i = eo0Var.g;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((jp0) objArr[i2]).a(aj0Var, uc0Var, e30Var, z) || z2;
        }
        return z2;
    }

    public void b(e30 e30Var) {
        eo0 eo0Var = this.a;
        int i = eo0Var.g;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((jp0) eo0Var.d[i]).d.d == 0) {
                eo0Var.k(i);
            }
        }
    }
}
