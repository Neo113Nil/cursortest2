package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzglc {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzglc(Class cls, Class cls2, zzglb zzglbVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzglc zzb(zzgla zzglaVar, Class cls, Class cls2) {
        return new zzgkz(cls, cls2, zzglaVar);
    }

    public abstract zzglt zza(zzgdd zzgddVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
