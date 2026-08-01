package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zztr implements zzuu, zzrm {
    final /* synthetic */ zztt zza;
    private final Object zzb;
    private zzut zzc;
    private zzrl zzd;

    public zztr(zztt zzttVar, Object obj) {
        this.zza = zzttVar;
        this.zzc = zzttVar.zze(null);
        this.zzd = zzttVar.zzc(null);
        this.zzb = obj;
    }

    private final zzug zzf(zzug zzugVar, zzuk zzukVar) {
        zztt zzttVar = this.zza;
        Object obj = this.zzb;
        long j = zzugVar.zzc;
        zzttVar.zzx(obj, j, zzukVar);
        zztt zzttVar2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zzugVar.zzd;
        zzttVar2.zzx(obj2, j2, zzukVar);
        return (j == zzugVar.zzc && j2 == zzugVar.zzd) ? zzugVar : new zzug(1, zzugVar.zza, zzugVar.zzb, 0, null, j, j2);
    }

    private final boolean zzg(int i, zzuk zzukVar) {
        zzuk zzukVar2;
        if (zzukVar != null) {
            zzukVar2 = this.zza.zzy(this.zzb, zzukVar);
            if (zzukVar2 == null) {
                return false;
            }
        } else {
            zzukVar2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzut zzutVar = this.zzc;
        int i2 = zzutVar.zza;
        if (!zzfs.zzF(zzutVar.zzb, zzukVar2)) {
            this.zzc = this.zza.zzf(0, zzukVar2);
        }
        zzrl zzrlVar = this.zzd;
        int i3 = zzrlVar.zza;
        if (zzfs.zzF(zzrlVar.zzb, zzukVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzukVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzae(int i, zzuk zzukVar, zzug zzugVar) {
        if (zzg(0, zzukVar)) {
            this.zzc.zzc(zzf(zzugVar, zzukVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzaf(int i, zzuk zzukVar, zzub zzubVar, zzug zzugVar) {
        if (zzg(0, zzukVar)) {
            this.zzc.zzd(zzubVar, zzf(zzugVar, zzukVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzag(int i, zzuk zzukVar, zzub zzubVar, zzug zzugVar) {
        if (zzg(0, zzukVar)) {
            this.zzc.zze(zzubVar, zzf(zzugVar, zzukVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzah(int i, zzuk zzukVar, zzub zzubVar, zzug zzugVar, IOException iOException, boolean z) {
        if (zzg(0, zzukVar)) {
            this.zzc.zzf(zzubVar, zzf(zzugVar, zzukVar), iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzai(int i, zzuk zzukVar, zzub zzubVar, zzug zzugVar) {
        if (zzg(0, zzukVar)) {
            this.zzc.zzg(zzubVar, zzf(zzugVar, zzukVar));
        }
    }
}
