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

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzehr implements zzgob {
    private final zzfhh zza;
    private final zzcvu zzb;
    private final zzfjr zzc;
    private final zzfjv zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcqv zzg;
    private final zzehk zzh;
    private final zzeee zzi;
    private final Context zzj;
    private final zzfib zzk;
    private final zzegu zzl;
    private final zzdsg zzm;

    zzehr(Context context, zzfhh zzfhhVar, zzehk zzehkVar, zzcvu zzcvuVar, zzfjr zzfjrVar, zzfjv zzfjvVar, zzcqv zzcqvVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeee zzeeeVar, zzfib zzfibVar, zzegu zzeguVar, zzdsg zzdsgVar) {
        this.zzj = context;
        this.zza = zzfhhVar;
        this.zzh = zzehkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzfjrVar;
        this.zzd = zzfjvVar;
        this.zzg = zzcqvVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeeeVar;
        this.zzk = zzfibVar;
        this.zzl = zzeguVar;
        this.zzm = zzdsgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzfZ)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String zzb(zzfcu zzfcuVar) {
        String str = "No fill.";
        String str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzga)).booleanValue() ? "No ad config." : "No fill.";
        zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        int i = zzfcmVar.zzf;
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
            zzfcl zzfclVar = zzfcmVar.zzj;
            return zzfclVar == null ? zzfclVar.zza() : str;
        }
        str = str2;
        zzfcl zzfclVar2 = zzfcmVar.zzj;
        if (zzfclVar2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        Bundle bundle;
        final zzfcu zzfcuVar = (zzfcu) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzfcuVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcs)).booleanValue()) {
            this.zzm.zze().putLong(zzdru.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String zzb = zzb(zzfcuVar);
        zzeee zzeeeVar = this.zzi;
        zzfct zzfctVar = zzfcuVar.zzb;
        zzfcm zzfcmVar = zzfctVar.zzb;
        zzeeeVar.zza(zzfcmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjb)).booleanValue() && (i = zzfcmVar.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzgot.zzc(new zzeho(3, zzb));
        }
        String str = zzfcmVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdZ)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfcj zzfcjVar : zzfctVar.zza) {
                zzeeeVar.zzb(zzfcjVar);
                Iterator it = zzfcjVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzeeeVar.zze(zzfcjVar, 0L, zzfee.zzd(1, null, null));
                        break;
                    }
                    zzedz zza = this.zzg.zza(zzfcjVar.zzb, (String) it.next());
                    if (zza == null || !zza.zza(zzfcuVar, zzfcjVar)) {
                    }
                }
            }
        } else {
            zzeeeVar.zzc(str, zzfctVar.zza);
        }
        zzcvu zzcvuVar = this.zzb;
        zzcmm zzcmmVar = new zzcmm(zzfcuVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzcvuVar.zzq(zzcmmVar, executor);
        if (zzfcmVar.zzr > 1) {
            return this.zzl.zza(zzfcuVar);
        }
        String zzb2 = zzb(zzfcuVar);
        zzfhh zzfhhVar = this.zza;
        zzfhb zzfhbVar = zzfhb.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfhhVar);
        zzfgo zzi = zzfgs.zza(zzgot.zzc(new zzeho(3, zzb2)), zzfhbVar, zzfhhVar).zzi();
        final zzehk zzehkVar = this.zzh;
        zzehkVar.zza();
        int i2 = 0;
        for (final zzfcj zzfcjVar2 : zzfctVar.zza) {
            Iterator it2 = zzfcjVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzedz zza2 = this.zzg.zza(zzfcjVar2.zzb, str2);
                if (zza2 != null && zza2.zza(zzfcuVar, zzfcjVar2)) {
                    zzfgy zza3 = zzfhhVar.zza(zzfhb.RENDER_CONFIG_WATERFALL, zzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str2);
                    zzi = zza3.zza(sb.toString()).zzg(Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzehq
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ ListenableFuture zza(Object obj2) {
                            return zzehr.this.zzc(zzfcjVar2, zzfcuVar, zza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i2++;
        }
        Objects.requireNonNull(zzehkVar);
        zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzehk.this.zzb();
            }
        }, executor);
        return zzi;
    }

    final /* synthetic */ ListenableFuture zzc(zzfcj zzfcjVar, zzfcu zzfcuVar, zzedz zzedzVar, Throwable th) {
        zzfhr zzn = zzfhr.zzn(this.zzj, 12);
        zzn.zzi(zzfcjVar.zzE);
        zzn.zza();
        ListenableFuture zzi = zzgot.zzi(zzedzVar.zzb(zzfcuVar, zzfcjVar), zzfcjVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfcuVar, zzfcjVar, zzi, this.zzc);
        zzfia.zzd(zzi, this.zzk, zzn);
        return zzi;
    }
}
