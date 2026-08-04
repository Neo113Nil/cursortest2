package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhao {

    @Nullable
    private Integer zza = null;

    @Nullable
    private Integer zzb = null;
    private zzhap zzc = null;
    private zzhaq zzd = zzhaq.zzd;

    private zzhao() {
    }

    /* synthetic */ zzhao(byte[] bArr) {
    }

    public final zzhao zza(int i) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhao zzb(int i) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzhao zzc(zzhaq zzhaqVar) {
        this.zzd = zzhaqVar;
        return this;
    }

    public final zzhao zzd(zzhap zzhapVar) {
        this.zzc = zzhapVar;
        return this;
    }

    public final zzhar zze() throws GeneralSecurityException {
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
        zzhap zzhapVar = this.zzc;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
        }
        if (zzhapVar == zzhap.zza) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
            }
        } else if (zzhapVar == zzhap.zzb) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
            }
        } else if (zzhapVar == zzhap.zzc) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
            }
        } else if (zzhapVar == zzhap.zzd) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
            }
        } else {
            if (zzhapVar != zzhap.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
            }
        }
        return new zzhar(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
    }
}
