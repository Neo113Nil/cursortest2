package o2;

/* renamed from: o2.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3356u extends AbstractC3363x0 implements InterfaceC3354t {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3358v f42103f;

    public C3356u(InterfaceC3358v interfaceC3358v) {
        this.f42103f = interfaceC3358v;
    }

    @Override // o2.InterfaceC3353s0
    public void a(Throwable th) {
        this.f42103f.c(u());
    }

    @Override // o2.InterfaceC3354t
    public boolean b(Throwable th) {
        return u().M(th);
    }

    @Override // o2.InterfaceC3354t
    public InterfaceC3359v0 getParent() {
        return u();
    }
}
