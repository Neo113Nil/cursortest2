package L;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f564a;

    /* renamed from: b, reason: collision with root package name */
    public D.c[] f565b;

    public r0() {
        this(new z0());
    }

    public final void a() {
        D.c[] cVarArr = this.f565b;
        if (cVarArr != null) {
            D.c cVar = cVarArr[0];
            D.c cVar2 = cVarArr[1];
            z0 z0Var = this.f564a;
            if (cVar2 == null) {
                cVar2 = z0Var.f589a.f(2);
            }
            if (cVar == null) {
                cVar = z0Var.f589a.f(1);
            }
            g(D.c.a(cVar, cVar2));
            D.c cVar3 = this.f565b[A1.m.H(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            D.c cVar4 = this.f565b[A1.m.H(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            D.c cVar5 = this.f565b[A1.m.H(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract z0 b();

    public void c(int i, D.c cVar) {
        if (this.f565b == null) {
            this.f565b = new D.c[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f565b[A1.m.H(i2)] = cVar;
            }
        }
    }

    public void d(D.c cVar) {
    }

    public abstract void e(D.c cVar);

    public void f(D.c cVar) {
    }

    public abstract void g(D.c cVar);

    public void h(D.c cVar) {
    }

    public r0(z0 z0Var) {
        this.f564a = z0Var;
    }
}
