package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class ea1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bp1 f25159a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final iv0 f25160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ea1(@NotNull Context context, @NotNull bp1 replayActionView, @Nullable iv0 iv0Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
        this.f25159a = replayActionView;
        this.f25160b = iv0Var;
        addView(replayActionView);
        if (iv0Var == 0 || !(iv0Var instanceof View)) {
            return;
        }
        addView((View) iv0Var);
    }

    @Nullable
    public final iv0 a() {
        return this.f25160b;
    }

    @NotNull
    public final bp1 b() {
        return this.f25159a;
    }
}
