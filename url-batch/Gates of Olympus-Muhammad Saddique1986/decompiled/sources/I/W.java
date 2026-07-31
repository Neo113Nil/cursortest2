package I;

import t2.C1045P;
import u2.AbstractC1151c;

/* loaded from: classes.dex */
public final class W implements V1.h, M0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ W f2779e = new W(0);

    /* renamed from: f, reason: collision with root package name */
    public static final W f2780f = new W(1);

    /* renamed from: g, reason: collision with root package name */
    public static final W f2781g = new W(2);

    /* renamed from: h, reason: collision with root package name */
    public static final W f2782h = new W(3);

    /* renamed from: i, reason: collision with root package name */
    public static final W f2783i = new W(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2784d;

    public /* synthetic */ W(int i3) {
        this.f2784d = i3;
    }

    public static final void b(W w2) {
        C1045P c1045p;
        Object obj;
        O.b bVar;
        C1045P c1045p2 = C0187z0.f2982v;
        do {
            c1045p = C0187z0.f2982v;
            obj = (L.b) c1045p.getValue();
            bVar = (O.b) obj;
            N.c cVar = bVar.f3720f;
            O.a aVar = (O.a) cVar.get(w2);
            if (aVar != null) {
                int hashCode = w2 != null ? w2.hashCode() : 0;
                N.m mVar = cVar.f3503d;
                N.m v3 = mVar.v(hashCode, w2, 0);
                if (mVar != v3) {
                    cVar = v3 == null ? N.c.f3502f : new N.c(v3, cVar.f3504e - 1);
                }
                P.b bVar2 = P.b.f3913a;
                Object obj2 = aVar.f3715a;
                boolean z3 = obj2 != bVar2;
                Object obj3 = aVar.f3716b;
                if (z3) {
                    Object obj4 = cVar.get(obj2);
                    f2.j.c(obj4);
                    cVar = cVar.a(obj2, new O.a(((O.a) obj4).f3715a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = cVar.get(obj3);
                    f2.j.c(obj5);
                    cVar = cVar.a(obj3, new O.a(obj2, ((O.a) obj5).f3716b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.f3718d : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.f3719e;
                }
                bVar = new O.b(obj6, obj2, cVar);
            }
            if (obj == bVar) {
                return;
            }
            Object obj7 = AbstractC1151c.f9682b;
            if (obj == null) {
                obj = obj7;
            }
        } while (!c1045p.l(obj, bVar));
    }

    @Override // I.M0
    public boolean a(Object obj, Object obj2) {
        switch (this.f2784d) {
            case 1:
                return false;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return obj == obj2;
            default:
                return f2.j.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f2784d) {
            case 1:
                return "NeverEqualPolicy";
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return "ReferentialEqualityPolicy";
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                return super.toString();
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return "StructuralEqualityPolicy";
            case 5:
                return "Empty";
        }
    }
}
