package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzezj implements zzfax {
    private final zzfax zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzezj(zzfax zzfaxVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfaxVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        ListenableFuture zza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcV)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            zza = zzgzo.zzi(zza, j, timeUnit, this.zzc);
        }
        return zzgzo.zzh(zza, Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzezi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzezj.this.zzc((Throwable) obj);
            }
        }, zzcei.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return this.zza.zzb();
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcT)).booleanValue()) {
            zzfax zzfaxVar = this.zza;
            zzcdu zzh = com.google.android.gms.ads.internal.zzt.zzh();
            int zzb = zzfaxVar.zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(zzb);
            zzh.zzg(th, sb.toString());
        }
        return zzgzo.zza(null);
    }
}
