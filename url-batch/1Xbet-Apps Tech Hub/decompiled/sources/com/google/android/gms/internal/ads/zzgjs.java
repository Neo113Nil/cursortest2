package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgjs implements zzgcq {
    private final zzgke zza;
    private final Class zzb;

    public zzgjs(zzgke zzgkeVar, Class cls) {
        if (!zzgkeVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgkeVar.toString(), cls.getName()));
        }
        this.zza = zzgkeVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.ads.zzgcq
    public final zzgrm zza(zzgve zzgveVar) throws GeneralSecurityException {
        try {
            zzgkd zza = this.zza.zza();
            zzgxw zzb = zza.zzb(zzgveVar);
            zza.zzc(zzb);
            zzgxw zza2 = zza.zza(zzb);
            zzgrj zza3 = zzgrm.zza();
            zza3.zzb(this.zza.zzd());
            zza3.zzc(zza2.zzau());
            zza3.zza(this.zza.zzb());
            return (zzgrm) zza3.zzal();
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcq
    public final Object zzb(zzgve zzgveVar) throws GeneralSecurityException {
        try {
            zzgxw zzc = this.zza.zzc(zzgveVar);
            if (Void.class.equals(this.zzb)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.zza.zzf(zzc);
            return this.zza.zzk(zzc, this.zzb);
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzj().getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcq
    public final String zzc() {
        return this.zza.zzd();
    }
}
