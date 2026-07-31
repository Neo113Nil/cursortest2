package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vh2 implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lc2<?> f33630a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final id2 f33631b;

    public /* synthetic */ vh2(ia1 ia1Var, qb1 qb1Var) {
        this(ia1Var, qb1Var, new s21(), s21.a(qb1Var));
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        if (this.f33631b.a()) {
            if (this.f33630a.isPlayingAd()) {
                return;
            }
            this.f33630a.resumeAd();
        } else if (this.f33630a.isPlayingAd()) {
            this.f33630a.pauseAd();
        }
    }

    public vh2(@NotNull ia1 videoAdPlayer, @NotNull qb1 videoViewProvider, @NotNull s21 mrcVideoAdViewValidatorFactory, @NotNull id2 videoAdVisibilityValidator) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(mrcVideoAdViewValidatorFactory, "mrcVideoAdViewValidatorFactory");
        Intrinsics.checkNotNullParameter(videoAdVisibilityValidator, "videoAdVisibilityValidator");
        this.f33630a = videoAdPlayer;
        this.f33631b = videoAdVisibilityValidator;
    }
}
