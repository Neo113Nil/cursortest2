package B0;

import b0.AbstractC0259J;
import b0.C0262M;
import b0.C0288u;
import f.AbstractC0382a;
import h1.C0438i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f321e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f301f = new s(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final s f302g = new s(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final s f303h = new s(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final s f304i = new s(2, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final s f305j = new s(2, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final s f306k = new s(2, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final s f307l = new s(2, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final s f308m = new s(2, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final s f309n = new s(2, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final s f310o = new s(2, 9);
    public static final s p = new s(2, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final s f311q = new s(2, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final s f312r = new s(2, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final s f313s = new s(2, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final s f314t = new s(2, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final s f315u = new s(2, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final s f316v = new s(2, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final s f317w = new s(2, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final s f318x = new s(2, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final s f319y = new s(2, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final s f320z = new s(2, 20);

    /* renamed from: A, reason: collision with root package name */
    public static final s f300A = new s(2, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i3, int i4) {
        super(i3);
        this.f321e = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int i3 = 0;
        switch (this.f321e) {
            case 0:
                R.b bVar = (R.b) obj;
                C0007d c0007d = (C0007d) obj2;
                String str = c0007d.f251a;
                C2.c cVar = v.f346a;
                Collection collection = M1.u.f2803d;
                Collection collection2 = c0007d.f252b;
                if (collection2 == null) {
                    collection2 = collection;
                }
                C2.c cVar2 = v.f346a;
                Object a3 = v.a(collection2, cVar2, bVar);
                Collection collection3 = c0007d.f253c;
                if (collection3 != null) {
                    collection = collection3;
                }
                return M1.m.Z(str, a3, v.a(collection, cVar2, bVar), v.a(c0007d.f254d, cVar2, bVar));
            case 1:
                R.b bVar2 = (R.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i3 < size) {
                    arrayList.add(v.a((C0005b) list.get(i3), v.f347b, bVar2));
                    i3++;
                }
                return arrayList;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                R.b bVar3 = (R.b) obj;
                C0005b c0005b = (C0005b) obj2;
                Object obj3 = c0005b.f246a;
                f fVar = obj3 instanceof o ? f.f256d : obj3 instanceof w ? f.f257e : obj3 instanceof E ? f.f258f : obj3 instanceof D ? f.f259g : obj3 instanceof h ? f.f260h : obj3 instanceof g ? f.f261i : f.f262j;
                int ordinal = fVar.ordinal();
                Object obj4 = c0005b.f246a;
                switch (ordinal) {
                    case 0:
                        Z1.i.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        obj4 = v.a((o) obj4, v.f352g, bVar3);
                        break;
                    case 1:
                        Z1.i.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        obj4 = v.a((w) obj4, v.f353h, bVar3);
                        break;
                    case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                        Z1.i.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        obj4 = v.a((E) obj4, v.f348c, bVar3);
                        break;
                    case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                        Z1.i.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        obj4 = v.a((D) obj4, v.f349d, bVar3);
                        break;
                    case C0438i.LONG_FIELD_NUMBER /* 4 */:
                        Z1.i.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        obj4 = v.a((h) obj4, v.f350e, bVar3);
                        break;
                    case 5:
                        Z1.i.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        obj4 = v.a((g) obj4, v.f351f, bVar3);
                        break;
                    case 6:
                        C2.c cVar3 = v.f346a;
                        break;
                    default:
                        throw new L1.f();
                }
                return M1.m.Z(fVar, obj4, Integer.valueOf(c0005b.f247b), Integer.valueOf(c0005b.f248c), c0005b.f249d);
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                return Float.valueOf(((L0.a) obj2).f2671a);
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                g gVar = (g) obj2;
                return M1.m.Z(gVar.f264a, v.a(gVar.f265b, v.f354i, (R.b) obj));
            case 5:
                long j3 = ((C0288u) obj2).f4298a;
                return j3 == 16 ? Boolean.FALSE : Integer.valueOf(AbstractC0259J.E(j3));
            case 6:
                return Integer.valueOf(((F0.l) obj2).f1458d);
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                h hVar = (h) obj2;
                return M1.m.Z(hVar.f266a, v.a(hVar.f267b, v.f354i, (R.b) obj));
            case 8:
                R.b bVar4 = (R.b) obj;
                List list2 = ((H0.b) obj2).f1849d;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i3 < size2) {
                    arrayList2.add(v.a((H0.a) list2.get(i3), v.f364t, bVar4));
                    i3++;
                }
                return arrayList2;
            case AbstractC0382a.f4777a /* 9 */:
                return ((H0.a) obj2).f1847a.toLanguageTag();
            case AbstractC0382a.f4779c /* 10 */:
                long j4 = ((a0.c) obj2).f3489a;
                if (a0.c.b(j4, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(a0.c.d(j4));
                C2.c cVar4 = v.f346a;
                return M1.m.Z(valueOf, Float.valueOf(a0.c.e(j4)));
            case 11:
                R.b bVar5 = (R.b) obj;
                o oVar = (o) obj2;
                L0.f fVar2 = new L0.f(oVar.f288a);
                C2.c cVar5 = v.f346a;
                L0.h hVar2 = new L0.h(oVar.f289b);
                Object a4 = v.a(new M0.l(oVar.f290c), v.f361q, bVar5);
                L0.l lVar = L0.l.f2690c;
                return M1.m.Z(fVar2, hVar2, a4, v.a(oVar.f291d, v.f357l, bVar5));
            case 12:
                R.b bVar6 = (R.b) obj;
                C0262M c0262m = (C0262M) obj2;
                return M1.m.Z(v.a(new C0288u(c0262m.f4240a), v.p, bVar6), v.a(new a0.c(c0262m.f4241b), v.f362r, bVar6), Float.valueOf(c0262m.f4242c));
            case 13:
                R.b bVar7 = (R.b) obj;
                w wVar = (w) obj2;
                C0288u c0288u = new C0288u(wVar.f365a.b());
                u uVar = v.p;
                Object a5 = v.a(c0288u, uVar, bVar7);
                M0.l lVar2 = new M0.l(wVar.f366b);
                u uVar2 = v.f361q;
                Object a6 = v.a(lVar2, uVar2, bVar7);
                F0.l lVar3 = F0.l.f1453e;
                Object a7 = v.a(wVar.f367c, v.f358m, bVar7);
                Object a8 = v.a(new M0.l(wVar.f372h), uVar2, bVar7);
                Object a9 = v.a(wVar.f373i, v.f359n, bVar7);
                Object a10 = v.a(wVar.f374j, v.f356k, bVar7);
                H0.b bVar8 = H0.b.f1848f;
                Object a11 = v.a(wVar.f375k, v.f363s, bVar7);
                Object a12 = v.a(new C0288u(wVar.f376l), uVar, bVar7);
                Object a13 = v.a(wVar.f377m, v.f355j, bVar7);
                C0262M c0262m2 = C0262M.f4239d;
                return M1.m.Z(a5, a6, a7, wVar.f368d, wVar.f369e, -1, wVar.f371g, a8, a9, a10, a11, a12, a13, v.a(wVar.f378n, v.f360o, bVar7));
            case 14:
                return Integer.valueOf(((L0.g) obj2).f2684a);
            case AbstractC0382a.f4781e /* 15 */:
                L0.k kVar = (L0.k) obj2;
                return M1.m.Z(Float.valueOf(kVar.f2688a), Float.valueOf(kVar.f2689b));
            case 16:
                R.b bVar9 = (R.b) obj;
                L0.l lVar4 = (L0.l) obj2;
                M0.l lVar5 = new M0.l(lVar4.f2691a);
                u uVar3 = v.f361q;
                return M1.m.Z(v.a(lVar5, uVar3, bVar9), v.a(new M0.l(lVar4.f2692b), uVar3, bVar9));
            case 17:
                R.b bVar10 = (R.b) obj;
                A a14 = (A) obj2;
                w wVar2 = a14.f227a;
                C2.c cVar6 = v.f353h;
                return M1.m.Z(v.a(wVar2, cVar6, bVar10), v.a(a14.f228b, cVar6, bVar10), v.a(a14.f229c, cVar6, bVar10), v.a(a14.f230d, cVar6, bVar10));
            case 18:
                long j5 = ((B) obj2).f233a;
                int i4 = B.f232c;
                Integer valueOf2 = Integer.valueOf((int) (j5 >> 32));
                C2.c cVar7 = v.f346a;
                return M1.m.Z(valueOf2, Integer.valueOf((int) (j5 & 4294967295L)));
            case 19:
                long j6 = ((M0.l) obj2).f2781a;
                if (M0.l.a(j6, M0.l.f2780c)) {
                    return Boolean.FALSE;
                }
                Float valueOf3 = Float.valueOf(M0.l.c(j6));
                C2.c cVar8 = v.f346a;
                return M1.m.Z(valueOf3, new M0.m(M0.l.b(j6)));
            case 20:
                String str2 = ((D) obj2).f238a;
                C2.c cVar9 = v.f346a;
                return str2;
            default:
                String str3 = ((E) obj2).f239a;
                C2.c cVar10 = v.f346a;
                return str3;
        }
    }
}
