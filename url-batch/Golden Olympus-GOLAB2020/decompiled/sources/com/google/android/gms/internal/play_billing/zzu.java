package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class zzu {
    public static zzdc zza(zzr zzrVar) {
        zzp zzpVar = new zzp();
        zzt zztVar = new zzt(zzpVar);
        zzpVar.zzb = zztVar;
        zzpVar.zza = zzrVar.getClass();
        try {
            zzpVar.zza = zzrVar.zza(zzpVar);
            return zztVar;
        } catch (Exception e4) {
            zztVar.zzc(e4);
            return zztVar;
        }
    }
}
