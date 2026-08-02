package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public abstract class zzaxd implements Callable {
    protected final zzavp zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzaro zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxd(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i, int i2) {
        getClass().getSimpleName();
        this.zza = zzavpVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaroVar;
        this.zzf = i;
        this.zzg = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zza.zzj(this.zzb, this.zzc);
            this.zze = zzj;
            if (zzj == null) {
                return null;
            }
            zza();
            zzauj zzd = this.zza.zzd();
            if (zzd == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzd.zzc(this.zzg, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
