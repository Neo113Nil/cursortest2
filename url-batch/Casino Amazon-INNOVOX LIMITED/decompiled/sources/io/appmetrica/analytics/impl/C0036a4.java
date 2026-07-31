package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0036a4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1156a;
    public final Integer b;
    public final String c;

    public C0036a4(String str, Integer num, String str2) {
        this.f1156a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0036a4.class == obj.getClass()) {
            C0036a4 c0036a4 = (C0036a4) obj;
            if (!this.f1156a.equals(c0036a4.f1156a)) {
                return false;
            }
            Integer num = this.b;
            if (num == null ? c0036a4.b != null : !num.equals(c0036a4.b)) {
                return false;
            }
            String str = this.c;
            String str2 = c0036a4.c;
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
        int hashCode = this.f1156a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
