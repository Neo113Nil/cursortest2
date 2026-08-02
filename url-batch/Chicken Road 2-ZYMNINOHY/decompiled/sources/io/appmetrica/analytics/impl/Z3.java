package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11335a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f11336b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11337c;

    public Z3(String str, Integer num, String str2) {
        this.f11335a = str;
        this.f11336b = num;
        this.f11337c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z3.class == obj.getClass()) {
            Z3 z32 = (Z3) obj;
            if (!this.f11335a.equals(z32.f11335a)) {
                return false;
            }
            Integer num = this.f11336b;
            if (num == null ? z32.f11336b != null : !num.equals(z32.f11336b)) {
                return false;
            }
            String str = this.f11337c;
            String str2 = z32.f11337c;
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
        int hashCode = this.f11335a.hashCode() * 31;
        Integer num = this.f11336b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f11337c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
