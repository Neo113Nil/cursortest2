package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfzh extends zzfzq {
    private final Map zza;

    zzfzh(zzarw zzarwVar, zzfym zzfymVar, Map map, zzgea zzgeaVar) {
        super("uQz4dxkf+WOUr5wO4tTY9oXNYZ2ptQNPPdZqIAtAnawrI3JfbJ94yRS4TeqtMQNm", "6O6kCb1xkUau22Q8zOpKfx2DsGNNbnckYsUMgkTzV8k=", zzarwVar, zzfymVar, zzgeaVar.zza(118));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzarwVar) {
            zzarwVar.zzf(((Long) objArr2[0]).longValue());
            long longValue = ((Long) objArr2[1]).longValue();
            if (longValue >= 0) {
                zzarwVar.zzW(longValue);
            }
            long longValue2 = ((Long) objArr2[2]).longValue();
            if (longValue2 >= 0) {
                zzarwVar.zzX(longValue2);
            }
        }
    }
}
