package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaml implements Runnable {
    final /* synthetic */ zzana zza;
    final /* synthetic */ zzamm zzb;

    zzaml(zzamm zzammVar, zzana zzanaVar) {
        this.zzb = zzammVar;
        this.zza = zzanaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
