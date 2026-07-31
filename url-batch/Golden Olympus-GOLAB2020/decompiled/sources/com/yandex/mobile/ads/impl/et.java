package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class et {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Bitmap> f25420a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f25421b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25422c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25423d;

    public et(@NotNull Function0<Bitmap> getBitmap, @Nullable String str, int i4, int i5) {
        Intrinsics.checkNotNullParameter(getBitmap, "getBitmap");
        this.f25420a = getBitmap;
        this.f25421b = str;
        this.f25422c = i4;
        this.f25423d = i5;
    }

    @Nullable
    public final Bitmap a() {
        return (Bitmap) this.f25420a.invoke();
    }

    public final int b() {
        return this.f25423d;
    }

    @Nullable
    public final String c() {
        return this.f25421b;
    }

    public final int d() {
        return this.f25422c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        return Intrinsics.areEqual(this.f25420a, etVar.f25420a) && Intrinsics.areEqual(this.f25421b, etVar.f25421b) && this.f25422c == etVar.f25422c && this.f25423d == etVar.f25423d;
    }

    public final int hashCode() {
        int hashCode = this.f25420a.hashCode() * 31;
        String str = this.f25421b;
        return Integer.hashCode(this.f25423d) + sx1.a(this.f25422c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "CoreNativeAdImage(getBitmap=" + this.f25420a + ", sizeType=" + this.f25421b + ", width=" + this.f25422c + ", height=" + this.f25423d + ")";
    }
}
