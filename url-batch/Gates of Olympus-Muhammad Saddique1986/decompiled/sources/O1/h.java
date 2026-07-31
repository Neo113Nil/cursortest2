package O1;

import F.x1;
import I.C0167p;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class h implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J1.a f3798e;

    public /* synthetic */ h(J1.a aVar, int i3) {
        this.f3797d = i3;
        this.f3798e = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f3797d) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    x1.b(this.f3798e == null ? "New client" : "Edit client", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p, 0, 0, 131070);
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    x1.b(this.f3798e.f3160b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p2, 0, 0, 131070);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
