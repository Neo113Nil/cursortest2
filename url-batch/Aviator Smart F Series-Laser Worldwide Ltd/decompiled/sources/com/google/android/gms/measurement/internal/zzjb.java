package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzjb implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlj zzc;
    final /* synthetic */ zzjy zzd;

    zzjb(zzjy zzjyVar, zzq zzqVar, boolean z7, zzlj zzljVar) {
        this.zzd = zzjyVar;
        this.zza = zzqVar;
        this.zzb = z7;
        this.zzc = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzek zzekVar;
        zzjy zzjyVar = this.zzd;
        zzekVar = zzjyVar.zzb;
        if (zzekVar == null) {
            zzjyVar.zzt.zzaA().zzd().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzekVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
