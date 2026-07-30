package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhvq implements zzhbs {
    private final zzhbs zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhvq(zzhbs zzhbsVar, byte[] bArr, byte[] bArr2) {
        this.zza = zzhbsVar;
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static zzhbs zzb(zzhjo zzhjoVar) throws GeneralSecurityException {
        zzhlb zzc = zzhjoVar.zzc(zzhax.zza());
        return new zzhvq((zzhbs) zzhjc.zza().zzc(zzc.zzg(), zzhbs.class).zza(zzc.zzb()), zzc(zzc), zzd(zzc));
    }

    static byte[] zzc(zzhlb zzhlbVar) throws GeneralSecurityException {
        int ordinal = zzhlbVar.zzd().ordinal();
        if (ordinal == 1) {
            return zzhkh.zzb(zzhlbVar.zze().intValue()).zzc();
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhkh.zza.zzc();
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return zzhkh.zza(zzhlbVar.zze().intValue()).zzc();
    }

    static byte[] zzd(zzhlb zzhlbVar) {
        return zzhlbVar.zzd().equals(zzhqy.LEGACY) ? new byte[]{0} : new byte[0];
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            this.zza.zza(bArr, bArr2);
            return;
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.zzc;
        if (bArr4.length != 0) {
            bArr2 = zzhwr.zza(bArr2, bArr4);
        }
        this.zza.zza(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
    }
}
