package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759l4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12259a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12260b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12261c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12262d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12263e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f12264f;

    public C0759l4(C0707j4 c0707j4) {
        boolean z;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Boolean bool;
        z = c0707j4.f12094a;
        this.f12259a = z;
        z4 = c0707j4.f12095b;
        this.f12260b = z4;
        z5 = c0707j4.f12096c;
        this.f12261c = z5;
        z6 = c0707j4.f12097d;
        this.f12262d = z6;
        z7 = c0707j4.f12098e;
        this.f12263e = z7;
        bool = c0707j4.f12099f;
        this.f12264f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0759l4.class == obj.getClass()) {
            C0759l4 c0759l4 = (C0759l4) obj;
            if (this.f12259a != c0759l4.f12259a || this.f12260b != c0759l4.f12260b || this.f12261c != c0759l4.f12261c || this.f12262d != c0759l4.f12262d || this.f12263e != c0759l4.f12263e) {
                return false;
            }
            Boolean bool = this.f12264f;
            Boolean bool2 = c0759l4.f12264f;
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
        int i4 = (((((((((this.f12259a ? 1 : 0) * 31) + (this.f12260b ? 1 : 0)) * 31) + (this.f12261c ? 1 : 0)) * 31) + (this.f12262d ? 1 : 0)) * 31) + (this.f12263e ? 1 : 0)) * 31;
        Boolean bool = this.f12264f;
        return i4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f12259a + ", featuresCollectingEnabled=" + this.f12260b + ", googleAid=" + this.f12261c + ", simInfo=" + this.f12262d + ", huaweiOaid=" + this.f12263e + ", sslPinning=" + this.f12264f + '}';
    }
}
