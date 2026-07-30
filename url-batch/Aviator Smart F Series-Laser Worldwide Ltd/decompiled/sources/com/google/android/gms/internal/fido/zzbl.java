package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzbl {
    private static final zzbl zza = new zzbj("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzbl zzb = new zzbj("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzbl zzc = new zzbk("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzbl zzd = new zzbk("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzbl zze = new zzbi("base16()", "0123456789ABCDEF");

    zzbl() {
    }

    public static zzbl zzd() {
        return zze;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i8, int i9);

    abstract int zzb(int i8);

    public final String zze(byte[] bArr, int i8, int i9) {
        zzas.zze(0, i9, bArr.length);
        StringBuilder sb = new StringBuilder(zzb(i9));
        try {
            zza(sb, bArr, 0, i9);
            return sb.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }
}
