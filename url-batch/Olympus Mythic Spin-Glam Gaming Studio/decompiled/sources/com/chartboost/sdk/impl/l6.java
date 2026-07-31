package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class l6 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;

    public l6(int i, int i2, int i3, int i4, float f, String str, int i5, String deviceType, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = str;
        this.g = i5;
        this.h = deviceType;
        this.i = str2;
        this.j = str3;
        this.k = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return this.a == l6Var.a && this.b == l6Var.b && this.c == l6Var.c && this.d == l6Var.d && Float.compare(this.e, l6Var.e) == 0 && Intrinsics.areEqual(this.f, l6Var.f) && this.g == l6Var.g && Intrinsics.areEqual(this.h, l6Var.h) && Intrinsics.areEqual(this.i, l6Var.i) && Intrinsics.areEqual(this.j, l6Var.j) && this.k == l6Var.k;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31;
        String str = this.f;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.g)) * 31) + this.h.hashCode()) * 31;
        String str2 = this.i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.k);
    }

    public String toString() {
        return "DeviceBodyFields(deviceWidth=" + this.a + ", deviceHeight=" + this.b + ", width=" + this.c + ", height=" + this.d + ", scale=" + this.e + ", dpi=" + this.f + ", ortbDeviceType=" + this.g + ", deviceType=" + this.h + ", packageName=" + this.i + ", versionName=" + this.j + ", isPortrait=" + this.k + ")";
    }

    public final int c() {
        return this.a;
    }

    public final int a() {
        return this.b;
    }

    public final int j() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final float h() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final int f() {
        return this.g;
    }

    public final String b() {
        return this.h;
    }

    public final String g() {
        return this.i;
    }

    public final String i() {
        return this.j;
    }

    public final boolean k() {
        return this.k;
    }

    public /* synthetic */ l6(int i, int i2, int i3, int i4, float f, String str, int i5, String str2, String str3, String str4, boolean z, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) == 0 ? i4 : 0, (i6 & 16) != 0 ? 0.0f : f, (i6 & 32) != 0 ? "" : str, (i6 & 64) != 0 ? p6.a : i5, (i6 & 128) != 0 ? "phone" : str2, (i6 & 256) != 0 ? null : str3, (i6 & 512) == 0 ? str4 : null, (i6 & 1024) != 0 ? true : z);
    }
}
