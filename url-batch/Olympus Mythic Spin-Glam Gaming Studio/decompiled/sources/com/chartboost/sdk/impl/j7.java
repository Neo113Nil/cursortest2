package com.chartboost.sdk.impl;

import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j7 {
    public final long A;
    public final int B;
    public final int C;
    public final int D;
    public final long E;
    public final long F;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final int u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final int y;
    public final long z;

    public j7(String sessionId, int i, String appId, String appVersion, String chartboostSdkVersion, boolean z, String chartboostSdkGdpr, String chartboostSdkCcpa, String chartboostSdkCoppa, String chartboostSdkLgpd, String deviceId, String deviceMake, String deviceModel, String deviceOsVersion, String devicePlatform, String deviceCountry, String deviceLanguage, String deviceTimezone, String deviceConnectionType, String deviceOrientation, int i2, boolean z2, int i3, boolean z3, int i4, long j, long j2, int i5, int i6, int i7, long j3, long j4) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(chartboostSdkVersion, "chartboostSdkVersion");
        Intrinsics.checkNotNullParameter(chartboostSdkGdpr, "chartboostSdkGdpr");
        Intrinsics.checkNotNullParameter(chartboostSdkCcpa, "chartboostSdkCcpa");
        Intrinsics.checkNotNullParameter(chartboostSdkCoppa, "chartboostSdkCoppa");
        Intrinsics.checkNotNullParameter(chartboostSdkLgpd, "chartboostSdkLgpd");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceMake, "deviceMake");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceOsVersion, "deviceOsVersion");
        Intrinsics.checkNotNullParameter(devicePlatform, "devicePlatform");
        Intrinsics.checkNotNullParameter(deviceCountry, "deviceCountry");
        Intrinsics.checkNotNullParameter(deviceLanguage, "deviceLanguage");
        Intrinsics.checkNotNullParameter(deviceTimezone, "deviceTimezone");
        Intrinsics.checkNotNullParameter(deviceConnectionType, "deviceConnectionType");
        Intrinsics.checkNotNullParameter(deviceOrientation, "deviceOrientation");
        this.a = sessionId;
        this.b = i;
        this.c = appId;
        this.d = appVersion;
        this.e = chartboostSdkVersion;
        this.f = z;
        this.g = chartboostSdkGdpr;
        this.h = chartboostSdkCcpa;
        this.i = chartboostSdkCoppa;
        this.j = chartboostSdkLgpd;
        this.k = deviceId;
        this.l = deviceMake;
        this.m = deviceModel;
        this.n = deviceOsVersion;
        this.o = devicePlatform;
        this.p = deviceCountry;
        this.q = deviceLanguage;
        this.r = deviceTimezone;
        this.s = deviceConnectionType;
        this.t = deviceOrientation;
        this.u = i2;
        this.v = z2;
        this.w = i3;
        this.x = z3;
        this.y = i4;
        this.z = j;
        this.A = j2;
        this.B = i5;
        this.C = i6;
        this.D = i7;
        this.E = j3;
        this.F = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return Intrinsics.areEqual(this.a, j7Var.a) && this.b == j7Var.b && Intrinsics.areEqual(this.c, j7Var.c) && Intrinsics.areEqual(this.d, j7Var.d) && Intrinsics.areEqual(this.e, j7Var.e) && this.f == j7Var.f && Intrinsics.areEqual(this.g, j7Var.g) && Intrinsics.areEqual(this.h, j7Var.h) && Intrinsics.areEqual(this.i, j7Var.i) && Intrinsics.areEqual(this.j, j7Var.j) && Intrinsics.areEqual(this.k, j7Var.k) && Intrinsics.areEqual(this.l, j7Var.l) && Intrinsics.areEqual(this.m, j7Var.m) && Intrinsics.areEqual(this.n, j7Var.n) && Intrinsics.areEqual(this.o, j7Var.o) && Intrinsics.areEqual(this.p, j7Var.p) && Intrinsics.areEqual(this.q, j7Var.q) && Intrinsics.areEqual(this.r, j7Var.r) && Intrinsics.areEqual(this.s, j7Var.s) && Intrinsics.areEqual(this.t, j7Var.t) && this.u == j7Var.u && this.v == j7Var.v && this.w == j7Var.w && this.x == j7Var.x && this.y == j7Var.y && this.z == j7Var.z && this.A == j7Var.A && this.B == j7Var.B && this.C == j7Var.C && this.D == j7Var.D && this.E == j7Var.E && this.F == j7Var.F;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + Integer.hashCode(this.u)) * 31) + Boolean.hashCode(this.v)) * 31) + Integer.hashCode(this.w)) * 31) + Boolean.hashCode(this.x)) * 31) + Integer.hashCode(this.y)) * 31) + Long.hashCode(this.z)) * 31) + Long.hashCode(this.A)) * 31) + Integer.hashCode(this.B)) * 31) + Integer.hashCode(this.C)) * 31) + Integer.hashCode(this.D)) * 31) + Long.hashCode(this.E)) * 31) + Long.hashCode(this.F);
    }

    public String toString() {
        return "EnvironmentData(sessionId=" + this.a + ", sessionCount=" + this.b + ", appId=" + this.c + ", appVersion=" + this.d + ", chartboostSdkVersion=" + this.e + ", chartboostSdkAutocacheEnabled=" + this.f + ", chartboostSdkGdpr=" + this.g + ", chartboostSdkCcpa=" + this.h + ", chartboostSdkCoppa=" + this.i + ", chartboostSdkLgpd=" + this.j + ", deviceId=" + this.k + ", deviceMake=" + this.l + ", deviceModel=" + this.m + ", deviceOsVersion=" + this.n + ", devicePlatform=" + this.o + ", deviceCountry=" + this.p + ", deviceLanguage=" + this.q + ", deviceTimezone=" + this.r + ", deviceConnectionType=" + this.s + ", deviceOrientation=" + this.t + ", deviceBatteryLevel=" + this.u + ", deviceChargingStatus=" + this.v + ", deviceVolume=" + this.w + ", deviceMute=" + this.x + ", deviceAudioOutput=" + this.y + ", deviceStorage=" + this.z + ", deviceLowMemoryWarning=" + this.A + ", sessionImpressionInterstitialCount=" + this.B + ", sessionImpressionRewardedCount=" + this.C + ", sessionImpressionBannerCount=" + this.D + ", sessionDuration=" + this.E + ", deviceUpTime=" + this.F + ")";
    }

    public final String B() {
        return this.a;
    }

    public final int z() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }

    public final String g() {
        return this.e;
    }

    public final boolean b() {
        return this.f;
    }

    public final String e() {
        return this.g;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.i;
    }

    public final String f() {
        return this.j;
    }

    public final String m() {
        return this.k;
    }

    public final String p() {
        return this.l;
    }

    public final String q() {
        return this.m;
    }

    public final String t() {
        return this.n;
    }

    public final String u() {
        return this.o;
    }

    public final String l() {
        return this.p;
    }

    public final String n() {
        return this.q;
    }

    public final String w() {
        return this.r;
    }

    public final String k() {
        return this.s;
    }

    public final String s() {
        return this.t;
    }

    public final int i() {
        return this.u;
    }

    public final boolean j() {
        return this.v;
    }

    public final int y() {
        return this.w;
    }

    public final boolean r() {
        return this.x;
    }

    public final int h() {
        return this.y;
    }

    public final long v() {
        return this.z;
    }

    public final long o() {
        return this.A;
    }

    public final int D() {
        return this.B;
    }

    public final int E() {
        return this.C;
    }

    public final int C() {
        return this.D;
    }

    public final long A() {
        return this.E;
    }

    public final long x() {
        return this.F;
    }

    public /* synthetic */ j7(String str, int i, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i2, boolean z2, int i3, boolean z3, int i4, long j, long j2, int i5, int i6, int i7, long j3, long j4, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "not available" : str, (i8 & 2) != 0 ? 0 : i, (i8 & 4) != 0 ? "not available" : str2, (i8 & 8) != 0 ? "not available" : str3, (i8 & 16) != 0 ? "not available" : str4, (i8 & 32) != 0 ? false : z, (i8 & 64) != 0 ? "not available" : str5, (i8 & 128) != 0 ? "not available" : str6, (i8 & 256) != 0 ? "not available" : str7, (i8 & 512) != 0 ? "not available" : str8, (i8 & 1024) != 0 ? "not available" : str9, (i8 & 2048) != 0 ? "not available" : str10, (i8 & 4096) != 0 ? "not available" : str11, (i8 & 8192) != 0 ? "not available" : str12, (i8 & 16384) != 0 ? "not available" : str13, (i8 & 32768) != 0 ? "not available" : str14, (i8 & 65536) != 0 ? "not available" : str15, (i8 & 131072) != 0 ? "not available" : str16, (i8 & 262144) != 0 ? "not available" : str17, (i8 & 524288) != 0 ? "not available" : str18, (i8 & 1048576) != 0 ? 0 : i2, (i8 & 2097152) != 0 ? false : z2, (i8 & 4194304) != 0 ? 0 : i3, (i8 & 8388608) != 0 ? false : z3, (i8 & 16777216) != 0 ? 0 : i4, (i8 & 33554432) != 0 ? 0L : j, (i8 & 67108864) != 0 ? 0L : j2, (i8 & 134217728) != 0 ? 0 : i5, (i8 & 268435456) != 0 ? 0 : i6, (i8 & 536870912) != 0 ? 0 : i7, (i8 & 1073741824) == 0 ? j3 : 0L, (i8 & Integer.MIN_VALUE) != 0 ? SystemClock.uptimeMillis() : j4);
    }
}
