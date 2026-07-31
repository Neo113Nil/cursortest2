package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzzc implements zzrx {
    private static final zzij.zza zza = zzij.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzzf();
    private final SecretKey zzc;
    private byte[] zzd;
    private byte[] zze;

    public zzzc(byte[] bArr) {
        zzzi.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzc = secretKeySpec;
        Cipher zza2 = zza();
        zza2.init(1, secretKeySpec);
        byte[] zzb2 = zzrn.zzb(zza2.doFinal(new byte[16]));
        this.zzd = zzb2;
        this.zze = zzrn.zzb(zzb2);
    }

    private static Cipher zza() {
        if (zza.zza()) {
            return zzb.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zza(byte[] bArr, byte[] bArr2, int i4, byte[] bArr3) {
        for (int i5 = 0; i5 < 16; i5++) {
            bArr3[i5] = (byte) (bArr[i5] ^ bArr2[i5 + i4]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrx
    public final byte[] zza(byte[] bArr, int i4) {
        byte[] zza2;
        if (i4 <= 16) {
            Cipher zza3 = zza();
            zza3.init(1, this.zzc);
            int length = bArr.length;
            int i5 = length == 0 ? 1 : ((length - 1) / 16) + 1;
            if ((i5 << 4) == bArr.length) {
                zza2 = zzyc.zza(bArr, (i5 - 1) << 4, this.zzd, 0, 16);
            } else {
                zza2 = zzyc.zza(zzrn.zza(Arrays.copyOfRange(bArr, (i5 - 1) << 4, bArr.length)), this.zze);
            }
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            for (int i6 = 0; i6 < i5 - 1; i6++) {
                zza(bArr2, bArr, i6 << 4, bArr3);
                if (zza3.doFinal(bArr3, 0, 16, bArr2) != 16) {
                    throw new IllegalStateException("Cipher didn't write full block");
                }
            }
            zza(bArr2, zza2, 0, bArr3);
            if (zza3.doFinal(bArr3, 0, 16, bArr2) == 16) {
                return 16 == i4 ? bArr2 : Arrays.copyOf(bArr2, i4);
            }
            throw new IllegalStateException("Cipher didn't write full block");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
