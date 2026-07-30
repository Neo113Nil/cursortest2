package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzerz implements zzese {
    final /* synthetic */ zzesa zza;

    zzerz(zzesa zzesaVar) {
        Objects.requireNonNull(zzesaVar);
        this.zza = zzesaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcwf zzcwfVar = (zzcwf) obj;
        zzesa zzesaVar = this.zza;
        synchronized (zzesaVar) {
            zzesaVar.zze(zzcwfVar.zzn());
            zzcwfVar.zzj();
        }
    }
}
