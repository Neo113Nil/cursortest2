package defpackage;

import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x08ef  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Pair pair;
        Object bk1Var;
        Object invoke;
        Object obj2;
        Typeface q;
        ck1 ck1Var;
        boolean z;
        float f;
        long j;
        List<y50> list;
        e40 e40Var;
        Object value;
        Object value2;
        long j2;
        int i;
        int i2 = 4;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((gn0) this.e).b((yy0) this.g);
                return Unit.a;
            case 1:
                ic icVar = (ic) this.e;
                jc jcVar = (jc) this.g;
                hi1 hi1Var = icVar.s;
                if (hi1Var != null) {
                    hi1Var.b();
                }
                icVar.s = null;
                ej ejVar = jcVar.b;
                if (ejVar != null) {
                    ejVar.Y(Unit.a);
                }
                jcVar.b = null;
                return Unit.a;
            case 2:
                ((ee) this.e).a.j((sm) this.g);
                return Unit.a;
            case 3:
                vg0 vg0Var = (vg0) this.e;
                z8 z8Var = (z8) this.g;
                ((ps) obj).getClass();
                nx nxVar = new nx(0, z8Var);
                vg0Var.f().a(nxVar);
                return new s4(vg0Var, 2, nxVar);
            case 4:
                ((gn0) this.e).b((ga0) this.g);
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                x10 x10Var = (x10) this.e;
                ak1 ak1Var = (ak1) this.g;
                Function1 function1 = (Function1) obj;
                c20 c20Var = x10Var.d;
                o5 o5Var = x10Var.a;
                l lVar = x10Var.f;
                c20Var.getClass();
                w10 w10Var = ak1Var.a;
                if (w10Var instanceof a20) {
                    List list2 = ((a20) w10Var).g;
                    x20 x20Var = ak1Var.b;
                    int i3 = ak1Var.c;
                    ArrayList arrayList = new ArrayList(list2.size());
                    int size = list2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Object obj3 = list2.get(i4);
                        if (Intrinsics.a(((c31) obj3).a, x20Var) && i3 == 0) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            Object obj4 = list2.get(i5);
                            ((c31) obj4).getClass();
                            if (i3 == 0) {
                                arrayList2.add(obj4);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list2 = arrayList2;
                        }
                        int compareTo = x20Var.compareTo(x20.e);
                        int i6 = x20Var.d;
                        if (compareTo < 0) {
                            int size3 = list2.size();
                            x20 x20Var2 = null;
                            x20 x20Var3 = null;
                            int i7 = 0;
                            while (true) {
                                if (i7 < size3) {
                                    x20 x20Var4 = ((c31) list2.get(i7)).a;
                                    int i8 = x20Var4.d;
                                    if (Intrinsics.b(i8, i6) < 0) {
                                        if (x20Var2 == null || Intrinsics.b(i8, x20Var2.d) > 0) {
                                            x20Var2 = x20Var4;
                                        }
                                    } else if (Intrinsics.b(i8, i6) <= 0) {
                                        x20Var2 = x20Var4;
                                        x20Var3 = x20Var2;
                                    } else if (x20Var3 == null || Intrinsics.b(i8, x20Var3.d) < 0) {
                                        x20Var3 = x20Var4;
                                    }
                                    i7++;
                                }
                            }
                            if (x20Var2 == null) {
                                x20Var2 = x20Var3;
                            }
                            arrayList = new ArrayList(list2.size());
                            int size4 = list2.size();
                            for (int i9 = 0; i9 < size4; i9++) {
                                Object obj5 = list2.get(i9);
                                if (Intrinsics.a(((c31) obj5).a, x20Var2)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            x20 x20Var5 = x20.g;
                            if (x20Var.compareTo(x20Var5) > 0) {
                                int size5 = list2.size();
                                x20 x20Var6 = null;
                                x20 x20Var7 = null;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size5) {
                                        x20 x20Var8 = ((c31) list2.get(i10)).a;
                                        int i11 = x20Var8.d;
                                        if (Intrinsics.b(i11, i6) < 0) {
                                            if (x20Var6 == null || Intrinsics.b(i11, x20Var6.d) > 0) {
                                                x20Var6 = x20Var8;
                                            }
                                        } else if (Intrinsics.b(i11, i6) <= 0) {
                                            x20Var6 = x20Var8;
                                            x20Var7 = x20Var6;
                                        } else if (x20Var7 == null || Intrinsics.b(i11, x20Var7.d) < 0) {
                                            x20Var7 = x20Var8;
                                        }
                                        i10++;
                                    }
                                }
                                if (x20Var7 != null) {
                                    x20Var6 = x20Var7;
                                }
                                arrayList = new ArrayList(list2.size());
                                int size6 = list2.size();
                                for (int i12 = 0; i12 < size6; i12++) {
                                    Object obj6 = list2.get(i12);
                                    if (Intrinsics.a(((c31) obj6).a, x20Var6)) {
                                        arrayList.add(obj6);
                                    }
                                }
                            } else {
                                int size7 = list2.size();
                                x20 x20Var9 = null;
                                x20 x20Var10 = null;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size7) {
                                        x20 x20Var11 = ((c31) list2.get(i13)).a;
                                        if (Intrinsics.b(x20Var11.d, x20Var5.d) <= 0) {
                                            int i14 = x20Var11.d;
                                            if (Intrinsics.b(i14, i6) < 0) {
                                                if (x20Var9 == null || Intrinsics.b(i14, x20Var9.d) > 0) {
                                                    x20Var9 = x20Var11;
                                                }
                                            } else if (Intrinsics.b(i14, i6) <= 0) {
                                                x20Var9 = x20Var11;
                                                x20Var10 = x20Var9;
                                            } else if (x20Var10 == null || Intrinsics.b(i14, x20Var10.d) < 0) {
                                                x20Var10 = x20Var11;
                                            }
                                        }
                                        i13++;
                                    }
                                }
                                if (x20Var10 != null) {
                                    x20Var9 = x20Var10;
                                }
                                ArrayList arrayList3 = new ArrayList(list2.size());
                                int size8 = list2.size();
                                for (int i15 = 0; i15 < size8; i15++) {
                                    Object obj7 = list2.get(i15);
                                    if (Intrinsics.a(((c31) obj7).a, x20Var9)) {
                                        arrayList3.add(obj7);
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    x20 x20Var12 = x20.g;
                                    int size9 = list2.size();
                                    x20 x20Var13 = null;
                                    x20 x20Var14 = null;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < size9) {
                                            x20 x20Var15 = ((c31) list2.get(i16)).a;
                                            if (x20Var12 == null || Intrinsics.b(x20Var15.d, x20Var12.d) >= 0) {
                                                int i17 = x20Var15.d;
                                                if (Intrinsics.b(i17, i6) < 0) {
                                                    if (x20Var13 == null || Intrinsics.b(i17, x20Var13.d) > 0) {
                                                        x20Var13 = x20Var15;
                                                    }
                                                } else if (Intrinsics.b(i17, i6) <= 0) {
                                                    x20Var13 = x20Var15;
                                                    x20Var14 = x20Var13;
                                                } else if (x20Var14 == null || Intrinsics.b(i17, x20Var14.d) < 0) {
                                                    x20Var14 = x20Var15;
                                                }
                                            }
                                            i16++;
                                        }
                                    }
                                    if (x20Var14 != null) {
                                        x20Var13 = x20Var14;
                                    }
                                    arrayList = new ArrayList(list2.size());
                                    int size10 = list2.size();
                                    for (int i18 = 0; i18 < size10; i18++) {
                                        Object obj8 = list2.get(i18);
                                        if (Intrinsics.a(((c31) obj8).a, x20Var13)) {
                                            arrayList.add(obj8);
                                        }
                                    }
                                } else {
                                    arrayList = arrayList3;
                                }
                            }
                        }
                    }
                    i8 i8Var = c20Var.a;
                    if (arrayList.size() > 0) {
                        c31 c31Var = (c31) arrayList.get(0);
                        c31Var.getClass();
                        synchronized (((sc1) i8Var.h)) {
                            try {
                                o5Var.getClass();
                                fa faVar = new fa(c31Var);
                                ea eaVar = (ea) ((lj0) i8Var.e).a(faVar);
                                if (eaVar == null) {
                                    eaVar = (ea) ((vn0) i8Var.g).g(faVar);
                                }
                                if (eaVar != null) {
                                    obj2 = eaVar.a;
                                } else {
                                    try {
                                        invoke = o5Var.d(c31Var);
                                    } catch (Exception unused) {
                                        invoke = lVar.invoke(ak1Var);
                                    }
                                    i8Var.getClass();
                                    o5Var.getClass();
                                    fa faVar2 = new fa(c31Var);
                                    synchronized (((sc1) i8Var.h)) {
                                        try {
                                            if (invoke == null) {
                                                ((vn0) i8Var.g).m(faVar2, new ea(null));
                                            } else {
                                                ((lj0) i8Var.e).b(faVar2, new ea(invoke));
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    obj2 = invoke;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (obj2 == null) {
                            obj2 = lVar.invoke(ak1Var);
                        }
                        pair = new Pair(null, op.N(ak1Var.d, obj2, c31Var, ak1Var.b, ak1Var.c));
                    } else {
                        pair = new Pair(null, lVar.invoke(ak1Var));
                    }
                    List list3 = (List) pair.d;
                    Object obj9 = pair.e;
                    if (list3 == null) {
                        bk1Var = new ck1(obj9, true);
                    } else {
                        da daVar = new da(list3, obj9, ak1Var, c20Var.a, function1, o5Var);
                        cn cnVar = c20Var.b;
                        vn vnVar = vn.d;
                        uq1.N(cnVar, null, new rp(daVar, (dn) null, 2), 1);
                        bk1Var = new bk1(daVar);
                    }
                } else {
                    bk1Var = null;
                }
                if (bk1Var != null) {
                    return bk1Var;
                }
                Object obj10 = x10Var.e.e;
                w10 w10Var2 = ak1Var.a;
                int i19 = ak1Var.c;
                x20 x20Var16 = ak1Var.b;
                if (w10Var2 == null || (w10Var2 instanceof yp)) {
                    q = j50.q(null, x20Var16, i19);
                } else {
                    if (!(w10Var2 instanceof o40)) {
                        ck1Var = null;
                        if (ck1Var == null) {
                            return ck1Var;
                        }
                        dd0.j("Could not load font");
                        return null;
                    }
                    q = j50.q("sans-serif", x20Var16, i19);
                }
                ck1Var = new ck1(q, true);
                if (ck1Var == null) {
                }
                break;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                y11 y11Var = (y11) this.e;
                z8 z8Var2 = (z8) this.g;
                long longValue = ((Long) obj).longValue();
                long j3 = y11Var.d;
                if (j3 != 0) {
                    long j4 = (longValue - j3) / 1000000;
                    be1 be1Var = z8Var2.e;
                    w8 w8Var = (w8) be1Var.getValue();
                    e40 e40Var2 = w8Var.i;
                    if (e40Var2 != null) {
                        int i20 = e40Var2.c;
                        ds dsVar = e40Var2.a;
                        if (Intrinsics.a(w8Var.a, p8.a) && Intrinsics.a(w8Var.b, mt0.a) && w8Var.k && e40Var2.b == f40.d) {
                            int i21 = 4;
                            long min = Math.min(j4, 64L);
                            float f2 = min / 1000.0f;
                            int i22 = e40Var2.d;
                            long max = Math.max(0L, e40Var2.g - min);
                            e40 a = e40.a(e40Var2, null, 0, 0, 0, null, max, max > 0 ? e40Var2.h + min : 0L, max > 0 ? e40Var2.i : 0.0f, max > 0 ? e40Var2.j : 1, 0L, 0L, 0.0f, 15423);
                            List<y50> list4 = e40Var2.f;
                            ArrayList arrayList4 = new ArrayList(ai.h(list4));
                            int i23 = i20;
                            int i24 = i22;
                            boolean z2 = false;
                            for (y50 y50Var : list4) {
                                int i25 = i21;
                                y50 a2 = y50.a(y50Var, y50Var.c - (y50Var.d * f2), 59);
                                if (a2.e || a2.c >= 0.24f - z8.l(a2.b)) {
                                    i = i25;
                                } else {
                                    i23++;
                                    int i26 = (int) (((i23 / 5) + 4) * yr1.J(dsVar).g);
                                    i = i25;
                                    i24 += i26 < i ? i : i26;
                                    a2 = y50.a(a2, 0.0f, 31);
                                    z2 = true;
                                }
                                arrayList4.add(a2);
                                i21 = i;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            int size11 = arrayList4.size();
                            int i27 = 0;
                            while (i27 < size11) {
                                Object obj11 = arrayList4.get(i27);
                                i27++;
                                ds dsVar2 = dsVar;
                                if (((y50) obj11).c > -0.18f) {
                                    arrayList5.add(obj11);
                                }
                                dsVar = dsVar2;
                            }
                            ds dsVar3 = dsVar;
                            if (z2) {
                                z8Var2.j(gc1.k, 8L);
                            }
                            long j5 = e40Var2.k - min;
                            long j6 = e40Var2.l;
                            ArrayList arrayList6 = new ArrayList(arrayList5);
                            if (!arrayList6.isEmpty()) {
                                int size12 = arrayList6.size();
                                int i28 = 0;
                                while (i28 < size12) {
                                    Object obj12 = arrayList6.get(i28);
                                    i28++;
                                    int i29 = size12;
                                    if (((y50) obj12).c > 0.81999993f) {
                                        z = false;
                                        if (j5 > 0 && (z || arrayList6.isEmpty())) {
                                            es J = yr1.J(dsVar3);
                                            long j7 = i23;
                                            long ordinal = (dsVar3.ordinal() * 211) + (53 * j7) + (97 * j6);
                                            f = f2;
                                            int i30 = (int) ordinal;
                                            int i31 = (int) (ordinal >> 32);
                                            int i32 = ~i30;
                                            qq1 qq1Var = new qq1();
                                            qq1Var.g = i30;
                                            qq1Var.h = i31;
                                            qq1Var.i = 0;
                                            qq1Var.j = 0;
                                            qq1Var.k = i32;
                                            qq1Var.l = (i30 << 10) ^ (i31 >>> 4);
                                            if ((i31 | i30 | i32) != 0) {
                                                for (int i33 = 0; i33 < 64; i33++) {
                                                    qq1Var.b();
                                                }
                                                List e = i23 >= J.f ? zh.e(z50.COMPACT_CAR, z50.VAN, z50.TRUCK, z50.MOTORCYCLE, z50.TRACTOR) : zh.e(z50.COMPACT_CAR, z50.MOTORCYCLE, z50.TRACTOR);
                                                z50 z50Var = (z50) e.get(qq1Var.c(e.size()));
                                                float f3 = i23 * 0.004f;
                                                if (f3 > 0.09f) {
                                                    f3 = 0.09f;
                                                }
                                                arrayList6.add(new y50(j6, z50Var, 1.16f, (((qq1Var.a(24) / 1.6777216E7f) * 0.05f) + 0.25f + f3) * J.d, false));
                                                long j8 = j6 + 1;
                                                int ordinal2 = dsVar3.ordinal();
                                                if (ordinal2 == 0) {
                                                    j2 = 1750;
                                                } else if (ordinal2 == 1) {
                                                    j2 = 1500;
                                                } else if (ordinal2 == 2) {
                                                    j2 = 1280;
                                                } else {
                                                    l.a();
                                                }
                                                j5 = j2 - (14 * j7);
                                                if (j5 < 820) {
                                                    j5 = 820;
                                                }
                                                j = j8;
                                            } else {
                                                dd0.e("Initial state must have at least one non-zero element.");
                                            }
                                            return null;
                                        }
                                        f = f2;
                                        j = j6;
                                        e40 a3 = e40.a(a, null, i23, i24, 0, arrayList6, 0L, 0L, 0.0f, 0, j5, j, e40Var2.m + f, 9171);
                                        list = a3.f;
                                        if (list != null || !list.isEmpty()) {
                                            for (y50 y50Var2 : list) {
                                                if (Math.abs(y50Var2.c - 0.24f) >= z8.l(y50Var2.b) || (a3.g > 0 && z8.h(a3) > 0.05f)) {
                                                    a3 = a3;
                                                } else {
                                                    while (true) {
                                                        Object value3 = be1Var.getValue();
                                                        e40 e40Var3 = a3;
                                                        if (be1Var.h(value3, w8.a((w8) value3, null, kt0.a, null, 0, 0, null, null, null, e40.a(e40Var3, f40.g, 0, 0, 0, null, 0L, 0L, 0.0f, 0, 0L, 0L, 0.0f, 16381), false, 1789))) {
                                                            z8Var2.j(gc1.g, 28L);
                                                        } else {
                                                            a3 = e40Var3;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        e40Var = a3;
                                        if (i23 > i20 || i23 % 10 != 0) {
                                            do {
                                                value = be1Var.getValue();
                                            } while (!be1Var.h(value, w8.a((w8) value, null, null, null, 0, 0, null, null, null, e40Var, false, 1791)));
                                        } else {
                                            do {
                                                value2 = be1Var.getValue();
                                            } while (!be1Var.h(value2, w8.a((w8) value2, null, jt0.a, null, 0, 0, null, null, null, e40.a(e40Var, f40.e, 0, 0, 0, null, 0L, 0L, 0.0f, 0, 0L, 0L, 0.0f, 16381), false, 1789)));
                                            z8Var2.j(gc1.e, 28L);
                                        }
                                    } else {
                                        size12 = i29;
                                    }
                                }
                            }
                            z = true;
                            if (j5 > 0) {
                            }
                            f = f2;
                            j = j6;
                            e40 a32 = e40.a(a, null, i23, i24, 0, arrayList6, 0L, 0L, 0.0f, 0, j5, j, e40Var2.m + f, 9171);
                            list = a32.f;
                            if (list != null) {
                            }
                            while (r4.hasNext()) {
                            }
                            e40Var = a32;
                            if (i23 > i20) {
                            }
                            do {
                                value = be1Var.getValue();
                            } while (!be1Var.h(value, w8.a((w8) value, null, null, null, 0, 0, null, null, null, e40Var, false, 1791)));
                        }
                    }
                }
                y11Var.d = longValue;
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                ((v50) this.e).g.removeCallbacks((lf) this.g);
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                d60 d60Var = (d60) this.e;
                String str = (String) this.g;
                qn0 qn0Var = (qn0) obj;
                qn0Var.d(d60.d, str);
                d60Var.d(qn0Var, str);
                return null;
            case 9:
                j80 j80Var = (j80) this.e;
                h80 h80Var = (h80) this.g;
                j80Var.a.b(h80Var);
                j80Var.b.setValue(Boolean.TRUE);
                return new s4(j80Var, 3, h80Var);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                zf0 zf0Var = (zf0) this.e;
                Object obj13 = this.g;
                zf0Var.g.i(obj13);
                return new s4(zf0Var, i2, obj13);
            case RequestError.STOP_TRACKING /* 11 */:
                return new zf0((t51) this.e, (Map) obj, (r51) this.g);
            case 12:
                List list5 = (List) this.e;
                Function1 function12 = (Function1) this.g;
                kf0 kf0Var = (kf0) obj;
                kf0Var.getClass();
                kf0Var.a(list5.size(), new cl0(0, list5), new hk(802480018, true, new dl0(list5, function12)));
                return Unit.a;
            case 13:
                zq0 zq0Var = (zq0) this.e;
                zw0 zw0Var = (zw0) this.g;
                yw0 yw0Var = (yw0) obj;
                boolean z3 = zq0Var.u;
                float f4 = zq0Var.s;
                if (z3) {
                    yw0.n(yw0Var, zw0Var, yw0Var.H(f4), yw0Var.H(zq0Var.t));
                } else {
                    yw0.h(yw0Var, zw0Var, yw0Var.H(f4), yw0Var.H(zq0Var.t));
                }
                return Unit.a;
            case 14:
                ju0 ju0Var = (ju0) this.e;
                zw0 zw0Var2 = (zw0) this.g;
                yw0 yw0Var2 = (yw0) obj;
                boolean z4 = ju0Var.w;
                float f5 = ju0Var.s;
                if (z4) {
                    yw0.n(yw0Var2, zw0Var2, yw0Var2.H(f5), yw0Var2.H(ju0Var.t));
                } else {
                    yw0.h(yw0Var2, zw0Var2, yw0Var2.H(f5), yw0Var2.H(ju0Var.t));
                }
                return Unit.a;
            case 15:
                tl tlVar = (tl) this.e;
                wn0 wn0Var = (wn0) this.g;
                tlVar.A(obj);
                if (wn0Var != null) {
                    wn0Var.a(obj);
                }
                return Unit.a;
            case 16:
                o11 o11Var = (o11) this.e;
                Throwable th3 = (Throwable) this.g;
                Throwable th4 = (Throwable) obj;
                synchronized (o11Var.c) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th4 != null) {
                        try {
                            if (th4 instanceof CancellationException) {
                                th4 = null;
                            }
                            if (th4 != null) {
                                lw.a(th3, th4);
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    o11Var.e = th3;
                    be1 be1Var2 = o11Var.u;
                    k11 k11Var = k11.d;
                    be1Var2.getClass();
                    be1Var2.j(null, k11Var);
                }
                return Unit.a;
            case 17:
                b81 b81Var = (b81) this.e;
                d81 d81Var = (d81) this.g;
                nt ntVar = (nt) obj;
                float f6 = ntVar.b ? -1.0f : 1.0f;
                long j9 = ntVar.a;
                b81Var.a(1, wq0.f(f6, d81Var.d == et0.e ? wq0.a(1, j9) : wq0.a(2, j9)));
                return Unit.a;
            case 18:
                c51 c51Var = (c51) this.e;
                ak1 ak1Var2 = (ak1) this.g;
                dk1 dk1Var = (dk1) obj;
                synchronized (((sc1) c51Var.e)) {
                    try {
                        boolean c = dk1Var.c();
                        lj0 lj0Var = (lj0) c51Var.g;
                        if (c) {
                        }
                    } finally {
                    }
                }
                return Unit.a;
            case 19:
                sl1 sl1Var = (sl1) this.e;
                Function1 function13 = (Function1) this.g;
                ((Long) obj).getClass();
                float f7 = sl1Var.e;
                sl1Var.e = 0.0f;
                function13.invoke(Float.valueOf(f7));
                return Unit.a;
            case 20:
                ao0 ao0Var = (ao0) this.e;
                ao0 ao0Var2 = (ao0) this.g;
                h2 h2Var = (h2) obj;
                h2Var.getClass();
                int i34 = h2Var.d;
                ValueCallback valueCallback = (ValueCallback) ao0Var.getValue();
                if (valueCallback == null) {
                    return Unit.a;
                }
                Uri[] parseResult = WebChromeClient.FileChooserParams.parseResult(i34, h2Var.e);
                Uri uri = (Uri) ao0Var2.getValue();
                if (uri == null || i34 != -1 || (parseResult != null && parseResult.length != 0)) {
                    uri = null;
                }
                if (parseResult == null) {
                    parseResult = uri != null ? new Uri[]{uri} : null;
                    if (parseResult == null) {
                        parseResult = new Uri[0];
                    }
                }
                valueCallback.onReceiveValue(parseResult);
                ao0Var.setValue(null);
                ao0Var2.setValue(null);
                return Unit.a;
            default:
                kp1 kp1Var = (kp1) this.e;
                View view = (View) this.g;
                kp1Var.a(view);
                return new s4(kp1Var, 5, view);
        }
    }
}
