package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import com.yandex.mobile.ads.impl.vh1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ll1 implements ul1, oi1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ul1 f28639a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private vh1 f28640b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private cb0 f28641c;

    public ll1(@NotNull ul1 progressProvider) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        this.f28639a = progressProvider;
        this.f28640b = vh1.a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ul1
    @NotNull
    public final vh1 a() {
        ul1 ul1Var = this.f28641c;
        if (ul1Var == null) {
            ul1Var = this.f28639a;
        }
        vh1 a4 = ul1Var.a();
        this.f28640b = a4;
        return a4;
    }

    @Override // com.yandex.mobile.ads.impl.oi1
    public final void a(@Nullable Player player) {
        this.f28641c = player == null ? new cb0(this.f28640b) : null;
    }
}
