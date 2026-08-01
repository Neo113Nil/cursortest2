package r1;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0351a extends V implements a1.d, r {

    /* renamed from: c, reason: collision with root package name */
    public final a1.i f4063c;

    public AbstractC0351a(a1.i iVar, boolean z2) {
        super(z2);
        v((N) iVar.d(C0367q.f4090b));
        this.f4063c = iVar.B(this);
    }

    @Override // r1.V
    public final void C(Object obj) {
        if (obj instanceof C0361k) {
            C0361k c0361k = (C0361k) obj;
            Throwable th = c0361k.f4079a;
            c0361k.getClass();
            C0361k.f4078b.get(c0361k);
        }
    }

    @Override // r1.r
    public final a1.i b() {
        return this.f4063c;
    }

    @Override // a1.d
    public final a1.i getContext() {
        return this.f4063c;
    }

    @Override // r1.V
    public final String j() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // a1.d
    public final void resumeWith(Object obj) {
        Throwable a2 = W0.f.a(obj);
        if (a2 != null) {
            obj = new C0361k(a2, false);
        }
        Object x2 = x(obj);
        if (x2 == AbstractC0369t.f4094d) {
            return;
        }
        f(x2);
    }

    @Override // r1.V
    public final void u(W0.c cVar) {
        AbstractC0369t.e(this.f4063c, cVar);
    }
}
