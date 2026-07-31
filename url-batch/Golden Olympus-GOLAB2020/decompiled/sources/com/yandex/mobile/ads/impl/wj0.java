package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wj0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zw0<?, ?> f34091a;

    public wj0(@NotNull zw0<?, ?> mediatedAdController) {
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        this.f34091a = mediatedAdController;
    }

    @Nullable
    public final C1795a4 a() {
        xy0 c4;
        yw0<?> a4 = this.f34091a.a();
        if (a4 == null || (c4 = a4.c()) == null) {
            return null;
        }
        return c4.c();
    }
}
