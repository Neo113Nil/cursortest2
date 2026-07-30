package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzhg extends zzhh {
    zzhg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final double zza(Object obj, long j8) {
        return Double.longBitsToDouble(zzj(obj, j8));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final float zzb(Object obj, long j8) {
        return Float.intBitsToFloat(zzi(obj, j8));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzc(Object obj, long j8, boolean z7) {
        if (zzhi.zza) {
            zzhi.zzi(obj, j8, z7);
        } else {
            zzhi.zzj(obj, j8, z7);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzd(Object obj, long j8, double d8) {
        zzn(obj, j8, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zze(Object obj, long j8, float f8) {
        zzm(obj, j8, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final boolean zzf(Object obj, long j8) {
        return zzhi.zza ? zzhi.zzq(obj, j8) : zzhi.zzr(obj, j8);
    }
}
