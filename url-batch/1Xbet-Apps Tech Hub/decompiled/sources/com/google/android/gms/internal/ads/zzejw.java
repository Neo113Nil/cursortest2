package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzejw implements zzgai {
    private final zzfiu zza;
    private final zzcyj zzb;
    private final zzfkw zzc;
    private final zzfla zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzctu zzg;
    private final zzejp zzh;
    private final zzega zzi;
    private final Context zzj;
    private final zzfkh zzk;
    private final zzeiz zzl;

    zzejw(Context context, zzfiu zzfiuVar, zzejp zzejpVar, zzcyj zzcyjVar, zzfkw zzfkwVar, zzfla zzflaVar, zzctu zzctuVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzega zzegaVar, zzfkh zzfkhVar, zzeiz zzeizVar) {
        this.zzj = context;
        this.zza = zzfiuVar;
        this.zzh = zzejpVar;
        this.zzb = zzcyjVar;
        this.zzc = zzfkwVar;
        this.zzd = zzflaVar;
        this.zzg = zzctuVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzegaVar;
        this.zzk = zzfkhVar;
        this.zzl = zzeizVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzfs)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String zzc(zzfeh zzfehVar) {
        String str = "No fill.";
        String str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzft)).booleanValue() ? "No ad config." : "No fill.";
        int i = zzfehVar.zzb.zzb.zze;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                if (i < 300 || i >= 400) {
                    str = "Received error HTTP response code: " + i;
                } else {
                    str = "No location header to follow redirect or too many redirects.";
                }
            }
            zzfdw zzfdwVar = zzfehVar.zzb.zzb.zzi;
            return zzfdwVar == null ? zzfdwVar.zza() : str;
        }
        str = str2;
        zzfdw zzfdwVar2 = zzfehVar.zzb.zzb.zzi;
        if (zzfdwVar2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
    @Override // com.google.android.gms.internal.ads.zzgai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        final zzfeh zzfehVar = (zzfeh) obj;
        String zzc = zzc(zzfehVar);
        this.zzi.zzi(zzfehVar.zzb.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzig)).booleanValue() && (i = zzfehVar.zzb.zzb.zze) != 0 && (i < 200 || i >= 300)) {
            return zzgbb.zzg(new zzejt(3, zzc));
        }
        zzfdy zzfdyVar = zzfehVar.zzb.zzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdq)).booleanValue()) {
            String str = zzfdyVar.zzo;
            if (!TextUtils.isEmpty(str)) {
                this.zzi.zzh(str, zzfehVar.zzb.zza);
                this.zzb.zzo(new zzcps(zzfehVar, this.zzd, this.zzc), this.zze);
                if (zzfehVar.zzb.zzb.zzp <= 1) {
                    return this.zzl.zzb(zzfehVar);
                }
                zzfhz zza = zzfie.zzc(zzgbb.zzg(new zzejt(3, zzc(zzfehVar))), zzfio.RENDER_CONFIG_INIT, this.zza).zza();
                this.zzh.zzl();
                int i2 = 0;
                for (final zzfdu zzfduVar : zzfehVar.zzb.zza) {
                    Iterator it = zzfduVar.zza.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str2 = (String) it.next();
                        final zzefv zza2 = this.zzg.zza(zzfduVar.zzb, str2);
                        if (zza2 != null && zza2.zzb(zzfehVar, zzfduVar)) {
                            zza = this.zza.zzb(zzfio.RENDER_CONFIG_WATERFALL, zza).zzh("render-config-" + i2 + "-" + str2).zzc(Throwable.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzeju
                                @Override // com.google.android.gms.internal.ads.zzgai
                                public final ListenableFuture zza(Object obj2) {
                                    return zzejw.this.zzb(zzfduVar, zzfehVar, zza2, (Throwable) obj2);
                                }
                            }).zza();
                            break;
                        }
                    }
                    i2++;
                }
                final zzejp zzejpVar = this.zzh;
                zzejpVar.getClass();
                zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzejp.this.zzj();
                    }
                }, this.zze);
                return zza;
            }
        }
        for (zzfdu zzfduVar2 : zzfehVar.zzb.zza) {
            this.zzi.zzd(zzfduVar2);
            Iterator it2 = zzfduVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.zzi.zzf(zzfduVar2, 0L, zzffr.zzd(1, null, null));
                    break;
                }
                zzefv zza3 = this.zzg.zza(zzfduVar2.zzb, (String) it2.next());
                if (zza3 == null || !zza3.zzb(zzfehVar, zzfduVar2)) {
                }
            }
        }
        this.zzb.zzo(new zzcps(zzfehVar, this.zzd, this.zzc), this.zze);
        if (zzfehVar.zzb.zzb.zzp <= 1) {
        }
    }

    final /* synthetic */ ListenableFuture zzb(zzfdu zzfduVar, zzfeh zzfehVar, zzefv zzefvVar, Throwable th) throws Exception {
        zzfjw zza = zzfjv.zza(this.zzj, 12);
        zza.zzd(zzfduVar.zzF);
        zza.zzh();
        ListenableFuture zzo = zzgbb.zzo(zzefvVar.zza(zzfehVar, zzfduVar), zzfduVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfehVar, zzfduVar, zzo, this.zzc);
        zzfkg.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
