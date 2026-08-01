package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcxr {
    private final Context zza;
    private final zzfeq zzb;
    private final Bundle zzc;
    private final zzfei zzd;
    private final zzcxj zze;
    private final zzega zzf;

    /* synthetic */ zzcxr(zzcxp zzcxpVar, zzcxq zzcxqVar) {
        Context context;
        zzfeq zzfeqVar;
        Bundle bundle;
        zzfei zzfeiVar;
        zzcxj zzcxjVar;
        zzega zzegaVar;
        context = zzcxpVar.zza;
        this.zza = context;
        zzfeqVar = zzcxpVar.zzb;
        this.zzb = zzfeqVar;
        bundle = zzcxpVar.zzc;
        this.zzc = bundle;
        zzfeiVar = zzcxpVar.zzd;
        this.zzd = zzfeiVar;
        zzcxjVar = zzcxpVar.zze;
        this.zze = zzcxjVar;
        zzegaVar = zzcxpVar.zzf;
        this.zzf = zzegaVar;
    }

    final Context zza(Context context) {
        return this.zza;
    }

    final Bundle zzb() {
        return this.zzc;
    }

    final zzcxj zzc() {
        return this.zze;
    }

    final zzcxp zzd() {
        zzcxp zzcxpVar = new zzcxp();
        zzcxpVar.zze(this.zza);
        zzcxpVar.zzi(this.zzb);
        zzcxpVar.zzf(this.zzc);
        zzcxpVar.zzg(this.zze);
        zzcxpVar.zzd(this.zzf);
        return zzcxpVar;
    }

    final zzega zze(String str) {
        zzega zzegaVar = this.zzf;
        return zzegaVar != null ? zzegaVar : new zzega(str);
    }

    final zzfei zzf() {
        return this.zzd;
    }

    final zzfeq zzg() {
        return this.zzb;
    }
}
