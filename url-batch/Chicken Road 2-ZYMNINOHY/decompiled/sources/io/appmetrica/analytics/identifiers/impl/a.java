package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9852a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9853b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f9854c;

    public a(String str, String str2, Boolean bool) {
        this.f9852a = str;
        this.f9853b = str2;
        this.f9854c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.i.a(this.f9852a, aVar.f9852a) && kotlin.jvm.internal.i.a(this.f9853b, aVar.f9853b) && kotlin.jvm.internal.i.a(this.f9854c, aVar.f9854c);
    }

    public final int hashCode() {
        int hashCode = this.f9852a.hashCode() * 31;
        String str = this.f9853b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f9854c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f9852a + ", advId=" + this.f9853b + ", limitedAdTracking=" + this.f9854c + ')';
    }
}
