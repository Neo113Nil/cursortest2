package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fi0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e50 f25800a;

    public fi0(@NotNull e50 environmentController) {
        Intrinsics.checkNotNullParameter(environmentController, "environmentController");
        this.f25800a = environmentController;
    }

    @NotNull
    public final di0 a() {
        hi0 d4 = this.f25800a.d();
        return new di0(d4.b(), d4.a(), d4.c());
    }
}
