package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
abstract class zznt {
    final Unsafe zza;

    zznt(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j8);

    public abstract float zzb(Object obj, long j8);

    public abstract void zzc(Object obj, long j8, boolean z7);

    public abstract void zzd(Object obj, long j8, byte b8);

    public abstract void zze(Object obj, long j8, double d8);

    public abstract void zzf(Object obj, long j8, float f8);

    public abstract boolean zzg(Object obj, long j8);
}
