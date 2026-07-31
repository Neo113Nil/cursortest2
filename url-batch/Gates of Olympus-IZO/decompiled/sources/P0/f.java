package P0;

import I.C0113p;
import I.InterfaceC0088c0;
import L1.z;

/* loaded from: classes.dex */
public final class f extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f3037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(InterfaceC0088c0 interfaceC0088c0, int i3) {
        super(2);
        this.f3036e = i3;
        this.f3037f = interfaceC0088c0;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f3036e) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    ((Y1.e) this.f3037f.getValue()).g(c0113p, 0);
                }
                break;
            default:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    I2.d.j(z0.k.a(U.i.f3302a, e.f3035e), Q.f.b(-533674951, new f(this.f3037f, 0), c0113p2), c0113p2, 48);
                }
                break;
        }
        return z.f2729a;
    }
}
