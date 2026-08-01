package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzglo implements zzglt {
    private final String zza;
    private final zzguk zzb;
    private final zzgve zzc;
    private final zzgrl zzd;
    private final zzgss zze;

    @Nullable
    private final Integer zzf;

    private zzglo(String str, zzgve zzgveVar, zzgrl zzgrlVar, zzgss zzgssVar, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzgmd.zza(str);
        this.zzc = zzgveVar;
        this.zzd = zzgrlVar;
        this.zze = zzgssVar;
        this.zzf = num;
    }

    public static zzglo zza(String str, zzgve zzgveVar, zzgrl zzgrlVar, zzgss zzgssVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzgssVar == zzgss.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzglo(str, zzgveVar, zzgrlVar, zzgssVar, num);
    }

    public final zzgrl zzb() {
        return this.zzd;
    }

    public final zzgss zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzglt
    public final zzguk zzd() {
        return this.zzb;
    }

    public final zzgve zze() {
        return this.zzc;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
