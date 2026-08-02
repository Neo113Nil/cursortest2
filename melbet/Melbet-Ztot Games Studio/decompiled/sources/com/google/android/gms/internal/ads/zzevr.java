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

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzevr {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfkf zzd;
    private final zzdsk zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzevr(Context context, Executor executor, Set set, zzfkf zzfkfVar, zzdsk zzdskVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfkfVar;
        this.zze = zzdskVar;
    }

    public final ListenableFuture zza(final Object obj, final Bundle bundle) {
        zzfju zza = zzfjt.zza(this.zza, 8);
        zza.zzi();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkQ)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkQ)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbS)).booleanValue() && bundle != null) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdrt.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(zzdrt.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final zzevo zzevoVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzevoVar.zza()))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfo)).booleanValue() || zzevoVar.zza() != 44) {
                    final long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                    ListenableFuture zzb = zzevoVar.zzb();
                    zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevp
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzevr.this.zzb(elapsedRealtime, zzevoVar, bundle2);
                        }
                    }, zzbzo.zzf);
                    arrayList.add(zzb);
                }
            }
        }
        ListenableFuture zza2 = zzgcj.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzevn zzevnVar = (zzevn) ((ListenableFuture) it.next()).get();
                    if (zzevnVar != null) {
                        zzevnVar.zzj(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbS)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdrt.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdrt.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfki.zza()) {
            zzfke.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j, zzevo zzevoVar, Bundle bundle) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j;
        if (((Boolean) zzbdu.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfvj.zzc(zzevoVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbS)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbT)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzevoVar.zza(), elapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbQ)).booleanValue()) {
            zzdsj zza = this.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzevoVar.zza()));
            zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbR)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza.zzb("seq_num", com.google.android.gms.ads.internal.zzu.zzo().zzh().zzd());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzf);
                        if (zzevoVar.zza() <= 39 || zzevoVar.zza() >= 52) {
                            zza.zzb("lat_clsg", valueOf);
                        } else {
                            zza.zzb("lat_gmssg", valueOf);
                        }
                    }
                }
            }
            zza.zzg();
        }
    }
}
