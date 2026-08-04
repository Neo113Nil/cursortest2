package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgrl {

    @Nullable
    private zzgru zza = null;

    @Nullable
    private zzhgh zzb = null;

    @Nullable
    private zzhgh zzc = null;

    @Nullable
    private Integer zzd = null;

    private zzgrl() {
    }

    /* synthetic */ zzgrl(byte[] bArr) {
    }

    public final zzgrl zza(zzgru zzgruVar) {
        this.zza = zzgruVar;
        return this;
    }

    public final zzgrl zzb(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
        return this;
    }

    public final zzgrl zzc(zzhgh zzhghVar) {
        this.zzc = zzhghVar;
        return this;
    }

    public final zzgrl zzd(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgrm zze() throws GeneralSecurityException {
        zzhgg zzb;
        zzgru zzgruVar = this.zza;
        if (zzgruVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzhgh zzhghVar = this.zzb;
        if (zzhghVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzgruVar.zzc() != zzhghVar.zzd()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzgruVar.zzd() != this.zzc.zzd()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgrt.zzc) {
            zzb = zzgyp.zza;
        } else if (this.zza.zzg() == zzgrt.zzb) {
            zzb = zzgyp.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzg() != zzgrt.zza) {
                String valueOf = String.valueOf(this.zza.zzg());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zzb = zzgyp.zzb(this.zzd.intValue());
        }
        return new zzgrm(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
    }
}
