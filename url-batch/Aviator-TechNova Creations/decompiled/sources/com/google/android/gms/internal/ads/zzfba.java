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

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfba {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfoo zzd;
    private final zzdxz zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzfba(Context context, Executor executor, Set set, zzfoo zzfooVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfooVar;
        this.zze = zzdxzVar;
    }

    public final ListenableFuture zza(final Object obj, final Bundle bundle, final boolean z) {
        zzfoe zzn = zzfoe.zzn(this.zza, 8);
        zzn.zza();
        Set<zzfax> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbgv zzbgvVar = zzbhe.zznh;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && bundle != null) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (obj instanceof zzdah) {
                bundle.putLong(zzdxh.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(zzdxh.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final zzfax zzfaxVar : set) {
            if (!arrayList2.contains(String.valueOf(zzfaxVar.zzb()))) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                ListenableFuture zza = zzfaxVar.zza();
                final Bundle bundle3 = bundle2;
                zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfay
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfba.this.zzb(elapsedRealtime, zzfaxVar, bundle3);
                    }
                }, zzcei.zzg);
                arrayList.add(zza);
                bundle2 = bundle3;
            }
        }
        ListenableFuture zza2 = zzgzo.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaz
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
                    zzfav zzfavVar = (zzfav) ((ListenableFuture) it.next()).get();
                    if (zzfavVar != null) {
                        boolean z2 = z;
                        zzfavVar.zza(obj2);
                        if (z2) {
                            zzfavVar.zzb(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    if (obj2 instanceof zzdah) {
                        bundle4.putLong(zzdxh.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(zzdxh.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfor.zza()) {
            zzfon.zzd(zza2, this.zzd, zzn);
        }
        return zza2;
    }

    final /* synthetic */ void zzb(long j, zzfax zzfaxVar, Bundle bundle) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
        if (((Boolean) zzbjg.zza.zze()).booleanValue()) {
            String zza = zzgrt.zza(zzfaxVar.getClass().getCanonicalName());
            StringBuilder sb = new StringBuilder(zza.length() + 25 + String.valueOf(elapsedRealtime).length());
            sb.append("Signal runtime (ms) : ");
            sb.append(zza);
            sb.append(" = ");
            sb.append(elapsedRealtime);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcQ)).booleanValue()) {
                synchronized (this) {
                    int zzb = zzfaxVar.zzb();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 3);
                    sb2.append("sig");
                    sb2.append(zzb);
                    bundle.putLong(sb2.toString(), elapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcI)).booleanValue()) {
            zzdxy zza2 = this.zze.zza();
            zza2.zzc("action", "lat_ms");
            zza2.zzc("lat_grp", "sig_lat_grp");
            zza2.zzc("lat_id", String.valueOf(zzfaxVar.zzb()));
            zza2.zzc("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcJ)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza2.zzc("seq_num", com.google.android.gms.ads.internal.zzt.zzh().zzr().zzm());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzf);
                        if (zzfaxVar.zzb() <= 39 || zzfaxVar.zzb() >= 52) {
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
