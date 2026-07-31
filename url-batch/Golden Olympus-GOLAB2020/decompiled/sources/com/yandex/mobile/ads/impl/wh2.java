package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wh2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kf1 f34071a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xh2 f34072b;

    public wh2(@NotNull kf1 overlappingAreaProvider, @NotNull xh2 visibleRectProvider) {
        Intrinsics.checkNotNullParameter(overlappingAreaProvider, "overlappingAreaProvider");
        Intrinsics.checkNotNullParameter(visibleRectProvider, "visibleRectProvider");
        this.f34071a = overlappingAreaProvider;
        this.f34072b = visibleRectProvider;
    }

    public final int a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean d4 = lh2.d(view);
        Rect a4 = this.f34072b.a(view);
        if (d4 || a4 == null) {
            return 0;
        }
        return (a4.width() * a4.height()) - this.f34071a.a(view, a4);
    }
}
