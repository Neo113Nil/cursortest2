package K;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f445a;

    /* renamed from: b, reason: collision with root package name */
    public C.d[] f446b;

    public p0() {
        this(new x0());
    }

    public final void a() {
        C.d[] dVarArr = this.f446b;
        if (dVarArr != null) {
            C.d dVar = dVarArr[0];
            C.d dVar2 = dVarArr[1];
            x0 x0Var = this.f445a;
            if (dVar2 == null) {
                dVar2 = x0Var.f468a.f(2);
            }
            if (dVar == null) {
                dVar = x0Var.f468a.f(1);
            }
            g(C.d.a(dVar, dVar2));
            C.d dVar3 = this.f446b[q1.l.C(16)];
            if (dVar3 != null) {
                f(dVar3);
            }
            C.d dVar4 = this.f446b[q1.l.C(32)];
            if (dVar4 != null) {
                d(dVar4);
            }
            C.d dVar5 = this.f446b[q1.l.C(64)];
            if (dVar5 != null) {
                h(dVar5);
            }
        }
    }

    public abstract x0 b();

    public void c(int i, C.d dVar) {
        if (this.f446b == null) {
            this.f446b = new C.d[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f446b[q1.l.C(i2)] = dVar;
            }
        }
    }

    public void d(C.d dVar) {
    }

    public abstract void e(C.d dVar);

    public void f(C.d dVar) {
    }

    public abstract void g(C.d dVar);

    public void h(C.d dVar) {
    }

    public p0(x0 x0Var) {
        this.f445a = x0Var;
    }
}
