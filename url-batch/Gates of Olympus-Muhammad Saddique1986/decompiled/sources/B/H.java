package B;

import e2.InterfaceC0422a;
import m.C0628m;

/* loaded from: classes.dex */
public final class H extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0628m f286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(C0628m c0628m, int i3) {
        super(0);
        this.f285e = i3;
        this.f286f = c0628m;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f285e) {
            case 0:
                break;
            case 1:
                this.f286f.f6853i = false;
                break;
            default:
                this.f286f.f6853i = false;
                break;
        }
        return R1.y.f4171a;
    }
}
