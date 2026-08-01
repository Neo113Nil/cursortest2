package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcdq {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzD)).longValue());
    private boolean zzc = true;

    zzcdq() {
    }

    public final void zza(SurfaceTexture surfaceTexture, final zzcdb zzcdbVar) {
        if (zzcdbVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdp
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}
