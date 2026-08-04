package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzaxl implements Callable {
    protected final zzavx zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzarw zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxl(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2) {
        getClass().getSimpleName();
        this.zza = zzavxVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzarwVar;
        this.zzf = i;
        this.zzg = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            zzavx zzavxVar = this.zza;
            Method zzo = zzavxVar.zzo(this.zzb, this.zzc);
            this.zze = zzo;
            if (zzo == null) {
                return null;
            }
            zza();
            zzauo zzh = zzavxVar.zzh();
            if (zzh == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzh.zza(this.zzg, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
