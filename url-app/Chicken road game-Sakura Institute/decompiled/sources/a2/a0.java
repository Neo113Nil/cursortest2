package a2;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import z0.o0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends r6.l implements q6.c {
    public static final a0 A;
    public static final a0 B;
    public static final a0 C;

    /* renamed from: h, reason: collision with root package name */
    public static final a0 f291h;

    /* renamed from: i, reason: collision with root package name */
    public static final a0 f292i;

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f293j;

    /* renamed from: k, reason: collision with root package name */
    public static final a0 f294k;

    /* renamed from: l, reason: collision with root package name */
    public static final a0 f295l;

    /* renamed from: m, reason: collision with root package name */
    public static final a0 f296m;

    /* renamed from: n, reason: collision with root package name */
    public static final a0 f297n;

    /* renamed from: o, reason: collision with root package name */
    public static final a0 f298o;

    /* renamed from: p, reason: collision with root package name */
    public static final a0 f299p;

    /* renamed from: q, reason: collision with root package name */
    public static final a0 f300q;

    /* renamed from: r, reason: collision with root package name */
    public static final a0 f301r;

    /* renamed from: s, reason: collision with root package name */
    public static final a0 f302s;

    /* renamed from: t, reason: collision with root package name */
    public static final a0 f303t;

    /* renamed from: u, reason: collision with root package name */
    public static final a0 f304u;

    /* renamed from: v, reason: collision with root package name */
    public static final a0 f305v;

    /* renamed from: w, reason: collision with root package name */
    public static final a0 f306w;

    /* renamed from: x, reason: collision with root package name */
    public static final a0 f307x;

    /* renamed from: y, reason: collision with root package name */
    public static final a0 f308y;

    /* renamed from: z, reason: collision with root package name */
    public static final a0 f309z;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f310g;

    static {
        int i7 = 1;
        f291h = new a0(i7, 0);
        f292i = new a0(i7, 1);
        f293j = new a0(i7, 2);
        f294k = new a0(i7, 3);
        f295l = new a0(i7, 4);
        f296m = new a0(i7, 5);
        f297n = new a0(i7, 6);
        f298o = new a0(i7, 7);
        f299p = new a0(i7, 8);
        f300q = new a0(i7, 9);
        f301r = new a0(i7, 10);
        f302s = new a0(i7, 11);
        f303t = new a0(i7, 12);
        f304u = new a0(i7, 13);
        f305v = new a0(i7, 14);
        f306w = new a0(i7, 15);
        f307x = new a0(i7, 16);
        f308y = new a0(i7, 17);
        f309z = new a0(i7, 18);
        A = new a0(i7, 19);
        B = new a0(i7, 20);
        C = new a0(i7, 21);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i7, int i8) {
        super(i7);
        this.f310g = i8;
    }

    /* JADX WARN: Type inference failed for: r3v26, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r3v29, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r3v31, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r3v33, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r3v42, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r4v34, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r6v50, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r8v4, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r9v2, types: [q6.c, r6.l] */
    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = 0;
        List list = null;
        r11 = null;
        d0 d0Var = null;
        r11 = null;
        m2.m mVar = null;
        r11 = null;
        o0 o0Var = null;
        r11 = null;
        l2.o oVar = null;
        r11 = null;
        i0 i0Var = null;
        r11 = null;
        i0 i0Var2 = null;
        r11 = null;
        k kVar = null;
        r11 = null;
        l lVar = null;
        r11 = null;
        l0 l0Var = null;
        r11 = null;
        m0 m0Var = null;
        r11 = null;
        d0 d0Var2 = null;
        r11 = null;
        u uVar = null;
        list = null;
        switch (this.f310g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj2 = list2.get(1);
                androidx.room.c cVar = c0.f323a;
                Boolean bool = Boolean.FALSE;
                List list3 = (r6.k.a(obj2, bool) || obj2 == null) ? null : (List) ((q6.c) cVar.f1070h).f(obj2);
                Object obj3 = list2.get(2);
                List list4 = (r6.k.a(obj3, bool) || obj3 == null) ? null : (List) ((q6.c) cVar.f1070h).f(obj3);
                Object obj4 = list2.get(0);
                String str = obj4 != null ? (String) obj4 : null;
                r6.k.c(str);
                if (list3 == null || list3.isEmpty()) {
                    list3 = null;
                }
                if (list4 == null || list4.isEmpty()) {
                    list4 = null;
                }
                Object obj5 = list2.get(3);
                if (!r6.k.a(obj5, bool) && obj5 != null) {
                    list = (List) ((q6.c) cVar.f1070h).f(obj5);
                }
                return new g(str, list3, list4, list);
            case 1:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i7 < size) {
                    Object obj6 = list5.get(i7);
                    e eVar = (r6.k.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (e) ((q6.c) c0.f324b.f1070h).f(obj6);
                    r6.k.c(eVar);
                    arrayList.add(eVar);
                    i7++;
                }
                return arrayList;
            case 2:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                i iVar = obj7 != null ? (i) obj7 : null;
                r6.k.c(iVar);
                Object obj8 = list6.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                r6.k.c(num);
                int intValue = num.intValue();
                Object obj9 = list6.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                r6.k.c(num2);
                int intValue2 = num2.intValue();
                Object obj10 = list6.get(4);
                String str2 = obj10 != null ? (String) obj10 : null;
                r6.k.c(str2);
                switch (iVar.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Object obj11 = list6.get(1);
                        androidx.room.c cVar2 = c0.f329g;
                        if (!r6.k.a(obj11, Boolean.FALSE) && obj11 != null) {
                            uVar = (u) ((q6.c) cVar2.f1070h).f(obj11);
                        }
                        r6.k.c(uVar);
                        return new e(uVar, intValue, intValue2, str2);
                    case 1:
                        Object obj12 = list6.get(1);
                        androidx.room.c cVar3 = c0.f330h;
                        if (!r6.k.a(obj12, Boolean.FALSE) && obj12 != null) {
                            d0Var2 = (d0) ((q6.c) cVar3.f1070h).f(obj12);
                        }
                        r6.k.c(d0Var2);
                        return new e(d0Var2, intValue, intValue2, str2);
                    case 2:
                        Object obj13 = list6.get(1);
                        androidx.room.c cVar4 = c0.f325c;
                        if (!r6.k.a(obj13, Boolean.FALSE) && obj13 != null) {
                            m0Var = (m0) ((q6.c) cVar4.f1070h).f(obj13);
                        }
                        r6.k.c(m0Var);
                        return new e(m0Var, intValue, intValue2, str2);
                    case 3:
                        Object obj14 = list6.get(1);
                        androidx.room.c cVar5 = c0.f326d;
                        if (!r6.k.a(obj14, Boolean.FALSE) && obj14 != null) {
                            l0Var = (l0) ((q6.c) cVar5.f1070h).f(obj14);
                        }
                        r6.k.c(l0Var);
                        return new e(l0Var, intValue, intValue2, str2);
                    case 4:
                        Object obj15 = list6.get(1);
                        androidx.room.c cVar6 = c0.f327e;
                        if (!r6.k.a(obj15, Boolean.FALSE) && obj15 != null) {
                            lVar = (l) ((q6.c) cVar6.f1070h).f(obj15);
                        }
                        r6.k.c(lVar);
                        return new e(lVar, intValue, intValue2, str2);
                    case 5:
                        Object obj16 = list6.get(1);
                        androidx.room.c cVar7 = c0.f328f;
                        if (!r6.k.a(obj16, Boolean.FALSE) && obj16 != null) {
                            kVar = (k) ((q6.c) cVar7.f1070h).f(obj16);
                        }
                        r6.k.c(kVar);
                        return new e(kVar, intValue, intValue2, str2);
                    case 6:
                        Object obj17 = list6.get(1);
                        String str3 = obj17 != null ? (String) obj17 : null;
                        r6.k.c(str3);
                        return new e(str3, intValue, intValue2, str2);
                    default:
                        throw new b4.c();
                }
            case 3:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.Float");
                return new l2.a(((Float) obj).floatValue());
            case 4:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list7 = (List) obj;
                Object obj18 = list7.get(0);
                String str4 = obj18 != null ? (String) obj18 : null;
                r6.k.c(str4);
                Object obj19 = list7.get(1);
                androidx.room.c cVar8 = c0.f331i;
                if (!r6.k.a(obj19, Boolean.FALSE) && obj19 != null) {
                    i0Var2 = (i0) ((q6.c) cVar8.f1070h).f(obj19);
                }
                return new k(str4, i0Var2);
            case 5:
                if (r6.k.a(obj, Boolean.FALSE)) {
                    return new z0.u(z0.u.f10057g);
                }
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new z0.u(z0.l0.c(((Integer) obj).intValue()));
            case 6:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new f2.k(((Integer) obj).intValue());
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj20 = list8.get(0);
                String str5 = obj20 != null ? (String) obj20 : null;
                r6.k.c(str5);
                Object obj21 = list8.get(1);
                androidx.room.c cVar9 = c0.f331i;
                if (!r6.k.a(obj21, Boolean.FALSE) && obj21 != null) {
                    i0Var = (i0) ((q6.c) cVar9.f1070h).f(obj21);
                }
                return new l(str5, i0Var);
            case 8:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i7 < size2) {
                    Object obj22 = list9.get(i7);
                    h2.a aVar = (r6.k.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (h2.a) ((q6.c) c0.f342t.f1070h).f(obj22);
                    r6.k.c(aVar);
                    arrayList2.add(aVar);
                    i7++;
                }
                return new h2.b(arrayList2);
            case q.c.f7259c /* 9 */:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj;
                h2.c.f4646a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str6);
                if (r6.k.a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new h2.a(forLanguageTag);
            case q.c.f7261e /* 10 */:
                if (r6.k.a(obj, Boolean.FALSE)) {
                    return new y0.c(9205357640488583168L);
                }
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj23 = list10.get(0);
                Float f9 = obj23 != null ? (Float) obj23 : null;
                r6.k.c(f9);
                float floatValue = f9.floatValue();
                Object obj24 = list10.get(1);
                Float f10 = obj24 != null ? (Float) obj24 : null;
                r6.k.c(f10);
                return new y0.c(u3.r.a(floatValue, f10.floatValue()));
            case 11:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj25 = list11.get(0);
                l2.i iVar2 = obj25 != null ? (l2.i) obj25 : null;
                r6.k.c(iVar2);
                int i8 = iVar2.f5876a;
                Object obj26 = list11.get(1);
                l2.k kVar2 = obj26 != null ? (l2.k) obj26 : null;
                r6.k.c(kVar2);
                int i9 = kVar2.f5881a;
                Object obj27 = list11.get(2);
                m2.n[] nVarArr = m2.m.f6326b;
                b0 b0Var = c0.f339q;
                Boolean bool2 = Boolean.FALSE;
                m2.m mVar2 = ((r6.k.a(obj27, bool2) && b0Var == null) || obj27 == null) ? null : (m2.m) b0Var.f318g.f(obj27);
                r6.k.c(mVar2);
                long j8 = mVar2.f6328a;
                Object obj28 = list11.get(3);
                l2.o oVar2 = l2.o.f5886c;
                androidx.room.c cVar10 = c0.f334l;
                if (!r6.k.a(obj28, bool2) && obj28 != null) {
                    oVar = (l2.o) ((q6.c) cVar10.f1070h).f(obj28);
                }
                return new u(i8, i9, j8, oVar, null, null, 0, Integer.MIN_VALUE, null);
            case 12:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                Object obj29 = list12.get(0);
                int i10 = z0.u.f10058h;
                b0 b0Var2 = c0.f338p;
                Boolean bool3 = Boolean.FALSE;
                z0.u uVar2 = ((r6.k.a(obj29, bool3) && b0Var2 == null) || obj29 == null) ? null : (z0.u) b0Var2.f318g.f(obj29);
                r6.k.c(uVar2);
                long j9 = uVar2.f10059a;
                Object obj30 = list12.get(1);
                b0 b0Var3 = c0.f340r;
                y0.c cVar11 = ((r6.k.a(obj30, bool3) && b0Var3 == null) || obj30 == null) ? null : (y0.c) b0Var3.f318g.f(obj30);
                r6.k.c(cVar11);
                long j10 = cVar11.f9778a;
                Object obj31 = list12.get(2);
                Float f11 = obj31 != null ? (Float) obj31 : null;
                r6.k.c(f11);
                return new o0(f11.floatValue(), j9, j10);
            case 13:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list13 = (List) obj;
                Object obj32 = list13.get(0);
                int i11 = z0.u.f10058h;
                b0 b0Var4 = c0.f338p;
                Boolean bool4 = Boolean.FALSE;
                z0.u uVar3 = ((r6.k.a(obj32, bool4) && b0Var4 == null) || obj32 == null) ? null : (z0.u) b0Var4.f318g.f(obj32);
                r6.k.c(uVar3);
                long j11 = uVar3.f10059a;
                Object obj33 = list13.get(1);
                m2.n[] nVarArr2 = m2.m.f6326b;
                b0 b0Var5 = c0.f339q;
                m2.m mVar3 = ((r6.k.a(obj33, bool4) && b0Var5 == null) || obj33 == null) ? null : (m2.m) b0Var5.f318g.f(obj33);
                r6.k.c(mVar3);
                long j12 = mVar3.f6328a;
                Object obj34 = list13.get(2);
                f2.k kVar3 = f2.k.f3277g;
                f2.k kVar4 = (r6.k.a(obj34, bool4) || obj34 == null) ? null : (f2.k) ((q6.c) c0.f335m.f1070h).f(obj34);
                Object obj35 = list13.get(3);
                f2.i iVar3 = obj35 != null ? (f2.i) obj35 : null;
                Object obj36 = list13.get(4);
                f2.j jVar = obj36 != null ? (f2.j) obj36 : null;
                Object obj37 = list13.get(6);
                String str7 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list13.get(7);
                m2.m mVar4 = ((r6.k.a(obj38, bool4) && b0Var5 == null) || obj38 == null) ? null : (m2.m) b0Var5.f318g.f(obj38);
                r6.k.c(mVar4);
                long j13 = mVar4.f6328a;
                Object obj39 = list13.get(8);
                l2.a aVar2 = (r6.k.a(obj39, bool4) || obj39 == null) ? null : (l2.a) ((q6.c) c0.f336n.f1070h).f(obj39);
                Object obj40 = list13.get(9);
                l2.n nVar = (r6.k.a(obj40, bool4) || obj40 == null) ? null : (l2.n) ((q6.c) c0.f333k.f1070h).f(obj40);
                Object obj41 = list13.get(10);
                h2.b bVar = h2.b.f4643h;
                h2.b bVar2 = (r6.k.a(obj41, bool4) || obj41 == null) ? null : (h2.b) ((q6.c) c0.f341s.f1070h).f(obj41);
                Object obj42 = list13.get(11);
                z0.u uVar4 = ((r6.k.a(obj42, bool4) && b0Var4 == null) || obj42 == null) ? null : (z0.u) b0Var4.f318g.f(obj42);
                r6.k.c(uVar4);
                long j14 = uVar4.f10059a;
                Object obj43 = list13.get(12);
                l2.j jVar2 = (r6.k.a(obj43, bool4) || obj43 == null) ? null : (l2.j) ((q6.c) c0.f332j.f1070h).f(obj43);
                Object obj44 = list13.get(13);
                o0 o0Var2 = o0.f10030d;
                androidx.room.c cVar12 = c0.f337o;
                if (!r6.k.a(obj44, bool4) && obj44 != null) {
                    o0Var = (o0) ((q6.c) cVar12.f1070h).f(obj44);
                }
                return new d0(j11, j12, kVar4, iVar3, jVar, (f2.q) null, str7, j13, aVar2, nVar, bVar2, j14, jVar2, o0Var, 49184);
            case 14:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new l2.j(((Integer) obj).intValue());
            case q.c.f7263g /* 15 */:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list14 = (List) obj;
                return new l2.n(((Number) list14.get(0)).floatValue(), ((Number) list14.get(1)).floatValue());
            case 16:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list15 = (List) obj;
                Object obj45 = list15.get(0);
                m2.n[] nVarArr3 = m2.m.f6326b;
                b0 b0Var6 = c0.f339q;
                Boolean bool5 = Boolean.FALSE;
                m2.m mVar5 = ((r6.k.a(obj45, bool5) && b0Var6 == null) || obj45 == null) ? null : (m2.m) b0Var6.f318g.f(obj45);
                r6.k.c(mVar5);
                long j15 = mVar5.f6328a;
                Object obj46 = list15.get(1);
                if ((!r6.k.a(obj46, bool5) || b0Var6 != null) && obj46 != null) {
                    mVar = (m2.m) b0Var6.f318g.f(obj46);
                }
                r6.k.c(mVar);
                return new l2.o(j15, mVar.f6328a);
            case 17:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj47 = list16.get(0);
                androidx.room.c cVar13 = c0.f330h;
                Boolean bool6 = Boolean.FALSE;
                d0 d0Var3 = (r6.k.a(obj47, bool6) || obj47 == null) ? null : (d0) ((q6.c) cVar13.f1070h).f(obj47);
                Object obj48 = list16.get(1);
                d0 d0Var4 = (r6.k.a(obj48, bool6) || obj48 == null) ? null : (d0) ((q6.c) cVar13.f1070h).f(obj48);
                Object obj49 = list16.get(2);
                d0 d0Var5 = (r6.k.a(obj49, bool6) || obj49 == null) ? null : (d0) ((q6.c) cVar13.f1070h).f(obj49);
                Object obj50 = list16.get(3);
                if (!r6.k.a(obj50, bool6) && obj50 != null) {
                    d0Var = (d0) ((q6.c) cVar13.f1070h).f(obj50);
                }
                return new i0(d0Var3, d0Var4, d0Var5, d0Var);
            case 18:
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list17 = (List) obj;
                Object obj51 = list17.get(0);
                Integer num3 = obj51 != null ? (Integer) obj51 : null;
                r6.k.c(num3);
                int intValue3 = num3.intValue();
                Object obj52 = list17.get(1);
                Integer num4 = obj52 != null ? (Integer) obj52 : null;
                r6.k.c(num4);
                return new j0(r4.a.h(intValue3, num4.intValue()));
            case 19:
                if (r6.k.a(obj, Boolean.FALSE)) {
                    return new m2.m(m2.m.f6327c);
                }
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj53 = list18.get(0);
                Float f12 = obj53 != null ? (Float) obj53 : null;
                r6.k.c(f12);
                float floatValue2 = f12.floatValue();
                Object obj54 = list18.get(1);
                m2.n nVar2 = obj54 != null ? (m2.n) obj54 : null;
                r6.k.c(nVar2);
                return new m2.m(r4.a.O(nVar2.f6329a, floatValue2));
            case 20:
                String str8 = obj != null ? (String) obj : null;
                r6.k.c(str8);
                return new l0(str8);
            default:
                String str9 = obj != null ? (String) obj : null;
                r6.k.c(str9);
                return new m0(str9);
        }
    }
}
