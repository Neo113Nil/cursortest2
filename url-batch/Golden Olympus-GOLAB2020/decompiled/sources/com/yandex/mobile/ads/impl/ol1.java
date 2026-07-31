package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ol1 implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final km0 f30085a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final im0 f30086b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final il1 f30087c;

    public /* synthetic */ ol1(km0 km0Var) {
        this(km0Var, new im0(), new il1());
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        jm0 a4 = this.f30085a.a();
        ProgressBar progressBar = null;
        j70 instreamAdView = a4 != null ? a4.b() : null;
        if (instreamAdView != null) {
            this.f30086b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
            db2 adUiElements = instreamAdView.getAdUiElements();
            if (adUiElements != null) {
                progressBar = adUiElements.j();
            }
        }
        ProgressBar progressBar2 = progressBar;
        if (progressBar2 != null) {
            this.f30087c.a(progressBar2, j5, j4);
        }
    }

    public ol1(@NotNull km0 instreamAdViewsHolderManager, @NotNull im0 instreamAdViewUiElementsManager, @NotNull il1 progressBarConfigurator) {
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(instreamAdViewUiElementsManager, "instreamAdViewUiElementsManager");
        Intrinsics.checkNotNullParameter(progressBarConfigurator, "progressBarConfigurator");
        this.f30085a = instreamAdViewsHolderManager;
        this.f30086b = instreamAdViewUiElementsManager;
        this.f30087c = progressBarConfigurator;
    }
}
