package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class il implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ il(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:348:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x09f5  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        int i;
        boolean z;
        ue0 ue0Var;
        Function1 function1;
        ef1 ef1Var;
        int i2;
        int i3;
        int i4;
        IntRange intRange;
        List list;
        wf0 wf0Var;
        long j;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        List list2;
        String str;
        int i11;
        List list3;
        sf0 sf0Var;
        int i12;
        boolean z2;
        ue0 ue0Var2;
        int i13;
        nv nvVar;
        Integer valueOf;
        ef1 ef1Var2;
        List list4;
        rf0 rf0Var;
        int i14;
        dn0 dn0Var;
        int i15;
        int i16;
        int a;
        Object obj3;
        int i17;
        int i18;
        int i19;
        int i20;
        int max;
        int i21;
        int i22;
        int i23;
        int i24 = this.d;
        int i25 = 6;
        j41 j41Var = bl.a;
        Object obj4 = this.g;
        Object obj5 = this.e;
        switch (i24) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i21 i21Var = (i21) obj5;
                db1 db1Var = (db1) obj4;
                int intValue = ((Integer) obj).intValue();
                if (obj2 instanceof mk) {
                    i21Var.f.b((mk) obj2);
                } else if (!(obj2 instanceof p31)) {
                    if (obj2 instanceof k21) {
                        la0.V(db1Var, intValue, obj2);
                        i21Var.e((k21) obj2);
                    } else if (obj2 instanceof i11) {
                        la0.V(db1Var, intValue, obj2);
                        ((i11) obj2).c();
                    }
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                p4.f((e40) obj5, (Function0) obj4, (hl) obj, gb0.P(1));
                return Unit.a;
            case 2:
                pe0 pe0Var = (pe0) obj5;
                oe0 oe0Var = (oe0) obj4;
                Object obj6 = oe0Var.a;
                hl hlVar = (hl) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (hlVar.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    mf0 mf0Var = (mf0) pe0Var.b.invoke();
                    int i26 = oe0Var.c;
                    if (i26 >= mf0Var.c() || !mf0Var.d(i26).equals(obj6)) {
                        i26 = mf0Var.d.b(obj6);
                        i = -1;
                        if (i26 != -1) {
                            oe0Var.c = i26;
                        }
                    } else {
                        i = -1;
                    }
                    int i27 = i26;
                    if (i27 != i) {
                        hlVar.W(-1664741271);
                        gb0.b(mf0Var, pe0Var.a, i27, obj6, hlVar, 0);
                        z = false;
                    } else {
                        z = false;
                        hlVar.W(-1668376610);
                    }
                    hlVar.p(z);
                    boolean h = hlVar.h(oe0Var);
                    Object L = hlVar.L();
                    if (h || L == j41Var) {
                        L = new l(i25, oe0Var);
                        hlVar.h0(L);
                    }
                    p4.b(obj6, (Function1) L, hlVar);
                } else {
                    hlVar.R();
                }
                return Unit.a;
            case 3:
                boolean a2 = ba0.a(0L, 0L);
                qf0 qf0Var = (qf0) obj4;
                ef1 ef1Var3 = (ef1) obj;
                ue0 ue0Var3 = new ue0((pe0) obj5, ef1Var3);
                long j2 = ((mm) obj2).a;
                qf0Var.getClass();
                j9 j9Var = qf0Var.d;
                ku0 ku0Var = qf0Var.b;
                wf0 wf0Var2 = qf0Var.a;
                ao0 ao0Var = wf0Var2.s;
                vg vgVar = wf0Var2.e;
                ao0Var.getValue();
                boolean z3 = wf0Var2.b || ef1Var3.m();
                p4.s(j2, et0.d);
                ef1Var3.getLayoutDirection();
                ku0Var.getClass();
                vc0 vc0Var = vc0.d;
                int H = ef1Var3.H(0.0f);
                ef1Var3.getLayoutDirection();
                ku0Var.getClass();
                int H2 = ef1Var3.H(0.0f);
                ku0Var.getClass();
                int H3 = ef1Var3.H(0.0f);
                int H4 = ef1Var3.H(0.0f) + H3;
                int i28 = H2 + H;
                int i29 = H4 - H3;
                long h2 = nm.h(j2, -i28, -H4);
                mf0 mf0Var2 = (mf0) qf0Var.c.invoke();
                de0 de0Var = mf0Var2.c;
                int h3 = mm.h(h2);
                int g = mm.g(h2);
                de0Var.a.i(h3);
                de0Var.b.i(g);
                if (j9Var == null) {
                    r80.b("null verticalArrangement when isVertical == true");
                    throw new kc0();
                }
                int H5 = ef1Var3.H(j9Var.a());
                int c = mf0Var2.c();
                int g2 = mm.g(j2) - H4;
                pf0 pf0Var = new pf0(h2, mf0Var2, ue0Var3, c, H5, qf0Var.g, H3, i29, (H << 32) | (H3 & 4294967295L), qf0Var.a);
                ib1 n = ca0.n();
                Integer num = null;
                if (n != null) {
                    ue0Var = ue0Var3;
                    function1 = n.e();
                } else {
                    ue0Var = ue0Var3;
                    function1 = null;
                }
                ib1 s = ca0.s(n);
                try {
                    int h4 = ((xu0) vgVar.b).h();
                    int m = t80.m(h4, mf0Var2, vgVar.d);
                    if (h4 != m) {
                        i2 = H3;
                        ((xu0) vgVar.b).i(m);
                        ve0 ve0Var = (ve0) vgVar.e;
                        i3 = m;
                        if (h4 != ve0Var.e) {
                            ve0Var.e = h4;
                            int i30 = (h4 / 30) * 30;
                            ef1Var = ef1Var3;
                            ve0Var.d.setValue(b11.g(Math.max(i30 - 100, 0), i30 + 130));
                        } else {
                            ef1Var = ef1Var3;
                        }
                    } else {
                        ef1Var = ef1Var3;
                        i2 = H3;
                        i3 = m;
                    }
                    int h5 = ((xu0) vgVar.c).h();
                    ca0.u(n, s, function1);
                    ye0 ye0Var = wf0Var2.r;
                    ee eeVar = wf0Var2.o;
                    eo0 eo0Var = eeVar.a;
                    if ((eo0Var.g != 0) || !ye0Var.d.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        if (eeVar.a.g != 0) {
                            int i31 = eo0Var.g;
                            if (i31 == 0) {
                                throw new NoSuchElementException("MutableVector is empty.");
                            }
                            Object[] objArr = eo0Var.d;
                            i4 = h5;
                            int i32 = ((fe0) objArr[0]).a;
                            int i33 = 0;
                            while (i33 < i31) {
                                int i34 = i31;
                                int i35 = ((fe0) objArr[i33]).a;
                                if (i35 < i32) {
                                    i32 = i35;
                                }
                                i33++;
                                i31 = i34;
                            }
                            if (i32 < 0) {
                                r80.a("negative minIndex");
                            }
                            int i36 = eo0Var.g;
                            if (i36 == 0) {
                                throw new NoSuchElementException("MutableVector is empty.");
                            }
                            Object[] objArr2 = eo0Var.d;
                            int i37 = ((fe0) objArr2[0]).b;
                            int i38 = 0;
                            while (i38 < i36) {
                                Object[] objArr3 = objArr2;
                                int i39 = ((fe0) objArr2[i38]).b;
                                if (i39 > i37) {
                                    i37 = i39;
                                }
                                i38++;
                                objArr2 = objArr3;
                            }
                            intRange = new IntRange(i32, Math.min(i37, mf0Var2.c() - 1), 1);
                        } else {
                            i4 = h5;
                            IntRange.i.getClass();
                            intRange = IntRange.j;
                        }
                        int size = ye0Var.d.size();
                        for (int i40 = 0; i40 < size; i40++) {
                            we0 we0Var = (we0) ye0Var.get(i40);
                            int m2 = t80.m(we0Var.c, mf0Var2, we0Var.a);
                            int i41 = intRange.d;
                            if ((m2 > intRange.e || i41 > m2) && m2 >= 0 && m2 < mf0Var2.c()) {
                                arrayList.add(Integer.valueOf(m2));
                            }
                        }
                        int i42 = intRange.d;
                        int i43 = intRange.e;
                        if (i42 <= i43) {
                            while (true) {
                                arrayList.add(Integer.valueOf(i42));
                                if (i42 != i43) {
                                    i42++;
                                }
                            }
                        }
                        list = arrayList;
                    } else {
                        list = nv.d;
                        i4 = h5;
                    }
                    float floatValue = (ef1Var.m() || !z3) ? wf0Var2.h : ((Number) ((q7) wf0Var2.w.g).e.getValue()).floatValue();
                    ne0 ne0Var = wf0Var2.n;
                    boolean m3 = ef1Var.m();
                    sn snVar = qf0Var.e;
                    ao0 ao0Var2 = wf0Var2.v;
                    me1 me1Var = qf0Var.f;
                    if (i2 < 0) {
                        r80.a("invalid beforeContentPadding");
                    }
                    if (i29 < 0) {
                        r80.a("invalid afterContentPadding");
                    }
                    mf0 mf0Var3 = pf0Var.b;
                    if (c <= 0) {
                        int j3 = mm.j(h2);
                        int i44 = mm.i(h2);
                        ne0Var.c(j3, i44, new ArrayList(), mf0Var3.d, pf0Var, m3, z3, 0, 0);
                        if (!m3) {
                            ne0Var.a();
                            if (!a2) {
                                j3 = nm.f(0, h2);
                                i44 = nm.e(0, h2);
                            }
                        }
                        q1 q1Var = new q1(14);
                        int f = nm.f(j3 + i28, j2);
                        int e = nm.e(i44 + H4, j2);
                        ov ovVar = ov.d;
                        ovVar.getClass();
                        ef1 ef1Var4 = ef1Var;
                        rf0Var = new rf0(null, 0, false, 0.0f, ef1Var4.w(f, e, ovVar, q1Var), 0.0f, false, snVar, ue0Var, pf0Var.d, nv.d, -i2, g2 + i29, 0, et0.d, i29, H5);
                        wf0Var = wf0Var2;
                        ef1Var2 = ef1Var4;
                    } else {
                        int i45 = c;
                        boolean z4 = z3;
                        ue0 ue0Var4 = ue0Var;
                        int i46 = i2;
                        float f2 = floatValue;
                        int i47 = i3;
                        ef1 ef1Var5 = ef1Var;
                        if (i47 >= i45) {
                            i47 = i45 - 1;
                            i4 = 0;
                        }
                        int round = Math.round(f2);
                        int i48 = i4 - round;
                        if (i47 == 0 && i48 < 0) {
                            round += i48;
                            i48 = 0;
                        }
                        int i49 = i47;
                        m9 m9Var = new m9();
                        int i50 = -i46;
                        int i51 = i50 + (H5 < 0 ? H5 : 0);
                        wf0Var = wf0Var2;
                        int i52 = i48 + i51;
                        int i53 = 0;
                        while (true) {
                            j = pf0Var.d;
                            if (i52 < 0 && i49 > 0) {
                                ao0 ao0Var3 = ao0Var2;
                                int i54 = i49 - 1;
                                sf0 a3 = pf0Var.a(i54, j);
                                m9Var.add(0, a3);
                                i53 = Math.max(i53, a3.m);
                                i52 += a3.l;
                                i49 = i54;
                                ao0Var2 = ao0Var3;
                            }
                        }
                        ao0 ao0Var4 = ao0Var2;
                        if (i52 < i51) {
                            round -= i51 - i52;
                            i52 = i51;
                        }
                        int i55 = round;
                        int i56 = i52 - i51;
                        int i57 = g2 + i29;
                        int i58 = i53;
                        int i59 = i57 < 0 ? 0 : i57;
                        int i60 = i50;
                        int i61 = -i56;
                        int i62 = i56;
                        int i63 = i49;
                        int i64 = 0;
                        boolean z5 = false;
                        while (i64 < m9Var.g) {
                            if (i61 >= i59) {
                                m9Var.b(i64);
                                z5 = true;
                            } else {
                                i63++;
                                i61 += ((sf0) m9Var.get(i64)).l;
                                i64++;
                            }
                        }
                        int i65 = i58;
                        int i66 = i63;
                        boolean z6 = z5;
                        while (i66 < i45 && (i61 < i59 || i61 <= 0 || m9Var.isEmpty())) {
                            int i67 = i59;
                            sf0 a4 = pf0Var.a(i66, j);
                            int i68 = i45;
                            int i69 = a4.l;
                            int i70 = i61 + i69;
                            if (i70 <= i51) {
                                i23 = i70;
                                if (i66 != i68 - 1) {
                                    i62 -= i69;
                                    i49 = i66 + 1;
                                    z6 = true;
                                    i66++;
                                    i59 = i67;
                                    i45 = i68;
                                    i61 = i23;
                                }
                            } else {
                                i23 = i70;
                            }
                            i65 = Math.max(i65, a4.m);
                            m9Var.addLast(a4);
                            i66++;
                            i59 = i67;
                            i45 = i68;
                            i61 = i23;
                        }
                        int i71 = i45;
                        int i72 = g2;
                        if (i61 < i72) {
                            int i73 = i72 - i61;
                            int i74 = i61 + i73;
                            i8 = i62 - i73;
                            while (i8 < i46 && i49 > 0) {
                                int i75 = i74;
                                int i76 = i49 - 1;
                                int i77 = i46;
                                sf0 a5 = pf0Var.a(i76, j);
                                i49 = i76;
                                m9Var.add(0, a5);
                                i65 = Math.max(i65, a5.m);
                                i8 += a5.l;
                                i74 = i75;
                                i46 = i77;
                            }
                            int i78 = i74;
                            i5 = i46;
                            i6 = i73 + i55;
                            if (i8 < 0) {
                                i6 += i8;
                                i61 = i78 + i8;
                                i7 = i49;
                                i8 = 0;
                            } else {
                                i61 = i78;
                                i7 = i49;
                            }
                        } else {
                            i5 = i46;
                            i6 = i55;
                            i7 = i49;
                            i8 = i62;
                        }
                        int i79 = i65;
                        int i80 = i66;
                        float f3 = (Integer.signum(Math.round(f2)) != Integer.signum(i6) || Math.abs(Math.round(f2)) < Math.abs(i6)) ? f2 : i6;
                        float f4 = f2 - f3;
                        float f5 = (!m3 || i6 <= i55 || f4 > 0.0f) ? 0.0f : (i6 - i55) + f4;
                        if (i8 < 0) {
                            r80.a("negative currentFirstItemScrollOffset");
                        }
                        int i81 = -i8;
                        float f6 = f3;
                        String str2 = "ArrayDeque is empty.";
                        if (m9Var.isEmpty()) {
                            throw new NoSuchElementException("ArrayDeque is empty.");
                        }
                        float f7 = f5;
                        sf0 sf0Var2 = (sf0) m9Var.e[m9Var.d];
                        if (i5 > 0 || H5 < 0) {
                            int a6 = m9Var.a();
                            sf0 sf0Var3 = sf0Var2;
                            int i82 = 0;
                            while (true) {
                                if (i82 < a6) {
                                    i9 = i81;
                                    int i83 = ((sf0) m9Var.get(i82)).l;
                                    if (i8 != 0 && i83 <= i8 && i82 != m9Var.a() - 1) {
                                        i8 -= i83;
                                        i82++;
                                        sf0Var3 = (sf0) m9Var.get(i82);
                                        i81 = i9;
                                    }
                                } else {
                                    i9 = i81;
                                }
                            }
                            sf0Var2 = sf0Var3;
                        } else {
                            i9 = i81;
                        }
                        int max2 = Math.max(0, i7);
                        int i84 = i7 - 1;
                        if (max2 <= i84) {
                            list2 = null;
                            while (true) {
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                }
                                i10 = i8;
                                list2.add(pf0Var.a(i84, j));
                                if (i84 != max2) {
                                    i84--;
                                    i8 = i10;
                                }
                            }
                        } else {
                            i10 = i8;
                            list2 = null;
                        }
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i85 = size2 - 1;
                                int intValue3 = ((Number) list.get(size2)).intValue();
                                if (intValue3 < max2) {
                                    if (list2 == null) {
                                        list2 = new ArrayList();
                                    }
                                    list2.add(pf0Var.a(intValue3, j));
                                }
                                if (i85 >= 0) {
                                    size2 = i85;
                                }
                            }
                        }
                        if (list2 == null) {
                            list2 = nv.d;
                        }
                        int i86 = i79;
                        int i87 = 0;
                        for (int size3 = list2.size(); i87 < size3; size3 = size3) {
                            i86 = Math.max(i86, ((sf0) list2.get(i87)).m);
                            i87++;
                        }
                        int min = Math.min(((sf0) CollectionsKt.s(m9Var)).a, i71 - 1);
                        int i88 = ((sf0) CollectionsKt.s(m9Var)).a + 1;
                        if (i88 <= min) {
                            List list5 = null;
                            while (true) {
                                if (list5 == null) {
                                    list5 = new ArrayList();
                                }
                                i11 = i86;
                                list3 = list5;
                                str = str2;
                                list3.add(pf0Var.a(i88, j));
                                if (i88 != min) {
                                    i88++;
                                    str2 = str;
                                    list5 = list3;
                                    i86 = i11;
                                }
                            }
                        } else {
                            str = "ArrayDeque is empty.";
                            i11 = i86;
                            list3 = null;
                        }
                        if (list3 != null && ((sf0) CollectionsKt.s(list3)).a > min) {
                            min = ((sf0) CollectionsKt.s(list3)).a;
                        }
                        int size4 = list.size();
                        int i89 = 0;
                        while (i89 < size4) {
                            int i90 = size4;
                            int intValue4 = ((Number) list.get(i89)).intValue();
                            if (intValue4 > min) {
                                if (list3 == null) {
                                    list3 = new ArrayList();
                                }
                                list3.add(pf0Var.a(intValue4, j));
                            }
                            i89++;
                            size4 = i90;
                        }
                        if (list3 == null) {
                            list3 = nv.d;
                        }
                        int size5 = list3.size();
                        int i91 = i11;
                        for (int i92 = 0; i92 < size5; i92++) {
                            i91 = Math.max(i91, ((sf0) list3.get(i92)).m);
                        }
                        if (m9Var.isEmpty()) {
                            throw new NoSuchElementException(str);
                        }
                        boolean z7 = Intrinsics.a(sf0Var2, m9Var.e[m9Var.d]) && list2.isEmpty() && list3.isEmpty();
                        int f8 = nm.f(i91, h2);
                        int e2 = nm.e(i61, h2);
                        boolean z8 = i61 < Math.min(e2, i72);
                        if (z8 && i9 != 0) {
                            r80.c("non-zero itemsScrollOffset");
                        }
                        boolean z9 = z7;
                        ArrayList arrayList2 = new ArrayList(list3.size() + list2.size() + m9Var.a());
                        if (z8) {
                            if (!list2.isEmpty() || !list3.isEmpty()) {
                                r80.a("no extra items");
                            }
                            int a7 = m9Var.a();
                            int[] iArr = new int[a7];
                            for (int i93 = 0; i93 < a7; i93++) {
                                iArr[i93] = ((sf0) m9Var.get(i93)).k;
                            }
                            int[] iArr2 = new int[a7];
                            if (j9Var == null) {
                                r80.b("null verticalArrangement when isVertical == true");
                                throw new kc0();
                            }
                            j9Var.l(ue0Var4, e2, iArr, iArr2);
                            sf0Var = sf0Var2;
                            int i94 = new IntRange(0, a7 - 1, 1).e;
                            if (i94 >= 0) {
                                int i95 = 0;
                                while (true) {
                                    int i96 = iArr2[i95];
                                    sf0 sf0Var4 = (sf0) m9Var.get(i95);
                                    sf0Var4.c(i96, f8, e2);
                                    arrayList2.add(sf0Var4);
                                    if (i95 != i94) {
                                        i95++;
                                    }
                                }
                            }
                        } else {
                            sf0Var = sf0Var2;
                            int size6 = list2.size();
                            int i97 = i9;
                            int i98 = 0;
                            while (i98 < size6) {
                                int i99 = size6;
                                sf0 sf0Var5 = (sf0) list2.get(i98);
                                i97 -= sf0Var5.l;
                                sf0Var5.c(i97, f8, e2);
                                arrayList2.add(sf0Var5);
                                i98++;
                                size6 = i99;
                            }
                            int a8 = m9Var.a();
                            int i100 = i9;
                            for (int i101 = 0; i101 < a8; i101++) {
                                sf0 sf0Var6 = (sf0) m9Var.get(i101);
                                sf0Var6.c(i100, f8, e2);
                                arrayList2.add(sf0Var6);
                                i100 += sf0Var6.l;
                            }
                            int size7 = list3.size();
                            for (int i102 = 0; i102 < size7; i102++) {
                                sf0 sf0Var7 = (sf0) list3.get(i102);
                                sf0Var7.c(i100, f8, e2);
                                arrayList2.add(sf0Var7);
                                i100 += sf0Var7.l;
                            }
                        }
                        int i103 = i10;
                        ne0Var.c(f8, e2, arrayList2, mf0Var3.d, pf0Var, m3, z4, i103, i61);
                        if (!m3) {
                            ne0Var.a();
                            if (!a2) {
                                int f9 = nm.f(Math.max(f8, 0), h2);
                                int e3 = nm.e(Math.max(e2, 0), h2);
                                if (e3 != e2) {
                                    int size8 = arrayList2.size();
                                    for (int i104 = 0; i104 < size8; i104++) {
                                        ((sf0) arrayList2.get(i104)).o = e3;
                                    }
                                }
                                e2 = e3;
                                f8 = f9;
                            }
                        }
                        sf0 sf0Var8 = (sf0) (m9Var.isEmpty() ? null : m9Var.e[m9Var.d]);
                        int i105 = sf0Var8 != null ? sf0Var8.a : 0;
                        sf0 sf0Var9 = (sf0) m9Var.g();
                        int i106 = sf0Var9 != null ? sf0Var9.a : 0;
                        mf0Var3.b.getClass();
                        dn0 dn0Var2 = p90.a;
                        if (me1Var == null || arrayList2.isEmpty() || (i14 = dn0Var2.b) == 0) {
                            i12 = i72;
                            z2 = m3;
                            ue0Var2 = ue0Var4;
                            i13 = i60;
                            nvVar = nv.d;
                        } else {
                            if (i106 - i105 < 0 || i14 == 0) {
                                ue0Var2 = ue0Var4;
                                dn0Var = dn0Var2;
                            } else {
                                IntRange g3 = b11.g(0, i14);
                                int i107 = g3.d;
                                int i108 = g3.e;
                                ue0Var2 = ue0Var4;
                                if (i107 <= i108) {
                                    int i109 = -1;
                                    while (dn0Var2.c(i107) <= i105) {
                                        i109 = dn0Var2.c(i107);
                                        if (i107 != i108) {
                                            i107++;
                                        } else {
                                            i21 = i109;
                                            i22 = -1;
                                        }
                                    }
                                    i21 = i109;
                                    i22 = -1;
                                } else {
                                    i21 = -1;
                                    i22 = -1;
                                }
                                if (i21 == i22) {
                                    dn0Var = p90.a;
                                } else {
                                    dn0 dn0Var3 = new dn0(1);
                                    dn0Var3.a(i21);
                                    dn0Var = dn0Var3;
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList(arrayList2.size());
                            int size9 = arrayList2.size();
                            z2 = m3;
                            int i110 = 0;
                            while (i110 < size9) {
                                int i111 = size9;
                                Object obj7 = arrayList2.get(i110);
                                int i112 = i110;
                                int i113 = ((sf0) obj7).a;
                                int i114 = i72;
                                int[] iArr3 = dn0Var2.a;
                                int i115 = dn0Var2.b;
                                dn0 dn0Var4 = dn0Var2;
                                int i116 = 0;
                                while (true) {
                                    if (i116 < i115) {
                                        int i117 = i116;
                                        if (iArr3[i117] == i113) {
                                            arrayList4.add(obj7);
                                        } else {
                                            i116 = i117 + 1;
                                        }
                                    }
                                }
                                i110 = i112 + 1;
                                size9 = i111;
                                i72 = i114;
                                dn0Var2 = dn0Var4;
                            }
                            i12 = i72;
                            int[] iArr4 = dn0Var.a;
                            int i118 = dn0Var.b;
                            int i119 = 0;
                            while (i119 < i118) {
                                int i120 = iArr4[i119];
                                int size10 = arrayList2.size();
                                int[] iArr5 = iArr4;
                                int i121 = 0;
                                int i122 = 0;
                                while (true) {
                                    if (i121 < size10) {
                                        Object obj8 = arrayList2.get(i121);
                                        int i123 = i121 + 1;
                                        if (((sf0) obj8).a == i120) {
                                            i15 = i122;
                                        } else {
                                            i122++;
                                            i121 = i123;
                                        }
                                    } else {
                                        i15 = -1;
                                    }
                                }
                                long j4 = j;
                                sf0 a9 = i15 == -1 ? pf0Var.a(i120, j) : (sf0) arrayList2.remove(i15);
                                int i124 = a9.l;
                                if (i15 == -1) {
                                    i16 = i124;
                                    a = Integer.MIN_VALUE;
                                } else {
                                    i16 = i124;
                                    a = (int) (a9.a(0) & 4294967295L);
                                }
                                int size11 = arrayList4.size();
                                int i125 = i16;
                                int i126 = 0;
                                while (true) {
                                    if (i126 < size11) {
                                        obj3 = arrayList4.get(i126);
                                        int i127 = size11;
                                        if (((sf0) obj3).a == i120) {
                                            i126++;
                                            size11 = i127;
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                sf0 sf0Var10 = (sf0) obj3;
                                if (sf0Var10 != null) {
                                    long a10 = sf0Var10.a(0);
                                    i17 = i118;
                                    i18 = i119;
                                    i19 = (int) (a10 & 4294967295L);
                                } else {
                                    i17 = i118;
                                    i18 = i119;
                                    i19 = Integer.MIN_VALUE;
                                }
                                if (a == Integer.MIN_VALUE) {
                                    max = i60;
                                    i20 = max;
                                } else {
                                    i20 = i60;
                                    max = Math.max(i20, a);
                                }
                                if (i19 != Integer.MIN_VALUE) {
                                    max = Math.min(max, i19 - i125);
                                }
                                a9.n = true;
                                a9.c(max, f8, e2);
                                arrayList3.add(a9);
                                i119 = i18 + 1;
                                i118 = i17;
                                i60 = i20;
                                iArr4 = iArr5;
                                j = j4;
                            }
                            i13 = i60;
                            nvVar = arrayList3;
                        }
                        if (z9) {
                            sf0 sf0Var11 = (sf0) CollectionsKt.firstOrNull(arrayList2);
                            if (sf0Var11 != null) {
                                valueOf = Integer.valueOf(sf0Var11.a);
                                if (z9) {
                                    sf0 sf0Var12 = (sf0) m9Var.g();
                                    if (sf0Var12 != null) {
                                        num = Integer.valueOf(sf0Var12.a);
                                    }
                                } else {
                                    sf0 sf0Var13 = (sf0) CollectionsKt.t(arrayList2);
                                    if (sf0Var13 != null) {
                                        num = Integer.valueOf(sf0Var13.a);
                                    }
                                }
                                boolean z10 = i80 >= i71 || i61 > i12;
                                tm tmVar = new tm(ao0Var4, arrayList2, nvVar, z2);
                                int f10 = nm.f(f8 + i28, j2);
                                int e4 = nm.e(e2 + H4, j2);
                                ov ovVar2 = ov.d;
                                ovVar2.getClass();
                                ef1Var2 = ef1Var5;
                                wk0 w = ef1Var2.w(f10, e4, ovVar2, tmVar);
                                int intValue5 = valueOf == null ? valueOf.intValue() : 0;
                                int intValue6 = num == null ? num.intValue() : 0;
                                if (arrayList2.isEmpty()) {
                                    nvVar.getClass();
                                    ArrayList arrayList5 = new ArrayList(nvVar);
                                    int size12 = arrayList2.size();
                                    for (int i128 = 0; i128 < size12; i128++) {
                                        sf0 sf0Var14 = (sf0) arrayList2.get(i128);
                                        int i129 = sf0Var14.a;
                                        if (intValue5 <= i129 && i129 <= intValue6) {
                                            arrayList5.add(sf0Var14);
                                        }
                                    }
                                    di.i(arrayList5, op.k);
                                    list4 = arrayList5;
                                } else {
                                    list4 = nv.d;
                                }
                                rf0Var = new rf0(sf0Var, i103, z10, f6, w, f7, z6, snVar, ue0Var2, pf0Var.d, list4, i13, i57, i71, et0.d, i29, H5);
                            }
                            valueOf = null;
                            if (z9) {
                            }
                            if (i80 >= i71) {
                            }
                            tm tmVar2 = new tm(ao0Var4, arrayList2, nvVar, z2);
                            int f102 = nm.f(f8 + i28, j2);
                            int e42 = nm.e(e2 + H4, j2);
                            ov ovVar22 = ov.d;
                            ovVar22.getClass();
                            ef1Var2 = ef1Var5;
                            wk0 w2 = ef1Var2.w(f102, e42, ovVar22, tmVar2);
                            if (valueOf == null) {
                            }
                            if (num == null) {
                            }
                            if (arrayList2.isEmpty()) {
                            }
                            rf0Var = new rf0(sf0Var, i103, z10, f6, w2, f7, z6, snVar, ue0Var2, pf0Var.d, list4, i13, i57, i71, et0.d, i29, H5);
                        } else {
                            sf0 sf0Var15 = (sf0) (m9Var.isEmpty() ? null : m9Var.e[m9Var.d]);
                            if (sf0Var15 != null) {
                                valueOf = Integer.valueOf(sf0Var15.a);
                                if (z9) {
                                }
                                if (i80 >= i71) {
                                }
                                tm tmVar22 = new tm(ao0Var4, arrayList2, nvVar, z2);
                                int f1022 = nm.f(f8 + i28, j2);
                                int e422 = nm.e(e2 + H4, j2);
                                ov ovVar222 = ov.d;
                                ovVar222.getClass();
                                ef1Var2 = ef1Var5;
                                wk0 w22 = ef1Var2.w(f1022, e422, ovVar222, tmVar22);
                                if (valueOf == null) {
                                }
                                if (num == null) {
                                }
                                if (arrayList2.isEmpty()) {
                                }
                                rf0Var = new rf0(sf0Var, i103, z10, f6, w22, f7, z6, snVar, ue0Var2, pf0Var.d, list4, i13, i57, i71, et0.d, i29, H5);
                            }
                            valueOf = null;
                            if (z9) {
                            }
                            if (i80 >= i71) {
                            }
                            tm tmVar222 = new tm(ao0Var4, arrayList2, nvVar, z2);
                            int f10222 = nm.f(f8 + i28, j2);
                            int e4222 = nm.e(e2 + H4, j2);
                            ov ovVar2222 = ov.d;
                            ovVar2222.getClass();
                            ef1Var2 = ef1Var5;
                            wk0 w222 = ef1Var2.w(f10222, e4222, ovVar2222, tmVar222);
                            if (valueOf == null) {
                            }
                            if (num == null) {
                            }
                            if (arrayList2.isEmpty()) {
                            }
                            rf0Var = new rf0(sf0Var, i103, z10, f6, w222, f7, z6, snVar, ue0Var2, pf0Var.d, list4, i13, i57, i71, et0.d, i29, H5);
                        }
                    }
                    wf0Var.f(rf0Var, ef1Var2.m(), false);
                    return rf0Var;
                } catch (Throwable th) {
                    ca0.u(n, s, function1);
                    throw th;
                }
            case 4:
                hk hkVar = (hk) obj5;
                zf0 zf0Var = (zf0) obj4;
                hl hlVar2 = (hl) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (hlVar2.O(intValue7 & 1, (intValue7 & 3) != 2)) {
                    hkVar.a(zf0Var, hlVar2, 0);
                } else {
                    hlVar2.R();
                }
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                yr1.a((b2) obj5, (Function1) obj4, (hl) obj, gb0.P(1));
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).getClass();
                yr1.b((b2) obj5, (Function0) obj4, (hl) obj, gb0.P(1));
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                eh1.a((th1) obj5, (hk) obj4, (hl) obj, gb0.P(1));
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                u8 u8Var = (u8) obj5;
                z8 z8Var = (z8) obj4;
                hl hlVar3 = (hl) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (hlVar3.O(intValue8 & 1, (intValue8 & 3) != 2)) {
                    am0 b = xa1.b(xa1.a(xl0.a, 1.0f), 90.0f);
                    boolean h6 = hlVar3.h(z8Var);
                    Object L2 = hlVar3.L();
                    if (h6 || L2 == j41Var) {
                        L2 = new st0(z8Var, 5);
                        hlVar3.h0(L2);
                    }
                    Function0 function0 = (Function0) L2;
                    boolean h7 = hlVar3.h(z8Var);
                    Object L3 = hlVar3.L();
                    if (h7 || L3 == j41Var) {
                        L3 = new st0(z8Var, i25);
                        hlVar3.h0(L3);
                    }
                    Function0 function02 = (Function0) L3;
                    boolean h8 = hlVar3.h(z8Var);
                    Object L4 = hlVar3.L();
                    if (h8 || L4 == j41Var) {
                        L4 = new st0(z8Var, 7);
                        hlVar3.h0(L4);
                    }
                    yr1.h(u8Var, b, function0, function02, (Function0) L4, hlVar3, 432);
                } else {
                    hlVar3.R();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                yr1.x((Function0) obj5, (am0) obj4, (hl) obj, gb0.P(391));
                return Unit.a;
        }
    }

    public /* synthetic */ il(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }
}
