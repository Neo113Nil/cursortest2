package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ly0 implements ax0<MediatedRewardedAdapter> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hx0<MediatedRewardedAdapter> f28800a;

    public ly0(@NotNull hx0<MediatedRewardedAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f28800a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ax0
    @Nullable
    public final yw0<MediatedRewardedAdapter> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f28800a.a(context, MediatedRewardedAdapter.class);
    }
}
