package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzggn {

    @Nullable
    private Integer zza;
    private zzggo zzb;

    private zzggn() {
        this.zza = null;
        throw null;
    }

    /* synthetic */ zzggn(zzggm zzggmVar) {
        this.zza = null;
        this.zzb = zzggo.zzc;
    }

    public final zzggn zzb(zzggo zzggoVar) {
        this.zzb = zzggoVar;
        return this;
    }

    public final zzggq zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzggq(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final zzggn zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }
}
