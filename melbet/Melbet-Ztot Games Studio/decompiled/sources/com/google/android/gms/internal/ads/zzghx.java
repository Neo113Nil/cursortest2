package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzghx extends zzgew {
    private final zzgid zza;
    private final zzgvr zzb;

    @Nullable
    private final Integer zzc;

    private zzghx(zzgid zzgidVar, zzgvr zzgvrVar, @Nullable Integer num) {
        this.zza = zzgidVar;
        this.zzb = zzgvrVar;
        this.zzc = num;
    }

    public static zzghx zza(zzgid zzgidVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgvr zzb;
        if (zzgidVar.zzc() == zzgib.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzb = zzgml.zza;
        } else {
            if (zzgidVar.zzc() != zzgib.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(String.valueOf(zzgidVar.zzc()))));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzb = zzgml.zzb(num.intValue());
        }
        return new zzghx(zzgidVar, zzb, num);
    }

    public final zzgid zzb() {
        return this.zza;
    }

    public final zzgvr zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
