package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhdo implements zzhec, zzhdj {
    private static final Object zza = new Object();
    private volatile zzhec zzb;
    private volatile Object zzc = zza;

    private zzhdo(zzhec zzhecVar) {
        this.zzb = zzhecVar;
    }

    public static zzhdj zza(zzhec zzhecVar) {
        if (zzhecVar instanceof zzhdj) {
            return (zzhdj) zzhecVar;
        }
        zzhecVar.getClass();
        return new zzhdo(zzhecVar);
    }

    public static zzhec zzc(zzhec zzhecVar) {
        return zzhecVar instanceof zzhdo ? zzhecVar : new zzhdo(zzhecVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
