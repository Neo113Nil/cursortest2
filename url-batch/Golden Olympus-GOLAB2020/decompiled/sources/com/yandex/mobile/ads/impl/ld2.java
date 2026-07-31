package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ld2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<bb2> f28519a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<bb2> f28520b;

    public ld2(@NotNull List<bb2> inLineAds, @NotNull List<bb2> wrapperAds) {
        Intrinsics.checkNotNullParameter(inLineAds, "inLineAds");
        Intrinsics.checkNotNullParameter(wrapperAds, "wrapperAds");
        this.f28519a = inLineAds;
        this.f28520b = wrapperAds;
    }

    @NotNull
    public final List<bb2> a() {
        return this.f28519a;
    }

    @NotNull
    public final List<bb2> b() {
        return this.f28520b;
    }
}
