package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class ro0 {
    public final dp0 a;
    public fv[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public ro0(dp0 dp0Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = dp0Var;
        c(dp0Var);
    }

    public final void a() {
        fv[] fvVarArr = this.b;
        if (fvVarArr != null) {
            fv fvVar = fvVarArr[0];
            fv fvVar2 = fvVarArr[1];
            dp0 dp0Var = this.a;
            if (fvVar2 == null) {
                fvVar2 = dp0Var.a.h(2);
            }
            if (fvVar == null) {
                fvVar = dp0Var.a.h(1);
            }
            h(fv.a(fvVar, fvVar2));
            fv fvVar3 = this.b[zb0.i(16)];
            if (fvVar3 != null) {
                g(fvVar3);
            }
            fv fvVar4 = this.b[zb0.i(32)];
            if (fvVar4 != null) {
                e(fvVar4);
            }
            fv fvVar5 = this.b[zb0.i(64)];
            if (fvVar5 != null) {
                i(fvVar5);
            }
        }
    }

    public abstract dp0 b();

    public void c(dp0 dp0Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = dp0Var.a.e(i);
            int i2 = zb0.i(i);
            this.c[i2] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = dp0Var.a.f(i);
                this.d[i2] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, fv fvVar) {
        if (this.b == null) {
            this.b = new fv[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[zb0.i(i2)] = fvVar;
            }
        }
    }

    public abstract void f(fv fvVar);

    public abstract void h(fv fvVar);

    public ro0() {
        this(new dp0());
    }

    public void e(fv fvVar) {
    }

    public void g(fv fvVar) {
    }

    public void i(fv fvVar) {
    }
}
