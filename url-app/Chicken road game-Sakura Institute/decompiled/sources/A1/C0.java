package A1;

import G.C0216p;
import kotlin.Unit;
import n.AbstractC0864b;
import z1.AbstractC1365I;
import z1.C1361E;
import z1.C1364H;
import z1.C1369M;

/* loaded from: classes.dex */
public final class C0 extends M2.p implements L2.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q.v f438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0(Q.v vVar, int i2) {
        super(4);
        this.f437d = i2;
        this.f438e = vVar;
    }

    @Override // L2.d
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        int i4;
        int i5;
        switch (this.f437d) {
            case 0:
                r.c cVar = (r.c) obj;
                int intValue = ((Number) obj2).intValue();
                C0216p c0216p = (C0216p) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = (c0216p.f(cVar) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= c0216p.d(intValue) ? 32 : 16;
                }
                if ((i2 & 147) == 146 && c0216p.z()) {
                    c0216p.N();
                } else {
                    C1361E c1361e = (C1361E) this.f438e.get(intValue);
                    c0216p.S(1479595688);
                    AbstractC0864b.f(null, AbstractC1365I.f11807h, O.f.b(1634579083, new B0(0, c1361e), c0216p), c0216p, 384, 1);
                    c0216p.q(false);
                }
                break;
            case 1:
                r.c cVar2 = (r.c) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0216p c0216p2 = (C0216p) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i4 = (c0216p2.f(cVar2) ? 4 : 2) | intValue4;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i4 |= c0216p2.d(intValue3) ? 32 : 16;
                }
                if ((i4 & 147) == 146 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    C1369M c1369m = (C1369M) this.f438e.get(intValue3);
                    c0216p2.S(295370758);
                    AbstractC0864b.f(null, 0L, O.f.b(-76649758, new B0(1, c1369m), c0216p2), c0216p2, 384, 3);
                    c0216p2.q(false);
                }
                break;
            default:
                r.c cVar3 = (r.c) obj;
                int intValue5 = ((Number) obj2).intValue();
                C0216p c0216p3 = (C0216p) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i5 = (c0216p3.f(cVar3) ? 4 : 2) | intValue6;
                } else {
                    i5 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i5 |= c0216p3.d(intValue5) ? 32 : 16;
                }
                if ((i5 & 147) == 146 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    C1364H c1364h = (C1364H) this.f438e.get(intValue5);
                    c0216p3.S(-1399443520);
                    AbstractC0864b.f(null, 0L, O.f.b(1550178294, new B0(2, c1364h), c0216p3), c0216p3, 384, 3);
                    c0216p3.q(false);
                }
                break;
        }
        return Unit.f7487a;
    }
}
