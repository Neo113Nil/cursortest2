package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzesm implements zzesf {
    private final zzfjj zza;
    private final zzcma zzb;
    private final Context zzc;
    private final zzesc zzd;
    private final zzfor zze;
    private zzcwu zzf;

    public zzesm(zzcma zzcmaVar, Context context, zzesc zzescVar, zzfjj zzfjjVar) {
        this.zzb = zzcmaVar;
        this.zzc = context;
        this.zzd = zzescVar;
        this.zza = zzfjjVar;
        this.zze = zzcmaVar.zzx();
        zzfjjVar.zzt(zzescVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzesd zzesdVar, zzese zzeseVar) throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzM(context) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzesm.this.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzesm.this.zzd();
                }
            });
            return false;
        }
        boolean z = zzmVar.zzf;
        zzfkh.zzb(context, z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && z) {
            this.zzb.zzw().zzc(true);
        }
        int i3 = ((zzesg) zzesdVar).zza;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        String zza = zzdxh.PUBLIC_API_CALL.zza();
        Long valueOf = Long.valueOf(currentTimeMillis);
        Bundle zza2 = zzdxj.zza(new Pair(zza, valueOf), new Pair(zzdxh.DYNAMITE_ENTER.zza(), valueOf));
        zzfjj zzfjjVar = this.zza;
        zzfjjVar.zza(zzmVar);
        zzfjjVar.zzv(zza2);
        zzfjjVar.zzl(i3);
        zzfjk zzA = zzfjjVar.zzA();
        zzfoe zzo = zzfoe.zzo(context, zzfon.zzg(zzA), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzco zzcoVar = zzA.zzo;
        if (zzcoVar != null) {
            this.zzd.zzc().zzn(zzcoVar);
        }
        zzcma zzcmaVar = this.zzb;
        zzdmp zzo2 = zzcmaVar.zzo();
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(context);
        zzdanVar.zzb(zzA);
        zzo2.zzf(zzdanVar.zze());
        zzdhe zzdheVar = new zzdhe();
        zzesc zzescVar = this.zzd;
        zzdheVar.zze(zzescVar.zzc(), zzcmaVar.zzb());
        zzo2.zzg(zzdheVar.zzn());
        zzo2.zze(zzescVar.zzb());
        zzfoo zzfooVar = null;
        zzo2.zzd(new zzctu(null));
        zzdmq zzh = zzo2.zzh();
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzfooVar = zzh.zzc();
            zzfooVar.zzi(8);
            zzfooVar.zzc(zzmVar.zzp);
            zzfooVar.zzd(zzmVar.zzm);
        }
        zzfoo zzfooVar2 = zzfooVar;
        zzcmaVar.zzv().zza(1);
        zzgzy zzc = zzfmk.zzc();
        ScheduledExecutorService zzc2 = zzcmaVar.zzc();
        zzcxj zza3 = zzh.zza();
        zzcwu zzcwuVar = new zzcwu(zzc, zzc2, zza3.zzc(zza3.zzb()));
        this.zzf = zzcwuVar;
        zzcwuVar.zza(new zzesj(this, zzeseVar, zzfooVar2, zzo, zzh));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        zzcwu zzcwuVar = this.zzf;
        return zzcwuVar != null && zzcwuVar.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.zze().zzdI(zzfkm.zzd(4, null, null));
    }

    final /* synthetic */ void zzd() {
        this.zzd.zze().zzdI(zzfkm.zzd(6, null, null));
    }

    final /* synthetic */ zzcma zze() {
        return this.zzb;
    }

    final /* synthetic */ zzesc zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfor zzg() {
        return this.zze;
    }
}
