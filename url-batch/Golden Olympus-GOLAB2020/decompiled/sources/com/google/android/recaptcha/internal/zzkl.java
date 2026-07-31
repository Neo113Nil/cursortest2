package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzkl {
    static void zza(boolean z4, String str, long j4, long j5) {
        if (z4) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j4 + ", " + j5 + ")");
    }

    static void zzb(boolean z4) {
        if (!z4) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
