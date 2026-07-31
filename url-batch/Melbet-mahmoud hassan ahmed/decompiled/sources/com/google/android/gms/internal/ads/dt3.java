package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class dt3 extends ft3 {
    dt3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.ft3
    public final byte a(long j7) {
        return Memory.peekByte((int) j7);
    }

    @Override // com.google.android.gms.internal.ads.ft3
    public final double b(Object obj, long j7) {
        return Double.longBitsToDouble(m(obj, j7));
    }

    @Override // com.google.android.gms.internal.ads.ft3
    public final float c(Object obj, long j7) {
        return Float.intBitsToFloat(l(obj, j7));
    }

    @Override // com.google.android.gms.internal.ads.ft3
    public final void d(long j7, byte[] bArr, long j8, long j9) {
        Memory.peekByteArray((int) j7, bArr, (int) j8, (int) j9);
    }

    @Override // com.google.android.gms.internal.ads.ft3
    public final void e(Object obj, long j7, boolean z6) {
        if (gt3.f5765j) {
            gt3.g(obj, j7, r3 ? (byte) 1 : (byte) 0);
        } else {
            gt3.h(obj, j7, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.ft3
    public final void f(Object obj, long j7, byte b7) {
        if (gt3.f5765j) {
            gt3.g(obj, j7, b7);
        } else {
            gt3.h(obj, j7, b7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ft3
    public final void g(Object obj, long j7, double d7) {
        q(obj, j7, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.ads.ft3
    public final void h(Object obj, long j7, float f7) {
        p(obj, j7, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.ads.ft3
    public final boolean i(Object obj, long j7) {
        return gt3.f5765j ? gt3.E(obj, j7) : gt3.F(obj, j7);
    }
}
