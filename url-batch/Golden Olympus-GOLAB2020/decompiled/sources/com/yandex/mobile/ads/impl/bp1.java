package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class bp1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Button f23889a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp1(@NotNull Context context, @NotNull Button replayButton) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(replayButton, "replayButton");
        this.f23889a = replayButton;
    }

    @NotNull
    public final Button a() {
        return this.f23889a;
    }
}
