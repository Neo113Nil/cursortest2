package n;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class x0 extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0 f7224f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, int i3) {
        super(0);
        this.f7223e = i3;
        this.f7224f = y0Var;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f7223e) {
            case 0:
                return Boolean.valueOf(this.f7224f.f7242a.g() > 0);
            default:
                y0 y0Var = this.f7224f;
                return Boolean.valueOf(y0Var.f7242a.g() < y0Var.f7245d.g());
        }
    }
}
