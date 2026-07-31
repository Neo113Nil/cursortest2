package x;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class j0 extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0 f10156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(n0 n0Var, int i3) {
        super(0);
        this.f10155e = i3;
        this.f10156f = n0Var;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f10155e) {
            case 0:
                return Boolean.valueOf(this.f10156f.f10182a.g() > 0.0f);
            default:
                n0 n0Var = this.f10156f;
                return Boolean.valueOf(n0Var.f10182a.g() < n0Var.f10183b.g());
        }
    }
}
