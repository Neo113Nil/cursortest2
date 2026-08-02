package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzcni {
    zzbts zza;
    zzbts zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzeep zze;
    private final zzdpq zzf;
    private final zzgcu zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzcni(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzeep zzeepVar, zzdpq zzdpqVar, zzgcu zzgcuVar, zzgcu zzgcuVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzeepVar;
        this.zzf = zzdpqVar;
        this.zzg = zzgcuVar;
        this.zzh = zzgcuVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjn));
    }

    private final ListenableFuture zzk(final String str, @Nullable final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjn)) || this.zzd.zzS()) {
                return zzgcj.zzh(str);
            }
            final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjo), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return zzgcj.zzf(zzgcj.zzn(zzgca.zzu(this.zze.zza()), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcnc
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final ListenableFuture zza(Object obj) {
                        return zzcni.this.zzd(buildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcnd
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final ListenableFuture zza(Object obj) {
                        return zzcni.this.zze(buildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjp), "11");
            return zzgcj.zzh(buildUpon.toString());
        } catch (Exception e) {
            return zzgcj.zzg(e);
        }
    }

    public final ListenableFuture zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgcj.zzh(str) : zzgcj.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcmz
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzcni.this.zzc(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    final /* synthetic */ ListenableFuture zzc(String str, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnb
            @Override // java.lang.Runnable
            public final void run() {
                zzcni.this.zzg(th);
            }
        });
        return zzgcj.zzh(str);
    }

    final /* synthetic */ ListenableFuture zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjp), "10");
            return zzgcj.zzh(builder.toString());
        }
        Uri.Builder buildUpon = builder.build().buildUpon();
        buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjq), "1");
        buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjp), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjr))) {
            buildUpon.authority((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjs));
        }
        return zzgcj.zzn(zzgca.zzu(this.zze.zzb(buildUpon.build(), inputEvent)), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcne
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjp);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgcj.zzh(builder2.toString());
            }
        }, this.zzh);
    }

    final /* synthetic */ ListenableFuture zze(Uri.Builder builder, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcna
            @Override // java.lang.Runnable
            public final void run() {
                zzcni.this.zzh(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjp), "9");
        return zzgcj.zzh(builder.toString());
    }

    final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzju)).booleanValue()) {
            zzbts zzc = zzbtq.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbts zza = zzbtq.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzju)).booleanValue()) {
            zzbts zzc = zzbtq.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting");
        } else {
            zzbts zza = zzbtq.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final void zzi(String str, zzfll zzfllVar, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgcj.zzr(zzgcj.zzo(zzk(str, this.zzf.zza(), random), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjt)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcnh(this, zzfllVar, str), this.zzg);
    }
}
