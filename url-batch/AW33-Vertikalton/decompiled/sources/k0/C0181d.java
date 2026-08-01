package k0;

import android.view.ViewGroup;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181d extends AbstractC0191n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2772a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2773b;

    public C0181d(ViewGroup viewGroup) {
        this.f2773b = viewGroup;
    }

    @Override // k0.AbstractC0191n, k0.InterfaceC0188k
    public final void a() {
        i1.q.j(this.f2773b, false);
    }

    @Override // k0.InterfaceC0188k
    public final void b(AbstractC0190m abstractC0190m) {
        if (!this.f2772a) {
            i1.q.j(this.f2773b, false);
        }
        abstractC0190m.x(this);
    }

    @Override // k0.AbstractC0191n, k0.InterfaceC0188k
    public final void c() {
        i1.q.j(this.f2773b, true);
    }

    @Override // k0.AbstractC0191n, k0.InterfaceC0188k
    public final void e(AbstractC0190m abstractC0190m) {
        i1.q.j(this.f2773b, false);
        this.f2772a = true;
    }
}
