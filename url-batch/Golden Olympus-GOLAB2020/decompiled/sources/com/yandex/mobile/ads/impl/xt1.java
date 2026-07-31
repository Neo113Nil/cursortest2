package com.yandex.mobile.ads.impl;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xt1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1905ei f34671a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qs0 f34672b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f34673c;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final vo0 f34674b;

        public a(@NotNull vo0 adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            this.f34674b = adView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            og2.a(this.f34674b, false);
        }
    }

    public xt1(@NotNull vo0 adView, @NotNull C1905ei contentController, @NotNull qs0 mainThreadHandler, @NotNull a removePreviousBannerRunnable) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(contentController, "contentController");
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        Intrinsics.checkNotNullParameter(removePreviousBannerRunnable, "removePreviousBannerRunnable");
        this.f34671a = contentController;
        this.f34672b = mainThreadHandler;
        this.f34673c = removePreviousBannerRunnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ap0.d(new Object[0]);
        this.f34671a.m();
        this.f34672b.a(this.f34673c);
        return true;
    }
}
