package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdxp implements zzdyo {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdwq zzb;
    private final zzgcu zzc;
    private final zzffg zzd;
    private final ScheduledExecutorService zze;
    private final zzecd zzf;
    private final zzfkf zzg;
    private final Context zzh;

    zzdxp(Context context, zzffg zzffgVar, zzdwq zzdwqVar, zzgcu zzgcuVar, ScheduledExecutorService scheduledExecutorService, zzecd zzecdVar, zzfkf zzfkfVar) {
        this.zzh = context;
        this.zzd = zzffgVar;
        this.zzb = zzdwqVar;
        this.zzc = zzgcuVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzecdVar;
        this.zzg = zzfkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final ListenableFuture zzb(zzbvb zzbvbVar) {
        Context context = this.zzh;
        ListenableFuture zzc = this.zzb.zzc(zzbvbVar);
        zzfju zza2 = zzfjt.zza(context, 11);
        zzfke.zzd(zzc, zza2);
        ListenableFuture zzn = zzgcj.zzn(zzc, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdxm
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzdxp.this.zzc((zzdyq) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeT)).booleanValue()) {
            zzn = zzgcj.zzf(zzgcj.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeU)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdxn
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final ListenableFuture zza(Object obj) {
                    return zzgcj.zzg(new zzdwl(5));
                }
            }, zzbzo.zzf);
        }
        zzfke.zza(zzn, this.zzg, zza2);
        zzgcj.zzr(zzn, new zzdxo(this), zzbzo.zzf);
        return zzn;
    }

    final /* synthetic */ ListenableFuture zzc(zzdyq zzdyqVar) throws Exception {
        return zzgcj.zzh(new zzfex(new zzfeu(this.zzd), zzfew.zza(new InputStreamReader(zzdyqVar.zzb()), zzdyqVar.zza())));
    }
}
