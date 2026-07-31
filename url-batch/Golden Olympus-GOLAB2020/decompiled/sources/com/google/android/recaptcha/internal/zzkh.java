package com.google.android.recaptcha.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.cc;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzkh {
    private static final zzkh zza;
    private static final zzkh zzb;

    static {
        char[] cArr;
        Character valueOf = Character.valueOf(cc.f15727T);
        zza = new zzke("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new zzke("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        new zzkg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        new zzkg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zzkd zzkdVar = new zzkd("base16()", "0123456789ABCDEF".toCharArray());
        new zzkg(zzkdVar, null);
        char[] cArr2 = new char[UserVerificationMethods.USER_VERIFY_NONE];
        cArr = zzkdVar.zzf;
        zzjf.zza(cArr.length == 16);
        for (int i4 = 0; i4 < 256; i4++) {
            cArr2[i4] = zzkdVar.zza(i4 >>> 4);
            cArr2[i4 | UserVerificationMethods.USER_VERIFY_HANDPRINT] = zzkdVar.zza(i4 & 15);
        }
    }

    zzkh() {
    }

    public static zzkh zzg() {
        return zza;
    }

    public static zzkh zzh() {
        return zzb;
    }

    abstract int zza(byte[] bArr, CharSequence charSequence);

    abstract void zzb(Appendable appendable, byte[] bArr, int i4, int i5);

    abstract int zzc(int i4);

    abstract int zzd(int i4);

    CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i4, int i5) {
        zzjf.zzd(0, i5, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i5));
        try {
            zzb(sb, bArr, 0, i5);
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze = zze(charSequence);
            int zzc = zzc(zze.length());
            byte[] bArr = new byte[zzc];
            int zza2 = zza(bArr, zze);
            if (zza2 == zzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzkf e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
