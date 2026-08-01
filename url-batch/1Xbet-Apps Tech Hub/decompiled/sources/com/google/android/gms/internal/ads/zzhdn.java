package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhdn implements zzhdp {
    private zzhec zza;

    public static void zza(zzhec zzhecVar, zzhec zzhecVar2) {
        zzhdn zzhdnVar = (zzhdn) zzhecVar;
        if (zzhdnVar.zza != null) {
            throw new IllegalStateException();
        }
        zzhdnVar.zza = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final Object zzb() {
        zzhec zzhecVar = this.zza;
        if (zzhecVar != null) {
            return zzhecVar.zzb();
        }
        throw new IllegalStateException();
    }
}
