package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhhr {
    static final zzhhr zza = new zzhhr(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzhhr zzd;
    private final Map zze;

    zzhhr() {
        this.zze = new HashMap();
    }

    public static zzhhr zza() {
        int i = zzhgo.zza;
        return zza;
    }

    public static zzhhr zzb() {
        zzhhr zzhhrVar = zzd;
        if (zzhhrVar != null) {
            return zzhhrVar;
        }
        synchronized (zzhhr.class) {
            zzhhr zzhhrVar2 = zzd;
            if (zzhhrVar2 != null) {
                return zzhhrVar2;
            }
            int i = zzhgo.zza;
            zzhhr zzb2 = zzhhz.zzb(zzhhr.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzhif zzc(zzhjs zzhjsVar, int i) {
        return (zzhif) this.zze.get(new zzhhq(zzhjsVar, i));
    }

    zzhhr(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
