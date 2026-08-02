package E;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public final W f251a;

    /* renamed from: b, reason: collision with root package name */
    public x.b[] f252b;

    public K() {
        this(new W());
    }

    public final void a() {
        x.b[] bVarArr = this.f252b;
        if (bVarArr != null) {
            x.b bVar = bVarArr[0];
            x.b bVar2 = bVarArr[1];
            W w3 = this.f251a;
            if (bVar2 == null) {
                bVar2 = w3.f270a.f(2);
            }
            if (bVar == null) {
                bVar = w3.f270a.f(1);
            }
            f(x.b.a(bVar, bVar2));
            x.b bVar3 = this.f252b[S0.a.u(16)];
            if (bVar3 != null) {
                e(bVar3);
            }
            x.b bVar4 = this.f252b[S0.a.u(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            x.b bVar5 = this.f252b[S0.a.u(64)];
            if (bVar5 != null) {
                g(bVar5);
            }
        }
    }

    public abstract W b();

    public void c(int i3, x.b bVar) {
        if (this.f252b == null) {
            this.f252b = new x.b[10];
        }
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                this.f252b[S0.a.u(i4)] = bVar;
            }
        }
    }

    public abstract void f(x.b bVar);

    public K(W w3) {
        this.f251a = w3;
    }

    public void d(x.b bVar) {
    }

    public void e(x.b bVar) {
    }

    public void g(x.b bVar) {
    }
}
