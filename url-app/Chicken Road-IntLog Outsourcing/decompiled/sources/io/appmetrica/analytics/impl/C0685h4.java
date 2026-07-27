package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685h4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8301a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f8302b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8303c;

    public C0685h4(String str, Integer num, String str2) {
        this.f8301a = str;
        this.f8302b = num;
        this.f8303c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0685h4.class != obj.getClass()) {
            return false;
        }
        C0685h4 c0685h4 = (C0685h4) obj;
        if (!this.f8301a.equals(c0685h4.f8301a)) {
            return false;
        }
        Integer num = this.f8302b;
        if (num == null ? c0685h4.f8302b != null : !num.equals(c0685h4.f8302b)) {
            return false;
        }
        String str = this.f8303c;
        String str2 = c0685h4.f8303c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        int hashCode = this.f8301a.hashCode() * 31;
        Integer num = this.f8302b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f8303c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
