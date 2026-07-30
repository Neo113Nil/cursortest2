package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzkz implements Callable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzlg zzb;

    zzkz(zzlg zzlgVar, zzq zzqVar) {
        this.zzb = zzlgVar;
        this.zza = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzai zzh = this.zzb.zzh((String) Preconditions.checkNotNull(this.zza.zza));
        zzah zzahVar = zzah.ANALYTICS_STORAGE;
        if (zzh.zzi(zzahVar) && zzai.zzb(this.zza.zzv).zzi(zzahVar)) {
            return this.zzb.zzd(this.zza).zzv();
        }
        this.zzb.zzaA().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
