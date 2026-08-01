package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03539f {
    public static final C03539f A04 = new C03539f(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C03539f(float f) {
        this(f, 1.0f, false);
    }

    public C03539f(float f, float f2, boolean z) {
        HI.A03(f > 0.0f);
        HI.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f);
    }

    public final long A00(long j) {
        return this.A03 * j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C03539f c03539f = (C03539f) obj;
        return this.A01 == c03539f.A01 && this.A00 == c03539f.A00 && this.A02 == c03539f.A02;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
