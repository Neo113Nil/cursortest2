package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k61 implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ k61(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x20 x20Var;
        hi hiVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i = hi.h;
                Boolean bool = Boolean.FALSE;
                Intrinsics.a(obj2, bool);
                hi hiVar2 = obj2 != null ? obj2.equals(bool) ? new hi(hi.g) : new hi(la0.c(((Integer) obj2).intValue())) : null;
                hiVar2.getClass();
                long j = hiVar2.a;
                Object obj3 = list.get(1);
                xh1[] xh1VarArr = wh1.b;
                Function1 function1 = o61.v.e;
                Intrinsics.a(obj3, bool);
                wh1 wh1Var = obj3 != null ? (wh1) function1.invoke(obj3) : null;
                wh1Var.getClass();
                long j2 = wh1Var.a;
                Object obj4 = list.get(2);
                x20 x20Var2 = x20.e;
                x20 x20Var3 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (x20) ((Function1) o61.m.g).invoke(obj4);
                Object obj5 = list.get(3);
                t20 t20Var = (Intrinsics.a(obj5, bool) || obj5 == null) ? null : (t20) ((Function1) o61.t.g).invoke(obj5);
                Object obj6 = list.get(4);
                u20 u20Var = (Intrinsics.a(obj6, bool) || obj6 == null) ? null : (u20) ((Function1) o61.u.g).invoke(obj6);
                Object obj7 = list.get(6);
                String str = obj7 != null ? (String) obj7 : null;
                Object obj8 = list.get(7);
                Intrinsics.a(obj8, bool);
                wh1 wh1Var2 = obj8 != null ? (wh1) function1.invoke(obj8) : null;
                wh1Var2.getClass();
                long j3 = wh1Var2.a;
                Object obj9 = list.get(8);
                ad adVar = (Intrinsics.a(obj9, bool) || obj9 == null) ? null : (ad) ((Function1) o61.n.g).invoke(obj9);
                Object obj10 = list.get(9);
                ah1 ah1Var = (Intrinsics.a(obj10, bool) || obj10 == null) ? null : (ah1) ((Function1) o61.k.g).invoke(obj10);
                Object obj11 = list.get(10);
                mi0 mi0Var = mi0.g;
                mi0 mi0Var2 = (Intrinsics.a(obj11, bool) || obj11 == null) ? null : (mi0) ((Function1) o61.y.g).invoke(obj11);
                Object obj12 = list.get(11);
                Intrinsics.a(obj12, bool);
                if (obj12 == null) {
                    x20Var = x20Var3;
                    hiVar = null;
                } else if (obj12.equals(bool)) {
                    x20Var = x20Var3;
                    hiVar = new hi(hi.g);
                } else {
                    x20Var = x20Var3;
                    hiVar = new hi(la0.c(((Integer) obj12).intValue()));
                }
                hiVar.getClass();
                long j4 = hiVar.a;
                Object obj13 = list.get(12);
                wg1 wg1Var = (Intrinsics.a(obj13, bool) || obj13 == null) ? null : (wg1) ((Function1) o61.j.g).invoke(obj13);
                Object obj14 = list.get(13);
                s91 s91Var = s91.d;
                return new jc1(j, j2, x20Var, t20Var, u20Var, (w10) null, str, j3, adVar, ah1Var, mi0Var2, j4, wg1Var, (Intrinsics.a(obj14, bool) || obj14 == null) ? null : (s91) ((Function1) o61.o.g).invoke(obj14), 49184);
            case 1:
                obj.getClass();
                List list2 = (List) obj;
                Object obj15 = list2.get(0);
                Boolean bool2 = obj15 != null ? (Boolean) obj15 : null;
                bool2.getClass();
                boolean booleanValue = bool2.booleanValue();
                Object obj16 = list2.get(1);
                hv hvVar = (Intrinsics.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (hv) ((Function1) p4.j.g).invoke(obj16);
                hvVar.getClass();
                return new hx0(hvVar.a, booleanValue);
            case 2:
                obj.getClass();
                return new hv(((Integer) obj).intValue());
            case 3:
                obj.getClass();
                return new eh0(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                List list3 = (List) obj;
                Object obj17 = list3.get(0);
                kh1 kh1Var = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (kh1) ((Function1) p4.m.g).invoke(obj17);
                kh1Var.getClass();
                int i2 = kh1Var.a;
                Object obj18 = list3.get(1);
                Boolean bool3 = obj18 != null ? (Boolean) obj18 : null;
                bool3.getClass();
                return new lh1(i2, bool3.booleanValue());
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                obj.getClass();
                return new kh1(((Integer) obj).intValue());
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return new h71(((Integer) obj).intValue());
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(!false);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return Boolean.valueOf(obj == null);
            case 9:
                return Unit.a;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                dc0[] dc0VarArr = s81.a;
                t81 t81Var = p81.l;
                dc0 dc0Var = s81.a[5];
                ((u81) obj).a(t81Var, Boolean.TRUE);
                return Unit.a;
            case 12:
                return Unit.a;
            case 13:
                return new r7(((Float) obj).floatValue());
            case 14:
                return new r7(((Integer) obj).intValue());
            case 15:
                return Integer.valueOf((int) ((r7) obj).a);
            case 16:
                return new r7(((bt) obj).d);
            case 17:
                return new bt(((r7) obj).a);
            case 18:
                dt dtVar = (dt) obj;
                return new s7(Float.intBitsToFloat((int) (dtVar.a >> 32)), Float.intBitsToFloat((int) (dtVar.a & 4294967295L)));
            case 19:
                s7 s7Var = (s7) obj;
                return new dt((Float.floatToRawIntBits(s7Var.a) << 32) | (Float.floatToRawIntBits(s7Var.b) & 4294967295L));
            case 20:
                va1 va1Var = (va1) obj;
                return new s7(Float.intBitsToFloat((int) (va1Var.a >> 32)), Float.intBitsToFloat((int) (va1Var.a & 4294967295L)));
            case 21:
                s7 s7Var2 = (s7) obj;
                return new va1((Float.floatToRawIntBits(s7Var2.a) << 32) | (Float.floatToRawIntBits(s7Var2.b) & 4294967295L));
            case 22:
                wq0 wq0Var = (wq0) obj;
                return new s7(Float.intBitsToFloat((int) (wq0Var.a >> 32)), Float.intBitsToFloat((int) (wq0Var.a & 4294967295L)));
            case 23:
                s7 s7Var3 = (s7) obj;
                return new wq0((Float.floatToRawIntBits(s7Var3.a) << 32) | (Float.floatToRawIntBits(s7Var3.b) & 4294967295L));
            case 24:
                long j5 = ((s90) obj).a;
                return new s7((int) (j5 >> 32), (int) (j5 & 4294967295L));
            case 25:
                s7 s7Var4 = (s7) obj;
                return new s90((Math.round(s7Var4.a) << 32) | (Math.round(s7Var4.b) & 4294967295L));
            case 26:
                long j6 = ((ba0) obj).a;
                return new s7((int) (j6 >> 32), (int) (j6 & 4294967295L));
            case 27:
                s7 s7Var5 = (s7) obj;
                int round = Math.round(s7Var5.a);
                if (round < 0) {
                    round = 0;
                }
                return new ba0((round << 32) | ((Math.round(s7Var5.b) >= 0 ? r0 : 0) & 4294967295L));
            case 28:
                s11 s11Var = (s11) obj;
                return new u7(s11Var.a, s11Var.b, s11Var.c, s11Var.d);
            default:
                u7 u7Var = (u7) obj;
                return new s11(u7Var.a, u7Var.b, u7Var.c, u7Var.d);
        }
    }
}
