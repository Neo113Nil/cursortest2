package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qe2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jl1 f30756a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ef2 f30757b;

    public /* synthetic */ qe2() {
        this(new jl1(), new ef2());
    }

    @NotNull
    public final pe2 a(@NotNull Context context, @Nullable ab2 ab2Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30757b.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = null;
        if ((ab2Var != null ? ab2Var.a() : null) != null) {
            imageView = new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ProgressBar a4 = this.f30756a.a(context);
        a4.setVisibility(8);
        a4.setTag(jh2.a("video_placeholder_spinner"));
        pe2 pe2Var = new pe2(context, a4, imageView);
        pe2Var.addView(a4);
        if (imageView != null) {
            pe2Var.addView(imageView);
        }
        pe2Var.setBackgroundColor(-16777216);
        return pe2Var;
    }

    public qe2(@NotNull jl1 progressBarCreator, @NotNull ef2 videoPreviewCreator) {
        Intrinsics.checkNotNullParameter(progressBarCreator, "progressBarCreator");
        Intrinsics.checkNotNullParameter(videoPreviewCreator, "videoPreviewCreator");
        this.f30756a = progressBarCreator;
        this.f30757b = videoPreviewCreator;
    }
}
