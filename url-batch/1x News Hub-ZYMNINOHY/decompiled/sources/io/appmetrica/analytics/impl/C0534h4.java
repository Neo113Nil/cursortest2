package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534h4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7425a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f7426b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7427c;

    public C0534h4(String str, Integer num, String str2) {
        this.f7425a = str;
        this.f7426b = num;
        this.f7427c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0534h4.class == obj.getClass()) {
            C0534h4 c0534h4 = (C0534h4) obj;
            if (!this.f7425a.equals(c0534h4.f7425a)) {
                return false;
            }
            Integer num = this.f7426b;
            if (num == null ? c0534h4.f7426b != null : !num.equals(c0534h4.f7426b)) {
                return false;
            }
            String str = this.f7427c;
            String str2 = c0534h4.f7427c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f7425a.hashCode() * 31;
        Integer num = this.f7426b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f7427c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
