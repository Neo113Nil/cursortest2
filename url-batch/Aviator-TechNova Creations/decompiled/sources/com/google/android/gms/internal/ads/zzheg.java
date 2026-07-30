package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzheg implements zzhkt {
    static final /* synthetic */ zzheg zza = new zzheg();

    private /* synthetic */ zzheg() {
    }

    @Override // com.google.android.gms.internal.ads.zzhkt
    public final /* synthetic */ Object zza(zzhaz zzhazVar) {
        zzher zzherVar = (zzher) zzhazVar;
        int i = zzhei.zza;
        String zzb = zzherVar.zze().zzb();
        zzhch zzd = zzherVar.zze().zzd();
        zzhas zzb2 = zzhbn.zza(zzb).zzb();
        int i2 = zzhef.zza;
        try {
            return zzhhj.zzc(new zzhef(zzhqf.zzd(zzhbv.zza(zzd), zzibb.zza()), zzb2), zzherVar.zzc());
        } catch (zzicg e) {
            throw new GeneralSecurityException(e);
        }
    }
}
