package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h1 extends e1 {
    public static h1 e;
    public static final b31 f = b31.e;
    public static final b31 g = b31.d;
    public hh1 c;
    public l81 d;

    @Override // defpackage.e1
    public final int[] a(int i) {
        int i2;
        if (c().length() > 0 && i < c().length()) {
            try {
                l81 l81Var = this.d;
                if (l81Var == null) {
                    Intrinsics.e("node");
                    throw null;
                }
                s11 g2 = l81Var.g();
                int round = Math.round(g2.d - g2.b);
                if (i <= 0) {
                    i = 0;
                }
                hh1 hh1Var = this.c;
                if (hh1Var == null) {
                    Intrinsics.e("layoutResult");
                    throw null;
                }
                int a = hh1Var.a(i);
                hh1 hh1Var2 = this.c;
                if (hh1Var2 == null) {
                    Intrinsics.e("layoutResult");
                    throw null;
                }
                float d = hh1Var2.d(a) + round;
                hh1 hh1Var3 = this.c;
                if (hh1Var3 == null) {
                    Intrinsics.e("layoutResult");
                    throw null;
                }
                float d2 = hh1Var3.d(hh1Var3.b.b - 1);
                hh1 hh1Var4 = this.c;
                if (d < d2) {
                    if (hh1Var4 == null) {
                        Intrinsics.e("layoutResult");
                        throw null;
                    }
                    i2 = hh1Var4.b(d);
                } else {
                    if (hh1Var4 == null) {
                        Intrinsics.e("layoutResult");
                        throw null;
                    }
                    i2 = hh1Var4.b.b;
                }
                return b(i, e(i2 - 1, g) + 1);
            } catch (IllegalStateException unused) {
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
        try {
            l81 l81Var = this.d;
            if (l81Var == null) {
                Intrinsics.e("node");
                throw null;
            }
            s11 g2 = l81Var.g();
            int round = Math.round(g2.d - g2.b);
            int length = c().length();
            if (length <= i) {
                i = length;
            }
            hh1 hh1Var = this.c;
            if (hh1Var == null) {
                Intrinsics.e("layoutResult");
                throw null;
            }
            int a = hh1Var.a(i);
            hh1 hh1Var2 = this.c;
            if (hh1Var2 == null) {
                Intrinsics.e("layoutResult");
                throw null;
            }
            float d = hh1Var2.d(a) - round;
            if (d > 0.0f) {
                hh1 hh1Var3 = this.c;
                if (hh1Var3 == null) {
                    Intrinsics.e("layoutResult");
                    throw null;
                }
                i2 = hh1Var3.b(d);
            } else {
                i2 = 0;
            }
            if (i == c().length() && i2 < a) {
                i2++;
            }
            return b(e(i2, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
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
