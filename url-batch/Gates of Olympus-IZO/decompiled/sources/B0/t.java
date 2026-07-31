package B0;

import a.AbstractC0157a;
import android.util.Log;
import b0.AbstractC0259J;
import b0.C0262M;
import b0.C0288u;
import f.AbstractC0382a;
import h1.C0438i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class t extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f343e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f323f = new t(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final t f324g = new t(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final t f325h = new t(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final t f326i = new t(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final t f327j = new t(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final t f328k = new t(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final t f329l = new t(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final t f330m = new t(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final t f331n = new t(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final t f332o = new t(1, 9);
    public static final t p = new t(1, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final t f333q = new t(1, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final t f334r = new t(1, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final t f335s = new t(1, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final t f336t = new t(1, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final t f337u = new t(1, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final t f338v = new t(1, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final t f339w = new t(1, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final t f340x = new t(1, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final t f341y = new t(1, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final t f342z = new t(1, 20);

    /* renamed from: A, reason: collision with root package name */
    public static final t f322A = new t(1, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i3, int i4) {
        super(i3);
        this.f343e = i4;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r12v3, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r3v31, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r3v39, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r3v62, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r4v40, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r5v24, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r5v31, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r6v13, types: [Y1.c, Z1.j] */
    @Override // Y1.c
    public final Object j(Object obj) {
        int i3 = 0;
        List list = null;
        r9 = null;
        w wVar = null;
        r9 = null;
        M0.l lVar = null;
        r9 = null;
        C0262M c0262m = null;
        r9 = null;
        L0.l lVar2 = null;
        r9 = null;
        A a3 = null;
        r9 = null;
        A a4 = null;
        r9 = null;
        g gVar = null;
        r9 = null;
        h hVar = null;
        r9 = null;
        D d3 = null;
        r9 = null;
        E e3 = null;
        r9 = null;
        w wVar2 = null;
        r9 = null;
        o oVar = null;
        list = null;
        switch (this.f343e) {
            case 0:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj2 = list2.get(1);
                C2.c cVar = v.f346a;
                Boolean bool = Boolean.FALSE;
                List list3 = (Z1.i.a(obj2, bool) || obj2 == null) ? null : (List) ((Y1.c) cVar.f485f).j(obj2);
                Object obj3 = list2.get(2);
                List list4 = (Z1.i.a(obj3, bool) || obj3 == null) ? null : (List) ((Y1.c) cVar.f485f).j(obj3);
                Object obj4 = list2.get(0);
                String str = obj4 != null ? (String) obj4 : null;
                Z1.i.c(str);
                if (list3 == null || list3.isEmpty()) {
                    list3 = null;
                }
                if (list4 == null || list4.isEmpty()) {
                    list4 = null;
                }
                Object obj5 = list2.get(3);
                if (!Z1.i.a(obj5, bool) && obj5 != null) {
                    list = (List) ((Y1.c) cVar.f485f).j(obj5);
                }
                return new C0007d(str, list3, list4, list);
            case 1:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i3 < size) {
                    Object obj6 = list5.get(i3);
                    C0005b c0005b = (Z1.i.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (C0005b) ((Y1.c) v.f347b.f485f).j(obj6);
                    Z1.i.c(c0005b);
                    arrayList.add(c0005b);
                    i3++;
                }
                return arrayList;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                f fVar = obj7 != null ? (f) obj7 : null;
                Z1.i.c(fVar);
                Object obj8 = list6.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                Z1.i.c(num);
                int intValue = num.intValue();
                Object obj9 = list6.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                Z1.i.c(num2);
                int intValue2 = num2.intValue();
                Object obj10 = list6.get(4);
                String str2 = obj10 != null ? (String) obj10 : null;
                Z1.i.c(str2);
                switch (fVar.ordinal()) {
                    case 0:
                        Object obj11 = list6.get(1);
                        C2.c cVar2 = v.f352g;
                        if (!Z1.i.a(obj11, Boolean.FALSE) && obj11 != null) {
                            oVar = (o) ((Y1.c) cVar2.f485f).j(obj11);
                        }
                        Z1.i.c(oVar);
                        return new C0005b(oVar, intValue, intValue2, str2);
                    case 1:
                        Object obj12 = list6.get(1);
                        C2.c cVar3 = v.f353h;
                        if (!Z1.i.a(obj12, Boolean.FALSE) && obj12 != null) {
                            wVar2 = (w) ((Y1.c) cVar3.f485f).j(obj12);
                        }
                        Z1.i.c(wVar2);
                        return new C0005b(wVar2, intValue, intValue2, str2);
                    case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                        Object obj13 = list6.get(1);
                        C2.c cVar4 = v.f348c;
                        if (!Z1.i.a(obj13, Boolean.FALSE) && obj13 != null) {
                            e3 = (E) ((Y1.c) cVar4.f485f).j(obj13);
                        }
                        Z1.i.c(e3);
                        return new C0005b(e3, intValue, intValue2, str2);
                    case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                        Object obj14 = list6.get(1);
                        C2.c cVar5 = v.f349d;
                        if (!Z1.i.a(obj14, Boolean.FALSE) && obj14 != null) {
                            d3 = (D) ((Y1.c) cVar5.f485f).j(obj14);
                        }
                        Z1.i.c(d3);
                        return new C0005b(d3, intValue, intValue2, str2);
                    case C0438i.LONG_FIELD_NUMBER /* 4 */:
                        Object obj15 = list6.get(1);
                        C2.c cVar6 = v.f350e;
                        if (!Z1.i.a(obj15, Boolean.FALSE) && obj15 != null) {
                            hVar = (h) ((Y1.c) cVar6.f485f).j(obj15);
                        }
                        Z1.i.c(hVar);
                        return new C0005b(hVar, intValue, intValue2, str2);
                    case 5:
                        Object obj16 = list6.get(1);
                        C2.c cVar7 = v.f351f;
                        if (!Z1.i.a(obj16, Boolean.FALSE) && obj16 != null) {
                            gVar = (g) ((Y1.c) cVar7.f485f).j(obj16);
                        }
                        Z1.i.c(gVar);
                        return new C0005b(gVar, intValue, intValue2, str2);
                    case 6:
                        Object obj17 = list6.get(1);
                        String str3 = obj17 != null ? (String) obj17 : null;
                        Z1.i.c(str3);
                        return new C0005b(str3, intValue, intValue2, str2);
                    default:
                        throw new L1.f();
                }
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Float");
                return new L0.a(((Float) obj).floatValue());
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list7 = (List) obj;
                Object obj18 = list7.get(0);
                String str4 = obj18 != null ? (String) obj18 : null;
                Z1.i.c(str4);
                Object obj19 = list7.get(1);
                C2.c cVar8 = v.f354i;
                if (!Z1.i.a(obj19, Boolean.FALSE) && obj19 != null) {
                    a4 = (A) ((Y1.c) cVar8.f485f).j(obj19);
                }
                return new g(str4, a4);
            case 5:
                if (Z1.i.a(obj, Boolean.FALSE)) {
                    return new C0288u(C0288u.f4296f);
                }
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C0288u(AbstractC0259J.b(((Integer) obj).intValue()));
            case 6:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new F0.l(((Integer) obj).intValue());
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj20 = list8.get(0);
                String str5 = obj20 != null ? (String) obj20 : null;
                Z1.i.c(str5);
                Object obj21 = list8.get(1);
                C2.c cVar9 = v.f354i;
                if (!Z1.i.a(obj21, Boolean.FALSE) && obj21 != null) {
                    a3 = (A) ((Y1.c) cVar9.f485f).j(obj21);
                }
                return new h(str5, a3);
            case 8:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i3 < size2) {
                    Object obj22 = list9.get(i3);
                    H0.a aVar = (Z1.i.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (H0.a) ((Y1.c) v.f364t.f485f).j(obj22);
                    Z1.i.c(aVar);
                    arrayList2.add(aVar);
                    i3++;
                }
                return new H0.b(arrayList2);
            case AbstractC0382a.f4777a /* 9 */:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj;
                H0.c.f1851a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str6);
                if (Z1.i.a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new H0.a(forLanguageTag);
            case AbstractC0382a.f4779c /* 10 */:
                if (Z1.i.a(obj, Boolean.FALSE)) {
                    return new a0.c(9205357640488583168L);
                }
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj23 = list10.get(0);
                Float f3 = obj23 != null ? (Float) obj23 : null;
                Z1.i.c(f3);
                float floatValue = f3.floatValue();
                Object obj24 = list10.get(1);
                Float f4 = obj24 != null ? (Float) obj24 : null;
                Z1.i.c(f4);
                return new a0.c(I2.l.f(floatValue, f4.floatValue()));
            case 11:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj25 = list11.get(0);
                L0.f fVar2 = obj25 != null ? (L0.f) obj25 : null;
                Z1.i.c(fVar2);
                Object obj26 = list11.get(1);
                L0.h hVar2 = obj26 != null ? (L0.h) obj26 : null;
                Z1.i.c(hVar2);
                Object obj27 = list11.get(2);
                M0.m[] mVarArr = M0.l.f2779b;
                u uVar = v.f361q;
                Boolean bool2 = Boolean.FALSE;
                M0.l lVar3 = ((Z1.i.a(obj27, bool2) && uVar == null) || obj27 == null) ? null : (M0.l) uVar.f345e.j(obj27);
                Z1.i.c(lVar3);
                Object obj28 = list11.get(3);
                L0.l lVar4 = L0.l.f2690c;
                C2.c cVar10 = v.f357l;
                if (!Z1.i.a(obj28, bool2) && obj28 != null) {
                    lVar2 = (L0.l) ((Y1.c) cVar10.f485f).j(obj28);
                }
                return new o(fVar2.f2681a, hVar2.f2685a, lVar3.f2781a, lVar2, null, null, 0, Integer.MIN_VALUE, null);
            case 12:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                Object obj29 = list12.get(0);
                int i4 = C0288u.f4297g;
                u uVar2 = v.p;
                Boolean bool3 = Boolean.FALSE;
                C0288u c0288u = ((Z1.i.a(obj29, bool3) && uVar2 == null) || obj29 == null) ? null : (C0288u) uVar2.f345e.j(obj29);
                Z1.i.c(c0288u);
                Object obj30 = list12.get(1);
                u uVar3 = v.f362r;
                a0.c cVar11 = ((Z1.i.a(obj30, bool3) && uVar3 == null) || obj30 == null) ? null : (a0.c) uVar3.f345e.j(obj30);
                Z1.i.c(cVar11);
                Object obj31 = list12.get(2);
                Float f5 = obj31 != null ? (Float) obj31 : null;
                Z1.i.c(f5);
                return new C0262M(c0288u.f4298a, cVar11.f3489a, f5.floatValue());
            case 13:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list13 = (List) obj;
                Object obj32 = list13.get(0);
                int i5 = C0288u.f4297g;
                u uVar4 = v.p;
                Boolean bool4 = Boolean.FALSE;
                C0288u c0288u2 = ((Z1.i.a(obj32, bool4) && uVar4 == null) || obj32 == null) ? null : (C0288u) uVar4.f345e.j(obj32);
                Z1.i.c(c0288u2);
                Object obj33 = list13.get(1);
                M0.m[] mVarArr2 = M0.l.f2779b;
                u uVar5 = v.f361q;
                M0.l lVar5 = ((Z1.i.a(obj33, bool4) && uVar5 == null) || obj33 == null) ? null : (M0.l) uVar5.f345e.j(obj33);
                Z1.i.c(lVar5);
                Object obj34 = list13.get(2);
                F0.l lVar6 = F0.l.f1453e;
                F0.l lVar7 = (Z1.i.a(obj34, bool4) || obj34 == null) ? null : (F0.l) ((Y1.c) v.f358m.f485f).j(obj34);
                Object obj35 = list13.get(3);
                F0.j jVar = obj35 != null ? (F0.j) obj35 : null;
                Object obj36 = list13.get(4);
                F0.k kVar = obj36 != null ? (F0.k) obj36 : null;
                Object obj37 = list13.get(6);
                String str7 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list13.get(7);
                M0.l lVar8 = ((Z1.i.a(obj38, bool4) && uVar5 == null) || obj38 == null) ? null : (M0.l) uVar5.f345e.j(obj38);
                Z1.i.c(lVar8);
                Object obj39 = list13.get(8);
                L0.a aVar2 = (Z1.i.a(obj39, bool4) || obj39 == null) ? null : (L0.a) ((Y1.c) v.f359n.f485f).j(obj39);
                Object obj40 = list13.get(9);
                L0.k kVar2 = (Z1.i.a(obj40, bool4) || obj40 == null) ? null : (L0.k) ((Y1.c) v.f356k.f485f).j(obj40);
                Object obj41 = list13.get(10);
                H0.b bVar = H0.b.f1848f;
                H0.b bVar2 = (Z1.i.a(obj41, bool4) || obj41 == null) ? null : (H0.b) ((Y1.c) v.f363s.f485f).j(obj41);
                Object obj42 = list13.get(11);
                C0288u c0288u3 = ((Z1.i.a(obj42, bool4) && uVar4 == null) || obj42 == null) ? null : (C0288u) uVar4.f345e.j(obj42);
                Z1.i.c(c0288u3);
                Object obj43 = list13.get(12);
                L0.g gVar2 = (Z1.i.a(obj43, bool4) || obj43 == null) ? null : (L0.g) ((Y1.c) v.f355j.f485f).j(obj43);
                Object obj44 = list13.get(13);
                C0262M c0262m2 = C0262M.f4239d;
                C2.c cVar12 = v.f360o;
                if (!Z1.i.a(obj44, bool4) && obj44 != null) {
                    c0262m = (C0262M) ((Y1.c) cVar12.f485f).j(obj44);
                }
                return new w(c0288u2.f4298a, lVar5.f2781a, lVar7, jVar, kVar, (F0.r) null, str7, lVar8.f2781a, aVar2, kVar2, bVar2, c0288u3.f4298a, gVar2, c0262m, 49184);
            case 14:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new L0.g(((Integer) obj).intValue());
            case AbstractC0382a.f4781e /* 15 */:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list14 = (List) obj;
                return new L0.k(((Number) list14.get(0)).floatValue(), ((Number) list14.get(1)).floatValue());
            case 16:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list15 = (List) obj;
                Object obj45 = list15.get(0);
                M0.m[] mVarArr3 = M0.l.f2779b;
                u uVar6 = v.f361q;
                Boolean bool5 = Boolean.FALSE;
                M0.l lVar9 = ((Z1.i.a(obj45, bool5) && uVar6 == null) || obj45 == null) ? null : (M0.l) uVar6.f345e.j(obj45);
                Z1.i.c(lVar9);
                Object obj46 = list15.get(1);
                if ((!Z1.i.a(obj46, bool5) || uVar6 != null) && obj46 != null) {
                    lVar = (M0.l) uVar6.f345e.j(obj46);
                }
                Z1.i.c(lVar);
                return new L0.l(lVar9.f2781a, lVar.f2781a);
            case 17:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj47 = list16.get(0);
                C2.c cVar13 = v.f353h;
                Boolean bool6 = Boolean.FALSE;
                w wVar3 = (Z1.i.a(obj47, bool6) || obj47 == null) ? null : (w) ((Y1.c) cVar13.f485f).j(obj47);
                Object obj48 = list16.get(1);
                w wVar4 = (Z1.i.a(obj48, bool6) || obj48 == null) ? null : (w) ((Y1.c) cVar13.f485f).j(obj48);
                Object obj49 = list16.get(2);
                w wVar5 = (Z1.i.a(obj49, bool6) || obj49 == null) ? null : (w) ((Y1.c) cVar13.f485f).j(obj49);
                Object obj50 = list16.get(3);
                if (!Z1.i.a(obj50, bool6) && obj50 != null) {
                    wVar = (w) ((Y1.c) cVar13.f485f).j(obj50);
                }
                return new A(wVar3, wVar4, wVar5, wVar);
            case 18:
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list17 = (List) obj;
                Object obj51 = list17.get(0);
                Integer num3 = obj51 != null ? (Integer) obj51 : null;
                Z1.i.c(num3);
                int intValue3 = num3.intValue();
                Object obj52 = list17.get(1);
                Integer num4 = obj52 != null ? (Integer) obj52 : null;
                Z1.i.c(num4);
                return new B(I2.d.i(intValue3, num4.intValue()));
            case 19:
                if (Z1.i.a(obj, Boolean.FALSE)) {
                    return new M0.l(M0.l.f2780c);
                }
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj53 = list18.get(0);
                Float f6 = obj53 != null ? (Float) obj53 : null;
                Z1.i.c(f6);
                float floatValue2 = f6.floatValue();
                Object obj54 = list18.get(1);
                M0.m mVar = obj54 != null ? (M0.m) obj54 : null;
                Z1.i.c(mVar);
                return new M0.l(AbstractC0157a.N(mVar.f2782a, floatValue2));
            case 20:
                String str8 = obj != null ? (String) obj : null;
                Z1.i.c(str8);
                return new D(str8);
            default:
                String str9 = obj != null ? (String) obj : null;
                Z1.i.c(str9);
                return new E(str9);
        }
    }
}
