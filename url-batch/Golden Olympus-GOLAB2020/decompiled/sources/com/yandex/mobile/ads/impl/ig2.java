package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ig2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hg2 f27198a;

    public ig2(@NotNull hg2 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f27198a = videoViewProvider;
    }

    public final boolean a() {
        View view = this.f27198a.getView();
        return (view == null || lh2.d(view) || lh2.b(view) < 1) ? false : true;
    }
}
