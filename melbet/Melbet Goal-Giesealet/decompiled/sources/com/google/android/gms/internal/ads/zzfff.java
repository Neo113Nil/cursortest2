package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfff {
    private final HashMap zza = new HashMap();

    public final zzffe zza(zzfev zzfevVar, Context context, zzfen zzfenVar, zzffk zzffkVar) {
        HashMap hashMap = this.zza;
        zzffe zzffeVar = (zzffe) hashMap.get(zzfevVar);
        if (zzffeVar != null) {
            return zzffeVar;
        }
        zzfes zzfesVar = new zzfes(zzfey.zza(zzfevVar, context));
        zzffe zzffeVar2 = new zzffe(zzfesVar, new zzffn(zzfesVar, zzfenVar, zzffkVar));
        hashMap.put(zzfevVar, zzffeVar2);
        return zzffeVar2;
    }
}
