package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class sx0 implements ax0<MediatedBannerAdapter> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hx0<MediatedBannerAdapter> f32071a;

    public sx0(@NotNull hx0<MediatedBannerAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f32071a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ax0
    @Nullable
    public final yw0<MediatedBannerAdapter> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f32071a.a(context, MediatedBannerAdapter.class);
    }
}
