package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbks;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class H5AdsRequestHandler {
    private final zzbks zza;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbks(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zzb();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.zza.zza(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return zzbks.zzc(str);
    }
}
