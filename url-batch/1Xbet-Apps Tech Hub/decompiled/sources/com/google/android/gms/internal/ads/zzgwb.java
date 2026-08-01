package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgwb {
    private static final zzgvz zza = new zzgwa();
    private static final zzgvz zzb;

    static {
        zzgvz zzgvzVar;
        try {
            zzgvzVar = (zzgvz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgvzVar = null;
        }
        zzb = zzgvzVar;
    }

    static zzgvz zza() {
        zzgvz zzgvzVar = zzb;
        if (zzgvzVar != null) {
            return zzgvzVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzgvz zzb() {
        return zza;
    }
}
