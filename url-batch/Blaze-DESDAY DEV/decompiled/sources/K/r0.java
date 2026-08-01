package K;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f512a;

    /* renamed from: b, reason: collision with root package name */
    public C.c[] f513b;

    public r0() {
        this(new z0());
    }

    public final void a() {
        C.c[] cVarArr = this.f513b;
        if (cVarArr != null) {
            C.c cVar = cVarArr[0];
            C.c cVar2 = cVarArr[1];
            z0 z0Var = this.f512a;
            if (cVar2 == null) {
                cVar2 = z0Var.f536a.f(2);
            }
            if (cVar == null) {
                cVar = z0Var.f536a.f(1);
            }
            g(C.c.a(cVar, cVar2));
            C.c cVar3 = this.f513b[z1.d.Q(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            C.c cVar4 = this.f513b[z1.d.Q(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            C.c cVar5 = this.f513b[z1.d.Q(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract z0 b();

    public void c(int i, C.c cVar) {
        if (this.f513b == null) {
            this.f513b = new C.c[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f513b[z1.d.Q(i2)] = cVar;
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

    public r0(z0 z0Var) {
        this.f512a = z0Var;
    }
}
