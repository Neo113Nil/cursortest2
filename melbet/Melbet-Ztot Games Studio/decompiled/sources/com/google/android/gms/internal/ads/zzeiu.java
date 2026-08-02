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

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzeiu implements zzgbq {
    private final zzfjl zza;
    private final zzcws zzb;
    private final zzflh zzc;
    private final zzfll zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcrx zzg;
    private final zzein zzh;
    private final zzeey zzi;
    private final Context zzj;
    private final zzfkf zzk;
    private final zzehx zzl;
    private final zzdsf zzm;

    zzeiu(Context context, zzfjl zzfjlVar, zzein zzeinVar, zzcws zzcwsVar, zzflh zzflhVar, zzfll zzfllVar, zzcrx zzcrxVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeey zzeeyVar, zzfkf zzfkfVar, zzehx zzehxVar, zzdsf zzdsfVar) {
        this.zzj = context;
        this.zza = zzfjlVar;
        this.zzh = zzeinVar;
        this.zzb = zzcwsVar;
        this.zzc = zzflhVar;
        this.zzd = zzfllVar;
        this.zzg = zzcrxVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeeyVar;
        this.zzk = zzfkfVar;
        this.zzl = zzehxVar;
        this.zzm = zzdsfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzeR)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String zzc(zzfex zzfexVar) {
        String str = "No fill.";
        String str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeS)).booleanValue() ? "No ad config." : "No fill.";
        int i = zzfexVar.zzb.zzb.zzf;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                if (i < 300 || i >= 400) {
                    str = "Received error HTTP response code: " + i;
                } else {
                    str = "No location header to follow redirect or too many redirects.";
                }
            }
            zzfen zzfenVar = zzfexVar.zzb.zzb.zzj;
            return zzfenVar == null ? zzfenVar.zza() : str;
        }
        str = str2;
        zzfen zzfenVar2 = zzfexVar.zzb.zzb.zzj;
        if (zzfenVar2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    @Override // com.google.android.gms.internal.ads.zzgbq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        zzbvb zzbvbVar;
        Bundle bundle;
        final zzfex zzfexVar = (zzfex) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbS)).booleanValue() && (zzbvbVar = zzfexVar.zzb.zzd) != null && (bundle = zzbvbVar.zzm) != null) {
            this.zzm.zza().putAll(bundle);
        }
        String zzc = zzc(zzfexVar);
        this.zzi.zzi(zzfexVar.zzb.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhx)).booleanValue() && (i = zzfexVar.zzb.zzb.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzgcj.zzg(new zzeir(3, zzc));
        }
        zzfeo zzfeoVar = zzfexVar.zzb.zzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdi)).booleanValue()) {
            String str = zzfeoVar.zzq;
            if (!TextUtils.isEmpty(str)) {
                this.zzi.zzh(str, zzfexVar.zzb.zza);
                this.zzb.zzo(new zzcnm(zzfexVar, this.zzd, this.zzc), this.zze);
                if (zzfexVar.zzb.zzb.zzr <= 1) {
                    return this.zzl.zzb(zzfexVar);
                }
                zzfiq zza = zzfiv.zzc(zzgcj.zzg(new zzeir(3, zzc(zzfexVar))), zzfjf.RENDER_CONFIG_INIT, this.zza).zza();
                this.zzh.zzl();
                int i2 = 0;
                for (final zzfel zzfelVar : zzfexVar.zzb.zza) {
                    Iterator it = zzfelVar.zza.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str2 = (String) it.next();
                        final zzeet zza2 = this.zzg.zza(zzfelVar.zzb, str2);
                        if (zza2 != null && zza2.zzb(zzfexVar, zzfelVar)) {
                            zza = this.zza.zzb(zzfjf.RENDER_CONFIG_WATERFALL, zza).zzh("render-config-" + i2 + "-" + str2).zzc(Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzeis
                                @Override // com.google.android.gms.internal.ads.zzgbq
                                public final ListenableFuture zza(Object obj2) {
                                    return zzeiu.this.zzb(zzfelVar, zzfexVar, zza2, (Throwable) obj2);
                                }
                            }).zza();
                            break;
                        }
                    }
                    i2++;
                }
                final zzein zzeinVar = this.zzh;
                Objects.requireNonNull(zzeinVar);
                zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeit
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzein.this.zzj();
                    }
                }, this.zze);
                return zza;
            }
        }
        for (zzfel zzfelVar2 : zzfexVar.zzb.zza) {
            this.zzi.zzd(zzfelVar2);
            Iterator it2 = zzfelVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.zzi.zzf(zzfelVar2, 0L, zzfgi.zzd(1, null, null));
                    break;
                }
                zzeet zza3 = this.zzg.zza(zzfelVar2.zzb, (String) it2.next());
                if (zza3 == null || !zza3.zzb(zzfexVar, zzfelVar2)) {
                }
            }
        }
        this.zzb.zzo(new zzcnm(zzfexVar, this.zzd, this.zzc), this.zze);
        if (zzfexVar.zzb.zzb.zzr <= 1) {
        }
    }

    final /* synthetic */ ListenableFuture zzb(zzfel zzfelVar, zzfex zzfexVar, zzeet zzeetVar, Throwable th) throws Exception {
        zzfju zza = zzfjt.zza(this.zzj, 12);
        zza.zzd(zzfelVar.zzE);
        zza.zzi();
        ListenableFuture zzo = zzgcj.zzo(zzeetVar.zza(zzfexVar, zzfelVar), zzfelVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfexVar, zzfelVar, zzo, this.zzc);
        zzfke.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
