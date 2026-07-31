package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class e30 {

    /* renamed from: d, reason: collision with root package name */
    public static final e30 f4477d = new e30(1.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final my3<e30> f4478e = new my3() { // from class: com.google.android.gms.internal.ads.d20
    };

    /* renamed from: a, reason: collision with root package name */
    public final float f4479a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4480b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4481c;

    public e30(float f7, float f8) {
        wu1.d(f7 > 0.0f);
        wu1.d(f8 > 0.0f);
        this.f4479a = f7;
        this.f4480b = f8;
        this.f4481c = Math.round(f7 * 1000.0f);
    }

    public final long a(long j7) {
        return j7 * this.f4481c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e30.class == obj.getClass()) {
            e30 e30Var = (e30) obj;
            if (this.f4479a == e30Var.f4479a && this.f4480b == e30Var.f4480b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f4479a) + 527) * 31) + Float.floatToRawIntBits(this.f4480b);
    }

    public final String toString() {
        return n13.d("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f4479a), Float.valueOf(this.f4480b));
    }
}
