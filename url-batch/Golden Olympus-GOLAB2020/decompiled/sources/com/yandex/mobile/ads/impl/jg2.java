package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jg2 implements id2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hg2 f27644a;

    public jg2(@NotNull hg2 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f27644a = videoViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.id2
    public final boolean a() {
        View view = this.f27644a.getView();
        return (view == null || lh2.d(view) || !lh2.a(view, 50)) ? false : true;
    }
}
