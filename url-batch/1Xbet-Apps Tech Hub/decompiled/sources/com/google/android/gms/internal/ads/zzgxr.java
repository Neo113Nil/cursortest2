package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgxr {
    zzgxr() {
    }

    public static final boolean zza(Object obj) {
        return !((zzgxq) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzgxq zzgxqVar = (zzgxq) obj;
        zzgxq zzgxqVar2 = (zzgxq) obj2;
        if (!zzgxqVar2.isEmpty()) {
            if (!zzgxqVar.zze()) {
                zzgxqVar = zzgxqVar.zzb();
            }
            zzgxqVar.zzd(zzgxqVar2);
        }
        return zzgxqVar;
    }
}
