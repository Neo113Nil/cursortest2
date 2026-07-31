package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.tj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2257tj implements dg0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qf1 f32449a;

    public C2257tj(@NotNull qf1 parentHtmlWebView) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        this.f32449a = parentHtmlWebView;
        parentHtmlWebView.setId(2);
    }

    @Override // com.yandex.mobile.ads.impl.dg0
    public void a(@NotNull String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        this.f32449a.b(htmlResponse);
    }

    @Override // com.yandex.mobile.ads.impl.dg0
    public void invalidate() {
        this.f32449a.d();
    }

    public void a(@NotNull jg0 htmlWebViewListener) {
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        this.f32449a.setHtmlWebViewListener(htmlWebViewListener);
    }
}
