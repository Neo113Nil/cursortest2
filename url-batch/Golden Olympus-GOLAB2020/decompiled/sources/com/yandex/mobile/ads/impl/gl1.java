package com.yandex.mobile.ads.impl;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gl1 extends Animation {

    /* renamed from: a, reason: collision with root package name */
    private final int f26210a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26211b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakReference<ProgressBar> f26212c;

    public gl1(@NotNull ProgressBar progressBar, int i4, int i5) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f26210a = i4;
        this.f26211b = i5;
        this.f26212c = new WeakReference<>(progressBar);
        setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f4, @Nullable Transformation transformation) {
        ProgressBar progressBar = this.f26212c.get();
        if (progressBar != null) {
            super.applyTransformation(f4, transformation);
            progressBar.setProgress(Math.round(((this.f26211b - r5) * f4) + this.f26210a));
        }
    }
}
