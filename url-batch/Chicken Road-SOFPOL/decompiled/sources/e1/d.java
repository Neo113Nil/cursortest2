package e1;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f2461a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2462b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2463c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2464d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2465e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2466f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2467g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2468h;

    static {
        s6.a.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f6, float f8, float f9, float f10, long j7, long j8, long j9, long j10) {
        this.f2461a = f6;
        this.f2462b = f8;
        this.f2463c = f9;
        this.f2464d = f10;
        this.f2465e = j7;
        this.f2466f = j8;
        this.f2467g = j9;
        this.f2468h = j10;
    }

    public final float a() {
        return this.f2464d - this.f2462b;
    }

    public final float b() {
        return this.f2463c - this.f2461a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f2461a, dVar.f2461a) == 0 && Float.compare(this.f2462b, dVar.f2462b) == 0 && Float.compare(this.f2463c, dVar.f2463c) == 0 && Float.compare(this.f2464d, dVar.f2464d) == 0 && a.a.i(this.f2465e, dVar.f2465e) && a.a.i(this.f2466f, dVar.f2466f) && a.a.i(this.f2467g, dVar.f2467g) && a.a.i(this.f2468h, dVar.f2468h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2468h) + q.c(q.c(q.c(q.a(this.f2464d, q.a(this.f2463c, q.a(this.f2462b, Float.hashCode(this.f2461a) * 31, 31), 31), 31), 31, this.f2465e), 31, this.f2466f), 31, this.f2467g);
    }

    public final String toString() {
        String str = s6.a.L(this.f2461a) + ", " + s6.a.L(this.f2462b) + ", " + s6.a.L(this.f2463c) + ", " + s6.a.L(this.f2464d);
        long j7 = this.f2465e;
        long j8 = this.f2466f;
        boolean i = a.a.i(j7, j8);
        long j9 = this.f2467g;
        long j10 = this.f2468h;
        if (!i || !a.a.i(j8, j9) || !a.a.i(j9, j10)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) a.a.A(j7)) + ", topRight=" + ((Object) a.a.A(j8)) + ", bottomRight=" + ((Object) a.a.A(j9)) + ", bottomLeft=" + ((Object) a.a.A(j10)) + ')';
        }
        int i8 = (int) (j7 >> 32);
        int i9 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i8) == Float.intBitsToFloat(i9)) {
            return "RoundRect(rect=" + str + ", radius=" + s6.a.L(Float.intBitsToFloat(i8)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + s6.a.L(Float.intBitsToFloat(i8)) + ", y=" + s6.a.L(Float.intBitsToFloat(i9)) + ')';
    }
}
