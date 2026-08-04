package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhag implements zzgzi {
    private static final zzhag zza = new zzhag();

    private zzhag() {
    }

    static void zzc() throws GeneralSecurityException {
        zzgyl.zza().zzc(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final Class zza() {
        return zzhae.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final Class zzb() {
        return zzhae.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final /* bridge */ /* synthetic */ Object zze(zzgxr zzgxrVar, zzgxy zzgxyVar, zzgzh zzgzhVar) throws GeneralSecurityException {
        zzhgg zzd;
        zzgqo zzgqoVar = (zzgqo) zzgxrVar;
        zzgqm zzc = zzgqoVar.zzc();
        zzgyx zzgyxVar = new zzgyx();
        for (int i = 0; i < zzgxrVar.zzd(); i++) {
            zzgqm zze = zzgqoVar.zze(i);
            if (zze.zzb().equals(zzgqf.zza)) {
                zzhae zzhaeVar = (zzhae) zzgzhVar.zza(zze);
                zzgqd zza2 = zze.zza();
                if (zza2 instanceof zzhat) {
                    zzd = ((zzhat) zza2).zzd();
                } else {
                    if (!(zza2 instanceof zzgxv)) {
                        String name = zza2.getClass().getName();
                        String valueOf = String.valueOf(zza2.zza());
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 59 + String.valueOf(valueOf).length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    zzd = ((zzgxv) zza2).zzd();
                }
                zzgyxVar.zza(zzd, zzhaeVar);
            }
        }
        return new zzhaf(zzgyxVar.zzb(), (zzhae) zzgzhVar.zza(zzc), null);
    }
}
