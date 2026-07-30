package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j61 implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ j61(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        a8 a8Var;
        Object a;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                wh1 wh1Var = (wh1) obj2;
                return wh1Var != null ? wh1.a(wh1Var.a, wh1.c) : false ? Boolean.FALSE : zh.c(Float.valueOf(wh1.c(wh1Var.a)), o61.a(new xh1(wh1.b(wh1Var.a)), o61.w, (o51) obj));
            case 1:
                ph0 ph0Var = (ph0) obj2;
                return zh.c(ph0Var.a, o61.a(ph0Var.b, o61.i, (o51) obj));
            case 2:
                long j = ((xh1) obj2).a;
                if (xh1.a(j, 8589934592L)) {
                    return 0;
                }
                if (xh1.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 3:
                wq0 wq0Var = (wq0) obj2;
                return wq0Var != null ? wq0.b(wq0Var.a, 9205357640488583168L) : false ? Boolean.FALSE : zh.c(Float.valueOf(Float.intBitsToFloat((int) (wq0Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (wq0Var.a & 4294967295L))));
            case 4:
                o51 o51Var = (o51) obj;
                x7 x7Var = (x7) obj2;
                Object obj3 = x7Var.a;
                if (obj3 instanceof uu0) {
                    a8Var = a8.d;
                } else if (obj3 instanceof jc1) {
                    a8Var = a8.e;
                } else if (obj3 instanceof an1) {
                    a8Var = a8.g;
                } else if (obj3 instanceof yl1) {
                    a8Var = a8.h;
                } else if (obj3 instanceof qh0) {
                    a8Var = a8.i;
                } else if (obj3 instanceof ph0) {
                    a8Var = a8.j;
                } else {
                    if (!(obj3 instanceof qe1)) {
                        throw new UnsupportedOperationException();
                    }
                    a8Var = a8.k;
                }
                switch (a8Var.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj3.getClass();
                        a = o61.a((uu0) obj3, o61.g, o51Var);
                        break;
                    case 1:
                        obj3.getClass();
                        a = o61.a((jc1) obj3, o61.h, o51Var);
                        break;
                    case 2:
                        obj3.getClass();
                        a = o61.a((an1) obj3, o61.c, o51Var);
                        break;
                    case 3:
                        obj3.getClass();
                        a = o61.a((yl1) obj3, o61.d, o51Var);
                        break;
                    case 4:
                        obj3.getClass();
                        a = o61.a((qh0) obj3, o61.e, o51Var);
                        break;
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        obj3.getClass();
                        a = o61.a((ph0) obj3, o61.f, o51Var);
                        break;
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj3.getClass();
                        a = ((qe1) obj3).a;
                        break;
                    default:
                        l.a();
                        return null;
                }
                return zh.c(a8Var, a, Integer.valueOf(x7Var.b), Integer.valueOf(x7Var.c), x7Var.d);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                o51 o51Var2 = (o51) obj;
                List list = ((mi0) obj2).d;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(o61.a((li0) list.get(i), o61.z, o51Var2));
                }
                return arrayList;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((li0) obj2).a.toLanguageTag();
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                o51 o51Var3 = (o51) obj;
                jh0 jh0Var = (jh0) obj2;
                return zh.c(o61.a(new gh0(jh0Var.a), o61.B, o51Var3), o61.a(new ih0(jh0Var.b), o61.C, o51Var3), o61.a(new hh0(jh0Var.c), o61.D, o51Var3));
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return Float.valueOf(((gh0) obj2).a);
            case 9:
                return Integer.valueOf(((ih0) obj2).a);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return Integer.valueOf(((hh0) obj2).a);
            case RequestError.STOP_TRACKING /* 11 */:
                return ((an1) obj2).a;
            case 12:
                o51 o51Var4 = (o51) obj;
                uu0 uu0Var = (uu0) obj2;
                Object a2 = o61.a(new tg1(uu0Var.a), o61.q, o51Var4);
                Object a3 = o61.a(new yg1(uu0Var.b), o61.r, o51Var4);
                Object a4 = o61.a(new wh1(uu0Var.c), o61.v, o51Var4);
                bh1 bh1Var = uu0Var.d;
                bh1 bh1Var2 = bh1.c;
                Object a5 = o61.a(bh1Var, o61.l, o51Var4);
                Object a6 = o61.a(uu0Var.e, p4.i, o51Var4);
                jh0 jh0Var2 = uu0Var.f;
                jh0 jh0Var3 = jh0.d;
                return zh.c(a2, a3, a4, a5, a6, o61.a(jh0Var2, o61.A, o51Var4), o61.a(new eh0(uu0Var.g), p4.k, o51Var4), o61.a(new s60(uu0Var.h), o61.s, o51Var4), o61.a(uu0Var.i, p4.l, o51Var4));
            case 13:
                return ((yl1) obj2).a;
            case 14:
                o51 o51Var5 = (o51) obj;
                jc1 jc1Var = (jc1) obj2;
                hi hiVar = new hi(jc1Var.a.c());
                n61 n61Var = o61.p;
                Object a7 = o61.a(hiVar, n61Var, o51Var5);
                wh1 wh1Var2 = new wh1(jc1Var.b);
                n61 n61Var2 = o61.v;
                Object a8 = o61.a(wh1Var2, n61Var2, o51Var5);
                x20 x20Var = jc1Var.c;
                x20 x20Var2 = x20.e;
                Object a9 = o61.a(x20Var, o61.m, o51Var5);
                Object a10 = o61.a(jc1Var.d, o61.t, o51Var5);
                Object a11 = o61.a(jc1Var.e, o61.u, o51Var5);
                String str = jc1Var.g;
                Object a12 = o61.a(new wh1(jc1Var.h), n61Var2, o51Var5);
                Object a13 = o61.a(jc1Var.i, o61.n, o51Var5);
                Object a14 = o61.a(jc1Var.j, o61.k, o51Var5);
                mi0 mi0Var = jc1Var.k;
                mi0 mi0Var2 = mi0.g;
                Object a15 = o61.a(mi0Var, o61.y, o51Var5);
                Object a16 = o61.a(new hi(jc1Var.l), n61Var, o51Var5);
                Object a17 = o61.a(jc1Var.m, o61.j, o51Var5);
                s91 s91Var = jc1Var.n;
                s91 s91Var2 = s91.d;
                return zh.c(a7, a8, a9, a10, a11, -1, str, a12, a13, a14, a15, a16, a17, o61.a(s91Var, o61.o, o51Var5));
            case 15:
                o51 o51Var6 = (o51) obj;
                jh1 jh1Var = (jh1) obj2;
                jc1 jc1Var2 = jh1Var.a;
                c51 c51Var = o61.h;
                return zh.c(o61.a(jc1Var2, c51Var, o51Var6), o61.a(jh1Var.b, c51Var, o51Var6), o61.a(jh1Var.c, c51Var, o51Var6), o61.a(jh1Var.d, c51Var, o51Var6));
            case 16:
                hx0 hx0Var = (hx0) obj2;
                Boolean valueOf = Boolean.valueOf(hx0Var.a);
                c51 c51Var2 = o61.a;
                return zh.c(valueOf, o61.a(new hv(hx0Var.b), p4.j, (o51) obj));
            case 17:
                return Integer.valueOf(((hv) obj2).a);
            case 18:
                return Integer.valueOf(((eh0) obj2).a);
            case 19:
                lh1 lh1Var = (lh1) obj2;
                return zh.c(o61.a(new kh1(lh1Var.a), p4.m, (o51) obj), Boolean.valueOf(lh1Var.b));
            case 20:
                return Integer.valueOf(((kh1) obj2).a);
            case 21:
                return Integer.valueOf(((h71) obj2).a.h());
            case 22:
                return obj;
            case 23:
                if (obj == null) {
                } else {
                    af.c();
                }
                return null;
            case 24:
                return (fi1) obj;
            default:
                return Integer.valueOf(((ro1) obj).b((nr) obj2));
        }
    }
}
