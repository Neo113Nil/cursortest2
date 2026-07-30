package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzlu extends zzlw {
    /* synthetic */ zzlu(zzlt zzltVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    final void zza(Object obj, long j8) {
        ((zzli) zznu.zzf(obj, j8)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    final void zzb(Object obj, Object obj2, long j8) {
        zzli zzliVar = (zzli) zznu.zzf(obj, j8);
        zzli zzliVar2 = (zzli) zznu.zzf(obj2, j8);
        int size = zzliVar.size();
        int size2 = zzliVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzliVar.zzc()) {
                zzliVar = zzliVar.zzd(size2 + size);
            }
            zzliVar.addAll(zzliVar2);
        }
        if (size > 0) {
            zzliVar2 = zzliVar;
        }
        zznu.zzs(obj, j8, zzliVar2);
    }

    private zzlu() {
        super(null);
    }
}
