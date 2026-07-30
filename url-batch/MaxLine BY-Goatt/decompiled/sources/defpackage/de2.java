package defpackage;

import android.content.res.Resources;
import android.util.Log;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class de2 implements Function1 {
    public final /* synthetic */ int m;

    public /* synthetic */ de2(int i) {
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xd xdVar;
        hw2 hw2Var;
        int i;
        int i2;
        long j;
        int i3 = 0;
        switch (this.m) {
            case 0:
                obj.getClass();
                return new xt2(((Integer) obj).intValue());
            case 1:
                obj.getClass();
                List list = (List) obj;
                return new qv2(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                tw2[] tw2VarArr = sw2.b;
                Function1 function1 = he2.q.n;
                Boolean bool = Boolean.FALSE;
                Intrinsics.b(obj2, bool);
                sw2 sw2Var = obj2 != null ? (sw2) function1.invoke(obj2) : null;
                sw2Var.getClass();
                long j2 = sw2Var.a;
                Object obj3 = list2.get(1);
                Intrinsics.b(obj3, bool);
                sw2 sw2Var2 = obj3 != null ? (sw2) function1.invoke(obj3) : null;
                sw2Var2.getClass();
                return new rv2(j2, sw2Var2.a);
            case 3:
                obj.getClass();
                return new jq0(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                return new nn(((Float) obj).floatValue());
            case 5:
                obj.getClass();
                List list3 = (List) obj;
                Object obj4 = list3.get(0);
                Integer num = obj4 != null ? (Integer) obj4 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj5 = list3.get(1);
                Integer num2 = obj5 != null ? (Integer) obj5 : null;
                num2.getClass();
                return new jw2(th2.a(intValue, num2.intValue()));
            case 6:
                obj.getClass();
                List list4 = (List) obj;
                Object obj6 = list4.get(0);
                int i4 = aw.h;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.b(obj6, bool2);
                aw awVar = obj6 != null ? Intrinsics.b(obj6, Boolean.FALSE) ? new aw(aw.g) : new aw(ap.c(((Integer) obj6).intValue())) : null;
                awVar.getClass();
                long j3 = awVar.a;
                Object obj7 = list4.get(1);
                ge2 ge2Var = he2.r;
                Intrinsics.b(obj7, bool2);
                au1 au1Var = obj7 != null ? (au1) ge2Var.n.invoke(obj7) : null;
                au1Var.getClass();
                long j4 = au1Var.a;
                Object obj8 = list4.get(2);
                Float f = obj8 != null ? (Float) obj8 : null;
                f.getClass();
                return new dk2(f.floatValue(), j3, j4);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                if (Intrinsics.b(obj, Boolean.FALSE)) {
                    return new sw2(sw2.c);
                }
                obj.getClass();
                List list5 = (List) obj;
                Object obj9 = list5.get(0);
                Float f2 = obj9 != null ? (Float) obj9 : null;
                f2.getClass();
                float floatValue = f2.floatValue();
                Object obj10 = list5.get(1);
                tw2 tw2Var = obj10 != null ? (tw2) obj10 : null;
                tw2Var.getClass();
                return new sw2(mi2.n(tw2Var.a, floatValue));
            case 8:
                obj.getClass();
                List list6 = (List) obj;
                Object obj11 = list6.get(0);
                String str = obj11 != null ? (String) obj11 : null;
                str.getClass();
                Object obj12 = list6.get(1);
                return new de1(str, (Intrinsics.b(obj12, Boolean.FALSE) || obj12 == null) ? null : (fw2) ((Function1) he2.i.o).invoke(obj12));
            case 9:
                if (Intrinsics.b(obj, Boolean.FALSE)) {
                    return new au1(9205357640488583168L);
                }
                obj.getClass();
                List list7 = (List) obj;
                Object obj13 = list7.get(0);
                Float f3 = obj13 != null ? (Float) obj13 : null;
                f3.getClass();
                float floatValue2 = f3.floatValue();
                Object obj14 = list7.get(1);
                (obj14 != null ? (Float) obj14 : null).getClass();
                return new au1((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r9.floatValue()) & 4294967295L));
            case 10:
                obj.getClass();
                List list8 = (List) obj;
                ArrayList arrayList = new ArrayList(list8.size());
                int size = list8.size();
                while (i3 < size) {
                    Object obj15 = list8.get(i3);
                    rf1 rf1Var = (Intrinsics.b(obj15, Boolean.FALSE) || obj15 == null) ? null : (rf1) ((Function1) he2.t.o).invoke(obj15);
                    rf1Var.getClass();
                    arrayList.add(rf1Var);
                    i3++;
                }
                return new sf1(arrayList);
            case 11:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i3 < size2) {
                    Object obj16 = list9.get(i3);
                    xd xdVar2 = (Intrinsics.b(obj16, Boolean.FALSE) || obj16 == null) ? null : (xd) ((Function1) he2.b.o).invoke(obj16);
                    xdVar2.getClass();
                    arrayList2.add(xdVar2);
                    i3++;
                }
                return arrayList2;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                obj.getClass();
                String str2 = (String) obj;
                t12.a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str2);
                if (Intrinsics.b(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new rf1(forLanguageTag);
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                obj.getClass();
                List list10 = (List) obj;
                Object obj17 = list10.get(0);
                rd1 rd1Var = obj17 != null ? (rd1) obj17 : null;
                rd1Var.getClass();
                float f4 = rd1Var.a;
                Object obj18 = list10.get(1);
                td1 td1Var = obj18 != null ? (td1) obj18 : null;
                td1Var.getClass();
                int i5 = td1Var.a;
                Object obj19 = list10.get(2);
                (obj19 != null ? (sd1) obj19 : null).getClass();
                return new ud1(i5, f4);
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                be beVar = obj20 != null ? (be) obj20 : null;
                beVar.getClass();
                Object obj21 = list11.get(2);
                Integer num3 = obj21 != null ? (Integer) obj21 : null;
                num3.getClass();
                int intValue2 = num3.intValue();
                Object obj22 = list11.get(3);
                Integer num4 = obj22 != null ? (Integer) obj22 : null;
                num4.getClass();
                int intValue3 = num4.intValue();
                Object obj23 = list11.get(4);
                String str3 = obj23 != null ? (String) obj23 : null;
                str3.getClass();
                switch (beVar.ordinal()) {
                    case 0:
                        Object obj24 = list11.get(1);
                        ez1 ez1Var = (Intrinsics.b(obj24, Boolean.FALSE) || obj24 == null) ? null : (ez1) ((Function1) he2.g.o).invoke(obj24);
                        ez1Var.getClass();
                        xdVar = new xd(intValue2, intValue3, ez1Var, str3);
                        break;
                    case 1:
                        Object obj25 = list11.get(1);
                        un2 un2Var = (Intrinsics.b(obj25, Boolean.FALSE) || obj25 == null) ? null : (un2) ((Function1) he2.h.o).invoke(obj25);
                        un2Var.getClass();
                        xdVar = new xd(intValue2, intValue3, un2Var, str3);
                        break;
                    case 2:
                        Object obj26 = list11.get(1);
                        l43 l43Var = (Intrinsics.b(obj26, Boolean.FALSE) || obj26 == null) ? null : (l43) ((Function1) he2.c.o).invoke(obj26);
                        l43Var.getClass();
                        xdVar = new xd(intValue2, intValue3, l43Var, str3);
                        break;
                    case 3:
                        Object obj27 = list11.get(1);
                        h33 h33Var = (Intrinsics.b(obj27, Boolean.FALSE) || obj27 == null) ? null : (h33) ((Function1) he2.d.o).invoke(obj27);
                        h33Var.getClass();
                        xdVar = new xd(intValue2, intValue3, h33Var, str3);
                        break;
                    case 4:
                        Object obj28 = list11.get(1);
                        de1 de1Var = (Intrinsics.b(obj28, Boolean.FALSE) || obj28 == null) ? null : (de1) ((Function1) he2.e.o).invoke(obj28);
                        de1Var.getClass();
                        xdVar = new xd(intValue2, intValue3, de1Var, str3);
                        break;
                    case 5:
                        Object obj29 = list11.get(1);
                        ce1 ce1Var = (Intrinsics.b(obj29, Boolean.FALSE) || obj29 == null) ? null : (ce1) ((Function1) he2.f.o).invoke(obj29);
                        ce1Var.getClass();
                        xdVar = new xd(intValue2, intValue3, ce1Var, str3);
                        break;
                    case 6:
                        Object obj30 = list11.get(1);
                        String str4 = obj30 != null ? (String) obj30 : null;
                        str4.getClass();
                        xdVar = new xd(intValue2, intValue3, new jp2(str4), str3);
                        break;
                    default:
                        a.b();
                        return null;
                }
                return xdVar;
            case 15:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                return new l43(str5);
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new h33(str6);
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                obj.getClass();
                List list12 = (List) obj;
                Object obj31 = list12.get(0);
                String str7 = obj31 != null ? (String) obj31 : null;
                str7.getClass();
                Object obj32 = list12.get(1);
                return new ce1(str7, (Intrinsics.b(obj32, Boolean.FALSE) || obj32 == null) ? null : (fw2) ((Function1) he2.i.o).invoke(obj32));
            case 18:
                obj.getClass();
                List list13 = (List) obj;
                Object obj33 = list13.get(0);
                ut2 ut2Var = obj33 != null ? (ut2) obj33 : null;
                ut2Var.getClass();
                int i6 = ut2Var.a;
                Object obj34 = list13.get(1);
                au2 au2Var = obj34 != null ? (au2) obj34 : null;
                au2Var.getClass();
                int i7 = au2Var.a;
                Object obj35 = list13.get(2);
                tw2[] tw2VarArr2 = sw2.b;
                ge2 ge2Var2 = he2.q;
                Boolean bool3 = Boolean.FALSE;
                Intrinsics.b(obj35, bool3);
                sw2 sw2Var3 = obj35 != null ? (sw2) ge2Var2.n.invoke(obj35) : null;
                sw2Var3.getClass();
                long j5 = sw2Var3.a;
                Object obj36 = list13.get(3);
                rv2 rv2Var = rv2.c;
                rv2 rv2Var2 = (Intrinsics.b(obj36, bool3) || obj36 == null) ? null : (rv2) ((Function1) he2.l.o).invoke(obj36);
                Object obj37 = list13.get(4);
                a22 a22Var = (Intrinsics.b(obj37, bool3) || obj37 == null) ? null : (a22) ((Function1) iv1.e.o).invoke(obj37);
                Object obj38 = list13.get(5);
                ud1 ud1Var = ud1.c;
                ud1 ud1Var2 = (Intrinsics.b(obj38, bool3) || obj38 == null) ? null : (ud1) ((Function1) he2.u.o).invoke(obj38);
                Object obj39 = list13.get(6);
                pd1 pd1Var = (Intrinsics.b(obj39, bool3) || obj39 == null) ? null : (pd1) ((Function1) iv1.f.o).invoke(obj39);
                pd1Var.getClass();
                int i8 = pd1Var.a;
                Object obj40 = list13.get(7);
                mz0 mz0Var = obj40 != null ? (mz0) obj40 : null;
                mz0Var.getClass();
                int i9 = mz0Var.a;
                Object obj41 = list13.get(8);
                tt1 tt1Var = iv1.g;
                if (Intrinsics.b(obj41, bool3) || obj41 == null) {
                    i = i8;
                    i2 = i9;
                    j = j5;
                    hw2Var = null;
                } else {
                    hw2Var = (hw2) ((Function1) tt1Var.o).invoke(obj41);
                    i = i8;
                    i2 = i9;
                    j = j5;
                }
                return new ez1(i6, i7, j, rv2Var2, a22Var, ud1Var2, i, i2, hw2Var);
            case 19:
                obj.getClass();
                List list14 = (List) obj;
                Object obj42 = list14.get(0);
                int i10 = aw.h;
                Boolean bool4 = Boolean.FALSE;
                Intrinsics.b(obj42, bool4);
                aw awVar2 = obj42 != null ? obj42.equals(bool4) ? new aw(aw.g) : new aw(ap.c(((Integer) obj42).intValue())) : null;
                awVar2.getClass();
                long j6 = awVar2.a;
                Object obj43 = list14.get(1);
                tw2[] tw2VarArr3 = sw2.b;
                Function1 function12 = he2.q.n;
                Intrinsics.b(obj43, bool4);
                sw2 sw2Var4 = obj43 != null ? (sw2) function12.invoke(obj43) : null;
                sw2Var4.getClass();
                long j7 = sw2Var4.a;
                Object obj44 = list14.get(2);
                jq0 jq0Var = jq0.n;
                jq0 jq0Var2 = (Intrinsics.b(obj44, bool4) || obj44 == null) ? null : (jq0) ((Function1) he2.m.o).invoke(obj44);
                Object obj45 = list14.get(3);
                fq0 fq0Var = obj45 != null ? (fq0) obj45 : null;
                Object obj46 = list14.get(4);
                gq0 gq0Var = obj46 != null ? (gq0) obj46 : null;
                Object obj47 = list14.get(6);
                String str8 = obj47 != null ? (String) obj47 : null;
                Object obj48 = list14.get(7);
                Intrinsics.b(obj48, bool4);
                sw2 sw2Var5 = obj48 != null ? (sw2) function12.invoke(obj48) : null;
                sw2Var5.getClass();
                long j8 = sw2Var5.a;
                Object obj49 = list14.get(8);
                nn nnVar = (Intrinsics.b(obj49, bool4) || obj49 == null) ? null : (nn) ((Function1) he2.n.o).invoke(obj49);
                Object obj50 = list14.get(9);
                qv2 qv2Var = (Intrinsics.b(obj50, bool4) || obj50 == null) ? null : (qv2) ((Function1) he2.k.o).invoke(obj50);
                Object obj51 = list14.get(10);
                sf1 sf1Var = sf1.o;
                sf1 sf1Var2 = (Intrinsics.b(obj51, bool4) || obj51 == null) ? null : (sf1) ((Function1) he2.s.o).invoke(obj51);
                Object obj52 = list14.get(11);
                Intrinsics.b(obj52, bool4);
                aw awVar3 = obj52 != null ? obj52.equals(bool4) ? new aw(aw.g) : new aw(ap.c(((Integer) obj52).intValue())) : null;
                awVar3.getClass();
                long j9 = awVar3.a;
                Object obj53 = list14.get(12);
                xt2 xt2Var = (Intrinsics.b(obj53, bool4) || obj53 == null) ? null : (xt2) ((Function1) he2.j.o).invoke(obj53);
                Object obj54 = list14.get(13);
                dk2 dk2Var = dk2.d;
                return new un2(j6, j7, jq0Var2, fq0Var, gq0Var, (ip0) null, str8, j8, nnVar, qv2Var, sf1Var2, j9, xt2Var, (Intrinsics.b(obj54, bool4) || obj54 == null) ? null : (dk2) ((Function1) he2.o.o).invoke(obj54), 49184);
            case 20:
                obj.getClass();
                List list15 = (List) obj;
                Object obj55 = list15.get(0);
                Boolean bool5 = obj55 != null ? (Boolean) obj55 : null;
                bool5.getClass();
                boolean booleanValue = bool5.booleanValue();
                Object obj56 = list15.get(1);
                (obj56 != null ? (pg0) obj56 : null).getClass();
                return new a22(booleanValue);
            case 21:
                obj.getClass();
                return new pd1(((Integer) obj).intValue());
            case 22:
                obj.getClass();
                List list16 = (List) obj;
                Object obj57 = list16.get(0);
                gw2 gw2Var = obj57 != null ? (gw2) obj57 : null;
                gw2Var.getClass();
                int i11 = gw2Var.a;
                Object obj58 = list16.get(1);
                Boolean bool6 = obj58 != null ? (Boolean) obj58 : null;
                bool6.getClass();
                return new hw2(i11, bool6.booleanValue());
            case 23:
                return Boolean.valueOf(obj == null);
            case 24:
                return Unit.a;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 26:
                uc2 uc2Var = (uc2) obj;
                uc2Var.getClass();
                return Boolean.valueOf(uc2Var.E());
            default:
                uc2 uc2Var2 = (uc2) obj;
                uc2Var2.getClass();
                jj2 jj2Var = new jj2();
                while (uc2Var2.E()) {
                    jj2Var.add(Integer.valueOf((int) uc2Var2.getLong(0)));
                }
                return qj2.a(jj2Var);
        }
    }
}
