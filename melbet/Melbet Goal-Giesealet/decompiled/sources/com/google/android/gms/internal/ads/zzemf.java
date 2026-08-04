package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzemf implements zzely {
    private final zzfdb zza;
    private final zzcgv zzb;
    private final Context zzc;
    private final zzelv zzd;
    private final zzfie zze;
    private zzcrh zzf;

    public zzemf(zzcgv zzcgvVar, Context context, zzelv zzelvVar, zzfdb zzfdbVar) {
        this.zzb = zzcgvVar;
        this.zzc = context;
        this.zzd = zzelvVar;
        this.zza = zzfdbVar;
        this.zze = zzcgvVar.zzv();
        zzfdbVar.zzt(zzelvVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelw zzelwVar, zzelx zzelxVar) throws RemoteException {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzL(context) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeme
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzemf.this.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzemf.this.zzd();
                }
            });
            return false;
        }
        boolean z = zzmVar.zzf;
        zzfdz.zzb(context, z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && z) {
            this.zzb.zzu().zzc(true);
        }
        int i3 = ((zzelz) zzelwVar).zza;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        String zza = zzdru.PUBLIC_API_CALL.zza();
        Long valueOf = Long.valueOf(currentTimeMillis);
        Bundle zza2 = zzdrw.zza(new Pair(zza, valueOf), new Pair(zzdru.DYNAMITE_ENTER.zza(), valueOf));
        zzfdb zzfdbVar = this.zza;
        zzfdbVar.zza(zzmVar);
        zzfdbVar.zzv(zza2);
        zzfdbVar.zzl(i3);
        zzfdc zzz = zzfdbVar.zzz();
        zzfhr zzo = zzfhr.zzo(context, zzfia.zzg(zzz), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzco zzcoVar = zzz.zzo;
        if (zzcoVar != null) {
            this.zzd.zzc().zzn(zzcoVar);
        }
        zzcgv zzcgvVar = this.zzb;
        zzdhc zzm = zzcgvVar.zzm();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zza(context);
        zzcvaVar.zzb(zzz);
        zzm.zzf(zzcvaVar.zze());
        zzdbr zzdbrVar = new zzdbr();
        zzelv zzelvVar = this.zzd;
        zzdbrVar.zze(zzelvVar.zzc(), zzcgvVar.zzb());
        zzm.zzg(zzdbrVar.zzn());
        zzm.zze(zzelvVar.zzb());
        zzfib zzfibVar = null;
        zzm.zzd(new zzcoh(null));
        zzdhd zzh = zzm.zzh();
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzfibVar = zzh.zzc();
            zzfibVar.zzi(8);
            zzfibVar.zzc(zzmVar.zzp);
            zzfibVar.zzd(zzmVar.zzm);
        }
        zzfib zzfibVar2 = zzfibVar;
        zzcgvVar.zzt().zza(1);
        zzgpd zzc = zzfgc.zzc();
        ScheduledExecutorService zzc2 = zzcgvVar.zzc();
        zzcrw zza3 = zzh.zza();
        zzcrh zzcrhVar = new zzcrh(zzc, zzc2, zza3.zzc(zza3.zzb()));
        this.zzf = zzcrhVar;
        zzcrhVar.zza(new zzemc(this, zzelxVar, zzfibVar2, zzo, zzh));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        zzcrh zzcrhVar = this.zzf;
        return zzcrhVar != null && zzcrhVar.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.zze().zzdN(zzfee.zzd(4, null, null));
    }

    final /* synthetic */ void zzd() {
        this.zzd.zze().zzdN(zzfee.zzd(6, null, null));
    }

    final /* synthetic */ zzcgv zze() {
        return this.zzb;
    }

    final /* synthetic */ zzelv zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfie zzg() {
        return this.zze;
    }
}
