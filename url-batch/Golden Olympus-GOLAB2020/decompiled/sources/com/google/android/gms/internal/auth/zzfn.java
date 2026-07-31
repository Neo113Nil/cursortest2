package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzfn implements zzfu {
    private final zzfu[] zza;

    zzfn(zzfu... zzfuVarArr) {
        this.zza = zzfuVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final zzft zzb(Class cls) {
        zzfu[] zzfuVarArr = this.zza;
        for (int i4 = 0; i4 < 2; i4++) {
            zzfu zzfuVar = zzfuVarArr[i4];
            if (zzfuVar.zzc(cls)) {
                return zzfuVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzc(Class cls) {
        zzfu[] zzfuVarArr = this.zza;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzfuVarArr[i4].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
