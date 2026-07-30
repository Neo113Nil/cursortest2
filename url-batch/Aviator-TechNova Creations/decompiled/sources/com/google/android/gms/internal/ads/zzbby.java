package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzbby implements Callable {
    protected final zzbak zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzawg zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzbby(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        getClass().getSimpleName();
        this.zza = zzbakVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzawgVar;
        this.zzf = i;
        this.zzg = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            zzbak zzbakVar = this.zza;
            Method zzo = zzbakVar.zzo(this.zzb, this.zzc);
            this.zze = zzo;
            if (zzo == null) {
                return null;
            }
            zza();
            zzazb zzh = zzbakVar.zzh();
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
