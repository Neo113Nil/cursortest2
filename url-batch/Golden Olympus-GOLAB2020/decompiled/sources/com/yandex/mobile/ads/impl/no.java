package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class no {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29688a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29689b;

    public no(int i4, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f29688a = url;
        this.f29689b = i4;
    }

    public final int a() {
        return this.f29689b;
    }

    @NotNull
    public final String b() {
        return this.f29688a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no)) {
            return false;
        }
        no noVar = (no) obj;
        return Intrinsics.areEqual(this.f29688a, noVar.f29688a) && this.f29689b == noVar.f29689b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29689b) + (this.f29688a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ClickQrcode(url=" + this.f29688a + ", sizeInPx=" + this.f29689b + ")";
    }
}
