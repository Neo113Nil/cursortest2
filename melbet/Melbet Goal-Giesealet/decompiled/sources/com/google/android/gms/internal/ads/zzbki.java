package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbki extends zzbkk {
    private final OnH5AdsEventListener zza;

    public zzbki(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
