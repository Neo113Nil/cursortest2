package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfkh implements Runnable {
    private final zzfkk zzb;
    private String zzc;
    private String zzd;
    private zzfeg zze;
    private com.google.android.gms.ads.internal.client.zze zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    zzfkh(zzfkk zzfkkVar) {
        this.zzb = zzfkkVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfkh zza(zzfjw zzfjwVar) {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfjwVar.zzi();
            list.add(zzfjwVar);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcca.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziC)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfkh zzb(String str) {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue() && zzfkg.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfkh zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            this.zzf = zzeVar;
        }
        return this;
    }

    public final synchronized zzfkh zzd(ArrayList arrayList) {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzh = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.zzh = 6;
                            }
                        }
                        this.zzh = 5;
                    }
                    this.zzh = 8;
                }
                this.zzh = 4;
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzfkh zze(String str) {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfkh zzf(zzfeg zzfegVar) {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            this.zze = zzfegVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfjw zzfjwVar : this.zza) {
                int i = this.zzh;
                if (i != 2) {
                    zzfjwVar.zzm(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfjwVar.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfjwVar.zzk()) {
                    zzfjwVar.zzd(this.zzd);
                }
                zzfeg zzfegVar = this.zze;
                if (zzfegVar != null) {
                    zzfjwVar.zzb(zzfegVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
                    if (zzeVar != null) {
                        zzfjwVar.zza(zzeVar);
                    }
                }
                this.zzb.zzb(zzfjwVar.zzl());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfkh zzh(int i) {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            this.zzh = i;
        }
        return this;
    }
}
