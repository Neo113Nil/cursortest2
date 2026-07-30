package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p22 extends ul1 implements rz2, w22, l00 {
    public va A;
    public boolean B;

    public final void G0() {
        va vaVar;
        c82 c82Var = new c82();
        nk2.o(this, new cv2(c82Var));
        p22 p22Var = (p22) c82Var.m;
        if (p22Var == null || (vaVar = p22Var.A) == null) {
            vaVar = this.A;
        }
        H0(vaVar);
    }

    public final void H0(q22 q22Var) {
        r22 r22Var = (r22) tk3.J(this, p00.u);
        if (r22Var != null) {
            o7 o7Var = (o7) r22Var;
            if (q22Var == null) {
                q22.a.getClass();
                q22Var = yk3.t;
            }
            h8.a.a(o7Var.a, q22Var);
        }
    }

    public final void I0() {
        y72 y72Var = new y72();
        y72Var.m = true;
        nk2.p(this, new lu(y72Var, 2));
        if (y72Var.m) {
            G0();
        }
    }

    @Override // defpackage.w22
    public final void J(m22 m22Var, n22 n22Var, long j) {
        if (n22Var == n22.n) {
            List list = m22Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int i2 = ((t22) list.get(i)).i;
                if (i2 != 3 && i2 != 4) {
                    int i3 = m22Var.c;
                    if (i3 == 4) {
                        this.B = true;
                        I0();
                        return;
                    } else {
                        if (i3 == 5) {
                            J0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void J0() {
        if (this.B) {
            this.B = false;
            if (this.z) {
                c82 c82Var = new c82();
                nk2.o(this, new m7(3, c82Var));
                p22 p22Var = (p22) c82Var.m;
                if (p22Var != null) {
                    p22Var.G0();
                } else {
                    H0(null);
                }
            }
        }
    }

    @Override // defpackage.w22
    public final void h0() {
        J0();
    }

    @Override // defpackage.rz2
    public final /* bridge */ /* synthetic */ Object r() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.w22
    public final long u() {
        int i = l41.k;
        return l41.j;
    }

    @Override // defpackage.ul1
    public final void z0() {
        J0();
    }
}
