package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.c92;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kk0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final List<c92.a> f28217b = CollectionsKt.listOf((Object[]) new c92.a[]{c92.a.f24127c, c92.a.f24128d, c92.a.f24134j});

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lk0 f28218a;

    public /* synthetic */ kk0() {
        this(new lk0());
    }

    public final void a(@NotNull FrameLayout adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.f28218a.a(adView);
    }

    public kk0(@NotNull lk0 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f28218a = renderer;
    }

    public final void a(@NotNull c92 validationResult, @NotNull FrameLayout adView) {
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.f28218a.a(adView, validationResult, !f28217b.contains(validationResult.b()));
    }
}
