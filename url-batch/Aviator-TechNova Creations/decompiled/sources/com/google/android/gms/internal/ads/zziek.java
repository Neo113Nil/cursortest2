package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zziek extends zziel {
    zziek(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final void zza(Object obj, long j, byte b) {
        if (zziem.zzb) {
            zziem.zzF(obj, j, b);
        } else {
            zziem.zzG(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final boolean zzb(Object obj, long j) {
        return zziem.zzb ? zziem.zzw(obj, j) : zziem.zzx(obj, j);
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final void zzc(Object obj, long j, boolean z) {
        if (zziem.zzb) {
            zziem.zzF(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zziem.zzG(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final byte zzh(long j) {
        return Memory.peekByte(j);
    }
}
