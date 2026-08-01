package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgmf {

    @Nullable
    private zzgmr zza = null;

    @Nullable
    private zzgul zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgmf() {
    }

    /* synthetic */ zzgmf(zzgme zzgmeVar) {
    }

    public final zzgmf zza(zzgul zzgulVar) throws GeneralSecurityException {
        this.zzb = zzgulVar;
        return this;
    }

    public final zzgmf zzb(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgmf zzc(zzgmr zzgmrVar) {
        this.zza = zzgmrVar;
        return this;
    }

    public final zzgmh zzd() throws GeneralSecurityException {
        zzgul zzgulVar;
        zzguk zzb;
        zzgmr zzgmrVar = this.zza;
        if (zzgmrVar == null || (zzgulVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgmrVar.zzc() != zzgulVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgmrVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzgmp.zzd) {
            zzb = zzguk.zzb(new byte[0]);
        } else if (this.zza.zze() == zzgmp.zzc || this.zza.zze() == zzgmp.zzb) {
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zze() != zzgmp.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zze()))));
            }
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgmh(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
