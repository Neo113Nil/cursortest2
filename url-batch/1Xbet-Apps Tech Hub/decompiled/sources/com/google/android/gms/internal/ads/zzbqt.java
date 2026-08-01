package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbqt extends zzbpz {
    private final MediationInterscrollerAd zza;

    public zzbqt(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zza = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final IObjectWrapper zze() {
        return ObjectWrapper.wrap(this.zza.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final boolean zzf() {
        return this.zza.shouldDelegateInterscrollerEffect();
    }
}
