package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class pe2 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ProgressBar f30428a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final ImageView f30429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe2(@NotNull Context context, @NotNull ProgressBar progressBar, @Nullable ImageView imageView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f30428a = progressBar;
        this.f30429b = imageView;
    }

    @Nullable
    public final ImageView a() {
        return this.f30429b;
    }

    @NotNull
    public final ProgressBar b() {
        return this.f30428a;
    }
}
