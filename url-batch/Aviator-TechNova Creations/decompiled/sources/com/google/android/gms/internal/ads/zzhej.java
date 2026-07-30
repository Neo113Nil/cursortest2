package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhej extends zzhcg {
    private final zzhel zza;
    private final zzhye zzb;

    @Nullable
    private final Integer zzc;

    private zzhej(zzhel zzhelVar, zzhye zzhyeVar, @Nullable Integer num) {
        this.zza = zzhelVar;
        this.zzb = zzhyeVar;
        this.zzc = num;
    }

    public static zzhej zzd(zzhel zzhelVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhye zza;
        if (zzhelVar.zzd() == zzhek.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zza = zzhye.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzhelVar.zzd() != zzhek.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzhelVar.zzd().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zza = zzhye.zza(new byte[0]);
        }
        return new zzhej(zzhelVar, zza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final zzhye zzc() {
        return this.zzb;
    }

    public final zzhel zze() {
        return this.zza;
    }
}
