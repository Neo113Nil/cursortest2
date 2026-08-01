package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdto {
    final /* synthetic */ zzdtp zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdto(zzdtp zzdtpVar) {
        this.zza = zzdtpVar;
    }

    static /* bridge */ /* synthetic */ zzdto zza(zzdto zzdtoVar) {
        zzdtoVar.zzb.putAll(zzdtoVar.zza.zzc);
        return zzdtoVar;
    }

    public final zzdto zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdto zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdto zzd(zzfdu zzfduVar) {
        this.zzb.put("aai", zzfduVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgZ)).booleanValue()) {
            zzc("rid", zzfduVar.zzao);
        }
        return this;
    }

    public final zzdto zze(zzfdy zzfdyVar) {
        this.zzb.put("gqi", zzfdyVar.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtm
            @Override // java.lang.Runnable
            public final void run() {
                zzdto.this.zzi();
            }
        });
    }

    public final void zzh() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtn
            @Override // java.lang.Runnable
            public final void run() {
                zzdto.this.zzj();
            }
        });
    }

    final /* synthetic */ void zzi() {
        this.zza.zza.zzf(this.zzb);
    }

    final /* synthetic */ void zzj() {
        this.zza.zza.zze(this.zzb);
    }
}
