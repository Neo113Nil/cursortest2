package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzlx implements zzbj {
    private final zzbj zza;
    private final byte[] zzb;

    private zzlx(zzbj zzbjVar, byte[] bArr) {
        this.zza = zzbjVar;
        this.zzb = bArr;
    }

    public static zzbj zza(zznn zznnVar) {
        byte[] zzb;
        zzpn zza = zznnVar.zza(zzbl.zza());
        zzbj zzbjVar = (zzbj) zzcj.zza((zzwb) ((zzakg) zzwb.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze()), zzbj.class);
        zzxd zzc = zza.zzc();
        int i4 = zzlw.zza[zzc.ordinal()];
        if (i4 == 1) {
            zzb = zzor.zza.zzb();
        } else if (i4 == 2 || i4 == 3) {
            zzb = zzor.zza(zznnVar.zza().intValue()).zzb();
        } else {
            if (i4 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + String.valueOf(zzc));
            }
            zzb = zzor.zzb(zznnVar.zza().intValue()).zzb();
        }
        return new zzlx(zzbjVar, zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbj
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzpy.zza(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
