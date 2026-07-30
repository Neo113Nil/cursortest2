package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzics implements zzida {
    private final zzida[] zza;

    zzics(zzida... zzidaVarArr) {
        this.zza = zzidaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzicz zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzida zzidaVar = this.zza[i];
            if (zzidaVar.zzb(cls)) {
                return zzidaVar.zzc(cls);
            }
        }
        String name = cls.getName();
        String.valueOf(name);
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(name)));
    }
}
