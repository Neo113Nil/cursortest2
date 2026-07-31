package io.appmetrica.analytics.identifiers.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f37120a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37121b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f37122c;

    public a(String str, String str2, Boolean bool) {
        this.f37120a = str;
        this.f37121b = str2;
        this.f37122c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f37120a, aVar.f37120a) && Intrinsics.areEqual(this.f37121b, aVar.f37121b) && Intrinsics.areEqual(this.f37122c, aVar.f37122c);
    }

    public final int hashCode() {
        int hashCode = this.f37120a.hashCode() * 31;
        String str = this.f37121b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f37122c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f37120a + ", advId=" + this.f37121b + ", limitedAdTracking=" + this.f37122c + ')';
    }
}
