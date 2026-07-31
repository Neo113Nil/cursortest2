package e1;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f2456e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f2457a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2458b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2459c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2460d;

    public c(float f6, float f8, float f9, float f10) {
        this.f2457a = f6;
        this.f2458b = f8;
        this.f2459c = f9;
        this.f2460d = f10;
    }

    public final long a() {
        float f6 = this.f2459c;
        float f8 = this.f2457a;
        float f9 = ((f6 - f8) / 2.0f) + f8;
        float f10 = this.f2460d;
        float f11 = this.f2458b;
        return (Float.floatToRawIntBits(((f10 - f11) / 2.0f) + f11) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    public final long b() {
        float f6 = this.f2459c - this.f2457a;
        float f8 = this.f2460d - this.f2458b;
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public final c c(c cVar) {
        return new c(Math.max(this.f2457a, cVar.f2457a), Math.max(this.f2458b, cVar.f2458b), Math.min(this.f2459c, cVar.f2459c), Math.min(this.f2460d, cVar.f2460d));
    }

    public final c d(float f6, float f8) {
        return new c(this.f2457a + f6, this.f2458b + f8, this.f2459c + f6, this.f2460d + f8);
    }

    public final c e(long j7) {
        int i = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        return new c(Float.intBitsToFloat(i) + this.f2457a, Float.intBitsToFloat(i8) + this.f2458b, Float.intBitsToFloat(i) + this.f2459c, Float.intBitsToFloat(i8) + this.f2460d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f2457a, cVar.f2457a) == 0 && Float.compare(this.f2458b, cVar.f2458b) == 0 && Float.compare(this.f2459c, cVar.f2459c) == 0 && Float.compare(this.f2460d, cVar.f2460d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2460d) + q.a(this.f2459c, q.a(this.f2458b, Float.hashCode(this.f2457a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + s6.a.L(this.f2457a) + ", " + s6.a.L(this.f2458b) + ", " + s6.a.L(this.f2459c) + ", " + s6.a.L(this.f2460d) + ')';
    }
}
