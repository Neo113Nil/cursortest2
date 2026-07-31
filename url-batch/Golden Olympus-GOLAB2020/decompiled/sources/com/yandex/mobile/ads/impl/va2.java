package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class va2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f33562a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33563b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33564c;

    public va2(int i4, int i5, int i6) {
        this.f33562a = i4;
        this.f33563b = i5;
        this.f33564c = i6;
    }

    public final int a() {
        return this.f33562a;
    }

    public final int b() {
        return this.f33563b;
    }

    public final int c() {
        return this.f33564c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va2)) {
            return false;
        }
        va2 va2Var = (va2) obj;
        return this.f33562a == va2Var.f33562a && this.f33563b == va2Var.f33563b && this.f33564c == va2Var.f33564c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33564c) + sx1.a(this.f33563b, Integer.hashCode(this.f33562a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "VersionInfo(majorVersion=" + this.f33562a + ", minorVersion=" + this.f33563b + ", patchVersion=" + this.f33564c + ")";
    }
}
