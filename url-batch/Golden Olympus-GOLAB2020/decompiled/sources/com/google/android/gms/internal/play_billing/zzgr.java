package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzgr implements zzgz {
    private final zzgz[] zza;

    zzgr(zzgz... zzgzVarArr) {
        this.zza = zzgzVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgz
    public final zzgy zzb(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            zzgz zzgzVar = this.zza[i4];
            if (zzgzVar.zzc(cls)) {
                return zzgzVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzgz
    public final boolean zzc(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (this.zza[i4].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
