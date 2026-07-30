package com.google.android.gms.internal.auth;

/* loaded from: classes3.dex */
final class zzfi extends zzfk {
    /* synthetic */ zzfi(zzfh zzfhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    final void zza(Object obj, long j8) {
        ((zzey) zzhi.zzf(obj, j8)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    final void zzb(Object obj, Object obj2, long j8) {
        zzey zzeyVar = (zzey) zzhi.zzf(obj, j8);
        zzey zzeyVar2 = (zzey) zzhi.zzf(obj2, j8);
        int size = zzeyVar.size();
        int size2 = zzeyVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzeyVar.zzc()) {
                zzeyVar = zzeyVar.zzd(size2 + size);
            }
            zzeyVar.addAll(zzeyVar2);
        }
        if (size > 0) {
            zzeyVar2 = zzeyVar;
        }
        zzhi.zzp(obj, j8, zzeyVar2);
    }

    private zzfi() {
        super(null);
    }
}
