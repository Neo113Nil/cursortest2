package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ei2 {
    public final i91 a;
    public final dh0 b;
    public final q31 c;
    public final jn1 d = new jn1(2);

    public ei2(i91 i91Var, dh0 dh0Var, zm1 zm1Var) {
        this.a = i91Var;
        this.b = dh0Var;
        this.c = zm1Var;
    }

    public final ai2 a() {
        return new ai2(this.b, false, this.a, new sh2());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(i91 i91Var, sh2 sh2Var) {
        String str;
        boolean z;
        boolean z2;
        jn1 jn1Var = this.d;
        Object[] objArr = jn1Var.a;
        int i = jn1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            v6 v6Var = (v6) ((uh2) objArr[i2]);
            t7 t7Var = v6Var.c;
            mm mmVar = v6Var.a;
            sh2 w = i91Var.w();
            int i3 = i91Var.n;
            String str2 = null;
            if (sh2Var != null) {
                Object g = sh2Var.m.g(gi2.D);
                if (g == null) {
                    g = null;
                }
                yd ydVar = (yd) g;
                if (ydVar != null) {
                    str = ydVar.n;
                    if (w != null) {
                        Object g2 = w.m.g(gi2.D);
                        if (g2 == null) {
                            g2 = null;
                        }
                        yd ydVar2 = (yd) g2;
                        if (ydVar2 != null) {
                            str2 = ydVar2.n;
                        }
                    }
                    if (str != str2) {
                        if (str == null) {
                            mmVar.h(t7Var, i3, true);
                        } else if (str2 == null) {
                            mmVar.h(t7Var, i3, false);
                        } else if (Intrinsics.b((w8) th2.l(w, gi2.r), qb2.J)) {
                            mmVar.e(t7Var, i3, im.a(str2.toString()));
                        }
                    }
                    z = sh2Var == null && sh2Var.m.b(gi2.q);
                    z2 = w == null && w.m.b(gi2.q);
                    if (z == z2) {
                        an1 an1Var = v6Var.g;
                        if (z2) {
                            an1Var.a(i3);
                        } else {
                            an1Var.e(i3);
                        }
                    }
                }
            }
            str = null;
            if (w != null) {
            }
            if (str != str2) {
            }
            if (sh2Var == null) {
            }
            if (w == null) {
            }
            if (z == z2) {
            }
        }
    }
}
