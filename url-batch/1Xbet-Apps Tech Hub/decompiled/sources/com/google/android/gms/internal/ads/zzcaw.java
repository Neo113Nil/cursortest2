package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcaw {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcba zzc;
    private boolean zzd;
    private Context zze;
    private zzcbt zzf;
    private String zzg;
    private zzbdk zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzcav zzl;
    private final Object zzm;
    private ListenableFuture zzn;
    private final AtomicBoolean zzo;

    public zzcaw() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcba(com.google.android.gms.ads.internal.client.zzay.zzd(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzcav(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    public final Context zzd() {
        return this.zze;
    }

    public final Resources zze() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkd)).booleanValue()) {
                return zzcbr.zza(this.zze).getResources();
            }
            zzcbr.zza(this.zze).getResources();
            return null;
        } catch (zzcbq e) {
            zzcbn.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final zzbdk zzg() {
        zzbdk zzbdkVar;
        synchronized (this.zza) {
            zzbdkVar = this.zzh;
        }
        return zzbdkVar;
    }

    public final zzcba zzh() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzi() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final ListenableFuture zzk() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcz)).booleanValue()) {
                synchronized (this.zzm) {
                    ListenableFuture listenableFuture = this.zzn;
                    if (listenableFuture != null) {
                        return listenableFuture;
                    }
                    ListenableFuture zzb = zzcca.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcar
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzcaw.this.zzo();
                        }
                    });
                    this.zzn = zzb;
                    return zzb;
                }
            }
        }
        return zzgbb.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzn() {
        return this.zzg;
    }

    final /* synthetic */ ArrayList zzo() throws Exception {
        Context zza = zzbwo.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    public final void zzu(Context context, zzcbt zzcbtVar) {
        zzbdk zzbdkVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzcbtVar;
                com.google.android.gms.ads.internal.zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzbus.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzt.zze();
                if (((Boolean) zzbep.zzc.zze()).booleanValue()) {
                    zzbdkVar = new zzbdk();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbdkVar = null;
                }
                this.zzh = zzbdkVar;
                if (zzbdkVar != null) {
                    zzccd.zza(new zzcas(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzil)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcat(this));
                    }
                }
                this.zzd = true;
                zzk();
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzcbtVar.zza);
    }

    public final void zzv(Throwable th, String str) {
        zzbus.zzb(this.zze, this.zzf).zzg(th, str, ((Double) zzbfe.zzg.zze()).floatValue());
    }

    public final void zzw(Throwable th, String str) {
        zzbus.zzb(this.zze, this.zzf).zzf(th, str);
    }

    public final void zzx(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzy(String str) {
        this.zzg = str;
    }

    public final boolean zzz(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzil)).booleanValue()) {
                return this.zzo.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
