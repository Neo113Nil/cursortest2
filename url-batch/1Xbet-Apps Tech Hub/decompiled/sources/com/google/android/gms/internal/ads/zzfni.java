package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfni {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfnh zzd = null;

    public zzfni() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfnh zzfnhVar = (zzfnh) this.zzc.poll();
        this.zzd = zzfnhVar;
        if (zzfnhVar != null) {
            zzfnhVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfnh zzfnhVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfnh zzfnhVar) {
        zzfnhVar.zzb(this);
        this.zzc.add(zzfnhVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
