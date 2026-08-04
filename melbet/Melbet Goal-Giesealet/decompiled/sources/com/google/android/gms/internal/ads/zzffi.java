package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzffi implements zzgoq {
    final /* synthetic */ zzffl zza;
    final /* synthetic */ zzffn zzb;

    zzffi(zzffn zzffnVar, zzffl zzfflVar) {
        this.zza = zzfflVar;
        Objects.requireNonNull(zzffnVar);
        this.zzb = zzffnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzffn zzffnVar = this.zzb;
        synchronized (zzffnVar) {
            zzffnVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffn zzffnVar = this.zzb;
        synchronized (zzffnVar) {
            zzffnVar.zzf(null);
            zzffnVar.zze().addFirst(this.zza);
            if (zzffnVar.zzg() == 1) {
                zzffnVar.zzd();
            }
        }
    }
}
