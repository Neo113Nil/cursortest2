package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzciq implements zzcoc {

    @Nullable
    private static zzciq zza;

    private static synchronized zzciq zzD(Context context, @Nullable zzbpr zzbprVar, int i, boolean z, int i2, zzcju zzcjuVar) {
        synchronized (zzciq.class) {
            zzciq zzciqVar = zza;
            if (zzciqVar != null) {
                return zzciqVar;
            }
            zzbdc.zza(context);
            zzffk zzd = zzffk.zzd(context);
            zzcbt zzc = zzd.zzc(234310000, false, i2);
            zzd.zzf(zzbprVar);
            zzcli zzcliVar = new zzcli(null);
            zzcir zzcirVar = new zzcir();
            zzcirVar.zzd(zzc);
            zzcirVar.zzc(context);
            zzcliVar.zzb(new zzcit(zzcirVar, null));
            zzcliVar.zzc(new zzcmv(zzcjuVar));
            zzciq zza2 = zzcliVar.zza();
            com.google.android.gms.ads.internal.zzt.zzo().zzu(context, zzc);
            com.google.android.gms.ads.internal.zzt.zzc().zzi(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzl(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzk(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzb().zzd(context);
            com.google.android.gms.ads.internal.zzt.zzv().zzb(context);
            zza2.zza().zzc();
            zzbzt.zzd(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgi)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzau)).booleanValue()) {
                    zzayp zzaypVar = new zzayp(new zzayv(context));
                    zzedi zzediVar = new zzedi(new zzede(context), zza2.zzA());
                    com.google.android.gms.ads.internal.zzt.zzp();
                    new zzeee(context, zzc, zzaypVar, zzediVar, UUID.randomUUID().toString(), zza2.zzy()).zzb(com.google.android.gms.ads.internal.zzt.zzo().zzi().zzQ());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzciq zzb(Context context, @Nullable zzbpr zzbprVar, int i) {
        return zzD(context, zzbprVar, 234310000, false, i, new zzcju());
    }

    public abstract zzgbl zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract com.google.android.gms.ads.internal.util.zzcf zza();

    public abstract zzcnf zzc();

    public abstract zzcrc zzd();

    public abstract zzcsl zze();

    public abstract zzdaw zzf();

    public abstract zzdhx zzg();

    public abstract zzdit zzh();

    public abstract zzdqc zzi();

    public abstract zzduy zzj();

    public abstract zzdwn zzk();

    public abstract zzdxh zzl();

    public abstract zzefa zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzg zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzaa zzp();

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final zzevw zzq(zzbwa zzbwaVar, int i) {
        return zzr(new zzexz(zzbwaVar, i));
    }

    protected abstract zzevw zzr(zzexz zzexzVar);

    public abstract zzeyu zzs();

    public abstract zzfai zzt();

    public abstract zzfbz zzu();

    public abstract zzfdn zzv();

    public abstract zzffd zzw();

    public abstract zzffn zzx();

    public abstract zzfje zzy();

    public abstract zzfkk zzz();
}
