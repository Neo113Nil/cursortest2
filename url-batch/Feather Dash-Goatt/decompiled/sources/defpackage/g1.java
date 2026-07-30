package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g1 extends e1 {
    public static g1 d;
    public static final b31 e = b31.e;
    public static final b31 f = b31.d;
    public hh1 c;

    @Override // defpackage.e1
    public final int[] a(int i) {
        int i2;
        if (c().length() > 0 && i < c().length()) {
            hh1 hh1Var = this.c;
            b31 b31Var = e;
            if (i < 0) {
                if (hh1Var == null) {
                    Intrinsics.e("layoutResult");
                    throw null;
                }
                i2 = hh1Var.a(0);
            } else {
                if (hh1Var == null) {
                    Intrinsics.e("layoutResult");
                    throw null;
                }
                int a = hh1Var.a(i);
                i2 = e(a, b31Var) == i ? a : a + 1;
            }
            hh1 hh1Var2 = this.c;
            if (hh1Var2 == null) {
                Intrinsics.e("layoutResult");
                throw null;
            }
            if (i2 < hh1Var2.b.b) {
                return b(e(i2, b31Var), e(i2, f) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.e1
    public final int[] d(int i) {
        int i2;
        if (c().length() <= 0 || i <= 0) {
            return null;
        }
        int length = c().length();
        hh1 hh1Var = this.c;
        b31 b31Var = f;
        if (i > length) {
            if (hh1Var == null) {
                Intrinsics.e("layoutResult");
                throw null;
            }
            i2 = hh1Var.a(c().length());
        } else {
            if (hh1Var == null) {
                Intrinsics.e("layoutResult");
                throw null;
            }
            int a = hh1Var.a(i);
            i2 = e(a, b31Var) + 1 == i ? a : a - 1;
        }
        if (i2 < 0) {
            return null;
        }
        return b(e(i2, e), e(i2, b31Var) + 1);
    }

    public final int e(int i, b31 b31Var) {
        hh1 hh1Var = this.c;
        if (hh1Var == null) {
            Intrinsics.e("layoutResult");
            throw null;
        }
        int c = hh1Var.c(i);
        hh1 hh1Var2 = this.c;
        if (hh1Var2 == null) {
            Intrinsics.e("layoutResult");
            throw null;
        }
        b31 e2 = hh1Var2.e(c);
        hh1 hh1Var3 = this.c;
        if (b31Var != e2) {
            if (hh1Var3 != null) {
                return hh1Var3.c(i);
            }
            Intrinsics.e("layoutResult");
            throw null;
        }
        if (hh1Var3 == null) {
            Intrinsics.e("layoutResult");
            throw null;
        }
        pl0 pl0Var = hh1Var3.b;
        pl0Var.g(i);
        ArrayList arrayList = (ArrayList) pl0Var.e;
        x5 x5Var = ((qu0) arrayList.get(ca0.l(i, arrayList))).a;
        return (x5Var.d.e(i - r4.d) + r4.b) - 1;
    }
}
