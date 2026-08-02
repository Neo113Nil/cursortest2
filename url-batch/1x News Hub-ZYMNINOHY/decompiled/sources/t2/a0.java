package t2;

import d2.InterfaceC0300c;

/* loaded from: classes.dex */
public final class a0 extends C1196f {

    /* renamed from: i, reason: collision with root package name */
    public final e0 f10397i;

    public a0(InterfaceC0300c interfaceC0300c, e0 e0Var) {
        super(1, interfaceC0300c);
        this.f10397i = e0Var;
    }

    @Override // t2.C1196f
    public final Throwable r(e0 e0Var) {
        Throwable c3;
        Object D3 = this.f10397i.D();
        return (!(D3 instanceof c0) || (c3 = ((c0) D3).c()) == null) ? D3 instanceof C1204n ? ((C1204n) D3).f10431a : e0Var.z() : c3;
    }

    @Override // t2.C1196f
    public final String y() {
        return "AwaitContinuation";
    }
}
