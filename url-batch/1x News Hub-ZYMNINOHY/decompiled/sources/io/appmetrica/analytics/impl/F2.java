package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class F2 {

    /* renamed from: a, reason: collision with root package name */
    public final E2 f5979a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f5980b;

    public F2(E2 e22, Boolean bool) {
        this.f5979a = e22;
        this.f5980b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F2.class == obj.getClass()) {
            F2 f22 = (F2) obj;
            if (this.f5979a != f22.f5979a) {
                return false;
            }
            Boolean bool = this.f5980b;
            if (bool != null) {
                return bool.equals(f22.f5980b);
            }
            if (f22.f5980b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        E2 e22 = this.f5979a;
        int hashCode = (e22 != null ? e22.hashCode() : 0) * 31;
        Boolean bool = this.f5980b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f5979a + ", mBackgroundRestricted=" + this.f5980b + '}';
    }
}
