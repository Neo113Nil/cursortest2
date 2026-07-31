package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vq0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Integer f33723a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f33724b;

    public vq0(@Nullable Integer num, @Nullable Integer num2) {
        this.f33723a = num;
        this.f33724b = num2;
    }

    @Nullable
    public final Integer a() {
        return this.f33724b;
    }

    @Nullable
    public final Integer b() {
        return this.f33723a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq0)) {
            return false;
        }
        vq0 vq0Var = (vq0) obj;
        return Intrinsics.areEqual(this.f33723a, vq0Var.f33723a) && Intrinsics.areEqual(this.f33724b, vq0Var.f33724b);
    }

    public final int hashCode() {
        Integer num = this.f33723a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f33724b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "LayoutParamsSize(width=" + this.f33723a + ", height=" + this.f33724b + ")";
    }
}
