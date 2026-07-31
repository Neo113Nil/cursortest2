package O1;

import I.C0167p;
import e2.InterfaceC0428g;
import java.util.List;
import s.C0934c;

/* loaded from: classes.dex */
public final class y extends f2.k implements InterfaceC0428g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f3879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f3880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(List list, double d3) {
        super(4);
        this.f3879e = list;
        this.f3880f = d3;
    }

    @Override // e2.InterfaceC0428g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i3;
        C0934c c0934c = (C0934c) obj;
        int intValue = ((Number) obj2).intValue();
        C0167p c0167p = (C0167p) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i3 = (c0167p.f(c0934c) ? 4 : 2) | intValue2;
        } else {
            i3 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i3 |= c0167p.d(intValue) ? 32 : 16;
        }
        if ((i3 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            J1.e eVar = (J1.e) this.f3879e.get(intValue);
            c0167p.Q(-1035193734);
            O2.d.h(eVar, this.f3880f, c0167p, 0);
            c0167p.p(false);
        }
        return R1.y.f4171a;
    }
}
