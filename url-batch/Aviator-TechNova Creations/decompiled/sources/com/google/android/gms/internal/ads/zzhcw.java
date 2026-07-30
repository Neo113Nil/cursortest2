package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhcw {

    @Nullable
    private zzhdd zza = null;

    @Nullable
    private zzhyg zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhcw() {
    }

    /* synthetic */ zzhcw(byte[] bArr) {
    }

    public final zzhcw zza(zzhdd zzhddVar) {
        this.zza = zzhddVar;
        return this;
    }

    public final zzhcw zzb(zzhyg zzhygVar) {
        this.zzb = zzhygVar;
        return this;
    }

    public final zzhcw zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhcx zzd() throws GeneralSecurityException {
        zzhyg zzhygVar;
        zzhye zzb;
        zzhdd zzhddVar = this.zza;
        if (zzhddVar == null || (zzhygVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhddVar.zzc() != zzhygVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhddVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhdc.zzc) {
            zzb = zzhkh.zza;
        } else if (this.zza.zze() == zzhdc.zzb) {
            zzb = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhdc.zza) {
                String valueOf = String.valueOf(this.zza.zze());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zzb = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhcx(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
