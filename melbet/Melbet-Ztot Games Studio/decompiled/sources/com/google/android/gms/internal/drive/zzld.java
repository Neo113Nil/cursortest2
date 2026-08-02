package com.google.android.gms.internal.drive;

/* loaded from: classes3.dex */
final class zzld extends zzla {
    private zzld() {
        super();
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final void zza(Object obj, long j) {
        zzc(obj, j).zzbp();
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final <E> void zza(Object obj, Object obj2, long j) {
        zzkp zzc = zzc(obj, j);
        zzkp zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzbo()) {
                zzc = zzc.zzr(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zznd.zza(obj, j, zzc2);
    }

    private static <E> zzkp<E> zzc(Object obj, long j) {
        return (zzkp) zznd.zzo(obj, j);
    }
}
