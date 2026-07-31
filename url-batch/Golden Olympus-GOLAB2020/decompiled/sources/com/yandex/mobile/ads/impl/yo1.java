package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yo1 {

    private static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final mb1 f35276b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final bp1 f35277c;

        public a(@NotNull mb1 nativeVideoView, @NotNull bp1 replayActionView) {
            Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
            Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
            this.f35276b = nativeVideoView;
            this.f35277c = replayActionView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35276b.c().setVisibility(4);
            this.f35277c.a().setVisibility(0);
        }
    }

    private static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final bp1 f35278b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Bitmap f35279c;

        public b(@NotNull bp1 replayActionView, @NotNull Bitmap background) {
            Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
            Intrinsics.checkNotNullParameter(background, "background");
            this.f35278b = replayActionView;
            this.f35279c = background;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35278b.setBackground(new BitmapDrawable(this.f35278b.getResources(), this.f35279c));
            this.f35278b.setVisibility(0);
        }
    }

    public static void a(@NotNull mb1 nativeVideoView, @NotNull bp1 replayActionView, @NotNull Bitmap background) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
        Intrinsics.checkNotNullParameter(background, "background");
        replayActionView.setAlpha(0.0f);
        replayActionView.animate().alpha(1.0f).setDuration(700L).withStartAction(new b(replayActionView, background)).withEndAction(new a(nativeVideoView, replayActionView)).start();
    }
}
