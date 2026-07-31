package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import kotlin.coroutines.d;
import o2.AbstractC3337k;
import o2.Q;

/* loaded from: classes.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j4, d dVar) {
        return zzcv.zzh(zza(application), str, j4, null, null, null, dVar, 28, null);
    }

    public static final Task zzc(Application application, String str, long j4) {
        Q b4;
        b4 = AbstractC3337k.b(zza(application).zzd().zza(), null, null, new zzco(application, str, j4, null), 3, null);
        return zzas.zza(b4);
    }

    public static final Object zzd(Application application, String str, d dVar) {
        Object zzh;
        zzh = zzcv.zzh(r0, str, 0L, null, zza(application).zzf, zzch.zzb, dVar, 2, null);
        return zzh;
    }

    public static final Task zze(Application application, String str) {
        Q b4;
        b4 = AbstractC3337k.b(zza(application).zzd().zza(), null, null, new zzcp(application, str, null), 3, null);
        return zzas.zza(b4);
    }
}
