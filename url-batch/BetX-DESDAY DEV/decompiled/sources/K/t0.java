package K;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final B0 f499a;

    /* renamed from: b, reason: collision with root package name */
    public C.d[] f500b;

    public t0() {
        this(new B0());
    }

    public final void a() {
        C.d[] dVarArr = this.f500b;
        if (dVarArr != null) {
            C.d dVar = dVarArr[0];
            C.d dVar2 = dVarArr[1];
            B0 b02 = this.f499a;
            if (dVar2 == null) {
                dVar2 = b02.f396a.f(2);
            }
            if (dVar == null) {
                dVar = b02.f396a.f(1);
            }
            g(C.d.a(dVar, dVar2));
            C.d dVar3 = this.f500b[q1.d.H(16)];
            if (dVar3 != null) {
                f(dVar3);
            }
            C.d dVar4 = this.f500b[q1.d.H(32)];
            if (dVar4 != null) {
                d(dVar4);
            }
            C.d dVar5 = this.f500b[q1.d.H(64)];
            if (dVar5 != null) {
                h(dVar5);
            }
        }
    }

    public abstract B0 b();

    public void c(int i, C.d dVar) {
        if (this.f500b == null) {
            this.f500b = new C.d[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f500b[q1.d.H(i2)] = dVar;
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

    public t0(B0 b02) {
        this.f499a = b02;
    }
}
