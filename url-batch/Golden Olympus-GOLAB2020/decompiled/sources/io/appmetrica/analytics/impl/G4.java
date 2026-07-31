package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class G4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37558a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37559b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37560c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37561d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37562e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f37563f;

    public G4(E4 e4) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Boolean bool;
        z4 = e4.f37400a;
        this.f37558a = z4;
        z5 = e4.f37401b;
        this.f37559b = z5;
        z6 = e4.f37402c;
        this.f37560c = z6;
        z7 = e4.f37403d;
        this.f37561d = z7;
        z8 = e4.f37404e;
        this.f37562e = z8;
        bool = e4.f37405f;
        this.f37563f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G4.class == obj.getClass()) {
            G4 g4 = (G4) obj;
            if (this.f37558a != g4.f37558a || this.f37559b != g4.f37559b || this.f37560c != g4.f37560c || this.f37561d != g4.f37561d || this.f37562e != g4.f37562e) {
                return false;
            }
            Boolean bool = this.f37563f;
            Boolean bool2 = g4.f37563f;
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
        int i4 = (((((((((this.f37558a ? 1 : 0) * 31) + (this.f37559b ? 1 : 0)) * 31) + (this.f37560c ? 1 : 0)) * 31) + (this.f37561d ? 1 : 0)) * 31) + (this.f37562e ? 1 : 0)) * 31;
        Boolean bool = this.f37563f;
        return i4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f37558a + ", featuresCollectingEnabled=" + this.f37559b + ", googleAid=" + this.f37560c + ", simInfo=" + this.f37561d + ", huaweiOaid=" + this.f37562e + ", sslPinning=" + this.f37563f + '}';
    }
}
