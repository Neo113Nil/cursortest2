package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class r9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18902a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f18903b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f18904c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f18905d;

    public r9() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ r9 a(r9 r9Var, String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = r9Var.f18902a;
        }
        if ((i4 & 2) != 0) {
            str2 = r9Var.f18903b;
        }
        if ((i4 & 4) != 0) {
            str3 = r9Var.f18904c;
        }
        if ((i4 & 8) != 0) {
            str4 = r9Var.f18905d;
        }
        return r9Var.a(str, str2, str3, str4);
    }

    @NotNull
    public final String b() {
        return this.f18903b;
    }

    @NotNull
    public final String c() {
        return this.f18904c;
    }

    @NotNull
    public final String d() {
        return this.f18905d;
    }

    @NotNull
    public final String e() {
        return this.f18905d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9)) {
            return false;
        }
        r9 r9Var = (r9) obj;
        return Intrinsics.areEqual(this.f18902a, r9Var.f18902a) && Intrinsics.areEqual(this.f18903b, r9Var.f18903b) && Intrinsics.areEqual(this.f18904c, r9Var.f18904c) && Intrinsics.areEqual(this.f18905d, r9Var.f18905d);
    }

    @NotNull
    public final String f() {
        return this.f18904c;
    }

    @NotNull
    public final String g() {
        return this.f18902a;
    }

    @NotNull
    public final String h() {
        return this.f18903b;
    }

    public int hashCode() {
        return (((((this.f18902a.hashCode() * 31) + this.f18903b.hashCode()) * 31) + this.f18904c.hashCode()) * 31) + this.f18905d.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.f18902a + ", customRewardedVideoAdapterName=" + this.f18903b + ", customInterstitialAdapterName=" + this.f18904c + ", customBannerAdapterName=" + this.f18905d + ')';
    }

    public r9(@NotNull String customNetworkAdapterName, @NotNull String customRewardedVideoAdapterName, @NotNull String customInterstitialAdapterName, @NotNull String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.f18902a = customNetworkAdapterName;
        this.f18903b = customRewardedVideoAdapterName;
        this.f18904c = customInterstitialAdapterName;
        this.f18905d = customBannerAdapterName;
    }

    @NotNull
    public final r9 a(@NotNull String customNetworkAdapterName, @NotNull String customRewardedVideoAdapterName, @NotNull String customInterstitialAdapterName, @NotNull String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new r9(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public /* synthetic */ r9(String str, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4);
    }

    @NotNull
    public final String a() {
        return this.f18902a;
    }
}
