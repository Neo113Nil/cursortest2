package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzhjw implements zzhjb {
    static final /* synthetic */ zzhjw zza = new zzhjw();

    private /* synthetic */ zzhjw() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjb
    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
        int i = zzhjx.zza;
        zzhqf zzc = ((zzhjp) zzhbpVar).zzb().zzc();
        zzhba zzd = zzhjc.zza().zzd(zzc.zza());
        if (!zzhjc.zza().zze(zzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhqc zzd2 = zzd.zzd(zzc.zzb());
        return new zzhjo(zzhlb.zza(zzd2.zza(), zzd2.zzb(), zzd2.zzc(), zzc.zzc(), num), zzhax.zza());
    }
}
