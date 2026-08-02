package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class J1 extends L1 {
    @Override // com.google.android.gms.internal.play_billing.L1
    public final double a(long j3, Object obj) {
        return Double.longBitsToDouble(this.f2760a.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final float b(long j3, Object obj) {
        return Float.intBitsToFloat(this.f2760a.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final void c(Object obj, long j3, boolean z) {
        if (M1.f2769g) {
            M1.b(obj, j3, z ? (byte) 1 : (byte) 0);
        } else {
            M1.c(obj, j3, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final void d(Object obj, long j3, byte b3) {
        if (M1.f2769g) {
            M1.b(obj, j3, b3);
        } else {
            M1.c(obj, j3, b3);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final void e(Object obj, long j3, double d3) {
        this.f2760a.putLong(obj, j3, Double.doubleToLongBits(d3));
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final void f(Object obj, long j3, float f) {
        this.f2760a.putInt(obj, j3, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final boolean g(long j3, Object obj) {
        return M1.f2769g ? M1.l(j3, obj) : M1.m(j3, obj);
    }
}
