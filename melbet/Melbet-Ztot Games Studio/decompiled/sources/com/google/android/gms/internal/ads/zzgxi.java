package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzgxi {
    static final zzgxi zza = new zzgxi(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgxi zzd;
    private final Map zze;

    zzgxi() {
        this.zze = new HashMap();
    }

    public static zzgxi zza() {
        int i = zzgzt.zza;
        return zza;
    }

    public static zzgxi zzb() {
        zzgxi zzgxiVar = zzd;
        if (zzgxiVar != null) {
            return zzgxiVar;
        }
        synchronized (zzgxi.class) {
            zzgxi zzgxiVar2 = zzd;
            if (zzgxiVar2 != null) {
                return zzgxiVar2;
            }
            int i = zzgzt.zza;
            zzgxi zzb2 = zzgxq.zzb(zzgxi.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgxw zzc(zzgzj zzgzjVar, int i) {
        return (zzgxw) this.zze.get(new zzgxh(zzgzjVar, i));
    }

    zzgxi(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
