package com.yandex.mobile.ads.impl;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t31 implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f32142b = "YandexAds.UrlTracker";

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f32143c = "YandexAds.BaseController";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32144a;

    public t31(@NotNull String threadName) {
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        this.f32144a = threadName;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public final Thread newThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return new Thread(runnable, this.f32144a);
    }
}
