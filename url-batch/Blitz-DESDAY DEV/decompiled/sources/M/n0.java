package M;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f573a;

    /* renamed from: b, reason: collision with root package name */
    public E.c[] f574b;

    public n0() {
        this(new v0());
    }

    public final void a() {
        E.c[] cVarArr = this.f574b;
        if (cVarArr != null) {
            E.c cVar = cVarArr[0];
            E.c cVar2 = cVarArr[1];
            v0 v0Var = this.f573a;
            if (cVar2 == null) {
                cVar2 = v0Var.f596a.f(2);
            }
            if (cVar == null) {
                cVar = v0Var.f596a.f(1);
            }
            g(E.c.a(cVar, cVar2));
            E.c cVar3 = this.f574b[z1.l.U(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            E.c cVar4 = this.f574b[z1.l.U(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            E.c cVar5 = this.f574b[z1.l.U(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract v0 b();

    public void c(int i, E.c cVar) {
        if (this.f574b == null) {
            this.f574b = new E.c[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f574b[z1.l.U(i2)] = cVar;
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

    public n0(v0 v0Var) {
        this.f573a = v0Var;
    }
}
