package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzicx {
    zzicx() {
    }

    public static final boolean zza(Object obj) {
        return !((zzicw) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzicw zzicwVar = (zzicw) obj;
        zzicw zzicwVar2 = (zzicw) obj2;
        if (!zzicwVar2.isEmpty()) {
            if (!zzicwVar.zze()) {
                zzicwVar = zzicwVar.zzc();
            }
            zzicwVar.zzb(zzicwVar2);
        }
        return zzicwVar;
    }
}
