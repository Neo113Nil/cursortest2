package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfzf extends zzfzq {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    zzfzf(zzarw zzarwVar, zzfym zzfymVar, zzgea zzgeaVar) {
        super("4EuCewMNo7oy5HJGjIHWZVxouDpcyFQvVYKjdCC+HW0E6LLnkuCZqI8dzQVnGx8e", "LgWy0irzLAc0ySGOZyKJEvwv+9ISzhvaYv1Kh0MSt9M=", zzarwVar, zzfymVar, zzgeaVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    Long l = (Long) method.invoke("", new Object[0]);
                    if (l == null) {
                        throw null;
                    }
                    Long l2 = l;
                    zza = l;
                }
            }
        }
        synchronized (zzarwVar) {
            if (zza != null) {
                zzarwVar.zzm(zza.longValue());
            }
        }
    }
}
