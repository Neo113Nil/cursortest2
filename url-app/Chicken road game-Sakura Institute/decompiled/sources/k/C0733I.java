package k;

import A.AbstractC0017m;

/* renamed from: k.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733I {

    /* renamed from: a, reason: collision with root package name */
    public final float f7259a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7260b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7261c;

    public C0733I(float f4, float f5, long j4) {
        this.f7259a = f4;
        this.f7260b = f5;
        this.f7261c = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0733I)) {
            return false;
        }
        C0733I c0733i = (C0733I) obj;
        return Float.compare(this.f7259a, c0733i.f7259a) == 0 && Float.compare(this.f7260b, c0733i.f7260b) == 0 && this.f7261c == c0733i.f7261c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7261c) + AbstractC0017m.a(this.f7260b, Float.hashCode(this.f7259a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f7259a + ", distance=" + this.f7260b + ", duration=" + this.f7261c + ')';
    }
}
