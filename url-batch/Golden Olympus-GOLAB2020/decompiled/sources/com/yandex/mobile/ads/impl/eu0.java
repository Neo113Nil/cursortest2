package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class eu0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f25462a;

    /* renamed from: b, reason: collision with root package name */
    private final float f25463b;

    public eu0(@Nullable String str, float f4) {
        this.f25462a = str;
        this.f25463b = f4;
    }

    public final float a() {
        return this.f25463b;
    }

    @Nullable
    public final String b() {
        return this.f25462a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu0)) {
            return false;
        }
        eu0 eu0Var = (eu0) obj;
        return Intrinsics.areEqual(this.f25462a, eu0Var.f25462a) && Float.compare(this.f25463b, eu0Var.f25463b) == 0;
    }

    public final int hashCode() {
        String str = this.f25462a;
        return Float.hashCode(this.f25463b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "Media(htmlContent=" + this.f25462a + ", aspectRatio=" + this.f25463b + ")";
    }
}
