package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class me0 {
    public final ye0 a;
    public er[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public me0(ye0 ye0Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = ye0Var;
        c(ye0Var);
    }

    public final void a() {
        er[] erVarArr = this.b;
        if (erVarArr != null) {
            er erVar = erVarArr[0];
            er erVar2 = erVarArr[1];
            ye0 ye0Var = this.a;
            if (erVar2 == null) {
                erVar2 = ye0Var.a.h(2);
            }
            if (erVar == null) {
                erVar = ye0Var.a.h(1);
            }
            h(er.a(erVar, erVar2));
            er erVar3 = this.b[kr.G(16)];
            if (erVar3 != null) {
                g(erVar3);
            }
            er erVar4 = this.b[kr.G(32)];
            if (erVar4 != null) {
                e(erVar4);
            }
            er erVar5 = this.b[kr.G(64)];
            if (erVar5 != null) {
                i(erVar5);
            }
        }
    }

    public abstract ye0 b();

    public void c(ye0 ye0Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = ye0Var.a.e(i);
            int G = kr.G(i);
            this.c[G] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = ye0Var.a.f(i);
                this.d[G] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, er erVar) {
        if (this.b == null) {
            this.b = new er[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[kr.G(i2)] = erVar;
            }
        }
    }

    public abstract void f(er erVar);

    public abstract void h(er erVar);

    public me0() {
        this(new ye0());
    }

    public void e(er erVar) {
    }

    public void g(er erVar) {
    }

    public void i(er erVar) {
    }
}
