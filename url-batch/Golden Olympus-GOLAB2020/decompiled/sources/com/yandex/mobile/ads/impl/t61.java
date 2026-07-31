package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t61 implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final co f32230a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n51 f32231b;

    public t61(@NotNull Context context, @NotNull View.OnClickListener onClickListener, @NotNull co clickAreaVerificationListener, @NotNull n51 nativeAdHighlightingController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Intrinsics.checkNotNullParameter(clickAreaVerificationListener, "clickAreaVerificationListener");
        Intrinsics.checkNotNullParameter(nativeAdHighlightingController, "nativeAdHighlightingController");
        this.f32230a = clickAreaVerificationListener;
        this.f32231b = nativeAdHighlightingController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f32230a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f32231b.b(view, event);
        return this.f32230a.onTouch(view, event);
    }
}
