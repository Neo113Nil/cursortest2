package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068x2 {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1042w2 f12990a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f12991b;

    public C1068x2(EnumC1042w2 enumC1042w2, Boolean bool) {
        this.f12990a = enumC1042w2;
        this.f12991b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1068x2.class == obj.getClass()) {
            C1068x2 c1068x2 = (C1068x2) obj;
            if (this.f12990a != c1068x2.f12990a) {
                return false;
            }
            Boolean bool = this.f12991b;
            if (bool != null) {
                return bool.equals(c1068x2.f12991b);
            }
            if (c1068x2.f12991b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC1042w2 enumC1042w2 = this.f12990a;
        int hashCode = (enumC1042w2 != null ? enumC1042w2.hashCode() : 0) * 31;
        Boolean bool = this.f12991b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f12990a + ", mBackgroundRestricted=" + this.f12991b + '}';
    }
}
