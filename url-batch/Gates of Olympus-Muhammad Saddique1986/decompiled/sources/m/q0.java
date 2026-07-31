package m;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class q0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f6875f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(l0 l0Var, int i3) {
        super(1);
        this.f6874e = i3;
        this.f6875f = l0Var;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f6874e) {
            case 0:
                return new p0(this.f6875f, 0);
            default:
                return new p0(this.f6875f, 1);
        }
    }
}
