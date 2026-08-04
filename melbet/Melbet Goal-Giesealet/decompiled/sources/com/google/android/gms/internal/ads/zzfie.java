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

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfie implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdpz zzj;
    private final List zzk;
    private final zzcgj zzl;
    private final zzbvd zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfii zzg = zzfil.zzb();
    private String zzh = "";
    private boolean zzm = false;

    public zzfie(Context context, VersionInfoParcel versionInfoParcel, zzdpz zzdpzVar, zzeau zzeauVar, zzbvd zzbvdVar, zzcgj zzcgjVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdpzVar;
        this.zzn = zzbvdVar;
        this.zzl = zzcgjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjD)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzk();
        } else {
            this.zzk = zzgjz.zzi();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbeb.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbeb.zza.zze()).doubleValue());
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
        byte[] zzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzfii zzfiiVar = this.zzg;
                        zzaN = ((zzfil) zzfiiVar.zzbu()).zzaN();
                        zzfiiVar.zzc();
                    }
                    zzear zzearVar = new zzear((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjx), 60000, new HashMap(), zzaN, "application/x-protobuf", false);
                    zzear zzearVar2 = zzearVar;
                    new zzeat(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid()).zza(zzearVar);
                } catch (Exception e) {
                    if ((e instanceof zzdwz) && ((zzdwz) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfhu zzfhuVar) {
        zzbzh.zza.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfid
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfie.this.zzc(zzfhuVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfhu zzfhuVar) {
        synchronized (zzd) {
            if (!this.zzm) {
                this.zzm = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        this.zzh = com.google.android.gms.ads.internal.util.zzs.zzt(this.zze);
                    } catch (RemoteException | RuntimeException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjy)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmH)).booleanValue()) {
                        long j = intValue;
                        zzbzh.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = intValue;
                        zzbzh.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjE)).booleanValue()) {
                        this.zzl.zza();
                    }
                }
            }
        }
        if (zza() && zzfhuVar != null) {
            synchronized (zzc) {
                zzfii zzfiiVar = this.zzg;
                if (zzfiiVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjz)).intValue()) {
                    return;
                }
                zzfif zza2 = zzfih.zza();
                zza2.zzv(zzfhuVar.zzm());
                zza2.zza(zzfhuVar.zzb());
                zza2.zzb(zzfhuVar.zza());
                zza2.zzw(3);
                zza2.zzd(this.zzf.afmaVersion);
                zza2.zze(this.zzh);
                zza2.zzf(Build.VERSION.RELEASE);
                zza2.zzg(Build.VERSION.SDK_INT);
                zza2.zzx(zzfhuVar.zzo());
                zza2.zzi(zzfhuVar.zzc());
                zza2.zzj(this.zzi);
                zza2.zzy(zzfhuVar.zzn());
                zza2.zzk(zzfhuVar.zzd());
                zza2.zzl(zzfhuVar.zze());
                zza2.zzm(zzfhuVar.zzf());
                zza2.zzn(this.zzj.zzd(zzfhuVar.zzf()));
                zza2.zzo(zzfhuVar.zzg());
                zza2.zzs(zzfhuVar.zzh());
                zza2.zzr(zzfhuVar.zzk());
                zza2.zzp(zzfhuVar.zzi());
                zza2.zzq(zzfhuVar.zzj());
                zza2.zzc(zzfhuVar.zzl());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjD)).booleanValue()) {
                    zza2.zzh(this.zzk);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjE)).booleanValue()) {
                    zzcgj zzcgjVar = this.zzl;
                    zzhlz zzc2 = zzcgjVar.zzc();
                    String zzb2 = zzcgjVar.zzb();
                    if (zzc2 != null) {
                        zza2.zzt(zzc2);
                    }
                    if (zzb2 != null) {
                        zza2.zzu(zzb2);
                    }
                }
                zzfij zza3 = zzfik.zza();
                zza3.zza(zza2);
                zzfiiVar.zzb(zza3);
            }
        }
    }
}
