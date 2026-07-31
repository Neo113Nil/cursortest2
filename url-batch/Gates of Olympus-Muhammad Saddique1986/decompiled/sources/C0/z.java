package C0;

import a0.C0238c;
import b0.C0352v;
import b0.P;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import java.util.List;
import r.AbstractC0856c;
import z.C1256t;

/* loaded from: classes.dex */
public final class z extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f682e;

    /* renamed from: f, reason: collision with root package name */
    public static final z f661f = new z(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final z f662g = new z(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final z f663h = new z(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final z f664i = new z(2, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final z f665j = new z(2, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final z f666k = new z(2, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final z f667l = new z(2, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final z f668m = new z(2, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final z f669n = new z(2, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final z f670o = new z(2, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final z f671p = new z(2, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final z f672q = new z(2, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final z f673r = new z(2, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final z f674s = new z(2, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final z f675t = new z(2, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final z f676u = new z(2, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final z f677v = new z(2, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final z f678w = new z(2, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final z f679x = new z(2, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final z f680y = new z(2, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final z f681z = new z(2, 20);

    /* renamed from: A, reason: collision with root package name */
    public static final z f660A = new z(2, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i3, int i4) {
        super(i3);
        this.f682e = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        int i3 = 0;
        switch (this.f682e) {
            case 0:
                R.b bVar = (R.b) obj;
                C0031g c0031g = (C0031g) obj2;
                String str = c0031g.f596a;
                C1256t c1256t = C.f505a;
                List a3 = c0031g.a();
                C1256t c1256t2 = C.f505a;
                Object a4 = C.a(a3, c1256t2, bVar);
                Object obj3 = c0031g.f598c;
                if (obj3 == null) {
                    obj3 = S1.u.f4320d;
                }
                return S1.m.x0(str, a4, C.a(obj3, c1256t2, bVar), C.a(c0031g.f599d, c1256t2, bVar));
            case 1:
                R.b bVar2 = (R.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i3 < size) {
                    arrayList.add(C.a((C0029e) list.get(i3), C.f506b, bVar2));
                    i3++;
                }
                return arrayList;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                R.b bVar3 = (R.b) obj;
                C0029e c0029e = (C0029e) obj2;
                Object obj4 = c0029e.f592a;
                EnumC0033i enumC0033i = obj4 instanceof u ? EnumC0033i.f601d : obj4 instanceof D ? EnumC0033i.f602e : obj4 instanceof M ? EnumC0033i.f603f : obj4 instanceof L ? EnumC0033i.f604g : obj4 instanceof C0036l ? EnumC0033i.f605h : obj4 instanceof C0035k ? EnumC0033i.f606i : EnumC0033i.f607j;
                int ordinal = enumC0033i.ordinal();
                Object obj5 = c0029e.f592a;
                switch (ordinal) {
                    case 0:
                        f2.j.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        obj5 = C.a((u) obj5, C.f511g, bVar3);
                        break;
                    case 1:
                        f2.j.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        obj5 = C.a((D) obj5, C.f512h, bVar3);
                        break;
                    case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                        f2.j.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        obj5 = C.a((M) obj5, C.f507c, bVar3);
                        break;
                    case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                        f2.j.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        obj5 = C.a((L) obj5, C.f508d, bVar3);
                        break;
                    case k1.i.LONG_FIELD_NUMBER /* 4 */:
                        f2.j.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        obj5 = C.a((C0036l) obj5, C.f509e, bVar3);
                        break;
                    case 5:
                        f2.j.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        obj5 = C.a((C0035k) obj5, C.f510f, bVar3);
                        break;
                    case 6:
                        C1256t c1256t3 = C.f505a;
                        break;
                    default:
                        throw new C1.c();
                }
                return S1.m.x0(enumC0033i, obj5, Integer.valueOf(c0029e.f593b), Integer.valueOf(c0029e.f594c), c0029e.f595d);
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                return Float.valueOf(((N0.a) obj2).f3531a);
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                C0035k c0035k = (C0035k) obj2;
                return S1.m.x0(c0035k.f609a, C.a(c0035k.f610b, C.f513i, (R.b) obj));
            case 5:
                long j3 = ((C0352v) obj2).f5441a;
                return j3 == 16 ? Boolean.FALSE : Integer.valueOf(b0.M.D(j3));
            case 6:
                return Integer.valueOf(((H0.k) obj2).f2601d);
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0036l c0036l = (C0036l) obj2;
                return S1.m.x0(c0036l.f611a, C.a(c0036l.f612b, C.f513i, (R.b) obj));
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                R.b bVar4 = (R.b) obj;
                List list2 = ((J0.b) obj2).f3156d;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i3 < size2) {
                    arrayList2.add(C.a((J0.a) list2.get(i3), C.f524t, bVar4));
                    i3++;
                }
                return arrayList2;
            case AbstractC0856c.f8037c /* 9 */:
                return ((J0.a) obj2).f3154a.toLanguageTag();
            case AbstractC0856c.f8039e /* 10 */:
                long j4 = ((C0238c) obj2).f4722a;
                if (C0238c.b(j4, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(C0238c.d(j4));
                C1256t c1256t4 = C.f505a;
                return S1.m.x0(valueOf, Float.valueOf(C0238c.e(j4)));
            case 11:
                R.b bVar5 = (R.b) obj;
                u uVar = (u) obj2;
                N0.i iVar = new N0.i(uVar.f644a);
                C1256t c1256t5 = C.f505a;
                N0.k kVar = new N0.k(uVar.f645b);
                Object a5 = C.a(new O0.m(uVar.f646c), C.f521q, bVar5);
                N0.o oVar = N0.o.f3557c;
                return S1.m.x0(iVar, kVar, a5, C.a(uVar.f647d, C.f516l, bVar5));
            case 12:
                R.b bVar6 = (R.b) obj;
                P p3 = (P) obj2;
                return S1.m.x0(C.a(new C0352v(p3.f5381a), C.f520p, bVar6), C.a(new C0238c(p3.f5382b), C.f522r, bVar6), Float.valueOf(p3.f5383c));
            case 13:
                R.b bVar7 = (R.b) obj;
                D d3 = (D) obj2;
                C0352v c0352v = new C0352v(d3.f525a.b());
                B b3 = C.f520p;
                Object a6 = C.a(c0352v, b3, bVar7);
                O0.m mVar = new O0.m(d3.f526b);
                B b4 = C.f521q;
                Object a7 = C.a(mVar, b4, bVar7);
                H0.k kVar2 = H0.k.f2596e;
                Object a8 = C.a(d3.f527c, C.f517m, bVar7);
                Object a9 = C.a(new O0.m(d3.f532h), b4, bVar7);
                Object a10 = C.a(d3.f533i, C.f518n, bVar7);
                Object a11 = C.a(d3.f534j, C.f515k, bVar7);
                J0.b bVar8 = J0.b.f3155f;
                Object a12 = C.a(d3.f535k, C.f523s, bVar7);
                Object a13 = C.a(new C0352v(d3.f536l), b3, bVar7);
                Object a14 = C.a(d3.f537m, C.f514j, bVar7);
                P p4 = P.f5380d;
                return S1.m.x0(a6, a7, a8, d3.f528d, d3.f529e, -1, d3.f531g, a9, a10, a11, a12, a13, a14, C.a(d3.f538n, C.f519o, bVar7));
            case 14:
                return Integer.valueOf(((N0.j) obj2).f3551a);
            case AbstractC0856c.f8041g /* 15 */:
                N0.n nVar = (N0.n) obj2;
                return S1.m.x0(Float.valueOf(nVar.f3555a), Float.valueOf(nVar.f3556b));
            case 16:
                R.b bVar9 = (R.b) obj;
                N0.o oVar2 = (N0.o) obj2;
                O0.m mVar2 = new O0.m(oVar2.f3558a);
                B b5 = C.f521q;
                return S1.m.x0(C.a(mVar2, b5, bVar9), C.a(new O0.m(oVar2.f3559b), b5, bVar9));
            case 17:
                R.b bVar10 = (R.b) obj;
                I i4 = (I) obj2;
                D d4 = i4.f563a;
                C1256t c1256t6 = C.f512h;
                return S1.m.x0(C.a(d4, c1256t6, bVar10), C.a(i4.f564b, c1256t6, bVar10), C.a(i4.f565c, c1256t6, bVar10), C.a(i4.f566d, c1256t6, bVar10));
            case 18:
                long j5 = ((J) obj2).f569a;
                int i5 = J.f568c;
                Integer valueOf2 = Integer.valueOf((int) (j5 >> 32));
                C1256t c1256t7 = C.f505a;
                return S1.m.x0(valueOf2, Integer.valueOf((int) (j5 & 4294967295L)));
            case 19:
                long j6 = ((O0.m) obj2).f3747a;
                if (O0.m.a(j6, O0.m.f3746c)) {
                    return Boolean.FALSE;
                }
                Float valueOf3 = Float.valueOf(O0.m.c(j6));
                C1256t c1256t8 = C.f505a;
                return S1.m.x0(valueOf3, new O0.n(O0.m.b(j6)));
            case 20:
                String str2 = ((L) obj2).f574a;
                C1256t c1256t9 = C.f505a;
                return str2;
            default:
                String str3 = ((M) obj2).f575a;
                C1256t c1256t10 = C.f505a;
                return str3;
        }
    }
}
