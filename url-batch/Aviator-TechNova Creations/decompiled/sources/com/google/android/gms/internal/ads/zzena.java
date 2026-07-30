package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzena implements zzgzl {
    final /* synthetic */ zzfir zza;
    final /* synthetic */ zzenb zzb;

    zzena(zzenb zzenbVar, zzfir zzfirVar) {
        this.zza = zzfirVar;
        Objects.requireNonNull(zzenbVar);
        this.zzb = zzenbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzenb zzenbVar = this.zzb;
        synchronized (zzenbVar) {
            zzenc zzc = zzenbVar.zzc();
            zzfir zzfirVar = this.zza;
            zzc.zzc(th, zzfirVar);
            zzfir zza = zzenbVar.zzc().zza();
            if (zzfirVar.zzav) {
                while (zza != null) {
                    zzenbVar.zzb(zza);
                    zza = zzenbVar.zzc().zza();
                }
            } else if (zza != null) {
                zzenbVar.zzb(zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzenb zzenbVar = this.zzb;
        zzens zzensVar = (zzens) obj;
        synchronized (zzenbVar) {
            zzenbVar.zzc().zzb(zzensVar, this.zza);
            zzfir zza = zzenbVar.zzc().zza();
            if (zza != null) {
                zzenbVar.zzb(zza);
            }
        }
    }
}
