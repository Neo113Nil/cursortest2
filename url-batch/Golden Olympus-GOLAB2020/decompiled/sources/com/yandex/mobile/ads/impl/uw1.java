package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class uw1 {

    /* renamed from: c, reason: collision with root package name */
    public static final uw1 f33435c;

    /* renamed from: a, reason: collision with root package name */
    public final long f33436a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33437b;

    static {
        uw1 uw1Var = new uw1(0L, 0L);
        new uw1(Long.MAX_VALUE, Long.MAX_VALUE);
        new uw1(Long.MAX_VALUE, 0L);
        new uw1(0L, Long.MAX_VALUE);
        f33435c = uw1Var;
    }

    public uw1(long j4, long j5) {
        C2253tf.a(j4 >= 0);
        C2253tf.a(j5 >= 0);
        this.f33436a = j4;
        this.f33437b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uw1.class == obj.getClass()) {
            uw1 uw1Var = (uw1) obj;
            if (this.f33436a == uw1Var.f33436a && this.f33437b == uw1Var.f33437b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f33436a) * 31) + ((int) this.f33437b);
    }
}
