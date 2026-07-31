package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class il0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private db2 f27239a;

    public /* synthetic */ il0() {
        this(new eb2(), new fb2());
    }

    @Nullable
    public final db2 a() {
        return this.f27239a;
    }

    public final void b() {
        this.f27239a = null;
    }

    public final void c() {
        this.f27239a = null;
    }

    public il0(@NotNull eb2 uiElementsCreator, @NotNull fb2 controlsValidator) {
        Intrinsics.checkNotNullParameter(uiElementsCreator, "uiElementsCreator");
        Intrinsics.checkNotNullParameter(controlsValidator, "controlsValidator");
    }
}
