package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzgjy {
    private final zzguk zza;
    private final Class zzb;

    /* synthetic */ zzgjy(zzguk zzgukVar, Class cls, zzgjx zzgjxVar) {
        this.zza = zzgukVar;
        this.zzb = cls;
    }

    public static zzgjy zzb(zzgjw zzgjwVar, zzguk zzgukVar, Class cls) {
        return new zzgjv(zzgukVar, cls, zzgjwVar);
    }

    public abstract zzgcp zza(zzglt zzgltVar, @Nullable zzgdp zzgdpVar) throws GeneralSecurityException;

    public final zzguk zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
