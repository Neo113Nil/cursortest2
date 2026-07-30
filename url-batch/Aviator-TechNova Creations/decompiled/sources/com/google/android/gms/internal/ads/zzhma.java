package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhma {

    @Nullable
    private zzhmk zza = null;

    @Nullable
    private zzhyg zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhma() {
    }

    /* synthetic */ zzhma(byte[] bArr) {
    }

    public final zzhma zza(zzhmk zzhmkVar) {
        this.zza = zzhmkVar;
        return this;
    }

    public final zzhma zzb(zzhyg zzhygVar) {
        this.zzb = zzhygVar;
        return this;
    }

    public final zzhma zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhmb zzd() throws GeneralSecurityException {
        zzhyg zzhygVar;
        zzhye zza;
        zzhmk zzhmkVar = this.zza;
        if (zzhmkVar == null || (zzhygVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhmkVar.zzc() != zzhygVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhmkVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhmj.zzd) {
            zza = zzhkh.zza;
        } else if (this.zza.zzf() == zzhmj.zzc || this.zza.zzf() == zzhmj.zzb) {
            zza = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhmj.zza) {
                String valueOf = String.valueOf(this.zza.zzf());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zza = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhmb(this.zza, this.zzb, zza, this.zzc, null);
    }
}
