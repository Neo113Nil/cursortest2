package H5;

import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public final class c0 extends C0147g {

    /* renamed from: n, reason: collision with root package name */
    public final C0153m f1059n;

    public c0(InterfaceC0564d interfaceC0564d, C0153m c0153m) {
        super(1, interfaceC0564d);
        this.f1059n = c0153m;
    }

    @Override // H5.C0147g
    public final Throwable p(g0 g0Var) {
        Throwable c7;
        Object C6 = this.f1059n.C();
        return (!(C6 instanceof e0) || (c7 = ((e0) C6).c()) == null) ? C6 instanceof C0156p ? ((C0156p) C6).f1093a : g0Var.w() : c7;
    }

    @Override // H5.C0147g
    public final String x() {
        return "AwaitContinuation";
    }
}
