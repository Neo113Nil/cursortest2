package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class Y0 extends AbstractC0300a1 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC0300a1
    public final double a(long j4, Object obj) {
        return Double.longBitsToDouble(this.f5931a.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0300a1
    public final float b(long j4, Object obj) {
        return Float.intBitsToFloat(this.f5931a.getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0300a1
    public final void c(Object obj, long j4, boolean z) {
        if (AbstractC0303b1.f5939g) {
            AbstractC0303b1.c(obj, j4, z ? (byte) 1 : (byte) 0);
        } else {
            AbstractC0303b1.d(obj, j4, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0300a1
    public final void d(Object obj, long j4, byte b4) {
        if (AbstractC0303b1.f5939g) {
            AbstractC0303b1.c(obj, j4, b4);
        } else {
            AbstractC0303b1.d(obj, j4, b4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0300a1
    public final void e(Object obj, long j4, double d4) {
        this.f5931a.putLong(obj, j4, Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0300a1
    public final void f(Object obj, long j4, float f4) {
        this.f5931a.putInt(obj, j4, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0300a1
    public final boolean g(long j4, Object obj) {
        return AbstractC0303b1.f5939g ? AbstractC0303b1.m(j4, obj) : AbstractC0303b1.n(j4, obj);
    }
}
