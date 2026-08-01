package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzdm implements zzdo {
    private zzdr zza;

    public static void zza(zzdr zzdrVar, zzdr zzdrVar2) {
        zzdm zzdmVar = (zzdm) zzdrVar;
        if (zzdmVar.zza != null) {
            throw new IllegalStateException();
        }
        zzdmVar.zza = zzdrVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        zzdr zzdrVar = this.zza;
        if (zzdrVar != null) {
            return zzdrVar.zzb();
        }
        throw new IllegalStateException();
    }
}
