package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzand {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzamk zze;
    private final zzamt zzf;
    private final zzamu[] zzg;
    private zzamm zzh;
    private final List zzi;
    private final List zzj;
    private final zzamr zzk;

    public zzand(zzamk zzamkVar, zzamt zzamtVar, int i) {
        zzamr zzamrVar = new zzamr(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzamkVar;
        this.zzf = zzamtVar;
        this.zzg = new zzamu[4];
        this.zzk = zzamrVar;
    }

    public final zzana zza(zzana zzanaVar) {
        zzanaVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzanaVar);
        }
        zzanaVar.zzg(this.zza.incrementAndGet());
        zzanaVar.zzm("add-to-queue");
        zzc(zzanaVar, 0);
        this.zzc.add(zzanaVar);
        return zzanaVar;
    }

    final void zzb(zzana zzanaVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzanaVar);
        }
        synchronized (this.zzi) {
            Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((zzanc) it.next()).zza();
            }
        }
        zzc(zzanaVar, 5);
    }

    final void zzc(zzana zzanaVar, int i) {
        synchronized (this.zzj) {
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzanb) it.next()).zza();
            }
        }
    }

    public final void zzd() {
        zzamm zzammVar = this.zzh;
        if (zzammVar != null) {
            zzammVar.zzb();
        }
        zzamu[] zzamuVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzamu zzamuVar = zzamuVarArr[i];
            if (zzamuVar != null) {
                zzamuVar.zza();
            }
        }
        zzamm zzammVar2 = new zzamm(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzammVar2;
        zzammVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzamu zzamuVar2 = new zzamu(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i2] = zzamuVar2;
            zzamuVar2.start();
        }
    }
}
