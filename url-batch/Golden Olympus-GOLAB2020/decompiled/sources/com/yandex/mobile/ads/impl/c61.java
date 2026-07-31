package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sd2 f24071a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b31 f24072b;

    public /* synthetic */ c61() {
        this(new sd2(), new b31());
    }

    @Nullable
    public final jt a(@Nullable mw0 mw0Var) {
        if (mw0Var == null) {
            return null;
        }
        ab2 c4 = mw0Var.c();
        List<ej0> a4 = mw0Var.a();
        eu0 b4 = mw0Var.b();
        if (c4 != null) {
            sd2 sd2Var = this.f24071a;
            ob2<ya1> videoAdInfo = c4.b();
            sd2Var.getClass();
            Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
            return new jt(videoAdInfo.d().getAdHeight() != 0 ? r4.getAdWidth() / r4.getAdHeight() : 1.7777778f);
        }
        if (a4 != null && a4.size() > 1) {
            this.f24072b.getClass();
            return new jt((float) b31.a(a4));
        }
        if (b4 != null) {
            return new jt(b4.a());
        }
        return null;
    }

    public c61(@NotNull sd2 aspectRatioProvider, @NotNull b31 multiBannerRatioProvider) {
        Intrinsics.checkNotNullParameter(aspectRatioProvider, "aspectRatioProvider");
        Intrinsics.checkNotNullParameter(multiBannerRatioProvider, "multiBannerRatioProvider");
        this.f24071a = aspectRatioProvider;
        this.f24072b = multiBannerRatioProvider;
    }
}
