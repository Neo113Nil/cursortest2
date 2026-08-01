package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdyl {
    private final ScheduledExecutorService zza;
    private final zzgbl zzb;
    private final zzgbl zzc;
    private final zzdzc zzd;
    private final zzhdj zze;

    public zzdyl(ScheduledExecutorService scheduledExecutorService, zzgbl zzgblVar, zzgbl zzgblVar2, zzdzc zzdzcVar, zzhdj zzhdjVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgblVar;
        this.zzc = zzgblVar2;
        this.zzd = zzdzcVar;
        this.zze = zzhdjVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbwa zzbwaVar, int i, Throwable th) throws Exception {
        return ((zzebw) this.zze.zzb()).zzd(zzbwaVar, i);
    }

    public final ListenableFuture zzb(final zzbwa zzbwaVar) {
        ListenableFuture zzb;
        String str = zzbwaVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            zzb = zzgbb.zzg(new zzdzp(1));
        } else {
            zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhA)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdyl.this.zzc(zzbwaVar);
                }
            }) : this.zzd.zzb(zzbwaVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgbb.zzf((zzgas) zzgbb.zzo(zzgas.zzu(zzb), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfw)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdyk
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzdyl.this.zza(zzbwaVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzc(zzbwa zzbwaVar) throws Exception {
        return (InputStream) this.zzd.zzb(zzbwaVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfw)).intValue(), TimeUnit.SECONDS);
    }
}
