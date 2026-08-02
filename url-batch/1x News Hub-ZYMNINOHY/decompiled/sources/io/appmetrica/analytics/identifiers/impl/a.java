package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5592a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5593b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f5594c;

    public a(String str, String str2, Boolean bool) {
        this.f5592a = str;
        this.f5593b = str2;
        this.f5594c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.j.a(this.f5592a, aVar.f5592a) && kotlin.jvm.internal.j.a(this.f5593b, aVar.f5593b) && kotlin.jvm.internal.j.a(this.f5594c, aVar.f5594c);
    }

    public final int hashCode() {
        int hashCode = this.f5592a.hashCode() * 31;
        String str = this.f5593b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f5594c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f5592a + ", advId=" + this.f5593b + ", limitedAdTracking=" + this.f5594c + ')';
    }
}
