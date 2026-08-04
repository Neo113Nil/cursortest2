package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzeob implements zzggr {
    static final /* synthetic */ zzeob zza = new zzeob();

    private /* synthetic */ zzeob() {
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final /* synthetic */ Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzeod(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
