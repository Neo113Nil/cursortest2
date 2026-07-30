package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeny implements zzgyw {
    private final zzfnu zza;
    private final zzdbh zzb;
    private final zzfqg zzc;
    private final zzfqk zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcwi zzg;
    private final zzenr zzh;
    private final zzekl zzi;
    private final Context zzj;
    private final zzfoo zzk;
    private final zzenb zzl;
    private final zzdxt zzm;

    zzeny(Context context, zzfnu zzfnuVar, zzenr zzenrVar, zzdbh zzdbhVar, zzfqg zzfqgVar, zzfqk zzfqkVar, zzcwi zzcwiVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzekl zzeklVar, zzfoo zzfooVar, zzenb zzenbVar, zzdxt zzdxtVar) {
        this.zzj = context;
        this.zza = zzfnuVar;
        this.zzh = zzenrVar;
        this.zzb = zzdbhVar;
        this.zzc = zzfqgVar;
        this.zzd = zzfqkVar;
        this.zzg = zzcwiVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeklVar;
        this.zzk = zzfooVar;
        this.zzl = zzenbVar;
        this.zzm = zzdxtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzgz)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String zzb(zzfjc zzfjcVar) {
        String str = "No fill.";
        String str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgA)).booleanValue() ? "No ad config." : "No fill.";
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        int i = zzfiuVar.zzf;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                if (i < 300 || i >= 400) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
                    sb.append("Received error HTTP response code: ");
                    sb.append(i);
                    str = sb.toString();
                } else {
                    str = "No location header to follow redirect or too many redirects.";
                }
            }
            zzfit zzfitVar = zzfiuVar.zzj;
            return zzfitVar == null ? zzfitVar.zza() : str;
        }
        str = str2;
        zzfit zzfitVar2 = zzfiuVar.zzj;
        if (zzfitVar2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        Bundle bundle;
        final zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzfjcVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcL)).booleanValue()) {
            this.zzm.zze().putLong(zzdxh.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String zzb = zzb(zzfjcVar);
        zzekl zzeklVar = this.zzi;
        zzfjb zzfjbVar = zzfjcVar.zzb;
        zzfiu zzfiuVar = zzfjbVar.zzb;
        zzeklVar.zza(zzfiuVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjE)).booleanValue() && (i = zzfiuVar.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzgzo.zzc(new zzenv(3, zzb));
        }
        String str = zzfiuVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfir zzfirVar : zzfjbVar.zza) {
                zzeklVar.zzb(zzfirVar);
                Iterator it = zzfirVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzeklVar.zze(zzfirVar, 0L, zzfkm.zzd(1, null, null));
                        break;
                    }
                    zzekg zza = this.zzg.zza(zzfirVar.zzb, (String) it.next());
                    if (zza == null || !zza.zza(zzfjcVar, zzfirVar)) {
                    }
                }
            }
        } else {
            zzeklVar.zzc(str, zzfjbVar.zza);
        }
        zzdbh zzdbhVar = this.zzb;
        zzcrz zzcrzVar = new zzcrz(zzfjcVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzdbhVar.zzq(zzcrzVar, executor);
        if (zzfiuVar.zzr > 1) {
            return this.zzl.zza(zzfjcVar);
        }
        String zzb2 = zzb(zzfjcVar);
        zzfnu zzfnuVar = this.zza;
        zzfno zzfnoVar = zzfno.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfnuVar);
        zzfnb zzi = zzfnf.zza(zzgzo.zzc(new zzenv(3, zzb2)), zzfnoVar, zzfnuVar).zzi();
        final zzenr zzenrVar = this.zzh;
        zzenrVar.zza();
        int i2 = 0;
        for (final zzfir zzfirVar2 : zzfjbVar.zza) {
            Iterator it2 = zzfirVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzekg zza2 = this.zzg.zza(zzfirVar2.zzb, str2);
                if (zza2 != null && zza2.zza(zzfjcVar, zzfirVar2)) {
                    zzfnl zza3 = zzfnuVar.zza(zzfno.RENDER_CONFIG_WATERFALL, zzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str2);
                    zzi = zza3.zza(sb.toString()).zzg(Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzenx
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ ListenableFuture zza(Object obj2) {
                            return zzeny.this.zzc(zzfirVar2, zzfjcVar, zza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i2++;
        }
        Objects.requireNonNull(zzenrVar);
        zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzenr.this.zzb();
            }
        }, executor);
        return zzi;
    }

    final /* synthetic */ ListenableFuture zzc(zzfir zzfirVar, zzfjc zzfjcVar, zzekg zzekgVar, Throwable th) {
        zzfoe zzn = zzfoe.zzn(this.zzj, 12);
        zzn.zzi(zzfirVar.zzE);
        zzn.zza();
        ListenableFuture zzi = zzgzo.zzi(zzekgVar.zzb(zzfjcVar, zzfirVar), zzfirVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfjcVar, zzfirVar, zzi, this.zzc);
        zzfon.zzd(zzi, this.zzk, zzn);
        return zzi;
    }
}
