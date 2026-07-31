package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f70 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25690a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final RectF f25691b;

    public f70(int i4, @Nullable RectF rectF) {
        this.f25690a = i4;
        this.f25691b = rectF;
    }

    public final int a() {
        return this.f25690a;
    }

    @Nullable
    public final RectF b() {
        return this.f25691b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f70)) {
            return false;
        }
        f70 f70Var = (f70) obj;
        return this.f25690a == f70Var.f25690a && Intrinsics.areEqual(this.f25691b, f70Var.f25691b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f25690a) * 31;
        RectF rectF = this.f25691b;
        return hashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    @NotNull
    public final String toString() {
        return "Exposure(exposedPercentage=" + this.f25690a + ", visibleRectangle=" + this.f25691b + ")";
    }
}
