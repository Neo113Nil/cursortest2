package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdpy extends zzctr {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdig zze;
    private final zzdfi zzf;
    private final zzcyu zzg;
    private final zzdab zzh;
    private final zzcum zzi;
    private final zzbxg zzj;
    private final zzfoe zzk;
    private final zzfej zzl;
    private boolean zzm;

    zzdpy(zzctq zzctqVar, Context context, zzcgv zzcgvVar, zzdig zzdigVar, zzdfi zzdfiVar, zzcyu zzcyuVar, zzdab zzdabVar, zzcum zzcumVar, zzfdu zzfduVar, zzfoe zzfoeVar, zzfej zzfejVar) {
        super(zzctqVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdigVar;
        this.zzd = new WeakReference(zzcgvVar);
        this.zzf = zzdfiVar;
        this.zzg = zzcyuVar;
        this.zzh = zzdabVar;
        this.zzi = zzcumVar;
        this.zzk = zzfoeVar;
        zzbxc zzbxcVar = zzfduVar.zzm;
        this.zzj = new zzbya(zzbxcVar != null ? zzbxcVar.zza : "", zzbxcVar != null ? zzbxcVar.zzb : 1);
        this.zzl = zzfejVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcgv zzcgvVar = (zzcgv) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgK)).booleanValue()) {
                if (!this.zzm && zzcgvVar != null) {
                    zzcca.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcgv.this.destroy();
                        }
                    });
                }
            } else if (zzcgvVar != null) {
                zzcgvVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbxg zzc() {
        return this.zzj;
    }

    public final zzfej zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcgv zzcgvVar = (zzcgv) this.zzd.get();
        return (zzcgvVar == null || zzcgvVar.zzaB()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z, Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaA)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzF(this.zzc)) {
                zzcbn.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaB)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            zzcbn.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzffr.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdif e) {
            this.zzg.zzc(e);
            return false;
        }
    }
}
