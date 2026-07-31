package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class to implements gs1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final is1 f32538a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dw1 f32539b;

    public to(@NotNull uo clientSideReward, @NotNull is1 rewardedListener, @NotNull dw1 reward) {
        Intrinsics.checkNotNullParameter(clientSideReward, "clientSideReward");
        Intrinsics.checkNotNullParameter(rewardedListener, "rewardedListener");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f32538a = rewardedListener;
        this.f32539b = reward;
    }

    @Override // com.yandex.mobile.ads.impl.gs1
    public final void a() {
        this.f32538a.a(this.f32539b);
    }
}
