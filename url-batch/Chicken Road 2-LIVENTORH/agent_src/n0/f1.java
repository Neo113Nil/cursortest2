package n0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f2726a;

    /* renamed from: b, reason: collision with root package name */
    public f0.c[] f2727b;

    public f1() {
        this(new q1());
    }

    public final void a() {
        f0.c[] cVarArr = this.f2727b;
        if (cVarArr != null) {
            f0.c cVar = cVarArr[0];
            f0.c cVar2 = cVarArr[1];
            q1 q1Var = this.f2726a;
            if (cVar2 == null) {
                cVar2 = q1Var.f2775a.f(2);
            }
            if (cVar == null) {
                cVar = q1Var.f2775a.f(1);
            }
            g(f0.c.a(cVar, cVar2));
            f0.c cVar3 = this.f2727b[h.a.M(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            f0.c cVar4 = this.f2727b[h.a.M(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            f0.c cVar5 = this.f2727b[h.a.M(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract q1 b();

    public void c(int i, f0.c cVar) {
        if (this.f2727b == null) {
            this.f2727b = new f0.c[10];
        }
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i & i4) != 0) {
                this.f2727b[h.a.M(i4)] = cVar;
            }
        }
    }

    public abstract void e(f0.c cVar);

    public abstract void g(f0.c cVar);

    public f1(q1 q1Var) {
        this.f2726a = q1Var;
    }

    public void d(f0.c cVar) {
    }

    public void f(f0.c cVar) {
    }

    public void h(f0.c cVar) {
    }
}
