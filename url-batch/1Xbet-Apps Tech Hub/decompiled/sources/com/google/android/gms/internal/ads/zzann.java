package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzann implements zzamz {
    private final Map zza = new HashMap();
    private final zzamm zzb;
    private final BlockingQueue zzc;
    private final zzamr zzd;

    zzann(zzamm zzammVar, BlockingQueue blockingQueue, zzamr zzamrVar) {
        this.zzd = zzamrVar;
        this.zzb = zzammVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zza(zzana zzanaVar) {
        Map map = this.zza;
        String zzj = zzanaVar.zzj();
        List list = (List) map.remove(zzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzanm.zzb) {
            zzanm.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
        }
        zzana zzanaVar2 = (zzana) list.remove(0);
        this.zza.put(zzj, list);
        zzanaVar2.zzu(this);
        try {
            this.zzc.put(zzanaVar2);
        } catch (InterruptedException e) {
            zzanm.zzb("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzana zzanaVar, zzang zzangVar) {
        List list;
        zzamj zzamjVar = zzangVar.zzb;
        if (zzamjVar == null || zzamjVar.zza(System.currentTimeMillis())) {
            zza(zzanaVar);
            return;
        }
        String zzj = zzanaVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(zzj);
        }
        if (list != null) {
            if (zzanm.zzb) {
                zzanm.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzana) it.next(), zzangVar, null);
            }
        }
    }

    final synchronized boolean zzc(zzana zzanaVar) {
        Map map = this.zza;
        String zzj = zzanaVar.zzj();
        if (!map.containsKey(zzj)) {
            this.zza.put(zzj, null);
            zzanaVar.zzu(this);
            if (zzanm.zzb) {
                zzanm.zza("new request, sending to network %s", zzj);
            }
            return false;
        }
        List list = (List) this.zza.get(zzj);
        if (list == null) {
            list = new ArrayList();
        }
        zzanaVar.zzm("waiting-for-response");
        list.add(zzanaVar);
        this.zza.put(zzj, list);
        if (zzanm.zzb) {
            zzanm.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
        }
        return true;
    }
}
