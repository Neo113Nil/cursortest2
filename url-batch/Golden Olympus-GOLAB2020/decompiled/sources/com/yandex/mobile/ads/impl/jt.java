package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jt {

    /* renamed from: a, reason: collision with root package name */
    private final float f27820a;

    public jt(float f4) {
        this.f27820a = f4;
    }

    public final float a() {
        return this.f27820a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt) && Float.compare(this.f27820a, ((jt) obj).f27820a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27820a);
    }

    @NotNull
    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.f27820a + ")";
    }
}
