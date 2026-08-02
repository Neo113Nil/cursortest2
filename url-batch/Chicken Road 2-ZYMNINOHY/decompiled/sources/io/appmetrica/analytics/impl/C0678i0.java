package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12011a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12012b;

    public C0678i0(String str, long j4) {
        this.f12011a = str;
        this.f12012b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0678i0.class == obj.getClass()) {
            C0678i0 c0678i0 = (C0678i0) obj;
            if (this.f12012b != c0678i0.f12012b) {
                return false;
            }
            String str = this.f12011a;
            String str2 = c0678i0.f12011a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12011a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j4 = this.f12012b;
        return (hashCode * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }
}
