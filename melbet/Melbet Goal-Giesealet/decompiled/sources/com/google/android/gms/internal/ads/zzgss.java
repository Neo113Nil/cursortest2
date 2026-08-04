package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgss {

    @Nullable
    private Integer zza = null;
    private zzgst zzb = zzgst.zzc;

    private zzgss() {
    }

    /* synthetic */ zzgss(byte[] bArr) {
    }

    public final zzgss zzb(zzgst zzgstVar) {
        this.zzb = zzgstVar;
        return this;
    }

    public final zzgsu zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzgsu(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final zzgss zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }
}
