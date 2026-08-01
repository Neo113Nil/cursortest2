package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgmo {

    @Nullable
    private Integer zza;

    @Nullable
    private Integer zzb;
    private zzgmp zzc;

    private zzgmo() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }

    /* synthetic */ zzgmo(zzgmn zzgmnVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgmp.zzd;
    }

    public final zzgmo zzc(zzgmp zzgmpVar) {
        this.zzc = zzgmpVar;
        return this;
    }

    public final zzgmr zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzgmr(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public final zzgmo zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgmo zzb(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.zzb = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }
}
