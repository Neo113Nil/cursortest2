package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ub1 implements nc0, xb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wb1 f33005a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp f33006b;

    public ub1(@NotNull wb1 nativeWebViewController, @NotNull mp closeShowListener) {
        Intrinsics.checkNotNullParameter(nativeWebViewController, "nativeWebViewController");
        Intrinsics.checkNotNullParameter(closeShowListener, "closeShowListener");
        this.f33005a = nativeWebViewController;
        this.f33006b = closeShowListener;
    }

    @Override // com.yandex.mobile.ads.impl.xb1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void invalidate() {
        this.f33005a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void start() {
        this.f33005a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.xb1
    public final void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f33006b.a();
        this.f33005a.b(this);
    }
}
