package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhcm {

    @Nullable
    private zzhcv zza = null;

    @Nullable
    private zzhyg zzb = null;

    @Nullable
    private zzhyg zzc = null;

    @Nullable
    private Integer zzd = null;

    private zzhcm() {
    }

    /* synthetic */ zzhcm(byte[] bArr) {
    }

    public final zzhcm zza(zzhcv zzhcvVar) {
        this.zza = zzhcvVar;
        return this;
    }

    public final zzhcm zzb(zzhyg zzhygVar) {
        this.zzb = zzhygVar;
        return this;
    }

    public final zzhcm zzc(zzhyg zzhygVar) {
        this.zzc = zzhygVar;
        return this;
    }

    public final zzhcm zzd(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzhcn zze() throws GeneralSecurityException {
        zzhye zzb;
        zzhcv zzhcvVar = this.zza;
        if (zzhcvVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzhyg zzhygVar = this.zzb;
        if (zzhygVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzhcvVar.zzc() != zzhygVar.zzd()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzhcvVar.zzd() != this.zzc.zzd()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzhcu.zzc) {
            zzb = zzhkh.zza;
        } else if (this.zza.zzg() == zzhcu.zzb) {
            zzb = zzhkh.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzg() != zzhcu.zza) {
                String valueOf = String.valueOf(this.zza.zzg());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zzb = zzhkh.zzb(this.zzd.intValue());
        }
        return new zzhcn(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
    }
}
