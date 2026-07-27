package A0;

import Z.C0323u;
import Z.O;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import y2.C1338m;
import z2.C1405I;
import z2.C1441y;

/* loaded from: classes.dex */
public final class z extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f413d;

    /* renamed from: e, reason: collision with root package name */
    public static final z f394e = new z(2, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final z f395i = new z(2, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final z f396j = new z(2, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final z f397k = new z(2, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final z f398l = new z(2, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final z f399m = new z(2, 5);

    /* renamed from: n, reason: collision with root package name */
    public static final z f400n = new z(2, 6);

    /* renamed from: o, reason: collision with root package name */
    public static final z f401o = new z(2, 7);

    /* renamed from: p, reason: collision with root package name */
    public static final z f402p = new z(2, 8);

    /* renamed from: q, reason: collision with root package name */
    public static final z f403q = new z(2, 9);

    /* renamed from: r, reason: collision with root package name */
    public static final z f404r = new z(2, 10);

    /* renamed from: s, reason: collision with root package name */
    public static final z f405s = new z(2, 11);

    /* renamed from: t, reason: collision with root package name */
    public static final z f406t = new z(2, 12);

    /* renamed from: u, reason: collision with root package name */
    public static final z f407u = new z(2, 13);

    /* renamed from: v, reason: collision with root package name */
    public static final z f408v = new z(2, 14);

    /* renamed from: w, reason: collision with root package name */
    public static final z f409w = new z(2, 15);

    /* renamed from: x, reason: collision with root package name */
    public static final z f410x = new z(2, 16);

    /* renamed from: y, reason: collision with root package name */
    public static final z f411y = new z(2, 17);

    /* renamed from: z, reason: collision with root package name */
    public static final z f412z = new z(2, 18);

    /* renamed from: A, reason: collision with root package name */
    public static final z f392A = new z(2, 19);
    public static final z B = new z(2, 20);

    /* renamed from: C, reason: collision with root package name */
    public static final z f393C = new z(2, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i2, int i4) {
        super(i2);
        this.f413d = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = 0;
        switch (this.f413d) {
            case 0:
                P.b bVar = (P.b) obj;
                C0036g c0036g = (C0036g) obj2;
                String str = c0036g.f328a;
                y.t tVar = C.f236a;
                List a4 = c0036g.a();
                y.t tVar2 = C.f236a;
                Object a5 = C.a(a4, tVar2, bVar);
                Object obj3 = c0036g.f330c;
                if (obj3 == null) {
                    obj3 = C1405I.f11931d;
                }
                return C1441y.b(str, a5, C.a(obj3, tVar2, bVar), C.a(c0036g.f331d, tVar2, bVar));
            case 1:
                P.b bVar2 = (P.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i2 < size) {
                    arrayList.add(C.a((C0034e) list.get(i2), C.f237b, bVar2));
                    i2++;
                }
                return arrayList;
            case 2:
                P.b bVar3 = (P.b) obj;
                C0034e c0034e = (C0034e) obj2;
                Object obj4 = c0034e.f324a;
                EnumC0038i enumC0038i = obj4 instanceof u ? EnumC0038i.f333d : obj4 instanceof D ? EnumC0038i.f334e : obj4 instanceof N ? EnumC0038i.f335i : obj4 instanceof M ? EnumC0038i.f336j : obj4 instanceof C0041l ? EnumC0038i.f337k : obj4 instanceof C0040k ? EnumC0038i.f338l : EnumC0038i.f339m;
                int ordinal = enumC0038i.ordinal();
                Object obj5 = c0034e.f324a;
                switch (ordinal) {
                    case 0:
                        Intrinsics.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        obj5 = C.a((u) obj5, C.f242g, bVar3);
                        break;
                    case 1:
                        Intrinsics.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        obj5 = C.a((D) obj5, C.f243h, bVar3);
                        break;
                    case 2:
                        Intrinsics.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        obj5 = C.a((N) obj5, C.f238c, bVar3);
                        break;
                    case 3:
                        Intrinsics.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        obj5 = C.a((M) obj5, C.f239d, bVar3);
                        break;
                    case 4:
                        Intrinsics.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        obj5 = C.a((C0041l) obj5, C.f240e, bVar3);
                        break;
                    case 5:
                        Intrinsics.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        obj5 = C.a((C0040k) obj5, C.f241f, bVar3);
                        break;
                    case 6:
                        y.t tVar3 = C.f236a;
                        break;
                    default:
                        throw new C1338m();
                }
                return C1441y.b(enumC0038i, obj5, Integer.valueOf(c0034e.f325b), Integer.valueOf(c0034e.f326c), c0034e.f327d);
            case 3:
                return Float.valueOf(((L0.a) obj2).f3493a);
            case 4:
                C0040k c0040k = (C0040k) obj2;
                return C1441y.b(c0040k.f341a, C.a(c0040k.f342b, C.f244i, (P.b) obj));
            case 5:
                long j4 = ((C0323u) obj2).f4549a;
                return j4 == 16 ? Boolean.FALSE : Integer.valueOf(Z.K.D(j4));
            case 6:
                return Integer.valueOf(((F0.k) obj2).f2618d);
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0041l c0041l = (C0041l) obj2;
                return C1441y.b(c0041l.f343a, C.a(c0041l.f344b, C.f244i, (P.b) obj));
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                P.b bVar4 = (P.b) obj;
                List list2 = ((H0.b) obj2).f3226d;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i2 < size2) {
                    arrayList2.add(C.a((H0.a) list2.get(i2), C.f255t, bVar4));
                    i2++;
                }
                return arrayList2;
            case AbstractC1024c.f9242c /* 9 */:
                return ((H0.a) obj2).f3224a.toLanguageTag();
            case 10:
                long j5 = ((Y.c) obj2).f4372a;
                if (Y.c.b(j5, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(Y.c.d(j5));
                y.t tVar4 = C.f236a;
                return C1441y.b(valueOf, Float.valueOf(Y.c.e(j5)));
            case RequestError.STOP_TRACKING /* 11 */:
                P.b bVar5 = (P.b) obj;
                u uVar = (u) obj2;
                L0.i iVar = new L0.i(uVar.f376a);
                y.t tVar5 = C.f236a;
                L0.k kVar = new L0.k(uVar.f377b);
                Object a6 = C.a(new M0.m(uVar.f378c), C.f252q, bVar5);
                L0.p pVar = L0.p.f3521c;
                return C1441y.b(iVar, kVar, a6, C.a(uVar.f379d, C.f247l, bVar5));
            case 12:
                P.b bVar6 = (P.b) obj;
                O o4 = (O) obj2;
                return C1441y.b(C.a(new C0323u(o4.f4489a), C.f251p, bVar6), C.a(new Y.c(o4.f4490b), C.f253r, bVar6), Float.valueOf(o4.f4491c));
            case 13:
                P.b bVar7 = (P.b) obj;
                D d4 = (D) obj2;
                C0323u c0323u = new C0323u(d4.f256a.b());
                B b4 = C.f251p;
                Object a7 = C.a(c0323u, b4, bVar7);
                M0.m mVar = new M0.m(d4.f257b);
                B b5 = C.f252q;
                Object a8 = C.a(mVar, b5, bVar7);
                F0.k kVar2 = F0.k.f2613e;
                Object a9 = C.a(d4.f258c, C.f248m, bVar7);
                Object a10 = C.a(new M0.m(d4.f263h), b5, bVar7);
                Object a11 = C.a(d4.f264i, C.f249n, bVar7);
                Object a12 = C.a(d4.f265j, C.f246k, bVar7);
                H0.b bVar8 = H0.b.f3225i;
                Object a13 = C.a(d4.f266k, C.f254s, bVar7);
                Object a14 = C.a(new C0323u(d4.f267l), b4, bVar7);
                Object a15 = C.a(d4.f268m, C.f245j, bVar7);
                O o5 = O.f4488d;
                return C1441y.b(a7, a8, a9, d4.f259d, d4.f260e, -1, d4.f262g, a10, a11, a12, a13, a14, a15, C.a(d4.f269n, C.f250o, bVar7));
            case 14:
                return Integer.valueOf(((L0.j) obj2).f3513a);
            case AbstractC1024c.f9246g /* 15 */:
                L0.o oVar = (L0.o) obj2;
                return C1441y.b(Float.valueOf(oVar.f3519a), Float.valueOf(oVar.f3520b));
            case 16:
                P.b bVar9 = (P.b) obj;
                L0.p pVar2 = (L0.p) obj2;
                M0.m mVar2 = new M0.m(pVar2.f3522a);
                B b6 = C.f252q;
                return C1441y.b(C.a(mVar2, b6, bVar9), C.a(new M0.m(pVar2.f3523b), b6, bVar9));
            case 17:
                P.b bVar10 = (P.b) obj;
                J j6 = (J) obj2;
                D d5 = j6.f295a;
                y.t tVar6 = C.f243h;
                return C1441y.b(C.a(d5, tVar6, bVar10), C.a(j6.f296b, tVar6, bVar10), C.a(j6.f297c, tVar6, bVar10), C.a(j6.f298d, tVar6, bVar10));
            case 18:
                long j7 = ((K) obj2).f301a;
                int i4 = K.f300c;
                Integer valueOf2 = Integer.valueOf((int) (j7 >> 32));
                y.t tVar7 = C.f236a;
                return C1441y.b(valueOf2, Integer.valueOf((int) (j7 & 4294967295L)));
            case 19:
                long j8 = ((M0.m) obj2).f3561a;
                if (M0.m.a(j8, M0.m.f3560c)) {
                    return Boolean.FALSE;
                }
                Float valueOf3 = Float.valueOf(M0.m.c(j8));
                y.t tVar8 = C.f236a;
                return C1441y.b(valueOf3, new M0.n(M0.m.b(j8)));
            case 20:
                String str2 = ((M) obj2).f306a;
                y.t tVar9 = C.f236a;
                return str2;
            default:
                String str3 = ((N) obj2).f307a;
                y.t tVar10 = C.f236a;
                return str3;
        }
    }
}
