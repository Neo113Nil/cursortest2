package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class kg3 {
    public static void a(qj3 qj3Var) {
        an3.e(c(qj3Var.J().K()));
        b(qj3Var.J().L());
        if (qj3Var.M() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        ee3.c(qj3Var.F().I());
    }

    public static String b(int i7) {
        int i8 = i7 - 2;
        if (i8 == 1) {
            return "HmacSha1";
        }
        if (i8 == 2) {
            return "HmacSha384";
        }
        if (i8 == 3) {
            return "HmacSha256";
        }
        if (i8 == 4) {
            return "HmacSha512";
        }
        if (i8 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(dk3.a(i7))));
    }

    public static int c(int i7) {
        int i8 = i7 - 2;
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(bk3.a(i7))));
    }

    public static int d(int i7) {
        int i8 = i7 - 2;
        int i9 = 1;
        if (i8 != 1) {
            i9 = 2;
            if (i8 != 2) {
                if (i8 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(gj3.a(i7))));
            }
        }
        return i9;
    }
}
