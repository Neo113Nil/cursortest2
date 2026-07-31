package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pi0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30455a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bitmap f30456b;

    public pi0(@NotNull String url, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f30455a = url;
        this.f30456b = bitmap;
    }

    @NotNull
    public final Bitmap a() {
        return this.f30456b;
    }

    @NotNull
    public final String b() {
        return this.f30455a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi0)) {
            return false;
        }
        pi0 pi0Var = (pi0) obj;
        return Intrinsics.areEqual(this.f30455a, pi0Var.f30455a) && Intrinsics.areEqual(this.f30456b, pi0Var.f30456b);
    }

    public final int hashCode() {
        return this.f30456b.hashCode() + (this.f30455a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ImageData(url=" + this.f30455a + ", bitmap=" + this.f30456b + ")";
    }
}
