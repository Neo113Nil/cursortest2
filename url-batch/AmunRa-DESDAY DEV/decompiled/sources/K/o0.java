package K;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f426a;

    /* renamed from: b, reason: collision with root package name */
    public C.c[] f427b;

    public o0() {
        this(new w0());
    }

    public final void a() {
        C.c[] cVarArr = this.f427b;
        if (cVarArr != null) {
            C.c cVar = cVarArr[0];
            C.c cVar2 = cVarArr[1];
            w0 w0Var = this.f426a;
            if (cVar2 == null) {
                cVar2 = w0Var.f449a.f(2);
            }
            if (cVar == null) {
                cVar = w0Var.f449a.f(1);
            }
            g(C.c.a(cVar, cVar2));
            C.c cVar3 = this.f427b[s1.d.M(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            C.c cVar4 = this.f427b[s1.d.M(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            C.c cVar5 = this.f427b[s1.d.M(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract w0 b();

    public void c(int i, C.c cVar) {
        if (this.f427b == null) {
            this.f427b = new C.c[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f427b[s1.d.M(i2)] = cVar;
            }
        }
    }

    public void d(C.c cVar) {
    }

    public abstract void e(C.c cVar);

    public void f(C.c cVar) {
    }

    public abstract void g(C.c cVar);

    public void h(C.c cVar) {
    }

    public o0(w0 w0Var) {
        this.f426a = w0Var;
    }
}
