package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8373a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8374b;

    public C0707i0(String str, long j2) {
        this.f8373a = str;
        this.f8374b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0707i0.class != obj.getClass()) {
            return false;
        }
        C0707i0 c0707i0 = (C0707i0) obj;
        if (this.f8374b != c0707i0.f8374b) {
            return false;
        }
        String str = this.f8373a;
        String str2 = c0707i0.f8373a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8373a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f8374b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
