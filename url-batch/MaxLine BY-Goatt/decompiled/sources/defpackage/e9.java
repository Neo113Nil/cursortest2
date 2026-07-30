package defpackage;

import androidx.compose.foundation.layout.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class e9 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(du1 du1Var, vl1 vl1Var, long j, a00 a00Var, int i) {
        int i2;
        a00Var.Z(1776202187);
        int i3 = (a00Var.f(du1Var) ? 4 : 2) | i | (a00Var.f(vl1Var) ? 32 : 16) | 128;
        if ((i3 & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            a00Var.U();
            if ((i & 1) == 0 || a00Var.z()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                a00Var.S();
                i2 = i3 & (-897);
            }
            a00Var.r();
            int i4 = i2 & 14;
            int i5 = 0;
            boolean z = i4 == 4;
            Object M = a00Var.M();
            if (z || M == sz.a) {
                M = new j6(4, du1Var);
                a00Var.i0(M);
            }
            iv1.f(du1Var, qb2.q, yj1.H(-1653527038, new y8(i5, j, wh2.a(vl1Var, (Function1) M)), a00Var), a00Var, i4 | 432);
        }
        long j2 = j;
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new z8(du1Var, vl1Var, j2, i);
        }
    }

    public static final void b(vl1 vl1Var, a00 a00Var, int i, int i2) {
        int i3;
        a00Var.Z(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (a00Var.f(vl1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            if (i4 != 0) {
                vl1Var = sl1.a;
            }
            nk2.a(a00Var, bd3.n(b.i(vl1Var, a), d9.n));
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new a9(vl1Var, i, i2);
        }
    }
}
