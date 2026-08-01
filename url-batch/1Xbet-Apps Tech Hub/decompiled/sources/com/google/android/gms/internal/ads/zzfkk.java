package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfkk implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final zzcbt zzf;
    private int zzi;
    private final zzdrh zzj;
    private final List zzk;
    private final zzecl zzm;
    private final zzbwm zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfkp zzg = zzfks.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzfkk(Context context, zzcbt zzcbtVar, zzdrh zzdrhVar, zzecl zzeclVar, zzbwm zzbwmVar) {
        this.zze = context;
        this.zzf = zzcbtVar;
        this.zzj = zzdrhVar;
        this.zzm = zzeclVar;
        this.zzn = zzbwmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziF)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzt.zzd();
        } else {
            this.zzk = zzfwu.zzl();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbeo.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbeo.zza.zze()).doubleValue());
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
        byte[] zzax;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzax = ((zzfks) this.zzg.zzal()).zzax();
                        this.zzg.zzc();
                    }
                    new zzeck(this.zze, this.zzf.zza, this.zzn, Binder.getCallingUid()).zza(new zzeci((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziz), 60000, new HashMap(), zzax, "application/x-protobuf", false));
                } catch (Exception e) {
                    if ((e instanceof zzdxn) && ((zzdxn) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzo().zzv(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfka zzfkaVar) {
        zzcca.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkj
            @Override // java.lang.Runnable
            public final void run() {
                zzfkk.this.zzc(zzfkaVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfka zzfkaVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        this.zzh = com.google.android.gms.ads.internal.util.zzt.zzp(this.zze);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziA)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkW)).booleanValue()) {
                        long j = intValue;
                        zzcca.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = intValue;
                        zzcca.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzfkaVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziB)).intValue()) {
                    return;
                }
                zzfkm zza2 = zzfkn.zza();
                zza2.zzt(zzfkaVar.zzl());
                zza2.zzp(zzfkaVar.zzk());
                zza2.zzg(zzfkaVar.zzb());
                zza2.zzv(3);
                zza2.zzm(this.zzf.zza);
                zza2.zzb(this.zzh);
                zza2.zzk(Build.VERSION.RELEASE);
                zza2.zzq(Build.VERSION.SDK_INT);
                zza2.zzu(zzfkaVar.zzn());
                zza2.zzj(zzfkaVar.zza());
                zza2.zze(this.zzi);
                zza2.zzs(zzfkaVar.zzm());
                zza2.zzc(zzfkaVar.zzd());
                zza2.zzf(zzfkaVar.zzf());
                zza2.zzh(zzfkaVar.zzg());
                zza2.zzi(this.zzj.zzc(zzfkaVar.zzg()));
                zza2.zzl(zzfkaVar.zzh());
                zza2.zzd(zzfkaVar.zze());
                zza2.zzr(zzfkaVar.zzj());
                zza2.zzn(zzfkaVar.zzi());
                zza2.zzo(zzfkaVar.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziF)).booleanValue()) {
                    zza2.zza(this.zzk);
                }
                zzfkp zzfkpVar = this.zzg;
                zzfkq zza3 = zzfkr.zza();
                zza3.zza(zza2);
                zzfkpVar.zzb(zza3);
            }
        }
    }
}
