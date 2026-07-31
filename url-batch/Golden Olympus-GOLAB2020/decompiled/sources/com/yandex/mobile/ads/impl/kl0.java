package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kl0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f28223a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f28224b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f28225c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f28226d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f28227e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f28228f;

    public kl0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f28223a = str;
        this.f28224b = str2;
        this.f28225c = str3;
        this.f28226d = str4;
        this.f28227e = str5;
        this.f28228f = str6;
    }

    @Nullable
    public final String a() {
        return this.f28223a;
    }

    @Nullable
    public final String b() {
        return this.f28228f;
    }

    @Nullable
    public final String c() {
        return this.f28227e;
    }

    @Nullable
    public final String d() {
        return this.f28225c;
    }

    @Nullable
    public final String e() {
        return this.f28224b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl0)) {
            return false;
        }
        kl0 kl0Var = (kl0) obj;
        return Intrinsics.areEqual(this.f28223a, kl0Var.f28223a) && Intrinsics.areEqual(this.f28224b, kl0Var.f28224b) && Intrinsics.areEqual(this.f28225c, kl0Var.f28225c) && Intrinsics.areEqual(this.f28226d, kl0Var.f28226d) && Intrinsics.areEqual(this.f28227e, kl0Var.f28227e) && Intrinsics.areEqual(this.f28228f, kl0Var.f28228f);
    }

    @Nullable
    public final String f() {
        return this.f28226d;
    }

    public final int hashCode() {
        String str = this.f28223a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f28224b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28225c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f28226d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f28227e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f28228f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "InstreamAdInfo(adId=" + this.f28223a + ", creativeId=" + this.f28224b + ", bannerId=" + this.f28225c + ", data=" + this.f28226d + ", advertiserInfo=" + this.f28227e + ", adParameters=" + this.f28228f + ")";
    }
}
