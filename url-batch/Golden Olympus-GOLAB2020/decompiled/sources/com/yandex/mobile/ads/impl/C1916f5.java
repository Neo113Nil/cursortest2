package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1916f5 implements ws {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2315w8 f25614a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private ws f25615b;

    public C1916f5(@NotNull C2315w8 adStartedListener) {
        Intrinsics.checkNotNullParameter(adStartedListener, "adStartedListener");
        this.f25614a = adStartedListener;
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.a(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void b(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.b(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void c(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.c(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void d(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f25614a.a();
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.d(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void e(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.e(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void f(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.f(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void g(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.g(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void h(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.h(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void i(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.i(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void a(@NotNull on0 videoAd, @NotNull mc2 error) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(error, "error");
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.a(videoAd, error);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void a(@NotNull on0 videoAd, float f4) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        ws wsVar = this.f25615b;
        if (wsVar != null) {
            wsVar.a(videoAd, f4);
        }
    }

    public final void a(@Nullable sl0 sl0Var) {
        this.f25615b = sl0Var;
    }
}
