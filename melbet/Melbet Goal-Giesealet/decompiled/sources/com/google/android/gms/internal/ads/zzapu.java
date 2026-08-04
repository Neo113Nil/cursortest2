package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzapu implements zzapg {
    private final Map zza = new HashMap();
    private final zzaot zzb;
    private final BlockingQueue zzc;
    private final zzaoy zzd;

    zzapu(zzaot zzaotVar, BlockingQueue blockingQueue, zzaoy zzaoyVar) {
        this.zzd = zzaoyVar;
        this.zzb = zzaotVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zza(zzaph zzaphVar, zzapn zzapnVar) {
        List list;
        zzaoq zzaoqVar = zzapnVar.zzb;
        if (zzaoqVar == null || zzaoqVar.zza(System.currentTimeMillis())) {
            zzb(zzaphVar);
            return;
        }
        String zzi = zzaphVar.zzi();
        synchronized (this) {
            list = (List) this.zza.remove(zzi);
        }
        if (list != null) {
            if (zzapt.zzb) {
                zzapt.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzi);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((zzaph) it.next(), zzapnVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final synchronized void zzb(zzaph zzaphVar) {
        Map map = this.zza;
        String zzi = zzaphVar.zzi();
        List list = (List) map.remove(zzi);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzapt.zzb) {
            zzapt.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzi);
        }
        zzaph zzaphVar2 = (zzaph) list.remove(0);
        map.put(zzi, list);
        zzaphVar2.zzu(this);
        try {
            this.zzc.put(zzaphVar2);
        } catch (InterruptedException e) {
            zzapt.zzc("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zza();
        }
    }

    final synchronized boolean zzc(zzaph zzaphVar) {
        Map map = this.zza;
        String zzi = zzaphVar.zzi();
        if (!map.containsKey(zzi)) {
            map.put(zzi, null);
            zzaphVar.zzu(this);
            if (zzapt.zzb) {
                zzapt.zzb("new request, sending to network %s", zzi);
            }
            return false;
        }
        List list = (List) map.get(zzi);
        if (list == null) {
            list = new ArrayList();
        }
        zzaphVar.zzc("waiting-for-response");
        list.add(zzaphVar);
        map.put(zzi, list);
        if (zzapt.zzb) {
            zzapt.zzb("Request for cacheKey=%s is in flight, putting on hold.", zzi);
        }
        return true;
    }
}
