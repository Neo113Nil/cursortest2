package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfgv implements zzgax {
    final /* synthetic */ zzfgy zza;
    final /* synthetic */ zzfgz zzb;

    zzfgv(zzfgz zzfgzVar, zzfgy zzfgyVar) {
        this.zzb = zzfgzVar;
        this.zza = zzfgyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfgz zzfgzVar = this.zzb;
            i = zzfgzVar.zzf;
            if (i == 1) {
                zzfgzVar.zzh();
            }
        }
    }
}
