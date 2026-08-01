package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzheb implements zzhec {
    private static final Object zza = new Object();
    private volatile zzhec zzb;
    private volatile Object zzc = zza;

    private zzheb(zzhec zzhecVar) {
        this.zzb = zzhecVar;
    }

    public static zzhec zza(zzhec zzhecVar) {
        return ((zzhecVar instanceof zzheb) || (zzhecVar instanceof zzhdo)) ? zzhecVar : new zzheb(zzhecVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhec zzhecVar = this.zzb;
        if (zzhecVar == null) {
            return this.zzc;
        }
        Object zzb = zzhecVar.zzb();
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }
}
