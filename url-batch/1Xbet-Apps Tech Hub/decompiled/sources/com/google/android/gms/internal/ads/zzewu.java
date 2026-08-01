package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzewu implements zzeuy {
    private final zzcaw zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzgbl zzd;
    private final zzaxs zze;

    zzewu(String str, zzaxs zzaxsVar, zzcaw zzcawVar, ScheduledExecutorService scheduledExecutorService, zzgbl zzgblVar) {
        this.zzb = str;
        this.zze = zzaxsVar;
        this.zza = zzcawVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcA)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcF)).booleanValue()) {
                ListenableFuture zzn = zzgbb.zzn(zzfrd.zza(Tasks.forResult(null), null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzews
                    @Override // com.google.android.gms.internal.ads.zzgai
                    public final ListenableFuture zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgbb.zzh(new zzewv(null, -1)) : zzgbb.zzh(new zzewv(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbek.zza.zze()).booleanValue()) {
                    zzn = zzgbb.zzo(zzn, ((Long) zzbek.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgbb.zze(zzn, Exception.class, new zzftn() { // from class: com.google.android.gms.internal.ads.zzewt
                    @Override // com.google.android.gms.internal.ads.zzftn
                    public final Object apply(Object obj) {
                        return zzewu.this.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzgbb.zzh(new zzewv(null, -1));
    }

    final /* synthetic */ zzewv zzc(Exception exc) {
        this.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzewv(null, -1);
    }
}
