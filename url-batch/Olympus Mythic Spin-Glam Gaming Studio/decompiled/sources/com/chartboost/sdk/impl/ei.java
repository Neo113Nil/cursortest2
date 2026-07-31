package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class ei {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ei(String url, String method, String str, String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        this.a = url;
        this.b = method;
        this.c = str;
        this.d = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) obj;
        return Intrinsics.areEqual(this.a, eiVar.a) && Intrinsics.areEqual(this.b, eiVar.b) && Intrinsics.areEqual(this.c, eiVar.c) && Intrinsics.areEqual(this.d, eiVar.d);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TrackerConfig(url=" + this.a + ", method=" + this.b + ", bodyTemplate=" + this.c + ", contentType=" + this.d + ")";
    }

    public final String d() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public /* synthetic */ ei(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
