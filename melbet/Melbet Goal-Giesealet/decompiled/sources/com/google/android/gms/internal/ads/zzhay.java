package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhay implements zzgzi {
    private static final zzhay zza = new zzhay();
    private static final zzgzc zzb = zzgzc.zzd(zzhav.zza, zzgxv.class, zzgqr.class);

    zzhay() {
    }

    static void zzc() throws GeneralSecurityException {
        zzgyl.zza().zzc(zza);
        zzgyl.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final Class zza() {
        return zzgqr.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final Class zzb() {
        return zzgqr.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final /* bridge */ /* synthetic */ Object zze(zzgxr zzgxrVar, zzgxy zzgxyVar, zzgzh zzgzhVar) throws GeneralSecurityException {
        zzgxz zzgxzVar;
        zzgxz zzgxzVar2;
        zzhgg zzd;
        zzgyx zzgyxVar = new zzgyx();
        for (int i = 0; i < zzgxrVar.zzd(); i++) {
            zzgqm zze = ((zzgqo) zzgxrVar).zze(i);
            if (zze.zzb().equals(zzgqf.zza)) {
                zzgqr zzgqrVar = (zzgqr) zzgzhVar.zza(zze);
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
                zzgyxVar.zza(zzd, new zzhaw(zzgqrVar, zze.zzc()));
            }
        }
        if (zzgxyVar.zza()) {
            zzgxzVar = zzgyc.zza;
            zzgxzVar2 = zzgxzVar;
        } else {
            zzgya zzb2 = zzgyj.zza().zzb();
            zzgxz zza3 = zzb2.zza(zzgxrVar, zzgxyVar, "mac", "compute");
            zzgxzVar2 = zzb2.zza(zzgxrVar, zzgxyVar, "mac", "verify");
            zzgxzVar = zza3;
        }
        zzgqo zzgqoVar = (zzgqo) zzgxrVar;
        return new zzhax(new zzhaw((zzgqr) zzgzhVar.zza(zzgqoVar.zzc()), zzgqoVar.zzc().zzc()), zzgyxVar.zzb(), zzgxzVar, zzgxzVar2, null);
    }
}
