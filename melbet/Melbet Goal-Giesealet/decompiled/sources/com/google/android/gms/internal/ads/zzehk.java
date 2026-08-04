package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzehk {
    private final Clock zza;
    private final zzehm zzb;
    private final zzfjv zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhk)).booleanValue();
    private final zzeee zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzehk(Clock clock, zzehm zzehmVar, zzeee zzeeeVar, zzfjv zzfjvVar) {
        this.zza = clock;
        this.zzb = zzehmVar;
        this.zzf = zzeeeVar;
        this.zzc = zzfjvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(zzfcj zzfcjVar) {
        zzehj zzehjVar = (zzehj) this.zzd.get(zzfcjVar);
        if (zzehjVar == null) {
            return false;
        }
        return zzehjVar.zzc == 8;
    }

    public final synchronized void zza() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzb() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzc(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfcj zzfcjVar = (zzfcj) it.next();
            String str = zzfcjVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfcjVar, new zzehj(str, zzfcjVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzd(zzfcj zzfcjVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfcjVar != null) {
            this.zzf.zzi(zzfcjVar);
        }
        this.zzg = true;
    }

    final synchronized ListenableFuture zze(zzfcu zzfcuVar, zzfcj zzfcjVar, ListenableFuture listenableFuture, zzfjr zzfjrVar) {
        zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfcjVar.zzw;
        if (str != null) {
            this.zzd.put(zzfcjVar, new zzehj(str, zzfcjVar.zzaf, 9, 0L, null));
            zzgot.zzq(listenableFuture, new zzehi(this, elapsedRealtime, zzfcmVar, zzfcjVar, str, zzfjrVar, zzfcuVar), zzbzh.zzg);
        }
        return listenableFuture;
    }

    public final synchronized void zzf(zzfcj zzfcjVar) {
        zzehj zzehjVar = (zzehj) this.zzd.get(zzfcjVar);
        if (zzehjVar == null || this.zzg) {
            return;
        }
        zzehjVar.zzc = 8;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzehj zzehjVar = (zzehj) ((Map.Entry) it.next()).getValue();
            if (zzehjVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzehjVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    final /* synthetic */ Clock zzj() {
        return this.zza;
    }

    final /* synthetic */ zzehm zzk() {
        return this.zzb;
    }

    final /* synthetic */ zzfjv zzl() {
        return this.zzc;
    }

    final /* synthetic */ LinkedHashMap zzm() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    final /* synthetic */ zzeee zzo() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzp() {
        return this.zzg;
    }
}
