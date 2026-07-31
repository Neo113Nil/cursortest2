package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzajv {
    static final zzajv zza = new zzajv(true);
    private static volatile boolean zzb = false;
    private final Map<zzaju, zzakg.zzf<?, ?>> zzc;

    zzajv() {
        this.zzc = new HashMap();
    }

    public static zzajv zza() {
        return zza;
    }

    public final <ContainingType extends zzaln> zzakg.zzf<ContainingType, ?> zza(ContainingType containingtype, int i4) {
        return (zzakg.zzf) this.zzc.get(new zzaju(containingtype, i4));
    }

    private zzajv(boolean z4) {
        this.zzc = Collections.EMPTY_MAP;
    }
}
