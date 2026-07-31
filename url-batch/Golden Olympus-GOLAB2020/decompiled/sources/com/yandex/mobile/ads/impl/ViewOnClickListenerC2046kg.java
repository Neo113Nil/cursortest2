package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.kg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC2046kg implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xe1 f28192a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f28193b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f28194c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final bg2 f28195d;

    public ViewOnClickListenerC2046kg(@NotNull xe1 adClickHandler, @NotNull String url, @NotNull String assetName, @NotNull bg2 videoTracker) {
        Intrinsics.checkNotNullParameter(adClickHandler, "adClickHandler");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f28192a = adClickHandler;
        this.f28193b = url;
        this.f28194c = assetName;
        this.f28195d = videoTracker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        this.f28195d.a(this.f28194c);
        this.f28192a.a(this.f28193b);
    }
}
