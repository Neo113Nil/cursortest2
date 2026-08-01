package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgea {

    @Nullable
    private zzgem zza = null;

    @Nullable
    private zzgul zzb = null;

    @Nullable
    private zzgul zzc = null;

    @Nullable
    private Integer zzd = null;

    private zzgea() {
    }

    /* synthetic */ zzgea(zzgdz zzgdzVar) {
    }

    public final zzgea zza(zzgul zzgulVar) {
        this.zzb = zzgulVar;
        return this;
    }

    public final zzgea zzb(zzgul zzgulVar) {
        this.zzc = zzgulVar;
        return this;
    }

    public final zzgea zzc(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgea zzd(zzgem zzgemVar) {
        this.zza = zzgemVar;
        return this;
    }

    public final zzgec zze() throws GeneralSecurityException {
        zzguk zzb;
        zzgem zzgemVar = this.zza;
        if (zzgemVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgul zzgulVar = this.zzb;
        if (zzgulVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzgemVar.zzb() != zzgulVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzgemVar.zzc() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgek.zzc) {
            zzb = zzguk.zzb(new byte[0]);
        } else if (this.zza.zzg() == zzgek.zzb) {
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
        } else {
            if (this.zza.zzg() != zzgek.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzg()))));
            }
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
        }
        return new zzgec(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
    }
}
