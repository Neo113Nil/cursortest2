package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdgx extends zzctr {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdfi zze;
    private final zzdig zzf;
    private final zzcum zzg;
    private final zzfoe zzh;
    private final zzcyu zzi;
    private final zzcba zzj;
    private boolean zzk;

    zzdgx(zzctq zzctqVar, Context context, @Nullable zzcgv zzcgvVar, zzdfi zzdfiVar, zzdig zzdigVar, zzcum zzcumVar, zzfoe zzfoeVar, zzcyu zzcyuVar, zzcba zzcbaVar) {
        super(zzctqVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcgvVar);
        this.zze = zzdfiVar;
        this.zzf = zzdigVar;
        this.zzg = zzcumVar;
        this.zzh = zzfoeVar;
        this.zzi = zzcyuVar;
        this.zzj = zzcbaVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcgv zzcgvVar = (zzcgv) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgK)).booleanValue()) {
                if (!this.zzk && zzcgvVar != null) {
                    zzcca.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgw
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z, @Nullable Activity activity) {
        zzfdu zzD;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaA)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzF(this.zzc)) {
                zzcbn.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaB)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzcgv zzcgvVar = (zzcgv) this.zzd.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkX)).booleanValue() || zzcgvVar == null || (zzD = zzcgvVar.zzD()) == null || !zzD.zzar || zzD.zzas == this.zzj.zzb()) {
            if (this.zzk) {
                zzcbn.zzj("The interstitial ad has been shown.");
                this.zzi.zza(zzffr.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzdif e) {
                    this.zzi.zzc(e);
                }
            }
        } else {
            zzcbn.zzj("The interstitial consent form has been shown.");
            this.zzi.zza(zzffr.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }
}
