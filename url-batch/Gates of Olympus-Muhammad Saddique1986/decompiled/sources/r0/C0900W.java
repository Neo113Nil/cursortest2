package r0;

import e2.InterfaceC0426e;

/* renamed from: r0.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900W extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0901X f8141f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0900W(C0901X c0901x, int i3) {
        super(2);
        this.f8140e = i3;
        this.f8141f = c0901x;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f8140e) {
            case 0:
                this.f8141f.a().f8101e = (I.r) obj2;
                break;
            case 1:
                C0881C a3 = this.f8141f.a();
                ((t0.E) obj).Y(new C0928y(a3, (InterfaceC0426e) obj2, a3.f8115s));
                break;
            default:
                t0.E e3 = (t0.E) obj;
                C0881C c0881c = e3.f8533A;
                C0901X c0901x = this.f8141f;
                if (c0881c == null) {
                    c0881c = new C0881C(e3, c0901x.f8142a);
                    e3.f8533A = c0881c;
                }
                c0901x.f8143b = c0881c;
                c0901x.a().e();
                C0881C a4 = c0901x.a();
                a0 a0Var = a4.f8102f;
                a0 a0Var2 = c0901x.f8142a;
                if (a0Var != a0Var2) {
                    a4.f8102f = a0Var2;
                    a4.f(false);
                    t0.E.T(a4.f8100d, false, 7);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
