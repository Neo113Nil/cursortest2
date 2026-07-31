package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nx1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f29784a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Long f29785b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29786c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29787d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final uy1 f29788e;

    public nx1(@Nullable String str, @Nullable Long l4, boolean z4, boolean z5, @Nullable uy1 uy1Var) {
        this.f29784a = str;
        this.f29785b = l4;
        this.f29786c = z4;
        this.f29787d = z5;
        this.f29788e = uy1Var;
    }

    @Nullable
    public final uy1 a() {
        return this.f29788e;
    }

    @Nullable
    public final Long b() {
        return this.f29785b;
    }

    public final boolean c() {
        return this.f29787d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx1)) {
            return false;
        }
        nx1 nx1Var = (nx1) obj;
        return Intrinsics.areEqual(this.f29784a, nx1Var.f29784a) && Intrinsics.areEqual(this.f29785b, nx1Var.f29785b) && this.f29786c == nx1Var.f29786c && this.f29787d == nx1Var.f29787d && Intrinsics.areEqual(this.f29788e, nx1Var.f29788e);
    }

    public final int hashCode() {
        String str = this.f29784a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l4 = this.f29785b;
        int a4 = C1965h6.a(this.f29787d, C1965h6.a(this.f29786c, (hashCode + (l4 == null ? 0 : l4.hashCode())) * 31, 31), 31);
        uy1 uy1Var = this.f29788e;
        return a4 + (uy1Var != null ? uy1Var.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Settings(templateType=" + this.f29784a + ", multiBannerAutoScrollInterval=" + this.f29785b + ", isHighlightingEnabled=" + this.f29786c + ", isLoopingVideo=" + this.f29787d + ", mediaAssetImageFallbackSize=" + this.f29788e + ")";
    }
}
