package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rx0 implements ax0<MediatedAppOpenAdAdapter> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hx0<MediatedAppOpenAdAdapter> f31468a;

    public rx0(@NotNull hx0<MediatedAppOpenAdAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f31468a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ax0
    @Nullable
    public final yw0<MediatedAppOpenAdAdapter> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f31468a.a(context, MediatedAppOpenAdAdapter.class);
    }
}
