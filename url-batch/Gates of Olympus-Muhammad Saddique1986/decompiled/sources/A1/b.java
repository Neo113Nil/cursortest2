package A1;

import F.M;
import F.O;
import F.d1;
import G1.m;
import H0.q;
import H0.s;
import I.C0167p;
import O1.u;
import R1.y;
import android.database.sqlite.SQLiteQuery;
import e2.InterfaceC0428g;
import java.util.List;
import s.C0934c;

/* loaded from: classes.dex */
public final class b extends f2.k implements InterfaceC0428g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f200f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Object obj) {
        super(4);
        this.f199e = i3;
        this.f200f = obj;
    }

    @Override // e2.InterfaceC0428g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i3;
        switch (this.f199e) {
            case 0:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                f2.j.c(sQLiteQuery);
                ((z1.c) this.f200f).a(new j(sQLiteQuery));
                break;
            case 1:
                int i4 = ((H0.i) obj3).f2594a;
                int i5 = ((H0.j) obj4).f2595a;
                K0.c cVar = (K0.c) this.f200f;
                s b3 = ((H0.e) cVar.f3233e).b((q) obj, (H0.k) obj2, i4, i5);
                if (!(b3 instanceof s)) {
                    m mVar = new m(b3, cVar.f3238j);
                    cVar.f3238j = mVar;
                    Object obj5 = mVar.f2118d;
                    f2.j.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    break;
                } else {
                    Object obj6 = b3.f2611d;
                    f2.j.d(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    break;
                }
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
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
                    J1.d dVar = (J1.d) ((List) this.f200f).get(intValue);
                    c0167p.Q(-2081110735);
                    d1.c(null, null, d1.f(((M) c0167p.k(O.f1301a)).f1253p, c0167p), null, null, Q.f.b(-1784146067, new u(2, dVar), c0167p), c0167p, 196608, 27);
                    c0167p.p(false);
                }
                break;
            default:
                C0934c c0934c2 = (C0934c) obj;
                ((Number) obj2).intValue();
                C0167p c0167p2 = (C0167p) obj3;
                int intValue3 = ((Number) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c0167p2.f(c0934c2) ? 4 : 2;
                }
                if ((intValue3 & 131) == 130 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    ((Q.a) this.f200f).g(c0934c2, c0167p2, Integer.valueOf(intValue3 & 14));
                }
                break;
        }
        return y.f4171a;
    }
}
