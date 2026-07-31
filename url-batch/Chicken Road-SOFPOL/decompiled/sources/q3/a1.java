package q3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f6073a;

    /* renamed from: b, reason: collision with root package name */
    public i3.c[] f6074b;

    public a1() {
        this(new l1());
    }

    public final void a() {
        i3.c[] cVarArr = this.f6074b;
        if (cVarArr != null) {
            i3.c cVar = cVarArr[0];
            i3.c cVar2 = cVarArr[1];
            l1 l1Var = this.f6073a;
            if (cVar2 == null) {
                cVar2 = l1Var.f6127a.f(2);
            }
            if (cVar == null) {
                cVar = l1Var.f6127a.f(1);
            }
            g(i3.c.a(cVar, cVar2));
            i3.c cVar3 = this.f6074b[h0.a.K(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            i3.c cVar4 = this.f6074b[h0.a.K(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            i3.c cVar5 = this.f6074b[h0.a.K(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract l1 b();

    public void c(int i, i3.c cVar) {
        if (this.f6074b == null) {
            this.f6074b = new i3.c[10];
        }
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i & i8) != 0) {
                this.f6074b[h0.a.K(i8)] = cVar;
            }
        }
    }

    public abstract void e(i3.c cVar);

    public abstract void g(i3.c cVar);

    public a1(l1 l1Var) {
        this.f6073a = l1Var;
    }

    public void d(i3.c cVar) {
    }

    public void f(i3.c cVar) {
    }

    public void h(i3.c cVar) {
    }
}
