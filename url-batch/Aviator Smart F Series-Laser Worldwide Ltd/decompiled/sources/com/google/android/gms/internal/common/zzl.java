package com.google.android.gms.internal.common;

import cn.hutool.core.io.file.c;

/* loaded from: classes3.dex */
final class zzl extends zzk {
    private final char zza;

    zzl(char c8) {
        this.zza = c8;
    }

    public final String toString() {
        char[] cArr = {c.WINDOWS_SEPARATOR, 'u', 0, 0, 0, 0};
        int i8 = this.zza;
        for (int i9 = 0; i9 < 4; i9++) {
            cArr[5 - i9] = "0123456789ABCDEF".charAt(i8 & 15);
            i8 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c8) {
        return c8 == this.zza;
    }
}
