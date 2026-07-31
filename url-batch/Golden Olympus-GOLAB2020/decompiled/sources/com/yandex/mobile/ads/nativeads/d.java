package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.qt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements CustomClickHandlerEventListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qt f35899a;

    public d(@NotNull qt coreListener) {
        Intrinsics.checkNotNullParameter(coreListener, "coreListener");
        this.f35899a = coreListener;
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
    public final void onLeftApplication() {
        this.f35899a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
    public final void onReturnedToApplication() {
        this.f35899a.onReturnedToApplication();
    }
}
