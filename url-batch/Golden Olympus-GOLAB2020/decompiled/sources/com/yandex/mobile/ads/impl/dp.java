package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dp implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mc0 f24727a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vc0 f24728b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sv f24729c;

    public dp(@NotNull mc0 fullScreenCloseButtonListener, @NotNull vc0 fullScreenHtmlWebViewAdapter, @NotNull sv debugEventsReporter) {
        Intrinsics.checkNotNullParameter(fullScreenCloseButtonListener, "fullScreenCloseButtonListener");
        Intrinsics.checkNotNullParameter(fullScreenHtmlWebViewAdapter, "fullScreenHtmlWebViewAdapter");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        this.f24727a = fullScreenCloseButtonListener;
        this.f24728b = fullScreenHtmlWebViewAdapter;
        this.f24729c = debugEventsReporter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f24728b.a();
        this.f24727a.c();
        this.f24729c.a(rv.f31371c);
    }
}
