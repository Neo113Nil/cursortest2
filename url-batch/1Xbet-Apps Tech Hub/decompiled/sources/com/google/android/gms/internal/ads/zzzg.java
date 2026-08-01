package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzzg implements zzcs {
    private final zzdp zza;

    public zzzg(zzdp zzdpVar) {
        this.zza = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final zzct zza(Context context, zzs zzsVar, zzs zzsVar2, zzv zzvVar, zzdr zzdrVar, Executor executor, List list, long j) throws zzdo {
        Constructor<?> constructor;
        Object[] objArr;
        try {
            constructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzdp.class);
            objArr = new Object[1];
        } catch (Exception e) {
            e = e;
        }
        try {
            objArr[0] = this.zza;
            return ((zzcs) constructor.newInstance(objArr)).zza(context, zzsVar, zzsVar2, zzvVar, zzdrVar, executor, list, 0L);
        } catch (Exception e2) {
            e = e2;
            if (e instanceof zzdo) {
                throw ((zzdo) e);
            }
            throw new zzdo(e, -9223372036854775807L);
        }
    }
}
