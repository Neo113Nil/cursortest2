package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vv {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f33771a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f33772b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f33773c;

    public vv(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f33771a = str;
        this.f33772b = str2;
        this.f33773c = str3;
    }

    @Nullable
    public final String a() {
        return this.f33773c;
    }

    @Nullable
    public final String b() {
        return this.f33772b;
    }

    @Nullable
    public final String c() {
        return this.f33771a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv)) {
            return false;
        }
        vv vvVar = (vv) obj;
        return Intrinsics.areEqual(this.f33771a, vvVar.f33771a) && Intrinsics.areEqual(this.f33772b, vvVar.f33772b) && Intrinsics.areEqual(this.f33773c, vvVar.f33773c);
    }

    public final int hashCode() {
        String str = this.f33771a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f33772b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33773c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdNetworkSettingsData(pageId=" + this.f33771a + ", appReviewStatus=" + this.f33772b + ", appAdsTxt=" + this.f33773c + ")";
    }
}
