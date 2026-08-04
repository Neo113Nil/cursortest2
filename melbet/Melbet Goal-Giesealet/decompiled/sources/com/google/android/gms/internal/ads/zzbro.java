package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbro implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbrp zzb;

    zzbro(zzbrp zzbrpVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        Objects.requireNonNull(zzbrpVar);
        this.zzb = zzbrpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzb.zza(), this.zza, true, null);
    }
}
