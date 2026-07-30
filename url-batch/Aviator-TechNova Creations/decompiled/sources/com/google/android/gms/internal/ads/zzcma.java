package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzcma implements zzcqi {

    @Nullable
    private static zzcma zza;

    private static synchronized zzcma zzH(Context context, @Nullable zzbtt zzbttVar, int i, boolean z, int i2, zzcnl zzcnlVar) {
        synchronized (zzcma.class) {
            zzcma zzcmaVar = zza;
            if (zzcmaVar != null) {
                return zzcmaVar;
            }
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzbhe.zza(context);
            if (((Boolean) zzbiw.zze.zze()).booleanValue()) {
                zzbgp.zza(context);
            }
            zzfkg zza2 = zzfkg.zza(context);
            VersionInfoParcel zzb = zza2.zzb(ModuleDescriptor.MODULE_VERSION, false, i2);
            zza2.zzc(zzbttVar);
            zzcoa zzcoaVar = new zzcoa(null);
            zzcmb zzcmbVar = new zzcmb();
            zzcmbVar.zza(zzb);
            zzcmbVar.zzb(context);
            zzcmbVar.zzc(currentTimeMillis);
            zzcoaVar.zza(new zzcmc(zzcmbVar, null));
            zzcoaVar.zzb(new zzcox(zzcnlVar));
            zzcma zzc = zzcoaVar.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpk)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zze().zza(zzfmk.zzc(), zzc.zzD(), context);
                com.google.android.gms.ads.internal.zzt.zze().zzb();
            }
            ((zzecp) ((zzcnp) zzc).zzo.zzb()).zza();
            ((zzclt) ((zzcnp) zzc).zzn.zzb()).zza(context, zzb);
            com.google.android.gms.ads.internal.zzt.zzh().zze(context, zzb, zzc.zzD());
            com.google.android.gms.ads.internal.zzt.zzj().zza(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzg().zza(context);
            com.google.android.gms.ads.internal.zzt.zzA().zza(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpG)).booleanValue()) {
                String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpH);
                if (!str.isEmpty()) {
                    if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                        zzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                    }
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpF)).booleanValue()) {
                    zzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                }
            }
            ((com.google.android.gms.ads.internal.util.zzbz) ((zzcnp) zzc).zzau.zzb()).zza();
            zzccr.zzb(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbe)).booleanValue()) {
                    new zzeii(context, zzb, new zzbgd(new zzbgi(context)), new zzehn(new zzehj(context), (zzgzy) ((zzcnp) zzc).zzd.zzb())).zza(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpz)).booleanValue()) {
                zzc.zzg().zza();
            }
            zza = zzc;
            return zzc;
        }
    }

    public static zzcma zza(Context context, @Nullable zzbtt zzbttVar, int i) {
        return zzH(context, zzbttVar, ModuleDescriptor.MODULE_VERSION, false, i, new zzcnl());
    }

    public abstract zzdzq zzA();

    public abstract zzfka zzB();

    public abstract zzecc zzC();

    public abstract zzdxz zzD();

    abstract zzdvh zzE();

    @Override // com.google.android.gms.internal.ads.zzcqi
    public final zzcdk zzF() {
        return zzG();
    }

    public abstract zzcdk zzG();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzdeg zzd();

    public abstract zzcpj zze();

    public abstract zzfrd zzf();

    public abstract zzefu zzg();

    public abstract zzefw zzh();

    public abstract zzcvb zzi();

    public abstract zzffh zzj();

    public abstract zzctk zzk();

    public abstract zzfdu zzl();

    public abstract zzdlt zzm();

    public abstract zzfgx zzn();

    public abstract zzdmp zzo();

    public abstract zzdud zzp();

    public abstract zzfik zzq();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzr();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau zzs();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzt();

    public abstract zzejf zzu();

    public abstract zzfkj zzv();

    public abstract zzebf zzw();

    public abstract zzfor zzx();

    @Override // com.google.android.gms.internal.ads.zzcqi
    public final zzfbz zzy(zzbzu zzbzuVar, int i) {
        return zzz(new zzfdc(zzbzuVar, i));
    }

    protected abstract zzfbz zzz(zzfdc zzfdcVar);
}
