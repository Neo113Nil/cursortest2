package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzeuj implements zzgqt {
    static final /* synthetic */ zzeuj zza = new zzeuj();

    private /* synthetic */ zzeuj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzeul(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
