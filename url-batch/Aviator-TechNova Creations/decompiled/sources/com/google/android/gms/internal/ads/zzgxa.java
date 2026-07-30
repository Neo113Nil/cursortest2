package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzgxa {
    private static final zzgxa zza;
    private static final zzgxa zzb;
    private static final zzgxa zzc;

    static {
        Character valueOf = Character.valueOf(SignatureVisitor.INSTANCEOF);
        zza = new zzgwx("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new zzgwx("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        new zzgwz("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        new zzgwz("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zzc = new zzgww("base16()", "0123456789ABCDEF");
    }

    zzgxa() {
    }

    public static zzgxa zzl() {
        return zza;
    }

    public static zzgxa zzm() {
        return zzb;
    }

    public static zzgxa zzn() {
        return zzc;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy;

    abstract int zzd(int i);

    abstract int zzf(int i);

    CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgxa zzh();

    public abstract zzgxa zzi();

    public final String zzj(byte[] bArr, int i, int i2) {
        zzgrc.zzo(0, i2, bArr.length);
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
        } catch (zzgwy e) {
            throw new IllegalArgumentException(e);
        }
    }
}
