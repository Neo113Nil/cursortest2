package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeln implements com.google.android.gms.ads.internal.zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcyf zzb;
    private final zzcyz zzc;
    private final zzdgg zzd;
    private final zzdfy zze;
    private final zzcql zzf;

    zzeln(zzcyf zzcyfVar, zzcyz zzcyzVar, zzdgg zzdggVar, zzdfy zzdfyVar, zzcql zzcqlVar) {
        this.zzb = zzcyfVar;
        this.zzc = zzcyzVar;
        this.zzd = zzdggVar;
        this.zze = zzdfyVar;
        this.zzf = zzcqlVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzq();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
