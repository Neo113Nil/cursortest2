package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzaha {
    private final String zza;
    private final zzaih zzb;

    public zzaha(String str, zzaih zzaihVar) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = (zzaih) Preconditions.checkNotNull(zzaihVar);
    }

    public final zzaih zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
