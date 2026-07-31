package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class gc4 {
    public static void a(long j7, dr2 dr2Var, td4[] td4VarArr) {
        int i7;
        while (true) {
            if (dr2Var.i() <= 1) {
                return;
            }
            int c7 = c(dr2Var);
            int c8 = c(dr2Var);
            int k7 = dr2Var.k() + c8;
            if (c8 == -1 || c8 > dr2Var.i()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                k7 = dr2Var.l();
            } else if (c7 == 4 && c8 >= 8) {
                int s7 = dr2Var.s();
                int w6 = dr2Var.w();
                if (w6 == 49) {
                    i7 = dr2Var.m();
                    w6 = 49;
                } else {
                    i7 = 0;
                }
                int s8 = dr2Var.s();
                if (w6 == 47) {
                    dr2Var.g(1);
                    w6 = 47;
                }
                boolean z6 = s7 == 181 && (w6 == 49 || w6 == 47) && s8 == 3;
                if (w6 == 49) {
                    z6 &= i7 == 1195456820;
                }
                if (z6) {
                    b(j7, dr2Var, td4VarArr);
                }
            }
            dr2Var.f(k7);
        }
    }

    public static void b(long j7, dr2 dr2Var, td4[] td4VarArr) {
        int s7 = dr2Var.s();
        if ((s7 & 64) != 0) {
            dr2Var.g(1);
            int i7 = (s7 & 31) * 3;
            int k7 = dr2Var.k();
            for (td4 td4Var : td4VarArr) {
                dr2Var.f(k7);
                td4Var.e(dr2Var, i7);
                if (j7 != -9223372036854775807L) {
                    td4Var.a(j7, 1, i7, 0, null);
                }
            }
        }
    }

    private static int c(dr2 dr2Var) {
        int i7 = 0;
        while (dr2Var.i() != 0) {
            int s7 = dr2Var.s();
            i7 += s7;
            if (s7 != 255) {
                return i7;
            }
        }
        return -1;
    }
}
