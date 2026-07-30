package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzezv implements zzfav {
    private final String zza;
    private final int zzb;

    public zzezv(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.zza);
        if (this.zzb == 2) {
            bundle.putInt("sod", 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzdah) obj).zzb.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.zza);
    }
}
