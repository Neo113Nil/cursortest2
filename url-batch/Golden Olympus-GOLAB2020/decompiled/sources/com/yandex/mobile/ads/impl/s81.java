package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s81 implements nc0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sl1 f31622a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final eg1 f31623b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rl1 f31624c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC2285v1 f31625d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final bz f31626e;

    private final class a implements gg1, b52 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.gg1
        public final void a() {
            s81.this.f31622a.a();
        }

        @Override // com.yandex.mobile.ads.impl.b52
        public final void a(long j4, long j5) {
            long a4 = s81.this.f31624c.a() + (s81.this.f31626e.a() - j4);
            s81.this.f31622a.a(s81.this.f31625d.a(), a4);
        }
    }

    public s81(@NotNull sl1 progressListener, @NotNull t42 timeProviderContainer, @NotNull eg1 pausableTimer, @NotNull rl1 progressIncrementer, @NotNull InterfaceC2285v1 adBlockDurationProvider, @NotNull bz defaultContentDelayProvider) {
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        Intrinsics.checkNotNullParameter(adBlockDurationProvider, "adBlockDurationProvider");
        Intrinsics.checkNotNullParameter(defaultContentDelayProvider, "defaultContentDelayProvider");
        this.f31622a = progressListener;
        this.f31623b = pausableTimer;
        this.f31624c = progressIncrementer;
        this.f31625d = adBlockDurationProvider;
        this.f31626e = defaultContentDelayProvider;
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void invalidate() {
        this.f31623b.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void pause() {
        this.f31623b.pause();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void resume() {
        this.f31623b.resume();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void start() {
        a aVar = new a();
        this.f31623b.a(this.f31626e.a(), aVar);
        this.f31623b.a(aVar);
    }
}
