package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgfv {

    @Nullable
    private Integer zza;

    @Nullable
    private Integer zzb;

    @Nullable
    private Integer zzc;
    private zzgfw zzd;

    private zzgfv() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* synthetic */ zzgfv(zzgfu zzgfuVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgfw.zzc;
    }

    public final zzgfv zza(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgfv zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgfv zzd(zzgfw zzgfwVar) {
        this.zzd = zzgfwVar;
        return this;
    }

    public final zzgfy zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        this.zzb.intValue();
        this.zzc.intValue();
        return new zzgfy(intValue, 12, 16, this.zzd, null);
    }

    public final zzgfv zzb(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }
}
