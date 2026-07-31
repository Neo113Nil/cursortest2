package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ob2<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hu f29964a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bb2 f29965b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mv0 f29966c;

    /* renamed from: d, reason: collision with root package name */
    private final T f29967d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final w02 f29968e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f29969f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final C1944g9 f29970g;

    /* JADX WARN: Multi-variable type inference failed */
    public ob2(@NotNull hu creative, @NotNull bb2 vastVideoAd, @NotNull mv0 mediaFile, Object obj, @Nullable w02 w02Var, @NotNull String preloadRequestId, @Nullable C1944g9 c1944g9) {
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(vastVideoAd, "vastVideoAd");
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        Intrinsics.checkNotNullParameter(preloadRequestId, "preloadRequestId");
        this.f29964a = creative;
        this.f29965b = vastVideoAd;
        this.f29966c = mediaFile;
        this.f29967d = obj;
        this.f29968e = w02Var;
        this.f29969f = preloadRequestId;
        this.f29970g = c1944g9;
    }

    @Nullable
    public final C1944g9 a() {
        return this.f29970g;
    }

    @NotNull
    public final hu b() {
        return this.f29964a;
    }

    @NotNull
    public final mv0 c() {
        return this.f29966c;
    }

    public final T d() {
        return this.f29967d;
    }

    @NotNull
    public final String e() {
        return this.f29969f;
    }

    @Nullable
    public final w02 f() {
        return this.f29968e;
    }

    @NotNull
    public final bb2 g() {
        return this.f29965b;
    }
}
