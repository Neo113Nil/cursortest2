package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfjh implements zzfje {
    private final zzfje zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziy)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfjh(zzfje zzfjeVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfjeVar;
        long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzix)).intValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkW)).booleanValue()) {
            scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjg
                @Override // java.lang.Runnable
                public final void run() {
                    zzfjh.zzc(zzfjh.this);
                }
            }, intValue, intValue, TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjg
                @Override // java.lang.Runnable
                public final void run() {
                    zzfjh.zzc(zzfjh.this);
                }
            }, intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void zzc(zzfjh zzfjhVar) {
        while (!zzfjhVar.zzb.isEmpty()) {
            zzfjhVar.zza.zzb((zzfjd) zzfjhVar.zzb.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfje
    public final String zza(zzfjd zzfjdVar) {
        return this.zza.zza(zzfjdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfje
    public final void zzb(zzfjd zzfjdVar) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfjdVar);
            return;
        }
        if (this.zzd.getAndSet(true)) {
            return;
        }
        Queue queue = this.zzb;
        zzfjd zzb = zzfjd.zzb("dropped_event");
        Map zzj = zzfjdVar.zzj();
        if (zzj.containsKey("action")) {
            zzb.zza("dropped_action", (String) zzj.get("action"));
        }
        queue.offer(zzb);
    }
}
