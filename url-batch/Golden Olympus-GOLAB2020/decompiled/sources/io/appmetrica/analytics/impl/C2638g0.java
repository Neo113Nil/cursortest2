package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2638g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39022a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39023b;

    public C2638g0(String str, long j4) {
        this.f39022a = str;
        this.f39023b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2638g0.class == obj.getClass()) {
            C2638g0 c2638g0 = (C2638g0) obj;
            if (this.f39023b != c2638g0.f39023b) {
                return false;
            }
            String str = this.f39022a;
            String str2 = c2638g0.f39022a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39022a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j4 = this.f39023b;
        return (hashCode * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }
}
