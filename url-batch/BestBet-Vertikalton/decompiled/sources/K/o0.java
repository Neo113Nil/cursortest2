package K;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f643a;

    /* renamed from: b, reason: collision with root package name */
    public C.d[] f644b;

    public o0() {
        this(new w0());
    }

    public final void a() {
        C.d[] dVarArr = this.f644b;
        if (dVarArr != null) {
            C.d dVar = dVarArr[0];
            C.d dVar2 = dVarArr[1];
            w0 w0Var = this.f643a;
            if (dVar2 == null) {
                dVar2 = w0Var.f668a.f(2);
            }
            if (dVar == null) {
                dVar = w0Var.f668a.f(1);
            }
            g(C.d.a(dVar, dVar2));
            C.d dVar3 = this.f644b[H1.l.K(16)];
            if (dVar3 != null) {
                f(dVar3);
            }
            C.d dVar4 = this.f644b[H1.l.K(32)];
            if (dVar4 != null) {
                d(dVar4);
            }
            C.d dVar5 = this.f644b[H1.l.K(64)];
            if (dVar5 != null) {
                h(dVar5);
            }
        }
    }

    public abstract w0 b();

    public void c(int i, C.d dVar) {
        if (this.f644b == null) {
            this.f644b = new C.d[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f644b[H1.l.K(i2)] = dVar;
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

    public o0(w0 w0Var) {
        this.f643a = w0Var;
    }
}
