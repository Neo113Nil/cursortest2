package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w02 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33862a;

    public w02(@NotNull String clickThroughUrl) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        this.f33862a = clickThroughUrl;
    }

    @NotNull
    public final String a() {
        return this.f33862a;
    }
}
