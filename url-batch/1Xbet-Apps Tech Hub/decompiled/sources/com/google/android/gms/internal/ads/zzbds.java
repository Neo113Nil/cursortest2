package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbds {
    private final Map zza = new HashMap();
    private final zzbdu zzb;

    public zzbds(zzbdu zzbduVar) {
        this.zzb = zzbduVar;
    }

    public final zzbdu zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbdr zzbdrVar) {
        this.zza.put(str, zzbdrVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbdr zzbdrVar = (zzbdr) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbdrVar != null) {
            this.zzb.zze(zzbdrVar, j, strArr);
        }
        this.zza.put(str, new zzbdr(j, null, null));
    }
}
