package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzaux implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzatj zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzapg zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzaux(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2) {
        this.zzb = zzatjVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzapgVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzl();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzl() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
            if (zzj == null) {
                return null;
            }
            zza();
            zzasd zzd = this.zzb.zzd();
            if (zzd == null || (i = this.zzg) == Integer.MIN_VALUE) {
                return null;
            }
            zzd.zzc(this.zzh, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
