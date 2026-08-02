package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7491a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7492b;

    public C0556i0(String str, long j3) {
        this.f7491a = str;
        this.f7492b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0556i0.class == obj.getClass()) {
            C0556i0 c0556i0 = (C0556i0) obj;
            if (this.f7492b != c0556i0.f7492b) {
                return false;
            }
            String str = this.f7491a;
            String str2 = c0556i0.f7491a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7491a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j3 = this.f7492b;
        return (hashCode * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }
}
