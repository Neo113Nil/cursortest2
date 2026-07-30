package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.Comparator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zo0 implements Comparator {
    public static final zo0 b = new zo0(0);
    public static final zo0 c = new zo0(1);
    public static final zo0 d = new zo0(2);
    public static final zo0 e = new zo0(3);
    public static final zo0 f = new zo0(4);
    public static final /* synthetic */ zo0 g = new zo0(18);
    public final /* synthetic */ int a;

    public /* synthetic */ zo0(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                yo0 yo0Var = (yo0) obj;
                yo0 yo0Var2 = (yo0) obj2;
                if (j8.K(yo0Var) && j8.K(yo0Var2)) {
                    i91 J = s03.J(yo0Var);
                    i91 J2 = s03.J(yo0Var2);
                    if (!Intrinsics.b(J, J2)) {
                        i91[] i91VarArr = new i91[16];
                        int i = 0;
                        while (J != null) {
                            int i2 = i + 1;
                            if (i91VarArr.length < i2) {
                                int length = i91VarArr.length;
                                ?? r4 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(i91VarArr, 0, r4, 0, length);
                                i91VarArr = r4;
                            }
                            if (i != 0) {
                                System.arraycopy(i91VarArr, 0, i91VarArr, 0 + 1, i + 0);
                            }
                            i91VarArr[0] = J;
                            i++;
                            J = J.u();
                        }
                        i91[] i91VarArr2 = new i91[16];
                        int i3 = 0;
                        while (J2 != null) {
                            int i4 = i3 + 1;
                            if (i91VarArr2.length < i4) {
                                int length2 = i91VarArr2.length;
                                ?? r42 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(i91VarArr2, 0, r42, 0, length2);
                                i91VarArr2 = r42;
                            }
                            if (i3 != 0) {
                                System.arraycopy(i91VarArr2, 0, i91VarArr2, 0 + 1, i3 + 0);
                            }
                            i91VarArr2[0] = J2;
                            i3++;
                            J2 = J2.u();
                        }
                        int min = Math.min(i - 1, i3 - 1);
                        if (min >= 0) {
                            int i5 = 0;
                            while (Intrinsics.b(i91VarArr[i5], i91VarArr2[i5])) {
                                if (i5 != min) {
                                    i5++;
                                }
                            }
                            return Intrinsics.c(i91VarArr[i5].v(), i91VarArr2[i5].v());
                        }
                        lh.g("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (j8.K(yo0Var)) {
                        return -1;
                    }
                    if (j8.K(yo0Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                w72 h = ((ai2) obj).h();
                w72 h2 = ((ai2) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h.b, h2.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h.d, h2.d);
                return compare3 != 0 ? compare3 : Float.compare(h.c, h2.c);
            case 2:
                i91 i91Var = (i91) obj;
                i91 i91Var2 = (i91) obj2;
                int c2 = Intrinsics.c(i91Var2.z, i91Var.z);
                return c2 != 0 ? c2 : Intrinsics.c(i91Var.hashCode(), i91Var2.hashCode());
            case 3:
                w72 h3 = ((ai2) obj).h();
                w72 h4 = ((ai2) obj2).h();
                int compare4 = Float.compare(h4.c, h3.c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h3.b, h4.b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h3.d, h4.d);
                return compare6 != 0 ? compare6 : Float.compare(h4.a, h3.a);
            case 4:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int compare7 = Float.compare(((w72) pair.m).b, ((w72) pair2.m).b);
                return compare7 != 0 ? compare7 : Float.compare(((w72) pair.m).d, ((w72) pair2.m).d);
            case 5:
                return bx.a(Integer.valueOf(((xd) obj).b), Integer.valueOf(((xd) obj2).b));
            case 6:
                return bx.a(Integer.valueOf(((xd) obj).b), Integer.valueOf(((xd) obj2).b));
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min2 = Math.min(str.length(), str2.length());
                int i6 = 4;
                while (true) {
                    if (i6 >= min2) {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 >= length4) {
                            return 1;
                        }
                    } else {
                        char charAt = str.charAt(i6);
                        char charAt2 = str2.charAt(i6);
                        if (charAt == charAt2) {
                            i6++;
                        } else if (Intrinsics.c(charAt, charAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 8:
                i91 i91Var3 = (i91) obj;
                i91 i91Var4 = (i91) obj2;
                int c3 = Intrinsics.c(i91Var3.z, i91Var4.z);
                return c3 != 0 ? c3 : Intrinsics.c(i91Var3.hashCode(), i91Var4.hashCode());
            case 9:
                return ((ro2) obj).d - ((ro2) obj2).d;
            case 10:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 11:
                return bx.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return bx.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return bx.a((Double) ((Pair) obj2).n, (Double) ((Pair) obj).n);
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return bx.a(((a61) obj2).i, ((a61) obj).i);
            case 15:
                return bx.a(((js2) obj).a, ((js2) obj2).a);
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return bx.a(((ls2) obj).a, ((ls2) obj2).a);
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return bx.a(((o93) obj).a, ((o93) obj2).a);
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
