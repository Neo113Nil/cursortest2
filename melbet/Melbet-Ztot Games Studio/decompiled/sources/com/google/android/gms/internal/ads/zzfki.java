package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzfki implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdpy zzj;
    private final List zzk;
    private final zzbvj zzm;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfko zzg = zzfkr.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzfki(Context context, VersionInfoParcel versionInfoParcel, zzdpy zzdpyVar, zzebn zzebnVar, zzbvj zzbvjVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdpyVar;
        this.zzm = zzbvjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhW)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzt.zzd();
        } else {
            this.zzk = zzfxr.zzm();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbdl.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbdl.zza.zze()).doubleValue());
                } else {
                    zzb = false;
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzaV = ((zzfkr) this.zzg.zzbr()).zzaV();
                        this.zzg.zzc();
                    }
                    new zzebm(this.zze, this.zzf.afmaVersion, this.zzm, Binder.getCallingUid()).zza(new zzebk((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhQ), 60000, new HashMap(), zzaV, "application/x-protobuf", false));
                } catch (Exception e) {
                    if ((e instanceof zzdwl) && ((zzdwl) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfjy zzfjyVar) {
        zzbzo.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkh
            @Override // java.lang.Runnable
            public final void run() {
                zzfki.this.zzc(zzfjyVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfjy zzfjyVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzu.zzp();
                        this.zzh = com.google.android.gms.ads.internal.util.zzt.zzp(this.zze);
                    } catch (RemoteException | RuntimeException e) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhR)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkT)).booleanValue()) {
                        long j = intValue;
                        zzbzo.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = intValue;
                        zzbzo.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzfjyVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhS)).intValue()) {
                    return;
                }
                zzfkk zza2 = zzfkm.zza();
                zza2.zzu(zzfjyVar.zzm());
                zza2.zzq(zzfjyVar.zzl());
                zza2.zzg(zzfjyVar.zzb());
                zza2.zzw(3);
                zza2.zzn(this.zzf.afmaVersion);
                zza2.zzb(this.zzh);
                zza2.zzk(Build.VERSION.RELEASE);
                zza2.zzr(Build.VERSION.SDK_INT);
                zza2.zzv(zzfjyVar.zzo());
                zza2.zzj(zzfjyVar.zza());
                zza2.zze(this.zzi);
                zza2.zzt(zzfjyVar.zzn());
                zza2.zzc(zzfjyVar.zze());
                zza2.zzf(zzfjyVar.zzg());
                zza2.zzh(zzfjyVar.zzh());
                zza2.zzi(this.zzj.zzb(zzfjyVar.zzh()));
                zza2.zzl(zzfjyVar.zzi());
                zza2.zzm(zzfjyVar.zzd());
                zza2.zzd(zzfjyVar.zzf());
                zza2.zzs(zzfjyVar.zzk());
                zza2.zzo(zzfjyVar.zzj());
                zza2.zzp(zzfjyVar.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhW)).booleanValue()) {
                    zza2.zza(this.zzk);
                }
                zzfko zzfkoVar = this.zzg;
                zzfkp zza3 = zzfkq.zza();
                zza3.zza(zza2);
                zzfkoVar.zzb(zza3);
            }
        }
    }
}
