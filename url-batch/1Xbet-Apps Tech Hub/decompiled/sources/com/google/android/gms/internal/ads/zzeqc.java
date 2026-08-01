package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeqc implements zzeuy {
    final zzcaw zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgbl zzd;
    private final Context zze;

    zzeqc(Context context, zzcaw zzcawVar, ScheduledExecutorService scheduledExecutorService, zzgbl zzgblVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcE)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcawVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcA)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcF)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcB)).booleanValue()) {
                    return zzgbb.zzm(zzfrd.zza(this.zzb.getAppSetIdInfo(), null), new zzftn() { // from class: com.google.android.gms.internal.ads.zzepz
                        @Override // com.google.android.gms.internal.ads.zzftn
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzeqd(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, zzcca.zzf);
                }
                Task<AppSetIdInfo> zza = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcE)).booleanValue() ? zzffu.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (zza == null) {
                    return zzgbb.zzh(new zzeqd(null, -1));
                }
                ListenableFuture zzn = zzgbb.zzn(zzfrd.zza(zza, null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzeqa
                    @Override // com.google.android.gms.internal.ads.zzgai
                    public final ListenableFuture zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgbb.zzh(new zzeqd(null, -1)) : zzgbb.zzh(new zzeqd(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzcca.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcC)).booleanValue()) {
                    zzn = zzgbb.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcD)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgbb.zze(zzn, Exception.class, new zzftn() { // from class: com.google.android.gms.internal.ads.zzeqb
                    @Override // com.google.android.gms.internal.ads.zzftn
                    public final Object apply(Object obj) {
                        zzeqc.this.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeqd(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgbb.zzh(new zzeqd(null, -1));
    }
}
