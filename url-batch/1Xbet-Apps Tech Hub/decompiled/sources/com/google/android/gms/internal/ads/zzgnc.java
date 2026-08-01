package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgnc {

    @Nullable
    private zzgnq zza = null;

    @Nullable
    private zzgul zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgnc() {
    }

    /* synthetic */ zzgnc(zzgnb zzgnbVar) {
    }

    public final zzgnc zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgnc zzb(zzgul zzgulVar) {
        this.zzb = zzgulVar;
        return this;
    }

    public final zzgnc zzc(zzgnq zzgnqVar) {
        this.zza = zzgnqVar;
        return this;
    }

    public final zzgne zzd() throws GeneralSecurityException {
        zzgul zzgulVar;
        zzguk zzb;
        zzgnq zzgnqVar = this.zza;
        if (zzgnqVar == null || (zzgulVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgnqVar.zzc() != zzgulVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgnqVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgno.zzd) {
            zzb = zzguk.zzb(new byte[0]);
        } else if (this.zza.zzg() == zzgno.zzc || this.zza.zzg() == zzgno.zzb) {
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzg() != zzgno.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzg()))));
            }
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgne(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
