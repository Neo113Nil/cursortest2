package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzabx implements zzado {
    final /* synthetic */ zzacc zza;

    zzabx(zzacc zzaccVar) {
        Objects.requireNonNull(zzaccVar);
        this.zza = zzaccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zza() {
        zzmk zzaY;
        zzaY = this.zza.zzaY();
        if (zzaY != null) {
            zzaY.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzb() {
        zzacc zzaccVar = this.zza;
        if (zzaccVar.zzbk() != null) {
            zzaccVar.zzbj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzc() {
        zzacc zzaccVar = this.zza;
        if (zzaccVar.zzbk() != null) {
            zzaccVar.zzaw(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzd(zzbv zzbvVar) {
    }
}
