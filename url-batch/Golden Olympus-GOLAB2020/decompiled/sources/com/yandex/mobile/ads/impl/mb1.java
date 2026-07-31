package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.au0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class mb1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pe2 f28974a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextureView f28975b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ea1 f28976c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private ua1 f28977d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private au0 f28978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb1(@NotNull Context context, @NotNull pe2 placeholderView, @NotNull TextureView textureView, @NotNull ea1 actionViewsContainer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(actionViewsContainer, "actionViewsContainer");
        this.f28974a = placeholderView;
        this.f28975b = textureView;
        this.f28976c = actionViewsContainer;
        this.f28978e = new gy1();
    }

    @NotNull
    public final ea1 a() {
        return this.f28976c;
    }

    @NotNull
    public final pe2 b() {
        return this.f28974a;
    }

    @NotNull
    public final TextureView c() {
        return this.f28975b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ua1 ua1Var = this.f28977d;
        if (ua1Var != null) {
            ua1Var.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ua1 ua1Var = this.f28977d;
        if (ua1Var != null) {
            ua1Var.a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        au0.a a4 = this.f28978e.a(i4, i5);
        super.onMeasure(a4.f23449a, a4.f23450b);
    }

    public final void setAspectRatio(float f4) {
        this.f28978e = new fm1(f4);
    }

    public final void setOnAttachStateChangeListener(@Nullable ua1 ua1Var) {
        this.f28977d = ua1Var;
    }
}
