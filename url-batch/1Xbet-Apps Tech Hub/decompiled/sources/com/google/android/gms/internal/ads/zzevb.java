package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzevb {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfkh zzd;
    private final zzdtp zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzevb(Context context, Executor executor, Set set, zzfkh zzfkhVar, zzdtp zzdtpVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfkhVar;
        this.zze = zzdtpVar;
    }

    public final ListenableFuture zza(final Object obj) {
        zzfjw zza = zzfjv.zza(this.zza, 8);
        zza.zzh();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkT)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkT)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        for (final zzeuy zzeuyVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzeuyVar.zza()))) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                ListenableFuture zzb = zzeuyVar.zzb();
                zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzevb.this.zzb(elapsedRealtime, zzeuyVar);
                    }
                }, zzcca.zzf);
                arrayList.add(zzb);
            }
        }
        ListenableFuture zza2 = zzgbb.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeva
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = arrayList.iterator();
                while (true) {
                    Object obj2 = obj;
                    if (!it.hasNext()) {
                        return obj2;
                    }
                    zzeux zzeuxVar = (zzeux) ((ListenableFuture) it.next()).get();
                    if (zzeuxVar != null) {
                        zzeuxVar.zzj(obj2);
                    }
                }
            }
        }, this.zzc);
        if (zzfkk.zza()) {
            zzfkg.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j, zzeuy zzeuyVar) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j;
        if (((Boolean) zzbey.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfun.zzc(zzeuyVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbY)).booleanValue()) {
            zzdto zza = this.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzeuyVar.zza()));
            zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbZ)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza.zzb("seq_num", com.google.android.gms.ads.internal.zzt.zzo().zzh().zzd());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzf);
                        if (zzeuyVar.zza() <= 39 || zzeuyVar.zza() >= 52) {
                            zza.zzb("lat_clsg", valueOf);
                        } else {
                            zza.zzb("lat_gmssg", valueOf);
                        }
                    }
                }
            }
            zza.zzh();
        }
    }
}
