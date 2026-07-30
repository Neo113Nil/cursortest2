package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class mq1 implements le0 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ mq1(ex1 ex1Var) {
        this.rtx2ld2ELZv4 = 2;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        hl hlVar;
        q82 q82Var = null;
        r1 = null;
        mi2 mi2Var = null;
        r1 = null;
        mi2 mi2Var2 = null;
        q82Var = null;
        int i = 0;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                Context context = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                while (i < size) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                        i++;
                    }
                    arrayList.add(resolveInfo);
                    i++;
                }
                return arrayList;
            case 1:
                yb1 yb1Var = (yb1) obj;
                yb1Var.getClass();
                yb1Var.lS5Rgt96tfkO = true;
                return no2.PxuCJdSBwIXG;
            case 2:
                ((uv) obj).getClass();
                throw new ce1(0);
            case 3:
                return new yy1((Map) obj);
            case 4:
                return obj;
            case 5:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                le0 le0Var = (le0) zz1.rtx2ld2ELZv4.wdg6QnbFHrFF;
                Boolean bool = Boolean.FALSE;
                q82 q82Var2 = (cs0.wdg6QnbFHrFF(obj2, bool) || obj2 == null) ? null : (q82) le0Var.OPXfSBeufaJ8(obj2);
                Object obj3 = list.get(1);
                q82 q82Var3 = (cs0.wdg6QnbFHrFF(obj3, bool) || obj3 == null) ? null : (q82) le0Var.OPXfSBeufaJ8(obj3);
                Object obj4 = list.get(2);
                q82 q82Var4 = (cs0.wdg6QnbFHrFF(obj4, bool) || obj4 == null) ? null : (q82) le0Var.OPXfSBeufaJ8(obj4);
                Object obj5 = list.get(3);
                if (!cs0.wdg6QnbFHrFF(obj5, bool) && obj5 != null) {
                    q82Var = (q82) le0Var.OPXfSBeufaJ8(obj5);
                }
                return new mi2(q82Var2, q82Var3, q82Var4, q82Var);
            case 6:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (cs0.wdg6QnbFHrFF(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((le0) zz1.PxuCJdSBwIXG.wdg6QnbFHrFF).OPXfSBeufaJ8(obj6);
                Object obj7 = list2.get(0);
                String str2 = obj7 != null ? (String) obj7 : null;
                str2.getClass();
                return new v8(list3, str2);
            case 7:
                obj.getClass();
                return new if2(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                List list4 = (List) obj;
                return new th2(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 9:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                gj2 gj2Var = hj2.Companion;
                le0 le0Var2 = zz1.VhhvGxCb8gfr.OPXfSBeufaJ8;
                Boolean bool2 = Boolean.FALSE;
                cs0.wdg6QnbFHrFF(obj8, bool2);
                hj2 hj2Var = obj8 != null ? (hj2) le0Var2.OPXfSBeufaJ8(obj8) : null;
                hj2Var.getClass();
                long j = hj2Var.PxuCJdSBwIXG;
                Object obj9 = list5.get(1);
                cs0.wdg6QnbFHrFF(obj9, bool2);
                hj2 hj2Var2 = obj9 != null ? (hj2) le0Var2.OPXfSBeufaJ8(obj9) : null;
                hj2Var2.getClass();
                return new zh2(j, hj2Var2.PxuCJdSBwIXG);
            case 10:
                obj.getClass();
                return new xc0(((Integer) obj).intValue());
            case 11:
                obj.getClass();
                return new uc(((Float) obj).floatValue());
            case 12:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new vi2(jh0.rtx2ld2ELZv4(intValue, num2.intValue()));
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                gl glVar = hl.Companion;
                Boolean bool3 = Boolean.FALSE;
                cs0.wdg6QnbFHrFF(obj12, bool3);
                if (obj12 == null) {
                    hlVar = null;
                } else if (cs0.wdg6QnbFHrFF(obj12, Boolean.FALSE)) {
                    hl.Companion.getClass();
                    hlVar = new hl(hl.RAsUl2FVSrh6);
                } else {
                    hlVar = new hl(mm2.TSizfFm2Yiuu(((Integer) obj12).intValue()));
                }
                hlVar.getClass();
                long j2 = hlVar.PxuCJdSBwIXG;
                Object obj13 = list7.get(1);
                yz1 yz1Var = zz1.ZbWwgt3aGe7A;
                cs0.wdg6QnbFHrFF(obj13, bool3);
                bf1 bf1Var = obj13 != null ? (bf1) yz1Var.OPXfSBeufaJ8.OPXfSBeufaJ8(obj13) : null;
                bf1Var.getClass();
                long j3 = bf1Var.PxuCJdSBwIXG;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new w42(f.floatValue(), j2, j3);
            case 14:
                obj.getClass();
                return new he2(((Integer) obj).intValue());
            case 15:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str3 = obj15 != null ? (String) obj15 : null;
                str3.getClass();
                Object obj16 = list8.get(1);
                cr1 cr1Var = zz1.OPXfSBeufaJ8;
                if (!cs0.wdg6QnbFHrFF(obj16, Boolean.FALSE) && obj16 != null) {
                    mi2Var2 = (mi2) ((le0) cr1Var.wdg6QnbFHrFF).OPXfSBeufaJ8(obj16);
                }
                return new u11(str3, mi2Var2);
            case 16:
                obj.getClass();
                return new nf2(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                return new om0(((Integer) obj).intValue());
            case 18:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i < size2) {
                    Object obj17 = list9.get(i);
                    u8 u8Var = (cs0.wdg6QnbFHrFF(obj17, Boolean.FALSE) || obj17 == null) ? null : (u8) ((le0) zz1.lS5Rgt96tfkO.wdg6QnbFHrFF).OPXfSBeufaJ8(obj17);
                    u8Var.getClass();
                    arrayList2.add(u8Var);
                    i++;
                }
                return arrayList2;
            case 19:
                obj.getClass();
                return new rc0(((Integer) obj).intValue());
            case 20:
                obj.getClass();
                return new tc0(((Integer) obj).intValue());
            case 21:
                Boolean bool4 = Boolean.FALSE;
                if (cs0.wdg6QnbFHrFF(obj, bool4)) {
                    hj2.Companion.getClass();
                    return new hj2(hj2.TSizfFm2Yiuu);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                f2.getClass();
                float floatValue = f2.floatValue();
                Object obj19 = list10.get(1);
                yz1 yz1Var2 = zz1.S2OOm9zPNm0h;
                cs0.wdg6QnbFHrFF(obj19, bool4);
                jj2 jj2Var = obj19 != null ? (jj2) yz1Var2.OPXfSBeufaJ8.OPXfSBeufaJ8(obj19) : null;
                jj2Var.getClass();
                return new hj2(ki0.wLFCmsViZrNT(jj2Var.PxuCJdSBwIXG, floatValue));
            case 22:
                if (cs0.wdg6QnbFHrFF(obj, 0)) {
                    jj2.Companion.getClass();
                    return new jj2(8589934592L);
                }
                if (cs0.wdg6QnbFHrFF(obj, 1)) {
                    jj2.Companion.getClass();
                    return new jj2(4294967296L);
                }
                jj2.Companion.getClass();
                return new jj2(0L);
            case 23:
                if (cs0.wdg6QnbFHrFF(obj, Boolean.FALSE)) {
                    bf1.Companion.getClass();
                    return new bf1(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f3 = obj20 != null ? (Float) obj20 : null;
                f3.getClass();
                float floatValue2 = f3.floatValue();
                Object obj21 = list11.get(1);
                (obj21 != null ? (Float) obj21 : null).getClass();
                return new bf1((Float.floatToRawIntBits(r1.floatValue()) & 4294967295L) | (Float.floatToRawIntBits(floatValue2) << 32));
            case 24:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList3 = new ArrayList(list12.size());
                int size3 = list12.size();
                while (i < size3) {
                    Object obj22 = list12.get(i);
                    n21 n21Var = (cs0.wdg6QnbFHrFF(obj22, Boolean.FALSE) || obj22 == null) ? null : (n21) ((le0) zz1.IAToe7bXGz4N.wdg6QnbFHrFF).OPXfSBeufaJ8(obj22);
                    n21Var.getClass();
                    arrayList3.add(n21Var);
                    i++;
                }
                return new p21(arrayList3);
            case 25:
                obj.getClass();
                String str4 = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str4);
                if (cs0.wdg6QnbFHrFF(forLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str4 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new n21(forLanguageTag);
            case 26:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str5 = obj23 != null ? (String) obj23 : null;
                str5.getClass();
                Object obj24 = list13.get(1);
                cr1 cr1Var2 = zz1.OPXfSBeufaJ8;
                if (!cs0.wdg6QnbFHrFF(obj24, Boolean.FALSE) && obj24 != null) {
                    mi2Var = (mi2) ((le0) cr1Var2.wdg6QnbFHrFF).OPXfSBeufaJ8(obj24);
                }
                return new t11(str5, mi2Var);
            case 27:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                i11 i11Var = j11.Companion;
                yz1 yz1Var3 = zz1.jyegZNwi31qc;
                Boolean bool5 = Boolean.FALSE;
                cs0.wdg6QnbFHrFF(obj25, bool5);
                j11 j11Var = obj25 != null ? (j11) yz1Var3.OPXfSBeufaJ8.OPXfSBeufaJ8(obj25) : null;
                j11Var.getClass();
                float f4 = j11Var.PxuCJdSBwIXG;
                Object obj26 = list14.get(1);
                yz1 yz1Var4 = zz1.aF05bpZJlKEP;
                cs0.wdg6QnbFHrFF(obj26, bool5);
                o11 o11Var = obj26 != null ? (o11) yz1Var4.OPXfSBeufaJ8.OPXfSBeufaJ8(obj26) : null;
                o11Var.getClass();
                int i2 = o11Var.PxuCJdSBwIXG;
                Object obj27 = list14.get(2);
                yz1 yz1Var5 = zz1.kpCQ9veP6n3I;
                cs0.wdg6QnbFHrFF(obj27, bool5);
                m11 m11Var = obj27 != null ? (m11) yz1Var5.OPXfSBeufaJ8.OPXfSBeufaJ8(obj27) : null;
                m11Var.getClass();
                return new p11(f4, i2, m11Var.PxuCJdSBwIXG);
            case 28:
                obj.getClass();
                float floatValue3 = ((Float) obj).floatValue();
                j11.PxuCJdSBwIXG(floatValue3);
                return new j11(floatValue3);
            default:
                obj.getClass();
                return new o11(((Integer) obj).intValue());
        }
    }

    public /* synthetic */ mq1(int i) {
        this.rtx2ld2ELZv4 = i;
    }
}
