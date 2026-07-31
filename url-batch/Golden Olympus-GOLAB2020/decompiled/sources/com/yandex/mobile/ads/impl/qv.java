package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ew1 f30905a;

    public qv(@NotNull ew1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f30905a = sdkSettings;
    }

    public final void a(boolean z4) {
        this.f30905a.b(z4);
    }

    @NotNull
    public final ww a() {
        return new ww(this.f30905a.h());
    }
}
