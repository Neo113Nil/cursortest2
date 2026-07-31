package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class uy0 {
    @NotNull
    public static ak1 a(@NotNull String adapter, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        wj1 wj1Var = exc instanceof o2.U0 ? wj1.f34092d : exc instanceof IllegalArgumentException ? wj1.f34093e : exc instanceof NoSuchElementException ? wj1.f34094f : wj1.f34095g;
        ap0.a(exc);
        return bk1.a(adapter, wj1Var.b(), Integer.valueOf(wj1Var.a()));
    }

    @NotNull
    public static ak1 a(@NotNull String adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        wj1 wj1Var = wj1.f34094f;
        ap0.a(new Object[0]);
        return bk1.a(adapter, wj1Var.b(), Integer.valueOf(wj1Var.a()));
    }

    @NotNull
    public static ak1 a() {
        wj1 error = wj1.f34094f;
        Intrinsics.checkNotNullParameter(error, "error");
        error.b();
        ap0.a(new Object[0]);
        return bk1.a();
    }
}
