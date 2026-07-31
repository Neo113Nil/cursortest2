package M1;

import F.AbstractC0119s0;
import F.x1;
import I.C0167p;
import R1.y;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class e implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f3472e;

    public /* synthetic */ e(a aVar, int i3) {
        this.f3471d = i3;
        this.f3472e = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f3471d) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    a aVar = this.f3472e;
                    AbstractC0119s0.a(aVar.f3464f, aVar.f3463e, null, 0L, c0167p, 0, 12);
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    x1.b(this.f3472e.f3463e, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p2, 0, 0, 131070);
                }
                break;
        }
        return y.f4171a;
    }
}
