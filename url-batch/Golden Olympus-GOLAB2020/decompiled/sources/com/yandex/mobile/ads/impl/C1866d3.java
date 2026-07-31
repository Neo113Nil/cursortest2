package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1866d3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f24408a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f24409b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f24410c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f24411d;

    public C1866d3(int i4, @NotNull String description, @NotNull String displayMessage, @Nullable String str) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
        this.f24408a = i4;
        this.f24409b = description;
        this.f24410c = displayMessage;
        this.f24411d = str;
    }

    @Nullable
    public final String a() {
        return this.f24411d;
    }

    public final int b() {
        return this.f24408a;
    }

    @NotNull
    public final String c() {
        return this.f24409b;
    }

    @NotNull
    public final String d() {
        return this.f24410c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1866d3)) {
            return false;
        }
        C1866d3 c1866d3 = (C1866d3) obj;
        return this.f24408a == c1866d3.f24408a && Intrinsics.areEqual(this.f24409b, c1866d3.f24409b) && Intrinsics.areEqual(this.f24410c, c1866d3.f24410c) && Intrinsics.areEqual(this.f24411d, c1866d3.f24411d);
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f24410c, C1842c3.a(this.f24409b, Integer.hashCode(this.f24408a) * 31, 31), 31);
        String str = this.f24411d;
        return a4 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String format = String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f24408a), this.f24409b, this.f24411d, this.f24410c}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
