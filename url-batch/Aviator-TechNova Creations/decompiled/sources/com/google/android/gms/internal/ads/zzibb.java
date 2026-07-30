package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzibb {
    static final zzibb zza = new zzibb(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzibb zzd;
    private final Map zze;

    zzibb() {
        this.zze = new HashMap();
    }

    public static zzibb zza() {
        int i = zziaa.zza;
        return zza;
    }

    public static zzibb zzb() {
        zzibb zzibbVar = zzd;
        if (zzibbVar != null) {
            return zzibbVar;
        }
        synchronized (zzibb.class) {
            zzibb zzibbVar2 = zzd;
            if (zzibbVar2 != null) {
                return zzibbVar2;
            }
            int i = zziaa.zza;
            zzibb zzb2 = zzibj.zzb(zzibb.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzibp zzc(zzidc zzidcVar, int i) {
        return (zzibp) this.zze.get(new zziba(zzidcVar, i));
    }

    zzibb(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
