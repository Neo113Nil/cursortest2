package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r10 implements Comparator {
    public static final r10 b = new r10(0);
    public static final r10 c = new r10(1);
    public static final r10 d = new r10(2);
    public static final r10 e = new r10(3);
    public static final r10 f = new r10(4);
    public final /* synthetic */ int a;

    public /* synthetic */ r10(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o10 o10Var = (o10) obj;
                o10 o10Var2 = (o10) obj2;
                if (!uq1.L(o10Var) || !uq1.L(o10Var2)) {
                    if (uq1.L(o10Var)) {
                        return -1;
                    }
                    return uq1.L(o10Var2) ? 1 : 0;
                }
                jd0 I = op.I(o10Var);
                jd0 I2 = op.I(o10Var2);
                if (Intrinsics.a(I, I2)) {
                    return 0;
                }
                jd0[] jd0VarArr = new jd0[16];
                int i = 0;
                while (I != null) {
                    int i2 = i + 1;
                    if (jd0VarArr.length < i2) {
                        int length = jd0VarArr.length;
                        ?? r4 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(jd0VarArr, 0, r4, 0, length);
                        jd0VarArr = r4;
                    }
                    if (i != 0) {
                        System.arraycopy(jd0VarArr, 0, jd0VarArr, 0 + 1, i + 0);
                    }
                    jd0VarArr[0] = I;
                    i++;
                    I = I.s();
                }
                jd0[] jd0VarArr2 = new jd0[16];
                int i3 = 0;
                while (I2 != null) {
                    int i4 = i3 + 1;
                    if (jd0VarArr2.length < i4) {
                        int length2 = jd0VarArr2.length;
                        ?? r42 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(jd0VarArr2, 0, r42, 0, length2);
                        jd0VarArr2 = r42;
                    }
                    if (i3 != 0) {
                        System.arraycopy(jd0VarArr2, 0, jd0VarArr2, 0 + 1, i3 + 0);
                    }
                    jd0VarArr2[0] = I2;
                    i3++;
                    I2 = I2.s();
                }
                int min = Math.min(i - 1, i3 - 1);
                if (min >= 0) {
                    int i5 = 0;
                    while (Intrinsics.a(jd0VarArr[i5], jd0VarArr2[i5])) {
                        if (i5 != min) {
                            i5++;
                        }
                    }
                    return Intrinsics.b(jd0VarArr[i5].u(), jd0VarArr2[i5].u());
                }
                dd0.j("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                s11 h = ((l81) obj).h();
                s11 h2 = ((l81) obj2).h();
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
                jd0 jd0Var = (jd0) obj;
                jd0 jd0Var2 = (jd0) obj2;
                int b2 = Intrinsics.b(jd0Var2.u, jd0Var.u);
                return b2 != 0 ? b2 : Intrinsics.b(jd0Var.hashCode(), jd0Var2.hashCode());
            case 3:
                s11 h3 = ((l81) obj).h();
                s11 h4 = ((l81) obj2).h();
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
                int compare7 = Float.compare(((s11) pair.d).b, ((s11) pair2.d).b);
                return compare7 != 0 ? compare7 : Float.compare(((s11) pair.d).d, ((s11) pair2.d).d);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return dj.a(Integer.valueOf(((x7) obj).b), Integer.valueOf(((x7) obj2).b));
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return dj.a(Integer.valueOf(((x7) obj).b), Integer.valueOf(((x7) obj2).b));
            default:
                jd0 jd0Var3 = (jd0) obj;
                jd0 jd0Var4 = (jd0) obj2;
                int b3 = Intrinsics.b(jd0Var3.u, jd0Var4.u);
                return b3 != 0 ? b3 : Intrinsics.b(jd0Var3.hashCode(), jd0Var4.hashCode());
        }
    }
}
