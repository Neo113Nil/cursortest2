package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhdn {

    @Nullable
    private zzhdv zza = null;

    @Nullable
    private zzhyg zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhdn() {
    }

    /* synthetic */ zzhdn(byte[] bArr) {
    }

    public final zzhdn zza(zzhdv zzhdvVar) {
        this.zza = zzhdvVar;
        return this;
    }

    public final zzhdn zzb(zzhyg zzhygVar) {
        this.zzb = zzhygVar;
        return this;
    }

    public final zzhdn zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhdo zzd() throws GeneralSecurityException {
        zzhyg zzhygVar;
        zzhye zzb;
        zzhdv zzhdvVar = this.zza;
        if (zzhdvVar == null || (zzhygVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhdvVar.zzc() != zzhygVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhdvVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhdu.zzc) {
            zzb = zzhkh.zza;
        } else if (this.zza.zzd() == zzhdu.zzb) {
            zzb = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhdu.zza) {
                String valueOf = String.valueOf(this.zza.zzd());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zzb = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhdo(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
