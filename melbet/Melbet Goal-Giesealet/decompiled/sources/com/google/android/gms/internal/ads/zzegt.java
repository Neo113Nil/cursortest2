package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzegt implements zzgoq {
    final /* synthetic */ zzfcj zza;
    final /* synthetic */ zzegu zzb;

    zzegt(zzegu zzeguVar, zzfcj zzfcjVar) {
        this.zza = zzfcjVar;
        Objects.requireNonNull(zzeguVar);
        this.zzb = zzeguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzegu zzeguVar = this.zzb;
        synchronized (zzeguVar) {
            zzegv zzc = zzeguVar.zzc();
            zzfcj zzfcjVar = this.zza;
            zzc.zzc(th, zzfcjVar);
            zzfcj zza = zzeguVar.zzc().zza();
            if (zzfcjVar.zzav) {
                while (zza != null) {
                    zzeguVar.zzb(zza);
                    zza = zzeguVar.zzc().zza();
                }
            } else if (zza != null) {
                zzeguVar.zzb(zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzegu zzeguVar = this.zzb;
        zzehl zzehlVar = (zzehl) obj;
        synchronized (zzeguVar) {
            zzeguVar.zzc().zzb(zzehlVar, this.zza);
            zzfcj zza = zzeguVar.zzc().zza();
            if (zza != null) {
                zzeguVar.zzb(zza);
            }
        }
    }
}
