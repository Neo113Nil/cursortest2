package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcuz implements zzdbz {
    private final zzcjl zza;
    private final zzdxz zzb;
    private final zzfir zzc;

    zzcuz(zzcjl zzcjlVar, zzdxz zzdxzVar, zzfir zzfirVar) {
        this.zza = zzcjlVar;
        this.zzb = zzdxzVar;
        this.zzc = zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        zzcjl zzcjlVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzos)).booleanValue() || (zzcjlVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzcjlVar.zzE()) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES;
        zzdxy zza = this.zzb.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(this.zzc);
        zza.zzd();
    }
}
