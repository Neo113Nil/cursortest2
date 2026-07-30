package q2;

import k2.AbstractC4632c;

/* loaded from: classes.dex */
public final class b1 extends AbstractBinderC4920w {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC4632c f40001n;

    public b1(AbstractC4632c abstractC4632c) {
        this.f40001n = abstractC4632c;
    }

    @Override // q2.InterfaceC4922x
    public final void e() {
        AbstractC4632c abstractC4632c = this.f40001n;
        if (abstractC4632c != null) {
            abstractC4632c.onAdOpened();
        }
    }

    @Override // q2.InterfaceC4922x
    public final void f() {
        AbstractC4632c abstractC4632c = this.f40001n;
        if (abstractC4632c != null) {
            abstractC4632c.onAdLoaded();
        }
    }

    @Override // q2.InterfaceC4922x
    public final void g() {
        AbstractC4632c abstractC4632c = this.f40001n;
        if (abstractC4632c != null) {
            abstractC4632c.onAdClicked();
        }
    }

    @Override // q2.InterfaceC4922x
    public final void h() {
        AbstractC4632c abstractC4632c = this.f40001n;
        if (abstractC4632c != null) {
            abstractC4632c.onAdImpression();
        }
    }

    @Override // q2.InterfaceC4922x
    public final void h0(C4927z0 c4927z0) {
        AbstractC4632c abstractC4632c = this.f40001n;
        if (abstractC4632c != null) {
            abstractC4632c.onAdFailedToLoad(c4927z0.b());
        }
    }

    @Override // q2.InterfaceC4922x
    public final void l() {
        AbstractC4632c abstractC4632c = this.f40001n;
        if (abstractC4632c != null) {
            abstractC4632c.onAdSwipeGestureClicked();
        }
    }

    @Override // q2.InterfaceC4922x
    public final void z() {
        AbstractC4632c abstractC4632c = this.f40001n;
        if (abstractC4632c != null) {
            abstractC4632c.onAdClosed();
        }
    }

    @Override // q2.InterfaceC4922x
    public final void c() {
    }

    @Override // q2.InterfaceC4922x
    public final void D(int i) {
    }
}
