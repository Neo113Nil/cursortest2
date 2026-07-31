package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class mn {
    public static void a(long j4, sf1 sf1Var, p52[] p52VarArr) {
        int i4;
        while (true) {
            if (sf1Var.a() <= 1) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (sf1Var.a() == 0) {
                    i4 = -1;
                    break;
                }
                int t4 = sf1Var.t();
                i5 += t4;
                if (t4 != 255) {
                    i4 = i5;
                    break;
                }
            }
            int i6 = 0;
            while (true) {
                if (sf1Var.a() == 0) {
                    i6 = -1;
                    break;
                }
                int t5 = sf1Var.t();
                i6 += t5;
                if (t5 != 255) {
                    break;
                }
            }
            int d4 = sf1Var.d() + i6;
            if (i6 == -1 || i6 > sf1Var.a()) {
                ms0.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                d4 = sf1Var.e();
            } else if (i4 == 4 && i6 >= 8) {
                int t6 = sf1Var.t();
                int z4 = sf1Var.z();
                int h4 = z4 == 49 ? sf1Var.h() : 0;
                int t7 = sf1Var.t();
                if (z4 == 47) {
                    sf1Var.f(1);
                }
                boolean z5 = t6 == 181 && (z4 == 49 || z4 == 47) && t7 == 3;
                if (z4 == 49) {
                    z5 &= h4 == 1195456820;
                }
                if (z5) {
                    b(j4, sf1Var, p52VarArr);
                }
            }
            sf1Var.e(d4);
        }
    }

    public static void b(long j4, sf1 sf1Var, p52[] p52VarArr) {
        long j5;
        int t4 = sf1Var.t();
        if ((t4 & 64) != 0) {
            sf1Var.f(1);
            int i4 = (t4 & 31) * 3;
            int d4 = sf1Var.d();
            int length = p52VarArr.length;
            int i5 = 0;
            while (i5 < length) {
                p52 p52Var = p52VarArr[i5];
                sf1Var.e(d4);
                p52Var.a(i4, sf1Var);
                if (j4 != -9223372036854775807L) {
                    j5 = j4;
                    p52Var.a(j5, 1, i4, 0, null);
                } else {
                    j5 = j4;
                }
                i5++;
                j4 = j5;
            }
        }
    }
}
