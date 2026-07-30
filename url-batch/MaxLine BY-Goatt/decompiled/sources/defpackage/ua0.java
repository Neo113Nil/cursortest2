package defpackage;

import androidx.compose.foundation.lazy.layout.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ua0 extends o81 implements Function2 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(va1 va1Var, zx1 zx1Var, q71 q71Var, nw0 nw0Var, zh zhVar, xh xhVar, a50 a50Var, cw0 cw0Var) {
        super(2);
        this.n = va1Var;
        this.o = zx1Var;
        this.p = q71Var;
        this.q = nw0Var;
        this.r = zhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0360  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        t21 t21Var;
        t21 t21Var2;
        char c;
        ob1 ob1Var;
        int d;
        int h;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        pa1 pa1Var;
        int i6;
        int size;
        int i7;
        pa1 pa1Var2;
        int i8;
        zn1 zn1Var;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        na1 na1Var;
        va1 va1Var;
        int i14;
        ka1 ka1Var;
        int i15;
        int i16 = this.m;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        Object obj6 = this.r;
        Object obj7 = this.n;
        switch (i16) {
            case 0:
                a00 a00Var = (a00) obj;
                ab0 ab0Var = (ab0) obj5;
                cp1 cp1Var = (cp1) obj7;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    boolean h2 = a00Var.h(cp1Var) | a00Var.f(ab0Var);
                    fn2 fn2Var = (fn2) obj3;
                    Object M = a00Var.M();
                    if (h2 || M == sz.a) {
                        M = new oc(fn2Var, cp1Var, ab0Var, 5);
                        a00Var.i0(M);
                    }
                    l41.f(cp1Var, (Function1) M, a00Var);
                    tk3.o(cp1Var, (jd2) obj4, yj1.H(-497631156, new n8(8, (za0) obj6, cp1Var), a00Var), a00Var, 384);
                }
                return Unit.a;
            default:
                boolean a = x31.a(0L, 0L);
                ob1 ob1Var2 = (ob1) obj;
                long j = ((u10) obj2).a;
                zh zhVar = (zh) obj6;
                zx1 zx1Var = (zx1) obj5;
                va1 va1Var2 = (va1) obj7;
                va1Var2.q.getValue();
                ww1 ww1Var = ww1.m;
                tk3.A(j, ww1Var);
                int R = ob1Var2.n.R(zx1Var.a(ob1Var2.n.getLayoutDirection()));
                int R2 = ob1Var2.n.R(zx1Var.b(ob1Var2.n.getLayoutDirection()));
                float f = zx1Var.b;
                hq2 hq2Var = ob1Var2.n;
                hq2 hq2Var2 = ob1Var2.n;
                int R3 = hq2Var.R(f);
                int R4 = hq2Var.R(zx1Var.d) + R3;
                int i17 = R2 + R;
                int i18 = R4 - R3;
                long j2 = v10.j(-i17, -R4, j);
                fa1 fa1Var = (fa1) ((Function0) obj4).invoke();
                sa1 sa1Var = fa1Var.b.p;
                nw0 nw0Var = (nw0) obj3;
                if (nw0Var.d != null && u10.b(nw0Var.b, j) && nw0Var.c == hq2Var2.d()) {
                    t21Var = nw0Var.d;
                    t21Var.getClass();
                } else {
                    nw0Var.b = j;
                    nw0Var.c = hq2Var2.d();
                    t21 t21Var3 = (t21) nw0Var.a.invoke(ob1Var2, new u10(j));
                    nw0Var.d = t21Var3;
                    t21Var = t21Var3;
                }
                int length = ((int[]) t21Var.n).length;
                if (length != sa1Var.f) {
                    sa1Var.f = length;
                    ArrayList arrayList2 = sa1Var.a;
                    arrayList2.clear();
                    t21Var2 = t21Var;
                    arrayList2.add(new qa1(0, 0));
                    sa1Var.b = 0;
                    sa1Var.c = 0;
                    sa1Var.d = 0;
                    c = 65535;
                    sa1Var.e = -1;
                    ((ArrayList) sa1Var.h).clear();
                } else {
                    t21Var2 = t21Var;
                    c = 65535;
                }
                int R5 = hq2Var.R(zhVar.a());
                int b = fa1Var.b();
                int g = u10.g(j) - R4;
                long h3 = yk3.h(R, R3);
                va1 va1Var3 = (va1) obj7;
                ka1 ka1Var2 = new ka1(fa1Var, ob1Var2, R5, va1Var3, R3, i18, h3);
                la1 la1Var = new la1(t21Var2, b, R5, ka1Var2, sa1Var);
                p8 p8Var = new p8(20, sa1Var, la1Var);
                nm2 d2 = ci2.d();
                Function1 e = d2 != null ? d2.e() : null;
                nm2 f2 = ci2.f(d2);
                try {
                    du duVar = va1Var3.b;
                    du duVar2 = va1Var3.b;
                    int h4 = ((iz1) duVar.b).h();
                    int r = bd3.r(h4, fa1Var, duVar2.d);
                    if (h4 != r) {
                        ob1Var = ob1Var2;
                        ((iz1) duVar2.b).i(r);
                        ((pb1) duVar2.e).a(h4);
                    } else {
                        ob1Var = ob1Var2;
                    }
                    if (r >= b && b > 0) {
                        d = sa1Var.d(b - 1);
                        h = 0;
                        Unit unit = Unit.a;
                        ci2.j(d2, f2, e);
                        List a2 = eb1.a(fa1Var, va1Var2.o, va1Var2.l);
                        float f3 = va1Var2.e;
                        a aVar = va1Var2.k;
                        zn1 zn1Var2 = va1Var2.p;
                        int i19 = d;
                        int i20 = h;
                        ob1 ob1Var3 = ob1Var;
                        int i21 = b;
                        ja1 ja1Var = new ja1(ob1Var3, j, i17, R4, 0);
                        if (R3 >= 0) {
                            lh.e("negative beforeContentPadding");
                            return null;
                        }
                        if (i18 < 0) {
                            lh.e("negative afterContentPadding");
                            return null;
                        }
                        if (i21 <= 0) {
                            int j3 = u10.j(j2);
                            int i22 = u10.i(j2);
                            aVar.b(j3, i22, new ArrayList(), fa1Var.c, ka1Var2, length, 0, 0);
                            aVar.a();
                            if (!a) {
                                j3 = v10.g(j2, 0);
                                i22 = v10.f(j2, 0);
                            }
                            na1Var = new na1(null, 0, false, 0.0f, (pj1) ja1Var.a(Integer.valueOf(j3), Integer.valueOf(i22), bl0.w), false, length, p8Var, ah0.m, -R3, g + i18, 0, ww1Var, i18, R5);
                            va1Var = va1Var2;
                        } else {
                            ka1 ka1Var3 = ka1Var2;
                            int round = Math.round(f3);
                            int i23 = i20 - round;
                            if (i19 == 0 && i23 < 0) {
                                round += i23;
                                i23 = 0;
                            }
                            bi biVar = new bi();
                            int i24 = -R3;
                            int i25 = round;
                            int i26 = i24 + (R5 < 0 ? R5 : 0);
                            int i27 = i23 + i26;
                            while (i27 < 0 && i19 > 0) {
                                int i28 = i24;
                                int i29 = i19 - 1;
                                va1 va1Var4 = va1Var2;
                                pa1 b2 = la1Var.b(i29);
                                biVar.add(0, b2);
                                i27 += b2.g;
                                i19 = i29;
                                i24 = i28;
                                va1Var2 = va1Var4;
                            }
                            int i30 = i24;
                            va1 va1Var5 = va1Var2;
                            if (i27 < i26) {
                                i = i25 + i27;
                                i27 = i26;
                            } else {
                                i = i25;
                            }
                            int i31 = i27 - i26;
                            int i32 = g + i18;
                            int i33 = i32 < 0 ? 0 : i32;
                            int i34 = i;
                            int i35 = -i31;
                            int i36 = i19;
                            int i37 = 0;
                            boolean z = false;
                            while (i37 < biVar.o) {
                                if (i35 >= i33) {
                                    biVar.b(i37);
                                    z = true;
                                } else {
                                    i36++;
                                    i35 += ((pa1) biVar.get(i37)).g;
                                    i37++;
                                }
                            }
                            int i38 = i31;
                            int i39 = i19;
                            int i40 = i36;
                            boolean z2 = z;
                            while (i40 < i21 && (i35 < i33 || i35 <= 0 || biVar.isEmpty())) {
                                i2 = i38;
                                pa1 b3 = la1Var.b(i40);
                                int i41 = i40;
                                int i42 = b3.g;
                                oa1[] oa1VarArr = b3.b;
                                int i43 = i33;
                                if (oa1VarArr.length == 0) {
                                    if (i35 >= g) {
                                        int i44 = g - i35;
                                        i4 = i2 - i44;
                                        int i45 = i35 + i44;
                                        while (i4 < R3 && i39 > 0) {
                                            int i46 = i39 - 1;
                                            pa1 b4 = la1Var.b(i46);
                                            biVar.add(0, b4);
                                            i4 += b4.g;
                                            i44 = i44;
                                            i39 = i46;
                                        }
                                        int i47 = i34 + i44;
                                        if (i4 < 0) {
                                            int i48 = i45 + i4;
                                            i5 = i47 + i4;
                                            i3 = i48;
                                            i4 = 0;
                                        } else {
                                            i5 = i47;
                                            i3 = i45;
                                        }
                                    } else {
                                        i3 = i35;
                                        i4 = i2;
                                        i5 = i34;
                                    }
                                    float f4 = (Integer.signum(Math.round(f3)) == Integer.signum(i5) || Math.abs(Math.round(f3)) < Math.abs(i5)) ? f3 : i5;
                                    if (i4 >= 0) {
                                        lh.e("negative initial offset");
                                        return null;
                                    }
                                    int i49 = -i4;
                                    pa1 pa1Var3 = (pa1) biVar.first();
                                    oa1[] oa1VarArr2 = pa1Var3.b;
                                    oa1 oa1Var = oa1VarArr2.length == 0 ? null : oa1VarArr2[0];
                                    int i50 = oa1Var != null ? oa1Var.a : 0;
                                    pa1 pa1Var4 = (pa1) biVar.f();
                                    if (pa1Var4 != null) {
                                        oa1[] oa1VarArr3 = pa1Var4.b;
                                        pa1Var = pa1Var3;
                                        oa1 oa1Var2 = oa1VarArr3.length == 0 ? null : oa1VarArr3[oa1VarArr3.length - 1];
                                        if (oa1Var2 != null) {
                                            i6 = oa1Var2.a;
                                            size = a2.size();
                                            int i51 = i4;
                                            List list = null;
                                            i7 = 0;
                                            while (true) {
                                                sa1 sa1Var2 = la1Var.e;
                                                if (i7 >= size) {
                                                    int i52 = i7;
                                                    int intValue = ((Number) a2.get(i7)).intValue();
                                                    if (intValue < 0 || intValue >= i50) {
                                                        ka1Var = ka1Var3;
                                                        i15 = size;
                                                    } else {
                                                        i15 = size;
                                                        int i53 = sa1Var2.f;
                                                        int g2 = sa1Var2.g(intValue);
                                                        ka1 ka1Var4 = ka1Var3;
                                                        oa1 a3 = ka1Var4.a(intValue, la1Var.a(0, g2), 0, g2, ka1Var3.c);
                                                        ka1Var = ka1Var4;
                                                        List arrayList3 = list == null ? new ArrayList() : list;
                                                        arrayList3.add(a3);
                                                        list = arrayList3;
                                                    }
                                                    ka1 ka1Var5 = ka1Var;
                                                    i7 = i52 + 1;
                                                    ka1Var3 = ka1Var5;
                                                    size = i15;
                                                } else {
                                                    ka1 ka1Var6 = ka1Var3;
                                                    if (list == null) {
                                                        list = ah0.m;
                                                    }
                                                    List list2 = list;
                                                    int size2 = a2.size();
                                                    int i54 = i50;
                                                    List list3 = null;
                                                    int i55 = 0;
                                                    while (i55 < size2) {
                                                        List list4 = a2;
                                                        int intValue2 = ((Number) a2.get(i55)).intValue();
                                                        int i56 = i55;
                                                        if (i6 + 1 > intValue2 || intValue2 >= i21) {
                                                            i14 = i21;
                                                        } else {
                                                            int i57 = sa1Var2.f;
                                                            int g3 = sa1Var2.g(intValue2);
                                                            i14 = i21;
                                                            oa1 a4 = ka1Var6.a(intValue2, la1Var.a(0, g3), 0, g3, ka1Var6.c);
                                                            List arrayList4 = list3 == null ? new ArrayList() : list3;
                                                            arrayList4.add(a4);
                                                            list3 = arrayList4;
                                                        }
                                                        i55 = i56 + 1;
                                                        a2 = list4;
                                                        i21 = i14;
                                                    }
                                                    int i58 = i21;
                                                    if (list3 == null) {
                                                        list3 = ah0.m;
                                                    }
                                                    List list5 = list3;
                                                    if (R3 > 0 || R5 < 0) {
                                                        int i59 = biVar.o;
                                                        pa1Var2 = pa1Var;
                                                        int i60 = i51;
                                                        int i61 = 0;
                                                        while (i61 < i59) {
                                                            int i62 = ((pa1) biVar.get(i61)).g;
                                                            if (i60 != 0 && i62 <= i60) {
                                                                int i63 = i59;
                                                                if (i61 != biVar.a() - 1) {
                                                                    i60 -= i62;
                                                                    i61++;
                                                                    pa1Var2 = (pa1) biVar.get(i61);
                                                                    i59 = i63;
                                                                }
                                                            }
                                                            i8 = i60;
                                                        }
                                                        i8 = i60;
                                                    } else {
                                                        pa1Var2 = pa1Var;
                                                        i8 = i51;
                                                    }
                                                    int h5 = u10.h(j2);
                                                    int f5 = v10.f(j2, i3);
                                                    boolean z3 = i3 < Math.min(f5, g);
                                                    if (z3 && i49 != 0) {
                                                        lh.g("non-zero firstLineScrollOffset");
                                                        return null;
                                                    }
                                                    int a5 = biVar.a();
                                                    pa1 pa1Var5 = pa1Var2;
                                                    int i64 = i3;
                                                    int i65 = 0;
                                                    for (int i66 = 0; i66 < a5; i66++) {
                                                        i65 += ((pa1) biVar.get(i66)).b.length;
                                                    }
                                                    ArrayList arrayList5 = new ArrayList(i65);
                                                    if (!z3) {
                                                        int i67 = h5;
                                                        zn1Var = zn1Var2;
                                                        int size3 = list2.size() - 1;
                                                        if (size3 >= 0) {
                                                            int i68 = i49;
                                                            while (true) {
                                                                int i69 = size3 - 1;
                                                                oa1 oa1Var3 = (oa1) list2.get(size3);
                                                                int i70 = i68 - oa1Var3.l;
                                                                int i71 = f5;
                                                                oa1Var3.a(i70, 0, i67, i71, -1, -1);
                                                                i10 = i67;
                                                                i9 = i71;
                                                                arrayList5.add(oa1Var3);
                                                                if (i69 >= 0) {
                                                                    i67 = i10;
                                                                    f5 = i9;
                                                                    size3 = i69;
                                                                    i68 = i70;
                                                                }
                                                            }
                                                        } else {
                                                            i9 = f5;
                                                            i10 = i67;
                                                        }
                                                        int a6 = biVar.a();
                                                        int i72 = i49;
                                                        int i73 = 0;
                                                        while (i73 < a6) {
                                                            pa1 pa1Var6 = (pa1) biVar.get(i73);
                                                            oa1[] a7 = pa1Var6.a(i72, i10, i9);
                                                            int i74 = i10;
                                                            int i75 = i9;
                                                            int i76 = 0;
                                                            for (int length2 = a7.length; i76 < length2; length2 = length2) {
                                                                arrayList5.add(a7[i76]);
                                                                i76++;
                                                            }
                                                            i72 += pa1Var6.g;
                                                            i73++;
                                                            i10 = i74;
                                                            i9 = i75;
                                                        }
                                                        i11 = i10;
                                                        i12 = i9;
                                                        int size4 = list5.size();
                                                        int i77 = i72;
                                                        for (int i78 = 0; i78 < size4; i78++) {
                                                            oa1 oa1Var4 = (oa1) list5.get(i78);
                                                            oa1Var4.a(i77, 0, i11, i12, -1, -1);
                                                            arrayList5.add(oa1Var4);
                                                            i77 += oa1Var4.l;
                                                        }
                                                    } else {
                                                        if (!list2.isEmpty() || !list5.isEmpty()) {
                                                            lh.e("no items");
                                                            return null;
                                                        }
                                                        int a8 = biVar.a();
                                                        int[] iArr = new int[a8];
                                                        int i79 = 0;
                                                        while (i79 < a8) {
                                                            int i80 = i79;
                                                            iArr[i80] = ((pa1) biVar.get(i79)).f;
                                                            i79 = i80 + 1;
                                                        }
                                                        int[] iArr2 = new int[a8];
                                                        zn1Var = zn1Var2;
                                                        for (int i81 = 0; i81 < a8; i81++) {
                                                            iArr2[i81] = 0;
                                                        }
                                                        zhVar.i(ob1Var3, f5, iArr, iArr2);
                                                        IntRange q = oi.q(iArr2);
                                                        int i82 = q.m;
                                                        int i83 = q.n;
                                                        int i84 = q.o;
                                                        if ((i84 <= 0 || i82 > i83) && (i84 >= 0 || i83 > i82)) {
                                                            i11 = h5;
                                                        } else {
                                                            while (true) {
                                                                int i85 = i84;
                                                                oa1[] a9 = ((pa1) biVar.get(i82)).a(iArr2[i82], h5, f5);
                                                                int length3 = a9.length;
                                                                i11 = h5;
                                                                int i86 = 0;
                                                                while (i86 < length3) {
                                                                    int i87 = i86;
                                                                    arrayList5.add(a9[i87]);
                                                                    i86 = i87 + 1;
                                                                }
                                                                if (i82 != i83) {
                                                                    i82 += i85;
                                                                    i84 = i85;
                                                                    h5 = i11;
                                                                }
                                                            }
                                                        }
                                                        i12 = f5;
                                                    }
                                                    int i88 = i11;
                                                    int i89 = i12;
                                                    aVar.b(i88, i89, arrayList5, ka1Var6.a.c, ka1Var6, length, i8, i64);
                                                    int i90 = i88;
                                                    int i91 = i8;
                                                    aVar.a();
                                                    if (a) {
                                                        i13 = i89;
                                                    } else {
                                                        i90 = v10.g(j2, Math.max(i90, 0));
                                                        i13 = v10.f(j2, Math.max(i89, 0));
                                                        if (i13 != i89) {
                                                            int size5 = arrayList5.size();
                                                            for (int i92 = 0; i92 < size5; i92++) {
                                                                ((oa1) arrayList5.get(i92)).m = i13;
                                                            }
                                                        }
                                                    }
                                                    boolean z4 = i6 != i58 + (-1) || i64 > g;
                                                    pj1 pj1Var = (pj1) ja1Var.a(Integer.valueOf(i90), Integer.valueOf(i13), new ma1(arrayList5, zn1Var, 0));
                                                    if (list2.isEmpty() && list5.isEmpty()) {
                                                        arrayList = arrayList5;
                                                    } else {
                                                        ArrayList arrayList6 = new ArrayList(arrayList5.size());
                                                        int size6 = arrayList5.size();
                                                        int i93 = 0;
                                                        while (i93 < size6) {
                                                            Object obj8 = arrayList5.get(i93);
                                                            int i94 = ((oa1) obj8).a;
                                                            int i95 = i54;
                                                            if (i95 <= i94 && i94 <= i6) {
                                                                arrayList6.add(obj8);
                                                            }
                                                            i93++;
                                                            i54 = i95;
                                                        }
                                                        arrayList = arrayList6;
                                                    }
                                                    na1Var = new na1(pa1Var5, i91, z4, f4, pj1Var, z2, length, p8Var, arrayList, i30, i32, i58, ww1Var, i18, R5);
                                                    va1Var = va1Var5;
                                                }
                                            }
                                        }
                                    } else {
                                        pa1Var = pa1Var3;
                                    }
                                    i6 = 0;
                                    size = a2.size();
                                    int i512 = i4;
                                    List list6 = null;
                                    i7 = 0;
                                    while (true) {
                                        sa1 sa1Var22 = la1Var.e;
                                        if (i7 >= size) {
                                        }
                                        ka1 ka1Var52 = ka1Var;
                                        i7 = i52 + 1;
                                        ka1Var3 = ka1Var52;
                                        size = i15;
                                    }
                                } else {
                                    i35 += i42;
                                    if (i35 <= i26) {
                                        if (oa1VarArr.length == 0) {
                                            ch2.k("Array is empty.");
                                            return null;
                                        }
                                        if (oa1VarArr[oa1VarArr.length - 1].a != i21 - 1) {
                                            i38 = i2 - i42;
                                            i39 = i41 + 1;
                                            z2 = true;
                                            i40 = i41 + 1;
                                            i33 = i43;
                                        }
                                    }
                                    biVar.addLast(b3);
                                    i38 = i2;
                                    i40 = i41 + 1;
                                    i33 = i43;
                                }
                            }
                            i2 = i38;
                            if (i35 >= g) {
                            }
                            if (Integer.signum(Math.round(f3)) == Integer.signum(i5)) {
                            }
                            if (i4 >= 0) {
                            }
                        }
                        na1 na1Var2 = na1Var;
                        va1Var.f(na1Var2, false);
                        return na1Var2;
                    }
                    d = sa1Var.d(r);
                    h = ((iz1) duVar2.c).h();
                    Unit unit2 = Unit.a;
                    ci2.j(d2, f2, e);
                    List a22 = eb1.a(fa1Var, va1Var2.o, va1Var2.l);
                    float f32 = va1Var2.e;
                    a aVar2 = va1Var2.k;
                    zn1 zn1Var22 = va1Var2.p;
                    int i192 = d;
                    int i202 = h;
                    ob1 ob1Var32 = ob1Var;
                    int i212 = b;
                    ja1 ja1Var2 = new ja1(ob1Var32, j, i17, R4, 0);
                    if (R3 >= 0) {
                    }
                } catch (Throwable th) {
                    ci2.j(d2, f2, e);
                    throw th;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(cp1 cp1Var, ab0 ab0Var, kd2 kd2Var, fn2 fn2Var, za0 za0Var) {
        super(2);
        this.n = cp1Var;
        this.o = ab0Var;
        this.p = kd2Var;
        this.q = fn2Var;
        this.r = za0Var;
    }
}
