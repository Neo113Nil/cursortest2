package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xh2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zj2 f34569a;

    public /* synthetic */ xh2() {
        this(new zj2());
    }

    @Nullable
    public final Rect a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return null;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        if (a4 == null || !a4.v0()) {
            return rect;
        }
        this.f34569a.getClass();
        Rect a5 = zj2.a(view);
        Rect rect2 = new Rect(rect);
        if (rect2.intersect(a5)) {
            return rect2;
        }
        return null;
    }

    public xh2(@NotNull zj2 windowVisibleRectProvider) {
        Intrinsics.checkNotNullParameter(windowVisibleRectProvider, "windowVisibleRectProvider");
        this.f34569a = windowVisibleRectProvider;
    }
}
