package a2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import z0.o0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends r6.l implements q6.e {
    public static final z A;
    public static final z B;
    public static final z C;

    /* renamed from: h, reason: collision with root package name */
    public static final z f466h;

    /* renamed from: i, reason: collision with root package name */
    public static final z f467i;

    /* renamed from: j, reason: collision with root package name */
    public static final z f468j;

    /* renamed from: k, reason: collision with root package name */
    public static final z f469k;

    /* renamed from: l, reason: collision with root package name */
    public static final z f470l;

    /* renamed from: m, reason: collision with root package name */
    public static final z f471m;

    /* renamed from: n, reason: collision with root package name */
    public static final z f472n;

    /* renamed from: o, reason: collision with root package name */
    public static final z f473o;

    /* renamed from: p, reason: collision with root package name */
    public static final z f474p;

    /* renamed from: q, reason: collision with root package name */
    public static final z f475q;

    /* renamed from: r, reason: collision with root package name */
    public static final z f476r;

    /* renamed from: s, reason: collision with root package name */
    public static final z f477s;

    /* renamed from: t, reason: collision with root package name */
    public static final z f478t;

    /* renamed from: u, reason: collision with root package name */
    public static final z f479u;

    /* renamed from: v, reason: collision with root package name */
    public static final z f480v;

    /* renamed from: w, reason: collision with root package name */
    public static final z f481w;

    /* renamed from: x, reason: collision with root package name */
    public static final z f482x;

    /* renamed from: y, reason: collision with root package name */
    public static final z f483y;

    /* renamed from: z, reason: collision with root package name */
    public static final z f484z;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f485g;

    static {
        int i7 = 2;
        f466h = new z(i7, 0);
        f467i = new z(i7, 1);
        f468j = new z(i7, 2);
        f469k = new z(i7, 3);
        f470l = new z(i7, 4);
        f471m = new z(i7, 5);
        f472n = new z(i7, 6);
        f473o = new z(i7, 7);
        f474p = new z(i7, 8);
        f475q = new z(i7, 9);
        f476r = new z(i7, 10);
        f477s = new z(i7, 11);
        f478t = new z(i7, 12);
        f479u = new z(i7, 13);
        f480v = new z(i7, 14);
        f481w = new z(i7, 15);
        f482x = new z(i7, 16);
        f483y = new z(i7, 17);
        f484z = new z(i7, 18);
        A = new z(i7, 19);
        B = new z(i7, 20);
        C = new z(i7, 21);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i7, int i8) {
        super(i7);
        this.f485g = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int i7 = 0;
        switch (this.f485g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p0.b bVar = (p0.b) obj;
                g gVar = (g) obj2;
                String str = gVar.f373f;
                androidx.room.c cVar = c0.f323a;
                List a3 = gVar.a();
                androidx.room.c cVar2 = c0.f323a;
                Object a9 = c0.a(a3, cVar2, bVar);
                Object obj3 = gVar.f375h;
                if (obj3 == null) {
                    obj3 = e6.u.f2826f;
                }
                return e6.m.U(str, a9, c0.a(obj3, cVar2, bVar), c0.a(gVar.f376i, cVar2, bVar));
            case 1:
                p0.b bVar2 = (p0.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i7 < size) {
                    arrayList.add(c0.a((e) list.get(i7), c0.f324b, bVar2));
                    i7++;
                }
                return arrayList;
            case 2:
                p0.b bVar3 = (p0.b) obj;
                e eVar = (e) obj2;
                Object obj4 = eVar.f363a;
                i iVar = obj4 instanceof u ? i.f394f : obj4 instanceof d0 ? i.f395g : obj4 instanceof m0 ? i.f396h : obj4 instanceof l0 ? i.f397i : obj4 instanceof l ? i.f398j : obj4 instanceof k ? i.f399k : i.f400l;
                switch (iVar.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        r6.k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        obj4 = c0.a((u) obj4, c0.f329g, bVar3);
                        break;
                    case 1:
                        r6.k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        obj4 = c0.a((d0) obj4, c0.f330h, bVar3);
                        break;
                    case 2:
                        r6.k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        obj4 = c0.a((m0) obj4, c0.f325c, bVar3);
                        break;
                    case 3:
                        r6.k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        obj4 = c0.a((l0) obj4, c0.f326d, bVar3);
                        break;
                    case 4:
                        r6.k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        obj4 = c0.a((l) obj4, c0.f327e, bVar3);
                        break;
                    case 5:
                        r6.k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        obj4 = c0.a((k) obj4, c0.f328f, bVar3);
                        break;
                    case 6:
                        androidx.room.c cVar3 = c0.f323a;
                        break;
                    default:
                        throw new b4.c();
                }
                return e6.m.U(iVar, obj4, Integer.valueOf(eVar.f364b), Integer.valueOf(eVar.f365c), eVar.f366d);
            case 3:
                return Float.valueOf(((l2.a) obj2).f5860a);
            case 4:
                k kVar = (k) obj2;
                String str2 = kVar.f409a;
                androidx.room.c cVar4 = c0.f323a;
                return e6.m.U(str2, c0.a(kVar.f410b, c0.f331i, (p0.b) obj));
            case 5:
                long j8 = ((z0.u) obj2).f10059a;
                return j8 == 16 ? Boolean.FALSE : Integer.valueOf(z0.l0.w(j8));
            case 6:
                return Integer.valueOf(((f2.k) obj2).f3280f);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                l lVar = (l) obj2;
                String str3 = lVar.f415a;
                androidx.room.c cVar5 = c0.f323a;
                return e6.m.U(str3, c0.a(lVar.f416b, c0.f331i, (p0.b) obj));
            case 8:
                p0.b bVar4 = (p0.b) obj;
                List list2 = ((h2.b) obj2).f4644f;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i7 < size2) {
                    arrayList2.add(c0.a((h2.a) list2.get(i7), c0.f342t, bVar4));
                    i7++;
                }
                return arrayList2;
            case q.c.f7259c /* 9 */:
                return ((h2.a) obj2).f4642a.toLanguageTag();
            case q.c.f7261e /* 10 */:
                long j9 = ((y0.c) obj2).f9778a;
                if (y0.c.b(j9, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(y0.c.d(j9));
                androidx.room.c cVar6 = c0.f323a;
                return e6.m.U(valueOf, Float.valueOf(y0.c.e(j9)));
            case 11:
                p0.b bVar5 = (p0.b) obj;
                u uVar = (u) obj2;
                l2.i iVar2 = new l2.i(uVar.f450a);
                androidx.room.c cVar7 = c0.f323a;
                l2.k kVar2 = new l2.k(uVar.f451b);
                Object a10 = c0.a(new m2.m(uVar.f452c), c0.f339q, bVar5);
                l2.o oVar = uVar.f453d;
                l2.o oVar2 = l2.o.f5886c;
                return e6.m.U(iVar2, kVar2, a10, c0.a(oVar, c0.f334l, bVar5));
            case 12:
                p0.b bVar6 = (p0.b) obj;
                o0 o0Var = (o0) obj2;
                return e6.m.U(c0.a(new z0.u(o0Var.f10031a), c0.f338p, bVar6), c0.a(new y0.c(o0Var.f10032b), c0.f340r, bVar6), Float.valueOf(o0Var.f10033c));
            case 13:
                p0.b bVar7 = (p0.b) obj;
                d0 d0Var = (d0) obj2;
                z0.u uVar2 = new z0.u(d0Var.f347a.b());
                b0 b0Var = c0.f338p;
                Object a11 = c0.a(uVar2, b0Var, bVar7);
                m2.m mVar = new m2.m(d0Var.f348b);
                b0 b0Var2 = c0.f339q;
                Object a12 = c0.a(mVar, b0Var2, bVar7);
                f2.k kVar3 = d0Var.f349c;
                f2.k kVar4 = f2.k.f3277g;
                Object a13 = c0.a(kVar3, c0.f335m, bVar7);
                f2.i iVar3 = d0Var.f350d;
                f2.j jVar = d0Var.f351e;
                String str4 = d0Var.f353g;
                Object a14 = c0.a(new m2.m(d0Var.f354h), b0Var2, bVar7);
                Object a15 = c0.a(d0Var.f355i, c0.f336n, bVar7);
                Object a16 = c0.a(d0Var.f356j, c0.f333k, bVar7);
                h2.b bVar8 = d0Var.f357k;
                h2.b bVar9 = h2.b.f4643h;
                Object a17 = c0.a(bVar8, c0.f341s, bVar7);
                Object a18 = c0.a(new z0.u(d0Var.f358l), b0Var, bVar7);
                Object a19 = c0.a(d0Var.f359m, c0.f332j, bVar7);
                o0 o0Var2 = d0Var.f360n;
                o0 o0Var3 = o0.f10030d;
                return e6.m.U(a11, a12, a13, iVar3, jVar, -1, str4, a14, a15, a16, a17, a18, a19, c0.a(o0Var2, c0.f337o, bVar7));
            case 14:
                return Integer.valueOf(((l2.j) obj2).f5880a);
            case q.c.f7263g /* 15 */:
                l2.n nVar = (l2.n) obj2;
                return e6.m.U(Float.valueOf(nVar.f5884a), Float.valueOf(nVar.f5885b));
            case 16:
                p0.b bVar10 = (p0.b) obj;
                l2.o oVar3 = (l2.o) obj2;
                m2.m mVar2 = new m2.m(oVar3.f5887a);
                b0 b0Var3 = c0.f339q;
                return e6.m.U(c0.a(mVar2, b0Var3, bVar10), c0.a(new m2.m(oVar3.f5888b), b0Var3, bVar10));
            case 17:
                p0.b bVar11 = (p0.b) obj;
                i0 i0Var = (i0) obj2;
                d0 d0Var2 = i0Var.f402a;
                androidx.room.c cVar8 = c0.f330h;
                return e6.m.U(c0.a(d0Var2, cVar8, bVar11), c0.a(i0Var.f403b, cVar8, bVar11), c0.a(i0Var.f404c, cVar8, bVar11), c0.a(i0Var.f405d, cVar8, bVar11));
            case 18:
                long j10 = ((j0) obj2).f408a;
                int i8 = j0.f407c;
                Integer valueOf2 = Integer.valueOf((int) (j10 >> 32));
                androidx.room.c cVar9 = c0.f323a;
                return e6.m.U(valueOf2, Integer.valueOf((int) (j10 & 4294967295L)));
            case 19:
                long j11 = ((m2.m) obj2).f6328a;
                if (m2.m.a(j11, m2.m.f6327c)) {
                    return Boolean.FALSE;
                }
                Float valueOf3 = Float.valueOf(m2.m.c(j11));
                androidx.room.c cVar10 = c0.f323a;
                return e6.m.U(valueOf3, new m2.n(m2.m.b(j11)));
            case 20:
                String str5 = ((l0) obj2).f417a;
                androidx.room.c cVar11 = c0.f323a;
                return str5;
            default:
                String str6 = ((m0) obj2).f418a;
                androidx.room.c cVar12 = c0.f323a;
                return str6;
        }
    }
}
