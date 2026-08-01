package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgew {

    @Nullable
    private zzgfg zza = null;

    @Nullable
    private zzgul zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgew() {
    }

    /* synthetic */ zzgew(zzgev zzgevVar) {
    }

    public final zzgew zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgew zzb(zzgul zzgulVar) {
        this.zzb = zzgulVar;
        return this;
    }

    public final zzgew zzc(zzgfg zzgfgVar) {
        this.zza = zzgfgVar;
        return this;
    }

    public final zzgey zzd() throws GeneralSecurityException {
        zzgul zzgulVar;
        zzguk zzb;
        zzgfg zzgfgVar = this.zza;
        if (zzgfgVar == null || (zzgulVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgfgVar.zzc() != zzgulVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgfgVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgfe.zzc) {
            zzb = zzguk.zzb(new byte[0]);
        } else if (this.zza.zzd() == zzgfe.zzb) {
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzd() != zzgfe.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
            }
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgey(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
