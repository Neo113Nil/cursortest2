package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class la0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28491a;

    public la0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28491a = context;
    }

    @NotNull
    public final FrameLayout a() {
        FrameLayout frameLayout = new FrameLayout(this.f28491a);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
