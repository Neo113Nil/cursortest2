package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzejp {
    private final Clock zza;
    private final zzejr zzb;
    private final zzfla zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgR)).booleanValue();
    private final zzega zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzejp(Clock clock, zzejr zzejrVar, zzega zzegaVar, zzfla zzflaVar) {
        this.zza = clock;
        this.zzb = zzejrVar;
        this.zzf = zzegaVar;
        this.zzc = zzflaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfdu zzfduVar) {
        zzejo zzejoVar = (zzejo) this.zzd.get(zzfduVar);
        if (zzejoVar == null) {
            return false;
        }
        return zzejoVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    final synchronized ListenableFuture zzf(zzfeh zzfehVar, zzfdu zzfduVar, ListenableFuture listenableFuture, zzfkw zzfkwVar) {
        zzfdy zzfdyVar = zzfehVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfduVar.zzx;
        if (str != null) {
            this.zzd.put(zzfduVar, new zzejo(str, zzfduVar.zzag, 7, 0L, null));
            zzgbb.zzr(listenableFuture, new zzejn(this, elapsedRealtime, zzfdyVar, zzfduVar, str, zzfkwVar, zzfehVar), zzcca.zzf);
        }
        return listenableFuture;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzejo zzejoVar = (zzejo) ((Map.Entry) it.next()).getValue();
            if (zzejoVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzejoVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzfdu zzfduVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfduVar != null) {
            this.zzf.zze(zzfduVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfdu zzfduVar = (zzfdu) it.next();
            if (!TextUtils.isEmpty(zzfduVar.zzx)) {
                this.zzd.put(zzfduVar, new zzejo(zzfduVar.zzx, zzfduVar.zzag, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzm(zzfdu zzfduVar) {
        zzejo zzejoVar = (zzejo) this.zzd.get(zzfduVar);
        if (zzejoVar == null || this.zzg) {
            return;
        }
        zzejoVar.zzc = 8;
    }
}
