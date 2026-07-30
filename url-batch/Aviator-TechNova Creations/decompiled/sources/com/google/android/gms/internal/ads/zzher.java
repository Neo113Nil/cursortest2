package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzher extends zzhcg {
    private final zzhev zza;
    private final zzhye zzb;

    @Nullable
    private final Integer zzc;

    private zzher(zzhev zzhevVar, zzhye zzhyeVar, @Nullable Integer num) {
        this.zza = zzhevVar;
        this.zzb = zzhyeVar;
        this.zzc = num;
    }

    public static zzher zzd(zzhev zzhevVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhye zzb;
        if (zzhevVar.zzc() == zzheu.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzb = zzhkh.zza;
        } else {
            if (zzhevVar.zzc() != zzheu.zza) {
                String valueOf = String.valueOf(zzhevVar.zzc());
                String.valueOf(valueOf);
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(valueOf)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzb = zzhkh.zzb(num.intValue());
        }
        return new zzher(zzhevVar, zzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final zzhye zzc() {
        return this.zzb;
    }

    public final zzhev zze() {
        return this.zza;
    }
}
