package s1;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0318a extends U implements b1.d, InterfaceC0334q {

    /* renamed from: c, reason: collision with root package name */
    public final b1.j f4033c;

    public AbstractC0318a(b1.j jVar, boolean z2) {
        super(z2);
        A((M) jVar.p(C0333p.f4061b));
        this.f4033c = jVar.j(this);
    }

    @Override // s1.U
    public final void F(Object obj) {
        if (obj instanceof C0327j) {
            C0327j c0327j = (C0327j) obj;
            Throwable th = c0327j.f4051a;
            c0327j.getClass();
            C0327j.f4050b.get(c0327j);
        }
    }

    @Override // b1.d
    public final void b(Object obj) {
        Throwable a2 = X0.e.a(obj);
        if (a2 != null) {
            obj = new C0327j(a2, false);
        }
        Object C2 = C(obj);
        if (C2 == AbstractC0335s.f4064c) {
            return;
        }
        i(C2);
    }

    @Override // s1.InterfaceC0334q
    public final b1.j c() {
        return this.f4033c;
    }

    @Override // b1.d
    public final b1.j h() {
        return this.f4033c;
    }

    @Override // s1.U
    public final String o() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // s1.U
    public final void z(X0.b bVar) {
        AbstractC0335s.d(this.f4033c, bVar);
    }
}
