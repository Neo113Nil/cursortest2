package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzdp implements zzdo {
    private static final zzdp zza = new zzdp(null);
    private final Object zzb;

    private zzdp(Object obj) {
        this.zzb = obj;
    }

    public static zzdo zza(Object obj) {
        if (obj != null) {
            return new zzdp(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        return this.zzb;
    }
}
