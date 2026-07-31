package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class sc4 {
    public static int a(pc4 pc4Var, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            int d7 = pc4Var.d(bArr, i7 + i9, i8 - i9);
            if (d7 == -1) {
                break;
            }
            i9 += d7;
        }
        return i9;
    }

    public static void b(boolean z6, String str) {
        if (!z6) {
            throw dz.a(str, null);
        }
    }

    public static boolean c(pc4 pc4Var, byte[] bArr, int i7, int i8, boolean z6) {
        try {
            return pc4Var.n(bArr, 0, i8, z6);
        } catch (EOFException e7) {
            if (z6) {
                return false;
            }
            throw e7;
        }
    }

    public static boolean d(pc4 pc4Var, byte[] bArr, int i7, int i8) {
        try {
            ((jc4) pc4Var).m(bArr, i7, i8, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(pc4 pc4Var, int i7) {
        try {
            ((jc4) pc4Var).p(i7, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
