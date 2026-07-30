package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdkn extends zzcwf {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdiq zze;
    private final zzdmc zzf;
    private final zzcxa zzg;
    private final zzfvr zzh;
    private final zzdbs zzi;
    private final zzcdz zzj;
    private final zzdxz zzk;
    private boolean zzl;

    zzdkn(zzcwe zzcweVar, Context context, @Nullable zzcjl zzcjlVar, zzdiq zzdiqVar, zzdmc zzdmcVar, zzcxa zzcxaVar, zzfvr zzfvrVar, zzdbs zzdbsVar, zzcdz zzcdzVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcjlVar);
        this.zze = zzdiqVar;
        this.zzf = zzdmcVar;
        this.zzg = zzcxaVar;
        this.zzh = zzfvrVar;
        this.zzi = zzdbsVar;
        this.zzj = zzcdzVar;
        this.zzk = zzdxzVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcjl zzcjlVar = (zzcjl) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhE)).booleanValue()) {
                if (!this.zzl && zzcjlVar != null) {
                    zzgzy zzgzyVar = zzcei.zzf;
                    Objects.requireNonNull(zzcjlVar);
                    zzgzyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkm
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcjl.this.destroy();
                        }
                    });
                }
            } else if (zzcjlVar != null) {
                zzcjlVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    public final boolean zza(boolean z, @Nullable Activity activity) {
        zzfir zzC;
        zzdiq zzdiqVar = this.zze;
        zzdiqVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdmc zzdmcVar = this.zzf;
        if (!com.google.android.gms.ads.internal.util.zzs.zzT(zzdmcVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzS(this.zzc, this.zzb, this.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbi)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbj)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        zzcjl zzcjlVar = (zzcjl) this.zzd.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue() || zzcjlVar == null || (zzC = zzcjlVar.zzC()) == null || !zzC.zzar || zzC.zzas == this.zzj.zzj()) {
            if (this.zzl) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                this.zzi.zzc(zzfkm.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzl) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    zzdmcVar.zza(z, activity2, this.zzi);
                    zzdiqVar.zzb();
                    this.zzl = true;
                    return true;
                } catch (zzdmb e) {
                    this.zzi.zzd(e);
                }
            }
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial consent form has been shown.");
            this.zzi.zzc(zzfkm.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
