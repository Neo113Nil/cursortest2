package x;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class V extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z f10010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(Z z3, int i3) {
        super(0);
        this.f10009e = i3;
        this.f10010f = z3;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f10009e) {
            case 0:
                this.f10010f.a();
                break;
            default:
                this.f10010f.onCancel();
                break;
        }
        return R1.y.f4171a;
    }
}
