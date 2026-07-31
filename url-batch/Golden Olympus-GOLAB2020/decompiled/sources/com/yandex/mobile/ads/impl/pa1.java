package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pa1 implements nc0, xa1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ra1 f30376a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp f30377b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Long f30378c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final np f30379d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xo f30380e;

    public pa1(@NotNull C2360y7<?> adResponse, @NotNull ra1 nativeVideoController, @NotNull mp closeShowListener, @NotNull t42 timeProviderContainer, @Nullable Long l4, @NotNull np closeTimerProgressIncrementer, @NotNull xo closableAdChecker) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(closeShowListener, "closeShowListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        Intrinsics.checkNotNullParameter(closableAdChecker, "closableAdChecker");
        this.f30376a = nativeVideoController;
        this.f30377b = closeShowListener;
        this.f30378c = l4;
        this.f30379d = closeTimerProgressIncrementer;
        this.f30380e = closableAdChecker;
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void a(long j4, long j5) {
        if (this.f30380e.a()) {
            this.f30379d.a(j4 - j5, j5);
            long a4 = this.f30379d.a() + j5;
            Long l4 = this.f30378c;
            if (l4 == null || a4 < l4.longValue()) {
                return;
            }
            this.f30377b.a();
            this.f30376a.b(this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void b() {
        if (this.f30380e.a()) {
            this.f30377b.a();
            this.f30376a.b(this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void invalidate() {
        this.f30376a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void start() {
        this.f30376a.a(this);
        if (!this.f30380e.a() || this.f30378c == null || this.f30379d.a() < this.f30378c.longValue()) {
            return;
        }
        this.f30377b.a();
        this.f30376a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void a() {
        this.f30377b.a();
        this.f30376a.b(this);
    }
}
