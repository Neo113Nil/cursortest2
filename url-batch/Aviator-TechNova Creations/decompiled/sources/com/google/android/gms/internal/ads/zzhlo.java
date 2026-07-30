package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhlo {

    @Nullable
    private zzhlw zza = null;

    @Nullable
    private zzhyg zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhlo() {
    }

    /* synthetic */ zzhlo(byte[] bArr) {
    }

    public final zzhlo zza(zzhlw zzhlwVar) {
        this.zza = zzhlwVar;
        return this;
    }

    public final zzhlo zzb(zzhyg zzhygVar) throws GeneralSecurityException {
        this.zzb = zzhygVar;
        return this;
    }

    public final zzhlo zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhlp zzd() throws GeneralSecurityException {
        zzhyg zzhygVar;
        zzhye zza;
        zzhlw zzhlwVar = this.zza;
        if (zzhlwVar == null || (zzhygVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhlwVar.zzc() != zzhygVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhlwVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhlv.zzd) {
            zza = zzhkh.zza;
        } else if (this.zza.zzf() == zzhlv.zzc || this.zza.zzf() == zzhlv.zzb) {
            zza = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhlv.zza) {
                String valueOf = String.valueOf(this.zza.zzf());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zza = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhlp(this.zza, this.zzb, zza, this.zzc, null);
    }
}
