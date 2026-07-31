package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hn2 implements tn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final VideoAdPlaybackListener f26838a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bm2 f26839b;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26841c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(VideoAd videoAd) {
            super(0);
            this.f26841c = videoAd;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onAdClicked(this.f26841c);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(VideoAd videoAd) {
            super(0);
            this.f26843c = videoAd;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onAdCompleted(this.f26843c);
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26845c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(VideoAd videoAd) {
            super(0);
            this.f26845c = videoAd;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onAdError(this.f26845c);
            return Unit.f41027a;
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(VideoAd videoAd) {
            super(0);
            this.f26847c = videoAd;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onAdPaused(this.f26847c);
            return Unit.f41027a;
        }
    }

    static final class e extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(VideoAd videoAd) {
            super(0);
            this.f26849c = videoAd;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onAdPrepared(this.f26849c);
            return Unit.f41027a;
        }
    }

    static final class f extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26851c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(VideoAd videoAd) {
            super(0);
            this.f26851c = videoAd;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onAdResumed(this.f26851c);
            return Unit.f41027a;
        }
    }

    static final class g extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26853c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(VideoAd videoAd) {
            super(0);
            this.f26853c = videoAd;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onAdSkipped(this.f26853c);
            return Unit.f41027a;
        }
    }

    static final class h extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26855c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(VideoAd videoAd) {
            super(0);
            this.f26855c = videoAd;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onAdStarted(this.f26855c);
            return Unit.f41027a;
        }
    }

    static final class i extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(VideoAd videoAd) {
            super(0);
            this.f26857c = videoAd;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onAdStopped(this.f26857c);
            return Unit.f41027a;
        }
    }

    static final class j extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26859c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(VideoAd videoAd) {
            super(0);
            this.f26859c = videoAd;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onImpression(this.f26859c);
            return Unit.f41027a;
        }
    }

    static final class k extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26861c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f26862d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(VideoAd videoAd, float f4) {
            super(0);
            this.f26861c = videoAd;
            this.f26862d = f4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hn2.this.f26838a.onVolumeChanged(this.f26861c, this.f26862d);
            return Unit.f41027a;
        }
    }

    public hn2(@NotNull VideoAdPlaybackListener videoAdPlaybackListener, @NotNull bm2 videoAdAdapterCache) {
        Intrinsics.checkNotNullParameter(videoAdPlaybackListener, "videoAdPlaybackListener");
        Intrinsics.checkNotNullParameter(videoAdAdapterCache, "videoAdAdapterCache");
        this.f26838a = videoAdPlaybackListener;
        this.f26839b = videoAdAdapterCache;
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void b(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new e(this.f26839b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void c(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new d(this.f26839b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void d(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new h(this.f26839b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void e(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new f(this.f26839b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void f(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new i(this.f26839b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void g(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new b(this.f26839b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void h(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new c(this.f26839b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void i(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new a(this.f26839b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void j(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new j(this.f26839b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new g(this.f26839b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.tn0
    public final void a(@NotNull on0 videoAd, float f4) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new k(this.f26839b.a(videoAd), f4));
    }
}
