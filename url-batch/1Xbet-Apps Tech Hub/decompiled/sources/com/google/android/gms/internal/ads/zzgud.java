package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgud implements zzgox {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgud(byte[] bArr) throws GeneralSecurityException {
        zzgui.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza = zzgoe.zza(zzb.doFinal(new byte[16]));
        this.zzb = zza;
        this.zzc = zzgoe.zza(zza);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzgjl.zza(1)) {
            return (Cipher) zzgts.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzgox
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] zzc;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.zza;
        Cipher zzb = zzb();
        zzb.init(1, secretKey);
        int length = bArr.length;
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        int i2 = max - 1;
        int i3 = i2 * 16;
        if (max * 16 == length) {
            zzc = zzgti.zzd(bArr, i3, this.zzb, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i3, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            zzc = zzgti.zzc(copyOf, this.zzc);
        }
        byte[] bArr2 = new byte[16];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2 = zzb.doFinal(zzgti.zzd(bArr2, 0, bArr, i4 * 16, 16));
        }
        return Arrays.copyOf(zzb.doFinal(zzgti.zzc(zzc, bArr2)), i);
    }
}
