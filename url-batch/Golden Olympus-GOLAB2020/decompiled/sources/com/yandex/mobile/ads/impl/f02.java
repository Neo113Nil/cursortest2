package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f02 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f25535a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f25536b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f25537c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f25538d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final C1833bi f25539e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final xz1 f25540f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final List<xz1> f25541g;

    public f02() {
        this(0);
    }

    @Nullable
    public final C1833bi a() {
        return this.f25539e;
    }

    @Nullable
    public final xz1 b() {
        return this.f25540f;
    }

    @Nullable
    public final List<xz1> c() {
        return this.f25541g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f02)) {
            return false;
        }
        f02 f02Var = (f02) obj;
        return Intrinsics.areEqual(this.f25535a, f02Var.f25535a) && Intrinsics.areEqual(this.f25536b, f02Var.f25536b) && Intrinsics.areEqual(this.f25537c, f02Var.f25537c) && Intrinsics.areEqual(this.f25538d, f02Var.f25538d) && Intrinsics.areEqual(this.f25539e, f02Var.f25539e) && Intrinsics.areEqual(this.f25540f, f02Var.f25540f) && Intrinsics.areEqual(this.f25541g, f02Var.f25541g);
    }

    public final int hashCode() {
        String str = this.f25535a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25536b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25537c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25538d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C1833bi c1833bi = this.f25539e;
        int hashCode5 = (hashCode4 + (c1833bi == null ? 0 : c1833bi.hashCode())) * 31;
        xz1 xz1Var = this.f25540f;
        int hashCode6 = (hashCode5 + (xz1Var == null ? 0 : xz1Var.hashCode())) * 31;
        List<xz1> list = this.f25541g;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SmartCenterSettings(colorWizButton=" + this.f25535a + ", colorWizButtonText=" + this.f25536b + ", colorWizBack=" + this.f25537c + ", colorWizBackRight=" + this.f25538d + ", backgroundColors=" + this.f25539e + ", smartCenter=" + this.f25540f + ", smartCenters=" + this.f25541g + ")";
    }

    public /* synthetic */ f02(int i4) {
        this(null, null, null, null, null, null, null);
    }

    public f02(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable C1833bi c1833bi, @Nullable xz1 xz1Var, @Nullable List<xz1> list) {
        this.f25535a = str;
        this.f25536b = str2;
        this.f25537c = str3;
        this.f25538d = str4;
        this.f25539e = c1833bi;
        this.f25540f = xz1Var;
        this.f25541g = list;
    }
}
