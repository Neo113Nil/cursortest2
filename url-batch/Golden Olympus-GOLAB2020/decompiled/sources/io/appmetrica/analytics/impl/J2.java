package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class J2 {

    /* renamed from: a, reason: collision with root package name */
    public final I2 f37787a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f37788b;

    public J2(I2 i22, Boolean bool) {
        this.f37787a = i22;
        this.f37788b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J2.class == obj.getClass()) {
            J2 j22 = (J2) obj;
            if (this.f37787a != j22.f37787a) {
                return false;
            }
            Boolean bool = this.f37788b;
            if (bool != null) {
                return bool.equals(j22.f37788b);
            }
            if (j22.f37788b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        I2 i22 = this.f37787a;
        int hashCode = (i22 != null ? i22.hashCode() : 0) * 31;
        Boolean bool = this.f37788b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f37787a + ", mBackgroundRestricted=" + this.f37788b + '}';
    }
}
