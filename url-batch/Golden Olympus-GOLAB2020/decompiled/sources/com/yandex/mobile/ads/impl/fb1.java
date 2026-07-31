package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fb1 implements nc0, xa1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ra1 f25736a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sl1 f25737b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rl1 f25738c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC2285v1 f25739d;

    public fb1(@NotNull ra1 nativeVideoController, @NotNull sl1 progressListener, @NotNull t42 timeProviderContainer, @NotNull rl1 progressIncrementer, @NotNull InterfaceC2285v1 adBlockDurationProvider) {
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        Intrinsics.checkNotNullParameter(adBlockDurationProvider, "adBlockDurationProvider");
        this.f25736a = nativeVideoController;
        this.f25737b = progressListener;
        this.f25738c = progressIncrementer;
        this.f25739d = adBlockDurationProvider;
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void a(long j4, long j5) {
        long a4 = this.f25738c.a() + j5;
        long a5 = this.f25739d.a(j4);
        if (a4 < a5) {
            this.f25737b.a(a5, a4);
        } else {
            this.f25736a.b(this);
            this.f25737b.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void b() {
        this.f25737b.a();
        this.f25736a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void invalidate() {
        this.f25736a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void start() {
        this.f25736a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void a() {
        this.f25737b.a();
        this.f25736a.b(this);
    }
}
