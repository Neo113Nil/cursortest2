package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfzj extends zzfzq {
    private final Context zza;

    zzfzj(zzarw zzarwVar, zzfym zzfymVar, Context context, zzgea zzgeaVar) {
        super("A8km1fKhVCEOHft43zU9Y3DGoNIs4mavU3BMf8IOeia1/wV0xy5wGwT3F8eyloUl", "Cy7/BJEWRZ7R8lyzDpb6G4eaYqNDtTlzBP7NVvGHRcQ=", zzarwVar, zzfymVar, zzgeaVar.zza(119));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzarwVar) {
            zzarwVar.zzc(((Long) objArr2[0]).longValue());
            zzarwVar.zzP(((Long) objArr2[1]).longValue());
        }
    }
}
