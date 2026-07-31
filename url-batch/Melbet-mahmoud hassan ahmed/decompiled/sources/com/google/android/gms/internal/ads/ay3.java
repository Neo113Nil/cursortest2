package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ay3 {

    /* renamed from: c, reason: collision with root package name */
    public static final ay3 f3028c;

    /* renamed from: d, reason: collision with root package name */
    public static final ay3 f3029d;

    /* renamed from: e, reason: collision with root package name */
    public static final ay3 f3030e;

    /* renamed from: f, reason: collision with root package name */
    public static final ay3 f3031f;

    /* renamed from: g, reason: collision with root package name */
    public static final ay3 f3032g;

    /* renamed from: a, reason: collision with root package name */
    public final long f3033a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3034b;

    static {
        ay3 ay3Var = new ay3(0L, 0L);
        f3028c = ay3Var;
        f3029d = new ay3(Long.MAX_VALUE, Long.MAX_VALUE);
        f3030e = new ay3(Long.MAX_VALUE, 0L);
        f3031f = new ay3(0L, Long.MAX_VALUE);
        f3032g = ay3Var;
    }

    public ay3(long j7, long j8) {
        wu1.d(j7 >= 0);
        wu1.d(j8 >= 0);
        this.f3033a = j7;
        this.f3034b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ay3.class == obj.getClass()) {
            ay3 ay3Var = (ay3) obj;
            if (this.f3033a == ay3Var.f3033a && this.f3034b == ay3Var.f3034b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3033a) * 31) + ((int) this.f3034b);
    }
}
