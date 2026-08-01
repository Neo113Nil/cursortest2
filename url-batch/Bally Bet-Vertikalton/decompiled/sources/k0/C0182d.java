package k0;

import android.view.ViewGroup;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182d extends AbstractC0192n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2760a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2761b;

    public C0182d(ViewGroup viewGroup) {
        this.f2761b = viewGroup;
    }

    @Override // k0.AbstractC0192n, k0.InterfaceC0189k
    public final void a() {
        i1.p.j(this.f2761b, false);
    }

    @Override // k0.InterfaceC0189k
    public final void b(AbstractC0191m abstractC0191m) {
        if (!this.f2760a) {
            i1.p.j(this.f2761b, false);
        }
        abstractC0191m.x(this);
    }

    @Override // k0.AbstractC0192n, k0.InterfaceC0189k
    public final void c() {
        i1.p.j(this.f2761b, true);
    }

    @Override // k0.AbstractC0192n, k0.InterfaceC0189k
    public final void e(AbstractC0191m abstractC0191m) {
        i1.p.j(this.f2761b, false);
        this.f2760a = true;
    }
}
