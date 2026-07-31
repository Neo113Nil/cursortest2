package c1;

import h2.AbstractC0508a;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public final U f5569a;

    /* renamed from: b, reason: collision with root package name */
    public X0.c[] f5570b;

    public K() {
        this(new U());
    }

    public final void a() {
        X0.c[] cVarArr = this.f5570b;
        if (cVarArr != null) {
            X0.c cVar = cVarArr[0];
            X0.c cVar2 = cVarArr[1];
            U u3 = this.f5569a;
            if (cVar2 == null) {
                cVar2 = u3.f5589a.f(2);
            }
            if (cVar == null) {
                cVar = u3.f5589a.f(1);
            }
            g(X0.c.a(cVar, cVar2));
            X0.c cVar3 = this.f5570b[AbstractC0508a.H(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            X0.c cVar4 = this.f5570b[AbstractC0508a.H(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            X0.c cVar5 = this.f5570b[AbstractC0508a.H(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract U b();

    public void c(int i3, X0.c cVar) {
        if (this.f5570b == null) {
            this.f5570b = new X0.c[9];
        }
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                this.f5570b[AbstractC0508a.H(i4)] = cVar;
            }
        }
    }

    public abstract void e(X0.c cVar);

    public abstract void g(X0.c cVar);

    public K(U u3) {
        this.f5569a = u3;
    }

    public void d(X0.c cVar) {
    }

    public void f(X0.c cVar) {
    }

    public void h(X0.c cVar) {
    }
}
