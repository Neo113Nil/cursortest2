package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6359a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6360b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f6361c;

    public a(String str, String str2, Boolean bool) {
        this.f6359a = str;
        this.f6360b = str2;
        this.f6361c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.i.a(this.f6359a, aVar.f6359a) && kotlin.jvm.internal.i.a(this.f6360b, aVar.f6360b) && kotlin.jvm.internal.i.a(this.f6361c, aVar.f6361c);
    }

    public final int hashCode() {
        int hashCode = this.f6359a.hashCode() * 31;
        String str = this.f6360b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f6361c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f6359a + ", advId=" + this.f6360b + ", limitedAdTracking=" + this.f6361c + ')';
    }
}
