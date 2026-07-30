package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class m8 implements d00 {
    public final /* synthetic */ int d;
    public final /* synthetic */ d00 e;

    public m8(d00 d00Var, nd1 nd1Var) {
        this.d = 2;
        this.e = d00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0068, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d  */
    @Override // defpackage.d00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, dn dnVar) {
        l8 l8Var;
        int i;
        Map map;
        Set set;
        Set set2;
        iw0 iw0Var;
        ap apVar;
        int i2;
        md1 md1Var;
        int i3;
        Object j31Var;
        kd1 kd1Var;
        int i4 = this.d;
        d00 d00Var = this.e;
        switch (i4) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (dnVar instanceof l8) {
                    l8Var = (l8) dnVar;
                    int i5 = l8Var.i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        l8Var.i = i5 - Integer.MIN_VALUE;
                        Object obj2 = l8Var.h;
                        tn tnVar = tn.d;
                        i = l8Var.i;
                        if (i != 0) {
                            ca0.v(obj2);
                            qn0 qn0Var = (qn0) obj;
                            Boolean bool = (Boolean) qn0Var.c(j8.a);
                            boolean booleanValue = bool != null ? bool.booleanValue() : true;
                            Boolean bool2 = (Boolean) qn0Var.c(j8.b);
                            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
                            Boolean bool3 = (Boolean) qn0Var.c(j8.c);
                            v8 v8Var = new v8(booleanValue, booleanValue2, bool3 != null ? bool3.booleanValue() : true);
                            Integer num = (Integer) qn0Var.c(j8.d);
                            int intValue = num != null ? num.intValue() : 0;
                            Integer num2 = (Integer) qn0Var.c(j8.e);
                            int intValue2 = num2 != null ? num2.intValue() : 0;
                            Integer num3 = (Integer) qn0Var.c(j8.f);
                            int intValue3 = num3 != null ? num3.intValue() : 1;
                            Object c = qn0Var.c(j8.g);
                            Long l = (Long) c;
                            Long l2 = (Long) ((l == null || l.longValue() != 0) ? c : null);
                            Integer num4 = (Integer) qn0Var.c(j8.h);
                            int intValue4 = num4 != null ? num4.intValue() : 0;
                            Integer num5 = (Integer) qn0Var.c(j8.i);
                            jo joVar = new jo(intValue3, l2, intValue4, num5 != null ? num5.intValue() : 0);
                            String str = (String) qn0Var.c(j8.j);
                            if (str == null) {
                                str = "";
                            }
                            List d = (StringsKt.n(str) || str.equals("[]")) ? nv.d : m91.d(m91.c(Regex.a(new Regex("\\{\"t\":(\\d+),\"d\":\"([A-Z]+)\",\"s\":(\\d+),\"f\":(\\d+),\"r\":\"([A-Z]+)\"\\}"), str), new q1(10)));
                            String str2 = (String) qn0Var.c(j8.k);
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (StringsKt.n(str2) || str2.equals("{}")) {
                                map = ov.d;
                                map.getClass();
                            } else {
                                yy a = Regex.a(new Regex("\"([^\"]+)\":(\\d+)"), str2);
                                map = new LinkedHashMap();
                                n40 n40Var = new n40(a);
                                while (n40Var.hasNext()) {
                                    MatchResult matchResult = (MatchResult) n40Var.next();
                                    map.put(matchResult.a().get(1), Integer.valueOf(Integer.parseInt((String) matchResult.a().get(2))));
                                }
                            }
                            Map map2 = map;
                            String str3 = (String) qn0Var.c(j8.l);
                            String str4 = str3 != null ? str3 : "";
                            if (StringsKt.n(str4) || str4.equals("[]")) {
                                set = rv.d;
                            } else {
                                Iterator it = Regex.a(new Regex("\"([^\"]+)\""), str4).iterator();
                                if (it.hasNext()) {
                                    MatchResult matchResult2 = (MatchResult) it.next();
                                    matchResult2.getClass();
                                    String str5 = (String) matchResult2.a().get(1);
                                    if (it.hasNext()) {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        linkedHashSet.add(str5);
                                        while (it.hasNext()) {
                                            MatchResult matchResult3 = (MatchResult) it.next();
                                            matchResult3.getClass();
                                            linkedHashSet.add((String) matchResult3.a().get(1));
                                        }
                                        set2 = linkedHashSet;
                                        iw0Var = new iw0(v8Var, intValue, intValue2, joVar, d, map2, set2);
                                        l8Var.i = 1;
                                        if (d00Var.e(iw0Var, l8Var) == tnVar) {
                                            return tnVar;
                                        }
                                    } else {
                                        set = p91.a(str5);
                                    }
                                } else {
                                    set = rv.d;
                                }
                            }
                            set2 = set;
                            iw0Var = new iw0(v8Var, intValue, intValue2, joVar, d, map2, set2);
                            l8Var.i = 1;
                            if (d00Var.e(iw0Var, l8Var) == tnVar) {
                            }
                        } else {
                            if (i != 1) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca0.v(obj2);
                        }
                        return Unit.a;
                    }
                }
                l8Var = new l8(this, dnVar);
                Object obj22 = l8Var.h;
                tn tnVar2 = tn.d;
                i = l8Var.i;
                if (i != 0) {
                }
                return Unit.a;
            case 1:
                if (dnVar instanceof ap) {
                    apVar = (ap) dnVar;
                    int i6 = apVar.i;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        apVar.i = i6 - Integer.MIN_VALUE;
                        Object obj3 = apVar.h;
                        tn tnVar3 = tn.d;
                        i2 = apVar.i;
                        if (i2 != 0) {
                            ca0.v(obj3);
                            xd1 xd1Var = (xd1) obj;
                            if (xd1Var instanceof d11) {
                                throw ((d11) xd1Var).b;
                            }
                            if (!(xd1Var instanceof ko)) {
                                if (xd1Var instanceof zy ? true : xd1Var instanceof wk1) {
                                    dd0.j("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    return null;
                                }
                                l.a();
                                return null;
                            }
                            Object obj4 = ((ko) xd1Var).b;
                            apVar.i = 1;
                            if (d00Var.e(obj4, apVar) == tnVar3) {
                                return tnVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca0.v(obj3);
                        }
                        return Unit.a;
                    }
                }
                apVar = new ap(this, dnVar);
                Object obj32 = apVar.h;
                tn tnVar32 = tn.d;
                i2 = apVar.i;
                if (i2 != 0) {
                }
                return Unit.a;
            default:
                if (dnVar instanceof md1) {
                    md1Var = (md1) dnVar;
                    int i7 = md1Var.i;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        md1Var.i = i7 - Integer.MIN_VALUE;
                        Object obj5 = md1Var.h;
                        tn tnVar4 = tn.d;
                        i3 = md1Var.i;
                        if (i3 != 0) {
                            ca0.v(obj5);
                            qn0 qn0Var2 = (qn0) obj;
                            String str6 = (String) qn0Var2.c(nd1.c);
                            if (str6 != null) {
                                try {
                                    i31 i31Var = k31.d;
                                    j31Var = kd1.valueOf(str6);
                                } catch (Throwable th) {
                                    i31 i31Var2 = k31.d;
                                    j31Var = new j31(th);
                                }
                                kd1Var = (kd1) (j31Var instanceof j31 ? null : j31Var);
                                break;
                            }
                            kd1Var = kd1.d;
                            kd1 kd1Var2 = kd1Var;
                            String str7 = (String) qn0Var2.c(nd1.d);
                            String str8 = str7 == null ? "" : str7;
                            Long l3 = (Long) qn0Var2.c(nd1.e);
                            long longValue = l3 != null ? l3.longValue() : 0L;
                            Long l4 = (Long) qn0Var2.c(nd1.f);
                            long longValue2 = l4 != null ? l4.longValue() : 0L;
                            Long l5 = (Long) qn0Var2.c(nd1.g);
                            vd1 vd1Var = new vd1(kd1Var2, str8, longValue, longValue2, l5 != null ? l5.longValue() : 0L);
                            md1Var.i = 1;
                            if (d00Var.e(vd1Var, md1Var) == tnVar4) {
                                return tnVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca0.v(obj5);
                        }
                        return Unit.a;
                    }
                }
                md1Var = new md1(this, dnVar);
                Object obj52 = md1Var.h;
                tn tnVar42 = tn.d;
                i3 = md1Var.i;
                if (i3 != 0) {
                }
                return Unit.a;
        }
    }

    public /* synthetic */ m8(d00 d00Var, int i) {
        this.d = i;
        this.e = d00Var;
    }
}
