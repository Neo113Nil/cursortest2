package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818s4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8289a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8290b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8291c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8292d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8293e;
    public final Boolean f;

    public C0818s4(C0767q4 c0767q4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean bool;
        z = c0767q4.f8120a;
        this.f8289a = z;
        z2 = c0767q4.f8121b;
        this.f8290b = z2;
        z3 = c0767q4.f8122c;
        this.f8291c = z3;
        z4 = c0767q4.f8123d;
        this.f8292d = z4;
        z5 = c0767q4.f8124e;
        this.f8293e = z5;
        bool = c0767q4.f;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0818s4.class == obj.getClass()) {
            C0818s4 c0818s4 = (C0818s4) obj;
            if (this.f8289a != c0818s4.f8289a || this.f8290b != c0818s4.f8290b || this.f8291c != c0818s4.f8291c || this.f8292d != c0818s4.f8292d || this.f8293e != c0818s4.f8293e) {
                return false;
            }
            Boolean bool = this.f;
            Boolean bool2 = c0818s4.f;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (((((((((this.f8289a ? 1 : 0) * 31) + (this.f8290b ? 1 : 0)) * 31) + (this.f8291c ? 1 : 0)) * 31) + (this.f8292d ? 1 : 0)) * 31) + (this.f8293e ? 1 : 0)) * 31;
        Boolean bool = this.f;
        return i3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f8289a + ", featuresCollectingEnabled=" + this.f8290b + ", googleAid=" + this.f8291c + ", simInfo=" + this.f8292d + ", huaweiOaid=" + this.f8293e + ", sslPinning=" + this.f + '}';
    }
}
