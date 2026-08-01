package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfgr {
    private final HashMap zza = new HashMap();

    public final zzfgq zza(zzfgh zzfghVar, Context context, zzffz zzffzVar, zzfgx zzfgxVar) {
        zzfgq zzfgqVar = (zzfgq) this.zza.get(zzfghVar);
        if (zzfgqVar != null) {
            return zzfgqVar;
        }
        zzfge zzfgeVar = new zzfge(zzfgk.zza(zzfghVar, context));
        zzfgq zzfgqVar2 = new zzfgq(zzfgeVar, new zzfgz(zzfgeVar, zzffzVar, zzfgxVar));
        this.zza.put(zzfghVar, zzfgqVar2);
        return zzfgqVar2;
    }
}
