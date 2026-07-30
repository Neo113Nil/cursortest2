package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gb extends bb2 implements xa2 {
    public wa2 K;
    public ya2 L;

    @Override // defpackage.bb2
    public final void G0(u42 u42Var, long j, float f) {
        wa2 wa2Var = this.K;
        if (wa2Var == null) {
            wa2Var = eb2.a(eb2.b((View) tk3.J(this, AndroidCompositionLocals_androidKt.f)));
            this.K = wa2Var;
        }
        ya2 a = wa2Var.a(this);
        int b = si1.b(f);
        long a2 = this.D.a();
        this.E.invoke();
        a.b(u42Var, this.B, j, b, a2, 0.1f, new u(3, this));
        this.L = a;
        z71.F(this);
    }

    @Override // defpackage.bb2
    public final void H0(k91 k91Var) {
        ls o = k91Var.m.n.o();
        ya2 ya2Var = this.L;
        if (ya2Var != null) {
            long j = this.H;
            long a = this.D.a();
            this.E.invoke();
            ya2Var.e(0.1f, j, a);
            ya2Var.draw(z6.a(o));
        }
    }

    @Override // defpackage.bb2
    public final void J0(u42 u42Var) {
        ya2 ya2Var = this.L;
        if (ya2Var != null) {
            ya2Var.d();
        }
    }

    @Override // defpackage.xa2
    public final void j0() {
        this.L = null;
        z71.F(this);
    }

    @Override // defpackage.ul1
    public final void z0() {
        wa2 wa2Var = this.K;
        if (wa2Var != null) {
            j0();
            tt1 tt1Var = wa2Var.p;
            ya2 ya2Var = (ya2) ((LinkedHashMap) tt1Var.n).get(this);
            if (ya2Var != null) {
                ya2Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) tt1Var.n;
                ya2 ya2Var2 = (ya2) linkedHashMap.get(this);
                if (ya2Var2 != null) {
                }
                linkedHashMap.remove(this);
                wa2Var.o.add(ya2Var);
            }
        }
    }
}
