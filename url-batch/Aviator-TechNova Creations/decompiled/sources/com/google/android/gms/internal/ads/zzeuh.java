package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzeuh implements zzgyw {
    static final /* synthetic */ zzeuh zza = new zzeuh();

    private /* synthetic */ zzeuh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgzo.zza(new zzeul(null, -1)) : zzgzo.zza(new zzeul(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
