package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzglg {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzglg(Class cls, Class cls2, zzglf zzglfVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzglg zzb(zzgle zzgleVar, Class cls, Class cls2) {
        return new zzgld(cls, cls2, zzgleVar);
    }

    public abstract Object zza(zzgcp zzgcpVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
