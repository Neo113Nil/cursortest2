package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes3.dex */
final class zzlf {
    private static final zzle zza;
    private static final zzle zzb;

    static {
        zzle zzleVar = null;
        try {
            zzleVar = (zzle) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzleVar;
        zzb = new zzle();
    }

    static zzle zza() {
        return zza;
    }

    static zzle zzb() {
        return zzb;
    }
}
