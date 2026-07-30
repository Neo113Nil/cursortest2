package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhsx extends zzhuw {
    private final zzhsq zza;
    private final zzhye zzb;
    private final zzhye zzc;

    @Nullable
    private final Integer zzd;

    private zzhsx(zzhsq zzhsqVar, zzhye zzhyeVar, zzhye zzhyeVar2, @Nullable Integer num) {
        this.zza = zzhsqVar;
        this.zzb = zzhyeVar;
        this.zzc = zzhyeVar2;
        this.zzd = num;
    }

    public static zzhsx zzc(zzhsp zzhspVar, zzhye zzhyeVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhye zza;
        zzhsq zzb = zzhsq.zzb(zzhspVar);
        zzhsp zzhspVar2 = zzhsp.zzd;
        if (!zzhspVar.equals(zzhspVar2) && num == null) {
            String obj = zzhspVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhspVar.equals(zzhspVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhyeVar.zzd() != 32) {
            int zzd = zzhyeVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd).length() + 65);
            sb2.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzb.zzc() == zzhspVar2) {
            zza = zzhkh.zza;
        } else if (zzb.zzc() == zzhsp.zzb || zzb.zzc() == zzhsp.zzc) {
            zza = zzhkh.zza(num.intValue());
        } else {
            if (zzb.zzc() != zzhsp.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb.zzc().toString()));
            }
            zza = zzhkh.zzb(num.intValue());
        }
        return new zzhsx(zzb, zzhyeVar, zza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhuw, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzhye zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhuw
    public final zzhye zze() {
        return this.zzc;
    }

    public final zzhsq zzf() {
        return this.zza;
    }
}
