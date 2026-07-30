package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sc extends o81 implements Function2 {
    public static final sc A;
    public static final sc B;
    public static final sc C;
    public static final sc D;
    public static final sc E;
    public static final sc F;
    public static final sc G;
    public static final sc H;
    public static final sc I;
    public static final sc J;
    public static final sc K;
    public static final sc L;
    public static final sc M;
    public static final sc N;
    public static final sc O;
    public static final sc P;
    public static final sc Q;
    public static final sc n;
    public static final sc o;
    public static final sc p;
    public static final sc q;
    public static final sc r;
    public static final sc s;
    public static final sc t;
    public static final sc u;
    public static final sc v;
    public static final sc w;
    public static final sc x;
    public static final sc y;
    public static final sc z;
    public final /* synthetic */ int m;

    static {
        int i = 2;
        n = new sc(i, 0);
        o = new sc(i, 1);
        p = new sc(i, 2);
        q = new sc(i, 3);
        r = new sc(i, 4);
        s = new sc(i, 5);
        t = new sc(i, 6);
        u = new sc(i, 7);
        v = new sc(i, 8);
        w = new sc(i, 9);
        x = new sc(i, 10);
        y = new sc(i, 11);
        z = new sc(i, 12);
        A = new sc(i, 13);
        B = new sc(i, 14);
        C = new sc(i, 15);
        D = new sc(i, 16);
        E = new sc(i, 17);
        F = new sc(i, 18);
        G = new sc(i, 19);
        H = new sc(i, 20);
        I = new sc(i, 21);
        J = new sc(i, 22);
        K = new sc(i, 23);
        L = new sc(i, 24);
        M = new sc(i, 25);
        N = new sc(i, 26);
        O = new sc(i, 27);
        P = new sc(i, 28);
        Q = new sc(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(int i, int i2) {
        super(i);
        this.m = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [ul1] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37, types: [ul1] */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [eo1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [eo1] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundle;
        switch (this.m) {
            case 0:
                long j = ((x31) obj).a;
                long j2 = ((x31) obj2).a;
                Map map = f63.a;
                return bd3.G(1, new x31(zm3.d(1, 1)));
            case 1:
                return Integer.valueOf(Math.round((1.0f + (((u81) obj2) == u81.m ? -1.0f : 1.0f)) * (((Number) obj).intValue() / 2.0f)));
            case 2:
                String str = (String) obj;
                tl1 tl1Var = (tl1) obj2;
                if (str.length() == 0) {
                    return tl1Var.toString();
                }
                return str + ", " + tl1Var;
            case 3:
                a00 a00Var = (a00) obj;
                int intValue = ((Number) obj2).intValue();
                if (!a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    a00Var.S();
                }
                return Unit.a;
            case 4:
                a00 a00Var2 = (a00) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!a00Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    a00Var2.S();
                }
                return Unit.a;
            case 5:
                a00 a00Var3 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var3.B()) {
                    a00Var3.S();
                }
                return Unit.a;
            case 6:
                a00 a00Var4 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var4.B()) {
                    a00Var4.S();
                }
                return Unit.a;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                a00 a00Var5 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var5.B()) {
                    a00Var5.S();
                }
                return Unit.a;
            case 8:
                a00 a00Var6 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var6.B()) {
                    a00Var6.S();
                }
                return Unit.a;
            case 9:
                a00 a00Var7 = (a00) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (!a00Var7.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    a00Var7.S();
                }
                return Unit.a;
            case 10:
                a00 a00Var8 = (a00) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (!a00Var8.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    a00Var8.S();
                }
                return Unit.a;
            case 11:
                ((Number) obj2).intValue();
                ((pz) obj).getClass();
                return Unit.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                ((i91) ((pz) obj)).d0((oj1) obj2);
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                ((i91) ((pz) obj)).e0((vl1) obj2);
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                n00 n00Var = (n00) obj2;
                i91 i91Var = (i91) ((pz) obj);
                i91Var.L = n00Var;
                fs1 fs1Var = i91Var.P;
                bp2 bp2Var = p00.h;
                v02 v02Var = (v02) n00Var;
                v02Var.getClass();
                i91Var.a0((ca0) ll3.P(v02Var, bp2Var));
                v02 v02Var2 = (v02) n00Var;
                u81 u81Var = (u81) ll3.P(v02Var2, p00.n);
                if (i91Var.J != u81Var) {
                    i91Var.J = u81Var;
                    i91Var.D();
                    i91 u2 = i91Var.u();
                    if (u2 != null) {
                        u2.B();
                    }
                    i91Var.C();
                    for (ul1 ul1Var = fs1Var.f; ul1Var != null; ul1Var = ul1Var.r) {
                        ul1Var.q0();
                    }
                }
                i91Var.f0((g53) ll3.P(v02Var2, p00.s));
                ul1 ul1Var2 = fs1Var.f;
                if ((ul1Var2.p & 32768) != 0) {
                    while (ul1Var2 != null) {
                        if ((ul1Var2.o & 32768) != 0) {
                            p90 p90Var = ul1Var2;
                            ?? r2 = 0;
                            while (p90Var != 0) {
                                if (p90Var instanceof l00) {
                                    ul1 ul1Var3 = ((ul1) ((l00) p90Var)).m;
                                    if (ul1Var3.z) {
                                        ls1.c(ul1Var3);
                                    } else {
                                        ul1Var3.v = true;
                                    }
                                } else if ((p90Var.o & 32768) != 0 && (p90Var instanceof p90)) {
                                    ul1 ul1Var4 = p90Var.B;
                                    int i = 0;
                                    r2 = r2;
                                    p90Var = p90Var;
                                    while (ul1Var4 != null) {
                                        if ((ul1Var4.o & 32768) != 0) {
                                            i++;
                                            r2 = r2;
                                            if (i == 1) {
                                                p90Var = ul1Var4;
                                            } else {
                                                if (r2 == 0) {
                                                    r2 = new eo1(new ul1[16]);
                                                }
                                                if (p90Var != 0) {
                                                    r2.b(p90Var);
                                                    p90Var = 0;
                                                }
                                                r2.b(ul1Var4);
                                            }
                                        }
                                        ul1Var4 = ul1Var4.r;
                                        r2 = r2;
                                        p90Var = p90Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                p90Var = s03.c(r2);
                            }
                        }
                        if ((ul1Var2.p & 32768) != 0) {
                            ul1Var2 = ul1Var2.r;
                        }
                    }
                }
                return Unit.a;
            case 15:
                q80 q80Var = (q80) obj2;
                return qv.g(Integer.valueOf(q80Var.j()), Float.valueOf(d.b(q80Var.k(), -0.5f, 0.5f)), Integer.valueOf(q80Var.m()));
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                ((Number) obj2).intValue();
                return new mw0(yj1.d(1));
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                va1 va1Var = (va1) obj2;
                return qv.g(Integer.valueOf(((iz1) va1Var.b.b).h()), Integer.valueOf(((iz1) va1Var.b.c).h()));
            case 18:
                Map b = ((gc1) obj2).b();
                if (b.isEmpty()) {
                    return null;
                }
                return b;
            case 19:
                up1 up1Var = (up1) obj2;
                LinkedHashMap linkedHashMap = up1Var.n;
                LinkedHashMap linkedHashMap2 = up1Var.m;
                bi biVar = up1Var.g;
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mi1.i(up1Var.v.a).entrySet()) {
                    ((cr1) entry.getValue()).getClass();
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
                }
                if (!biVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[biVar.o];
                    Iterator it = biVar.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        parcelableArr[i2] = new dp1((cp1) it.next());
                        i2++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i3 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue5 = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        iArr[i3] = intValue5;
                        arrayList2.add(str2);
                        i3++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        bi biVar2 = (bi) entry3.getValue();
                        arrayList3.add(str3);
                        Parcelable[] parcelableArr2 = new Parcelable[biVar2.o];
                        Iterator it2 = biVar2.iterator();
                        int i4 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                qv.k();
                                throw null;
                            }
                            parcelableArr2[i4] = (dp1) next;
                            i4 = i5;
                        }
                        bundle.putParcelableArray(q40.l("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (up1Var.f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", up1Var.f);
                }
                return bundle;
            case 20:
                return Integer.valueOf(((jj1) obj).e(((Number) obj2).intValue()));
            case 21:
                return Integer.valueOf(((jj1) obj).Y(((Number) obj2).intValue()));
            case 22:
                return Integer.valueOf(((jj1) obj).a0(((Number) obj2).intValue()));
            case 23:
                return Integer.valueOf(((jj1) obj).V(((Number) obj2).intValue()));
            case 24:
                return Integer.valueOf(((jf2) obj2).a.h());
            case Constants.MAX_TREE_DEPTH /* 25 */:
                return (w8) obj;
            case 26:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList4 = new ArrayList(list);
                arrayList4.addAll(list2);
                return arrayList4;
            case 27:
                return (t20) obj;
            case 28:
                return (Unit) obj;
            default:
                return (Unit) obj;
        }
    }
}
