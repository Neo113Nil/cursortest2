package M;

import a.AbstractC0058a;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f771a;

    /* renamed from: b, reason: collision with root package name */
    public E.c[] f772b;

    public l0() {
        this(new t0());
    }

    public final void a() {
        E.c[] cVarArr = this.f772b;
        if (cVarArr != null) {
            E.c cVar = cVarArr[0];
            E.c cVar2 = cVarArr[1];
            t0 t0Var = this.f771a;
            if (cVar2 == null) {
                cVar2 = t0Var.f794a.f(2);
            }
            if (cVar == null) {
                cVar = t0Var.f794a.f(1);
            }
            g(E.c.a(cVar, cVar2));
            E.c cVar3 = this.f772b[AbstractC0058a.F(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            E.c cVar4 = this.f772b[AbstractC0058a.F(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            E.c cVar5 = this.f772b[AbstractC0058a.F(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract t0 b();

    public void c(int i, E.c cVar) {
        if (this.f772b == null) {
            this.f772b = new E.c[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f772b[AbstractC0058a.F(i2)] = cVar;
            }
        }
    }

    public void d(E.c cVar) {
    }

    public abstract void e(E.c cVar);

    public void f(E.c cVar) {
    }

    public abstract void g(E.c cVar);

    public void h(E.c cVar) {
    }

    public l0(t0 t0Var) {
        this.f771a = t0Var;
    }
}
