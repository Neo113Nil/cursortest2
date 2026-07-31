package C0;

import a0.C0238c;
import android.util.Log;
import b0.C0352v;
import b0.P;
import e2.InterfaceC0424c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import r.AbstractC0856c;
import z.C1256t;

/* loaded from: classes.dex */
public final class A extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f502e;

    /* renamed from: f, reason: collision with root package name */
    public static final A f481f = new A(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final A f482g = new A(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final A f483h = new A(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final A f484i = new A(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final A f485j = new A(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final A f486k = new A(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final A f487l = new A(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final A f488m = new A(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final A f489n = new A(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final A f490o = new A(1, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final A f491p = new A(1, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final A f492q = new A(1, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final A f493r = new A(1, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final A f494s = new A(1, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final A f495t = new A(1, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final A f496u = new A(1, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final A f497v = new A(1, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final A f498w = new A(1, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final A f499x = new A(1, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final A f500y = new A(1, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final A f501z = new A(1, 20);

    /* renamed from: A, reason: collision with root package name */
    public static final A f480A = new A(1, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(int i3, int i4) {
        super(i3);
        this.f502e = i4;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r12v3, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r3v31, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r3v39, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r3v62, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r4v40, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r5v24, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r5v31, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r6v13, types: [e2.c, f2.k] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        int i3 = 0;
        List list = null;
        r9 = null;
        D d3 = null;
        r9 = null;
        O0.m mVar = null;
        r9 = null;
        P p3 = null;
        r9 = null;
        N0.o oVar = null;
        r9 = null;
        I i4 = null;
        r9 = null;
        I i5 = null;
        r9 = null;
        C0035k c0035k = null;
        r9 = null;
        C0036l c0036l = null;
        r9 = null;
        L l3 = null;
        r9 = null;
        M m3 = null;
        r9 = null;
        D d4 = null;
        r9 = null;
        u uVar = null;
        list = null;
        switch (this.f502e) {
            case 0:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj2 = list2.get(1);
                C1256t c1256t = C.f505a;
                Boolean bool = Boolean.FALSE;
                List list3 = (f2.j.a(obj2, bool) || obj2 == null) ? null : (List) ((InterfaceC0424c) c1256t.f10467f).n(obj2);
                Object obj3 = list2.get(2);
                List list4 = (f2.j.a(obj3, bool) || obj3 == null) ? null : (List) ((InterfaceC0424c) c1256t.f10467f).n(obj3);
                Object obj4 = list2.get(0);
                String str = obj4 != null ? (String) obj4 : null;
                f2.j.c(str);
                if (list3 == null || list3.isEmpty()) {
                    list3 = null;
                }
                if (list4 == null || list4.isEmpty()) {
                    list4 = null;
                }
                Object obj5 = list2.get(3);
                if (!f2.j.a(obj5, bool) && obj5 != null) {
                    list = (List) ((InterfaceC0424c) c1256t.f10467f).n(obj5);
                }
                return new C0031g(str, list3, list4, list);
            case 1:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i3 < size) {
                    Object obj6 = list5.get(i3);
                    C0029e c0029e = (f2.j.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (C0029e) ((InterfaceC0424c) C.f506b.f10467f).n(obj6);
                    f2.j.c(c0029e);
                    arrayList.add(c0029e);
                    i3++;
                }
                return arrayList;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                EnumC0033i enumC0033i = obj7 != null ? (EnumC0033i) obj7 : null;
                f2.j.c(enumC0033i);
                Object obj8 = list6.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                f2.j.c(num);
                int intValue = num.intValue();
                Object obj9 = list6.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                f2.j.c(num2);
                int intValue2 = num2.intValue();
                Object obj10 = list6.get(4);
                String str2 = obj10 != null ? (String) obj10 : null;
                f2.j.c(str2);
                switch (enumC0033i.ordinal()) {
                    case 0:
                        Object obj11 = list6.get(1);
                        C1256t c1256t2 = C.f511g;
                        if (!f2.j.a(obj11, Boolean.FALSE) && obj11 != null) {
                            uVar = (u) ((InterfaceC0424c) c1256t2.f10467f).n(obj11);
                        }
                        f2.j.c(uVar);
                        return new C0029e(intValue, intValue2, uVar, str2);
                    case 1:
                        Object obj12 = list6.get(1);
                        C1256t c1256t3 = C.f512h;
                        if (!f2.j.a(obj12, Boolean.FALSE) && obj12 != null) {
                            d4 = (D) ((InterfaceC0424c) c1256t3.f10467f).n(obj12);
                        }
                        f2.j.c(d4);
                        return new C0029e(intValue, intValue2, d4, str2);
                    case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                        Object obj13 = list6.get(1);
                        C1256t c1256t4 = C.f507c;
                        if (!f2.j.a(obj13, Boolean.FALSE) && obj13 != null) {
                            m3 = (M) ((InterfaceC0424c) c1256t4.f10467f).n(obj13);
                        }
                        f2.j.c(m3);
                        return new C0029e(intValue, intValue2, m3, str2);
                    case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                        Object obj14 = list6.get(1);
                        C1256t c1256t5 = C.f508d;
                        if (!f2.j.a(obj14, Boolean.FALSE) && obj14 != null) {
                            l3 = (L) ((InterfaceC0424c) c1256t5.f10467f).n(obj14);
                        }
                        f2.j.c(l3);
                        return new C0029e(intValue, intValue2, l3, str2);
                    case k1.i.LONG_FIELD_NUMBER /* 4 */:
                        Object obj15 = list6.get(1);
                        C1256t c1256t6 = C.f509e;
                        if (!f2.j.a(obj15, Boolean.FALSE) && obj15 != null) {
                            c0036l = (C0036l) ((InterfaceC0424c) c1256t6.f10467f).n(obj15);
                        }
                        f2.j.c(c0036l);
                        return new C0029e(intValue, intValue2, c0036l, str2);
                    case 5:
                        Object obj16 = list6.get(1);
                        C1256t c1256t7 = C.f510f;
                        if (!f2.j.a(obj16, Boolean.FALSE) && obj16 != null) {
                            c0035k = (C0035k) ((InterfaceC0424c) c1256t7.f10467f).n(obj16);
                        }
                        f2.j.c(c0035k);
                        return new C0029e(intValue, intValue2, c0035k, str2);
                    case 6:
                        Object obj17 = list6.get(1);
                        String str3 = obj17 != null ? (String) obj17 : null;
                        f2.j.c(str3);
                        return new C0029e(intValue, intValue2, str3, str2);
                    default:
                        throw new C1.c();
                }
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.Float");
                return new N0.a(((Float) obj).floatValue());
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list7 = (List) obj;
                Object obj18 = list7.get(0);
                String str4 = obj18 != null ? (String) obj18 : null;
                f2.j.c(str4);
                Object obj19 = list7.get(1);
                C1256t c1256t8 = C.f513i;
                if (!f2.j.a(obj19, Boolean.FALSE) && obj19 != null) {
                    i5 = (I) ((InterfaceC0424c) c1256t8.f10467f).n(obj19);
                }
                return new C0035k(str4, i5);
            case 5:
                if (f2.j.a(obj, Boolean.FALSE)) {
                    return new C0352v(C0352v.f5439g);
                }
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C0352v(b0.M.c(((Integer) obj).intValue()));
            case 6:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new H0.k(((Integer) obj).intValue());
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj20 = list8.get(0);
                String str5 = obj20 != null ? (String) obj20 : null;
                f2.j.c(str5);
                Object obj21 = list8.get(1);
                C1256t c1256t9 = C.f513i;
                if (!f2.j.a(obj21, Boolean.FALSE) && obj21 != null) {
                    i4 = (I) ((InterfaceC0424c) c1256t9.f10467f).n(obj21);
                }
                return new C0036l(str5, i4);
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i3 < size2) {
                    Object obj22 = list9.get(i3);
                    J0.a aVar = (f2.j.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (J0.a) ((InterfaceC0424c) C.f524t.f10467f).n(obj22);
                    f2.j.c(aVar);
                    arrayList2.add(aVar);
                    i3++;
                }
                return new J0.b(arrayList2);
            case AbstractC0856c.f8037c /* 9 */:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj;
                J0.c.f3158a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str6);
                if (f2.j.a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new J0.a(forLanguageTag);
            case AbstractC0856c.f8039e /* 10 */:
                if (f2.j.a(obj, Boolean.FALSE)) {
                    return new C0238c(9205357640488583168L);
                }
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj23 = list10.get(0);
                Float f3 = obj23 != null ? (Float) obj23 : null;
                f2.j.c(f3);
                float floatValue = f3.floatValue();
                Object obj24 = list10.get(1);
                Float f4 = obj24 != null ? (Float) obj24 : null;
                f2.j.c(f4);
                return new C0238c(l0.c.e(floatValue, f4.floatValue()));
            case 11:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj25 = list11.get(0);
                N0.i iVar = obj25 != null ? (N0.i) obj25 : null;
                f2.j.c(iVar);
                Object obj26 = list11.get(1);
                N0.k kVar = obj26 != null ? (N0.k) obj26 : null;
                f2.j.c(kVar);
                Object obj27 = list11.get(2);
                O0.n[] nVarArr = O0.m.f3745b;
                B b3 = C.f521q;
                Boolean bool2 = Boolean.FALSE;
                O0.m mVar2 = ((f2.j.a(obj27, bool2) && b3 == null) || obj27 == null) ? null : (O0.m) b3.f504e.n(obj27);
                f2.j.c(mVar2);
                Object obj28 = list11.get(3);
                N0.o oVar2 = N0.o.f3557c;
                C1256t c1256t10 = C.f516l;
                if (!f2.j.a(obj28, bool2) && obj28 != null) {
                    oVar = (N0.o) ((InterfaceC0424c) c1256t10.f10467f).n(obj28);
                }
                return new u(iVar.f3547a, kVar.f3552a, mVar2.f3747a, oVar, null, null, 0, Integer.MIN_VALUE, null);
            case 12:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                Object obj29 = list12.get(0);
                int i6 = C0352v.f5440h;
                B b4 = C.f520p;
                Boolean bool3 = Boolean.FALSE;
                C0352v c0352v = ((f2.j.a(obj29, bool3) && b4 == null) || obj29 == null) ? null : (C0352v) b4.f504e.n(obj29);
                f2.j.c(c0352v);
                Object obj30 = list12.get(1);
                B b5 = C.f522r;
                C0238c c0238c = ((f2.j.a(obj30, bool3) && b5 == null) || obj30 == null) ? null : (C0238c) b5.f504e.n(obj30);
                f2.j.c(c0238c);
                Object obj31 = list12.get(2);
                Float f5 = obj31 != null ? (Float) obj31 : null;
                f2.j.c(f5);
                return new P(c0352v.f5441a, c0238c.f4722a, f5.floatValue());
            case 13:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list13 = (List) obj;
                Object obj32 = list13.get(0);
                int i7 = C0352v.f5440h;
                B b6 = C.f520p;
                Boolean bool4 = Boolean.FALSE;
                C0352v c0352v2 = ((f2.j.a(obj32, bool4) && b6 == null) || obj32 == null) ? null : (C0352v) b6.f504e.n(obj32);
                f2.j.c(c0352v2);
                Object obj33 = list13.get(1);
                O0.n[] nVarArr2 = O0.m.f3745b;
                B b7 = C.f521q;
                O0.m mVar3 = ((f2.j.a(obj33, bool4) && b7 == null) || obj33 == null) ? null : (O0.m) b7.f504e.n(obj33);
                f2.j.c(mVar3);
                Object obj34 = list13.get(2);
                H0.k kVar2 = H0.k.f2596e;
                H0.k kVar3 = (f2.j.a(obj34, bool4) || obj34 == null) ? null : (H0.k) ((InterfaceC0424c) C.f517m.f10467f).n(obj34);
                Object obj35 = list13.get(3);
                H0.i iVar2 = obj35 != null ? (H0.i) obj35 : null;
                Object obj36 = list13.get(4);
                H0.j jVar = obj36 != null ? (H0.j) obj36 : null;
                Object obj37 = list13.get(6);
                String str7 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list13.get(7);
                O0.m mVar4 = ((f2.j.a(obj38, bool4) && b7 == null) || obj38 == null) ? null : (O0.m) b7.f504e.n(obj38);
                f2.j.c(mVar4);
                Object obj39 = list13.get(8);
                N0.a aVar2 = (f2.j.a(obj39, bool4) || obj39 == null) ? null : (N0.a) ((InterfaceC0424c) C.f518n.f10467f).n(obj39);
                Object obj40 = list13.get(9);
                N0.n nVar = (f2.j.a(obj40, bool4) || obj40 == null) ? null : (N0.n) ((InterfaceC0424c) C.f515k.f10467f).n(obj40);
                Object obj41 = list13.get(10);
                J0.b bVar = J0.b.f3155f;
                J0.b bVar2 = (f2.j.a(obj41, bool4) || obj41 == null) ? null : (J0.b) ((InterfaceC0424c) C.f523s.f10467f).n(obj41);
                Object obj42 = list13.get(11);
                C0352v c0352v3 = ((f2.j.a(obj42, bool4) && b6 == null) || obj42 == null) ? null : (C0352v) b6.f504e.n(obj42);
                f2.j.c(c0352v3);
                Object obj43 = list13.get(12);
                N0.j jVar2 = (f2.j.a(obj43, bool4) || obj43 == null) ? null : (N0.j) ((InterfaceC0424c) C.f514j.f10467f).n(obj43);
                Object obj44 = list13.get(13);
                P p4 = P.f5380d;
                C1256t c1256t11 = C.f519o;
                if (!f2.j.a(obj44, bool4) && obj44 != null) {
                    p3 = (P) ((InterfaceC0424c) c1256t11.f10467f).n(obj44);
                }
                return new D(c0352v2.f5441a, mVar3.f3747a, kVar3, iVar2, jVar, null, str7, mVar4.f3747a, aVar2, nVar, bVar2, c0352v3.f5441a, jVar2, p3, 49184);
            case 14:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new N0.j(((Integer) obj).intValue());
            case AbstractC0856c.f8041g /* 15 */:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list14 = (List) obj;
                return new N0.n(((Number) list14.get(0)).floatValue(), ((Number) list14.get(1)).floatValue());
            case 16:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list15 = (List) obj;
                Object obj45 = list15.get(0);
                O0.n[] nVarArr3 = O0.m.f3745b;
                B b8 = C.f521q;
                Boolean bool5 = Boolean.FALSE;
                O0.m mVar5 = ((f2.j.a(obj45, bool5) && b8 == null) || obj45 == null) ? null : (O0.m) b8.f504e.n(obj45);
                f2.j.c(mVar5);
                Object obj46 = list15.get(1);
                if ((!f2.j.a(obj46, bool5) || b8 != null) && obj46 != null) {
                    mVar = (O0.m) b8.f504e.n(obj46);
                }
                f2.j.c(mVar);
                return new N0.o(mVar5.f3747a, mVar.f3747a);
            case 17:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj47 = list16.get(0);
                C1256t c1256t12 = C.f512h;
                Boolean bool6 = Boolean.FALSE;
                D d5 = (f2.j.a(obj47, bool6) || obj47 == null) ? null : (D) ((InterfaceC0424c) c1256t12.f10467f).n(obj47);
                Object obj48 = list16.get(1);
                D d6 = (f2.j.a(obj48, bool6) || obj48 == null) ? null : (D) ((InterfaceC0424c) c1256t12.f10467f).n(obj48);
                Object obj49 = list16.get(2);
                D d7 = (f2.j.a(obj49, bool6) || obj49 == null) ? null : (D) ((InterfaceC0424c) c1256t12.f10467f).n(obj49);
                Object obj50 = list16.get(3);
                if (!f2.j.a(obj50, bool6) && obj50 != null) {
                    d3 = (D) ((InterfaceC0424c) c1256t12.f10467f).n(obj50);
                }
                return new I(d5, d6, d7, d3);
            case 18:
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list17 = (List) obj;
                Object obj51 = list17.get(0);
                Integer num3 = obj51 != null ? (Integer) obj51 : null;
                f2.j.c(num3);
                int intValue3 = num3.intValue();
                Object obj52 = list17.get(1);
                Integer num4 = obj52 != null ? (Integer) obj52 : null;
                f2.j.c(num4);
                return new J(O2.l.J(intValue3, num4.intValue()));
            case 19:
                if (f2.j.a(obj, Boolean.FALSE)) {
                    return new O0.m(O0.m.f3746c);
                }
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj53 = list18.get(0);
                Float f6 = obj53 != null ? (Float) obj53 : null;
                f2.j.c(f6);
                float floatValue2 = f6.floatValue();
                Object obj54 = list18.get(1);
                O0.n nVar2 = obj54 != null ? (O0.n) obj54 : null;
                f2.j.c(nVar2);
                return new O0.m(O2.l.q0(nVar2.f3748a, floatValue2));
            case 20:
                String str8 = obj != null ? (String) obj : null;
                f2.j.c(str8);
                return new L(str8);
            default:
                String str9 = obj != null ? (String) obj : null;
                f2.j.c(str9);
                return new M(str9);
        }
    }
}
