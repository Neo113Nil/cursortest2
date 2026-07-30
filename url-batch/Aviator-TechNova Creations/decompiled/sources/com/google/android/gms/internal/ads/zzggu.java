package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzggu extends zzghb {
    private final Context zza;

    zzggu(zzawg zzawgVar, zzgfx zzgfxVar, Context context, zzgoe zzgoeVar) {
        super("10eHn0oEJc+Kv4xHAilDadQXUH+Qd7+H1wb3g/5791dKT43oKLnvfFcwz9lBLCYb", "DO5TusvTbmxbLfPhMKcHxON+YLmz+u+OpsMl13dRFcs=", zzawgVar, zzgfxVar, zzgoeVar.zza(Opcodes.DNEG));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzawgVar) {
            zzawgVar.zzc(((Long) objArr2[0]).longValue());
            zzawgVar.zzP(((Long) objArr2[1]).longValue());
        }
    }
}
