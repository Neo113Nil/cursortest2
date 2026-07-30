package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y1 extends b90 {
    public static y1 e;
    public static final k92 f = k92.n;
    public static final k92 g = k92.m;
    public bw2 c;
    public ai2 d;

    @Override // defpackage.b90
    public final int[] f(int i) {
        int i2;
        if (j().length() > 0 && i < j().length()) {
            try {
                ai2 ai2Var = this.d;
                if (ai2Var == null) {
                    Intrinsics.f("node");
                    throw null;
                }
                w72 g2 = ai2Var.g();
                int round = Math.round(g2.d - g2.b);
                if (i <= 0) {
                    i = 0;
                }
                bw2 bw2Var = this.c;
                if (bw2Var == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                int e2 = bw2Var.e(i);
                bw2 bw2Var2 = this.c;
                if (bw2Var2 == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                float d = bw2Var2.b.d(e2) + round;
                bw2 bw2Var3 = this.c;
                if (bw2Var3 == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                float d2 = bw2Var3.b.d(r0.f - 1);
                bw2 bw2Var4 = this.c;
                if (d < d2) {
                    if (bw2Var4 == null) {
                        Intrinsics.f("layoutResult");
                        throw null;
                    }
                    i2 = bw2Var4.b.c(d);
                } else {
                    if (bw2Var4 == null) {
                        Intrinsics.f("layoutResult");
                        throw null;
                    }
                    i2 = bw2Var4.b.f;
                }
                return i(i, o(i2 - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.b90
    public final int[] m(int i) {
        int i2;
        if (j().length() > 0 && i > 0) {
            try {
                ai2 ai2Var = this.d;
                if (ai2Var == null) {
                    Intrinsics.f("node");
                    throw null;
                }
                w72 g2 = ai2Var.g();
                int round = Math.round(g2.d - g2.b);
                int length = j().length();
                if (length <= i) {
                    i = length;
                }
                bw2 bw2Var = this.c;
                if (bw2Var == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                int e2 = bw2Var.e(i);
                bw2 bw2Var2 = this.c;
                if (bw2Var2 == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                float d = bw2Var2.b.d(e2) - round;
                if (d > 0.0f) {
                    bw2 bw2Var3 = this.c;
                    if (bw2Var3 == null) {
                        Intrinsics.f("layoutResult");
                        throw null;
                    }
                    i2 = bw2Var3.b.c(d);
                } else {
                    i2 = 0;
                }
                if (i == j().length() && i2 < e2) {
                    i2++;
                }
                return i(o(i2, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int o(int i, k92 k92Var) {
        bw2 bw2Var = this.c;
        if (bw2Var == null) {
            Intrinsics.f("layoutResult");
            throw null;
        }
        int h = bw2Var.h(i);
        bw2 bw2Var2 = this.c;
        if (bw2Var2 == null) {
            Intrinsics.f("layoutResult");
            throw null;
        }
        k92 i2 = bw2Var2.i(h);
        bw2 bw2Var3 = this.c;
        if (k92Var != i2) {
            if (bw2Var3 != null) {
                return bw2Var3.h(i);
            }
            Intrinsics.f("layoutResult");
            throw null;
        }
        if (bw2Var3 != null) {
            return bw2Var3.d(i, false) - 1;
        }
        Intrinsics.f("layoutResult");
        throw null;
    }
}
