package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j32 implements bq0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final View f27458b;

    public j32(@NotNull qf1 htmlWebView) {
        Intrinsics.checkNotNullParameter(htmlWebView, "htmlWebView");
        this.f27458b = htmlWebView;
    }

    @Override // com.yandex.mobile.ads.impl.bq0
    @NotNull
    public final String a() {
        boolean isHardwareAccelerated = this.f27458b.isHardwareAccelerated();
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        return C2284v0.a(new Object[]{Boolean.valueOf(isHardwareAccelerated)}, 1, "supports: {inlineVideo: %s}", "format(...)");
    }
}
