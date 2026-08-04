package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhah {

    @Nullable
    private zzhar zza = null;

    @Nullable
    private zzhgh zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhah() {
    }

    /* synthetic */ zzhah(byte[] bArr) {
    }

    public final zzhah zza(zzhar zzharVar) {
        this.zza = zzharVar;
        return this;
    }

    public final zzhah zzb(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
        return this;
    }

    public final zzhah zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhai zzd() throws GeneralSecurityException {
        zzhgh zzhghVar;
        zzhgg zza;
        zzhar zzharVar = this.zza;
        if (zzharVar == null || (zzhghVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzharVar.zzc() != zzhghVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzharVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhaq.zzd) {
            zza = zzgyp.zza;
        } else if (this.zza.zzf() == zzhaq.zzc || this.zza.zzf() == zzhaq.zzb) {
            zza = zzgyp.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhaq.zza) {
                String valueOf = String.valueOf(this.zza.zzf());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zza = zzgyp.zzb(this.zzc.intValue());
        }
        return new zzhai(this.zza, this.zzb, zza, this.zzc, null);
    }
}
