package O1;

import F.M;
import F.O;
import F.d1;
import I.C0167p;
import e2.InterfaceC0428g;
import java.util.List;
import s.C0934c;

/* loaded from: classes.dex */
public final class E extends f2.k implements InterfaceC0428g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f3773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q1.j f3774f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(List list, Q1.j jVar) {
        super(4);
        this.f3773e = list;
        this.f3774f = jVar;
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
            J1.d dVar = (J1.d) this.f3773e.get(intValue);
            c0167p.Q(-752390147);
            d1.c(null, null, d1.f(((M) c0167p.k(O.f1301a)).f1253p, c0167p), null, null, Q.f.b(1026645527, new M1.f(dVar, 4, this.f3774f), c0167p), c0167p, 196608, 27);
            c0167p.p(false);
        }
        return R1.y.f4171a;
    }
}
