package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzgiq extends zzgew {
    private final zzgiw zza;
    private final zzgvs zzb;
    private final zzgvr zzc;

    @Nullable
    private final Integer zzd;

    private zzgiq(zzgiw zzgiwVar, zzgvs zzgvsVar, zzgvr zzgvrVar, @Nullable Integer num) {
        this.zza = zzgiwVar;
        this.zzb = zzgvsVar;
        this.zzc = zzgvrVar;
        this.zzd = num;
    }

    public static zzgiq zza(zzgiv zzgivVar, zzgvs zzgvsVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgvr zzb;
        zzgiv zzgivVar2 = zzgiv.zzc;
        if (zzgivVar != zzgivVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzgivVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzgivVar == zzgivVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgvsVar.zza() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgvsVar.zza());
        }
        zzgiw zzc = zzgiw.zzc(zzgivVar);
        if (zzc.zzb() == zzgivVar2) {
            zzb = zzgml.zza;
        } else if (zzc.zzb() == zzgiv.zzb) {
            zzb = zzgml.zza(num.intValue());
        } else {
            if (zzc.zzb() != zzgiv.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            zzb = zzgml.zzb(num.intValue());
        }
        return new zzgiq(zzc, zzgvsVar, zzb, num);
    }

    public final zzgiw zzb() {
        return this.zza;
    }

    public final zzgvr zzc() {
        return this.zzc;
    }

    public final zzgvs zzd() {
        return this.zzb;
    }

    @Nullable
    public final Integer zze() {
        return this.zzd;
    }
}
