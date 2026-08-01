package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class fb0 {
    public final rb0 a;
    public to[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public fb0(rb0 rb0Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = rb0Var;
        c(rb0Var);
    }

    public final void a() {
        to[] toVarArr = this.b;
        if (toVarArr != null) {
            to toVar = toVarArr[0];
            to toVar2 = toVarArr[1];
            rb0 rb0Var = this.a;
            if (toVar2 == null) {
                toVar2 = rb0Var.a.h(2);
            }
            if (toVar == null) {
                toVar = rb0Var.a.h(1);
            }
            h(to.a(toVar, toVar2));
            to toVar3 = this.b[o90.d(16)];
            if (toVar3 != null) {
                g(toVar3);
            }
            to toVar4 = this.b[o90.d(32)];
            if (toVar4 != null) {
                e(toVar4);
            }
            to toVar5 = this.b[o90.d(64)];
            if (toVar5 != null) {
                i(toVar5);
            }
        }
    }

    public abstract rb0 b();

    public void c(rb0 rb0Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = rb0Var.a.e(i);
            int d = o90.d(i);
            this.c[d] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = rb0Var.a.f(i);
                this.d[d] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, to toVar) {
        if (this.b == null) {
            this.b = new to[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[o90.d(i2)] = toVar;
            }
        }
    }

    public abstract void f(to toVar);

    public abstract void h(to toVar);

    public fb0() {
        this(new rb0());
    }

    public void e(to toVar) {
    }

    public void g(to toVar) {
    }

    public void i(to toVar) {
    }
}
