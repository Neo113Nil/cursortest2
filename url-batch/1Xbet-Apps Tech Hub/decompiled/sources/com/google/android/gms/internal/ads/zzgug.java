package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgug implements zzgdc {
    private static final byte[] zza = {0};
    private final zzgox zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgug(zzgmh zzgmhVar) throws GeneralSecurityException {
        this.zzb = new zzgud(zzgmhVar.zzd().zzc(zzgco.zza()));
        this.zzc = zzgmhVar.zza().zzb();
        this.zzd = zzgmhVar.zzc().zzc();
        if (zzgmhVar.zza().zze().equals(zzgmp.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgdc zzb(zzgmh zzgmhVar) throws GeneralSecurityException {
        return new zzgug(zzgmhVar);
    }

    public static zzgdc zzc(zzgne zzgneVar) throws GeneralSecurityException {
        return new zzgug(zzgneVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdc
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        if (!MessageDigest.isEqual(bArr3.length > 0 ? zzgti.zzb(this.zzd, this.zzb.zza(zzgti.zzb(bArr2, bArr3), this.zzc)) : zzgti.zzb(this.zzd, this.zzb.zza(bArr2, this.zzc)), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    private zzgug(zzgne zzgneVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(String.valueOf(zzgneVar.zzd().zzf()));
        this.zzb = new zzguf("HMAC".concat(valueOf), new SecretKeySpec(zzgneVar.zze().zzc(zzgco.zza()), "HMAC"));
        this.zzc = zzgneVar.zzd().zzb();
        this.zzd = zzgneVar.zzc().zzc();
        if (zzgneVar.zzd().zzg().equals(zzgno.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgug(zzgox zzgoxVar, int i) throws GeneralSecurityException {
        this.zzb = zzgoxVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzgoxVar.zza(new byte[0], i);
    }
}
