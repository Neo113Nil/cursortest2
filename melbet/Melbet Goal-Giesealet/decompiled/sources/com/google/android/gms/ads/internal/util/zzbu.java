package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbu {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbu(long j) {
        this.zza = j;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            if (this.zzb + this.zza > elapsedRealtime) {
                return false;
            }
            this.zzb = elapsedRealtime;
            return true;
        }
    }

    public final void zzb(long j) {
        synchronized (this.zzc) {
            this.zza = j;
        }
    }
}
