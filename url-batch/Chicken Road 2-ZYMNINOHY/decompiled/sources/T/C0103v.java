package T;

/* renamed from: T.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103v {

    /* renamed from: a, reason: collision with root package name */
    public final long f2888a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2889b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2890c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2891d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2892e;

    static {
        new C0102u().a();
        W.J.G(0);
        W.J.G(1);
        W.J.G(2);
        W.J.G(3);
        W.J.G(4);
    }

    public C0103v(C0102u c0102u) {
        long j4 = c0102u.f2883a;
        long j5 = c0102u.f2884b;
        long j6 = c0102u.f2885c;
        float f4 = c0102u.f2886d;
        float f5 = c0102u.f2887e;
        this.f2888a = j4;
        this.f2889b = j5;
        this.f2890c = j6;
        this.f2891d = f4;
        this.f2892e = f5;
    }

    public final C0102u a() {
        C0102u c0102u = new C0102u();
        c0102u.f2883a = this.f2888a;
        c0102u.f2884b = this.f2889b;
        c0102u.f2885c = this.f2890c;
        c0102u.f2886d = this.f2891d;
        c0102u.f2887e = this.f2892e;
        return c0102u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0103v)) {
            return false;
        }
        C0103v c0103v = (C0103v) obj;
        return this.f2888a == c0103v.f2888a && this.f2889b == c0103v.f2889b && this.f2890c == c0103v.f2890c && this.f2891d == c0103v.f2891d && this.f2892e == c0103v.f2892e;
    }

    public final int hashCode() {
        long j4 = this.f2888a;
        long j5 = this.f2889b;
        int i4 = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f2890c;
        int i5 = (i4 + ((int) ((j6 >>> 32) ^ j6))) * 31;
        float f4 = this.f2891d;
        int floatToIntBits = (i5 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.f2892e;
        return floatToIntBits + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0);
    }
}
