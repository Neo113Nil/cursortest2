package k0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f2716a;

    /* renamed from: b, reason: collision with root package name */
    public c0.c[] f2717b;

    public b1() {
        this(new m1());
    }

    public final void a() {
        c0.c[] cVarArr = this.f2717b;
        if (cVarArr != null) {
            c0.c cVar = cVarArr[0];
            c0.c cVar2 = cVarArr[1];
            m1 m1Var = this.f2716a;
            if (cVar2 == null) {
                cVar2 = m1Var.f2760a.f(2);
            }
            if (cVar == null) {
                cVar = m1Var.f2760a.f(1);
            }
            g(c0.c.a(cVar, cVar2));
            c0.c cVar3 = this.f2717b[k3.m.B(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            c0.c cVar4 = this.f2717b[k3.m.B(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            c0.c cVar5 = this.f2717b[k3.m.B(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract m1 b();

    public void c(int i4, c0.c cVar) {
        if (this.f2717b == null) {
            this.f2717b = new c0.c[10];
        }
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                this.f2717b[k3.m.B(i5)] = cVar;
            }
        }
    }

    public abstract void e(c0.c cVar);

    public abstract void g(c0.c cVar);

    public b1(m1 m1Var) {
        this.f2716a = m1Var;
    }

    public void d(c0.c cVar) {
    }

    public void f(c0.c cVar) {
    }

    public void h(c0.c cVar) {
    }
}
