package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdab extends zzddv implements zzbit {
    private final Bundle zzb;

    zzdab(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbit
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdaa
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
