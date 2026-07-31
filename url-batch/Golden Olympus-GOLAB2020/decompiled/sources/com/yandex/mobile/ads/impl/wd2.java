package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wd2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<String> f34014a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f34015b;

    public wd2(@Nullable String str, @NotNull List clickTrackings) {
        Intrinsics.checkNotNullParameter(clickTrackings, "clickTrackings");
        this.f34014a = clickTrackings;
        this.f34015b = str;
    }

    @Nullable
    public final String a() {
        return this.f34015b;
    }

    @NotNull
    public final List<String> b() {
        return this.f34014a;
    }
}
