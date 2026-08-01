package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdyq implements zzdzo {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdxr zzb;
    private final zzgbl zzc;
    private final zzfeq zzd;
    private final ScheduledExecutorService zze;
    private final zzedm zzf;
    private final zzfkh zzg;
    private final Context zzh;

    zzdyq(Context context, zzfeq zzfeqVar, zzdxr zzdxrVar, zzgbl zzgblVar, ScheduledExecutorService scheduledExecutorService, zzedm zzedmVar, zzfkh zzfkhVar) {
        this.zzh = context;
        this.zzd = zzfeqVar;
        this.zzb = zzdxrVar;
        this.zzc = zzgblVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzedmVar;
        this.zzg = zzfkhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzo
    public final ListenableFuture zzb(zzbwa zzbwaVar) {
        Context context = this.zzh;
        ListenableFuture zzb = this.zzb.zzb(zzbwaVar);
        zzfjw zza2 = zzfjv.zza(context, 11);
        zzfkg.zzd(zzb, zza2);
        ListenableFuture zzn = zzgbb.zzn(zzb, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdyn
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzdyq.this.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfu)).booleanValue()) {
            zzn = zzgbb.zzf(zzgbb.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfw)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdyo
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    return zzgbb.zzg(new zzdxn(5));
                }
            }, zzcca.zzf);
        }
        zzfkg.zza(zzn, this.zzg, zza2);
        zzgbb.zzr(zzn, new zzdyp(this), zzcca.zzf);
        return zzn;
    }

    final /* synthetic */ ListenableFuture zzc(InputStream inputStream) throws Exception {
        return zzgbb.zzh(new zzfeh(new zzfee(this.zzd), zzfeg.zza(new InputStreamReader(inputStream))));
    }
}
