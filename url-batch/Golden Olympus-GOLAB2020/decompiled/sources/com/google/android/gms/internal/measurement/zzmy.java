package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzmy implements zznf {
    private final zznf[] zza;

    zzmy(zznf... zznfVarArr) {
        this.zza = zznfVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final zzne zzb(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            zznf zznfVar = this.zza[i4];
            if (zznfVar.zzc(cls)) {
                return zznfVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final boolean zzc(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (this.zza[i4].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
