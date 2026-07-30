package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class q73 {
    public final c83 a;
    public z21[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public q73(c83 c83Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = c83Var;
        c(c83Var);
    }

    public final void a() {
        z21[] z21VarArr = this.b;
        if (z21VarArr != null) {
            z21 z21Var = z21VarArr[0];
            z21 z21Var2 = z21VarArr[1];
            c83 c83Var = this.a;
            if (z21Var2 == null) {
                z21Var2 = c83Var.a.h(2);
            }
            if (z21Var == null) {
                z21Var = c83Var.a.h(1);
            }
            h(z21.a(z21Var, z21Var2));
            z21 z21Var3 = this.b[gk2.d(16)];
            if (z21Var3 != null) {
                g(z21Var3);
            }
            z21 z21Var4 = this.b[gk2.d(32)];
            if (z21Var4 != null) {
                e(z21Var4);
            }
            z21 z21Var5 = this.b[gk2.d(64)];
            if (z21Var5 != null) {
                i(z21Var5);
            }
        }
    }

    public abstract c83 b();

    public void c(c83 c83Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = c83Var.a.e(i);
            int d = gk2.d(i);
            this.c[d] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = c83Var.a.f(i);
                this.d[d] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, z21 z21Var) {
        if (this.b == null) {
            this.b = new z21[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[gk2.d(i2)] = z21Var;
            }
        }
    }

    public abstract void f(z21 z21Var);

    public abstract void h(z21 z21Var);

    public q73() {
        this(new c83());
    }

    public void e(z21 z21Var) {
    }

    public void g(z21 z21Var) {
    }

    public void i(z21 z21Var) {
    }
}
