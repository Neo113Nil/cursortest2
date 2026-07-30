package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dw0 implements j21 {
    public final Set d;
    public final eo0 e = new eo0(new k21[16]);

    public dw0(Set set) {
        this.d = set;
    }

    @Override // defpackage.j21
    public final void c() {
        eo0 eo0Var = this.e;
        Object[] objArr = eo0Var.d;
        int i = eo0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            j21 j21Var = ((k21) objArr[i2]).a;
            this.d.remove(j21Var);
            j21Var.c();
        }
    }

    @Override // defpackage.j21
    public final void e() {
    }

    @Override // defpackage.j21
    public final void g() {
    }
}
