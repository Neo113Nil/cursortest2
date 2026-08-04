package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzgtf implements zzgzb {
    static final /* synthetic */ zzgtf zza = new zzgtf();

    private /* synthetic */ zzgtf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    public final /* synthetic */ Object zza(zzgqd zzgqdVar) {
        zzgtq zzgtqVar = (zzgtq) zzgqdVar;
        int i = zzgth.zza;
        String zzb = zzgtqVar.zzd().zzb();
        zzgrg zzd = zzgtqVar.zzd().zzd();
        zzgpx zzb2 = zzgqq.zza(zzb).zzb();
        int i2 = zzgte.zza;
        try {
            return zzgwj.zzc(new zzgte(zzhdw.zzd(zzgqu.zza(zzd), zzhhr.zza()), zzb2), zzgtqVar.zzb());
        } catch (zzhiw e) {
            throw new GeneralSecurityException(e);
        }
    }
}
