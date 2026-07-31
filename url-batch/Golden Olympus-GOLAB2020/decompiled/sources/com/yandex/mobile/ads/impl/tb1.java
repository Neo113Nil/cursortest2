package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f32282a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<tx1> f32283b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f32284c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f32285d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final C1795a4 f32286e;

    public tb1(@NotNull List assets, @NotNull ArrayList showNotices, @NotNull ArrayList renderTrackingUrls, @Nullable String str, @Nullable C1795a4 c1795a4) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        this.f32282a = assets;
        this.f32283b = showNotices;
        this.f32284c = renderTrackingUrls;
        this.f32285d = str;
        this.f32286e = c1795a4;
    }

    @Nullable
    public final String a() {
        return this.f32285d;
    }

    @NotNull
    public final List<C2276uf<?>> b() {
        return this.f32282a;
    }

    @Nullable
    public final C1795a4 c() {
        return this.f32286e;
    }

    @NotNull
    public final List<String> d() {
        return this.f32284c;
    }

    @NotNull
    public final List<tx1> e() {
        return this.f32283b;
    }
}
