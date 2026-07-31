package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzhf extends zzhh {
    zzhf(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final double zza(Object obj, long j4) {
        return Double.longBitsToDouble(zzj(obj, j4));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final float zzb(Object obj, long j4) {
        return Float.intBitsToFloat(zzi(obj, j4));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzc(Object obj, long j4, boolean z4) {
        if (zzhi.zza) {
            zzhi.zzi(obj, j4, z4);
        } else {
            zzhi.zzj(obj, j4, z4);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzd(Object obj, long j4, double d4) {
        zzn(obj, j4, Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zze(Object obj, long j4, float f4) {
        zzm(obj, j4, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final boolean zzf(Object obj, long j4) {
        return zzhi.zza ? zzhi.zzq(obj, j4) : zzhi.zzr(obj, j4);
    }
}
