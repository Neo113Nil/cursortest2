package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcdy implements Runnable {
    private final zzcdk zza;
    private boolean zzb = false;

    zzcdy(zzcdk zzcdkVar) {
        this.zza = zzcdkVar;
    }

    private final void zzc() {
        com.google.android.gms.ads.internal.util.zzt.zza.removeCallbacks(this);
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
