package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fo0 implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lc2<on0> f25881a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fd2 f25882b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final jg2 f25883c;

    public /* synthetic */ fo0(kn0 kn0Var, do0 do0Var, fd2 fd2Var) {
        this(kn0Var, do0Var, fd2Var, new s21());
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        boolean a4 = this.f25883c.a();
        if (this.f25882b.a() != ed2.f25245i) {
            if (a4) {
                if (this.f25881a.isPlayingAd()) {
                    return;
                }
                this.f25881a.resumeAd();
            } else if (this.f25881a.isPlayingAd()) {
                this.f25881a.pauseAd();
            }
        }
    }

    public fo0(@NotNull kn0 videoAdPlayer, @NotNull do0 videoViewProvider, @NotNull fd2 videoAdStatusController, @NotNull s21 mrcVideoAdViewValidatorFactory) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(videoAdStatusController, "videoAdStatusController");
        Intrinsics.checkNotNullParameter(mrcVideoAdViewValidatorFactory, "mrcVideoAdViewValidatorFactory");
        this.f25881a = videoAdPlayer;
        this.f25882b = videoAdStatusController;
        mrcVideoAdViewValidatorFactory.getClass();
        this.f25883c = s21.a(videoViewProvider);
    }
}
