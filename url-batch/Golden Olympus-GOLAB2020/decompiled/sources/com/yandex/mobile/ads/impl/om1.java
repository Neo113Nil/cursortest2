package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class om1 implements is1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private is1 f30099a;

    @Override // com.yandex.mobile.ads.impl.is1
    public final void a(@NotNull dw1 reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        is1 is1Var = this.f30099a;
        if (is1Var != null) {
            is1Var.a(reward);
        }
    }

    public final void a(@NotNull is1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30099a = listener;
    }
}
