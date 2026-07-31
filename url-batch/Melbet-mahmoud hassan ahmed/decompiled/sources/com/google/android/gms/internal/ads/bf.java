package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bf {

    /* renamed from: d, reason: collision with root package name */
    public static final bf f3385d = new bf(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f3386a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3387b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private final int f3388c;

    public bf(float f7, float f8) {
        this.f3386a = f7;
        this.f3388c = Math.round(f7 * 1000.0f);
    }

    public final long a(long j7) {
        return j7 * this.f3388c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bf.class == obj.getClass() && this.f3386a == ((bf) obj).f3386a;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f3386a) + 527) * 31) + Float.floatToRawIntBits(1.0f);
    }
}
