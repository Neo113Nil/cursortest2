package a1;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public final Q f3523a;

    /* renamed from: b, reason: collision with root package name */
    public V0.c[] f3524b;

    public I() {
        this(new Q());
    }

    public final void a() {
        V0.c[] cVarArr = this.f3524b;
        if (cVarArr != null) {
            V0.c cVar = cVarArr[0];
            V0.c cVar2 = cVarArr[1];
            Q q2 = this.f3523a;
            if (cVar2 == null) {
                cVar2 = q2.f3542a.f(2);
            }
            if (cVar == null) {
                cVar = q2.f3542a.f(1);
            }
            g(V0.c.a(cVar, cVar2));
            V0.c cVar3 = this.f3524b[M1.B.E(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            V0.c cVar4 = this.f3524b[M1.B.E(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            V0.c cVar5 = this.f3524b[M1.B.E(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract Q b();

    public void c(int i3, V0.c cVar) {
        if (this.f3524b == null) {
            this.f3524b = new V0.c[9];
        }
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                this.f3524b[M1.B.E(i4)] = cVar;
            }
        }
    }

    public abstract void e(V0.c cVar);

    public abstract void g(V0.c cVar);

    public I(Q q2) {
        this.f3523a = q2;
    }

    public void d(V0.c cVar) {
    }

    public void f(V0.c cVar) {
    }

    public void h(V0.c cVar) {
    }
}
