package defpackage;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class o61 {
    public static final c51 A;
    public static final n61 B;
    public static final n61 C;
    public static final n61 D;
    public static final c51 a;
    public static final c51 b;
    public static final c51 c;
    public static final c51 d;
    public static final c51 e;
    public static final c51 f;
    public static final c51 g;
    public static final c51 h;
    public static final c51 i;
    public static final c51 j;
    public static final c51 k;
    public static final c51 l;
    public static final c51 m;
    public static final c51 n;
    public static final c51 o;
    public static final n61 p;
    public static final n61 q;
    public static final n61 r;
    public static final n61 s;
    public static final c51 t;
    public static final c51 u;
    public static final n61 v;
    public static final n61 w;
    public static final n61 x;
    public static final c51 y;
    public static final c51 z;

    static {
        final int i2 = 15;
        final byte b2 = 0;
        final int i3 = 1;
        final int i4 = 3;
        new c51(new e9(i2, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i5 = 0;
                jc1 jc1Var = null;
                r7 = null;
                lh1 lh1Var = null;
                r7 = null;
                ph0 ph0Var = null;
                r7 = null;
                qh0 qh0Var = null;
                r7 = null;
                yl1 yl1Var = null;
                r7 = null;
                an1 an1Var = null;
                r7 = null;
                jc1 jc1Var2 = null;
                r7 = null;
                uu0 uu0Var = null;
                r7 = null;
                jh1 jh1Var = null;
                r7 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i6 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i5 < size) {
                            Object obj17 = list9.get(i5);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i5++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i5 < size2) {
                            Object obj22 = list12.get(i5);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i5++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i7 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i7, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i8 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i9 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i10 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i11 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i8, i9, j5, bh1Var2, hx0Var, jh0Var2, i10, i11, lh1Var);
                }
            }
        });
        final int i5 = 13;
        a = new c51(new e9(22, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i5) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i6 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i7 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i7, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i8 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i9 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i10 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i11 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i8, i9, j5, bh1Var2, hx0Var, jh0Var2, i10, i11, lh1Var);
                }
            }
        });
        final int i6 = 4;
        final int i7 = 25;
        b = new c51(new j61(i6), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i7) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i8 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i9 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i10 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i11 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i8, i9, j5, bh1Var2, hx0Var, jh0Var2, i10, i11, lh1Var);
                }
            }
        });
        final int i8 = 11;
        final int i9 = 27;
        c = new c51(new j61(i8), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i9) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i10 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i11 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i10, i11, lh1Var);
                }
            }
        });
        final int i10 = 28;
        d = new c51(new j61(i5), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i10) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i11 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i11, lh1Var);
                }
            }
        });
        final int i11 = 10;
        e = new c51(new e9(20, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i12 = 21;
        f = new c51(new j61(i3), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i13 = 12;
        final int i14 = 29;
        g = new c51(new j61(i13), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i14) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i15 = 14;
        h = new c51(new j61(i15), i4, new k61(b2));
        i = new c51(new j61(i2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (b2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i16 = 16;
        final int i17 = 2;
        j = new c51(new e9(i16, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i17) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        k = new c51(new e9(17, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i18 = 18;
        l = new c51(new e9(i18, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i6) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i19 = 5;
        m = new c51(new e9(19, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i19) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        e9 e9Var = new e9(i12, b2);
        final int i20 = 6;
        n = new c51(e9Var, i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i20) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i21 = 7;
        new c51(new e9(23, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i21) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i22 = 8;
        o = new c51(new e9(24, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        p = new n61(l61.d, m61.d);
        e9 e9Var2 = new e9(i7, b2);
        final int i23 = 9;
        q = new n61(e9Var2, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i23) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        r = new n61(new e9(26, b2), new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i8) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        s = new n61(new e9(i9, b2), new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        t = new c51(new e9(i10, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i15) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        u = new c51(new e9(i14, b2), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        v = new n61(new j61(b2), new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i16) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i24 = 17;
        w = new n61(new j61(2), new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i24) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        x = new n61(new j61(i4), new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i18) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i25 = 19;
        y = new c51(new j61(5), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i25) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i26 = 20;
        z = new c51(new j61(6), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i26) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i27 = 22;
        A = new c51(new j61(7), i4, new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i27) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i28 = 23;
        B = new n61(new j61(8), new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i28) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i29 = 24;
        C = new n61(new j61(9), new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i29) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
        final int i30 = 26;
        D = new n61(new j61(10), new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x7 x7Var;
                int i52 = 0;
                jc1 jc1Var = null;
                lh1Var = null;
                lh1 lh1Var = null;
                ph0Var = null;
                ph0 ph0Var = null;
                qh0Var = null;
                qh0 qh0Var = null;
                yl1Var = null;
                yl1 yl1Var = null;
                an1Var = null;
                an1 an1Var = null;
                jc1Var2 = null;
                jc1 jc1Var2 = null;
                uu0Var = null;
                uu0 uu0Var = null;
                jh1Var = null;
                jh1 jh1Var = null;
                jh1Var2 = null;
                jh1 jh1Var2 = null;
                jc1Var = null;
                switch (i30) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj.getClass();
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Function1 function1 = (Function1) o61.h.g;
                        Boolean bool = Boolean.FALSE;
                        jc1 jc1Var3 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (jc1) function1.invoke(obj2);
                        Object obj3 = list.get(1);
                        jc1 jc1Var4 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (jc1) function1.invoke(obj3);
                        Object obj4 = list.get(2);
                        jc1 jc1Var5 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (jc1) function1.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                            jc1Var = (jc1) function1.invoke(obj5);
                        }
                        return new jh1(jc1Var3, jc1Var4, jc1Var5, jc1Var);
                    case 1:
                        obj.getClass();
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) o61.a.g).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        str.getClass();
                        return new y7(list3, str);
                    case 2:
                        obj.getClass();
                        return new wg1(((Integer) obj).intValue());
                    case 3:
                        obj.getClass();
                        List list4 = (List) obj;
                        return new ah1(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        obj.getClass();
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        xh1[] xh1VarArr = wh1.b;
                        Function1 function12 = o61.v.e;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        wh1 wh1Var = obj8 != null ? (wh1) function12.invoke(obj8) : null;
                        wh1Var.getClass();
                        long j2 = wh1Var.a;
                        Object obj9 = list5.get(1);
                        Intrinsics.a(obj9, bool2);
                        wh1 wh1Var2 = obj9 != null ? (wh1) function12.invoke(obj9) : null;
                        wh1Var2.getClass();
                        return new bh1(j2, wh1Var2.a);
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj.getClass();
                        return new x20(((Integer) obj).intValue());
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj.getClass();
                        return new ad(((Float) obj).floatValue());
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj.getClass();
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        num.getClass();
                        int intValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        num2.getClass();
                        return new mh1(ka0.b(intValue, num2.intValue()));
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        obj.getClass();
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i62 = hi.h;
                        Boolean bool3 = Boolean.FALSE;
                        Intrinsics.a(obj12, bool3);
                        hi hiVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new hi(hi.g) : new hi(la0.c(((Integer) obj12).intValue())) : null;
                        hiVar.getClass();
                        long j3 = hiVar.a;
                        Object obj13 = list7.get(1);
                        n61 n61Var = o61.x;
                        Intrinsics.a(obj13, bool3);
                        wq0 wq0Var = obj13 != null ? (wq0) n61Var.e.invoke(obj13) : null;
                        wq0Var.getClass();
                        long j4 = wq0Var.a;
                        Object obj14 = list7.get(2);
                        Float f2 = obj14 != null ? (Float) obj14 : null;
                        f2.getClass();
                        return new s91(f2.floatValue(), j3, j4);
                    case 9:
                        obj.getClass();
                        return new tg1(((Integer) obj).intValue());
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        obj.getClass();
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        str2.getClass();
                        Object obj16 = list8.get(1);
                        c51 c51Var = o61.i;
                        if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                            jh1Var2 = (jh1) ((Function1) c51Var.g).invoke(obj16);
                        }
                        return new qh0(str2, jh1Var2);
                    case RequestError.STOP_TRACKING /* 11 */:
                        obj.getClass();
                        return new yg1(((Integer) obj).intValue());
                    case 12:
                        obj.getClass();
                        return new s60(((Integer) obj).intValue());
                    case 13:
                        obj.getClass();
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i52 < size) {
                            Object obj17 = list9.get(i52);
                            x7 x7Var2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x7) ((Function1) o61.b.g).invoke(obj17);
                            x7Var2.getClass();
                            arrayList.add(x7Var2);
                            i52++;
                        }
                        return arrayList;
                    case 14:
                        obj.getClass();
                        return new t20(((Integer) obj).intValue());
                    case 15:
                        obj.getClass();
                        return new u20(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool4)) {
                            return new wh1(wh1.c);
                        }
                        obj.getClass();
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f3 = obj18 != null ? (Float) obj18 : null;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        Object obj19 = list10.get(1);
                        n61 n61Var2 = o61.w;
                        Intrinsics.a(obj19, bool4);
                        xh1 xh1Var = obj19 != null ? (xh1) n61Var2.e.invoke(obj19) : null;
                        xh1Var.getClass();
                        return new wh1(t80.E(floatValue, xh1Var.a));
                    case 17:
                        return Intrinsics.a(obj, 0) ? new xh1(8589934592L) : Intrinsics.a(obj, 1) ? new xh1(4294967296L) : new xh1(0L);
                    case 18:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new wq0(9205357640488583168L);
                        }
                        obj.getClass();
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f4 = obj20 != null ? (Float) obj20 : null;
                        f4.getClass();
                        float floatValue2 = f4.floatValue();
                        Object obj21 = list11.get(1);
                        (obj21 != null ? (Float) obj21 : null).getClass();
                        return new wq0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r7.floatValue()) & 4294967295L));
                    case 19:
                        obj.getClass();
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i52 < size2) {
                            Object obj22 = list12.get(i52);
                            li0 li0Var = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (li0) ((Function1) o61.z.g).invoke(obj22);
                            li0Var.getClass();
                            arrayList2.add(li0Var);
                            i52++;
                        }
                        return new mi0(arrayList2);
                    case 20:
                        obj.getClass();
                        String str3 = (String) obj;
                        fx0.a.getClass();
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new li0(forLanguageTag);
                    case 21:
                        obj.getClass();
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        str4.getClass();
                        Object obj24 = list13.get(1);
                        c51 c51Var2 = o61.i;
                        if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                            jh1Var = (jh1) ((Function1) c51Var2.g).invoke(obj24);
                        }
                        return new ph0(str4, jh1Var);
                    case 22:
                        obj.getClass();
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f5 = gh0.b;
                        n61 n61Var3 = o61.B;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj25, bool5);
                        gh0 gh0Var = obj25 != null ? (gh0) n61Var3.e.invoke(obj25) : null;
                        gh0Var.getClass();
                        float f6 = gh0Var.a;
                        Object obj26 = list14.get(1);
                        n61 n61Var4 = o61.C;
                        Intrinsics.a(obj26, bool5);
                        ih0 ih0Var = obj26 != null ? (ih0) n61Var4.e.invoke(obj26) : null;
                        ih0Var.getClass();
                        int i72 = ih0Var.a;
                        Object obj27 = list14.get(2);
                        n61 n61Var5 = o61.D;
                        Intrinsics.a(obj27, bool5);
                        hh0 hh0Var = obj27 != null ? (hh0) n61Var5.e.invoke(obj27) : null;
                        hh0Var.getClass();
                        return new jh0(f6, i72, hh0Var.a);
                    case 23:
                        obj.getClass();
                        float floatValue3 = ((Float) obj).floatValue();
                        gh0.a(floatValue3);
                        return new gh0(floatValue3);
                    case 24:
                        obj.getClass();
                        return new ih0(((Integer) obj).intValue());
                    case 25:
                        obj.getClass();
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        a8 a8Var = obj28 != null ? (a8) obj28 : null;
                        a8Var.getClass();
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        num4.getClass();
                        int intValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        str5.getClass();
                        switch (a8Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj32 = list15.get(1);
                                c51 c51Var3 = o61.g;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    uu0Var = (uu0) ((Function1) c51Var3.g).invoke(obj32);
                                }
                                uu0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, uu0Var, str5);
                                break;
                            case 1:
                                Object obj33 = list15.get(1);
                                c51 c51Var4 = o61.h;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    jc1Var2 = (jc1) ((Function1) c51Var4.g).invoke(obj33);
                                }
                                jc1Var2.getClass();
                                x7Var = new x7(intValue2, intValue3, jc1Var2, str5);
                                break;
                            case 2:
                                Object obj34 = list15.get(1);
                                c51 c51Var5 = o61.c;
                                if (!Intrinsics.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    an1Var = (an1) ((Function1) c51Var5.g).invoke(obj34);
                                }
                                an1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, an1Var, str5);
                                break;
                            case 3:
                                Object obj35 = list15.get(1);
                                c51 c51Var6 = o61.d;
                                if (!Intrinsics.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    yl1Var = (yl1) ((Function1) c51Var6.g).invoke(obj35);
                                }
                                yl1Var.getClass();
                                x7Var = new x7(intValue2, intValue3, yl1Var, str5);
                                break;
                            case 4:
                                Object obj36 = list15.get(1);
                                c51 c51Var7 = o61.e;
                                if (!Intrinsics.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    qh0Var = (qh0) ((Function1) c51Var7.g).invoke(obj36);
                                }
                                qh0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, qh0Var, str5);
                                break;
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                Object obj37 = list15.get(1);
                                c51 c51Var8 = o61.f;
                                if (!Intrinsics.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    ph0Var = (ph0) ((Function1) c51Var8.g).invoke(obj37);
                                }
                                ph0Var.getClass();
                                x7Var = new x7(intValue2, intValue3, ph0Var, str5);
                                break;
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                str6.getClass();
                                x7Var = new x7(intValue2, intValue3, new qe1(str6), str5);
                                break;
                            default:
                                l.a();
                                return null;
                        }
                        return x7Var;
                    case 26:
                        obj.getClass();
                        return new hh0(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        str7.getClass();
                        return new an1(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        str8.getClass();
                        return new yl1(str8);
                    default:
                        obj.getClass();
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        n61 n61Var6 = o61.q;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj39, bool6);
                        tg1 tg1Var = obj39 != null ? (tg1) n61Var6.e.invoke(obj39) : null;
                        tg1Var.getClass();
                        int i82 = tg1Var.a;
                        Object obj40 = list16.get(1);
                        n61 n61Var7 = o61.r;
                        Intrinsics.a(obj40, bool6);
                        yg1 yg1Var = obj40 != null ? (yg1) n61Var7.e.invoke(obj40) : null;
                        yg1Var.getClass();
                        int i92 = yg1Var.a;
                        Object obj41 = list16.get(2);
                        xh1[] xh1VarArr2 = wh1.b;
                        n61 n61Var8 = o61.v;
                        Intrinsics.a(obj41, bool6);
                        wh1 wh1Var3 = obj41 != null ? (wh1) n61Var8.e.invoke(obj41) : null;
                        wh1Var3.getClass();
                        long j5 = wh1Var3.a;
                        Object obj42 = list16.get(3);
                        bh1 bh1Var = bh1.c;
                        bh1 bh1Var2 = (Intrinsics.a(obj42, bool6) || obj42 == null) ? null : (bh1) ((Function1) o61.l.g).invoke(obj42);
                        Object obj43 = list16.get(4);
                        hx0 hx0Var = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (hx0) ((Function1) p4.i.g).invoke(obj43);
                        Object obj44 = list16.get(5);
                        jh0 jh0Var = jh0.d;
                        jh0 jh0Var2 = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (jh0) ((Function1) o61.A.g).invoke(obj44);
                        Object obj45 = list16.get(6);
                        eh0 eh0Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (eh0) ((Function1) p4.k.g).invoke(obj45);
                        eh0Var.getClass();
                        int i102 = eh0Var.a;
                        Object obj46 = list16.get(7);
                        n61 n61Var9 = o61.s;
                        Intrinsics.a(obj46, bool6);
                        s60 s60Var = obj46 != null ? (s60) n61Var9.e.invoke(obj46) : null;
                        s60Var.getClass();
                        int i112 = s60Var.a;
                        Object obj47 = list16.get(8);
                        c51 c51Var9 = p4.l;
                        if (!Intrinsics.a(obj47, bool6) && obj47 != null) {
                            lh1Var = (lh1) ((Function1) c51Var9.g).invoke(obj47);
                        }
                        return new uu0(i82, i92, j5, bh1Var2, hx0Var, jh0Var2, i102, i112, lh1Var);
                }
            }
        });
    }

    public static final Object a(Object obj, h61 h61Var, o51 o51Var) {
        Object c2;
        return (obj == null || (c2 = h61Var.c(o51Var, obj)) == null) ? Boolean.FALSE : c2;
    }
}
