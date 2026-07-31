package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vb1 implements nc0, xb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wb1 f33567a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private InterfaceC2194r2 f33568b;

    public vb1(@NotNull wb1 nativeWebViewController, @NotNull InterfaceC2194r2 adCompleteListener) {
        Intrinsics.checkNotNullParameter(nativeWebViewController, "nativeWebViewController");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        this.f33567a = nativeWebViewController;
        this.f33568b = adCompleteListener;
    }

    @Override // com.yandex.mobile.ads.impl.xb1
    public final void a(boolean z4) {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void invalidate() {
        this.f33567a.b(this);
        this.f33568b = null;
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void start() {
        this.f33567a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.xb1
    public final void a() {
        InterfaceC2194r2 interfaceC2194r2 = this.f33568b;
        if (interfaceC2194r2 != null) {
            interfaceC2194r2.b();
        }
        this.f33567a.b(this);
        this.f33568b = null;
    }
}
