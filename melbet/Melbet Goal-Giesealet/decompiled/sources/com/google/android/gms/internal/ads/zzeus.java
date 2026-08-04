package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeus {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfib zzd;
    private final zzdsm zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzeus(Context context, Executor executor, Set set, zzfib zzfibVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfibVar;
        this.zze = zzdsmVar;
    }

    public final ListenableFuture zza(final Object obj, final Bundle bundle, final boolean z) {
        zzfhr zzn = zzfhr.zzn(this.zza, 8);
        zzn.zza();
        Set<zzeup> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbbz zzbbzVar = zzbci.zzmz;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && bundle != null) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (obj instanceof zzcuu) {
                bundle.putLong(zzdru.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(zzdru.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final zzeup zzeupVar : set) {
            if (!arrayList2.contains(String.valueOf(zzeupVar.zzb()))) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                ListenableFuture zza = zzeupVar.zza();
                final Bundle bundle3 = bundle2;
                zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzeus.this.zzb(elapsedRealtime, zzeupVar, bundle3);
                    }
                }, zzbzh.zzg);
                arrayList.add(zza);
                bundle2 = bundle3;
            }
        }
        ListenableFuture zza2 = zzgot.zzo(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeur
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object obj2;
                Bundle bundle4;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzeun zzeunVar = (zzeun) ((ListenableFuture) it.next()).get();
                    if (zzeunVar != null) {
                        boolean z2 = z;
                        zzeunVar.zza(obj2);
                        if (z2) {
                            zzeunVar.zzb(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    if (obj2 instanceof zzcuu) {
                        bundle4.putLong(zzdru.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(zzdru.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfie.zza()) {
            zzfia.zzd(zza2, this.zzd, zzn);
        }
        return zza2;
    }

    final /* synthetic */ void zzb(long j, zzeup zzeupVar, Bundle bundle) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
        if (((Boolean) zzbek.zza.zze()).booleanValue()) {
            String zza = zzghs.zza(zzeupVar.getClass().getCanonicalName());
            StringBuilder sb = new StringBuilder(zza.length() + 25 + String.valueOf(elapsedRealtime).length());
            sb.append("Signal runtime (ms) : ");
            sb.append(zza);
            sb.append(" = ");
            sb.append(elapsedRealtime);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcx)).booleanValue()) {
                synchronized (this) {
                    int zzb = zzeupVar.zzb();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 3);
                    sb2.append("sig");
                    sb2.append(zzb);
                    bundle.putLong(sb2.toString(), elapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcp)).booleanValue()) {
            zzdsl zza2 = this.zze.zza();
            zza2.zzc("action", "lat_ms");
            zza2.zzc("lat_grp", "sig_lat_grp");
            zza2.zzc("lat_id", String.valueOf(zzeupVar.zzb()));
            zza2.zzc("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcq)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza2.zzc("seq_num", com.google.android.gms.ads.internal.zzt.zzh().zzr().zzm());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzf);
                        if (zzeupVar.zzb() <= 39 || zzeupVar.zzb() >= 52) {
                            zza2.zzc("lat_clsg", valueOf);
                        } else {
                            zza2.zzc("lat_gmssg", valueOf);
                        }
                    }
                }
            }
            zza2.zzh();
        }
    }
}
