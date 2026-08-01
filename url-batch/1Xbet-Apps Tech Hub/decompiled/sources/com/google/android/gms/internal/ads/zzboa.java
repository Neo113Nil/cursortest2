package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzboa extends zzccm {
    private final Object zza = new Object();
    private final zzbof zzb;
    private boolean zzc;

    public zzboa(zzbof zzbofVar) {
        this.zzb = zzbofVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzi(new zzbnx(this), new zzcci());
            zzi(new zzbny(this), new zzbnz(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }
}
