package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zx0 implements ax0<MediatedInterstitialAdapter> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hx0<MediatedInterstitialAdapter> f35815a;

    public zx0(@NotNull hx0<MediatedInterstitialAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f35815a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ax0
    @Nullable
    public final yw0<MediatedInterstitialAdapter> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f35815a.a(context, MediatedInterstitialAdapter.class);
    }
}
