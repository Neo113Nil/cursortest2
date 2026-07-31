package q2;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class H extends b0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7853h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7854i;

    public /* synthetic */ H(int i3, Object obj) {
        this.f7853h = i3;
        this.f7854i = obj;
    }

    @Override // q2.b0
    public final boolean k() {
        switch (this.f7853h) {
        }
        return false;
    }

    @Override // q2.b0
    public final void l(Throwable th) {
        switch (this.f7853h) {
            case 0:
                ((G) this.f7854i).a();
                break;
            case 1:
                ((InterfaceC0424c) this.f7854i).n(th);
                break;
            default:
                Object obj = f0.f7895d.get(j());
                boolean z3 = obj instanceof C0829p;
                c0 c0Var = (c0) this.f7854i;
                if (!z3) {
                    c0Var.u(AbstractC0837y.x(obj));
                    break;
                } else {
                    c0Var.u(R1.a.b(((C0829p) obj).f7917a));
                    break;
                }
        }
    }
}
