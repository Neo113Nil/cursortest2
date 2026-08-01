package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzgky {
    private final zzguk zza;
    private final Class zzb;

    /* synthetic */ zzgky(zzguk zzgukVar, Class cls, zzgkx zzgkxVar) {
        this.zza = zzgukVar;
        this.zzb = cls;
    }

    public static zzgky zzb(zzgkw zzgkwVar, zzguk zzgukVar, Class cls) {
        return new zzgkv(zzgukVar, cls, zzgkwVar);
    }

    public abstract zzgdd zza(zzglt zzgltVar) throws GeneralSecurityException;

    public final zzguk zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
