package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import com.yandex.mobile.ads.impl.zh1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y60 implements ga1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d60 f34814a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final iw0 f34815b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bf2 f34816c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final fa1 f34817d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final lf2 f34818e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f34819f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final p60 f34820g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private ya1 f34821h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private nc2 f34822i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f34823j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f34824k;

    private final class a implements zh1.b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f34825a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f34826b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f34827c;

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.zh1.b
        public final void b(@NotNull c60 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f34825a = false;
            y60.this.f34820g.b();
            y60.this.f34814a.stop();
            y60.this.f34816c.a(error.getMessage());
            nc2 nc2Var = y60.this.f34822i;
            gc2 gc2Var = y60.this.f34821h;
            if (nc2Var == null || gc2Var == null) {
                return;
            }
            y60.this.f34817d.getClass();
            nc2Var.a(gc2Var, fa1.a(error));
        }

        @Override // com.yandex.mobile.ads.impl.zh1.b
        public final void onIsPlayingChanged(boolean z4) {
            if (!z4) {
                if (this.f34826b) {
                    return;
                }
                this.f34827c = true;
                nc2 nc2Var = y60.this.f34822i;
                gc2 gc2Var = y60.this.f34821h;
                if (nc2Var == null || gc2Var == null) {
                    return;
                }
                nc2Var.b(gc2Var);
                return;
            }
            if (!this.f34825a) {
                nc2 nc2Var2 = y60.this.f34822i;
                gc2 gc2Var2 = y60.this.f34821h;
                if (nc2Var2 == null || gc2Var2 == null) {
                    return;
                }
                this.f34825a = true;
                nc2Var2.h(gc2Var2);
                return;
            }
            if (this.f34827c) {
                this.f34827c = false;
                nc2 nc2Var3 = y60.this.f34822i;
                gc2 gc2Var3 = y60.this.f34821h;
                if (nc2Var3 == null || gc2Var3 == null) {
                    return;
                }
                nc2Var3.g(gc2Var3);
            }
        }

        @Override // com.yandex.mobile.ads.impl.zh1.b
        public final void onPlaybackStateChanged(int i4) {
            if (i4 == 2) {
                this.f34826b = true;
                nc2 nc2Var = y60.this.f34822i;
                gc2 gc2Var = y60.this.f34821h;
                if (nc2Var == null || gc2Var == null) {
                    return;
                }
                nc2Var.f(gc2Var);
                return;
            }
            if (i4 != 3) {
                if (i4 != 4) {
                    return;
                }
                this.f34825a = false;
                nc2 nc2Var2 = y60.this.f34822i;
                gc2 gc2Var2 = y60.this.f34821h;
                if (nc2Var2 == null || gc2Var2 == null) {
                    return;
                }
                nc2Var2.a(gc2Var2);
                return;
            }
            y60.this.f34820g.b();
            nc2 nc2Var3 = y60.this.f34822i;
            gc2 gc2Var3 = y60.this.f34821h;
            if (nc2Var3 != null && gc2Var3 != null) {
                nc2Var3.d(gc2Var3);
            }
            if (this.f34826b) {
                this.f34826b = false;
                nc2 nc2Var4 = y60.this.f34822i;
                gc2 gc2Var4 = y60.this.f34821h;
                if (nc2Var4 == null || gc2Var4 == null) {
                    return;
                }
                nc2Var4.c(gc2Var4);
            }
        }
    }

    public y60(@NotNull d60 exoPlayer, @NotNull iw0 mediaSourceProvider, @NotNull bf2 playerEventsReporter, @NotNull fa1 videoAdPlayerErrorConverter, @NotNull lf2 videoScaleController) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(mediaSourceProvider, "mediaSourceProvider");
        Intrinsics.checkNotNullParameter(playerEventsReporter, "playerEventsReporter");
        Intrinsics.checkNotNullParameter(videoAdPlayerErrorConverter, "videoAdPlayerErrorConverter");
        Intrinsics.checkNotNullParameter(videoScaleController, "videoScaleController");
        this.f34814a = exoPlayer;
        this.f34815b = mediaSourceProvider;
        this.f34816c = playerEventsReporter;
        this.f34817d = videoAdPlayerErrorConverter;
        this.f34818e = videoScaleController;
        a aVar = new a();
        this.f34819f = aVar;
        this.f34820g = new p60(aVar);
        exoPlayer.b(aVar);
        exoPlayer.b(videoScaleController);
        C2059l5.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final long getAdPosition() {
        return this.f34814a.getCurrentPosition();
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final float getVolume() {
        return this.f34814a.getVolume();
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final boolean isPlayingAd() {
        return ((AbstractC2395zj) this.f34814a).b();
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final void pauseAd() {
        if (this.f34823j) {
            return;
        }
        this.f34814a.setPlayWhenReady(false);
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final void resumeAd() {
        if (this.f34823j || this.f34824k) {
            return;
        }
        this.f34814a.setPlayWhenReady(true);
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final void setVolume(float f4) {
        if (this.f34823j) {
            return;
        }
        this.f34814a.setVolume(f4);
        nc2 nc2Var = this.f34822i;
        ya1 ya1Var = this.f34821h;
        if (nc2Var == null || ya1Var == null) {
            return;
        }
        nc2Var.a(ya1Var, f4);
    }

    public final void a(@NotNull zh1.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f34814a.b(listener);
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final long b() {
        return this.f34814a.getDuration();
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final void c() {
        if (!this.f34823j) {
            this.f34814a.setPlayWhenReady(true);
        }
        if (this.f34824k) {
            pauseAd();
        }
    }

    @Override // com.yandex.mobile.ads.impl.xb0
    public final void d() {
        this.f34824k = false;
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final boolean e() {
        return this.f34823j;
    }

    @Override // com.yandex.mobile.ads.impl.xb0
    public final void f() {
        this.f34824k = true;
        pauseAd();
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final void a(@NotNull mc2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f34823j) {
            return;
        }
        this.f34823j = true;
        this.f34824k = false;
        this.f34820g.b();
        this.f34814a.setVideoTextureView(null);
        this.f34818e.a((TextureView) null);
        this.f34814a.a(this.f34819f);
        this.f34814a.a(this.f34818e);
        this.f34814a.release();
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final void a(@NotNull ya1 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.f34821h = playbackInfo;
        if (this.f34823j) {
            return;
        }
        am1 a4 = this.f34815b.a(playbackInfo);
        this.f34814a.setPlayWhenReady(false);
        this.f34814a.a(a4);
        this.f34814a.prepare();
        this.f34820g.a();
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final void a(@Nullable nc2 nc2Var) {
        this.f34822i = nc2Var;
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final void a(@Nullable TextureView textureView) {
        if (this.f34823j) {
            return;
        }
        this.f34818e.a(textureView);
        this.f34814a.setVideoTextureView(textureView);
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final void a(@Nullable nf2 nf2Var) {
        if (this.f34823j) {
            return;
        }
        this.f34818e.a(nf2Var);
    }

    @Override // com.yandex.mobile.ads.impl.ga1
    public final void a() {
        if (this.f34823j) {
            return;
        }
        nc2 nc2Var = this.f34822i;
        ya1 ya1Var = this.f34821h;
        if (nc2Var != null && ya1Var != null) {
            nc2Var.e(ya1Var);
        }
        this.f34823j = true;
        this.f34824k = false;
        this.f34820g.b();
        this.f34814a.setVideoTextureView(null);
        this.f34818e.a((TextureView) null);
        this.f34814a.a(this.f34819f);
        this.f34814a.a(this.f34818e);
        this.f34814a.release();
    }
}
