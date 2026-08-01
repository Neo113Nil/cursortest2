package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgnm {

    @Nullable
    private Integer zza;

    @Nullable
    private Integer zzb;
    private zzgnn zzc;
    private zzgno zzd;

    private zzgnm() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* synthetic */ zzgnm(zzgnl zzgnlVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgno.zzd;
    }

    public final zzgnm zza(zzgnn zzgnnVar) {
        this.zzc = zzgnnVar;
        return this;
    }

    public final zzgnm zzb(int i) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgnm zzc(int i) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzgnm zzd(zzgno zzgnoVar) {
        this.zzd = zzgnoVar;
        return this;
    }

    public final zzgnq zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
        }
        int intValue = this.zzb.intValue();
        zzgnn zzgnnVar = this.zzc;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
        }
        if (zzgnnVar == zzgnn.zza) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
            }
        } else if (zzgnnVar == zzgnn.zzb) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
            }
        } else if (zzgnnVar == zzgnn.zzc) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
            }
        } else if (zzgnnVar == zzgnn.zzd) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
            }
        } else {
            if (zzgnnVar != zzgnn.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
            }
        }
        return new zzgnq(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
    }
}
