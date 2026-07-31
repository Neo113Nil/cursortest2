package I;

import h1.C0438i;
import n2.C0692Q;

/* loaded from: classes.dex */
public final class X implements P1.h, N0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ X f2224e = new X(0);

    /* renamed from: f, reason: collision with root package name */
    public static final X f2225f = new X(1);

    /* renamed from: g, reason: collision with root package name */
    public static final X f2226g = new X(2);

    /* renamed from: h, reason: collision with root package name */
    public static final X f2227h = new X(3);

    /* renamed from: i, reason: collision with root package name */
    public static final X f2228i = new X(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2229d;

    public /* synthetic */ X(int i3) {
        this.f2229d = i3;
    }

    public static final void b(X x3) {
        C0692Q c0692q;
        L.b bVar;
        O.b bVar2;
        C0692Q c0692q2 = A0.f2058v;
        do {
            c0692q = A0.f2058v;
            bVar = (L.b) c0692q.getValue();
            bVar2 = (O.b) bVar;
            N.c cVar = bVar2.f2981f;
            O.a aVar = (O.a) cVar.get(x3);
            if (aVar != null) {
                int hashCode = x3 != null ? x3.hashCode() : 0;
                N.m mVar = cVar.f2821d;
                N.m v3 = mVar.v(hashCode, x3, 0);
                if (mVar != v3) {
                    cVar = v3 == null ? N.c.f2820f : new N.c(v3, cVar.f2822e - 1);
                }
                P.b bVar3 = P.b.f3020a;
                Object obj = aVar.f2976a;
                boolean z3 = obj != bVar3;
                Object obj2 = aVar.f2977b;
                if (z3) {
                    Object obj3 = cVar.get(obj);
                    Z1.i.c(obj3);
                    cVar = cVar.a(obj, new O.a(((O.a) obj3).f2976a, obj2));
                }
                if (obj2 != bVar3) {
                    Object obj4 = cVar.get(obj2);
                    Z1.i.c(obj4);
                    cVar = cVar.a(obj2, new O.a(obj, ((O.a) obj4).f2977b));
                }
                Object obj5 = obj != bVar3 ? bVar2.f2979d : obj2;
                if (obj2 != bVar3) {
                    obj = bVar2.f2980e;
                }
                bVar2 = new O.b(obj5, obj, cVar);
            }
            if (bVar == bVar2) {
                return;
            }
        } while (!c0692q.i(bVar, bVar2));
    }

    @Override // I.N0
    public boolean a(Object obj, Object obj2) {
        switch (this.f2229d) {
            case 1:
                return false;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return obj == obj2;
            default:
                return Z1.i.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f2229d) {
            case 1:
                return "NeverEqualPolicy";
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return "ReferentialEqualityPolicy";
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                return super.toString();
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return "StructuralEqualityPolicy";
            case 5:
                return "Empty";
        }
    }
}
