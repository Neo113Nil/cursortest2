package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes3.dex */
final class zzlp {
    private static final zzlo zza;
    private static final zzlo zzb;

    static {
        zzlo zzloVar = null;
        try {
            zzloVar = (zzlo) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzloVar;
        zzb = new zzlo();
    }

    static zzlo zza() {
        return zza;
    }

    static zzlo zzb() {
        return zzb;
    }
}
