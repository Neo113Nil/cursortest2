package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfma {
    private final zzfnm zza;
    private final String zzb;
    private final zzflm zzc;
    private final String zzd = "Ad overlay";

    public zzfma(View view, zzflm zzflmVar, String str) {
        this.zza = new zzfnm(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzflmVar;
    }

    public final zzflm zza() {
        return this.zzc;
    }

    public final zzfnm zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
