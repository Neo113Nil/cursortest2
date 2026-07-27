package a1;

/* renamed from: a1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0374J {

    /* renamed from: a, reason: collision with root package name */
    public final C0383T f4851a;

    /* renamed from: b, reason: collision with root package name */
    public V0.c[] f4852b;

    public AbstractC0374J() {
        this(new C0383T());
    }

    public final void a() {
        V0.c[] cVarArr = this.f4852b;
        if (cVarArr != null) {
            V0.c cVar = cVarArr[0];
            V0.c cVar2 = cVarArr[1];
            C0383T c0383t = this.f4851a;
            if (cVar2 == null) {
                cVar2 = c0383t.f4871a.f(2);
            }
            if (cVar == null) {
                cVar = c0383t.f4871a.f(1);
            }
            g(V0.c.a(cVar, cVar2));
            V0.c cVar3 = this.f4852b[M1.a.G(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            V0.c cVar4 = this.f4852b[M1.a.G(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            V0.c cVar5 = this.f4852b[M1.a.G(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract C0383T b();

    public void c(int i2, V0.c cVar) {
        if (this.f4852b == null) {
            this.f4852b = new V0.c[9];
        }
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i2 & i4) != 0) {
                this.f4852b[M1.a.G(i4)] = cVar;
            }
        }
    }

    public void d(V0.c cVar) {
    }

    public abstract void e(V0.c cVar);

    public void f(V0.c cVar) {
    }

    public abstract void g(V0.c cVar);

    public void h(V0.c cVar) {
    }

    public AbstractC0374J(C0383T c0383t) {
        this.f4851a = c0383t;
    }
}
