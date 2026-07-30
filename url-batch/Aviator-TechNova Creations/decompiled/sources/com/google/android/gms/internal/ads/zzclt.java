package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzclt {
    private final zzclk zza;
    private final zzdxz zzb;

    zzclt(zzclk zzclkVar, zzdxz zzdxzVar) {
        this.zza = zzclkVar;
        this.zzb = zzdxzVar;
    }

    public final void zza(final Context context, final VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpr)).booleanValue()) {
            Executor executor = zzcei.zza;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpt)).booleanValue()) {
                zzcls zzclsVar = new zzcls(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpv)).intValue(), null);
                int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpu)).intValue();
                executor = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzclsVar);
            }
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclt.this.zzb(context, versionInfoParcel);
                }
            });
        }
    }

    final /* synthetic */ void zzb(Context context, VersionInfoParcel versionInfoParcel) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzps)).booleanValue()) {
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            zzdxy zza = this.zzb.zza();
            zza.zzc("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length());
            sb.append(elapsedRealtime2);
            zza.zzc("webview_startup_l", sb.toString());
            zza.zzd();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpy)).booleanValue()) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclt.this.zzc();
                }
            });
        }
    }

    final /* synthetic */ void zzc() {
        this.zza.zzb(new zzclo(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    final /* synthetic */ zzdxz zzd() {
        return this.zzb;
    }
}
