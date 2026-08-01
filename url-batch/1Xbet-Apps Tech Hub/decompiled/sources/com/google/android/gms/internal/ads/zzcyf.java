package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcyf extends zzddv implements com.google.android.gms.ads.internal.client.zza {
    public zzcyf(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzcye
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
