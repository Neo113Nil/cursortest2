package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfln {
    private final HashMap zza = new HashMap();

    public final zzflm zza(zzfld zzfldVar, Context context, zzfkv zzfkvVar, zzfls zzflsVar) {
        HashMap hashMap = this.zza;
        zzflm zzflmVar = (zzflm) hashMap.get(zzfldVar);
        if (zzflmVar != null) {
            return zzflmVar;
        }
        zzfla zzflaVar = new zzfla(zzflg.zza(zzfldVar, context));
        zzflm zzflmVar2 = new zzflm(zzflaVar, new zzflv(zzflaVar, zzfkvVar, zzflsVar));
        hashMap.put(zzfldVar, zzflmVar2);
        return zzflmVar2;
    }
}
