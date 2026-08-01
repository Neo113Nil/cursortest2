package o1;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0282a extends U implements X0.d, InterfaceC0298q {

    /* renamed from: c, reason: collision with root package name */
    public final X0.i f3330c;

    public AbstractC0282a(X0.i iVar, boolean z2) {
        super(z2);
        z((M) iVar.j(C0297p.f3358b));
        this.f3330c = iVar.k(this);
    }

    @Override // o1.U
    public final void E(Object obj) {
        if (obj instanceof C0291j) {
            C0291j c0291j = (C0291j) obj;
            Throwable th = c0291j.f3348a;
            c0291j.getClass();
            C0291j.f3347b.get(c0291j);
        }
    }

    @Override // X0.d
    public final void b(Object obj) {
        Throwable a2 = U0.f.a(obj);
        if (a2 != null) {
            obj = new C0291j(a2, false);
        }
        Object B2 = B(obj);
        if (B2 == AbstractC0299s.f3361c) {
            return;
        }
        g(B2);
    }

    @Override // o1.InterfaceC0298q
    public final X0.i c() {
        return this.f3330c;
    }

    @Override // X0.d
    public final X0.i h() {
        return this.f3330c;
    }

    @Override // o1.U
    public final String m() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // o1.U
    public final void y(U0.c cVar) {
        AbstractC0299s.e(this.f3330c, cVar);
    }
}
