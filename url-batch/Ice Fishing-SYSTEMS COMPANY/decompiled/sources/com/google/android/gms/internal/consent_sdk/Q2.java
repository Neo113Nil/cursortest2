package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class Q2 extends S2 {
    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final double a(long j9, Object obj) {
        return Double.longBitsToDouble(this.f35777a.getLong(obj, j9));
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final float b(long j9, Object obj) {
        return Float.intBitsToFloat(this.f35777a.getInt(obj, j9));
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final void c(Object obj, long j9, boolean z8) {
        if (T2.f35784g) {
            T2.b(obj, j9, z8 ? (byte) 1 : (byte) 0);
        } else {
            T2.c(obj, j9, z8 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final void d(Object obj, long j9, byte b9) {
        if (T2.f35784g) {
            T2.b(obj, j9, b9);
        } else {
            T2.c(obj, j9, b9);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final void e(Object obj, long j9, double d2) {
        this.f35777a.putLong(obj, j9, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final void f(Object obj, long j9, float f6) {
        this.f35777a.putInt(obj, j9, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final boolean g(long j9, Object obj) {
        return T2.f35784g ? T2.l(j9, obj) : T2.m(j9, obj);
    }
}
