package O1;

import F.d1;
import I.C0167p;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class g implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f3796e;

    public /* synthetic */ g(InterfaceC0422a interfaceC0422a, int i3) {
        this.f3795d = i3;
        this.f3796e = interfaceC0422a;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f3795d) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    d1.e(this.f3796e, null, false, null, null, null, null, null, null, p.f3846f, c0167p, 805306368, 510);
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    d1.e(this.f3796e, null, false, null, null, null, null, null, null, s.f3858e, c0167p2, 805306368, 510);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
