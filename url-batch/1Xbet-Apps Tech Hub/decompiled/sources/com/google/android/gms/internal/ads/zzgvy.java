package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgvy {
    static final zzgvy zza = new zzgvy(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgvy zzd;
    private final Map zze;

    zzgvy() {
        this.zze = new HashMap();
    }

    public static zzgvy zza() {
        return zza;
    }

    public final zzgwk zzc(zzgxw zzgxwVar, int i) {
        return (zzgwk) this.zze.get(new zzgvx(zzgxwVar, i));
    }

    zzgvy(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgvy zzb() {
        zzgvy zzgvyVar = zzd;
        if (zzgvyVar != null) {
            return zzgvyVar;
        }
        synchronized (zzgvy.class) {
            zzgvy zzgvyVar2 = zzd;
            if (zzgvyVar2 != null) {
                return zzgvyVar2;
            }
            zzgvy zzb2 = zzgwg.zzb(zzgvy.class);
            zzd = zzb2;
            return zzb2;
        }
    }
}
