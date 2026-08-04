package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzgmk {
    private static final zzgmk zza = new zzgmh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzgmk zzb = new zzgmh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzgmk zzc;

    static {
        new zzgmj("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgmj("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzc = new zzgmg("base16()", "0123456789ABCDEF");
    }

    zzgmk() {
    }

    public static zzgmk zzl() {
        return zza;
    }

    public static zzgmk zzm() {
        return zzb;
    }

    public static zzgmk zzn() {
        return zzc;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi;

    abstract int zzd(int i);

    abstract int zzf(int i);

    CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgmk zzh();

    public abstract zzgmk zzi();

    public final String zzj(byte[] bArr, int i, int i2) {
        zzghc.zzo(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zza(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence zzg = zzg(charSequence);
            int zzf = zzf(zzg.length());
            byte[] bArr = new byte[zzf];
            int zzb2 = zzb(bArr, zzg);
            if (zzb2 == zzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[zzb2];
            System.arraycopy(bArr, 0, bArr2, 0, zzb2);
            return bArr2;
        } catch (zzgmi e) {
            throw new IllegalArgumentException(e);
        }
    }
}
