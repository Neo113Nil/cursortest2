package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class co0 implements jf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ig2 f24276a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final eo0 f24277b;

    public co0(@NotNull ss adBreak, @NotNull ob2 videoAdInfo, @NotNull fd2 statusController, @NotNull do0 viewProvider, @NotNull ig2 containerVisibleAreaValidator, @NotNull eo0 videoVisibleStartValidator) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(statusController, "statusController");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        Intrinsics.checkNotNullParameter(containerVisibleAreaValidator, "containerVisibleAreaValidator");
        Intrinsics.checkNotNullParameter(videoVisibleStartValidator, "videoVisibleStartValidator");
        this.f24276a = containerVisibleAreaValidator;
        this.f24277b = videoVisibleStartValidator;
    }

    @Override // com.yandex.mobile.ads.impl.jf2
    public final boolean a() {
        return this.f24277b.a() && this.f24276a.a();
    }
}
