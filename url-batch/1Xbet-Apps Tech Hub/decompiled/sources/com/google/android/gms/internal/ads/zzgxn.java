package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgxn implements zzgxu {
    private final zzgxu[] zza;

    zzgxn(zzgxu... zzgxuVarArr) {
        this.zza = zzgxuVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final zzgxt zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzgxu zzgxuVar = this.zza[i];
            if (zzgxuVar.zzc(cls)) {
                return zzgxuVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
