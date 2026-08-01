package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzggf {

    @Nullable
    private zzggq zza = null;

    @Nullable
    private zzgul zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzggf() {
    }

    /* synthetic */ zzggf(zzgge zzggeVar) {
    }

    public final zzggf zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzggf zzb(zzgul zzgulVar) {
        this.zzb = zzgulVar;
        return this;
    }

    public final zzggf zzc(zzggq zzggqVar) {
        this.zza = zzggqVar;
        return this;
    }

    public final zzggh zzd() throws GeneralSecurityException {
        zzgul zzgulVar;
        zzguk zzb;
        zzggq zzggqVar = this.zza;
        if (zzggqVar == null || (zzgulVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzggqVar.zzb() != zzgulVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzggqVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzc() == zzggo.zzc) {
            zzb = zzguk.zzb(new byte[0]);
        } else if (this.zza.zzc() == zzggo.zzb) {
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzc() != zzggo.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzc()))));
            }
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzggh(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
