package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3030v4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39957a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f39958b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39959c;

    public C3030v4(String str, Integer num, String str2) {
        this.f39957a = str;
        this.f39958b = num;
        this.f39959c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3030v4.class == obj.getClass()) {
            C3030v4 c3030v4 = (C3030v4) obj;
            if (!this.f39957a.equals(c3030v4.f39957a)) {
                return false;
            }
            Integer num = this.f39958b;
            if (num == null ? c3030v4.f39958b != null : !num.equals(c3030v4.f39958b)) {
                return false;
            }
            String str = this.f39959c;
            String str2 = c3030v4.f39959c;
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
        int hashCode = this.f39957a.hashCode() * 31;
        Integer num = this.f39958b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f39959c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
