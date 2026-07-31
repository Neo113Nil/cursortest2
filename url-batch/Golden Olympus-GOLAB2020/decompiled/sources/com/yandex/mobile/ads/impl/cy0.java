package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cy0 implements ax0<MediatedNativeAdapter> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hx0<MediatedNativeAdapter> f24356a;

    public cy0(@NotNull hx0<MediatedNativeAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f24356a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ax0
    @Nullable
    public final yw0<MediatedNativeAdapter> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f24356a.a(context, MediatedNativeAdapter.class);
    }
}
