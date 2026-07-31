package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class fc {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final Double f;

    public fc(String mimeType, Integer num, Integer num2, Integer num3, String url, Double d) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = mimeType;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = url;
        this.f = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return Intrinsics.areEqual(this.a, fcVar.a) && Intrinsics.areEqual(this.b, fcVar.b) && Intrinsics.areEqual(this.c, fcVar.c) && Intrinsics.areEqual(this.d, fcVar.d) && Intrinsics.areEqual(this.e, fcVar.e) && Intrinsics.areEqual((Object) this.f, (Object) fcVar.f);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (((hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.e.hashCode()) * 31;
        Double d = this.f;
        return hashCode4 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "MediaFile(mimeType=" + this.a + ", width=" + this.b + ", height=" + this.c + ", bitrate=" + this.d + ", url=" + this.e + ", weight=" + this.f + ")";
    }

    public final String c() {
        return this.a;
    }

    public final Integer f() {
        return this.b;
    }

    public final Integer b() {
        return this.c;
    }

    public final Integer a() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final Double e() {
        return this.f;
    }

    public /* synthetic */ fc(String str, Integer num, Integer num2, Integer num3, String str2, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2, num3, str2, (i & 32) != 0 ? null : d);
    }
}
