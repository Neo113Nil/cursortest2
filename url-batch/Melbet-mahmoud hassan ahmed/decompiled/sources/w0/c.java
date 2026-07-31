package w0;

/* loaded from: classes.dex */
public final class c {
    public static void a(long j7, o2.a0 a0Var, e0[] e0VarArr) {
        while (true) {
            if (a0Var.a() <= 1) {
                return;
            }
            int c7 = c(a0Var);
            int c8 = c(a0Var);
            int e7 = a0Var.e() + c8;
            if (c8 == -1 || c8 > a0Var.a()) {
                o2.r.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                e7 = a0Var.f();
            } else if (c7 == 4 && c8 >= 8) {
                int C = a0Var.C();
                int I = a0Var.I();
                int m7 = I == 49 ? a0Var.m() : 0;
                int C2 = a0Var.C();
                if (I == 47) {
                    a0Var.P(1);
                }
                boolean z6 = C == 181 && (I == 49 || I == 47) && C2 == 3;
                if (I == 49) {
                    z6 &= m7 == 1195456820;
                }
                if (z6) {
                    b(j7, a0Var, e0VarArr);
                }
            }
            a0Var.O(e7);
        }
    }

    public static void b(long j7, o2.a0 a0Var, e0[] e0VarArr) {
        int C = a0Var.C();
        if ((C & 64) != 0) {
            a0Var.P(1);
            int i7 = (C & 31) * 3;
            int e7 = a0Var.e();
            for (e0 e0Var : e0VarArr) {
                a0Var.O(e7);
                e0Var.d(a0Var, i7);
                if (j7 != -9223372036854775807L) {
                    e0Var.b(j7, 1, i7, 0, null);
                }
            }
        }
    }

    private static int c(o2.a0 a0Var) {
        int i7 = 0;
        while (a0Var.a() != 0) {
            int C = a0Var.C();
            i7 += C;
            if (C != 255) {
                return i7;
            }
        }
        return -1;
    }
}
