package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfzr extends zzfzq {
    private final Map zza;
    private final zzfvd zzb;

    zzfzr(zzarw zzarwVar, zzfym zzfymVar, zzfvd zzfvdVar, Map map, zzgea zzgeaVar) {
        super("MyLxR1pMFGwyuXCFxqxDf1jJ5oKBspzV9lK349knbnFr/PmtUz79GA/JJhJhenRe", "A2ZIKzWsYU3wpWn3DEkr9CMCZSOv7KW9B603redDmN0=", zzarwVar, zzfymVar, zzgeaVar.zza(122));
        this.zza = map;
        this.zzb = zzfvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.zza;
        lArr[0] = (Long) zzggz.zza((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) zzggz.zza((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) zzggz.zza((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) zzggz.zza((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) zzggz.zza((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) zzggz.zza((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) zzggz.zza((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) zzggz.zza((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) zzggz.zza((Long) map.get("tst"), -1L);
        for (int i = 0; i < 9; i++) {
            if (lArr[i] == null) {
                lArr[i] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.zzb.ordinal()));
        lArr2.getClass();
        Long[] lArr3 = lArr2;
        synchronized (zzarwVar) {
            zzarwVar.zzac(lArr3[0].longValue());
            zzarwVar.zzs(lArr3[1].longValue());
            zzarwVar.zzn(lArr3[2].longValue());
            zzarwVar.zzk(lArr3[3].longValue());
            zzarwVar.zzY(lArr3[4].longValue());
            zzarwVar.zzZ(lArr3[5].longValue());
            zzarwVar.zzF(lArr3[6].longValue());
            zzarwVar.zzG(lArr3[7].longValue());
        }
    }
}
