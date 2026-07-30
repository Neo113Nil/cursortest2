package b3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f1342a;

    /* renamed from: b, reason: collision with root package name */
    public v2.c[] f1343b;

    public k0() {
        this(new t0());
    }

    public final void a() {
        v2.c[] cVarArr = this.f1343b;
        if (cVarArr != null) {
            v2.c cVar = cVarArr[0];
            v2.c cVar2 = cVarArr[1];
            t0 t0Var = this.f1342a;
            if (cVar2 == null) {
                cVar2 = t0Var.f1367a.f(2);
            }
            if (cVar == null) {
                cVar = t0Var.f1367a.f(1);
            }
            g(v2.c.a(cVar, cVar2));
            v2.c cVar3 = this.f1343b[a8.d.K(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            v2.c cVar4 = this.f1343b[a8.d.K(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            v2.c cVar5 = this.f1343b[a8.d.K(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract t0 b();

    public void c(int i7, v2.c cVar) {
        if (this.f1343b == null) {
            this.f1343b = new v2.c[9];
        }
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i7 & i8) != 0) {
                this.f1343b[a8.d.K(i8)] = cVar;
            }
        }
    }

    public abstract void e(v2.c cVar);

    public abstract void g(v2.c cVar);

    public k0(t0 t0Var) {
        this.f1342a = t0Var;
    }

    public void d(v2.c cVar) {
    }

    public void f(v2.c cVar) {
    }

    public void h(v2.c cVar) {
    }
}
