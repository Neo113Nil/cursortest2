package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w2 extends y2 {
    @Override // com.google.android.gms.internal.measurement.y2
    public final void b(Object obj, long j, byte b10) {
        if (z2.f3038f) {
            z2.b(obj, j, b10);
        } else {
            z2.c(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final boolean d(long j, Object obj) {
        return z2.f3038f ? z2.n(j, obj) : z2.o(j, obj);
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void g(Object obj, long j, boolean z10) {
        if (z2.f3038f) {
            z2.b(obj, j, z10 ? (byte) 1 : (byte) 0);
        } else {
            z2.c(obj, j, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final float h(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f3003a).getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void j(Object obj, long j, float f3) {
        ((Unsafe) this.f3003a).putInt(obj, j, Float.floatToIntBits(f3));
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final double k(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f3003a).getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void l(Object obj, long j, double d10) {
        ((Unsafe) this.f3003a).putLong(obj, j, Double.doubleToLongBits(d10));
    }
}
