package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzexa implements zzeuy {
    private final Context zza;
    private final zzcaw zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzcan zzf;

    public zzexa(zzcan zzcanVar, int i, Context context, zzcaw zzcawVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zzf = zzcanVar;
        this.zza = context;
        this.zzb = zzcawVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return zzgbb.zze((zzgas) zzgbb.zzo(zzgbb.zzm(zzgas.zzu(zzgbb.zzk(new zzgah() { // from class: com.google.android.gms.internal.ads.zzewx
            @Override // com.google.android.gms.internal.ads.zzgah
            public final ListenableFuture zza() {
                return zzgbb.zzh(null);
            }
        }, this.zzd)), new zzftn() { // from class: com.google.android.gms.internal.ads.zzewy
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzexb(str);
            }
        }, this.zzd), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaU)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzftn() { // from class: com.google.android.gms.internal.ads.zzewz
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                zzexa.this.zzc((Exception) obj);
                return null;
            }
        }, zzgbr.zzb());
    }

    final /* synthetic */ zzexb zzc(Exception exc) {
        this.zzb.zzw(exc, "AttestationTokenSignal");
        return null;
    }
}
