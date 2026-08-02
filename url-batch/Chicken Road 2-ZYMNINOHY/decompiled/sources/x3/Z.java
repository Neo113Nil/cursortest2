package x3;

import f3.InterfaceC0425c;

/* loaded from: classes.dex */
public final class Z extends C1546f {

    /* renamed from: i, reason: collision with root package name */
    public final C1552l f16011i;

    public Z(InterfaceC0425c interfaceC0425c, C1552l c1552l) {
        super(1, interfaceC0425c);
        this.f16011i = c1552l;
    }

    @Override // x3.C1546f
    public final Throwable p(d0 d0Var) {
        Throwable d4;
        Object A4 = this.f16011i.A();
        return (!(A4 instanceof b0) || (d4 = ((b0) A4).d()) == null) ? A4 instanceof C1554n ? ((C1554n) A4).f16048a : d0Var.w() : d4;
    }

    @Override // x3.C1546f
    public final String w() {
        return "AwaitContinuation";
    }
}
