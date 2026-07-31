package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
class zzik {
    protected static final int zza(String str, byte[] bArr, int i4, int i5) {
        byte[] bytes = str.getBytes(zzga.zza);
        int length = bytes.length;
        if (length - i4 > i5) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i4, length);
        return i4 + length;
    }
}
