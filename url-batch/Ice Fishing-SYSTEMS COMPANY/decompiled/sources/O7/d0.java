package O7;

import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public final class d0 extends C0382g {

    /* renamed from: B, reason: collision with root package name */
    public final C0388m f2585B;

    public d0(InterfaceC5133d interfaceC5133d, C0388m c0388m) {
        super(1, interfaceC5133d);
        this.f2585B = c0388m;
    }

    @Override // O7.C0382g
    public final Throwable p(h0 h0Var) {
        Throwable b9;
        Object C7 = this.f2585B.C();
        return (!(C7 instanceof f0) || (b9 = ((f0) C7).b()) == null) ? C7 instanceof C0391p ? ((C0391p) C7).f2619a : h0Var.w() : b9;
    }

    @Override // O7.C0382g
    public final String x() {
        return "AwaitContinuation";
    }
}
