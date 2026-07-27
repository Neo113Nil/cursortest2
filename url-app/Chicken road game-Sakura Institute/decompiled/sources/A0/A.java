package A0;

import Z.C0323u;
import Z.O;
import a.AbstractC0345a;
import android.util.Log;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import y2.C1338m;

/* loaded from: classes.dex */
public final class A extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f233d;

    /* renamed from: e, reason: collision with root package name */
    public static final A f214e = new A(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final A f215i = new A(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final A f216j = new A(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final A f217k = new A(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final A f218l = new A(1, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final A f219m = new A(1, 5);

    /* renamed from: n, reason: collision with root package name */
    public static final A f220n = new A(1, 6);

    /* renamed from: o, reason: collision with root package name */
    public static final A f221o = new A(1, 7);

    /* renamed from: p, reason: collision with root package name */
    public static final A f222p = new A(1, 8);

    /* renamed from: q, reason: collision with root package name */
    public static final A f223q = new A(1, 9);

    /* renamed from: r, reason: collision with root package name */
    public static final A f224r = new A(1, 10);

    /* renamed from: s, reason: collision with root package name */
    public static final A f225s = new A(1, 11);

    /* renamed from: t, reason: collision with root package name */
    public static final A f226t = new A(1, 12);

    /* renamed from: u, reason: collision with root package name */
    public static final A f227u = new A(1, 13);

    /* renamed from: v, reason: collision with root package name */
    public static final A f228v = new A(1, 14);

    /* renamed from: w, reason: collision with root package name */
    public static final A f229w = new A(1, 15);

    /* renamed from: x, reason: collision with root package name */
    public static final A f230x = new A(1, 16);

    /* renamed from: y, reason: collision with root package name */
    public static final A f231y = new A(1, 17);

    /* renamed from: z, reason: collision with root package name */
    public static final A f232z = new A(1, 18);

    /* renamed from: A, reason: collision with root package name */
    public static final A f212A = new A(1, 19);
    public static final A B = new A(1, 20);

    /* renamed from: C, reason: collision with root package name */
    public static final A f213C = new A(1, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(int i2, int i4) {
        super(i2);
        this.f233d = i4;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v3, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v31, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v39, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v62, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v40, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v24, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v31, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v13, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i2 = 0;
        List list = null;
        r9 = null;
        D d4 = null;
        r9 = null;
        M0.m mVar = null;
        r9 = null;
        O o4 = null;
        r9 = null;
        L0.p pVar = null;
        r9 = null;
        J j4 = null;
        r9 = null;
        J j5 = null;
        r9 = null;
        C0040k c0040k = null;
        r9 = null;
        C0041l c0041l = null;
        r9 = null;
        M m4 = null;
        r9 = null;
        N n2 = null;
        r9 = null;
        D d5 = null;
        r9 = null;
        u uVar = null;
        list = null;
        switch (this.f233d) {
            case 0:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj2 = list2.get(1);
                y.t tVar = C.f236a;
                Boolean bool = Boolean.FALSE;
                List list3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (List) ((Function1) tVar.f11495i).invoke(obj2);
                Object obj3 = list2.get(2);
                List list4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (List) ((Function1) tVar.f11495i).invoke(obj3);
                Object obj4 = list2.get(0);
                String str = obj4 != null ? (String) obj4 : null;
                Intrinsics.c(str);
                if (list3 == null || list3.isEmpty()) {
                    list3 = null;
                }
                if (list4 == null || list4.isEmpty()) {
                    list4 = null;
                }
                Object obj5 = list2.get(3);
                if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                    list = (List) ((Function1) tVar.f11495i).invoke(obj5);
                }
                return new C0036g(str, list3, list4, list);
            case 1:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i2 < size) {
                    Object obj6 = list5.get(i2);
                    C0034e c0034e = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (C0034e) ((Function1) C.f237b.f11495i).invoke(obj6);
                    Intrinsics.c(c0034e);
                    arrayList.add(c0034e);
                    i2++;
                }
                return arrayList;
            case 2:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                EnumC0038i enumC0038i = obj7 != null ? (EnumC0038i) obj7 : null;
                Intrinsics.c(enumC0038i);
                Object obj8 = list6.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                Intrinsics.c(num);
                int intValue = num.intValue();
                Object obj9 = list6.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                Intrinsics.c(num2);
                int intValue2 = num2.intValue();
                Object obj10 = list6.get(4);
                String str2 = obj10 != null ? (String) obj10 : null;
                Intrinsics.c(str2);
                switch (enumC0038i.ordinal()) {
                    case 0:
                        Object obj11 = list6.get(1);
                        y.t tVar2 = C.f242g;
                        if (!Intrinsics.a(obj11, Boolean.FALSE) && obj11 != null) {
                            uVar = (u) ((Function1) tVar2.f11495i).invoke(obj11);
                        }
                        Intrinsics.c(uVar);
                        return new C0034e(uVar, intValue, intValue2, str2);
                    case 1:
                        Object obj12 = list6.get(1);
                        y.t tVar3 = C.f243h;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            d5 = (D) ((Function1) tVar3.f11495i).invoke(obj12);
                        }
                        Intrinsics.c(d5);
                        return new C0034e(d5, intValue, intValue2, str2);
                    case 2:
                        Object obj13 = list6.get(1);
                        y.t tVar4 = C.f238c;
                        if (!Intrinsics.a(obj13, Boolean.FALSE) && obj13 != null) {
                            n2 = (N) ((Function1) tVar4.f11495i).invoke(obj13);
                        }
                        Intrinsics.c(n2);
                        return new C0034e(n2, intValue, intValue2, str2);
                    case 3:
                        Object obj14 = list6.get(1);
                        y.t tVar5 = C.f239d;
                        if (!Intrinsics.a(obj14, Boolean.FALSE) && obj14 != null) {
                            m4 = (M) ((Function1) tVar5.f11495i).invoke(obj14);
                        }
                        Intrinsics.c(m4);
                        return new C0034e(m4, intValue, intValue2, str2);
                    case 4:
                        Object obj15 = list6.get(1);
                        y.t tVar6 = C.f240e;
                        if (!Intrinsics.a(obj15, Boolean.FALSE) && obj15 != null) {
                            c0041l = (C0041l) ((Function1) tVar6.f11495i).invoke(obj15);
                        }
                        Intrinsics.c(c0041l);
                        return new C0034e(c0041l, intValue, intValue2, str2);
                    case 5:
                        Object obj16 = list6.get(1);
                        y.t tVar7 = C.f241f;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            c0040k = (C0040k) ((Function1) tVar7.f11495i).invoke(obj16);
                        }
                        Intrinsics.c(c0040k);
                        return new C0034e(c0040k, intValue, intValue2, str2);
                    case 6:
                        Object obj17 = list6.get(1);
                        String str3 = obj17 != null ? (String) obj17 : null;
                        Intrinsics.c(str3);
                        return new C0034e(str3, intValue, intValue2, str2);
                    default:
                        throw new C1338m();
                }
            case 3:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Float");
                return new L0.a(((Float) obj).floatValue());
            case 4:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list7 = (List) obj;
                Object obj18 = list7.get(0);
                String str4 = obj18 != null ? (String) obj18 : null;
                Intrinsics.c(str4);
                Object obj19 = list7.get(1);
                y.t tVar8 = C.f244i;
                if (!Intrinsics.a(obj19, Boolean.FALSE) && obj19 != null) {
                    j5 = (J) ((Function1) tVar8.f11495i).invoke(obj19);
                }
                return new C0040k(str4, j5);
            case 5:
                if (Intrinsics.a(obj, Boolean.FALSE)) {
                    return new C0323u(C0323u.f4547g);
                }
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C0323u(Z.K.c(((Integer) obj).intValue()));
            case 6:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new F0.k(((Integer) obj).intValue());
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj20 = list8.get(0);
                String str5 = obj20 != null ? (String) obj20 : null;
                Intrinsics.c(str5);
                Object obj21 = list8.get(1);
                y.t tVar9 = C.f244i;
                if (!Intrinsics.a(obj21, Boolean.FALSE) && obj21 != null) {
                    j4 = (J) ((Function1) tVar9.f11495i).invoke(obj21);
                }
                return new C0041l(str5, j4);
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i2 < size2) {
                    Object obj22 = list9.get(i2);
                    H0.a aVar = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (H0.a) ((Function1) C.f255t.f11495i).invoke(obj22);
                    Intrinsics.c(aVar);
                    arrayList2.add(aVar);
                    i2++;
                }
                return new H0.b(arrayList2);
            case AbstractC1024c.f9242c /* 9 */:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj;
                H0.c.f3228a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str6);
                if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new H0.a(forLanguageTag);
            case 10:
                if (Intrinsics.a(obj, Boolean.FALSE)) {
                    return new Y.c(9205357640488583168L);
                }
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj23 = list10.get(0);
                Float f4 = obj23 != null ? (Float) obj23 : null;
                Intrinsics.c(f4);
                float floatValue = f4.floatValue();
                Object obj24 = list10.get(1);
                Float f5 = obj24 != null ? (Float) obj24 : null;
                Intrinsics.c(f5);
                return new Y.c(AbstractC0345a.c(floatValue, f5.floatValue()));
            case RequestError.STOP_TRACKING /* 11 */:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj25 = list11.get(0);
                L0.i iVar = obj25 != null ? (L0.i) obj25 : null;
                Intrinsics.c(iVar);
                Object obj26 = list11.get(1);
                L0.k kVar = obj26 != null ? (L0.k) obj26 : null;
                Intrinsics.c(kVar);
                Object obj27 = list11.get(2);
                M0.n[] nVarArr = M0.m.f3559b;
                B b4 = C.f252q;
                Boolean bool2 = Boolean.FALSE;
                M0.m mVar2 = ((Intrinsics.a(obj27, bool2) && b4 == null) || obj27 == null) ? null : (M0.m) b4.f235e.invoke(obj27);
                Intrinsics.c(mVar2);
                Object obj28 = list11.get(3);
                L0.p pVar2 = L0.p.f3521c;
                y.t tVar10 = C.f247l;
                if (!Intrinsics.a(obj28, bool2) && obj28 != null) {
                    pVar = (L0.p) ((Function1) tVar10.f11495i).invoke(obj28);
                }
                return new u(iVar.f3509a, kVar.f3514a, mVar2.f3561a, pVar, null, null, 0, Integer.MIN_VALUE, null);
            case 12:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                Object obj29 = list12.get(0);
                int i4 = C0323u.f4548h;
                B b5 = C.f251p;
                Boolean bool3 = Boolean.FALSE;
                C0323u c0323u = ((Intrinsics.a(obj29, bool3) && b5 == null) || obj29 == null) ? null : (C0323u) b5.f235e.invoke(obj29);
                Intrinsics.c(c0323u);
                Object obj30 = list12.get(1);
                B b6 = C.f253r;
                Y.c cVar = ((Intrinsics.a(obj30, bool3) && b6 == null) || obj30 == null) ? null : (Y.c) b6.f235e.invoke(obj30);
                Intrinsics.c(cVar);
                Object obj31 = list12.get(2);
                Float f6 = obj31 != null ? (Float) obj31 : null;
                Intrinsics.c(f6);
                return new O(c0323u.f4549a, cVar.f4372a, f6.floatValue());
            case 13:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list13 = (List) obj;
                Object obj32 = list13.get(0);
                int i5 = C0323u.f4548h;
                B b7 = C.f251p;
                Boolean bool4 = Boolean.FALSE;
                C0323u c0323u2 = ((Intrinsics.a(obj32, bool4) && b7 == null) || obj32 == null) ? null : (C0323u) b7.f235e.invoke(obj32);
                Intrinsics.c(c0323u2);
                Object obj33 = list13.get(1);
                M0.n[] nVarArr2 = M0.m.f3559b;
                B b8 = C.f252q;
                M0.m mVar3 = ((Intrinsics.a(obj33, bool4) && b8 == null) || obj33 == null) ? null : (M0.m) b8.f235e.invoke(obj33);
                Intrinsics.c(mVar3);
                Object obj34 = list13.get(2);
                F0.k kVar2 = F0.k.f2613e;
                F0.k kVar3 = (Intrinsics.a(obj34, bool4) || obj34 == null) ? null : (F0.k) ((Function1) C.f248m.f11495i).invoke(obj34);
                Object obj35 = list13.get(3);
                F0.i iVar2 = obj35 != null ? (F0.i) obj35 : null;
                Object obj36 = list13.get(4);
                F0.j jVar = obj36 != null ? (F0.j) obj36 : null;
                Object obj37 = list13.get(6);
                String str7 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list13.get(7);
                M0.m mVar4 = ((Intrinsics.a(obj38, bool4) && b8 == null) || obj38 == null) ? null : (M0.m) b8.f235e.invoke(obj38);
                Intrinsics.c(mVar4);
                Object obj39 = list13.get(8);
                L0.a aVar2 = (Intrinsics.a(obj39, bool4) || obj39 == null) ? null : (L0.a) ((Function1) C.f249n.f11495i).invoke(obj39);
                Object obj40 = list13.get(9);
                L0.o oVar = (Intrinsics.a(obj40, bool4) || obj40 == null) ? null : (L0.o) ((Function1) C.f246k.f11495i).invoke(obj40);
                Object obj41 = list13.get(10);
                H0.b bVar = H0.b.f3225i;
                H0.b bVar2 = (Intrinsics.a(obj41, bool4) || obj41 == null) ? null : (H0.b) ((Function1) C.f254s.f11495i).invoke(obj41);
                Object obj42 = list13.get(11);
                C0323u c0323u3 = ((Intrinsics.a(obj42, bool4) && b7 == null) || obj42 == null) ? null : (C0323u) b7.f235e.invoke(obj42);
                Intrinsics.c(c0323u3);
                Object obj43 = list13.get(12);
                L0.j jVar2 = (Intrinsics.a(obj43, bool4) || obj43 == null) ? null : (L0.j) ((Function1) C.f245j.f11495i).invoke(obj43);
                Object obj44 = list13.get(13);
                O o5 = O.f4488d;
                y.t tVar11 = C.f250o;
                if (!Intrinsics.a(obj44, bool4) && obj44 != null) {
                    o4 = (O) ((Function1) tVar11.f11495i).invoke(obj44);
                }
                return new D(c0323u2.f4549a, mVar3.f3561a, kVar3, iVar2, jVar, null, str7, mVar4.f3561a, aVar2, oVar, bVar2, c0323u3.f4549a, jVar2, o4, 49184);
            case 14:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new L0.j(((Integer) obj).intValue());
            case AbstractC1024c.f9246g /* 15 */:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list14 = (List) obj;
                return new L0.o(((Number) list14.get(0)).floatValue(), ((Number) list14.get(1)).floatValue());
            case 16:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list15 = (List) obj;
                Object obj45 = list15.get(0);
                M0.n[] nVarArr3 = M0.m.f3559b;
                B b9 = C.f252q;
                Boolean bool5 = Boolean.FALSE;
                M0.m mVar5 = ((Intrinsics.a(obj45, bool5) && b9 == null) || obj45 == null) ? null : (M0.m) b9.f235e.invoke(obj45);
                Intrinsics.c(mVar5);
                Object obj46 = list15.get(1);
                if ((!Intrinsics.a(obj46, bool5) || b9 != null) && obj46 != null) {
                    mVar = (M0.m) b9.f235e.invoke(obj46);
                }
                Intrinsics.c(mVar);
                return new L0.p(mVar5.f3561a, mVar.f3561a);
            case 17:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj47 = list16.get(0);
                y.t tVar12 = C.f243h;
                Boolean bool6 = Boolean.FALSE;
                D d6 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (D) ((Function1) tVar12.f11495i).invoke(obj47);
                Object obj48 = list16.get(1);
                D d7 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (D) ((Function1) tVar12.f11495i).invoke(obj48);
                Object obj49 = list16.get(2);
                D d8 = (Intrinsics.a(obj49, bool6) || obj49 == null) ? null : (D) ((Function1) tVar12.f11495i).invoke(obj49);
                Object obj50 = list16.get(3);
                if (!Intrinsics.a(obj50, bool6) && obj50 != null) {
                    d4 = (D) ((Function1) tVar12.f11495i).invoke(obj50);
                }
                return new J(d6, d7, d8, d4);
            case 18:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list17 = (List) obj;
                Object obj51 = list17.get(0);
                Integer num3 = obj51 != null ? (Integer) obj51 : null;
                Intrinsics.c(num3);
                int intValue3 = num3.intValue();
                Object obj52 = list17.get(1);
                Integer num4 = obj52 != null ? (Integer) obj52 : null;
                Intrinsics.c(num4);
                return new K(M1.a.j(intValue3, num4.intValue()));
            case 19:
                if (Intrinsics.a(obj, Boolean.FALSE)) {
                    return new M0.m(M0.m.f3560c);
                }
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj53 = list18.get(0);
                Float f7 = obj53 != null ? (Float) obj53 : null;
                Intrinsics.c(f7);
                float floatValue2 = f7.floatValue();
                Object obj54 = list18.get(1);
                M0.n nVar = obj54 != null ? (M0.n) obj54 : null;
                Intrinsics.c(nVar);
                return new M0.m(u3.l.p0(floatValue2, nVar.f3562a));
            case 20:
                String str8 = obj != null ? (String) obj : null;
                Intrinsics.c(str8);
                return new M(str8);
            default:
                String str9 = obj != null ? (String) obj : null;
                Intrinsics.c(str9);
                return new N(str9);
        }
    }
}
