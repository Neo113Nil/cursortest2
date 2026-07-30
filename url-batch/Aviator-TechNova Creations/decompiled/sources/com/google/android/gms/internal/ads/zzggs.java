package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzggs extends zzghb {
    private final Map zza;

    zzggs(zzawg zzawgVar, zzgfx zzgfxVar, Map map, zzgoe zzgoeVar) {
        super("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", zzawgVar, zzgfxVar, zzgoeVar.zza(Opcodes.FNEG));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzawgVar) {
            zzawgVar.zzf(((Long) objArr2[0]).longValue());
            long longValue = ((Long) objArr2[1]).longValue();
            if (longValue >= 0) {
                zzawgVar.zzW(longValue);
            }
            long longValue2 = ((Long) objArr2[2]).longValue();
            if (longValue2 >= 0) {
                zzawgVar.zzX(longValue2);
            }
        }
    }
}
