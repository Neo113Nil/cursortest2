package n0;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final v1 f2788a;

    /* renamed from: b, reason: collision with root package name */
    public f0.c[] f2789b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect[][] f2790c;
    public final Rect[][] d;

    public j1() {
        this(new v1());
    }

    public final void a() {
        f0.c[] cVarArr = this.f2789b;
        if (cVarArr != null) {
            f0.c cVar = cVarArr[0];
            f0.c cVar2 = cVarArr[1];
            v1 v1Var = this.f2788a;
            if (cVar2 == null) {
                cVar2 = v1Var.f2842a.h(2);
            }
            if (cVar == null) {
                cVar = v1Var.f2842a.h(1);
            }
            h(f0.c.a(cVar, cVar2));
            f0.c cVar3 = this.f2789b[b4.d.C(16)];
            if (cVar3 != null) {
                g(cVar3);
            }
            f0.c cVar4 = this.f2789b[b4.d.C(32)];
            if (cVar4 != null) {
                e(cVar4);
            }
            f0.c cVar5 = this.f2789b[b4.d.C(64)];
            if (cVar5 != null) {
                i(cVar5);
            }
        }
    }

    public abstract v1 b();

    public void c(v1 v1Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e4 = v1Var.f2842a.e(i);
            int C = b4.d.C(i);
            this.f2790c[C] = (Rect[]) e4.toArray(new Rect[e4.size()]);
            if (i != 8) {
                List<Rect> f5 = v1Var.f2842a.f(i);
                this.d[C] = (Rect[]) f5.toArray(new Rect[f5.size()]);
            }
        }
    }

    public void d(int i, f0.c cVar) {
        if (this.f2789b == null) {
            this.f2789b = new f0.c[10];
        }
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i & i4) != 0) {
                this.f2789b[b4.d.C(i4)] = cVar;
            }
        }
    }

    public abstract void f(f0.c cVar);

    public abstract void h(f0.c cVar);

    public j1(v1 v1Var) {
        this.f2790c = new Rect[10][];
        this.d = new Rect[10][];
        this.f2788a = v1Var;
        c(v1Var);
    }

    public void e(f0.c cVar) {
    }

    public void g(f0.c cVar) {
    }

    public void i(f0.c cVar) {
    }
}
