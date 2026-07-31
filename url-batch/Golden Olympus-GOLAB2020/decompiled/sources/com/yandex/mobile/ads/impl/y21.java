package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y21 extends RecyclerView.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lg2<ImageView, ej0> f34779a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y21(@NotNull ImageView imageView, @NotNull mj0 imageViewAdapter) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageViewAdapter, "imageViewAdapter");
        this.f34779a = new lg2<>(imageViewAdapter);
    }

    public final void a(@NotNull ej0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f34779a.b(value);
    }
}
