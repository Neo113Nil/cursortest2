package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzedy implements zzefe {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzecz zza;
    private final zzgzy zzb;
    private final zzfjk zzc;
    private final ScheduledExecutorService zzd;
    private final zzehr zze;
    private final zzfoo zzf;
    private final Context zzg;

    zzedy(Context context, zzfjk zzfjkVar, zzecz zzeczVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzehr zzehrVar, zzfoo zzfooVar) {
        this.zzg = context;
        this.zzc = zzfjkVar;
        this.zza = zzeczVar;
        this.zzb = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzehrVar;
        this.zzf = zzfooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefe
    public final ListenableFuture zza(zzbzu zzbzuVar) {
        Context context = this.zzg;
        ListenableFuture zza = this.zza.zza(zzbzuVar);
        zzfoe zzn = zzfoe.zzn(context, 11);
        zzfon.zzb(zza, zzn);
        ListenableFuture zzj = zzgzo.zzj(zza, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzedx
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzedy.this.zzb((zzefg) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgB)).booleanValue()) {
            zzj = zzgzo.zzh(zzgzo.zzi(zzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzedw.zza, zzcei.zzg);
        }
        zzfon.zzd(zzj, this.zzf, zzn);
        zzgzo.zzr(zzj, new zzedv(this), zzcei.zzg);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzb(zzefg zzefgVar) {
        return zzgzo.zza(new zzfjc(new zzfiz(this.zzc), zzfjb.zza(new InputStreamReader(zzefgVar.zza()), zzefgVar.zzb().zzm)));
    }

    final /* synthetic */ zzehr zzc() {
        return this.zze;
    }
}
