package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgxs {
    private static final zzgxr zza;
    private static final zzgxr zzb;

    static {
        zzgxr zzgxrVar;
        try {
            zzgxrVar = (zzgxr) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgxrVar = null;
        }
        zza = zzgxrVar;
        zzb = new zzgxr();
    }

    static zzgxr zza() {
        return zza;
    }

    static zzgxr zzb() {
        return zzb;
    }
}
