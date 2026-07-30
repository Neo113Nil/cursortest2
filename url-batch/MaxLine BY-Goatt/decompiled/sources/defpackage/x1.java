package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x1 extends b90 {
    public static x1 d;
    public static final k92 e = k92.n;
    public static final k92 f = k92.m;
    public bw2 c;

    @Override // defpackage.b90
    public final int[] f(int i) {
        int i2;
        if (j().length() > 0 && i < j().length()) {
            bw2 bw2Var = this.c;
            k92 k92Var = e;
            if (i < 0) {
                if (bw2Var == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                i2 = bw2Var.e(0);
            } else {
                if (bw2Var == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                int e2 = bw2Var.e(i);
                i2 = o(e2, k92Var) == i ? e2 : e2 + 1;
            }
            bw2 bw2Var2 = this.c;
            if (bw2Var2 == null) {
                Intrinsics.f("layoutResult");
                throw null;
            }
            if (i2 < bw2Var2.b.f) {
                return i(o(i2, k92Var), o(i2, f) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.b90
    public final int[] m(int i) {
        int i2;
        if (j().length() <= 0 || i <= 0) {
            return null;
        }
        int length = j().length();
        bw2 bw2Var = this.c;
        k92 k92Var = f;
        if (i > length) {
            if (bw2Var == null) {
                Intrinsics.f("layoutResult");
                throw null;
            }
            i2 = bw2Var.e(j().length());
        } else {
            if (bw2Var == null) {
                Intrinsics.f("layoutResult");
                throw null;
            }
            int e2 = bw2Var.e(i);
            i2 = o(e2, k92Var) + 1 == i ? e2 : e2 - 1;
        }
        if (i2 < 0) {
            return null;
        }
        return i(o(i2, e), o(i2, k92Var) + 1);
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
