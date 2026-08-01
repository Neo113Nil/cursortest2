package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgkg extends zzgcp {
    private final zzglo zza;

    public zzgkg(zzglo zzgloVar, @Nullable zzgdp zzgdpVar) throws GeneralSecurityException {
        zzc(zzgloVar, zzgdpVar);
        this.zza = zzgloVar;
    }

    private static void zzc(zzglo zzgloVar, @Nullable zzgdp zzgdpVar) throws GeneralSecurityException {
        int i = zzgkf.zzb[zzgloVar.zzb().ordinal()];
    }

    public final zzglo zza(@Nullable zzgdp zzgdpVar) throws GeneralSecurityException {
        zzc(this.zza, zzgdpVar);
        return this.zza;
    }

    @Nullable
    public final Integer zzb() {
        return this.zza.zzf();
    }
}
