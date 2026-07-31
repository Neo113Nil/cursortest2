package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzkz implements zzla {
    private final zzdc zza;
    private final int zzb;

    public zzkz(zzdc zzdcVar) {
        this.zza = zzdcVar;
        this.zzb = zzdcVar.zzb() + zzdcVar.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i4) {
        byte[] bArr3;
        if (bArr2.length < i4) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i4, bArr2.length);
        zzbe zza = zzyn.zza(zzcx.zzb().zza(this.zza).zza(zzzo.zza(Arrays.copyOf(bArr, this.zza.zzb()), zzbl.zza())).zzb(zzzo.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzb() + this.zza.zzc()), zzbl.zza())).zza());
        bArr3 = zzkw.zza;
        return zza.zza(copyOfRange, bArr3);
    }
}
